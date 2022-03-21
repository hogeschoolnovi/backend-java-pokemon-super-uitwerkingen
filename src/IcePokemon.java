public abstract class IcePokemon extends Pokemon{


    public IcePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats ice-" + super.getFood() );
    }

    public abstract void auroraBeam();

    public abstract void avalanche();

    public abstract void freezeShock();

    public abstract void blizzard();
}
