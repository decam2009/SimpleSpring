import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by BORIS on 15.11.16.
 */
public class Main
  {
    public static void main(String[] args) throws IOException
      {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Connection connection = (Connection) context.getBean("Connection");
        connection.ConnectionInfo();

        //Connection connection = new Connection("https://google.com");
        //connection.ConnectionInfo();
        //https://dealer.telepayural.ru:8182/external/process
      }
  }
