package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author ���� E-mail:
*version ����ʱ��:2017��11��16������11:37:03
*��˵��
*/
public class TestBackslash {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\\\");
		Matcher m = p.matcher("\\");
		printf(m.matches());
//		printf("\n".matches("^[\\s&&[^\\n]]*\\n$"));
		printf("huguobao@cimoe.com.cn".matches("[\\w[.-]]+@[\\w[.-]]+\\.com(\\.cn)?"));

	}
	
	public static void printf(Object o) {
		System.out.println(o);
	}

}
