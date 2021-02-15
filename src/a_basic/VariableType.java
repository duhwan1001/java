package a_basic;

public class VariableType {
	public static void main(String[] args) {
		
		/*
		º¯¼öÀÇ Å¸ÀÔ
		
		1. ±âº»ÇüÅ¸ÀÔ(primitive type)
		  - boolean, char, byte, short, int, long, float, double
		  
		2. ÂüÁ¶ÇüÅ¸ÀÔ(reference type)
		
		
		3. ±âº»Çü Å¸ÀÔÀÇ Á¾·ù
		  - ³í¸®Çü : true,falseÁß ÇÏ³ªÀÇ °ªÀ» °¡Áø´Ù. ex) boolean
		  - ¹®ÀÚÇü : ¹®ÀÚ ÇÏ³ª¸¦ ÀúÀåÇÏ´Âµ¥ »ç¿ëµÈ´Ù. ex) char
		  - Á¤¼öÇü : Á¤¼ö°ªÀ» ÀúÀåÇÏ´Âµ¥ »ç¿ëµÈ´Ù. ex) byte, short, int, long
		  - ½Ç¼öÇü : ½Ç¼ö°ªÀ» ÀúÀåÇÏ´Âµ¥ »ç¿ëµÈ´Ù. ex) float, double
		  
		4. ±âº»Çü Å¸ÀÔÀÇ Å©±â
		  - 1byte : boolean, byte
		  - 2byte : char, short
		  - 4byte : int, float
		  - 8byte : long, double
		
		5. ³í¸®Çü - boolean(±âº»°ª - false)
		  - booleanÇü º¯¼ö¿¡´Â true¿Í falseÁß ÇÏ³ªÀÇ °ªÀ» ÀúÀåÇÒ ¼ö ÀÖ´Ù.
		  - booleanÇü º¯¼ö´Â ´ë´ä, ½ºÀ§Ä¡µîÀÇ ³í¸®±¸Çö¿¡ ÁÖ·Î »ç¿ëµÈ´Ù.
		  - µ¥ÀÌÅÍ¸¦ ´Ù·ç´Â ÃÖ¼Ò´ÜÀ§°¡ 1byteÀÓÀ¸·Î 1byteÀÇ Å©±â¸¦ °¡Áø´Ù.
		*/
		
		//º¯¼ö power¸¦ ¼±¾ðÇÏ°í falseÀÇ °ªÀ¸·Î ÃÊ±âÈ­ ÇÏ¿©¶ó.
		// º¯¼öÅ¸ÀÔ º¯¼ö¸í = °ª;
		boolean power = false;
		//powerÀÇ °ªÀ» true·Î º¯°æÇÏ¿©¶ó.
		power = true;
		
		/*
		6. ¹®ÀÚÇü - char
		  - ¹®ÀÚÇÏ³ª¸¦ ÀúÀåÇÏ´Â »ç¿ëÇÑ´Ù.
		  - java´Â Unicode¹®ÀÚ Ã¼°è¸¦ ÇÏ¿ëÇÏ±â ¶§¹®¿¡ 2byteÀÇ Å©±â¸¦ °¡Áø´Ù.
		  - '¹®' 
		*/
		// º¯¼ö ch¸¦ ¼±¾ðÇÏ°í ¿øÇÏ´Â ¹®ÀÚ ÇÏ³ª·Î ÃÊ±âÈ­ ÇÏ¼¼¿ä
		char ch = '\n';
		//chÀÇ °ªÀ» ´ë¹®ÀÚ 'A'·Î º¯°æÇØ ÁÖ¼¼¿ä
		ch = 'A';
		char ch2 = '\u0041';
		System.out.println(ch2);
		
		char ch3 = 65;
		
		/*
		7. Á¤¼öÇü - byte, short, int, long
		  - ´ëÇ¥ÀÚ·áÇüÀº intÀÌ´Ù.
		  - º¯¼ö¿¡ ÀúÀåÇÏ·Á´Â Á¤¼ö°ªÀÇ ¹üÀ§¿¡ µû¶ó 4°¡Áö Á¤¼öÇüÁß¿¡ ÇÏ³ª¸¦ ¼±ÅÃÇÑ´Ù.
		*/
		//1. byteÇü º¯¼ö b1¿¡ 30ÀÇ °ªÀ» ÀúÀåÇØÁÖ¼¼¿ä
		byte b1 = 30;
		//2. shortÇü º¯¼ö s1¿¡ 40000À» ÀúÀåÇØÁÖ¼¼¿ä
		short s1 = 30000;
		//3. longÇü º¯¼ö l1¿¡ 50¾ïÀ» ÀúÀåÇØÁÖ¼¼¿ä
		long l1 = 5000000000L;
		
		/*
		8. ½Ç¼öÇü  - float, double
		  - ½Ç¼öÇü °ªÀ» ÀúÀåÇÏ´Âµ¥ »ç¿ëµÈ´Ù.
		  - ´ëÇ¥ÀÚ·áÇüÀº doubleÀÌ´Ù.
		  - float : 1+8+23
		  - double: 1+11+52
		  - ½Ç¼öÇüÁß ÀÚ·áÇüÀ» ¼±ÅÃÇÒ¶§´Â °ªÀÇ ¹üÀ§»Ó¸¸ ¾Æ´Ï¶ó Á¤¹Ðµµµµ Áß¿äÇÑ ¿ä¼Ò°¡ µÈ´Ù.
		
		*/
		//1. floatÇü º¯¼ö f1¿¡  3.14159274894°ªÀ» ÀúÀåÇÏ¿©¶ó.
		float f1 = 3.14159274894F;
		System.out.println(f1);
		//2. doubleÇüº¯¼ö d1¿¡ 3.14159274894°ªÀ» ÀúÀåÇÏ¿©¶ó.
		double d1 = 3.14159274894;
		System.out.println(d1);
		
		/*
		9. overflow
		  - º¯¼ö ÀÚ½ÅÀÌ ÀúÀåÇÒ ¼ö ÀÖ´Â ÃÖ´ë°ªÀ» ³Ñ¾î ¼¹À»¶§ ÃÖ¼Ò°ªÀ¸·Î µ¹¾Æ°¡´Â Çö»ó
		*/
		//1. byteÇü º¯¼ö b2¿¡ 126ÀÇ °ªÀ» ÀúÀåÇØÁÖ¼¼¿ä
		byte b2 = 126;
		b2++;
		b2++;
		System.out.println(b2);
		
		/*
		10. Ä³½ºÆÃ(casting)
		*/
		byte b4 = 35;
		char c4 = 'ÆR';
		short s4 = 56;
		int i4 = 500000;
		
		//1. i4ÀÇ °ªÀ» shortÇüº¯¼ö s5¿¡ ÀúÀåÇØÁÖ¼¼¿ä
		short s5 = (short)i4;
		System.out.println(s5);
		
		//2. c4ÀÇ °ªÀ» intÇüº¯¼ö i5¿¡ ÀúÀåÇØÁÖ¼¼¿ä (¹®ÀÚ°¡ °¡Áö°í ÀÖ´Â 10Áø¼ö °ªÀ» Ãëµæ)
		int i5 = (int)c4;
		System.out.println(i5);
		
		/*
		11. String
		  - ¹®ÀÚ¿­À» ´Ù·ç±â À§ÇØ »ç¿ëÇÑ´Ù. 
		*/
		String name = "================\n------------";
		System.out.println(name);
		
		char c6 = 'A';
		
		System.out.println(c6+3);
		
		System.out.println("4"+3);// String + int -> String + String -> "4" + "3"-> "43"
		
		System.out.println(" " + true);
	}
}
