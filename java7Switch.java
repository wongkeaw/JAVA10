package com.java.version.test;

public class java7Switch {
	// 1- switch with string-  first time, represent in java 7
	public static void main(String []args) {
		String a="Aa";
		switch(a){
		case "a":sop("f");
		break;

		case "Aa":sop("s");
		break;

		default: sop("D"); 

		}
	}
	static void sop(String str) {
		System.out.println(" System Out :"+str);
	}

}
