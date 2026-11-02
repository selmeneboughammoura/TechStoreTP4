package techstore;

public class Adresse {
		private String gouvernat;
		private int codePostal;	
		public Adresse (String gouv, int codeP) {
			this.gouvernat = gouv ;
			this.codePostal=codeP;
		}
	public String getgouvernat() {
		return gouvernat;
	}
	public void setgouvernat (String gouv) {
		this.gouvernat=gouv;
	}
	public int getcodePostal () {
		return codePostal;
	}
	public void setcodePostal(int codeP) {
		this.codePostal=codeP;
	}
	public String toString() {
		return "Adresse [gouvernat="+this.gouvernat+",code postale ="+this.codePostal+"]";
	}

}
