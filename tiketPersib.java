///*String jam, String Tribun, int hargaTiket, int banyakTiket, int no, int kode, String namaStadion, String tanggal, String laga, String umur, String seat*/
	//tiketPersib as = new tiketPersib("15:10","Timur", 75000 , 2 , 033 , 1933673393 ,"Si Jalak Harupat" ,"14 Maret 2018" ,"Persib Bandung Vs Persija" ,"Semua Kalangan","G33, G34");

public class tiketPersib {
	private int hargaTiket, banyakTiket, no, kode;
	private String tribun, jam, namaStadion, tanggal, laga,umur, seat;
	public tiketPersib(String jam, String tribun, int hargaTiket, int banyakTiket, int no, int kode, String namaStadion, String tanggal, String laga, String umur, String seat){
		
		this.no = no;
		this.namaStadion = namaStadion;
		this.tanggal = tanggal;
		this.jam = jam;
		this.laga = laga;
		this.umur = umur;
		this.seat = seat;
		this.tribun = tribun;
		this.hargaTiket = hargaTiket;
		this.banyakTiket = banyakTiket;
		this.kode = kode;		
	}
	public int No(){
		return no;
	}
	public String NamaStadion(){
		return namaStadion;
	}
	public String Tanggal(){
		return tanggal;
	}
	public String Jam(){
		return jam;
	}
	public String Laga(){
		return laga;
	}
	public String Umur(){
		return umur;
	}
	public String Seat(){
		return seat;
	}
	public String Tribun(){
		return tribun;
	}
	public int HargaTiket(){
		return hargaTiket;
	}
	public int BanyakTiket(){
		return banyakTiket;
	}
	public int Kode(){
		return kode;
	}

}