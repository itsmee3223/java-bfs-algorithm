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
public class BFS {
    LinkedList<Node> currentExpand;
    LinkedList<Node> nextExpand;
    LinkedList<Node> solution;
    Node start,goal;
    
    public BFS(Map map, Node start, Node goal){
        this.start = start;
        this.goal = goal;
        
        currentExpand = new LinkedList<Node>();
        nextExpand = new LinkedList<Node>();
        solution = new LinkedList<Node>();
        
        currentExpand.add(start);
        boolean next = true;
        
        while(next){
            for(Node cn:currentExpand){
                for(Node nn:map.getNextNode(cn)){
                    if(!isInLine(cn,nn)){
                        cn.addChhild(nn);
                        nextExpand.add(nn);
                    }
                }
            }
            currentExpand.clear();
            if(nextExpand.size() == 0){
                next = false;
                System.out.println("stop");
                continue;
            }
            for(Node nn:nextExpand){
                if(nn.equals(goal)){
                    next = false;
                    generateSolution(nn);
                    printSolution();
                    break;
                } else {
                    currentExpand.add(nn);
                }
            }
            nextExpand.clear();
        }
    }
    public boolean isInLine(Node parent, Node current){
        if(current.equals(parent)){
            return true;
        } else if(parent.parent!=null){
            return isInLine(parent.parent, parent);
        } else {
            return false;
        }
    }
    public void generateSolution(Node goal){
        Node cn=goal;
        while(cn.parent!=null){
            solution.addFirst(cn);
            cn=cn.parent;
        }
        solution.addFirst(cn);
    }
    public void printSolution(){
        if(solution!=null){
            System.out.println("\nAda Solusi");
            System.out.println("start"+start.toString()+", goal"+goal.toString());
            for(Node n : solution){
                System.out.print(n.toString());
            }
        } else {
            System.err.println("\nTidak ada solusi");
        }
    }
}
