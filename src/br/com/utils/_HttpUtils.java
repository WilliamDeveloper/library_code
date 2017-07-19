package br.com.utils;

import java.io.IOException;
import java.net.InetAddress;

public class _HttpUtils {

    public static boolean isIpReacheable(String pIpAddress, int pTimeout){
        InetAddress inet = null;
        boolean reachable = false;

        try {
            inet = InetAddress.getByName(pIpAddress);
            reachable = inet.isReachable(pTimeout);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return reachable;
    }

    public static void main(String[] args) {
        System.out.println("ip [10.0.0.28] isIpReacheable : "+_HttpUtils.isIpReacheable("10.0.0.28",5 * 1000));
        System.out.println("ip [11.0.0.28] isIpReacheable : "+_HttpUtils.isIpReacheable("11.0.0.28",5 * 1000));
    }
}
