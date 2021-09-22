package com.company;
class ListInterface {
    public void arrayList()
    {
        System.out.println("Array LIst");
        // Declarar ArrayList
        java.util.ArrayList<Integer> al = new java.util.ArrayList<Integer>();
        //agregar elementos
        for (int i = 1; i <= 5; i++)
            al.add(i);
        System.out.println("Array List");
        // mostrar elementos
        System.out.println(al);
        System.out.println("Eliminar elemento en posicion especifica (3)");
        // eliminar un elemento en una posicion especifica
        al.remove(3);
        System.out.println("Resultado");
        //mostrar resultado de eliminar elemento de posicion especifica
        System.out.println(al);
        System.out.println("Iterar elementos");
        // iterar elementos
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
        System.out.println();
    }

    public void linkedList(){
        System.out.println("LINKED LIST");
        // Declarar Linked List
        java.util.LinkedList<Integer> ll
                = new  java.util.LinkedList<Integer>();

        // agregar elementos
        for (int i = 1; i <= 5; i++)
            ll.add(i);

        // imprimir elementos
        System.out.println(ll);

        // eliminar elemento de lugar especificco
        System.out.println("eliminar elemento de lugar especificco ");
        ll.remove(3);

        // mostrar resultado
        System.out.println("Resultado");
        System.out.println(ll);

        // Iterar elementos
        System.out.println("Iterar ewlementos");
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
        System.out.println();
    }

    public void vector(){
        System.out.println("VECTOR");
        // Declarar el vector
        java.util.Vector<Integer> v
                = new  java.util.Vector<Integer>();

        // agregar elementos
        for (int i = 1; i <= 5; i++)
            v.add(i);

        // imprimir elementos
        System.out.println(v);

        // eliminar elementos de un lugar especifico
        System.out.println("Eliminar elementos de un lugar especifico (3)");
        v.remove(3);

        System.out.println("Resultado");
        System.out.println(v);

        //iterar elementos
        System.out.println("Iterar elementos");
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
        System.out.println();
    }

    public void stack(){
        System.out.println("StACK");
        java.util.Stack<String> stack = new java.util.Stack<String>();
        //agregar elementos
        System.out.println("agregando elementos...");
        stack.push("T");
        stack.push("I");
        stack.push("R");
        stack.push("S");
        stack.push("O");

        // crear un iterador para poder imprimirlo/recorrerlo
        java.util.Iterator<String> itr
                = stack.iterator();

        // imprimir el stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        //sacar un elemento
        System.out.println("haciendo pop....");
        stack.pop();

        // crear otro iterador para recorrer el stack modificado
        itr = stack.iterator();

        // imprimir el stack/recorrerlo
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }


}

