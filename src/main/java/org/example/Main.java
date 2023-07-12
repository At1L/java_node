package org.example;

public class Main {
    public static void main(String[] args) {
        Node node = new Node("a");
        node.insert("b");
        node.insert("c");
        node.find("b").insert("d");
        node.printHTML(node);
    }
}