package com.company;

public class Main {

    public static void main(String[] args) {
	ListInterface list = new ListInterface();
	QueueInterface queue = new QueueInterface();
	Setinterface set = new Setinterface();
	SortedSetInterface sortedset = new SortedSetInterface();
	MapInterface map = new MapInterface();

		System.out.println("------ LIST INTERFACE ------");
		list.arrayList();
		list.linkedList();
		list.vector();
		list.stack();
		System.out.println("------ QUEUE INTERFACE ------");
			queue.arrayDeque();
			queue.priorityQueue();
		System.out.println("------ SET INTERFACE ------");
		set.hashSet();
		set.linkedHash();
		System.out.println("------ SORTED SET INTERFACE -----");
		sortedset.treeSet();
		System.out.println("----- MAP INTERFACE -----");
		map.HashMap();


    }
}
