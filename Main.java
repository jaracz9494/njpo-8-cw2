/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_cw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Dominik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        losowanie los = new losowanie();
        los.losuj();
        los.sortuj();    
    }
    
}
