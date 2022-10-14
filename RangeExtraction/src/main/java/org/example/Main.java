package org.example;

public class Main {
    public static void main(String[] args) {
//        https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/java
//        System.out.println(isNumInRange( -3, 2));
        System.out.println(rangeExtraction(new int[]{-1, 2,3,4,7,8,9, 12, 17, 19,20, 21}));

    }
    public static String rangeExtraction(int[] arr) {
        StringBuilder str = new StringBuilder();
        int last = arr[0]; int f = arr[0]; int s; int count = 0;
        while (count < arr.length){
            try{
                s = arr[count + 1];
                if (isNumInRange(f, s)) last = s;
                else {
                    if (f==s) str.append(f).append(",");
                    else{
                        str.append(f).append("-").append(last).append(",");
                        f = s;
                    }
                }

            }catch (Exception e){
                System.out.println("END");
            }
            count++;
        }

        return str.toString();
    }
    public static boolean isNumInRange(int f, int s){
        if(s - f == 1) return true;
        return false;
    }

}