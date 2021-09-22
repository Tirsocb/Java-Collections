package com.company;



public class QueueInterface {
    public void priorityQueue(){
        System.out.println("PRIORITY QUEUE");
        // CrearProrityQueue
       java.util.PriorityQueue<Integer> pQueue
                = new java.util.PriorityQueue<Integer>();

        // agregar elementos
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // imprimir elemento de hasta arriba
        System.out.println("elemento de hasta arriba:");
        System.out.println(pQueue.peek());

        //imprimir elemento de hasta arriba y eliminadlo
        System.out.println("pop top element");
        System.out.println(pQueue.poll());

        //imprimir elemento de hasta arriba nuevamente
        System.out.println("modificado:");
        System.out.println(pQueue.peek());
        System.out.println();
    }

    public void arrayDeque(){
        // crear un array deque
        System.out.println("ARRAY DEQUE");
        java.util.ArrayDeque<Integer> de_que
                = new java.util.ArrayDeque<Integer>(10);

        //agregar elementos
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        //imprimir
        System.out.println(de_que);

        // borrar todo
        System.out.println("borrando todo...");
        de_que.clear();
        //imprimir nuevamente
        System.out.println(de_que);

        // agregar elementos al principio
        System.out.println("agregando elementos al principio");
        de_que.addFirst(564);
        de_que.addFirst(291);

        // agregar elementos al final
        System.out.println("agregando elementos al final");
        de_que.addLast(24);
        de_que.addLast(14);
        // imprimir resultado
        System.out.println(de_que);
        System.out.println();
    }



}

