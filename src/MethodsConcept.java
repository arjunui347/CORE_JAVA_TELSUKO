public class MethodsConcept{

    public static void main(String[] args) {
        Computer objComputer = new Computer(); //Object creation

        String strBook= objComputer.getMeBook(10);
        System.out.println(strBook);

        objComputer.playMusic();

        
    }
}

class Computer{
    public void playMusic(){
        System.out.println("Music is Playing Now...");
    }

    public String getMeBook (int cost){
        if(cost >=10){
        return "Book";
        }

        return "No Books at this cost";

    }

}