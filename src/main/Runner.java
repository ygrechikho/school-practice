public class Runner {
    public static void main(String[] args) {
       SchoolClass sch = new SchoolClass();
       Utilities utils = new Utilities();

        for (int i = 0; i < 10; i++) {
            sch.addStudent(utils.generateRndStudent());
            i++;
        }

        System.out.println(sch.CalculateAvgGrade());
    }
}