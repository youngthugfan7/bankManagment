import java.io.IOException;
import java.lang.String;
import java.lang.Integer;

public class Main {
    static String fuserName;
    static String fPassword;
    static int balance; 


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        loadData();
        GUI gui = new GUI(); // idk if vars are being saved
    }

    public static void accountCreation(String accUser, String accPassword, int accBalance) throws IOException, ClassNotFoundException{
        dataSerializable ds = new dataSerializable(accUser, accPassword, accBalance);
        dataDeserializing dd = new dataDeserializing();
    }

    public static String balanceLoad(){
        String rando = String.valueOf(balance);
        return(String.valueOf(balance));
    }

    public static void changeBalance(String action, int value){
        if(action.equals("withdraw")){
            balance -= value;
        }else if(action.equals("deposit")){
            balance = balance + value;
        }
    }
    // doubling for somereason, runnign twice


    public static boolean loggin(String usernameLogin, String passwordLogin){
        if(usernameLogin.equals(fuserName) && passwordLogin.equals(fPassword)){
            return(true);
        }else{
            return(false);
        }
        // if statement not running

    }

    public static void loadData() throws IOException, ClassNotFoundException{
        dataDeserializing eh = new dataDeserializing();
        System.out.println(fuserName);
        System.out.println(fPassword);
        System.out.println(balance);
    }
}



// Todo list

//work on data saving :)
//work on methods to save and add money with accounts
//slowley test one method and add to GUI
// add it so it has sterliezed data or tempoaltes on start


