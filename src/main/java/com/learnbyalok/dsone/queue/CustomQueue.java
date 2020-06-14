package com.learnbyalok.dsone.queue;

import com.learnbyalok.dsone.linklist.CustomLinkList;

public class CustomQueue<T> {
    CustomLinkList<T> innerLinkList = new CustomLinkList<T>();
	
	public int enqueue(T value) {
		int isEnqueued = 0;
		isEnqueued = innerLinkList.append(value);
		return isEnqueued;		
	}
	public T dequeue() {
		T removedValue = innerLinkList.getHead();
		innerLinkList.remove(0);
		return removedValue;		
	}
	
	public T peek() {
		T value = innerLinkList.getTail();
		return value;
	}
	
	public String toString(){
		return innerLinkList.toString().replace("->", "<-");
	}
	
	public int getLength() {
		return innerLinkList.getLength();
	}
}
