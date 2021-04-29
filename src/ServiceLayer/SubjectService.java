
package ServiceLayer;

import Model.Subject;
import DatabaseLayer.DatabaseConnection;


public class SubjectService {
    
    public boolean AddSubject(Subject subject){
        
        DatabaseConnection conn=new DatabaseConnection();
        String query="Insert into IT17255516SubjectTable(SubjectName,SubjectCode,year,Semester) values('"+subject.getSubjectName()+"','"+subject.getSubjectCode()+"','"+subject.getYear()+"','"+subject.getSemester()+"')";
        return conn.Insert(query);
    }
}
