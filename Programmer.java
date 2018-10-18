public class Programmer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=90){
			System.out.println("Programmer memperoleh gaji sebesar = "+gaji);
		}else {
			System.out.println("Maaf gaji anda telah melebihi batas");
		}
	}
}