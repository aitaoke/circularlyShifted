package Chap1;

import java.util.Scanner;

@SuppressWarnings("unused")
public class W2_6circularlyShifted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("please input a string:");
		String s=scanner.nextLine();
		System.out.println("please input another string:");
		String t=scanner.nextLine();
		boolean flag=false;
		
		////////////////判断两个字符串是否是循环逆转的
		if((s.length()==t.length())&&s.concat(s).indexOf(t)>=0)
			System.out.println("the strings are circularly shifted!");
		else
			System.out.println("the strings are not circularly shifted!");
	}

}
