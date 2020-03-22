/*   
	Name 	: Andi Muhammad Ridhal Alfaridzi
	Stambuk : 13020180005
	Class 	: A1 Engineering Informatic
	Date	: Monday/ 17 March 04.42
*/

public class KonversiWaktu {
	int a1, a2, b1, b2, c1, c2; // Menginput total TampilWaktu(Jam:Menit:Detik) [Totaldetik,DetikSekarang,TotalMenit,MenitSekarang,TotalJam,JamSekarang] 
	
	public KonversiWaktu() {
		a1 = 1203183086; // 1.Masukkan total detik
		a2 = a1%60; // 2. Hitung detikSekarang = totalDetik %60
		b1 = a1/60; // 3. Hitung totalMenit = totalDetik / 60
		b2 = b1%60; // 4. Hitung menitSekarang = totalMenit%60
		c1 = b1/60; // 5. Hitung totalJam = totalMenit / 60
		c2 = c1%24; // 6. Hitung jamSekarang = totalJam % 24 
		
	}
	
	public static void main(String[] args){
		KonversiWaktu KW = new KonversiWaktu();
		System.out.println((KW.c2) + "=" + (KW.b2) + "=" + (KW.a2)); // 7.Tampil waktu (Jam:Menit:Detik)
	}
}