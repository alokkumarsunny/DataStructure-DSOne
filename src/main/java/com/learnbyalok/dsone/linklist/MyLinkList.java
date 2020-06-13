package com.learnbyalok.dsone.linklist;

import java.util.*;

public class MyLinkList<T> {
	private Node<T> head , tail = null;
	private int length = 0;
	
	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}
	
	public int append(T value) {
		int isAppended = 0;
		Node<T> node = new Node<T>();	
		try {
			node.setValue(value);
			node.setNext(null);
			if(length == 0) {									
				head = node;
				tail = node;
				length++;
			}else{
				length++;
				tail.setNext(node);
				tail = node;
			}
			isAppended = 1;
		}catch(Exception ex){
			System.out.print(ex.toString());
		}
		return isAppended;
	}
	
	public int prepend(T value) {
		int isPrepened  = 0;
		try {
			Node<T> node = new Node<T>();
			node.setValue(value);
			node.setNext(null);
			if(length == 0) {									
				head = node;
				tail = node;
				length++;
			}else{
				length++;
				node.setNext(head);
				head = node;
			}
		}catch (Exception e) {
			System.out.print(e.toString());
		}
		return isPrepened;
	}
	
	public int insert(int index , T value) {
		int isInserted = 0;
		try {					
			if (index == 0) {
				isInserted = prepend(value);
				return isInserted;
			}
			else if(index == length) {
				isInserted = append(value);
				return isInserted;
			}
			else if(index > length) {
				return isInserted;
			}else {
				Node<T> node = new Node<T>();
				node.setValue(value);
				node.setNext(null);
				Node<T> currentNode = head;
				for(int i=0; i<index-1; i++) {
					currentNode = currentNode.getNext();
				}
				length++;
				node.setNext(currentNode.getNext());
				currentNode.setNext(node);
				isInserted = 1;
				
			}
		}catch (Exception e) {
			System.out.print(e.toString());
		}
		return isInserted;
	}
	
	public int remove(int index) {
		int isRemoved = 0;
		try {					
			if(index == 0) {
				head = head.getNext();
			}
			if(index > length) {
				return isRemoved;
			}
			else {
				Node<T> currentNode = head;
				for(int i=0; i < index-1; i++) {					
					currentNode = currentNode.getNext();
				}															
				if(index == length-1) {					
					currentNode.setNext(null);
					tail = currentNode;
				}
				else{					
					currentNode.setNext(currentNode.getNext().getNext());
				}
				length--;
			}
		}catch (Exception e) {
			System.out.print(e.toString());
		}
		return isRemoved;
	}
	
	
	
	@Override
	public String toString(){
		StringBuilder finaloutput = new StringBuilder();
		Node<T> currentNode = head;
		while (currentNode != null) {
			finaloutput.append(currentNode.getValue());		
			currentNode = currentNode.getNext();
			if(currentNode != null) {
				finaloutput.append("->");
			}			
		}		
		return finaloutput.toString();
	}
}


class Node<T>{
	private T value;
	private Node<T> next;	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	

	
	
}
