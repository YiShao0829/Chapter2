package test_Chapter2;

import java.io.*;

public class test_P16 {

	public static void main(String[] args) throws java.io.IOException
	{
		System.out.println("請輸入整數");
		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		char letter=str.charAt(0);
		
		switch(letter)
		{
			case 'a':
			{
				System.out.println("輸入的是a");
				break;
			}
			case 'b':
			{
				System.out.println("輸入的是b");
				break;
			}
			default:
			{
				System.out.println("請輸入a或b");
				break;
			}
		}
	}
}
