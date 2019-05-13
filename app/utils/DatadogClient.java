package utils;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.timgroup.statsd.NonBlockingStatsDClient;
import com.timgroup.statsd.StatsDClient;
import play.Configuration;

@Singleton
public class DatadogClient {
    private NonBlockingStatsDClient datadogClient;
    @Inject
    public DatadogClient(Configuration configuration){
        String datadogHost = configuration.getString("datadog.host");
        int datadogPort = configuration.getInt("datadog.port");
        if (datadogClient == null) {
            datadogClient = new NonBlockingStatsDClient(
                    "datadog test",                          /* prefix to any stats; may be null or empty string */
                    datadogHost,                        /* common case: localhost */
                    datadogPort,                                 /* port */
                    new String[] {"info: "}            /* Datadog extension: Constant tags, always applied */
            );
        }
    }

    public void increment(String aspect, String... tags) {
        datadogClient.increment(aspect, tags);
    }
    public void histogram(String aspect, Double value, String... tags) {
        datadogClient.histogram(aspect, value, tags);
    }
}
