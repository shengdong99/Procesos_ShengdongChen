/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.shengdong.procesos;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author shengdong
 */
public class Procesos {

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("ping","www.google.com");
        pb.inheritIO();  
        Process p = pb.start();

        try {
            while(p.isAlive()){
            p.waitFor(5, TimeUnit.SECONDS);
            System.out.println("Esperando...");
            }
        } catch (InterruptedException ex) {
           System.out.println("fallo");
        }
 
    }
}
