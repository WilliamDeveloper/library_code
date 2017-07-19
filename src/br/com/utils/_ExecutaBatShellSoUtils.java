package br.com.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _ExecutaBatShellSoUtils {

    private static String doExecutarComando(String command) {

        StringBuffer output = new StringBuffer();

        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine())!= null) {
                output.append(line + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(_ExecutaBatShellSoUtils.doExecutarComando("ping google.com -n 5"));
    }
}
