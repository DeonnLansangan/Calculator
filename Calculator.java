import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Calculator extends JFrame
{
   String operator;
   double firstOperand, secondOperand, result;
   
   JButton calculateButton = new JButton();
   JButton exitButton = new JButton();
   
   JLabel firstLabel = new JLabel();
   JLabel secondLabel = new JLabel();
   JLabel thirdLabel = new JLabel();
   JLabel fourthLabel = new JLabel();
   
   JTextField firstTextField = new JTextField();
   JTextField secondTextField = new JTextField();
   JTextField thirdTextField = new JTextField();
   JTextField fourthTextField = new JTextField();
   
   public Calculator(){
      setTitle("Simple Calculator");
      
      getContentPane().setLayout(new GridBagLayout());
      GridBagConstraints gridConstraints = new GridBagConstraints();
      
      calculateButton.setText("Calculate");
      gridConstraints.gridx = 0;
      gridConstraints.gridy = 4;
      getContentPane().add(calculateButton, gridConstraints);
      
      calculateButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            calculateButtonActionPerformer(e);
        };
      });
      
      exitButton.setText("Exit");
      gridConstraints.gridx = 1;
      gridConstraints.gridy = 4;
      getContentPane().add(exitButton, gridConstraints);
      
      exitButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           exitButtonActionPerformer(e);
        };
      });
      
      firstLabel.setText("Operand 1:");
      gridConstraints.gridx = 0;
      gridConstraints.gridy = 0;
      getContentPane().add(firstLabel, gridConstraints);
      
      secondLabel.setText("Operator:");
      gridConstraints.gridx = 0;
      gridConstraints.gridy = 1;
      getContentPane().add(secondLabel, gridConstraints);
      
      thirdLabel.setText("Operand 2:");
      gridConstraints.gridx = 0;
      gridConstraints.gridy = 2;
      getContentPane().add(thirdLabel, gridConstraints);
      
      fourthLabel.setText("Result:");
      gridConstraints.gridx = 0;
      gridConstraints.gridy = 3;
      getContentPane().add(fourthLabel, gridConstraints);
      
      firstTextField.setText("");
      firstTextField.setColumns(10);
      gridConstraints.gridx = 1;
      gridConstraints.gridy = 0;
      getContentPane().add(firstTextField, gridConstraints);
      
      secondTextField.setText("");
      secondTextField.setColumns(3);
      gridConstraints.gridx = 1;
      gridConstraints.gridy = 1;
      getContentPane().add(secondTextField, gridConstraints);
      
      thirdTextField.setText("");
      thirdTextField.setColumns(10);
      gridConstraints.gridx = 1;
      gridConstraints.gridy = 2;
      getContentPane().add(thirdTextField, gridConstraints);
      
      fourthTextField.setText("");
      fourthTextField.setColumns(10);
      gridConstraints.gridx = 1;
      gridConstraints.gridy = 3;
      getContentPane().add(fourthTextField, gridConstraints);
      
      addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            exitForm(e);   
         }  
      });
      pack();
   }
   
   private void exitForm(WindowEvent e){
      JFrame f = new JFrame();
      JOptionPane.showMessageDialog(f,"Exiting Calculator");
   }
   
   private void calculateButtonActionPerformer(ActionEvent e){
      operator = secondTextField.getText();
      firstOperand = Double.parseDouble(firstTextField.getText());
      secondOperand = Double.parseDouble(thirdTextField.getText());

      if (operator.equals("+")){
        result = firstOperand + secondOperand;    
      }
      
      if (operator.equals("-")){
        result = firstOperand - secondOperand;   
      }
      
      if (operator.equals("*")){
        result = firstOperand * secondOperand;    
      }
      
      if (operator.equals("/")){
        result = firstOperand / secondOperand;   
      }
      
      fourthTextField.setText(String.valueOf(result));
   }
   
   private void exitButtonActionPerformer(ActionEvent e){
      JFrame f = new JFrame();
      JOptionPane.showMessageDialog(f,"Exiting Calculator");
      System.exit(0);
   }
   
   public static void main (String[] args){
      new Calculator().show();
   }

}
