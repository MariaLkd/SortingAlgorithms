/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.assignment4;

import com.myprj.algo.BubbleSort;
import com.myprj.algo.BucketSort;
import com.myprj.algo.QuickSort;
import com.myprj.comparators.TShirtColorComparator;
import com.myprj.comparators.TShirtFabricComparator;
import com.myprj.comparators.TShirtSizeComparator;
import com.myprj.domain.Action;
import com.myprj.domain.TShirt;
import com.myprj.utils.SortUtils;
import java.util.ArrayList;

/**
 *
 * @author Maria
 */
public class AppMain {

    public static void main(String[] args) {
        SortUtils su = new SortUtils();
        ArrayList<TShirt> tshirts = su.createTShirtList();
        TShirtColorComparator cComp = new TShirtColorComparator();
        TShirtSizeComparator sComp = new TShirtSizeComparator();
        TShirtFabricComparator fComp = new TShirtFabricComparator();
        BubbleSort bs = new BubbleSort();
        QuickSort qs = new QuickSort();
        BucketSort buckS = new BucketSort();

        System.out.println("Bubble Sort ascending color");
        ArrayList<TShirt> bubbleTShirtsCAsc = bs.sortTShirtList(tshirts, Action.ASC, cComp);
        su.printTShirtList(bubbleTShirtsCAsc);

        System.out.println("Bubble Sort descending color");
        ArrayList<TShirt> bubbleTShirtsCDesc = bs.sortTShirtList(tshirts, Action.DESC, cComp);
        su.printTShirtList(bubbleTShirtsCDesc);

        System.out.println("Bubble Sort ascending size");
        ArrayList<TShirt> bubbleTShirtsSAsc = bs.sortTShirtList(tshirts, Action.ASC, sComp);
        su.printTShirtList(bubbleTShirtsSAsc);

        System.out.println("Bubble Sort descending size");
        ArrayList<TShirt> bubbleTShirtsSDesc = bs.sortTShirtList(tshirts, Action.DESC, sComp);
        su.printTShirtList(bubbleTShirtsSDesc);

        System.out.println("Bubble Sort ascending fabric");
        ArrayList<TShirt> bubbleTShirtsFAsc = bs.sortTShirtList(tshirts, Action.ASC, fComp);
        su.printTShirtList(bubbleTShirtsFAsc);

        System.out.println("Bubble Sort descending fabric");
        ArrayList<TShirt> bubbleTShirtsFDesc = bs.sortTShirtList(tshirts, Action.DESC, fComp);
        su.printTShirtList(bubbleTShirtsFDesc);

        System.out.println("Quick Sort ascending color");
        qs.quickSort(tshirts, 0, tshirts.size() - 1, cComp, Action.ASC);
        su.printTShirtList(tshirts);

        System.out.println("Quick Sort descending color");
        qs.quickSort(tshirts, 0, tshirts.size() - 1, cComp, Action.DESC);
        su.printTShirtList(tshirts);

        System.out.println("Quick Sort ascending size");
        qs.quickSort(tshirts, 0, tshirts.size() - 1, sComp, Action.ASC);
        su.printTShirtList(tshirts);

        System.out.println("Quick Sort descending size");
        qs.quickSort(tshirts, 0, tshirts.size() - 1, sComp, Action.DESC);
        su.printTShirtList(tshirts);

        System.out.println("Quick Sort ascending fabric");
        qs.quickSort(tshirts, 0, tshirts.size() - 1, fComp, Action.ASC);
        su.printTShirtList(tshirts);

        System.out.println("Quick Sort descending fabric");
        qs.quickSort(tshirts, 0, tshirts.size() - 1, fComp, Action.DESC);
        su.printTShirtList(tshirts);

        System.out.println("Bucket Sort ascending color");
        su.printTShirtList(buckS.bucketSortColor(tshirts, Action.ASC));

        System.out.println("Bucket Sort descending color");
        su.printTShirtList(buckS.bucketSortColor(tshirts, Action.DESC));

        System.out.println("Bucket Sort ascending size");
        su.printTShirtList(buckS.bucketSortSize(tshirts, Action.ASC));

        System.out.println("Bucket Sort descending size");
        su.printTShirtList(buckS.bucketSortSize(tshirts, Action.DESC));

        System.out.println("Bucket Sort ascending fabric");
        su.printTShirtList(buckS.bucketSortFabric(tshirts, Action.ASC));

        System.out.println("Bucket Sort descending fabric");
        su.printTShirtList(buckS.bucketSortFabric(tshirts, Action.DESC));

    }

}
