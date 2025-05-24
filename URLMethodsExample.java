import java.net.URL;

public class URLMethodsExample {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com:443/docs/index.html?name=test#section1");

            // Print important URL components using URL class methods
            System.out.println("URL: " + url.toString());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort()); // Returns -1 if no port is specified explicitly
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("File: " + url.getFile());
            System.out.println("Ref (Fragment): " + url.getRef());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("User Info: " + url.getUserInfo()); // Will be null in this case
        } catch (Exception e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
    }
}
// URLMethodsExample.java