package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月17日 下午3:43:38
*describ 
*/
public class Exercise1 {
	public static void main(String[] args) {
		String pStr1 = "(?<gu>\\d{3,5})(?<yue>[a-z]{2})";
		String sourceStr = "123aa-34345bb-234cc-00";
		Pattern p = Pattern.compile(pStr1);
		Matcher m =p.matcher(sourceStr);
		while(m.find()) {
			System.out.println(m.group("yue"));
		}
		
	}
}
