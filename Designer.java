public class Designer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Designer memperoleh gaji sebesar = "+gaji);
		}else{
			System.out.println("Maaf gaji anda telah melebihi batas");
		}
	}
}