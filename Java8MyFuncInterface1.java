package com.java.version.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface MyFuncInterface1{
    public abstract int functionalMethod1();
    public default int getInteger(int b){
        return b*b;
     }
}
@FunctionalInterface
interface MyFuncInterface2{
    public abstract int functionalMethod2();
    public default boolean isPresent(boolean b){
      return b;
   }
}
@FunctionalInterface
interface MyFuncInterface3  {
	public abstract int calculate(int x); 
	
}
@FunctionalInterface
interface ShortToByteFunction {
 
    byte applyAsByte(short s);
 
}

public class Java8MyFuncInterface1 {

		public static void main(String []args) {

	        {
				MyFuncInterface1 i1 = () -> 9 ;
				System.out.println( i1.functionalMethod1() );
		        // -----------------------------
		        MyFuncInterface2 i2 = () -> 10  ;
		        System.out.println(i2.functionalMethod2());
		        System.out.println(i2.isPresent(false));
	        }

	        {
		        //------------------------------
		        // lambda expression to define the calculate method 
		        int a = 5; 
		        MyFuncInterface3 i3 = (int x)->x*x; 
		        // parameter passed and return type must be 
		        // same as defined in the prototype 
		        int ans = i3.calculate(a); 
		        System.out.println(ans);  
	        }
	        /*----------------------------------------------------------*/


	        {
		        short[] array = {(short) 1, (short) 2, (short) 3};
		        
		        byte[] transformedArray = transformArray(array, s -> (byte) (s * 2));
		         
		        byte[] expectedArray = {(byte) 2, (byte) 4, (byte) 6};
		        System.out.println(transformedArray);
		        System.out.println(expectedArray);
	        }
	        // --------------
	        {
	        int[] fibs = {0, 1};
	        Stream<Integer> fibonacci = Stream.generate(() -> {
	            int result = fibs[1];
	            int fib3 = fibs[0] + fibs[1];
	            fibs[0] = fibs[1];
	            fibs[1] = fib3;
	            return result;
	        });
	        System.out.println(fibonacci);
	        List<String> names = Arrays.asList("John", "Freddy", "Samuel");
	        names.forEach(name -> System.out.println("Hello, " + name));
	        }
	        {
	        	List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
	        	 
	        	List<String> namesWithA = names.stream()
	        	  .filter(name -> name.startsWith("A"))
	        	  .collect(Collectors.toList());
	        	
	        	namesWithA.forEach(name -> System.out.println(" " + name));
	        }
	        {
	        	List<String> names = Arrays.asList("bob", "josh", "megan");
	        	names.replaceAll(String::toUpperCase);
	        }
	        {
	        	List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);
	        	int sum = values.stream().reduce(0, (i1, i2) -> i1 + i2);
	        	System.out.println(sum);
	        }
	        {
	        	Thread thread = new Thread(() -> System.out.println("Hello From Another Thread"));
	        	thread.start();
	        }
	        
		}
		public static byte[] transformArray(short[] array, ShortToByteFunction function) {
		    byte[] transformedArray = new byte[array.length];
		    for (int i = 0; i < array.length; i++) {
		        transformedArray[i] = function.applyAsByte(array[i]);
		    }
		    return transformedArray;
		}
}
