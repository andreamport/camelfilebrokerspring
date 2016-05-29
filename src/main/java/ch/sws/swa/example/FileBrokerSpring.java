package ch.sws.swa.example;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileBrokerSpring {

    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("META-INF/camel-context.xml");
        CamelContext camelContext = SpringCamelContext.springCamelContext(appContext, false);
        try {
            camelContext.start();

            System.out.println("========================================================");
            System.out.println("FileBrokerSpring is running");
            System.out.println("");
            System.out.println("Use ctrl + c to stop this application.");
            System.out.println("========================================================");

            while(true) {
                Thread.sleep(1000);
            }
        }
        catch (Exception camelException) {
            System.err.println(
                    "Exception trying to copy files - " + camelException.toString());
        }
        finally {
            try {
                camelContext.stop();
            } catch (Exception exp) {
                System.err.println(
                        "Exception trying to stop CamelContext - " + exp.toString());
            }
        }
    }
}
