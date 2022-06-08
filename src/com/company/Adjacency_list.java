package com.company;
import java.util.*;
public class Adjacency_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Vertices : ");
        int v = sc.nextInt();
        System.out.println("Enter the number of Edges : ");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
        for(int i =0;i<=v;i++)
            ar.add(new ArrayList<>());

        for (int i = 0; i < e; i++) {
            System.out.println("Enter Pair Edges : ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            ar.get(x).add(y); ar.get(y).add(x);

        }
        for (int i = 1; i <=v ; i++) {
            System.out.print(i);
            for (int j = 0; j <ar.get(i).size() ; j++) {
                System.out.print("-->" + ar.get(i).get(j));
            }
            System.out.println();
        }
    }
}

