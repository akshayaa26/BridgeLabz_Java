package coreProgramming.methods.Level3;

// Program to calculate employee bonus and salary
class EmployeeBonus {

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];

        for (int i = 0; i < n; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; // Salary
            data[i][1] = (int) (Math.random() * 10) + 1;       // Years of service
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to display summary
    public static void displaySummary(double[][] oldData, double[][] newData) {

        double oldSum = 0, newSum = 0, bonusSum = 0;

        System.out.println("OldSalary\tYears\tNewSalary\tBonus");

        for (int i = 0; i < oldData.length; i++) {
            System.out.println(oldData[i][0] + "\t\t" +
                               oldData[i][1] + "\t" +
                               newData[i][0] + "\t\t" +
                               newData[i][1]);

            oldSum += oldData[i][0];
            newSum += newData[i][0];
            bonusSum += newData[i][1];
        }

        System.out.println("\nTotal Old Salary  : " + oldSum);
        System.out.println("Total New Salary  : " + newSum);
        System.out.println("Total Bonus Paid  : " + bonusSum);
    }

    public static void main(String[] args) {

        double[][] employees = generateEmployeeData(10);
        double[][] newData = calculateBonus(employees);
        displaySummary(employees, newData);
    }
}
