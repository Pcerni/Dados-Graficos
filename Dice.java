import javax.swing.*;
import java.awt.event.*;

public class Dice extends JFrame implements ActionListener{

 private JButton botonRoll;
 private JLabel texto;
 
 public Dice(){
  setLayout(null);
  botonRoll = new JButton("ROLL!");
  botonRoll.setBounds(80,60,70,70);
  add(botonRoll);
  botonRoll.addActionListener(this);

  texto = new JLabel("Wait");
  texto.setBounds(100,20,100,20);
  add(texto);
 }

 public void Dados(){
  int [] dados = {1,2,3,4,5,6};
   int random = (int)(Math.random() * (dados.length +1));
   int randomu = (int)(Math.random() * (dados.length +1));
   if (random == 0){
     random ++;
   }if (randomu == 0){
     randomu ++;
   }
    texto.setText ("[" + random + "]" + "[" + randomu + "]" );
 }
  
 public void actionPerformed(ActionEvent captura){
  if(captura.getSource() == botonRoll){
   Dados();
  }
 }

 public static void main(String args[]){

  Dice cuadro = new Dice();
  cuadro.setBounds(0,0,250,250);
  cuadro.setVisible(true);
  cuadro.setResizable(false);
  cuadro.setLocationRelativeTo(null);
  cuadro.setTitle("Dados");
 }
}