

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class GUIDeal extends JFrame {

	public JTextArea output; 
	public JScrollPane scrollPane;
	public JLabel GorN;
	public JButton sb1;
	public JButton sb2;
	public JButton sb3;
	public JLabel sb4;
	public JButton sb5;
	public JLabel sb6;
	public JButton sb7;
	public JButton sb8;
	public JLabel pickCase;
	public JTextField num;
	public JTextField num2;
	public DealGame game;
	public Case selectedCase;
	Board theBoard = new Board();
	Banker theBanker = new Banker();
	
	
	public static void main(String[] args) {
		GUIDeal gui = new GUIDeal();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(700, 650);
		gui.setVisible(true);
			
	}
	
	public GUIDeal() {
		super("deal or no deal");
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		myInner theInner = new myInner();
		
		JLabel opening = new JLabel("Welcome to deal or no deal!");
		add(opening);
		
		GorN = new JLabel("Would you like to play with greedy banker or normal?");
		add(GorN);
		
		sb1 = new JButton("Greedy");
		add(sb1);
		sb1.addActionListener(theInner);
		
		
		sb2 = new JButton("Not Greedy");
		add(sb2);
		sb2.addActionListener(theInner);
		
		pickCase = new JLabel("What case? 1 - 24 ");
		add(pickCase);
		
		num = new JTextField(6);
		add(num);
		
		sb3 = new JButton("This One");
		add(sb3);
		sb3.addActionListener(theInner);
		sb3.setEnabled(false);
		
		sb4 = new JLabel("Eliminate which?");
		add(sb4);
		
		num2 = new JTextField(6);
		add(num2);
		
		sb5 = new JButton("Eliminate");
		add(sb5);
		sb5.addActionListener(theInner);
		sb5.setEnabled(false);
		
		sb6 = new JLabel("Accept Offer?");
		add(sb6);
		
		sb7 = new JButton("Yes");
		add(sb7);
		sb7.addActionListener(theInner);
		sb7.setEnabled(false);
		
		sb8 = new JButton("No");
		add(sb8);
		sb8.addActionListener(theInner);
		sb8.setEnabled(false);
		
		output = new JTextArea(30, 80);
		scrollPane = new JScrollPane(output);
		add(scrollPane);
		
		output.setEditable(false);
		output.setCaretPosition(output.getDocument().getLength());
//		output.setText(DealGame.getWelcomeMessage());
//		output.append("Text");
		output.setFont(new Font("monospaced", Font.PLAIN, 12));
	}
	
	private class myInner implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			
			if(e.getSource() == sb1) { //greedy choice
				game = new GreedyDealGame();
				output.setText(DealGame.getWelcomeMessage());
				sb1.setEnabled(false);
				sb2.setEnabled(false);
				sb3.setEnabled(true);
				
			}
			
			if(e.getSource() == sb2) { //not greedy choice
				game = new DealGame();
				output.setText(DealGame.getWelcomeMessage());
				sb1.setEnabled(false);
				sb2.setEnabled(false);
				sb3.setEnabled(true);
				
			}
		
			
			if(e.getSource() == sb3) {
				int selectedCaseInt = Integer.parseInt(num.getText());
				selectedCase = game.selectCase(selectedCaseInt);
				output.append(String.format("\nYou selected case %d and now it is time to eliminate cases.\n", selectedCaseInt));
				sb3.setEnabled(false);
				sb5.setEnabled(true);	
				num.setEnabled(false);
				output.append(game.showRemainingValues());
				output.append(game.showRemainingCases());
				output.append(String.format("\nPlease select a case to eliminate:  "));

				
			}			
			
			if(e.getSource() == sb5) { //eliminateButton
			
					int eliminatedCaseInt = Integer.parseInt(num2.getText());
					Case eliminatedCase = game.getCase(eliminatedCaseInt);
						
					if (eliminatedCase.isEliminated() || eliminatedCase.isSelected()) {
						output.append("That case was already selected");
						num2.setText("");
						//restart while loop
						} //end if
					else  {
						Case c = game.eliminateCase(eliminatedCaseInt);
						int s = (c.getAmount());
						output.append(String.format("Case %d held %,d\n", eliminatedCaseInt, s));
						int offerValue = game.offerValue(game.getCases());
						output.append(String.format("I am offering you %,d for your case. Do you accept?\n", offerValue));
						sb5.setEnabled(false);
						sb7.setEnabled(true);
						sb8.setEnabled(true);
					}
					
			
			
			}
			
			if(e.getSource() == sb7) {
				
				sb7.setEnabled(false);
				sb8.setEnabled(false);
				int a = game.offerValue(game.getCases());
				output.append(String.format("Great job taking the deal! You took home $%,d\n" , a));
				int selectedCaseInt = Integer.parseInt(num.getText());
				Case selectedCase = game.selectCase(selectedCaseInt);
				int s = selectedCase.getFinalAmount();
				
				if (game.offerValue(game.getCases()) < selectedCase.getFinalAmount()) {
						output.append(String.format("\nNot a great deal. Your case had $%,d\n" , s));
						game.printCertificate(game.offerValue(game.getCases()));
						
					} //end if
				else {
						
						output.append(String.format("\nNice job! Your case had $%,d\n" , s));
						game.printCertificate(game.offerValue(game.getCases()));
				}
			}
			
			if(e.getSource() == sb8) {
				sb7.setEnabled(false);
				sb8.setEnabled(false);
				sb5.setEnabled(true);
				num2.setText("");
				output.append(game.showRemainingValues());
				output.append(game.showRemainingCases());
				output.append("\n\nPlease select a case to eliminate: ");
				
			}
			
//		} //end for loop
	
		}
	} 
} 
