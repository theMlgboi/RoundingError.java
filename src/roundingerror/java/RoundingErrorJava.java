/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roundingerror.java;

import java.lang.Math;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;
/**
 *
 * @author anarc6700
 */
public class RoundingErrorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String numStr = JOptionPane.showInputDialog("\nPlease enter a number");
       
       double square = Double.parseDouble(numStr);
       
       double win =Math.pow( Math.sqrt(square),2);
       
       System.out.println(win);
       System.out.println(square-win);
    }

   
    
}
