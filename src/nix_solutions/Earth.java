package nix_solutions;

public class Earth extends Planet implements Planeta{

    public Earth() {
        super(365, "Земля");
    }


    @Override
    public void gravitation() {
        System.out.println("Ускорение свободного падения на Земле составляет 9,8 м/с");
    }



}
