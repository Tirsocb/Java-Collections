package com.company;

public class SortedSetInterface {
    public void treeSet(){
        // Crear Tree Set
        System.out.println("TREE SET");
        java.util.TreeSet<String> ts
                = new java.util.TreeSet<String>();
        //agregar elementos
        ts.add("Telus");
        ts.add("International");
        ts.add("Digital");
        ts.add("Solutions");
        ts.add("Univeristy");

        // crear iterador para poder recorrer los elementos
        java.util.Iterator<String> itr = ts.iterator();

        //recorrer los elementos
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
    }


}
