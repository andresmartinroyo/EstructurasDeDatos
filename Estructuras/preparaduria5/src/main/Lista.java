/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Andres
 */
public class Lista<T> {

    private int first;
    private int last;
    private int size;
    private Nodo[] array;

    //Costructor
    public Lista(int max) {
        this.first = this.last = -1;
        this.size = 0;
        this.array = new Nodo[max];
    }

    //Ver si esta vacio
    public boolean isEmpty() {
        return first == -1;
    }

    //No se
    public void empty() {
        this.first = this.last = -1;
        this.size = 0;
        this.array = new Nodo[array.length];
    }

    //Ver si esta lleno el arreglo
    public boolean isFull() {
        return size == this.array.length;
    }

    //Buscar un espacio vacio en el arreglo
    public int searchEmpltySlot() {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                return i;

            }

        }
        return -1;
    }

    //Ponerle un elemnto de Primero
    public void addAtTheStart(T data) {

        if (!this.isFull()) {
            Nodo node = new Nodo(data);
            int position = this.searchEmpltySlot();
            this.array[position] = node;
            if (this.isEmpty()) {
                this.first = this.last = position;
            } else {
                this.array[position].setNext(this.first);
                this.first = position;
            }this.size++;
        }

    }

    //Ponerle un ellemnte de ultimo
    public void addAtTheEnd(T data) {

        if (!this.isFull()) {
            Nodo node = new Nodo(data);
            int position = this.searchEmpltySlot();
            this.array[position] = node;
            if (this.isEmpty()) {
                this.first = this.last = position;
            } else {
                this.array[this.last].setNext(position);
                this.last = position;
            }this.size++;
        }

    }
    
    public String printList(){
        String list = "";
        int position = this.first;
        while (position != -1){
            list += this.array[position].getData() + "=>";
            position = this.array[position].getNext();
        }
        return list + "//";
    }
    
    public void insertOrdered(T data){
        if (!this.isFull()){
            if (this.isEmpty()){
                this.addAtTheStart(data);
            }else if (String.valueOf(data).compareToIgnoreCase(String.valueOf(this.array[this.first].getData())) <= 0){
                this.addAtTheStart(data);
            }else if (String.valueOf(data).compareToIgnoreCase(String.valueOf(this.array[this.first].getData())) > 0){
                this.addAtTheEnd(data);
            }else{
                int previous = this.first;
                int current = this.array[this.first].getNext();
                while (String.valueOf(data).compareToIgnoreCase(String.valueOf(this.array[current].getData()))>0){
                    previous = current;
                    current = this.array[current].getNext();    
                }
                Nodo nodo = new Nodo(data);
                int position = this.searchEmpltySlot();
                this.array[position] = nodo;
                this.array[previous].setNext(position);
                this.array[position].setNext(current);
                size++;
                
            }
        }
    }
    //Falta hacer el reverse
}