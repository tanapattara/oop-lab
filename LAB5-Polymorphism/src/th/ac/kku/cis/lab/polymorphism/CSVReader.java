package th.ac.kku.cis.lab.polymorphism;

import java.io.*;
import java.util.ArrayList;

public class CSVReader {
    private boolean isConnected = false;
    private String filepath = "";
    private ArrayList<Student> students;
    public CSVReader(String filepath){
        this.filepath = filepath;
        students = new ArrayList<Student>();
    }

    public ArrayList<Student> getData(){
        String line = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filepath));
            while ((line = bufferedReader.readLine()) != null)   //returns a Boolean value
            {
                String[] studentdata = line.split(",");    // use comma as separator
                Student student = new Student(studentdata[1], studentdata[0], studentdata[2]);
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
