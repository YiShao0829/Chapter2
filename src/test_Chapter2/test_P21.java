package test_Chapter2;

import java.io.*;


public class test_P21 {

	public static void main(String[] args) throws java.io.IOException
	{
		System.out.println("請問要選擇哪條路線?");
		System.out.println("請輸入整數");
		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		char ans=(res==1)? 'A':'B';
		System.out.println("選擇了"+ans+"路線");
		
		}
	}
