/**
 * Created by SarahVillareal on 5/18/17.
 */
public class Generator {
    public static void main(String[] args) {
//       String adjArray = new String() [10];
//        String nounArray= new String[10];
        String[] adj = {"friendly", "beautiful", "smart", "kind", "gentle",
                "tough", "rugged", "strong", "handsome", "active"};
        String[] noun = {"Sarah", "Susie", "Jessica", "Amanda", "Heather",
                "John", "Adam", "Ryan", "Jo", "Steven"};
        System.out.println(generateNames(noun, adj));
    }

    public static String generateNames(String[] noun, String[] adj){
        int rnd = (int) (Math.random() * (noun.length));
        int rnd2 = (int) (Math.random() * (adj.length));

        return noun [rnd] + " " + adj[rnd2];
    }
}

