import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
/* 
import java.rmi.server.UID;
import javax.security.auth.login.AccountException;
import javax.security.auth.login.AccountNotFoundException;
*/
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
public class GUI extends Main implements ActionListener{
    
    JTextField UsernameInput;
    JTextField PasswordInput;
    JButton loginSubmitButton;
    JButton createAccountButton;

    JButton loginButton;

    JPanel mainPage;
    JPanel loginPage;

    

    JPanel currnetBalance;
    JPanel acccountActionsGUI;
    JButton depositChoiceButton;
    JButton withdrawChoiceButton;
    JLabel userBalanceLabel;

    JPanel depositGUI;
    JButton depositSubmit;
    JTextField depositAmountGUI;

    JPanel withdrawGUI;
    JTextField withdrawGUIinput;
    JButton withdrawSubmit;
    
    JPanel bbGUI; 
    JButton backButton;

    JPanel accountCreationGUI;
    JTextField userNameAccountCreationInput;
    JTextField passwordAccountCreationInput;
    JButton submitAccountCreationButton;

    static int cbChange = 0;

    GUI(){
        //Main page
        mainPage = new JPanel();
        mainPage.setBounds(400,400,200,200);
        mainPage.setBackground(Color.white);
        mainPage.setLayout(new GridLayout(2,1,0,50));
        loginButton = new JButton();
        loginButton.addActionListener(this);
        loginButton.setText("Login");
        loginButton.setFocusable(false);
        createAccountButton = new JButton();
        createAccountButton.addActionListener(this);
        createAccountButton.setText("Create Account");
        createAccountButton.setFocusable(false);
        mainPage.setVisible(true);
        
        // login screen
        loginPage = new JPanel();
        UsernameInput = new JTextField();
        UsernameInput.setText("Username");
        PasswordInput = new JTextField();
        PasswordInput.setText("Password");
        loginSubmitButton = new JButton("Submit");
        loginSubmitButton.addActionListener(this);
        loginPage.setBounds(200,400,600,300);
        loginPage.setBackground(Color.white);
        loginPage.setLayout(new GridLayout(3,1,0,70));
        loginPage.setVisible(false);

        //create account page
        accountCreationGUI = new JPanel();
        userNameAccountCreationInput= new JTextField();
        passwordAccountCreationInput = new JTextField();
        submitAccountCreationButton = new JButton();
        submitAccountCreationButton.addActionListener(this);
        JLabel accountCreationInfo = new JLabel();
        accountCreationInfo.setText("Welcome, please type your new username and password to create an account");
        accountCreationInfo.setFont(new Font("Serif", Font.PLAIN,15));
        submitAccountCreationButton.setText("Submit");
        userNameAccountCreationInput.setText("Username");
        passwordAccountCreationInput.setText("Passoword");
        accountCreationGUI.setLayout(new GridLayout(4,1,0,30));
        accountCreationGUI.setBounds(200,350,600,300);
        accountCreationGUI.setBackground(Color.white);
        accountCreationGUI.setVisible(false);

        //accountActions page
        acccountActionsGUI = new JPanel();
        acccountActionsGUI.setBounds(210,475,580,150);
        acccountActionsGUI.setBackground(Color.white);
        acccountActionsGUI.setLayout(new GridLayout(1,2,50,0));
        depositChoiceButton = new JButton();
        depositChoiceButton.setText("Deposit");
        depositChoiceButton.addActionListener(this);
        loginButton.setFocusable(false);
        withdrawChoiceButton = new JButton();
        withdrawChoiceButton.setText("Withdraw");
        withdrawChoiceButton.addActionListener(this);
        loginButton.setFocusable(false);
        acccountActionsGUI.setVisible(false);

        //deposit page
        depositGUI = new JPanel();
        depositGUI.setBounds(185,375,640,250);
        depositGUI.setLayout(new GridLayout(3,1,0,50));
        JLabel depositGUIinfo = new JLabel();
        depositGUIinfo.setText("Enter the amount you want to deposit");
        depositGUIinfo.setFont(new Font("Serif",Font.PLAIN,40));
        depositAmountGUI = new JTextField();
        depositSubmit = new JButton();
        depositSubmit.addActionListener(this);
        depositSubmit.setText("Submit Amount");
        depositGUI.setVisible(false);

        //withdrawl page
        withdrawGUI = new JPanel();
        withdrawGUI.setBounds(185,375,640,250);
        withdrawGUI.setLayout(new GridLayout(3,1,0,50));
        JLabel withdrawGUIinfo = new JLabel();
        withdrawGUIinfo.setText("Enter the amount you want to withdraw");
        withdrawGUIinfo.setFont(new Font("Serif",Font.PLAIN,40));
        withdrawGUIinput = new JTextField();
        withdrawSubmit= new JButton();
        withdrawSubmit.addActionListener(this);
        withdrawSubmit.setText("Submit Amount");
        withdrawGUI.setVisible(false);


        // logo image that stays on teh screen forever
        JPanel theImage = new JPanel();
        JLabel LImage = new JLabel();
        ImageIcon image = new ImageIcon("WPBmainpic.png");
        LImage.setIcon(image);
        theImage.setBounds(249, 2, 502, 179);
        //theImage.setBounds(349, 2, 502, 179);

        //current Balance 
        currnetBalance = new JPanel();
        currnetBalance.setBackground(Color.white);
        currnetBalance.setLayout(new GridLayout(0,2,20,0));
        currnetBalance.setBounds(269,225,462,50);
        JLabel balPrompt = new JLabel();
        balPrompt.setFont(new Font("Serif",Font.PLAIN,30));
        balPrompt.setText("Current Balance: ");
        userBalanceLabel = new JLabel();
        userBalanceLabel.setFont(new Font("Serif",Font.PLAIN,30));
        userBalanceLabel.setText("1000");
        currnetBalance.setVisible(false);
        
        //back button

        bbGUI = new JPanel();
        bbGUI.setBounds(450, 650, 100, 75);
        bbGUI.setLayout(new GridLayout(1,1,0,0));
        backButton = new JButton();
        backButton.addActionListener(this);
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        backButton.setText("Back");
        bbGUI.setVisible(false);




        JFrame frame = new JFrame();
        // sets up frame
        frame.setTitle("WestPoint Bank Online Services");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes that joint
        frame.setResizable(false); // user cant resize frame
        frame.setSize(1000, 800); // sets x dim and y dim
        frame.setVisible(true); //makes frame visible
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);

        // add elemnets to panals 
        //logo image
        frame.add(theImage);
        theImage.add(LImage);
        //main page
        frame.add(mainPage);
        mainPage.add(loginButton);
        mainPage.add(createAccountButton);

        //login page
        frame.add(loginPage);
        loginPage.add(UsernameInput);
        loginPage.add(PasswordInput);
        loginPage.add(loginSubmitButton);
        
        //balance
        frame.add(currnetBalance);
        currnetBalance.add(balPrompt);
        currnetBalance.add(userBalanceLabel);
        
        //accont actions
        frame.add(acccountActionsGUI);
        acccountActionsGUI.add(depositChoiceButton);
        acccountActionsGUI.add(withdrawChoiceButton);

        //deposit 
        frame.add(depositGUI);
        depositGUI.add(depositGUIinfo);
        depositGUI.add(depositAmountGUI);
        depositGUI.add(depositSubmit);

        //withdraw page 
        frame.add(withdrawGUI);
        withdrawGUI.add(withdrawGUIinfo);
        withdrawGUI.add(withdrawGUIinput);
        withdrawGUI.add(withdrawSubmit);

        //back button
        frame.add(bbGUI);
        bbGUI.add(backButton);

        //account creation
        frame.add(accountCreationGUI);
        accountCreationGUI.add(accountCreationInfo);
        accountCreationGUI.add(userNameAccountCreationInput);
        accountCreationGUI.add(passwordAccountCreationInput);
        accountCreationGUI.add(submitAccountCreationButton);


    }
    /*
     * else if(e.getSource() == ){
            
        }
     */

    @Override
    public void actionPerformed(ActionEvent e){
        // TODO Auto-generated method stub
        Main main = new Main();
        if(e.getSource() == loginButton){
            mainPage.setVisible(false);
            loginPage.setVisible(true);

            
        } else if(e.getSource() == createAccountButton){
            mainPage.setVisible(false);
            accountCreationGUI.setVisible(true);


        }else if(e.getSource() == submitAccountCreationButton){
            accountCreationGUI.setVisible(false);
            mainPage.setVisible(true);
            String user = userNameAccountCreationInput.getText();
            String password = passwordAccountCreationInput.getText(); 
            try {
                accountCreation(user,password,0);
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }else if(e.getSource() == loginSubmitButton){
            String currUNAttempt = UsernameInput.getText();
            String currPASSattempt = PasswordInput.getText();

            if(loggin(currUNAttempt, currPASSattempt)){
                loginPage.setVisible(false);
                acccountActionsGUI.setVisible(true);
                currnetBalance.setVisible(true);
                userBalanceLabel.setText(balanceLoad());
            }else {
                userNameAccountCreationInput.setText(currUNAttempt + " <- Incorrect");
                passwordAccountCreationInput.setText(currPASSattempt + " <- Incorrect");
            }

        }else if(e.getSource() == submitAccountCreationButton){
            accountCreationGUI.setVisible(false);
            loginPage.setVisible(true);


        }else if(e.getSource() == backButton ){
            bbGUI.setVisible(false);
            withdrawGUI.setVisible(false);  
            depositGUI.setVisible(false);
            acccountActionsGUI.setVisible(true);

        }else if(e.getSource() == depositChoiceButton){
            acccountActionsGUI.setVisible(false);
            depositGUI.setVisible(true);
            bbGUI.setVisible(true);

        }else if(e.getSource() == withdrawChoiceButton){
            acccountActionsGUI.setVisible(false);
            withdrawGUI.setVisible(true);
            bbGUI.setVisible(true);

        }else if(e.getSource() == depositSubmit ){ 
            changeBalance("deposit", Integer.valueOf(depositAmountGUI.getText()));
            userBalanceLabel.setText(balanceLoad());
            bbGUI.setVisible(false);
            depositGUI.setVisible(false);
            acccountActionsGUI.setVisible(true);
            dataSerializable ewws = new dataSerializable(fuserName, fPassword, balance);

        }else if(e.getSource() == withdrawSubmit){
            changeBalance("withdraw", Integer.parseInt(withdrawGUIinput.getText()));
            userBalanceLabel.setText(balanceLoad());
            dataSerializable er = new dataSerializable(fuserName, fPassword, balance);
            System.out.println(withdrawGUIinput.getText());
            bbGUI.setVisible(false);
            withdrawGUI.setVisible(false);  
            acccountActionsGUI.setVisible(true);

        }
    }
    //config dis joint use comments to organize and organize the static varriabvles


}

//Plan

/*
hava  bunch of pannels that take up the whole screen
make it so when buttons are clicekd they are takingaway using the setVisible



log:
finsh withdraw, deposit pages, finish seperate back button, finish account creation and config it all
*/