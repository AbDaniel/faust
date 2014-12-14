// @SOURCE:/Users/Kaushik/Documents/play-spring-data-jpa/conf/routes
// @HASH:ac8ad8545237bca8cc345a57f1569c77fc605303
// @DATE:Sun Dec 14 17:02:49 IST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
private[this] lazy val controllers_Assets_at0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:11
private[this] lazy val controllers_UserController_getPrivileges1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("privilege"))))
        

// @LINE:12
private[this] lazy val controllers_UserController_addRole2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role"))))
        

// @LINE:13
private[this] lazy val controllers_UserController_updateRole3 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/"),DynamicPart("key", """[^/]+""",true))))
        

// @LINE:14
private[this] lazy val controllers_UserController_getAllRoles4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role"))))
        

// @LINE:15
private[this] lazy val controllers_UserController_getRole5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_UserController_deleteRole6 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_UserController_addUser7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user"))))
        

// @LINE:18
private[this] lazy val controllers_UserController_getUsers8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:19
private[this] lazy val controllers_UserController_getUser9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/"),DynamicPart("userName", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_Application_addQuestion10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("question"))))
        

// @LINE:23
private[this] lazy val controllers_Application_getQuestion11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("questions"))))
        

// @LINE:26
private[this] lazy val controllers_Assets_at12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:29
private[this] lazy val controllers_Assets_at13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("css/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Assets.at(path:String = "/public", file:String = "index.html")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """privilege""","""@controllers.UserController@.getPrivileges"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role""","""@controllers.UserController@.addRole"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/$key<[^/]+>""","""@controllers.UserController@.updateRole(key:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role""","""@controllers.UserController@.getAllRoles"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/$name<[^/]+>""","""@controllers.UserController@.getRole(name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/$name<[^/]+>""","""@controllers.UserController@.deleteRole(name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""","""@controllers.UserController@.addUser"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""@controllers.UserController@.getUsers"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/$userName<[^/]+>""","""@controllers.UserController@.getUser(userName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """question""","""@controllers.Application@.addQuestion"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """questions""","""@controllers.Application@.getQuestion"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """css/$file<.+>""","""controllers.Assets.at(path:String = "/public/css", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_Assets_at0(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("index.html"))) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Home page - we use the @controllers syntax here so that the router knows we are referring to a class. In turn it
 will call on the GlobalSettings.getController method to resolve the actual controller instance.""", Routes.prefix + """"""))
   }
}
        

// @LINE:11
case controllers_UserController_getPrivileges1(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getPrivileges, HandlerDef(this, "controllers.UserController", "getPrivileges", Nil,"GET", """""", Routes.prefix + """privilege"""))
   }
}
        

// @LINE:12
case controllers_UserController_addRole2(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addRole, HandlerDef(this, "controllers.UserController", "addRole", Nil,"POST", """""", Routes.prefix + """role"""))
   }
}
        

// @LINE:13
case controllers_UserController_updateRole3(params) => {
   call(params.fromPath[String]("key", None)) { (key) =>
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).updateRole(key), HandlerDef(this, "controllers.UserController", "updateRole", Seq(classOf[String]),"PUT", """""", Routes.prefix + """role/$key<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_UserController_getAllRoles4(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllRoles, HandlerDef(this, "controllers.UserController", "getAllRoles", Nil,"GET", """""", Routes.prefix + """role"""))
   }
}
        

// @LINE:15
case controllers_UserController_getRole5(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getRole(name), HandlerDef(this, "controllers.UserController", "getRole", Seq(classOf[String]),"GET", """""", Routes.prefix + """role/$name<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_UserController_deleteRole6(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteRole(name), HandlerDef(this, "controllers.UserController", "deleteRole", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """role/$name<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_UserController_addUser7(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addUser, HandlerDef(this, "controllers.UserController", "addUser", Nil,"POST", """""", Routes.prefix + """user"""))
   }
}
        

// @LINE:18
case controllers_UserController_getUsers8(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUsers, HandlerDef(this, "controllers.UserController", "getUsers", Nil,"GET", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:19
case controllers_UserController_getUser9(params) => {
   call(params.fromPath[String]("userName", None)) { (userName) =>
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUser(userName), HandlerDef(this, "controllers.UserController", "getUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """user/$userName<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_Application_addQuestion10(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addQuestion, HandlerDef(this, "controllers.Application", "addQuestion", Nil,"POST", """Question""", Routes.prefix + """question"""))
   }
}
        

// @LINE:23
case controllers_Application_getQuestion11(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getQuestion, HandlerDef(this, "controllers.Application", "getQuestion", Nil,"GET", """""", Routes.prefix + """questions"""))
   }
}
        

// @LINE:26
case controllers_Assets_at12(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:29
case controllers_Assets_at13(params) => {
   call(Param[String]("path", Right("/public/css")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """css/$file<.+>"""))
   }
}
        
}

}
     