package com.company;

public class MapInterface {
    public void HashMap(){
        System.out.println("HASH MAP");
        // Crear hashmap
        java.util.HashMap<Integer, String> hm
                = new java.util.HashMap<Integer, String>();

        hm.put(1, "Tirso");
        hm.put(2, "Jose");
        hm.put(3, "Cordova");

        // buscar un elemento
        System.out.println("buscando elemento con llave 1");
        System.out.println("Value for 1 is " + hm.get(1));

        // recorrer el hashmap
        for (java.util.Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        System.out.println();
    }
    }

