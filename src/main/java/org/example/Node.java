package org.example;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String id;
    String name;
    List<Node> children;
    public Node(String a) {
        this.id = "";
        this.name = a;
        this.children = new ArrayList<Node>();
    }
    public int getChildrenSize(){
        return this.children.size();
    }
    public void insert(String name){
        Node buff = new Node(name);
        this.children.add(buff);
    }

    public void deleteByID(String id){
        for(int i = 0; i < this.children.size(); i++){
            if(children.get(i).id.equals(id)){
                children.remove(i);
            }
        }
    }
    public void deleteByName(String name){
        for(int i = 0; i < this.children.size(); i++){
            if(children.get(i).name.equals(name)){
                children.remove(i);
            }
        }
    }
    public void deleteAllChildren(){
        for(int i = 0; i < this.children.size(); i++){
                children.remove(i);
                i--;
        }
    }
    public Node find(String name){
        for(int i = 0; i < this.children.size(); i++){
            if(children.get(i).name.equals(name)){
                return children.get(i);
            }
        }
        for(int i = 0; i < this.children.size(); i++){
            if(this.children.get(i).find(name) != null)
                return this.children.get(i).find(name);
        }

        return null;
    }
    public String getName(){
        return this.name;
    }
}
