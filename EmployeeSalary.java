public class EmployeeSalary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=8; i++){
            System.out.print("Enter salary of employee" + i + ":");
            double salary = sc.nextDouble();

            double bonusRate;

            if(salary < 20000){
                 bonusRate = 0.20;
            }
            else if( salary < 40000){
                bonusRate = 0.15;
            }
            else if(salary < 60000){
                bonusRate = 0.10;
            }
            else{
                bonusRate = 0.05;
            }
            double bonus = salary * bonusRate;
            double totalSalary = salary + bonus;

            System.out.println("salary      : Rs." +salary);
            System.out.println("Bonus Amount:Rs." + bonus);
            System.out.println("Total salary:Rs."+ totalSalary);
            System.out.println();
        }
    }

}