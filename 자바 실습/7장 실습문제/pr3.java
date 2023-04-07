package day8.pr;

import java.util.HashMap;

import java.util.Scanner;

public class pr3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HashMap<String, Double> dic=new HashMap<String, Double>();
		String[] keyName=new String[5];
		for(int i=0;i<5;i++) {
			System.out.print("이름과 학점>> ");
			String key=scanner.next();
			keyName[i]=key;
			Double value=scanner.nextDouble();
			dic.put(key, value);
			}
		
		System.out.print("장학생 선발 학점 기준 입력>>");
		Double grade=scanner.nextDouble();
		System.out.print("장학생 명단:");
		for(int i=0;i<dic.size();i++) {
			String key=keyName[i];
			Double value=dic.get(key);
			if(value>=grade)
				System.out.print(key+" ");

		}
		scanner.close();
	}
}
