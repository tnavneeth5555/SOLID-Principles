class BreadBaker {
    void bakeBread() {
        System.out.println("Bread Baker");
    }
};

// Class for managing inventory
class InventoryManager {
    void manageInventory() {
        System.out.println("Manage Inventory");
    }
};

// Class for ordering supplies
class SupplyOrder {
    void orderSupplies() {
        System.out.println("Order Supplies");
    }
};

// Class for serving customers
class CustomerService {
    void serveCustomer() {
        System.out.println("Serve Customer");
    }
};

// Class for cleaning the bakery
class BakeryCleaner {
    void cleanBakery() {
        System.out.println("Clean Bakery");
    }
};

public class SingleResponsiblity {

    public static void main(String[] args) {
        /*
        This principle states that “A class should have only one reason to change” which
        means every class should have a single responsibility or single job or single purpose.
         In other words, a class should have only one job or purpose within the software system.

        BreadBaker Class: Responsible solely for baking bread. This class focuses on ensuring the quality and standards of the bread without being burdened by other tasks.
        InventoryManager Class: Handles inventory management, ensuring that the bakery has the right ingredients and supplies available.
        SupplyOrder Class: Manages ordering supplies, ensuring that the bakery is stocked with necessary items.
        CustomerService Class: Takes care of serving customers, providing a focused approach to customer interactions.
        BakeryCleaner Class: Responsible for cleaning the bakery, ensuring a hygienic environment.

        Each class is responsible for its own and single responsibility
         */
        BreadBaker breadBaker = new BreadBaker();
        InventoryManager inventoryManager = new InventoryManager();
        SupplyOrder supplyOrder = new SupplyOrder();
        CustomerService customerService = new CustomerService();
        BakeryCleaner bakeryCleaner = new BakeryCleaner();
    }

}
