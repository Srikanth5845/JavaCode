package assignments;

import java.util.Arrays;

public class As66 {

	public static void main(String[] args) {
		  String s1="north";
          String s2="thorn";
          
          if(s1.length()!=s2.length())
          {
                  System.out.println("They cannot be anagram");
          }
          else
          {
          
          char [] c1=        s1.toCharArray();
          char [] c2=        s2.toCharArray();

          Arrays.sort(c1);
          Arrays.sort(c2);

          if(Arrays.equals(c1,c2)==true)
          {
                  System.out.println("The given 2 STrings are Anagram");
          }
          else
          {
                  System.out.println("The given 2 STrings are NOT Anagram");
          }
          }

	}

}
