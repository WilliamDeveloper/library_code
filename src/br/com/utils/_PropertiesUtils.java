package br.com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class _PropertiesUtils {

    public static Map<String, String> doCarregarArquivo(String pNomeArquivo){
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(pNomeArquivo));

            Map<String, String> map =  new HashMap<String, String>();

            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                map.put(key,value);
            }

            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new HashMap<String, String>();
    }

    public static void doMostrarChaveValor( Map<String, String> pMap){
        for (Map.Entry<String,String> entry : pMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("#Key: '" + key + "' #Value: '" + value+"'");
        }
    }

    public static void main(String[] args) {
        Map<String, String>  vMap = _PropertiesUtils.doCarregarArquivo("src/br/com/utils/arquivo.properties");
        _PropertiesUtils.doMostrarChaveValor(vMap);
    }
}
