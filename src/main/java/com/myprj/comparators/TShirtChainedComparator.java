/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.comparators;

import com.myprj.domain.TShirt;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tsepe
 */
public class TShirtChainedComparator implements Comparator<TShirt> {
    
    List<Comparator<TShirt>> listOfComparators;
    
    public TShirtChainedComparator(Comparator<TShirt>...comparator){
        this.listOfComparators = Arrays.asList(comparator);
    } 
    
    @Override
    public int compare(TShirt o1, TShirt o2) {
        for(Comparator<TShirt> comparator : this.listOfComparators){
            int result = comparator.compare(o1, o2);
            if(result !=0){
                return result;
            }
            
        }
        return 0;
    }
}
