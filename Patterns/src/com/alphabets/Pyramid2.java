package com.alphabets;

public class Pyramid2 {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print((char)(ch+(j-1))+" ");
			}
			System.out.println();
		}

	}

}
