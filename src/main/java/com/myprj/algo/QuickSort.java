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
public class QuickSort {

    public static void quickSort(ArrayList<TShirt> tshirts, int low, int high, Comparator<TShirt> comparator, Action action) {
        if (low < high) {
            int pi;

            pi = partition(tshirts, low, high, comparator, action);
            quickSort(tshirts, low, pi - 1, comparator, action);
            quickSort(tshirts, pi + 1, high, comparator, action);
        }
    }

    public static int partition(ArrayList<TShirt> tshirts, int low, int high, Comparator<TShirt> comparator, Action action) {
        SortUtils su = new SortUtils();
        TShirt pivot = tshirts.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (action == Action.ASC) {
                if (comparator.compare(tshirts.get(j), pivot) < 0) {
                    i++;
                    su.swapTShirtList(tshirts, i, j);
                }
            } else {
                if (comparator.compare(tshirts.get(j), pivot) > 0) {
                    i++;
                    su.swapTShirtList(tshirts, i, j);
                }
            }
        }
        su.swapTShirtList(tshirts, i + 1, high);
        return (i + 1);
    }
}
