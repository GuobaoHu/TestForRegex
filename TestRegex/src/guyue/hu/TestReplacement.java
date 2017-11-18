package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月16日下午4:33:57
*describ 
*/
public class TestReplacement {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("javAsunJAvahellojavA==");
		StringBuffer sb = new StringBuffer();
		int count = 0;
		while(m.find()) {
			count ++;
			if(count % 2 == 0) {
				m.appendReplacement(sb, "JAVA");
			} else {
				m.appendReplacement(sb, "java");
			}
		}
		System.out.println(sb);
		m.appendTail(sb);
		System.out.println(sb);
	}

}
