package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月17日 下午2:11:22
*describ 
*/
public class AppendReplace {
	

	public static void main(String[] args) {
		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("jAvAhellojavagoodJAvamaybejavA=======");
		StringBuffer strB = new StringBuffer();
		if(m.find()) {
			m.appendReplacement(strB, "99998");
		}
		/*int count = 0;
		while(m.find()) {
			count ++;
			if(count % 2 == 0) {
				m.appendReplacement(strB, "JAVA");
			} else {
				m.appendReplacement(strB, "java");
			}
		}*/
		m.appendTail(strB);
		System.out.println(strB);
	}

}
