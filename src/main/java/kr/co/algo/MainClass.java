package kr.co.algo;

import kr.co.algo.sort.SelectSort;

public class MainClass {

    public static void main(String[] args) {

        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        int[] rst = SelectSort.sortList(arr);

        for(int item : rst){
            System.out.println(item);
        }
    }
}
