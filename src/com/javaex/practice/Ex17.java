package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

/*	???
다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요
 세금계산법
 0원이상 1000만원 이하인 경우 tax: 0.09*수익
 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)

	public static void main(String[] args) {
		
		double tax;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double revenue=sc.nextDouble();
		
		switch (revenue) {
			case (0==revenue || 0<revenue || revenue==1000 || revenue<1000) :
				tax=0.09*revenue;
				System.out.println("소득세는 "+tax+" 입니다.");
				break;
				
			case (1000<revenue || revenue==4000 || revenue<4000) :
				tax=1000*0.09 + 0.18*(revenue-1000);
				System.out.println("소득세는 "+tax+" 입니다.");
				break;
				
			case (4000<revenue || revenue<8000) :
				tax=1000*0.09 + 3000*0.18 + 0.27*(revenue-4000);
				System.out.println("소득세는 "+tax+" 입니다.");
				break;
				
			case (8000==revenue || 8000<revenue) :
				tax=1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(revenue-8000);
				System.out.println("소득세는 "+tax+" 입니다.");
				break;
				
			default :
				System.out.println("잘못 입력했습니다.");
				break;
		}
			
			sc.close();

	}
*/
}
