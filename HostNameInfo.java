import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameInfo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java HostNameInfo <domain_name_or_IP>");
            return;
        }

        String input = args[0];

        try {
            InetAddress address = InetAddress.getByName(input);

            // Display hostname
            System.out.println("Hostname: " + address.getHostName());

            // Display canonical hostname (FQDN)
            System.out.println("Canonical Hostname: " + address.getCanonicalHostName());

            // Get raw IP address bytes
            byte[] ip = address.getAddress();

            // Check IP version based on length of byte array
            if (ip.length == 4) {
                System.out.println("IP Version: IPv4");
            } else if (ip.length == 16) {
                System.out.println("IP Version: IPv6");
            } else {
                System.out.println("IP Version: Unknown");
            }

            // Display IP address
            System.out.println("IP Address: " + address.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Could not resolve hostname: " + input);
        }
    }
}
