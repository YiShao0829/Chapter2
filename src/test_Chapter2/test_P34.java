package test_Chapter2;

import java.io.*;

public class test_P34 {

	public static void main(String[] args) throws java.io.IOException
	{
		System.out.println("要跳過第幾次處理結束迴圈呢?(1~10)");
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int res=Integer.parseInt(str);
		
		for(int i=1;i<=10;i++)
		{
			if(i==res)
				continue;
			System.out.println("第"+i+"次的處理。");

		}
	}

}
