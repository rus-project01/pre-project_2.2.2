package web.model;

public class Car {

    private String name;
    private String series;
    private int oldCar;

    public Car(String name, String series, int oldCar) {
        this.name = name;
        this.series = series;
        this.oldCar = oldCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getOldCar() {
        return oldCar;
    }

    public void setOldCar(int oldCar) {
        this.oldCar = oldCar;
    }
}
