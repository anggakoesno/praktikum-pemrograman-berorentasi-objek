package Pertemuan6;

public class WorkerDemo {
    public static void main(String[] args) {
        Worker[] workers = {
                new PermanentWorker("Andi", 4500000),
                new ContractWorker("Bayu", 3000000)
        };

        for (Worker w : workers) {
            w.showInfo();
        }
    }
}
