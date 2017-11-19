package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月19日 下午3:46:14
*describ 
*/
public class TestQuantifiers {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(.{3,10}+)[0-9]");
		Matcher m = p.matcher("aaaa1bbbb2");
		if(m.find()) {
			System.out.println(m.start() + "-" + m.end());
		} else {
			System.out.println("not match!");
		}

	}

}
