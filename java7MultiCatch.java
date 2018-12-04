/**
 * 
 */
package com.java.version.test;

/**
 * @author ongart.w
 *
 */

import java.lang.ArithmeticException ;
public class java7MultiCatch {

	/**
	 * 
	 */
	public java7MultiCatch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args)  {
		try {
			test();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main method :Exception");
			e.printStackTrace();
		}
	}
	public static void test() throws Exception {
		// TODO Auto-generated method stub
		try{ 
			String a = null; //null value 
            System.out.println(a.charAt(0)); // Null pointer Exception
            throw new Exception() ;
		}catch(ArithmeticException |NullPointerException e){
			System.out.println("test method :exception");
			e.printStackTrace();
		}
		
	}

}
