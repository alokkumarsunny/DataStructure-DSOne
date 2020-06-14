/**
 * 
 */
package com.learnbyalok.dsone;
import java.util.ArrayList;
import java.util.List;

import com.learnbyalok.dsone.linklist.*;

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
		MyLinkList<Object> linklistObj = new MyLinkList<Object>();
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
		
		
	}

}
