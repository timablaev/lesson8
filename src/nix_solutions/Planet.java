package nix_solutions;

public abstract class Planet {
    int daysOfYear;
    String name;
  

    public Planet(int daysOfYear, String name){
        this.daysOfYear = daysOfYear;
        this.name = name;
    }



    public int Planet(int daysOfYear){
        return daysOfYear;
    }

    public String Planet (String name){
        return name;
    }



   


}
