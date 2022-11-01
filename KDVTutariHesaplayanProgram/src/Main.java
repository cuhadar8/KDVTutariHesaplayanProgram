import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ürün ücretini giriniz: ");
		double miktar = scanner.nextDouble();
		double yuksekKdv = 0.18;
		double dusukKdv = 0.08;
		

		if (miktar > 0 && miktar <= 1000) {
			System.out.println("KDV'siz fiyat: " + miktar);

			System.out.println("KDV oranı: " + yuksekKdv);

			double kdvTutari = miktar * yuksekKdv;
			double toplam = miktar + kdvTutari;

			System.out.println("KDV'li fiyat: " + toplam);
			System.out.println("KDV tutarı: " + kdvTutari);

		}

		else {
			System.out.println("KDV'siz fiyat: " + miktar);

			System.out.println("KDV oranı: " + dusukKdv);

			double kdvTutari = miktar * dusukKdv;
			double toplam = miktar + kdvTutari;

			System.out.println("KDV'li fiyat: " + toplam);
			System.out.println("KDV tutarı: " + kdvTutari);
		}

	}

}
