package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Vertices : ");
        int v = sc.nextInt();
        System.out.println("Enter the number of Edges : ");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= v; i++)
            ar.add(new ArrayList<>());

        for (int i = 0; i < e; i++) {
            System.out.println("Enter Pair Edges : ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            ar.get(x).add(y);
        }
        ArrayList<Integer> ans = BFS(v,ar);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print(ans.get(i) + " ");

        }
    }
    static ArrayList<Integer> BFS(int v , ArrayList<ArrayList<Integer>> ar){
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean [] b = new boolean[v+1];
        q.add(0);
        b[0] = true;
        while (!q.isEmpty()){
            int i = q.poll();
            bfs.add(i);
            for (int j : ar.get(i)) {
                if(b[j]==false){
                    b[j] = true;
                    q.add(j);
                }
            }
        }


        return bfs;
    }
}
