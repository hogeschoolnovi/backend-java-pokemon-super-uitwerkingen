public class WaterPokemon extends Pokemon{

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats water-" + super.getFood());
    }

    public void surf(){
        System.out.println();
    }

    public void hydroPump(){
        System.out.println();
    }

    public void hydroCanon(){
        System.out.println();
    }

    public void rainDance(){
        System.out.println();
    }
}
