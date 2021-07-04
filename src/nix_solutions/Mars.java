package nix_solutions;

public class Mars extends Planet implements Planeta{

    public Mars() {
        super(687, "Марс");
    }

    @Override
    public void gravitation() {
        System.out.println("Ускорение свободного падения на Марсе составляет сколько-то м/с");
    }

}
