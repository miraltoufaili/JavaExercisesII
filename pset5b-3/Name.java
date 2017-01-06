class Name
{
    private String name;
    private char middleName;
    private String lastName;
    
    public Name (String name, char middleName, String lastName){
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    public Name (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    
    public String getNormalOrder(){
        if (middleName == 0){
        return name + " "  + lastName;
    }
     else {
        return name + " " + middleName + ". " + lastName;
     }
    }
    
    
    
    
    public String getReverseOrder(){
        if (middleName == 0){
        return lastName + ", "  + name;
    }
     else {
        return lastName + ", " + name + " " + middleName + "." ;
          } 
    }
    
    public String getInitials(){
        if(middleName == 0){
            return "" +  name.charAt(0) + lastName.charAt(0);
        } else {
            return "" + name.charAt(0) + middleName + lastName.charAt(0);
        }
    }     
    
   
}
