// @SOURCE:C:/Users/AbrahamDanielImmanua/play-spring-data-jpa/conf/routes
// @HASH:c66dd261049d303e157922e5f44bf2608025e20d
// @DATE:Wed Oct 22 15:52:35 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:19
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers {

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseApplication {
    

// @LINE:10
def updateRole(key:String): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "role/" + implicitly[PathBindable[String]].unbind("key", dynamicString(key)))
}
                                                

// @LINE:13
def deleteRole(name:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "role/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:15
def addUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user")
}
                                                

// @LINE:9
def addRole(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "role")
}
                                                

// @LINE:14
def getUsers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:8
def getPrivileges(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "privilege")
}
                                                

// @LINE:12
def getRole(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "role/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:11
def getAllRoles(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "role")
}
                                                

// @LINE:7
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:19
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.javascript {

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseApplication {
    

// @LINE:10
def updateRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateRole",
   """
      function(key) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "role/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("key", encodeURIComponent(key))})
      }
   """
)
                        

// @LINE:13
def deleteRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteRole",
   """
      function(name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "role/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:15
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
      }
   """
)
                        

// @LINE:9
def addRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addRole",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "role"})
      }
   """
)
                        

// @LINE:14
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:8
def getPrivileges : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getPrivileges",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "privilege"})
      }
   """
)
                        

// @LINE:12
def getRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getRole",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "role/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:11
def getAllRoles : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getAllRoles",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "role"})
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:19
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.ref {


// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseApplication {
    

// @LINE:10
def updateRole(key:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).updateRole(key), HandlerDef(this, "controllers.Application", "updateRole", Seq(classOf[String]), "PUT", """""", _prefix + """role/$key<[^/]+>""")
)
                      

// @LINE:13
def deleteRole(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).deleteRole(name), HandlerDef(this, "controllers.Application", "deleteRole", Seq(classOf[String]), "DELETE", """""", _prefix + """role/$name<[^/]+>""")
)
                      

// @LINE:15
def addUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addUser(), HandlerDef(this, "controllers.Application", "addUser", Seq(), "POST", """""", _prefix + """user""")
)
                      

// @LINE:9
def addRole(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addRole(), HandlerDef(this, "controllers.Application", "addRole", Seq(), "POST", """""", _prefix + """role""")
)
                      

// @LINE:14
def getUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getUsers(), HandlerDef(this, "controllers.Application", "getUsers", Seq(), "GET", """""", _prefix + """users""")
)
                      

// @LINE:8
def getPrivileges(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getPrivileges(), HandlerDef(this, "controllers.Application", "getPrivileges", Seq(), "GET", """""", _prefix + """privilege""")
)
                      

// @LINE:12
def getRole(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getRole(name), HandlerDef(this, "controllers.Application", "getRole", Seq(classOf[String]), "GET", """""", _prefix + """role/$name<[^/]+>""")
)
                      

// @LINE:11
def getAllRoles(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getAllRoles(), HandlerDef(this, "controllers.Application", "getAllRoles", Seq(), "GET", """""", _prefix + """role""")
)
                      

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page - we use the @controllers syntax here so that the router knows we are referring to a class. In turn it
 will call on the GlobalSettings.getController method to resolve the actual controller instance.""", _prefix + """""")
)
                      
    
}
                          
}
        
    