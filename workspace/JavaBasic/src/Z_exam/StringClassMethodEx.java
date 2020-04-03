package Z_exam;

public class StringClassMethodEx {

	public static void main(String[] args) {
		//String(String s) : 주어진 문자열(s)를 갖는 String 인스턴스를 생성한다.
		String s = new String("Hello");
		
		//String 인스턴스생성. 
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		
		 s = new String(c);
		 System.out.println(s);
		 
		 //StringBuffer
		 StringBuffer sb = new StringBuffer("Hello");
		 String s1 = new String(sb);
		 System.out.println(s);
		 //그니까 얘는 수정이 가능한 String 임.
		 
		 //CharAt
		 s = "Hello";
		 String n = "0123456";
		 char c1 = s.charAt(1);
		 char c2 = n.charAt(1);
		 System.out.println(c1);
		 System.out.println(c2);
		 
		 
		 //compareTo
		 int i = "aaa".compareTo("aaa");
		 int i2 = "aaa".compareTo("ddd");
		 int i3 = "bbb".compareTo("");
		 
		 System.out.println(i);
		 System.out.println(i2);
		 System.out.println(i3);
		 //문자열과 사전순서로 비교해서 같으면 0, 이전이면 음수 이후면 양수
		 
		 //String concat
		 s = "Hello";
		 s1 = s.concat(" World");
		 System.out.println(s1);
		 
		 //boolean contains
		 s = "abcedfg";
		 boolean b = s.contains("bc");
		 System.out.println(b);
		 
		 //boolean endsWith
		 String file = "Hello.txt";
		 b = file.endsWith("txt");
		 System.out.println(b);
		 
		 //boolean equals
		 s = "Hello";
		 b = s.equals("Hello");
		 boolean b2 = s.equals("hello");
		 System.out.println(b);
		 System.out.println(b2);
		 
		 //boolean equalsIgnoreCase : 대소문자 구분 없이!
		 s = "Hello";
		 b = s.equalsIgnoreCase("HELLO");
		 b2 = s.equalsIgnoreCase("heLLO");
		 System.out.println(b);
		 System.out.println(b2);
		 
		 //indexOf(ch) : 못찾으면 -1반환.
		 s = "Hello";
		 int idx1 = s.indexOf('o');
		 int idx2 = s.indexOf('k');
		 System.out.println(idx1);
		 System.out.println(idx2);
		 
		 //indexOf(ch, int) : 못찾으면 -1반환.
		 s = "Hello";
		 idx1 = s.indexOf('e',0);
		 idx2 = s.indexOf('e',2);
		 System.out.println(idx1);
		 System.out.println(idx2);
		 
		 //indexOf(str) : 못찾으면 -1반환.
		 s = "ABCDEFG";
		 int idx = s.indexOf("CD");
		 System.out.println(idx);
		 
		 //intern() 상수풀??
		 s = new String ("abc");
		 String s2 = new String("abc");
		 b = (s==s2);
		 b2 = s.equals(s2);
		 boolean b3 = (s.intern()==s2.intern());
		 System.out.println(b);
		 System.out.println(b2);
		 System.out.println(b3);
		 
		 //lastIndexOf(ch) 뒤에서부터 찾음.
		 s = "java.lang.Object";
		 idx1 = s.lastIndexOf('.');
		 idx2 = s.indexOf('.');
		 System.out.println(idx1);
		 System.out.println(idx2);
		 
		 //lastIndexOf(str)
		 s= "java.lang.java";
		 idx1 = s.lastIndexOf("java");
		 idx2 = s.indexOf("java");
		 System.out.println(idx1);
		 System.out.println(idx2);
		 
		 //int length()
		 s = "Hello";
		 int length = s.length();
		 System.out.println(length);
		 
		 //replace(ch, ch)
		 s = "Hello";
		 s1 = s.replace('H','C');
		 System.out.println(s1);
		 
		 //replace(str,str)
		 s = "Hellollo";
		 s1 = s.replace("ll","LL");
		 System.out.println(s1);
		 
		 //replaceAll
		 String ab = "AABBAABB";
		 String r = ab.replaceAll("BB","bb");
		 System.out.println(r);

		 //replaceFirst
		 ab = "AABBAABB";
		 r = ab.replaceFirst("BB","bb");
		 System.out.println(r);
		 
		 //split : 잘라서 배열에 담기.
		 String animals = "dog,cat,bear";
		 String[] arr = animals.split(",");
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 
		 //split(  , int ) : 지정된 수로 자른다. 수만큼의 배열길이.
		 animals = "dog,cat,bear";
		 arr = animals.split(",",2);
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 
		 //startsWith
		 s = "java.lang.Object";
		 b = s.startsWith("java");
		 b2 = s.startsWith("lang");
		 System.out.println(b);
		 System.out.println(b2);
		 
		 //substring(int), substring(int, int)
		 s = "java.lang.Object";
		 String c11 = s.substring(10);
		 String p11 = s.substring(5,9);
		 System.out.println(c11);
		 System.out.println(p11);
		 
		 //toLowerCase()
		 s = "Hello";
		 s1 = s.toLowerCase();
		 System.out.println(s1);
		 
		 //toString()
		 s = "Hello";
		 s1 = s.toString();
		 System.out.println(s1);
		 
		 //toUpperCase()
		 s = "Hello";
		 s1 = s.toUpperCase();
		 System.out.println(s1);
		 
		 //trim
		 s = "      Hello World  ";
		 s1 = s.trim();
		 System.out.println(s1);
		 
		 //static String valueOf(boolean b)
		//static String valueOf(char c)
		//static String valueOf(int i)
		//static String valueOf(long l)
		//static String valueOf(float f)
		//static String valueOf(double d)
		//static String valueOf(Object o)
		 
		 String b1 = String.valueOf(true);
		 String c111 = String.valueOf('a');
		 String i1 = String.valueOf(100);
		 String l = String.valueOf(100L);
		 String f = String.valueOf(10f);
		 String d = String.valueOf(10.0);
		 java.util.Date dd = new java.util.Date();
		 String date = String.valueOf(dd);
		 
		 System.out.println(b1);
		 System.out.println(c111);
		 System.out.println(i1);
		 System.out.println(l);
		 System.out.println(f);
		 System.out.println(d);
		 System.out.println(date);
		 
	
	
	}

}
