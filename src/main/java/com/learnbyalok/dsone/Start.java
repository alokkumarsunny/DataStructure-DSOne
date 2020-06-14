/**
 * 
 */
package com.learnbyalok.dsone;

import com.learnbyalok.dsone.linklist.CustomLinkList;
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
//		System.out.println("This is my alok!");
		CustomLinkList<Object> linklistObj = new CustomLinkList<Object>();
		linklistObj.insert(0, "1Inset");
		linklistObj.insert(0, "3Inset");
		//linklistObj.remove(2);
		//List<Integer> arrlistObj = new ArrayList<Integer>(5);
		//arrlistObj.add(5);
		//arrlistObj.add(6);	
		//linklistObj.append(arrlistObj);		
		System.out.println(linklistObj.toString());
		linklistObj.reverse();
		System.out.println(linklistObj.toString());
		
		//test custom stack
		CustomStack<Integer> stackObj = new CustomStack<Integer>();
		stackObj.push(10);
		stackObj.push(20);
		stackObj.push(30);
		stackObj.push(31);
		stackObj.push(32);
		System.out.println(stackObj.toString());
		stackObj.pop();
		System.out.println(stackObj.toString());
		
		
	}

}
