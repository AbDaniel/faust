// @SOURCE:/Users/Kaushik/Documents/play-spring-data-jpa/conf/routes
// @HASH:ac8ad8545237bca8cc345a57f1569c77fc605303
// @DATE:Sun Dec 14 17:02:49 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:7
package controllers {

// @LINE:29
// @LINE:26
// @LINE:7
class ReverseAssets {
    

// @LINE:29
// @LINE:26
// @LINE:7
def at(path:String, file:String): Call = {
   (path: @unchecked, file: @unchecked) match {
// @LINE:7
case (path, file) if path == "/public" && file == "index.html" => Call("GET", _prefix)
                                                        
// @LINE:26
case (path, file) if path == "/public" => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:29
case (path, file) if path == "/public/css" => Call("GET", _prefix + { _defaultPrefix } + "css/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseUserController {
    

// @LINE:13
def updateRole(key:String): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "role/" + implicitly[PathBindable[String]].unbind("key", dynamicString(key)))
}
                                                

// @LINE:16
def deleteRole(name:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "role/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:17
def addUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user")
}
                                                

// @LINE:12
def addRole(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "role")
}
                                                

// @LINE:18
def getUsers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:19
def getUser(userName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)))
}
                                                

// @LINE:11
def getPrivileges(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "privilege")
}
                                                

// @LINE:15
def getRole(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "role/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:14
def getAllRoles(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "role")
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
class ReverseApplication {
    

// @LINE:23
def getQuestion(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "questions")
}
                                                

// @LINE:22
def addQuestion(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "question")
}
                                                
    
}
                          
}
                  


// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:7
package controllers.javascript {

// @LINE:29
// @LINE:26
// @LINE:7
class ReverseAssets {
    

// @LINE:29
// @LINE:26
// @LINE:7
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(path, file) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public") + """ && file == """ + implicitly[JavascriptLitteral[String]].to("index.html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (path == """ + implicitly[JavascriptLitteral[String]].to("/public/css") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "css/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseUserController {
    

// @LINE:13
def updateRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.updateRole",
   """
      function(key) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "role/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("key", encodeURIComponent(key))})
      }
   """
)
                        

// @LINE:16
def deleteRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteRole",
   """
      function(name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "role/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:17
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
      }
   """
)
                        

// @LINE:12
def addRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addRole",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "role"})
      }
   """
)
                        

// @LINE:18
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:19
def getUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getUser",
   """
      function(userName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName))})
      }
   """
)
                        

// @LINE:11
def getPrivileges : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getPrivileges",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privilege"})
      }
   """
)
                        

// @LINE:15
def getRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getRole",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "role/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:14
def getAllRoles : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getAllRoles",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "role"})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
class ReverseApplication {
    

// @LINE:23
def getQuestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getQuestion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "questions"})
      }
   """
)
                        

// @LINE:22
def addQuestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addQuestion",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "question"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:7
package controllers.ref {


// @LINE:29
// @LINE:26
// @LINE:7
class ReverseAssets {
    

// @LINE:7
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Home page - we use the @controllers syntax here so that the router knows we are referring to a class. In turn it
 will call on the GlobalSettings.getController method to resolve the actual controller instance.""", _prefix + """""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseUserController {
    

// @LINE:13
def updateRole(key:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).updateRole(key), HandlerDef(this, "controllers.UserController", "updateRole", Seq(classOf[String]), "PUT", """""", _prefix + """role/$key<[^/]+>""")
)
                      

// @LINE:16
def deleteRole(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteRole(name), HandlerDef(this, "controllers.UserController", "deleteRole", Seq(classOf[String]), "DELETE", """""", _prefix + """role/$name<[^/]+>""")
)
                      

// @LINE:17
def addUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addUser(), HandlerDef(this, "controllers.UserController", "addUser", Seq(), "POST", """""", _prefix + """user""")
)
                      

// @LINE:12
def addRole(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addRole(), HandlerDef(this, "controllers.UserController", "addRole", Seq(), "POST", """""", _prefix + """role""")
)
                      

// @LINE:18
def getUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUsers(), HandlerDef(this, "controllers.UserController", "getUsers", Seq(), "GET", """""", _prefix + """users""")
)
                      

// @LINE:19
def getUser(userName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUser(userName), HandlerDef(this, "controllers.UserController", "getUser", Seq(classOf[String]), "GET", """""", _prefix + """user/$userName<[^/]+>""")
)
                      

// @LINE:11
def getPrivileges(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getPrivileges(), HandlerDef(this, "controllers.UserController", "getPrivileges", Seq(), "GET", """""", _prefix + """privilege""")
)
                      

// @LINE:15
def getRole(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getRole(name), HandlerDef(this, "controllers.UserController", "getRole", Seq(classOf[String]), "GET", """""", _prefix + """role/$name<[^/]+>""")
)
                      

// @LINE:14
def getAllRoles(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllRoles(), HandlerDef(this, "controllers.UserController", "getAllRoles", Seq(), "GET", """""", _prefix + """role""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
class ReverseApplication {
    

// @LINE:23
def getQuestion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getQuestion(), HandlerDef(this, "controllers.Application", "getQuestion", Seq(), "GET", """""", _prefix + """questions""")
)
                      

// @LINE:22
def addQuestion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addQuestion(), HandlerDef(this, "controllers.Application", "addQuestion", Seq(), "POST", """Question""", _prefix + """question""")
)
                      
    
}
                          
}
        
    