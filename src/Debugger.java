public class Debugger {
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */


    void main() {

        int a = 7, b = 42;

        //Tilføjet en lokal variabel som hedder "smaller"
        int smaller = minimum(a,b);

        if (smaller == a) {

            //Ændret string fra at sige "a" til at bruge en variabel som viser tallet
            System.out.println(smaller + " is the smallest!");

        }

    }

    //Ændret fra void til int
    int minimum(int a, int b) {

        //Ændret fra curly brackets til normale parenteser
        if (a < b) {

            //Indsat return i if statementet
            int smaller = a;
            return smaller;

        } else {

            //Indsat return i if statementet
            int smaller = b;
            return smaller;

        }

        //Fjernet return fra denne linje
    }
}
