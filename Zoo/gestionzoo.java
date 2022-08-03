public class gestionzoo {
public static void main (String [] args) {

especes lion= new especes ("lion", "rugissement");
especes cheval= new especes ("cheval", "hennit");
especes oiseaux= new especes ("oiseaux", "siflement");

System.out.println("mon animal est : "+lion.getnom()+" est son cri est : "+lion.getcri());
System.out.println("mon animal est : "+oiseaux.getnom()+" est son cri est : "+oiseaux.getcri());
System.out.println("mon animal est : "+cheval.getnom()+" est son cri est : "+cheval.getcri());

animal simba= new animal ("simba", lion, 12);
animal titi= new animal ("titi", oiseaux, 3);
animal toto= new animal ("toto", oiseaux, 4);


//veillir un animal d'un ans 
simba.vieillir();
System.out.println("mon animal est : "+simba.getnom()+" est son age est de : "+simba.getage()+" ans");


//veillir un animal de 4 ans
System.out.println("mon animal est : "+titi.getnom()+" est son age est de : "+titi.getage()+" ans");
for (int i=0; i<4; i++) {
titi.vieillir();
}

System.out.println("mon animal est : "+titi.getnom()+" est son age est de : "+titi.getage()+" ans");

//mort d'un animal
toto.mourir();
System.out.println("l'animal"+toto.getnom()+" est "+toto.estVivant()+" il est mort");

//afficher les animaux à l’écran (en utilisant la méthode « donnerInfos »)
System.out.println( titi.toString());

} }