package day11;

public class Courier implements Worker {
    private int salary;
    private final Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
        bonus();
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= 1000000) {
            salary *= 2;
            warehouse.setBalance(0);
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}