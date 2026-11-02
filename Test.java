package techstore;

public class Test {
	Adresse adresse;
	Personne personne;
	public static void main(String[] args) {
		Adresse A1=new Adresse("Monastir",5000);
		Adresse A2=new Adresse("Ben Arous",1133);
		Adresse A3=new Adresse("Ben Arous",1145);
		System.out.println("L'adresse a1:"+A1);
		System.out.println("L'adresse a2:"+A2);
		System.out.println("L'adresse a3:"+A3);
		Personne P1=new Personne("01111111","Kbayer","Jasser","Jendouba",8160);
		Personne P2=new Personne("02222222","Smida","Ghayth","Monastir",5000);
		System.out.println("La personne p1"+P1);
		System.out.println("La personne p2"+P2);
		P1.setNom("bennawara");
		P1.setPrenom("Anwar");
		P1.setAdresse(A1);
		System.out.println("La personne p1"+P1);
	}
}
