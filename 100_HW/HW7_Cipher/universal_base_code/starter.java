/*
 *	Author: Meghan Chiu
 *  Date: 10/12/25
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	// section 1
	String a = (String)(Cipher.encode("6v lvp u5vuy5 y1z5 qpsqy5r"));
	System.out.println(a);
	String b = (String)(Cipher.encode("sv8vq17r 1r q25 85rq"));
	System.out.println(b);
	String c = (String)(Cipher.encode("q25 z5l qv wpx85s f 1r gg"));
	System.out.println(c);
	String d = (String)(Cipher.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz", 33));
	System.out.println(d);
	String e = (String)(Cipher.encode("29y4 v4 v2q9w1r 05sr5l wpx85s 1r z5l qv d"));
	System.out.println(e);
	String f = (String)(Cipher.keyedEncode("a8 1oy 92 1kx rxdj in 4", 8));
	System.out.println(f);
	String g = (String)(Cipher.keyedEncode(Cipher.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", 13), 29));
	System.out.println(g);
	String h = (String)(Cipher.encode("lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw"));
	System.out.println(h);
	
	//section 2
	String i = (String)(Cipher.keyedEncode("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y", 27));
	System.out.println(i);
	String j = (String)(Cipher.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct", 16));
	System.out.println(j);
	
	//section 3
	System.out.print("\nEnter a sentence and I will encode it : ");
	String input = sc.nextLine();
	String code = (String)(Cipher.encode(input));
	System.out.println(code);
	
	String urturn = (String)(Cipher.keyedEncode("this homework was really really hard to figure out", 6));
	System.out.println(urturn);
	}
}