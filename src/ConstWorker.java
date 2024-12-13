/**
 * Класс ConstWorker представляет собой постоянного работника,
 * который имеет определенный коэффициент и стаж работы в годах.
 */
public class ConstWorker extends Worker {
    private int year; // Стаж работника в годах
    private double coef; // Коэффициент, влияющий на начисление зарплаты

    /**
     * Конструктор класса ConstWorker.
     *
     * @param year  Стаж работника в годах
     * @param coef  Коэффициент для расчета зарплаты
     */
    public ConstWorker(int year, double coef) {
        this.year = year;
        this.coef = coef;
    }

    /**
     * Метод для начисления зарплаты постоянному работнику.
     *
     * @return  Зарплата, рассчитанная по формуле (500 * year * coef)
     */
    @Override
    public double giveSalary() {
        return (500 * year * coef);
    }
}