/**
 * Класс TemporaryWorker представляет собой временного работника,
 * который получает зарплату на основе отработанных часов.
 */
public class TemporaryWorker extends Worker {
    private int hours; // Количество отработанных часов

    /**
     * Конструктор класса TemporaryWorker.
     *
     * @param hours  Количество отработанных часов
     */
    public TemporaryWorker(int hours) {
        this.hours = hours;
    }

    /**
     * Метод для начисления зарплаты временному работнику.
     *
     * @return  Зарплата, рассчитанная по формуле (300 * hours)
     */
    @Override
    public double giveSalary() {
        return (300 * hours);
    }
}
