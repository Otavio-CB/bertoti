public class Car {
    private String model;
    private int year;
    private String licensePlate;

    public Car(String model, int year, String licensePlate) {
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    // Getters (métodos de acesso)
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
