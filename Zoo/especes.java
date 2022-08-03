public class especes {
private String nom;
private String cri; 

public especes(String sonnom, String soncri) {
//constructeur
nom=sonnom;
cri=soncri;
}

public String getnom() {
//retourne le nom de l’espèce.
return nom;
}

public String getcri() {
//retourne le cri de l'animal
return cri;

}
}