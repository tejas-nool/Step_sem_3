package week6_assignment;

    public class CompanyEmployee {

        String empName;
        double salary;

        static String companyName =
                "Bright Horizon Technologies";

        static int employeeCount = 0;

        CompanyEmployee(String empName, double salary) {

            this.empName = empName;
            this.salary = salary;

            employeeCount++;
        }


        static void printCompanyInfo() {

            System.out.println(
                    "Company Name: " + companyName);

            System.out.println(
                    "Employee Count: " + employeeCount);
        }

        void printEmployee() {

            System.out.println(
                    "Employee: " + empName);

            System.out.println(
                    "Salary: Rs " + salary);
        }

        public static void main(String[] args) {

            CompanyEmployee e1 =
                    new CompanyEmployee("Rahul", 50000);

            CompanyEmployee e2 =
                    new CompanyEmployee("Priya", 60000);

            CompanyEmployee e3 =
                    new CompanyEmployee("Arjun", 55000);

            e1.printEmployee();
            e2.printEmployee();
            e3.printEmployee();

            System.out.println();

            CompanyEmployee.printCompanyInfo();
        }
    }

