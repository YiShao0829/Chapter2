package test_Chapter2;

import java.io.*;


public class test_P15 {

	public static void main(String[] args) throws java.io.IOException
	{
		System.out.println("請輸入整數");
		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		int num=Integer.parseInt(br.readLine());
		
		switch(num)
		{
			case 1:
			
				System.out.println("輸入的是1");
			
			case 2:
			{
				System.out.println("輸入的是2");
			}
			default:
			{
				System.out.println("請輸入1或2");
			}
		}
	}
}
