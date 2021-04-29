

package ServiceLayer;

import DatabaseLayer.DatabaseConnection;


public class EnrollStudentsToSubjectsService {
    
     public boolean Enrolling(String StudentID,int SubjectCode ){
        
        DatabaseConnection conn=new DatabaseConnection();
    
    String query="Insert into IT17255516EnrollingTable(StudentID,SubjectCode) values ('"+StudentID+"','"+SubjectCode+"')";
        
          return conn.Insert(query);
}
}
