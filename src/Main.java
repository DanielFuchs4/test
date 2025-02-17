import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//ukol 1
/*

        String[] jmena = {"Oliver", "Vasek", "Kuba", "Misa", "Pavel"};

        for (int i = 0; i < jmena.length; i++) {
            System.out.print(jmena[i]+"-");
        }
        System.out.println();

//ukol 2

        System.out.println("Jak velke pole chces?");
        int n = sc.nextInt();

        int[] znamky = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Zadej "+(i+1)+". znamku: ");
            znamky[i] = sc.nextInt();
        }
        System.out.println("Jakou znaku chces videt?");
        int v = sc.nextInt();
        if (v > n){
            System.out.println("POZOR!!! tady nic není");
        }
        else {
        System.out.println(v+". znamka je: "+znamky[v-1]);
        }
*/
//ukol 3

        Kamarad[] kamarad = new Kamarad[3];

        kamarad[0] = new Kamarad("Adam", 2005);
        kamarad[1] = new Kamarad("Bob", 2006);
        kamarad[2] = new Kamarad("David", 2007);

        int kamaradIndex = 2025-kamarad[0].getRokNarozeni();
        int nejstarsi = 0;

        if (kamaradIndex < kamarad[1].getRokNarozeni()) {
            nejstarsi = 1;
        }
        else if (kamaradIndex < kamarad[2].getRokNarozeni()) {
            nejstarsi = 2;
        }
        System.out.println("Nejstarsi kamarad je: "+kamarad[nejstarsi].getJmeno()+" a je mu: "+(2025-kamarad[nejstarsi].getRokNarozeni()));

    }


}

