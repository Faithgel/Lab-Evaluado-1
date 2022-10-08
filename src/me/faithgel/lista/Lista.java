package me.faithgel.lista;

public class Lista {
    //atributos
    private Nodo head;
    private int size;

    //constructor
    public Lista(){
        this.head = null;
        this.size = 0;
    }

    //metodos
    public boolean insertNth(int n, int value){
        if(n < 0) return false;

        Nodo nuevo = new Nodo();
        nuevo.dato = value;
        if(n == 0){
            nuevo.siguiente = this.head;
            this.head = nuevo;
            this.size++;
            return true;
        }
        Nodo aux = this.head;
        for(int i = 0; i < n - 1; i++){
            aux = aux.siguiente;
        }
        nuevo.siguiente = aux.siguiente;
        aux.siguiente = nuevo;

        this.size++;

        return true;
    }

    public boolean deleteNth(int n){
        if(n < 0) return false;
        if(n == 0){
            this.head = this.head.siguiente;
            this.size--;
            return true;
        }
        Nodo aux = this.head;
        for(int i = 0; i < n - 1; i++){
            aux = aux.siguiente;
        }
        aux.siguiente = aux.siguiente.siguiente;
        this.size--;
        return true;
    }

    public boolean swapNodes(int pos1, int pos2){
        if(pos1 < 0 || pos2 < 0) return false;
        if(pos1 == pos2) return true;
        Nodo aux1 = this.head;
        Nodo aux2 = this.head;
        for(int i = 0; i < pos1; i++){
            aux1 = aux1.siguiente;
        }
        for(int i = 0; i < pos2; i++){
            aux2 = aux2.siguiente;
        }
        int temp = aux1.dato;
        aux1.dato = aux2.dato;
        aux2.dato = temp;
        return true;
    }

    public void deleteDuplicates(){
        Nodo aux = this.head;
        while(aux != null){
            Nodo aux2 = aux;
            while(aux2.siguiente != null){
                if(aux.dato == aux2.siguiente.dato){
                    aux2.siguiente = aux2.siguiente.siguiente;
                    this.size--;
                }else{
                    aux2 = aux2.siguiente;
                }
            }
            aux = aux.siguiente;
        }

    }

    public void reverse(){
        Nodo aux = this.head;
        Nodo aux2 = null;
        Nodo aux3 = null;
        while(aux != null){
            aux3 = aux2;
            aux2 = aux;
            aux = aux.siguiente;
            aux2.siguiente = aux3;
        }
        this.head = aux2;
    }
    public int getSize() {
        return size;
    }

    @Override
    public String toString(){
        Nodo aux = this.head;
        String s = "[";
        //list with for
        for(int i = 0; i < this.size; i++){
            if(i == this.size - 1){
                s += aux.dato;
            }else{
                s += aux.dato + ", ";
            }
            aux = aux.siguiente;
        }
        return s+ "]";
    }

}
