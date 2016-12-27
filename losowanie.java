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
public class losowanie {
    
    int tablica[] = new int [10000000];
    
    
    public void losuj () {
        
        Random r = new Random();      
        
        for (int i=0; i<10000000; i++) {
            tablica[i] = r.nextInt(100);
        }
        
        /*
        for (int i=0; i<10000000; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        */
    }
    
    private static void quicksort(int tablica[], int x, int y) {
 
        int i,j,v,temp;

        i=x;
        j=y;
        v=tablica[(x+y) / 2];
        do {
            while (tablica[i]<v)
                i++;
            while (v<tablica[j])
                j--;
            if (i<=j) {
                temp=tablica[i];
                tablica[i]=tablica[j];
                tablica[j]=temp;
                i++;
                j--;
            }
        }
        while (i<=j);
        if (x<j)
        quicksort(tablica,x,j);
        if (i<y)
        quicksort(tablica,i,y);
        }
    
    public void sortuj() {
        quicksort(tablica, 0, 10000000-1);
        /*
        for (int i=0; i<10000000; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        */
    }
    
    
}
