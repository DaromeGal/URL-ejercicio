package org.example;

import java.net.MalformedURLException;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
 URL url;
 try{
     System.out.println("constructor simple para una url");
     url= new URL("https//docs.oracle.com/");
 }catch (MalformedURLException e){
     e.printStackTrace();
 }
    }
}