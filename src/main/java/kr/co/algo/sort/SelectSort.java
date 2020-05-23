package kr.co.algo.sort;

public class SelectSort {

    public static int[] sortList(int[] list){

        int min, temp;

        for (int i = 0; i < list.length; i++){
            min = 9999;

            for(int j = i; j < list.length; j++){
                if(min > list[j]){

                    min = list[j];

                    // swapping
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
}
