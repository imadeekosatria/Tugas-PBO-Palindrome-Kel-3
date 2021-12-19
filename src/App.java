import java.util.Scanner;

public class App {
	public static void main (String[] args) {
		boolean valid, lagi = true;
		Scanner scan;
		String kata;
		
		do {
			System.out.printf("Masukkan kata : ");
			scan = new Scanner(System.in);
			kata = scan.nextLine();
			new KataPalindrom(kata);
			new KataKerja(kata);

			
			System.out.println();
	
			/* Input lagi ?
			 * */
			do {		
				System.out.printf("Coba lagi ? (True/False) ");
				scan = new Scanner(System.in);
				if (!scan.hasNextBoolean()) {
					System.out.printf("Ketikan \"True\" untuk input lagi, atau \"False\" untuk keluar\n");
					valid = false;
				} else {
					lagi = scan.nextBoolean();
					valid = true;
				};
			} while (!valid);
			System.out.println();
		
		} while (lagi);
		
		scan.close();
		
		
	};
		
};


