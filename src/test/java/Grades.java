import java.util.ArrayList;
import java.util.Objects;

public class Grades {
    protected ArrayList<String[]> grades = new ArrayList<>();
    protected ArrayList<String> result = new ArrayList<>();
    public void addSubject(String subject){
        String[] subjectt = new String[2];
        subjectt[0]=subject;
        String s = String.valueOf(new StringBuilder().append(subjectt[0]).append(" -").append(subjectt[1]).append("\r\n"));
        result.add(s);
        grades.add(subjectt);
    }
    public void dropSubject(String name) {
        for (int i = 0; i < grades.size(); i++) {
            if(Objects.equals(grades.get(i)[0], name))
            {
                grades.remove(i);
            }
        }
    }
    public ArrayList<String> getGrades()
    {
        return result;
    }
}
