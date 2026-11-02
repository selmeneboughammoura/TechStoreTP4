package techstore;

public class Article {
    private String nom;
    private double prix;
    private int id;
    private String reference;
    private static int compteurId = 0;
    public Article(String nom, double prix) {
        this.id = ++compteurId;
        this.nom = nom;
        this.prix = prix;
        this.reference = genererReference(nom, id);
    }
    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    public int getId() {
        return id;
    }
    public String getReference() {
        return reference;
    }
    public void setNom(String nom) {
        this.nom = nom;
        this.reference = genererReference(nom, id);
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public void modifier(String nom) {
        setNom(nom);
    }
    public void modifier(String nom, double prix) {
        setNom(nom);
        setPrix(prix);
    }
    public static String genererReference(String nom, int id) {
        String reference = "";
        for (int i = 0; i < nom.length(); i += 5) {
            char c = nom.charAt(i);

            if (c != ' ') {
                reference = reference + c;
            }
        }
        return reference.toUpperCase() + id;
    }
    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom
                + ", reference=" + reference
                + ", prix=" + prix;
    }
}
