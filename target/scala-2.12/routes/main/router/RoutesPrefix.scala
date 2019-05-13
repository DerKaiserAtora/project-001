// @GENERATOR:play-routes-compiler
// @SOURCE:D:/GIT/project-001/conf/routes
// @DATE:Mon May 06 02:08:06 ICT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
