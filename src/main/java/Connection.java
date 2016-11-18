import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;

/**
 * Created by BORIS on 15.11.16.
 */
public class Connection
  {
    private static String connectionString;
    private URL url;
    private static HttpsURLConnection httpsURLConnection;

    public Connection(String connectionString)
      {
        this.connectionString = connectionString;
      }

    public void ConnectionInfo () throws IOException
      {
        System.setProperty("jsse.enableSNIExtension", "false");
        url = new URL(this.connectionString);
        httpsURLConnection = (HttpsURLConnection) url.openConnection();
        httpsURLConnection.setRequestMethod("GET");
        System.out.println(httpsURLConnection.getResponseCode());
      }
  }
