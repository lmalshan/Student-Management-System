package Model;

public class Subject {

    private String SubjectName;
    private int SubjectCode;
    private String year;
    private String Semester;

    
    public Subject(String SubjectName,int SubjectCode,String year,String Semester){
        
       this.SubjectName=SubjectName;
       this.SubjectCode=SubjectCode;
       this.year=year;
       this.Semester=Semester;
       
    }

    /**
     * @return the SubjectName
     */
    public String getSubjectName() {
        return SubjectName;
    }

    /**
     * @param SubjectName the SubjectName to set
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    /**
     * @return the SubjectCode
     */
    public int getSubjectCode() {
        return SubjectCode;
    }

    /**
     * @param SubjectCode the SubjectCode to set
     */
    public void setSubjectCode(int SubjectCode) {
        this.SubjectCode = SubjectCode;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the Semester
     */
    public String getSemester() {
        return Semester;
    }

    /**
     * @param Semester the Semester to set
     */
    public void setSemester(String Semester) {
        this.Semester = Semester;
    }
            
            
}


