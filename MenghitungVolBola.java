// Natasha Ursipuny
// 51019017

import java.util.Scanner;

class MenghitungVolBola {
	public static void main(String args[]) {
	Double  hasil;
	int jari;
	
	
	RumusBola rumus = new RumusBola();
	
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Aplikasi polimorphisme dan inheritance untuk mencari Volume Bola");
	System.out.println();
	System.out.print("Masukkan nilai jari-jari / r: ");
	jari = input.nextInt();
	System.out.println();
		
		
	rumus.radius(jari);

	rumus.tampil();
	
	rumus.hitung(jari);
	
		
	}	
}