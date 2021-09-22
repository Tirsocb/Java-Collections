package com.company;

public class Setinterface {
    public void hashSet(){
        System.out.println("HASH SET");
        // Crear hashset
        java.util.HashSet<String> hs = new java.util.HashSet<String>();
        //agregar elementos
        hs.add("Telus");
        hs.add("International");
        hs.add("Digidtal");
        hs.add("Solutions");
        hs.add("University");

        // crear iterador para poder iterar los elementos
        java.util.Iterator<String> itr = hs.iterator();

        //recorrer/imprimir elementos
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();

    }

    public void linkedHash(){
        System.out.println("LINKED HASH SET");
        // Crear linked hashset
        java.util.LinkedHashSet<String> lhs
                = new java.util.LinkedHashSet<String>();

        lhs.add("Telus");
        lhs.add("International");
        lhs.add("Digital");
        lhs.add("Solutions");
        lhs.add("University");

        // crear iterador para poder recorrer los elementos
        java.util.Iterator<String> itr = lhs.iterator();

        //imprimir/iterar los elementos
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
    }



}
