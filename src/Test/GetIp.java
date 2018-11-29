package Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by admin on 2018/11/29.
 */
public class GetIp {
    public static void main(String[] args) throws UnknownHostException {
        String address = InetAddress.getLocalHost().getHostAddress().toString();
        System.out.println(address);
    }
}
