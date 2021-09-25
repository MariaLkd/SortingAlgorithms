/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.algo;

import com.myprj.domain.Action;
import com.myprj.domain.TShirt;
import com.myprj.utils.SortUtils;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Maria
 */
public class BubbleSort {

    public ArrayList<TShirt> sortTShirtList(ArrayList<TShirt> tshirt, Action action, Comparator<TShirt> comp) {
        boolean isSorted;
        SortUtils su = new SortUtils();

        for (int i = 0; i < tshirt.size(); i++) {
            isSorted = true;
            for (int j = 1; j < (tshirt.size() - i); j++) {
                if (action == Action.ASC) {                    
                    if (comp.compare(tshirt.get(j - 1), tshirt.get(j)) > 0) {
                        su.swapTShirtList(tshirt, j, j - 1);
                        isSorted = false;
                    }
                } else{
                    if (comp.compare(tshirt.get(j - 1), tshirt.get(j)) < 0) {
                        su.swapTShirtList(tshirt, j, j - 1);
                        isSorted = false;
                    }
                }
            }
            if (isSorted) {
                break;
            }
        }
        return tshirt;
    }

}
