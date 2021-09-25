/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.algo;

import com.myprj.domain.Action;
import com.myprj.domain.Color;
import com.myprj.domain.Fabric;
import com.myprj.domain.Size;
import com.myprj.domain.TShirt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maria
 */
public class BucketSort {

    public static ArrayList<TShirt> bucketSortColor(ArrayList<TShirt> tshirts, Action action) {

        ArrayList<TShirt> sorted = new ArrayList<>();

        ArrayList<ArrayList> buckets = new ArrayList<>();

        for (int i = 0; i < Color.values().length; i++) {
            buckets.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirts.size(); i++) {
            int bucketNo = tshirts.get(i).getColor().ordinal();
            buckets.get(bucketNo).add(tshirts.get(i));
        }
        if (action == Action.ASC) {
            for (int i = 0; i < buckets.size(); i++) {
                sorted.addAll(buckets.get(i));
            }
        } else {
            tshirts.clear();
            for (int i = (buckets.size() - 1); i >= 0; i--) {
                tshirts.addAll(buckets.get(i));
            }
        }

        return sorted;
    }

    public static ArrayList<TShirt> bucketSortSize(ArrayList<TShirt> tshirts, Action action) {

        ArrayList<TShirt> sorted = new ArrayList<>();

        ArrayList<List> buckets = new ArrayList<>();

        for (int i = 0; i < Size.values().length; i++) {
            buckets.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirts.size(); i++) {
            int bucketNo = tshirts.get(i).getSize().ordinal();
            buckets.get(bucketNo).add(tshirts.get(i));
        }
        if (action == Action.ASC) {
            for (int i = 0; i < buckets.size(); i++) {
                sorted.addAll(buckets.get(i));
            }
        } else {
            tshirts.clear();
            for (int i = (buckets.size() - 1); i >= 0; i--) {
                tshirts.addAll(buckets.get(i));
            }
        }

        return sorted;
    }

    public static ArrayList<TShirt> bucketSortFabric(ArrayList<TShirt> tshirts, Action action) {
        ArrayList<TShirt> sorted = new ArrayList<>();

        ArrayList<List> buckets = new ArrayList<>();

        for (int i = 0; i < Fabric.values().length; i++) {
            buckets.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirts.size(); i++) {
            int bucketNo = tshirts.get(i).getFabric().ordinal();
            buckets.get(bucketNo).add(tshirts.get(i));
        }
        if (action == Action.ASC) {
            for (int i = 0; i < buckets.size(); i++) {
                sorted.addAll(buckets.get(i));
            }
        } else {
            tshirts.clear();
            for (int i = (buckets.size() - 1); i >= 0; i--) {
                tshirts.addAll(buckets.get(i));
            }
        }

        return sorted;
    }

}
