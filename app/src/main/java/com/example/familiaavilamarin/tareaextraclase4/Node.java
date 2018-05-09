package com.example.familiaavilamarin.tareaextraclase4;

public class Node {
    private int valor;
    private Node next =null;

    public Node(int number){
        this.valor=number;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
