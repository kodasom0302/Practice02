package com.javaex.practice;

import java.util.Scanner;

public class 확인용 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int no01=sc.nextInt();
		System.out.print("두번째 숫자: ");
		int no02=sc.nextInt();
		
		if (no01>no02) {
			System.out.println("몫: "+no01/no02);
			System.out.println("나머지: "+no01%no02);
		} else {
			System.out.println("몫: "+no02/no01);
			System.out.println("나머지: "+no02%no01);
		}
		
		sc.close();
		
		}

	}


//System.out.println();