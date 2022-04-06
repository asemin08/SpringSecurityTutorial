package eu.ensup.demospringsecurity.domaine;


public class Etudiant {

    private Integer id;
    private String nom;

    public Etudiant(Integer id, String nom) {
        this.id  = id;
        this.nom = nom;
    }

    public Etudiant() {
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
