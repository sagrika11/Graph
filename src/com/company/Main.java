package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vertices : ");
        int v = sc.nextInt();
        System.out.println("Enter the Edges : ");
        int e = sc.nextInt();
        int[][] g = new int[v+1][v+1];
        for(int i = 0;i<=v;i++){
            for (int j = 0; j <=v ; j++) {
                g[i][j] = 0;
            }
        }
        for (int i = 0; i < e; i++) {
            System.out.println("Enter the pair of Edges : ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            g[x][y] = 1;
            g[y][x] = 1;
        }
        for (int i = 1; i <=v ; i++) {
            System.out.print(i);
            for (int j = 1; j <=v  ; j++) {
                System.out.print("-->" +g[i][j]);
            }
            System.out.println();
        }
    }
}
