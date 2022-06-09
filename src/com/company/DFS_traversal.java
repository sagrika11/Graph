package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS_traversal {
    public static  void callingDFS(int i,boolean[]vi, ArrayList<ArrayList<Integer>> ar, ArrayList<Integer>store ){
        vi[i]=true;
        store.add(i);
        for (int it : ar.get(i)){
            if(!vi[it]){
                callingDFS(it,vi,ar,store);
            }
        }
    }
    public static  ArrayList<Integer> DFS(int v, ArrayList<ArrayList<Integer>> ar){
        ArrayList<Integer> store = new ArrayList<Integer>();
        boolean [] visit = new boolean[v];
        for (int i = 0; i <v ; i++) {
            if(visit[i]==false){
                callingDFS(i,visit,ar,store);
            }
        }
        return store;
    }

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
             ar.get(x).add(y);


        }
        ArrayList<Integer> bfs  = DFS(v,ar);
        for (int i = 0; i < bfs.size(); i++) {
            System.out.println("DFS Traversal : " + bfs.get(i));
        }

    }
}
