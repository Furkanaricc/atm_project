
public class Main {

	public static void main(String[] args) {
		
		Atm atm =new Atm ();
		
		Hesap hesap=new Hesap("HaticeYanak","123456",50000);
		
		
		atm.calis(hesap);
		
		System.out.println("Programdan çıkılıyor. Bizi tercih ettiğiniz için teşekkürler...");
	}

}
