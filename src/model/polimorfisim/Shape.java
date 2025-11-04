package model.polimorfisim;

public interface Shape {
    double areaCalculate();

    default double volumeCalculate(){
        return areaCalculate();

    }

}
