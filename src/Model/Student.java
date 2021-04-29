package Model;

public class Student {

    private String CSUStream;

    private String StudentName;
    private int ContactNo;
    private String EmailAddress;
    private String PostalAddress;
    private String NIC;

    private String ALStream;
    private String ALStatus;
    private String ALType;

    public Student(String CSUStream, String StudentName, int ContactNo, String EmailAddress, String PostalAddress, String NIC, String ALStream, String ALStatus, String ALType) {

        this.CSUStream = CSUStream;
        this.StudentName = StudentName;
        this.ContactNo = ContactNo;
        this.EmailAddress = EmailAddress;
        this.PostalAddress = PostalAddress;
        this.NIC = NIC;
        this.ALStream = ALStream;
        this.ALStatus = ALStatus;
        this.ALType = ALType;
    }

    /**
     * @return the StudentName
     */
    public String getStudentName() {
        return StudentName;
    }

    /**
     * @param StudentName the StudentName to set
     */
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    /**
     * @return the ContactNo
     */
    public int getContactNo() {
        return ContactNo;
    }

    /**
     * @param ContactNo the ContactNo to set
     */
    public void setContactNo(int ContactNo) {
        this.ContactNo = ContactNo;
    }

    /**
     * @return the EmailAddress
     */
    public String getEmailAddress() {
        return EmailAddress;
    }

    /**
     * @param EmailAddress the EmailAddress to set
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * @return the PostalAddress
     */
    public String getPostalAddress() {
        return PostalAddress;
    }

    /**
     * @param PostalAddress the PostalAddress to set
     */
    public void setPostalAddress(String PostalAddress) {
        this.PostalAddress = PostalAddress;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the CSUStream
     */
    public String getCSUStream() {
        return CSUStream;
    }

    /**
     * @param CSUStream the CSUStream to set
     */
    public void setCSUStream(String CSUStream) {
        this.CSUStream = CSUStream;
    }

    /**
     * @return the ALStream
     */
    public String getALStream() {
        return ALStream;
    }

    /**
     * @param ALStream the ALStream to set
     */
    public void setALStream(String ALStream) {
        this.ALStream = ALStream;
    }

    /**
     * @return the ALStatus
     */
    public String getALStatus() {
        return ALStatus;
    }

    /**
     * @param ALStatus the ALStatus to set
     */
    public void setALStatus(String ALStatus) {
        this.ALStatus = ALStatus;
    }

    /**
     * @return the ALType
     */
    public String getALType() {
        return ALType;
    }

    /**
     * @param ALType the ALType to set
     */
    public void setALType(String ALType) {
        this.ALType = ALType;
    }

}
