public class Karyawan{
	String nm;
	String almt;
	private int gaji;

	public void setGaji(int bayar){
		gaji=bayar;
	}

	public void setNama(String nm){
		System.out.println("Nama = "+nm);
	}

	public void setAlamat(String almt){
		System.out.println("Alamat = "+almt);
	}

	public int getGaji(){
		return this.gaji;
	}

	
}