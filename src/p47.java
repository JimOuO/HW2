
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
			 
		System.out.println("�п�J���ӤH����");
		
		for (int i=0;i<test.length;i++)
		{
		String str =br.readLine();
		test[i] =Integer.parseInt(str);
		}
		
  Arrays.sort(test, Collections.reverseOrder());

		
		for (int i=0;i<test.length;i++)
		{
			System.out.println("��"+ (i+1) +  "�W�����ƬO"+ test[i]);
		}
}


}
