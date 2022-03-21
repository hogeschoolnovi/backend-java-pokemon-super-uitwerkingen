public class Main {

    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("pikachu", 5, 200, "pokebrocks","pica pica");
        System.out.println(pikachu.getName() + " eats " + pikachu.getFood());
        pikachu.eats();
        pikachu.speaks();
        pikachu.thunder();
        pikachu.thunderPunch();
        pikachu.electroBall();
        pikachu.voltTackle();

        GrassPokemon venusaur = new GrassPokemon("Venusaur", 17, 250 , "pokeflakes", "Veeeenuuusssaur");
        venusaur.speaks();
        venusaur.leafStorm();
    }

}
