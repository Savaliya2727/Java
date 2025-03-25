
class House {
    double totalValue;
    House(double totalValue) {
        this.totalValue = totalValue;
    }

    double calculateTax() {
        return totalValue * 0.005;
    }
}

class RentedHouse extends House {
    double annualRent;

    RentedHouse(double totalValue, double annualRent) {
        super(totalValue);
        this.annualRent = annualRent;
    }

    @Override
    double calculateTax() {
        return annualRent * 0.10;
    }
}

public class Ass11 {
    public static void main(String[] args) {
        House ownerOccupiedHouse = new House(1000000);
        double ownerOccupiedTax = ownerOccupiedHouse.calculateTax();
        System.out.println("Annual house tax for owner-occupied house: " + ownerOccupiedTax);

        RentedHouse rentedHouse = new RentedHouse(1000000, 120000);
        double rentedHouseTax = rentedHouse.calculateTax();
        System.out.println("Annual house tax for rented house: " + rentedHouseTax);
    }
}
