package BookTwo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);

        inetAddress = InetAddress.getByName("www.gas.by");
        System.out.println(inetAddress);

        inetAddress = InetAddress.getByName("www.byfly.by");
        System.out.println(inetAddress);
    }
}
