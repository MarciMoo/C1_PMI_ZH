import java.util.Objects;
import java.util.ArrayList;

public class Exam extends Grades{
    protected ArrayList<String[]> result = new ArrayList<>();
    protected ArrayList<String> result2 = new ArrayList<>();
    public void registGradeToSubject (String subject, int grade) {
        String[] subjectt = new String[2];
        for (int i = 0; i < grades.size(); i++) {
            if (Objects.equals(grades.get(i)[0], subject)) {
                subjectt[1] = String.valueOf(grade);
            }
            for(int j = 0; j < subjectt.length ;j++){
                result.add(subjectt);
                String s = String.valueOf(new StringBuilder().append(subjectt[0]).append(" -").append(subjectt[1]).append("\r\n"));
                result2.add(s);
            }
        }
    }
    public ArrayList<String> getGrades()
    {
        return result2;
    }
}
