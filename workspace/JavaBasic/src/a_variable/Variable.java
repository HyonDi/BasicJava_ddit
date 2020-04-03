package a_variable;

public class Variable {
	
	public static void main(String[] args) {
		
		byte _byte; 
		char _char;
		double _double;
		float _float;
		long _long;
		int _int;
		short _short;
		boolean _boolean;
		
//		System.out.println(_byte); 而댄���� ���� 諛���. 臾몃��� ��由�.
//		蹂����� 媛��� ���ν��吏� ���쇰㈃ 蹂����� 媛��� 李몄“(蹂������� 媛��� 爰쇰�댁�ㅻ�� 寃�.)�� �� ����.
		
		//���ν���� 諛⑸�  : ���� �곗�곗�� �ъ��.
		
		_byte = 127;
		//1鍮��멸� 0,1 ��媛�吏��쇨���怨�, 8鍮��멸� 1諛��댄��.
		//寃쎌�곗�� ���� 2�� ���� �댁�� 256�닿� ����, ����, 0�쇰� ����硫� -128~127 源�吏� 媛��ν����.
		_short = 30000;
		_int = 20;
		_long = 900L; //long ��誘몄�� : L / L�� 遺��ъ�쇰� ������ 濡깆�대����. ��臾몄���� ��愿���吏�留� �レ�� 1怨� 鍮��룻�댁�� �룰�由�.
		_float = 3.14f; //float ��誘몄�� : f / f 媛� 遺�吏����쇰㈃ ��釉�������.
		_double = 3.14; // d �쇰�� ��誘몄�ш� ��吏�留� ���� 媛���. 蹂댄�듭�� ���듯����.
//		_/*char = '媛�';*/ //臾몄��瑜� ������������ �곗�댄��濡� 臾띠�댁�� �����댁���.臾몄�� ����留� ���� 媛���. �깊����.
		_boolean = true; // ��媛�吏� 媛��� �ｌ�� �� ����. true, false.
		//珥�湲고�� : 蹂����� 泥����쇰� 媛��� ���ν���� 寃�.
		
		System.out.println(_int);
		//而⑦�몃· ����11:�ㅽ�� 
		// 洹몃�� f11 �� ��踰�洹몃え��濡� ��濡�洹몃�� �ㅽ��.
		
		_int = 30;
		//媛� ���댁�곌린!
		System.out.println(_int);
		_int = 30 + 40;
		System.out.println(_int);
		//�곗�곗�� 紐⑤�� �ㅽ�� �� 寃곌낵瑜� �살�� ���ν����. 
		_int = _short;
		System.out.println(_int);
		
		
		//������ 珥�湲고���� 蹂����� ��濡��� 媛��� ���ν��怨� 異��ν�대��.
		_boolean = null == "";
//		_char = '��';
		_byte = 120;//-128~127
		_short = 32000;//-32768~32767
		_int = 200;//21��
		_long = 999L;//...
		_float = 3.4f;
		_double = 1.8;
		
		System.out.println(_boolean);
//		System.out.println(_char);
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		
				
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		

		_boolean = false;
		_char = '\u0000';//' '
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0f;
		_double = 0;
		_String = null;
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte);
		
		_double = -1.78567567585;
		_int = (int)_double;
		System.out.println(_int);
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100;
		System.out.println( );
		
		System.out.println('1' + '2');
		
	}
	
}















