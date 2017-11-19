package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月19日 下午4:11:57
*describ 
*/
public class TestGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("(\\d(\\d))\\2");
		Matcher m = p.matcher("12222");
		System.out.println(m.find());
		
	}

}
