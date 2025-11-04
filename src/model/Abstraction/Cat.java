package model.Abstraction;

public class Cat extends Animal{

    public Cat(String isim) {
        super(isim);
    }

    @Override
    public void voice() {
        System.out.println(isim+" Miyavlıyor...");
    }
}
