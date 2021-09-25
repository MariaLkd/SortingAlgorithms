/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.comparators;
import com.myprj.domain.TShirt;
import java.util.Comparator;

/**
 *
 * @author tsepe
 */
public class TShirtColorComparator implements Comparator<TShirt>{
    
    @Override
    public int compare(TShirt o1, TShirt o2){
        return o1.getColor().compareTo(o2.getColor());
    }
    
}
