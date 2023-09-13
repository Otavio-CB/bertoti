public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2020, "ABC123");
        Client client = new Client("João", 1985, "123456789", "joao@email.com");
        Employee employee = new Employee("Maria", "Vendedor", "maria@email.com");

        CarRental rental = new CarRental(client, employee);
        rental.login(employee);
        rental.selectCar(car);
        rental.calculateRentalPrice(100.0f);
        rental.rentCar();
        rental.releaseCar(employee);
    }
}
