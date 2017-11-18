package guyue.hu;

import java.util.regex.Pattern;

/**
*@author 作者 E-mail:
*version 创建时间:2017年11月16日上午10:29:29
*类说明
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
