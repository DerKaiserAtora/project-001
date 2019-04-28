package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    
    public Result explore() {
        return ok(views.html.explore.render());
    }
    /*this is using intellij*/
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }
	/*this commit is using intellij*/
	/*this commit is using cmd*/
	/*sadfasdfasdfasdfasdfasdfasdfasdf*/
	/*this commit is using intellij only to make conflict again*/
    /*line 1*/
    /*line 2*/
    /*line 3*/
    /*line 4*/
}
