import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JTextField nameInput;

  JLabel greetingOutput;

  JButton sayHello;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 
    //initialize the main JPanel
    mainPanel = new JPanel();
    //disable layout helpers
    mainPanel.setLayout(null);

    //initialize the button
    sayHello = new JButton("Say Hello");

    //set the location and size
    sayHello.setBounds(300,300,200,50);

    //add an action listener to the button
    sayHello.addActionListener(this);

    //set the action command on the button
    sayHello.setActionCommand("Say Hello");

    //initialize the output label
    greetingOutput = new JLabel();

    //set the location and size
    greetingOutput.setBounds(200,200,400,50);

    //initialize the input text fields
    nameInput = new JTextField();

    //set the location and size
    nameInput.setBounds(200,100,400,50);

    //add the button to the panel
    mainPanel.add(sayHello);

    //add the label to the panel
    mainPanel.add(greetingOutput);

    //add the text fields to the Panel
    mainPanel.add(nameInput);

    //add the panel to the window
    frame.add(mainPanel);


    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("Say Hello")){
      //get the text from the text field
      String name = nameInput.getText();

      greetingOutput.setText("Hello " + name);
    }

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
