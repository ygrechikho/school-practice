import java.util.*;

public class SchoolClass {
 private List<Student> SchoolClassList = new LinkedList<Student>();;

 public float CalculateAvgGrade() {
  float totalGrade = 0;
  float avgGrade = 0;
  for (int i = 0; i < SchoolClassList.size(); i++) {
   totalGrade += SchoolClassList.get(i).getGrade();
   i++;
  }
  avgGrade = totalGrade / SchoolClassList.size();
  return avgGrade;
 }

 public void addStudent(Student student) {
  SchoolClassList.add(student);
 }
}
