
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
import java.io.InputStreamReader;

public class p47 {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		
			Integer[]test= new Integer[5];
			 
		System.out.println("請輸入五個人分數");
		
		for (int i=0;i<test.length;i++)
		{
		String str =br.readLine();
		test[i] =Integer.parseInt(str);
		}
		
  Arrays.sort(test, Collections.reverseOrder());

		
		for (int i=0;i<test.length;i++)
		{
			System.out.println("第"+ (i+1) +  "名的分數是"+ test[i]);
		}
}


}
