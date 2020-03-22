/*   
	Name 	: Andi Muhammad Ridhal Alfaridzi
	Stambuk : 13020180005
	Class 	: A1 Engineering Informatic
	Date	: Monday/ 17 March 04.42
*/

public class Biodata {
// Program Pertama (Membuat Class)

	Integer nim;
	String  nama;
	String jurusan;
	String fakultas;
	// Menginput variabel & tipedata

	public Biodata() {
	}
	
	public Biodata (Integer nim, String nama, String  jurusan, String fakultas){
		this.nim= nim;
		this.nama = nama;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}
	// Mengeksekusi didalam class Biodata Biodata

	public void tampilData() {
		System.out.println("---> Nim = " + nim);
		System.out.println("---> Nama = " + nama);
		System.out.println("---> Jurusan =  " + jurusan);
		System.out.println("---> Fakultas = " + fakultas);
	// Menampilkan isi dari tampilData dengan input Nim,Nama,Jurusan,Fakultas.
	}
}