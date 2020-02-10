package pragmatic.homework3;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem) {
       operationSystem = newOperationSystem;
    }

    void useMemory(double memory) {
        if (memory > freeMemory) {
            System.out.println("Not enough free memory!");

        } else {
            freeMemory -= memory;
        }

    }

}
