import java.util.Scanner;

public class MasterMind {

	public static void main(String[] args) {
		int n=5;
		String AlphaNumericString = "abcdef";
		StringBuilder sb = new StringBuilder(n);
		
		for (int i = 0; i < n; i++) {
			int index = (int)(AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		
		String a = sb.toString();
		int p = 0;
		System.out.println("0 = juiste plaats, 1 = onjuiste plaats, 2 = komt niet voor");
		
		do {
			System.out.println("voer een 5 letters in met een a,b,c,d,e of f");
			p = 0;
			Scanner x = new Scanner(System.in);
			String b = x.nextLine();
			for(int i=0; i<a.length(); i++) {
				if(a.charAt(i)==b.charAt(i)) {
					System.out.print("0");
					p= p + 1;
				}else if(b.charAt(i)==a.charAt(0) || b.charAt(i)==a.charAt(1) || b.charAt(i)==a.charAt(2) || b.charAt(i)==a.charAt(3)|| b.charAt(i)==a.charAt(4)) {
					System.out.print("1");	
				} else {
					System.out.print("2");
				}
			}
			System.out.println("");

		}while(!(p==5));
		System.out.println("");
		System.out.println("Je hebt gewonnen");
	}

}
