package web.model;

public class Car {

    private Long id;
    private String brend;
    private int series;

    public Car(Long id, String brend, int series) {
        this.id = id;
        this.brend = brend;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brend='" + brend + '\'' +
                ", series=" + series +
                '}';
    }
}
