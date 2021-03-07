/*	Christopher McClease
 * 	Assignment Three
 * 	Due 7 March 21
 */

package assignment_three;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class assignment_three {

	private JFrame chrisFrame;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField cityField;
	private JTextField stateField;
	private JTextField zipCodeField;
	private final ButtonGroup genderGroup = new ButtonGroup();
	private final ButtonGroup communicationGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					assignment_three window = new assignment_three();
					window.chrisFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public assignment_three() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		chrisFrame = new JFrame();
		chrisFrame.setResizable(false);
		chrisFrame.setBounds(100, 100, 720, 480);
		chrisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chrisFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Survey:");
		lblNewLabel.setBounds(16, 6, 83, 16);
		chrisFrame.getContentPane().add(lblNewLabel);
		
		JLabel firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setBounds(16, 34, 90, 16);
		chrisFrame.getContentPane().add(firstNameLabel);
		
		firstNameField = new JTextField();
		firstNameField.setBounds(104, 30, 130, 20);
		chrisFrame.getContentPane().add(firstNameField);
		firstNameField.setColumns(10);
		
		JLabel lastNameLabel = new JLabel("Last Name: ");
		lastNameLabel.setBounds(336, 34, 90, 16);
		chrisFrame.getContentPane().add(lastNameLabel);
		
		lastNameField = new JTextField();
		lastNameField.setBounds(438, 30, 130, 26);
		chrisFrame.getContentPane().add(lastNameField);
		lastNameField.setColumns(10);
		
		JLabel cityLabel = new JLabel("City: ");
		cityLabel.setBounds(16, 66, 61, 16);
		chrisFrame.getContentPane().add(cityLabel);
		
		cityField = new JTextField();
		cityField.setBounds(57, 61, 130, 26);
		chrisFrame.getContentPane().add(cityField);
		cityField.setColumns(10);
		
		JLabel stateLabel = new JLabel("State: ");
		stateLabel.setBounds(199, 66, 61, 16);
		chrisFrame.getContentPane().add(stateLabel);
		
		stateField = new JTextField();
		stateField.setBounds(240, 62, 40, 26);
		chrisFrame.getContentPane().add(stateField);
		stateField.setColumns(10);
		
		JLabel zipCodeLabel = new JLabel("Zip Code: ");
		zipCodeLabel.setBounds(327, 66, 80, 16);
		chrisFrame.getContentPane().add(zipCodeLabel);
		
		zipCodeField = new JTextField();
		zipCodeField.setBounds(405, 61, 80, 26);
		chrisFrame.getContentPane().add(zipCodeField);
		zipCodeField.setColumns(10);
		
		JLabel genderLabel = new JLabel("Gender: ");
		genderLabel.setBounds(16, 99, 61, 16);
		chrisFrame.getContentPane().add(genderLabel);
		
		JRadioButton genderRadioMale = new JRadioButton("Male");
		genderGroup.add(genderRadioMale);
		genderRadioMale.setBounds(89, 95, 70, 23);
		chrisFrame.getContentPane().add(genderRadioMale);
		
		JRadioButton genderRadioFemale = new JRadioButton("Female");
		genderGroup.add(genderRadioFemale);
		genderRadioFemale.setBounds(171, 95, 80, 23);
		chrisFrame.getContentPane().add(genderRadioFemale);
		
		JLabel interestsLabel = new JLabel("Interests:");
		interestsLabel.setBounds(16, 142, 140, 16);
		chrisFrame.getContentPane().add(interestsLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose One or More");
		lblNewLabel_1.setBounds(16, 162, 140, 16);
		chrisFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Communication Preference:");
		lblNewLabel_2.setBounds(240, 142, 180, 16);
		chrisFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Choose One");
		lblNewLabel_3.setBounds(240, 162, 80, 16);
		chrisFrame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox artCheckBox = new JCheckBox("Art");
		artCheckBox.setBounds(16, 190, 128, 23);
		chrisFrame.getContentPane().add(artCheckBox);
		
		JCheckBox scienceCheckBox = new JCheckBox("Science");
		scienceCheckBox.setBounds(16, 225, 128, 23);
		chrisFrame.getContentPane().add(scienceCheckBox);
		
		JCheckBox musicCheckBox = new JCheckBox("Music");
		musicCheckBox.setBounds(16, 260, 128, 23);
		chrisFrame.getContentPane().add(musicCheckBox);
		
		JCheckBox technologyCheckBox = new JCheckBox("Technology");
		technologyCheckBox.setBounds(16, 295, 128, 23);
		chrisFrame.getContentPane().add(technologyCheckBox);
		
		JCheckBox foodCheckBox = new JCheckBox("Food");
		foodCheckBox.setBounds(16, 330, 128, 23);
		chrisFrame.getContentPane().add(foodCheckBox);
		
		JCheckBox gamesCheckBoxy = new JCheckBox("Games");
		gamesCheckBoxy.setBounds(16, 365, 128, 23);
		chrisFrame.getContentPane().add(gamesCheckBoxy);
		
		JRadioButton emailRadioButton = new JRadioButton("Email");
		communicationGroup.add(emailRadioButton);
		emailRadioButton.setBounds(240, 190, 141, 23);
		chrisFrame.getContentPane().add(emailRadioButton);
		
		JRadioButton textMessageRadioButton = new JRadioButton("Text Message");
		communicationGroup.add(textMessageRadioButton);
		textMessageRadioButton.setBounds(240, 225, 141, 23);
		chrisFrame.getContentPane().add(textMessageRadioButton);
		
		JRadioButton phoneRadioButton = new JRadioButton("Phone");
		communicationGroup.add(phoneRadioButton);
		phoneRadioButton.setBounds(240, 260, 141, 23);
		chrisFrame.getContentPane().add(phoneRadioButton);
		
		JTextArea formDisplay = new JTextArea();
		formDisplay.setLineWrap(true);
		formDisplay.setEditable(false);
		formDisplay.setBounds(453, 142, 240, 285);
		chrisFrame.getContentPane().add(formDisplay);
		
		JButton displayButton = new JButton("Display");
		displayButton.setBounds(240, 324, 117, 29);
		chrisFrame.getContentPane().add(displayButton);
		displayButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				formDisplay.setText("");
				
				String gender;
				String communicationPreference;
				
				//determine Gender selection
				if(genderRadioFemale.isSelected()) {
					gender = "Female";
				}
				else if (genderRadioMale.isSelected()) {
					gender = "Male";
				}
				else gender = "unspecified";
				
				//determine communication selection
				if(emailRadioButton.isSelected()) {
					communicationPreference = "Email";
				}
				else if(textMessageRadioButton.isSelected()) {
					communicationPreference = "Text Message";
				}
				else if(phoneRadioButton.isSelected()) {
					communicationPreference = "Phone";
				}
				else communicationPreference = "unspecified";
				
				//Display form data in textfield.
				formDisplay.append(firstNameLabel.getText() + "\t" + firstNameField.getText() + "\n");
				formDisplay.append(lastNameLabel.getText() + "\t" + lastNameField.getText() + "\n");
				formDisplay.append(cityLabel.getText() + "\t" + cityField.getText() + "\n");
				formDisplay.append(stateLabel.getText() + "\t" + stateField.getText() + "\n");
				formDisplay.append(zipCodeLabel.getText() + "\t" + zipCodeField.getText() + "\n");
				formDisplay.append(genderLabel.getText() + "\t" + gender + "\n\n");
				formDisplay.append("Communication Preference: " + "\n\t" + communicationPreference + "\n");
				formDisplay.append(interestsLabel.getText() + "\n");
				
				//display interests that are checked
				if(artCheckBox.isSelected()) {
					formDisplay.append("\tArt\n");
				}
				if(scienceCheckBox.isSelected()) {
					formDisplay.append("\tScience\n");
				}
				if(musicCheckBox.isSelected()) {
					formDisplay.append("\tMusic\n");
				}
				if(technologyCheckBox.isSelected()) {
					formDisplay.append("\tTechnology\n");
				}
				if(foodCheckBox.isSelected()) {
					formDisplay.append("\tFood\n");
				}
				if(gamesCheckBoxy.isSelected()) {
					formDisplay.append("\tGames\n");
				}
			}
		});
	}
}

