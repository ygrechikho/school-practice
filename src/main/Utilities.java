import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class Utilities {
    public Student generateRndStudent(){
        Student std = new Student();

        std.setGrade(generateRndGrade());
        std.setName(generateRndSurname());

        return std;
    }

    public int generateRndGrade(){
        Random rand = new Random();
        int upperbound = 10; //rework to argument

        return rand.nextInt(upperbound);
    }

    public String generateRndSurname(){
        var rndString = RandomStringUtils.randomAlphabetic(10);
        String rndSurname = rndString.substring(0, 1).toUpperCase() + rndString.substring(1);

        return rndSurname;
    }
}
