package nix_solutions;

public class Saturn extends  Planet implements Planeta{

    public Saturn() {
        super(12000, "Сатурн");
    }

    @Override
    public void gravitation() {
        System.out.println("Ускорение свободного падения на Саиурне составляет сколько-то м/с");
    }

}
