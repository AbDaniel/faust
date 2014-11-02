// @SOURCE:C:/Users/AbrahamDanielImmanua/play-spring-data-jpa/conf/routes
// @HASH:c66dd261049d303e157922e5f44bf2608025e20d
// @DATE:Wed Oct 22 15:52:35 IST 2014


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
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_getPrivileges1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("privilege"))))
        

// @LINE:9
private[this] lazy val controllers_Application_addRole2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role"))))
        

// @LINE:10
private[this] lazy val controllers_Application_updateRole3 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/"),DynamicPart("key", """[^/]+""",true))))
        

// @LINE:11
private[this] lazy val controllers_Application_getAllRoles4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role"))))
        

// @LINE:12
private[this] lazy val controllers_Application_getRole5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:13
private[this] lazy val controllers_Application_deleteRole6 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:14
private[this] lazy val controllers_Application_getUsers7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:15
private[this] lazy val controllers_Application_addUser8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user"))))
        

// @LINE:19
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""@controllers.Application@.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """privilege""","""@controllers.Application@.getPrivileges"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role""","""@controllers.Application@.addRole"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/$key<[^/]+>""","""@controllers.Application@.updateRole(key:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role""","""@controllers.Application@.getAllRoles"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/$name<[^/]+>""","""@controllers.Application@.getRole(name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/$name<[^/]+>""","""@controllers.Application@.deleteRole(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""@controllers.Application@.getUsers"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""","""@controllers.Application@.addUser"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page - we use the @controllers syntax here so that the router knows we are referring to a class. In turn it
 will call on the GlobalSettings.getController method to resolve the actual controller instance.""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_getPrivileges1(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getPrivileges, HandlerDef(this, "controllers.Application", "getPrivileges", Nil,"GET", """""", Routes.prefix + """privilege"""))
   }
}
        

// @LINE:9
case controllers_Application_addRole2(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addRole, HandlerDef(this, "controllers.Application", "addRole", Nil,"POST", """""", Routes.prefix + """role"""))
   }
}
        

// @LINE:10
case controllers_Application_updateRole3(params) => {
   call(params.fromPath[String]("key", None)) { (key) =>
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).updateRole(key), HandlerDef(this, "controllers.Application", "updateRole", Seq(classOf[String]),"PUT", """""", Routes.prefix + """role/$key<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_Application_getAllRoles4(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getAllRoles, HandlerDef(this, "controllers.Application", "getAllRoles", Nil,"GET", """""", Routes.prefix + """role"""))
   }
}
        

// @LINE:12
case controllers_Application_getRole5(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getRole(name), HandlerDef(this, "controllers.Application", "getRole", Seq(classOf[String]),"GET", """""", Routes.prefix + """role/$name<[^/]+>"""))
   }
}
        

// @LINE:13
case controllers_Application_deleteRole6(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).deleteRole(name), HandlerDef(this, "controllers.Application", "deleteRole", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """role/$name<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_Application_getUsers7(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).getUsers, HandlerDef(this, "controllers.Application", "getUsers", Nil,"GET", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:15
case controllers_Application_addUser8(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addUser, HandlerDef(this, "controllers.Application", "addUser", Nil,"POST", """""", Routes.prefix + """user"""))
   }
}
        

// @LINE:19
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     