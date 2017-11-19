package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月19日 下午4:20:27
*describ 
*/
public class TestFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pattern p = Pattern.compile("java",Pattern.CASE_INSENSITIVE);
		Pattern p = Pattern.compile("(?i)java");//(?i)表示打开CASE_INSENSITIVE的开关
		Matcher m = p.matcher("JaVa");
		System.out.println(m.find());

	}

}
