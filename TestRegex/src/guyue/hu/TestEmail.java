package guyue.hu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月17日 下午4:10:04
*describ 
*/
public class TestEmail {
	private final static String pattern = "([\\w]+)@([\\w]+)[\\.]([\\w]+)";
	private List<String> results = new ArrayList<String>();
	
	public static void main(String[] args) {
		TestEmail te = new TestEmail();
		te.matchStr();
		te.printResults();

	}
	
	public void matchStr() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/hgb22613/Desktop/邮箱抓取_files/邮箱抓取.htm")));
			String str = null;
			Pattern p = Pattern.compile(pattern);
			Matcher m = null;
			while((str = br.readLine()) != null) {
				m = p.matcher(str);
				while(m.find()) {
					results.add(m.group());
				}
			}
			br.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		} catch(IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void printResults() {
		for(Iterator<String> ite = results.iterator(); ite.hasNext(); ) {
			System.out.println(ite.next());
		}
	}
	

}
