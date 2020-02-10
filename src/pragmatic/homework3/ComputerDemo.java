package pragmatic.homework3;

public class ComputerDemo {
    public static void main(String[] args) {

        Computer desktop = new Computer();
        desktop.year = 2018;
        desktop.price = 1000;
        desktop.hardDiskMemory = 20000;
        desktop.freeMemory = 2000;
        System.out.println("Desktop free memory is " + desktop.freeMemory);
        desktop.operationSystem = "Windows";
        desktop.isNotebook = false;
        desktop.useMemory(100);

        System.out.println("Desktop year is " + desktop.year);
        System.out.println("Desktop price is " + desktop.price);
        System.out.println("Desktop hard disk memory is " + desktop.hardDiskMemory);
        System.out.println("Desktop OS is " + desktop.operationSystem);
        System.out.println("Is this comptuter a notebook? " + desktop.isNotebook);
        System.out.println("Desktop new available free memory is " + desktop.freeMemory);
        System.out.println();

        Computer laptop = new Computer();
        laptop.year = 2020;
        laptop.price = 2000;
        laptop.hardDiskMemory = 100000;
        laptop.freeMemory = 16000;
        laptop.isNotebook = true;
        laptop.operationSystem = "MacOS";
        System.out.println("laptop OS is " + laptop.operationSystem);
        laptop.changeOperationSystem("Linux");

        System.out.println("Laptop year is " + laptop.year);
        System.out.println("Laptop price is " + laptop.price);
        System.out.println("Laptop hard disk memory is " + laptop.hardDiskMemory);
        System.out.println("Laptop free memory is " + laptop.freeMemory);
        System.out.println("Is this comptuter a notebook? " + laptop.isNotebook);
        System.out.println("Laptop new OS is " + laptop.operationSystem);

    }
}
