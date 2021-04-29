package ServiceLayer;

import Model.Student;
import DatabaseLayer.DatabaseConnection;


public class StudentService {
    
    public boolean AddStudent(Student student){
        
        DatabaseConnection conn=new DatabaseConnection();
        String quert="Insert into IT17255516StudentTable(CSUStream,StudentName,ContactNo,EmailAddress,PostalAddress,NIC, ALStream,ALStatus,ALType) values('"+student.getCSUStream()+"','"+student.getStudentName()+"','"+student.getContactNo()+"','"+student.getEmailAddress()+"','"+student.getPostalAddress()+"','"+student.getNIC()+"','"+student.getALStream()+"','"+student.getALStatus()+"','"+student.getALType()+"')";
        return conn.Insert(quert);
    }
}
