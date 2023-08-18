public class Employee {
    String name;
    int salary;
    int workhours;
    int hireYear;

    Employee(String name, int salary, int workhours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireYear = hireYear;

        printEmployee();
    }

    public int tax() {
        int tax = 0;
        if (this.salary >= 1000){
            tax = ((this.salary * 3) / 100);
            this.salary -= tax;
        }
        return tax;
    }

    public int bonus(){
        int bonus = 0;
        if (workhours > 40){
            bonus = ((workhours - 40) * 30);
            this.salary = bonus + this.salary;
        }
        return bonus;
    }

    public int raiseSalary(){
        int year = 2023, raise = 0;
        if (year - hireYear < 10){
            raise = ((salary * 5) / 100);
            this.salary = raise + this.salary;
        } else if (year - hireYear >= 10 && year - hireYear <= 20) {
            raise = ((salary * 10) / 100);
            this.salary = raise + this.salary;
        } else if (year - hireYear > 20) {
            raise = ((salary * 15) / 100);
            this.salary = raise + this.salary;
        }
        return raise;
    }

    void printEmployee(){
        System.out.println("=========================");
        System.out.println("Adı \t: " + this.name);
        System.out.println("Maaşı \t: " + salary);
        System.out.println("Çalışma Saati \t: " + this.workhours);
        System.out.println("Başlangıç Yılı \t: " + this.hireYear);
        System.out.println("Vergi \t: " + this.tax());
        System.out.println("Bonus \t: " + this.bonus());
        System.out.println("Maaş Artışı \t: " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar dahil Maaş \t: " + this.salary);
        System.out.println("Total Maaş \t: " + this.salary);
    }

}
