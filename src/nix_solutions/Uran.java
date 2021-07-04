package nix_solutions;

public class Uran extends  Planet implements Planeta{

    public Uran() {
        super(24000, "Уран");


    }

    @Override
    public void gravitation() {
        System.out.println("Ускорение свободного падения на Уране составляет сколько-то м/с");
    }

}
