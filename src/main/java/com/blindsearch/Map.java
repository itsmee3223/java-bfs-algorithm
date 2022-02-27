/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blindsearch;
import java.awt.Point;
import java.util.LinkedList;
/**
 *
 * @author ramanda ajisaka asyraf
 */
public class Map {
    int width=0;
    int height=0;
    
    int [][] map;
    
    public Map(int width, int height){
        this.width = width;
        this.height = height;
        map = new int [width][height];
    }
    
    public void printMap(){
        for(int j=0;j<height;j++){
            for(int i=0;i<width;i++){
                System.out.print(map[i][j]+"("+i+","+j+") , ");
            }
            System.out.println();
        }
    }
    
    public LinkedList<Node> getNextNode(Node n){
        Point p = n.idNode;
        int xr[] = {1,0,-1,0};
        int yr[] = {0,1,0,-1};
        
        LinkedList<Node> list = new LinkedList<Node>();
        
        for(int i=0;i<4;i++){
            int nx = p.x+xr[i];
            int ny = p.y+yr[i];
            if((nx >= 0 && nx < width) && (ny >=0 && ny < height)){
                list.add(new Node(new Point(nx,ny)));
            }
        }
        return list;
    }
}
