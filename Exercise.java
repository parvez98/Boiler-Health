package edu.purdue.parvezs.boileruphealth;

public class Exercise {

    private int id;
    private String name;
    private int count;
    private String benefits;
    private double random;
    private int image;

    public Exercise(int id, String name, int count, String benefits, double random, int image){
        this.id = id;
        this.name = name;
        this.count = count;
        this.benefits = benefits;
        this.random = random;
        this.image = image;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getCount(){
        return count;
    }

    public String getBenefits(){
        return benefits;
    }
    public double getRandom(){
        return random;
    }

    public int getImage(){
        return image;
    }
}
