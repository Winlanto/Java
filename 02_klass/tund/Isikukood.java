public class Isikukood{
	private String kood;
	public Isikukood(String uusKood){kood=uusKood;}
	public String toString(){return kood;}
	public String sugu(){
		return (Integer.parseInt(kood.substring(0,1)) % 2 == 0 ? "naine":"mees");
	}
	public String aastakakstahte(){
//		if (kood.substring(0, 1).equals("1") || kood.substring(0, 1).equals("2")){return "18";}
//		if (kood.substring(0, 1).equals("3") || kood.substring(0, 1).equals("4")){return "19";}
//		if (kood.substring(0, 1).equals("5") || kood.substring(0, 1).equals("6")){return "20";}
		return String.valueOf(18+(Integer.parseInt(kood.substring(0,1))-1)/2);
	}

	public String synniaasta(){
		return (aastakakstahte() + kood.substring(1, 3));
	}

	public String synnikuu(){
		String[] kuud = {"Jaanuar", "Veebruar", "M2rts", "Aprill", "Mai", "Juuni", "Juuli", "August", "September", "Oktoober", "November", "Detsember"};
		return kuud[Integer.parseInt(kood.substring(3,5))-1];
	}

	public String synnipaev(){
		return (kood.substring(5,7));
	}

	public String jarjekord(){
		return (kood.substring(7,10));
	}
}