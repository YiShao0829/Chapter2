package test_Chapter2;

import java.io.*;


public class test_P19 {

	public static void main(String[] args) throws java.io.IOException
	{
		System.out.println("請問你是男生嗎?");
		System.out.println("請輸入Y或N");
		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		char letter=str.charAt(0);
		
		if(letter=='Y' || letter=='y')
		{
			System.out.println("你是男生阿！");
		}
		else if(letter=='N' || letter=='n')
		{
			System.out.println("你是女生阿！");
		}
		else		
		{
			System.out.println("請輸入Y或N");
		}
	}
}
