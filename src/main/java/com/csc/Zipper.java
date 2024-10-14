package com.csc;

import java.util.ArrayList;
import java.util.List;
public class Zipper{

    /*
     * This function takes two lists of the same type and merges them together. If one list has
     * more elements than the other, it will place all leftover elements at the end of the merged list in their
     * original order. 
     * @param list1, generic data type T
     * @param list2, generic data type T
     * @return merge, merged list of data type T
     */
    public <T> List<T> zip(List<T> list1, List<T> list2) {
        List <T> merge = new ArrayList<>();
        int maxLength = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < list1.size()) {
                merge.add(list1.get(i));
            }
            if (i < list2.size()) {
                merge.add(list2.get(i));
            }
        }

        return merge;
    }
}
