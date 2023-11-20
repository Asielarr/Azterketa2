package Azterketa;

import java.util.Scanner;

public class Azterketa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int zenbakia = 0;
		int kontagailua = 0;
		int batazbeste = 0;
		do {
			zenbakia = sc.nextInt();
			kontagailua++;
			batazbeste= batazbeste+zenbakia;
						
		} while (zenbakia != 0);
		
		kontagailua--;
		batazbeste=batazbeste/kontagailua;
		System.out.println(batazbeste+" da zenbaki guztien batazbestekoa");

	}

}
