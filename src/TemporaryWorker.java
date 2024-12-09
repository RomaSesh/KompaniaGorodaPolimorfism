public class TemporaryWorker extends Worker {
    private int hours;

    public TemporaryWorker(int hours) {
        this.hours = hours;
    }

    // начисление зарплаты временному работнику
    @Override
    public double giveSalary() {
        return (300 * hours);
    }
}