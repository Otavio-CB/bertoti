public class CarRental {
    private Client client;
    private Car car;
    private float rentalPrice;

    public CarRental(Client client, Employee employee) {
        this.client = client;
    }

    public void selectCar(Car car) {
        this.car = car;
    }

    public void calculateRentalPrice(float rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void rentCar() {
        if (client != null && car != null && rentalPrice > 0) {
            System.out.println("Carro " + car.getModel() + " alugado por " + client.getName() + " por $" + rentalPrice);
        } else {
            System.out.println("Não é possível efetuar o aluguel do carro.");
        }
    }

    public void releaseCar(Employee employee) {
        // Implemente a lógica de liberação do carro aqui
        if (employee != null && car != null) {
            System.out.println("Carro " + car.getModel() + " liberado por " + employee.getName());
        } else {
            System.out.println("Não é possível liberar o carro.");
        }
    }

    public void login(Employee employee) {
        // Implemente a lógica de login do funcionário aqui
        if (employee != null) {
            System.out.println("Funcionário " + employee.getName() + " logado com sucesso.");
        } else {
            System.out.println("Falha no login do funcionário.");
        }
    }
}
