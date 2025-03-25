import java.util.Scanner;

class House {
    String propertyType;
    double propertyValue;
    double annualRent;

    House(String propertyType, double propertyValue, double annualRent) {
        this.propertyType = propertyType;
        this.propertyValue = propertyValue;
        this.annualRent = annualRent;
    }


    double calculateAnnualTax() {
        if (propertyType.equalsIgnoreCase("owner-occupied")) {
            return propertyValue * 0.005; 
        } else if (propertyType.equalsIgnoreCase("rented")) {
            return annualRent * 0.10; 
        } else {
            return 0.0;
        }
    }
}

public class Ass10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter property type (owner-occupied/rented): ");
        String propertyType = scanner.nextLine();

        System.out.println("Enter property value: ");
        double propertyValue = scanner.nextDouble();

        double annualRent = 0.0;
        if (propertyType.equalsIgnoreCase("rented")) {
            System.out.println("Enter annual rent: ");
            annualRent = scanner.nextDouble();
        }

        House house = new House(propertyType, propertyValue, annualRent);
        double annualTax = house.calculateAnnualTax();

        System.out.println("The annual house tax is: " + annualTax);
    }
}
