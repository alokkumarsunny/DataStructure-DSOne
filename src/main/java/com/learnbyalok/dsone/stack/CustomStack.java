package com.learnbyalok.dsone.stack;
import com.learnbyalok.dsone.linklist.*;

public class CustomStack<T> {
	CustomLinkList<T> innerLinkList = new CustomLinkList<T>();
	
	public int push(T value) {
		int isPushed = 0;
		isPushed = innerLinkList.prepend(value);
		return isPushed;		
	}
	public int pop() {
		int isPoped = 0;
		isPoped = innerLinkList.remove(0);
		return isPoped;		
	}
	
	public T peek() {
		T value = innerLinkList.getHead();
		return value;
	}
	
	public String toString(){
		return innerLinkList.toString();
	}
	
}
