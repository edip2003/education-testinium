package model.Abstraction;

public abstract class Animal {
    protected String isim;

    public Animal(String isim) {
        this.isim = isim;
    }

    public abstract void voice();

     public void sleep(){
         System.out.println(isim+" sleeping...");

     }
}
