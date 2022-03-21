public class GrassPokemon extends Pokemon{

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats grass-" + super.getFood());
    }

    public void leafStorm(){
        System.out.println();
    }

    public void solarBeam(){
        System.out.println();
    }

    public void leechSeed(){
        System.out.println();
    }

    public void leaveBlade(){
        System.out.println();
    }
}
