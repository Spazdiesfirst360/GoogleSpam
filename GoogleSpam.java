/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlespam;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

/**
 *
 * @author Spazdiesfirst360
 */
public class GoogleSpam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("[SYSTEM] What url would you like to use?");
        String u = console.nextLine();
        
        System.out.println("[SYSTEM] How many tabs do you want opened?");
        long times = console.nextLong();
        
        for(long i = 0; i < times; i++){
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI(u);
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("[SYSTEM] Opened " + times + " tabs to " + u);
    }
    
}
