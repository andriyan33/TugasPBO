public class nyetadion{
	public static void main (String [] args){
	/*String jam, String Tribun, int hargaTiket, int banyakTiket, int no, int kode, String namaStadion, String tanggal, String laga, String umur, String seat*/
	tiketPersib as = new tiketPersib("15:10","Timur", 75000 , 2 , 033 , 1933673393 ,"Si Jalak Harupat" ,"14 Maret 2018" ,"Persib Bandung Vs Persija" ,"Semua Kalangan","G33, G34");
	System.out.println("============================");
	System.out.println("--------Tiket Persib--------");
	System.out.println("============================");
	System.out.println("No Tiket		: "+as.No());
	System.out.println("Nama Stadion	\t: "+as.NamaStadion());
	System.out.println("Tanggal			: "+as.Tanggal());
	System.out.println("Jam			: "+as.Jam());
	System.out.println("Laga			: "+as.Laga());
	System.out.println("Umur			: "+as.Umur());
	System.out.println("Seat			: "+as.Seat());
	System.out.println("Tribun			: "+as.Tribun());
	System.out.println("Banyak Tiket		: "+as.BanyakTiket());
	System.out.println("Harga Tiket		: "+as.HargaTiket());
	System.out.println("Kode Tiket		: "+as.Kode());
	System.out.println("============================");
	}

}

//Tiket Persib
//No Tiket : string
//Nama Stadion : string
//Tanggal : string
//Jam : int
//Laga: string
//Umur: string
//Seat : string
//Tribun : string
//Harga tiket : int
//Banyak tiket : int
//Kode Tiket : string
