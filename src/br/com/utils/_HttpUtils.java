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
}
