package guyue.hu;

import java.util.regex.Pattern;

/**
*@author ���� E-mail:
*version ����ʱ��:2017��11��16������10:29:29
*��˵��
*/
public class TestRegex {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[1-9]\\d{2}");
//		Matcher m = p.matcher("134AAAA");
		String[] strs = p.split("134AAAA456asdasaf");
		for(int i=0; i<strs.length; i++) {
			printf(strs[i]);
		}
	}

	public static void printf(Object o) {
		System.out.println(o);
	}
}
