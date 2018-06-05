/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlespam;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author rugg1480e
 */
public class GoogleSpam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(double i = 0; i < Double.POSITIVE_INFINITY; i++){
            try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("http://www.google.com");
            desktop.browse(oURL);
            } catch (Exception e) {
            e.printStackTrace();
            }
        }
    }
    
}
