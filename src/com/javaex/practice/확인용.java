package com.javaex.practice;

import java.util.Scanner;

public class 확인용 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int year=sc.nextInt();
		int age=2023-year;
		System.out.println("올해 : 2023");
		System.out.println("태어난 해 : "+year);
		System.out.println("나이 : "+age);
		System.out.println("====================================");
		if (age>=20) {
			System.out.println("20살 이상");
			
		if (year%2!=0) {
				System.out.println("건강검진해");
		} else {
			System.out.println("건강검진해 아님");
		} 
		
		if (age>=40) {
			System.out.println("암 검사");
		} else {
			System.out.println("암 검사X");
		}
		
		} else {
			System.out.println("20살 미만 건강검진 대상이 아님");
		}
		
		sc.close();
		
		}

	}


/*
Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.print();
		int year=sc.nextInt();
*/