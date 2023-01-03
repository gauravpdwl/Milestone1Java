package firstprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GetCompressedString {

	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String [] args) throws NumberFormatException, IOException {
		String str = br.readLine ();
		if (str != null) {
			str = str.trim ();
		} else {
			str = "";
		}

		String ans = Solution.getCompressedString(str);
		System.out.println(ans);
		
	}
	
	public class Solution {
		public static String getCompressedString(String str) {
			// Write your code here.
			
			String newstr="";
			int count=1;
			int counter=0;
			
			if(str.length()==0) {
				return "";
			}else {
				newstr=newstr+str.charAt(0);
			}
			
			for(int i=1;i<str.length();i++) {
				if(str.charAt(i)==newstr.charAt(counter)) {
					count++;
				}else {
					if(count>1) {
						newstr=newstr+count;
						counter++;
					}
					newstr=newstr+str.charAt(i);
					counter++;
					count=1;
				}
			}
			if(count>1) {
				newstr=newstr+count;
			}
			
			return newstr;
		}

	}
}
