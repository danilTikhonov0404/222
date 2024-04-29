package model;

public class Car {
     long id;
     String model;
     int series;
public Car(){

}
    public Car(long id, String model, int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSerias(int serias) {
        this.series = serias;
    }

}



