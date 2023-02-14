package ski.komoro.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MyExampleApplication extends Application<MyExampleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MyExampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "MyExample";
    }

    @Override
    public void initialize(final Bootstrap<MyExampleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MyExampleConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
