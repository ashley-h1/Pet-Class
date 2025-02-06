//
public class Pet{
    //private data fields
    private String name;
    private String type;
    private Integer age; 
    //public constructors
    public Pet(){
        this.setName("Pet name");
        this.setType("Animal");
        this.setAge(1);
    }
    public Pet(String newName, String newType, int newAge){
        this.setName(newName);
        this.setType(newType);
        this.setAge(newAge);
    }
    //name
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
    //type
    public void setType(String newType){
        this.type = newType;
    }
    public String getType(){
        return this.type;
    }
    //age
    public void setAge(int newAge){
        this.age = newAge;
    }
    public Integer getAge(){
        return this.age;
    }
    //noise
    public String speak(){
        if (this.type == "cat"){
            return "Meow";
        }
        else if (this.type == "dog"){
            return "Woof";
        }
        else{
            return "Noise";
        }
    }
    //print out info
    public String toString(){
        String output = "Pet Information: ";
        output += "\nName: ";
        output += this.getName();
        output += "\nType: ";
        output += this.getType();
        output += "\nSound: ";
        output += this.speak();
        output += "\nAge: ";
        int theage = this.getAge();
        String lastoutput = output + theage;
        
        return lastoutput;
    }
    //public static void main(String[] arg){
    //    Pet myPet2 = new Pet("Princess", "dog", 19);
    //    System.out.println(myPet2.toString());
    //}
}