public class FirePokemon extends Pokemon{

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public void eats(){
        System.out.println(super.getName() + " eats fire-" + super.getFood());
    }


    public void inferno(){
        System.out.println();
    }

    public void pyroBall(){
        System.out.println();
    }

    public void fireLash(){
        System.out.println();
    }

    public void flameThrower(){
        System.out.println();
    }
}
