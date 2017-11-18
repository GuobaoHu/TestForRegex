package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月17日 下午3:24:31
*describ 
*/
public class QuoetReplacement {

	public static void main(String[] args) {
		String str = Matcher.quoteReplacement("\\hello\n$\\asda");
		Pattern p = Pattern.compile("\\\\");
		Matcher m = p.matcher(str);
		System.out.println(m.replaceAll("|"));

	}

}
