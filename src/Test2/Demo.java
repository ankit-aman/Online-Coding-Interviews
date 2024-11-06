package Test2;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    private String id;
    private String name;
    private final String userName;
    private final String emailId;
    
    public HelloWorld(String id, String name,String userName, String emailId){
        
        this.id=id;
        this.name=name;
        this.userName=userName;
        this.emailId=emailId;
    }
    
    public String getUserName(){
        
        return this.userName;
    }
    
    public String getId(){
        
        return this.id;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public String getEmailid(){
        
        return this.emailId;
    }
    
}

public class Demo{
    
    public static void main(String[] args) {
        
        HelloWorld hw=new HelloWorld("1","ankitaman","hskfh@test","testtest");
        
        
        System.out.println(hw.getEmailid()+" "+hw.getUserName() );
    }
}