import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> availableCars = new ArrayList<>();
        availableCars.add(new Car("Toyota Camry", 2020, "ABC123"));
        availableCars.add(new Car("Honda Civic", 2021, "XYZ456"));

        Employee employee = new Employee("Maria", "Vendedor", "maria@email.com", "admin123");

        while (true) {
            showMainMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumes the newline character

            switch (option) {
                case 1:
                    System.out.print("Digite o nome de usuário (email do funcionário): ");
                    String username = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String password = scanner.nextLine();

                    if (employee.login(username, password)) {
                        System.out.println("Funcionário " + employee.getName() + " logado com sucesso.");
                        employeeMenu(scanner, availableCars, employee);
                    } else {
                        System.out.println("Falha no login do funcionário. Verifique as credenciais.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void employeeMenu(Scanner scanner, List<Car> availableCars, Employee employee) {
        while (true) {
            showEmployeeMenu();
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                showAvailableCars(availableCars);
                int carSelection = scanner.nextInt();
                scanner.nextLine();

                if (carSelection > 0 && carSelection <= availableCars.size()) {
                    Car selectedCar = availableCars.get(carSelection - 1);
                    System.out.println("Você selecionou o carro: " + selectedCar.getModel());
                } else {
                    System.out.println("Opção de carro inválida. Tente novamente.");
                }
            } else if (option == 2) {
                System.out.print("Digite o preço do aluguel: $");
                float rentalPrice = scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Preço do aluguel definido como $" + rentalPrice);
            } else if (option == 3) {
                System.out.print("Digite o nome do cliente que está alugando: ");
                String clientName = scanner.nextLine();
                System.out.println("Carro alugado para " + clientName);
            } else if (option == 4) {
                System.out.println("Carro liberado!");
            } else if (option == 0) {
                System.out.println("Saindo do menu de funcionário.");
                return;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("\u001B[34m1. Logar como funcionário");
        System.out.println("\u001B[31m0. Sair\u001B[0m");
    }

    private static void showEmployeeMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("\u001B[34m1. Selecionar um carro");
        System.out.println("\u001B[34m2. Calcular preço do aluguel");
        System.out.println("\u001B[34m3. Alugar carro");
        System.out.println("\u001B[34m4. Liberar carro");
        System.out.println("\u001B[31m0. Sair\u001B[0m");
    }

    private static void showAvailableCars(List<Car> availableCars) {
        System.out.println("\u001B[32mCarros disponíveis para alugar:");
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println((i + 1) + ". " + availableCars.get(i).getModel());
        }
    }
}
