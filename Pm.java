public class Pm extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Project Manager memperoleh gaji Sebesar = "+gaji);
		}else{
			System.out.println("Maaf gaji anda telah melebihi batas ");
		}
	}
}