public class MHEmployee {
    String name;
    int salary,workHours,hireYear;

    public MHEmployee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary < 1000){
            return 0;
        }else {
            return (this.salary/100.0)*3;
        }
    }

    public int bonus(){
        if(workHours > 40){
            return (workHours-40)*30;
        }else {
            return 0;
        }
    }

    public double raiseSalary(){
        if(2021-this.hireYear < 10){
            return (this.salary/100.0)*5;
        } else if (2021-this.hireYear > 9 && 2021-this.hireYear < 20 ) {
            return (this.salary/100.0)*10;
        } else {
            return (this.salary/100.0)*15;
        }
    }


    public void toStr() {
        System.out.println("Adı :" + this.name
                        +"\nMaaşı :" + this.salary
                        +"\nÇalışma saati :" + this.workHours
                        +"\nBaşlangıç Yılı :" + this.hireYear
                        +"\nVergi :" + this.tax()
                        +"\nBonus :" + this.bonus()
                        +"\nMaaş Artışı :" + this.raiseSalary()
                        +"\nVergi ve Bonuslarla birlikte maaş :" + (this.salary -this.tax() + this.bonus())
                        +"\nToplam Maaş :" + (this.salary + this.raiseSalary()));
    }
}
