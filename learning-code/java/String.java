// import java.util.Arrays;

// public class String {
//     public static void main(String[] args) {
//     /* String merupakan tipe data  yg dapat melakukan berbagai macam operasi khusus. 
//     Berikut ini, kita dapat merubah char ke String
//      */  
// 		String[] strArr = new String[] {"1","2","3"};
		
// 		String str = strArr.toString();
		
// 		System.out.println("Java String array to String = "+str);
// 	}
// }

// Java program to demonstrate 
// working of Arrays.toString() 

import java.io.*; 
import java.util.*; 
public class String{ 
    public static void main(String[] args) 
    { 

        // Let us create different types of arrays and 
        // print their contents using Arrays.toString() 
        boolean[] boolArr 
            = new boolean[] { true, true, false, true }; 
        char[] charArr 
            = new char[] { 'g', 'e', 'e', 'k', 's' }; 
        double[] dblArr 
            = new double[] { 1, 2, 3, 4 }; 
        int[] intArr 
            = new int[] { 1, 2, 3, 4 }; 
        Object[] objArr 
            = new Object[] { 1, 2, 3, 4 }; 
        System.out.println( 
            "Boolean Array: "
            + Arrays.toString(boolArr)); 
        System.out.println( 
            "Character Array: "
            + Arrays.toString(charArr)); 
        System.out.println( 
            "Double Array: "
            + Arrays.toString(dblArr)); 
        System.out.println( 
            "Integer Array: "
            + Arrays.toString(intArr)); 
        System.out.println( 
            "Object Array: "
            + Arrays.toString(objArr)); 
    } 
} 