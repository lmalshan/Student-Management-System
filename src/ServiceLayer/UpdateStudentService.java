/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Model.Student;

/**
 *
 * @author bsc2017
 */
public class UpdateStudentService {
    
    
     public boolean UpdateStudent(Student student,int StudentID){
        
        DatabaseConnection conn=new DatabaseConnection();
       
        String Query= "Update IT17255516StudentTable set CSUStream='"+student.getCSUStream()+"',StudentName= '"+student.getStudentName()+"',ContactNo= '"+student.getContactNo()+"',EmailAddress= '"+student.getEmailAddress()+"',PostalAddress='"+student.getPostalAddress()+"',NIC= '"+student.getNIC()+"',ALStream= '"+student.getALStream()+"',ALStatus='"+student.getALStatus()+"',ALType= '"+student.getALType()+"' where StudentID="+StudentID;
        
        
      //  String quert="Insert into IT17255516StudentTable(CSUStream,StudentName,ContactNo,EmailAddress,PostalAddress,NIC, ALStream,ALStatus,ALType) values"
               // + "('"+student.getCSUStream()+"','"+student.getStudentName()+"','"+student.getContactNo()+"','"+student.getEmailAddress()+"','"+student.getPostalAddress()+"','"+student.getNIC()+"','"+student.getALStream()+"','"+student.getALStatus()+"','"+student.getALType()+"')";
      
        return conn.Insert(Query);
        
    }
    
}
