package guyue.hu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author 作者 E-mail:
*version 创建时间:2017年11月16日下午3:19:22
*类说明
*/
public class TestFind {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d{3,5}");
		Matcher h = p.matcher("7894-5645-454-56457-42421");
//		printf(h.matches());
//		h.reset();
//		printf(h.find(23));
//		printf(h.find(2));//有reset功能
		
		printf(h.find());
		printf(h.start());
		printf(h.end());
		printf(h.find());
		printf(h.start());
		printf(h.end());
		
		/*h.find();
		printf(h.group());
		printf(h.group());*/
		/*printf(h.group());
		printf(h.group());
		printf(h.group());*/
		
		/*printf(h.find());
		printf(h.find());
		printf(h.find());
		printf(h.find());
		printf(h.find());*/
	}
	
	public static void printf(Object o) {
		System.out.println(o);
	}

}
