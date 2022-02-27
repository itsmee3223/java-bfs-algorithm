/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blindsearch;

import java.awt.Point;

/**
 *
 * @author ramanda ajisaka asyraf
 */
public class Main {
    public static void main(String args[]){
        Map myMap = new Map(10,10);
        Node start = new Node(new Point(6,7));
        Node goal = new Node(new Point(1,2));
        
        myMap.printMap();
        BFS map2dbfs = new BFS(myMap, start, goal);
    }
}
