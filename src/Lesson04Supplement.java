public class Lesson04Supplement
{
	public static void main(String[] args)
	{
		/* Declaration & Initialization */
		char[] ascii = { 0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514 };
		System.out.printf("0x221A %c%n", ascii[0]);
		System.out.printf("0x00B2 %c%n", ascii[1]);
		System.out.printf("0x2502 %c%n", ascii[2]);
		System.out.printf("0x250C %c%n", ascii[3]);
		System.out.printf("0x2500 %c%n", ascii[4]);
		System.out.printf("0x2510 %c%n", ascii[5]);
		System.out.printf("0x2518 %c%n", ascii[6]);
		System.out.printf("0x2514 %c%n", ascii[7]);
		
		double nilai = 16, akarPangkat2 = 0;
		
		akarPangkat2 = Math.sqrt(nilai);
		System.out.printf("%nAkar pangkat 2 dari %.0f adalah %.0f%n", nilai, akarPangkat2);
		
		try {
			Runtime.getRuntime().exec("cls");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}