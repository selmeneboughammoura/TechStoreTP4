package techstore;

public class Article {

    // Attributs privés
    private String nom;
    private double prix;
    private int id;
    private String reference;

    // Compteur pour générer des identifiants uniques
    private static int compteurId = 0;

    // Constructeur
    public Article(String nom, double prix) {
        this.id = ++compteurId;
        this.nom = nom;
        this.prix = prix;
        this.reference = genererReference(nom, id);
    }

    // Getters
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

    // Setters
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

    // Modifier le nom
    public void modifier(String nom) {
        setNom(nom);
    }

    // Modifier le nom et le prix
    public void modifier(String nom, double prix) {
        setNom(nom);
        setPrix(prix);
    }

    // Générer la référence
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

    // Afficher les informations
    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom
                + ", reference=" + reference
                + ", prix=" + prix;
    }
}