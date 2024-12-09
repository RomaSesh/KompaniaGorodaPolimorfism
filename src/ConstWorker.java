public class ConstWorker extends Worker {
    private int year;
    private double coef;

    public ConstWorker(int year, double coef) {
        this.year = year;
        this.coef = coef;
    }

    // начисление зарплаты постоянному работнику
    @Override
    public double giveSalary() {
        return (500 * year * coef);
    }
}