public class Runner{
    public static void main(String[] args){
        //default pet
        Pet myPet = new Pet();
        System.out.println(myPet.toString());
        //pet 1
        Pet myPet2 = new Pet("Princess", "dog", 19);
        System.out.println(myPet2.toString());
        //third pet
        Pet thirdPet = new Pet("Tuxedo", "cat", 1);
        System.out.println(thirdPet.toString());
    }
}