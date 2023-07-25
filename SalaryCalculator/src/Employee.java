public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary) {
        double tax = 0;
        if (this.salary > 1000) {
            tax = (this.salary * 3) / 100;
            return tax;
        }
        return tax;
    }

    public int bonus(int workHours) {
        int bonusPayment = 0;
        if (this.workHours > 40) {
            bonusPayment = (this.workHours - 40) * 30;
            return bonusPayment;
        }
        return bonusPayment;
    }

    public double raiseSalary(int hireYear) {
        int nowYear = 2021;
        int year = nowYear - hireYear;
        double raise = 0;
        if (year < 10) {
            raise = (this.salary * 5) / 100;
            return raise;
        } else if (year > 9 && year < 20) {
            raise = (this.salary * 10) / 100;
            return raise;
        } else if (year > 19) {
            raise = (this.salary * 15) / 100;
            return raise;
        } else {
            return salary;
        }
    }


    @Override
    public String toString() {
        return "Adı : " + name + '\n'
                + "Maaşı : " + salary + '\n'
                + "Çalışma Saati : " + workHours + '\n'
                + "Başlangıç Yılı : " + hireYear + '\n'
                + "Vergi : " + tax(salary) + '\n'
                + "Bonus : " + bonus(workHours) + '\n'
                + "Maaş Artışı : " + raiseSalary(hireYear) + '\n'
                + "Vergiler ve Bonuslar ile birlikte maaş : " + (salary + bonus(workHours) - tax(salary)) + '\n'
                + "Toplam Maaş : " + (salary + raiseSalary(hireYear));
    }
}
