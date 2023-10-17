import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToeGame implements ActionListener {

    JFrame f = new JFrame();
    JPanel h = new JPanel();
    JPanel bt_panel = new JPanel();
    JLabel tf = new JLabel();
    JButton[] b = new JButton[9];
    int chance_flag = 0;
    Random r = new Random();
    boolean pl1_chance;
    
    //create constructor
    TicTacToeGame() {

        f.setSize(500, 500);
        f.setTitle("Tic Tac Toe Game by Trupti Tayde");
        f.setLayout(new BorderLayout());
        f.setVisible(true);
        f.getContentPane().setBackground(Color.black);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set hint text        
        tf.setBackground(Color.white);
        tf.setForeground(Color.black);
        tf.setFont(new Font("Arial", Font.BOLD, 25));
        tf.setHorizontalAlignment(JLabel.CENTER);
        tf.setOpaque(true);

        h.setLayout(new BorderLayout());
        h.setBounds(0, 0, 200, 100);

        //for rows and columns
        bt_panel.setLayout(new GridLayout(3, 3));
        bt_panel.setBackground(Color.yellow);

        //for X, O text 
        for (int i = 0; i < 9; i++){
            b[i] = new JButton();
            bt_panel.add(b[i]);
            b[i].setFont(new Font("Arial", Font.BOLD, 50));
            b[i].setFocusable(false);
            b[i].addActionListener(this);
        }
        
        //for adding textfield, hint text, button
        h.add(tf);
        f.add(h, BorderLayout.NORTH);
        f.add(bt_panel);

        startGame();
    }

    //for hint text
    public void startGame(){

        try {
            tf.setText("Loading....");
            Thread.sleep(4000);
        } catch (InterruptedException e){

            e.printStackTrace();
        }
        int chance=r.nextInt(100);

        if (chance%2 == 0){
            pl1_chance = true;
            tf.setText("X turn");
        } else {
            pl1_chance = false;
            tf.setText("O turn");
        }
    }

    //for game over, ties
    public void gameOver(String s){
        chance_flag = 0;
        Object[] option={"Restart","Exit"};
        int n=JOptionPane.showOptionDialog(f, "Game Over\n" + s, "Game Over", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
        if(n==0){
            f.dispose();
            new TicTacToeGame();
        }
        else{
            f.dispose();
        }
    
    }

    //conditions for X, O
    public void matchCheck(){
        if ((b[0].getText() == "X") && (b[1].getText() == "X") && (b[2].getText() == "X")) {
            xWins(0, 1, 2);
        }
        else if ((b[0].getText() == "X") && (b[4].getText() == "X") && (b[8].getText() == "X")) {
            xWins(0, 4, 8);
        }
        else if ((b[0].getText() == "X") && (b[3].getText() == "X") && (b[6].getText() == "X")) {
            xWins(0, 3, 6);
        }
        else if ((b[1].getText() == "X") && (b[4].getText() == "X") && (b[7].getText() == "X")) {
            xWins(1, 4, 7);
        }
        else if ((b[2].getText() == "X") && (b[4].getText() == "X") && (b[6].getText() == "X")) {
            xWins(2, 4, 6);
        }
        else if ((b[2].getText() == "X") && (b[5].getText() == "X") && (b[8].getText() == "X")) {
            xWins(2, 5, 8);
        }
       else if ((b[3].getText() == "X") && (b[4].getText() == "X") && (b[5].getText() == "X")) {
            xWins(3, 4, 5);
        }
       else if ((b[6].getText() == "X") && (b[7].getText() == "X") && (b[8].getText() == "X")) {
            xWins(6, 7, 8);
        }
        else if ((b[1].getText() == "O") && (b[4].getText() == "O") && (b[7].getText() == "O")) {
            oWins(1, 4, 7);
        }
        else if ((b[0].getText() == "O") && (b[1].getText() == "O") && (b[2].getText() == "O")) {
            oWins(0, 1, 2);
        }
        else if ((b[0].getText() == "O") && (b[3].getText() == "O") && (b[6].getText() == "O")) {
            oWins(0, 3, 6);
        }
        else if ((b[0].getText() == "O") && (b[4].getText() == "O") && (b[8].getText() == "O")) {
            oWins(0, 4, 8);
        }
        else if ((b[6].getText() == "O") && (b[7].getText() == "O") && (b[8].getText() == "O")) {
            oWins(6, 7, 8);
        }
        else if ((b[2].getText() == "O") && (b[4].getText() == "O") && (b[6].getText() == "O")) {
            oWins(2, 4, 6);
        }
        else if ((b[2].getText() == "O") && (b[5].getText() == "O") && (b[8].getText() == "O")) {
            oWins(2, 5, 8);
        }
        else if ((b[3].getText() == "O") && (b[4].getText() == "O") && (b[5].getText() == "O")) {
            oWins(3, 4, 5);
        } 
        else if(chance_flag==9){
            tf.setText("Match Tie");
             gameOver("Match Tie");
        }
    }

    //for X
    public void xWins(int x1, int x2, int x3){
        b[x1].setBackground(Color.red);
        b[x2].setBackground(Color.red);
        b[x3].setBackground(Color.red);

        for (int i = 0; i < 9; i++){
            b[i].setEnabled(false);
        }
        tf.setText("X wins");
        gameOver("X Wins");
    }

    //for O
    public void oWins(int x1, int x2, int x3){
        b[x1].setBackground(Color.blue);
        b[x2].setBackground(Color.blue);
        b[x3].setBackground(Color.blue);

        for (int i = 0; i < 9; i++){
            b[i].setEnabled(false);
        }
        tf.setText("O Wins");
        gameOver("O Wins");
    }
    
    //calling constructor
    public static void main(String[] args){
        new TicTacToeGame();
    }

    //action preformed
    @Override
    public void actionPerformed(ActionEvent e){

        for (int i = 0; i < 9; i++){
            if (e.getSource() == b[i]){
                if (pl1_chance) {
                    if (b[i].getText() == ""){
                        b[i].setForeground(Color.red);      //for X
                        b[i].setText("X");
                        pl1_chance = false;
                        tf.setText("O turn");
                        chance_flag++;
                        matchCheck();
                    }
                } 
                else{
                    if (b[i].getText() == ""){
                        b[i].setForeground(Color.green);     //for O
                        b[i].setText("O");
                        pl1_chance = true;
                        tf.setText("X turn");
                        chance_flag++;
                        matchCheck();
                    }
                }
            }
        }
    }

}
