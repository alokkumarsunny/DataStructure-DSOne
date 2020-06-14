/**
 * 
 */
package com.learnbyalok.dsone;

import com.learnbyalok.dsone.linklist.CustomLinkList;
import com.learnbyalok.dsone.queue.CustomQueue;
import com.learnbyalok.dsone.stack.CustomStack;

/**
 * @author akumar5
 *
 */
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("----------------------Custom LinkList-----------------------");
		// test custom linklist
		CustomLinkList<Object> linklistObj = new CustomLinkList<Object>();
		linklistObj.insert(0, "1Inset");
		linklistObj.insert(0, "3Inset");
		System.out.println(linklistObj.toString());
		linklistObj.reverse();
		System.out.println(linklistObj.toString());
		System.out.println(linklistObj.getLength());

		System.out.println("----------------------Custom Stack-----------------------");
		// test custom stack
		CustomStack<Integer> stackObj = new CustomStack<Integer>();
		stackObj.push(10);
		stackObj.push(20);
		stackObj.push(30);
		stackObj.push(31);
		stackObj.push(32);
		System.out.println(stackObj.toString());
		stackObj.pop();
		System.out.println(stackObj.toString());
		System.out.println(stackObj.peek());
		System.out.println(stackObj.getLength());

		System.out.println("----------------------Custom Queue-----------------------");
		CustomQueue<Integer> queue = new CustomQueue<Integer>();
		queue.enqueue(10);
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println(queue.toString());
		System.out.println(queue.peek());
		System.out.println(queue.getLength());

	}

}
