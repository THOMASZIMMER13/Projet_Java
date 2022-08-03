public class animal {
private String nom;
private int age;
private boolean vivant;
private especes especes;


public animal(String sonnom, especes sonespeces, int sonage){
//=> constructeur qui valorise le nom et l’espèce de l’animal et son age 
nom=sonnom;
 especes=sonespeces;
age=sonage;
vivant = true;
}


public animal(String sonnom, especes sonespeces){
//=> constructeur qui valorise le nom et l’espèce de l’animal
nom=sonnom;
especes=sonespeces;
}

public String getnom(){ 
//=> retourne le nom l’animal.
return nom;
}


public boolean estVivant(){ 
//=> indique si l’animal est vivant.
return vivant;
}

public especes getespece(){
//=> retourne l’objet Espece associé à l’animal.
return especes;
}

public String toString() {
//=> retourne le nom, le nom de l’espèce, le statut (vivant ou mort) ainsi que l’age 
String s;
s="le nom de l'animal est : "+nom+" cette espece a pour nom "+especes.getnom()+" cette espece a pour cri "+especes.getcri()+" son age est : "+age+" ans, vivant ou mort "+vivant;
return s;
}

public void vieillir(){
//=> fait vieillir l’animal d’un an s’il est vivant.
if (vivant == true) {
age=age+1;
}
else {
System.out.println("il est mort");
} }

public void mourir(){ 
//=> fait mourir l’animal s’il était vivant.
if (vivant == true) {
vivant=false;
}
}


public int getage(){ 
//=> retourne le l'age l’animal.
return age;
}



}