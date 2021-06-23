package chuoiTang;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap chuoi");
        String chuoi = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < chuoi.length(); i++) {

            LinkedList<Character> list = new LinkedList<>();
            list.add(chuoi.charAt(i));
            for (int j = i + 1; j < chuoi.length(); j++) {
                if (chuoi.charAt(j) > list.getLast()) {
                    list.add(chuoi.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.println(ch);
        }
        System.out.println();
    }
}
