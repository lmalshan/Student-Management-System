/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Model.Subject;


public class UpdateSubjectService {
    
   
    
    public boolean UpdateSubject(Subject subject,int SubjectCode){
        
        DatabaseConnection conn=new DatabaseConnection();
        String query="Update IT17255516SubjectTable set SubjectName='"+subject.getSubjectName()+"',SubjectCode='"+subject.getSubjectCode()+"',year='"+subject.getYear()+"',Semester='"+subject.getSemester()+"' where SubjectCode="+SubjectCode;
        return conn.Insert(query);
    }
    

    
    
}
