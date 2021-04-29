/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServiceLayer;

import DatabaseLayer.DatabaseConnection;


public class DeleteSubjectService {
    
      public boolean DeleteSubject(int SubjectCode){
        
        DatabaseConnection conn=new DatabaseConnection();
   
        return conn.Insert("delete from IT17255516SubjectTable where SubjectCode = "+SubjectCode);
    }

    
    
}
