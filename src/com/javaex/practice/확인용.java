package com.javaex.practice;

import java.util.Scanner;

public class 확인용 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int no01=sc.nextInt();
		System.out.print("숫자2: ");
		int no02=sc.nextInt();
		System.out.print("숫자3: ");
		int no03=sc.nextInt();
		
		if (no01<no02 && no01<no03) {
			System.out.println("가장 작은 수는 "+no01+" 입니다.");
		} else if (no02<no01 && no02<no03) {
			System.out.println("가장 작은 수는 "+no02+" 입니다.");
		} else {
			System.out.println("가장 작은 수는 "+no03+" 입니다.");
		}
		
		sc.close();
		
		}

	}


//System.out.println();