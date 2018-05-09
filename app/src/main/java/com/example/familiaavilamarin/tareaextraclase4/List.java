package com.example.familiaavilamarin.tareaextraclase4;

public class List {
    private Node first;

    public List(){
        this.first = null;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public void AddElement(Node toAdd){
        if (this.getFirst() == null){
            this.setFirst(toAdd);
        }
        else{
            Node helper = this.getFirst();
            while (helper.getNext() != null){
                helper = helper.getNext();
            }
            helper.setNext(toAdd);
        }
    }

    public int largo(){
        int number = 0;
        Node helper = this.getFirst();
        while (helper != null){
            number++;
            helper = helper.getNext();
        }
        return number;
    }
}
