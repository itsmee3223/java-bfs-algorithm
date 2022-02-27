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
public class Node {
    protected Point idNode;
    protected Node parent;
    protected LinkedList<Node> childs;
    
    public Node(Point idNode){
        this.idNode = idNode;
        childs = new LinkedList<Node>();
    }
    
    public Point getIdNode(){
        return idNode;
    }
    
    public void setIdNode(Point idNode){
        this.idNode = idNode;
    }
    
    public Node getParent(){
        return parent;
    }
    
    public void setParent (Node parent){
        this.parent = parent;
    }

    public LinkedList<Node> getChilds() {
        return childs;
    }

    public void setChilds(LinkedList<Node> childs) {
        this.childs = childs;
    }
    public void addChhild(Node child){
        childs.add(child);
        child.setParent(this);
    }
    
    public boolean equals(Object ob){
        if(ob instanceof Node){
            if(((Node)ob).idNode.equals(idNode))
                return true;
            else 
                return false;
        }
        return false;
    }
    
    public String toString(){
        return "("+idNode.x+","+idNode.y+")";
    }
}
