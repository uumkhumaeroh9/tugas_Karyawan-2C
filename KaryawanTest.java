public class KaryawanTest{
	public static void main(String[] args){
		System.out.println("Macam - macam gaji karyawan perusahaan XYZ");
		System.out.println(" ");
		Designer designer1 = new Designer();
		designer1.setNama("Najwah");
		designer1.setAlamat("Karangampel");
		designer1.setGaji(70);

		System.out.println(" ");
		Programmer programmer1 = new Programmer();
		programmer1.setNama("Rizki");
		programmer1.setAlamat("Jakarta");
		programmer1.setGaji(90);

		System.out.println(" ");
		Pm pm1 = new Pm();
		pm1.setNama("Uum Khumaeroh");
		pm1.setAlamat("Indramayu");
		pm1.setGaji(100);

	}
}