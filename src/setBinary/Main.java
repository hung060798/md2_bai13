package setBinary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang");
        int[] list  = new int[sc.nextInt()];
        for (int i =0; i<list.length; i++){
            System.out.println("nhap phan tu thu");
            list[i] = sc.nextInt();
        }

        for (int i =0; i< list.length; i++){
            System.out.print(list[i] + " ");
        }

        for (int i = 0; i< list.length; i++){
            for (int j=0; j< list.length; j++){
                if (list[i]<list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i =0; i< list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("nhap so can tim vi tri");
        System.out.println( "index= "+ binarySearch( list,sc.nextInt()));
    }

    static int binarySearch(int[] list, int key){
        int low =0;
        int high = list.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            if(key<list[mid]){
                high = mid -1;
            } else if (key>list[mid]){
                low = mid +1;
            } else return mid;
        }
        return -1;
    }
}
