package com.javaex.practice;

import java.util.Scanner;

public class 확인용 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		double x=sc.nextDouble();
		double result01=x*x*x-9*x+2;
		double result02=7*x+2;
		
		if (x<=0) {
			System.out.println("계산 결과는 "+result01+" 입니다.");
		} else {
			System.out.println("계산 결과는 "+result02+" 입니다.");
		}
		
		sc.close();
		
		}

	}


//System.out.println();