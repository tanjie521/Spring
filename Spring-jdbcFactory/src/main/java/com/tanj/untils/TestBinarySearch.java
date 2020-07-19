package com.tanj.untils;

/**
 * 二分法进行数据查找
 */



public class TestBinarySearch {

    public static void main(String[] args) {
        //String s=null;
        //System.out.println("s=");
        /*int split = split(12);
        System.out.println("003-" + split);*/
        dichotomy();
    }

    /**
     * 出栈进栈
     *
     * @param number
     * @return
     */
    public static int split(int number) {
        if (number > 1) {
            if (number % 2 != 0) {
                System.out.println("001-" + split((number + 1) / 2));
            }
            System.out.println("002-" + split(number / 2));
        }
        return number;
    }

    /**
     * 二分法
     * @return
     */
    public static int dichotomy() {
        int n = 101;
        int[] arr = new int[]{1,6, 9, 14, 15, 17, 18, 23, 24, 28, 34, 39, 48, 56, 67, 72, 89, 92, 98, 100};
        int left = 0;
        int right = arr.length;
        int midle = 0;
        int checknum=0;
        int i = 0;
        while (left <= right) {

            i = ++i;
            System.out.println("========" + i);
            midle = (left + right) / 2;


            if(checknum==midle){
                System.out.println("数组中没有查找的数据");

                left = midle + 1;
                right = midle;
            }else {
                if (n == arr[midle]) {
                    System.out.println("输出的位置为=" + midle);
                    left = midle + 1;
                    right = midle;

                }
                if (n < arr[midle]) {
                    right = midle;
                    checknum=midle;
                }
                if (n > arr[midle]) {
                    left = midle;
                    checknum=midle;
                }
            }
        }
        return midle;
    }
}
