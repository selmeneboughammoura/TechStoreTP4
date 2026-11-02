package techstore;

public class Element {
    private Article article;
    private long quantite;
    public Element(Article article, long quantite) {
        this.article = article;
        setQuantite(quantite);
    }
    public Element(String nom, double prix, long quantite) {
        this.article = new Article(nom, prix);
        setQuantite(quantite);
    }
    public Article getArticle() {
        return article;
    }
    public long getQuantite() {
        return quantite;
    }
    public String getReferenceArticle() {
        return article.getReference();
    }
    public String getNomArticle() {
        return article.getNom();
    }
    public double getPrixArticle() {
        return article.getPrix();
    }
    public void setArticle(Article article) {
        this.article = article;
    }
    public void setQuantite(long quantite) {
        if (quantite < 0) {
            throw new IllegalArgumentException(
                    "La quantite ne peut pas etre negative");
        }
        this.quantite = quantite;
    }
    public void incrementerQuantite(long quantite) {
        if (quantite < 0) {
            throw new IllegalArgumentException(
                    "La quantite doit etre positive");
        }
        this.quantite += quantite;
    }
    public void decrementerQuantite(long quantite) {
        if (quantite < 0 || quantite > this.quantite) {
            throw new IllegalArgumentException(
                    "Quantite invalide");
        }
        this.quantite -= quantite;
    }
    public void modifier(String nom, double prix, long quantite) {
        this.article = new Article(nom, prix);
        setQuantite(quantite);
    }

    public boolean equals(String reference) {
        return article.getReference().equals(reference);
    }
    public boolean equals(Article article) {
        if (article == null) {
            return false;
        }
        return this.article.getReference()
                .equals(article.getReference());
    }
    @Override
    public String toString() {
        return "Element [article=" + article
                + ", quantite=" + quantite + "]";
    }
}