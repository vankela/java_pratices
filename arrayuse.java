# java_pratices
package basic_java;

import java.util.Scanner;

public class ArrayUse {
	public static void main(String[] args) {
//		int a[]= {1,2,3,4,5};
//		System.out.println(a.length);
//		System.out.println(a[0]);
//		a[5]=15;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter  the size of array");
		int size = in.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter value of "+i+" the index: ");
			arr[i]=in.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println("hello");
			arr[i]=in.nextInt();
		}
	}

}
