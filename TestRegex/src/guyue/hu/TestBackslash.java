package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author 作者 E-mail:
*version 创建时间:2017年11月16日上午11:37:03
*类说明
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
