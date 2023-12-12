package local.caparrella;

public class Main {
    public static void main(String[] args) {
        // Crea un array d'objectes Persona
        Persona[] persones = new Persona[3];

        // Inicialitza els objectes a l'array
        persones[0] = new Persona("Júlia", 19);
        persones[1] = new Persona("Júlia", 19);
        persones[1] = new Persona("Júlia", 19);
      

        // Accedeix als objectes a l'array
        for (Persona persona : persones) {
            System.out.println("Nom: " + persona.getNom() + ", Edat: " + persona.getEdat());
        }
    }
}
