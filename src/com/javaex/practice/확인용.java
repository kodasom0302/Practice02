package com.javaex.practice;

import java.util.Scanner;

public class 확인용 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double revenue=sc.nextDouble();
		
		if (0=revenue && 0<revenue && revenue=1000 && revenue<1000) {
			double tax=0.09*revenue
		} else if (1000<revenue && revenue<=4000) {
			double tax=1000*0.09+0.18*(revenue)-1000)
		} else if (4000<revenue && revenue<8000) {
			double tax=1000*0.09+3000*0.18*0.27*(revenue-4000)
		} else if (8000=<revenue) {
			double tax=1000*0.09+3000*0.18+4000*0.27+0.36*(revenue-8000)
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
			System.out.println("소득세는 "+tax+" 입니다.");
			
			sc.close();
		
		}

	}


//System.out.println();