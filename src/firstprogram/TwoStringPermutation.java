package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TwoStringPermutation {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String str1 = br.readLine();
		if (str1 != null) {
			str1 = str1.trim();
		} else {
			str1 = "";
		}

		String str2 = br.readLine();
		if (str2 != null) {
			str2 = str2.trim();
		} else {
			str2 = "";
		}

		boolean ans = Solution.isPermutation(str1, str2);

		System.out.println(ans);
		
	}
	
	public class Solution {

		public static boolean isPermutation(String str1, String str2) {
			//Your code goes here
			
			String c;
			String s=str2;
			String newstr1="";
			String newstr2="";
			String test=null;
			
			System.out.println(str1);
			System.out.println(str2);
			
			if(str1.equals(str2)){
				return true;
			}
			if(str1.length() != str2.length()) {
				return false;
			}
			
			
			for(int i=0;i<str1.length();i++) {
				c=""+str1.charAt(i);
				
				if(s.contains(c)){
					newstr1=newstr1+c;
					s=s.replace(c," ");
					System.out.println(s);
				}else {
					return false;
				}
			}
			
			s=str1;
			for(int i=0;i<str2.length();i++) {
				c=str2.charAt(i)+"";
				
				if(s.contains(c)){
					newstr2=newstr2+c;
					s=s.replace(c," ");
					System.out.println(s);
				}else {
					return false;
				}
			}
			
//			if(newstr1.equals(newstr2)) {
//				return true;
//			}else {
//				return false;
//			}
			return true;
		}

	}
	
}
