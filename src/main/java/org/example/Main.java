package org.example;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        URL url;
        try {
            System.out.println("Constructor simple para una URL:");
            url = new URL("http://docs.oracle.com/");
            visualizar(url);

            System.out.println("Otro constructor simple para una URL:");
            url = new URL("http://localhost/PFC/gest/cli_gestion.php?S=3");
            visualizar(url);

            System.out.println("Constructor para protocolo + host + directorio:");
            url = new URL("http", "docs.oracle.com", "/javase/7");
            visualizar(url);

            System.out.println("Constructor para protocolo + host + puerto + directorio:");
            url = new URL("http", "docs.oracle.com", 80, "/javase/7");
            visualizar(url);

            System.out.println("Constructor para un objeto URL base y un directorio:");
            URL urlBase = new URL("http://docs.oracle.com/");
            url = new URL(urlBase, "/javase/7/docs/api/java/net/URL.html");
            visualizar(url);

        } catch (MalformedURLException e) {
            System.out.println(e);
        }
    }

    public static void visualizar(URL url) {
        System.out.println("URL completa: " + url.toString());
        System.out.println("Protocolo: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("File: " + url.getFile());
        System.out.println("User info: " + url.getUserInfo());
        System.out.println("Path: " + url.getPath());
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("Query: " + url.getQuery());
        System.out.println("================================");
    }
}
