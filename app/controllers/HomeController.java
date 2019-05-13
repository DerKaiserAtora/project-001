package controllers;

import com.google.inject.Inject;
import play.mvc.*;
import utils.DatadogClient;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    private DatadogClient datadog;

    @Inject
    public HomeController(DatadogClient datadog) {
        this.datadog = datadog;
    }

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
        datadog.increment("test-datadog-aspect", "tutorial api was hit", "sending info for datadog");
        return ok(views.html.tutorial.render());
    }
	/*this commit is using intellij*/
	/*this commit is using cmd*/
	/*sadfasdfasdfasdfasdfasdfasdfasdf*/
	/*this commit is using intellij only to make conflict again*//*afadfasfaskdjfhalsdkhfalhdfajkhdfkjahsdkfhakdshfklasdf*/
    /*line 1*/
    /*line 2*/
    /*line 3*//*adsfasdfasdfasdfasdfasdfasdfasdfasadasfasdfasdfasjkdfa*/
    /*line 4*/
	/*line 5*/
	/*line 6*/
	/*line 7*/
}
