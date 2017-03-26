import java.util.Random;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

class GuessingCapitals {

    static int correctAnswers = 0;
    static int questions = 0;


    public static void main(String[] args) {

        Random ran = new Random();

        String[][] UsList = {{"Alabama", "Montgomery"}, // [0][0], [0][1] 
                {"Alaska", "Juneau"}, // [1][0], [1][1]
                {"Arizona", "Phoenix"}, // [2][0], [2][1]
                {"Arkansas", "Little Rock"}, // [3][0], [3][1]
                {"California", "Sacremento"}, // [4][0], [4][1]
                {"Colorado", "Denver"}, // [5][0], [5][1]
                {"Connecticut", "Hartford"}, // [6][0], [6][1]
                {"Delaware", "Dover"}, // [7][0], [7][1]
                {"Florida", "Tallahassee"}, // [8][0], [8][1]
                {"Georgia", "Atalnta"}, // [9][0], [9][1]
                {"Hawaii", "Honolulu"}, // [10][0], [10][1]
                {"Idaho", "Boise"}, // [11][0], [11][1]
                {"Illinois", "Springfield"}, // [12][0], [12][1]
                {"Indiana", "Indianapolis"}, // [13][0], [13][1]
                {"Iowa", "Des Moines"}, // [14][0], [14][1]
                {"Kansas", "Topeka"}, // [15][0], [15][1]
                {"Kentucky", "Frankfort"}, // [16][0], [16][1]
                {"Louisiana", "Baton Rogue"}, // [17][0], [17][1]
                {"Maine", "Augusta"}, // [18][0], [18][1]
                {"Maryland", "Annapolis"}, // [19][0], [19][1]
                {"Massachusetts", "Boston"}, // [20][0], [20][1]
                {"Michigan", "Lansing"}, // [21][0], [21][1]
                {"Minnesota", "Saint Paul"}, // [22][0], [22][1]
                {"Mississippi", "Jackson"}, // [23][0], [23][1]
                {"Missouri", "Jefferson City"}, // [24][0], [24][1]
                {"Montana", "Helena"}, // [25][0], [25][1]
                {"Nebraska", "Lincoln"}, // [26][0], [26][1]
                {"Nevada", "Carson City"}, // [27][0], [27][1]
                {"New Hampshire", "Concord"}, // [28][0], [28][1]
                {"New Jersey", "Trenton"}, // [29][0], [29][1]
                {"New Mexico", "Santa Fe"}, // [30][0], [30][1]
                {"New York", "Albany"}, // [31][0], [31][1]
                {"North Carolina", "Raleigh"}, // [32][0], [32][1]
                {"North Dakota", "Bismarck"}, // [33][0], [33][1]
                {"Ohio", "Columbus"}, // [34][0], [34][1]
                {"Oklahoma", "Oklahoma City"}, // [35][0], [35][1]
                {"Oregon", "Salem"}, // [36][0], [36][1]
                {"Pennsylvania", "Harrisburg"}, // [37][0], [37][1]
                {"Rhode Island", "Providence"}, // [38][0], [38][1]
                {"South Carolina", "Columbia"}, // [39][0], [39][1]
                {"South Dakota", "Pierre"}, // [40][0], [40][1]
                {"Tennessee", "Nashville"}, // [41][0], [41][1]
                {"Texas", "Austin"}, // [42][0], [42][1]
                {"Utah", "Salt Lake City"}, // [43][0], [43][1]
                {"Vermont", "Montpelier"}, // [44][0], [44][1]
                {"Virginia", "Richmond"}, // [45][0], [45][1]
                {"Washington", "Olympia"}, // [46][0], [46][1]
                {"West Virginia", "Richmond"}, // [47][0], [47][1]
                {"Wisconsin", "Madison"}, // [48][0], [48][1]
                {"Wyoming", "Cheyenne"}, // [49][0], [49][1]
        };



        int count = 0;
        // Create loop that stores users answers and counts the number of them that are correct then displays message

        while(questions < 10){

            int stateGen = ran.nextInt(UsList.length); 
            //int capGen = ran.nextInt(2);
            if (count == questions){
                // Create a button with text OK
                JButton jbtOK = new JButton("OK");
                // Create a label with text "What is the capital of "State name from UsList array" : "
                JLabel jlblName = new JLabel("What is the capital of " + UsList[stateGen][0] + "?");
                //Create text field with text "Type your name here: "
                JTextField jtfName = new JTextField("Capitlize your response");

                JPanel myPanel = new JPanel();  // Create a panel to hold buttons for JFrame
                myPanel.add(jbtOK); // Add the button to the panel
                myPanel.add(jlblName); //Add the label to the panel
                myPanel.add(jtfName); // Add the text field to the panel

                JFrame frame = new JFrame(); // Create a Frame (goes into loop 10x)
                frame.setTitle("Input");
                frame.setSize(450, 100);
                frame.setLocation(200, 100);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.add(myPanel);   // Add panel to the frame


                jbtOK.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String answer = jtfName.getText();



                        if (answer.equals(UsList[stateGen][1])){
                            JOptionPane.showMessageDialog(null, "Your answer is correct");
                            correctAnswers++;


                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Your answer is incorrect");


                        }

                        JOptionPane.getRootFrame().dispose();
                        frame.dispose();
                        questions++;

                    } 
                });
                count++;
                if(count > 10){
                    frame.dispose();
                }
            }
        }


        JOptionPane.showMessageDialog(null, "Your got " + correctAnswers + " correct anwsers out of 10");
    }

}