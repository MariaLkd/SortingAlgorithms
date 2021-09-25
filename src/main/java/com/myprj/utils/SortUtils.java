/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.utils;

import com.myprj.domain.TShirt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maria
 */
public class SortUtils {

    public ArrayList<TShirt> createTShirtList() {
        ArrayList tShirts = new ArrayList(); 
        Generator g = new Generator();
        for (int i = 0; i < 41; i++) {
            TShirt tShirt = new TShirt(g.randomColor(), g.randomSize(), g.randomFabric());
            tShirts.add(tShirt);
        }
        return tShirts;
    }
    
    public static void printTShirtList(ArrayList<TShirt> tShirts){
        for (TShirt tShirt : tShirts) {
            System.out.println(tShirt);
        }
    }
    
    public List<TShirt> swapTShirtList(List<TShirt> tshirt,
            int x, int y){
        
        TShirt buffer; 
        
        buffer = tshirt.get(y);
        tshirt.set(y, tshirt.get(x));
        tshirt.set(x, buffer);
        
        return tshirt; 
    }    
    
    
    
}
