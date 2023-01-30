import java.io.*;

public class dataDeserializing extends Main{
    public dataDeserializing() throws IOException, ClassNotFoundException{
        userData USERdata = new userData();
        try{
            FileInputStream fileIn = new FileInputStream("userData.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            USERdata = (userData) in.readObject();
            in.close();
            fileIn.close();
        } finally {
            fuserName = USERdata.savedUsername;
            fPassword = USERdata.savedPassword;
            balance = USERdata.savedBalance;
        }
    }
}