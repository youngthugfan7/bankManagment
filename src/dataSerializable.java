import java.io.*;

public class dataSerializable{
    public dataSerializable(String nUsername, String nPassword, int nBalance) {
        userData userD = new userData();
        userD.savedUsername = nUsername;
        userD.savedPassword = nPassword;
        userD.savedBalance = nBalance;

        try {
            FileOutputStream fileOut = new FileOutputStream("userData.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(userD);
            out.close();
            fileOut.close();
            System.out.println(userD.savedUsername);
            System.out.println(userD.savedPassword);
            System.out.println(userD.savedBalance);
            System.out.println("Serializad data is saved in txt file");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}



/* Notes after video
 * Serialization = The process of converting anobject intoa byte stream.
 * Persists(saves the state) the object after progream exits
 * This byte stream can be saved as a file or sent overa  network
 * can be sent to a difffreenet machine
 * Byte stream can be saved as a file (.ser) which is platform indepenente
 * (think of it as saving a file with objects information)
 * 
 * Desterlation the reverse process of convering byte strema into an object (think of this as loading a saved file)
 * 
 */
// 