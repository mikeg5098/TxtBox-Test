package program;
import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.Writer;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JList;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JLayeredPane;
import java.awt.Label;

public class Visual extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField place;
	private JTextField month;
	private JTextField day;
	private JTextField year;
	private JLabel label_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visual frame = new Visual();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		file.read();
		
	}



	public Visual()  {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEventInfo = new JLabel("Event Info");
		lblEventInfo.setFont(new Font("AppleGothic", Font.PLAIN, 23));
		
		name = new JTextField();
		name.setFont(new Font("AppleGothic", Font.PLAIN, 13));
		name.setColumns(10);
		
		place = new JTextField();
		place.setFont(new Font("AppleGothic", Font.PLAIN, 13));
		place.setColumns(10);
		
		month = new JTextField();
		month.setColumns(10);
		
		day = new JTextField();
		day.setColumns(10);
		
		year = new JTextField();
		year.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setFont(new Font("AppleGothic", Font.BOLD, 16));
		
		label_1 = new JLabel("/");
		label_1.setFont(new Font("AppleGothic", Font.BOLD, 16));
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("AppleGothic", Font.PLAIN, 14));
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("AppleGothic", Font.PLAIN, 14));
		
		JLabel lblPlace = new JLabel("Place");
		lblPlace.setFont(new Font("AppleGothic", Font.PLAIN, 14));
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("AppleGothic", Font.PLAIN, 14));
		
		
		final JTextArea descriptionBox = new JTextArea();
		
		

		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				/*
				 * WHAT THAT BUTTON DO
				 */
				
				
				String nameVal, placeVal, descriptionVal, output;
				
				
				
				nameVal = name.getText();
				placeVal = place.getText();
				String monthVal = month.getText();
				String dayVal = day.getText();
				String yearVal = year.getText();
				descriptionVal = descriptionBox.getText();
				
				Day.setName(name.getText());
				Day.setPlace(place.getText());
				Day.setMonth(monthVal);
				Day.setDay(dayVal);
				Day.setYear(yearVal);
				Day.setDescription(descriptionVal);
				
				Day.saveDay();
				
				
				
				
				output = "Name: " + '\n' + nameVal + '\n' + "Place" + '\n' + placeVal + '\n' + "Date" + '\n' + monthVal + "/"+ dayVal +"/"+ yearVal +'\n' + descriptionVal+ -1;
			
				System.out.println(output);
				
				name.setText("");
				place.setText("");
				month.setText("");
				day.setText("");
				year.setText("");
				descriptionBox.setText("");
				

			}
		});
		
		
		
		
		JButton btnGoto = new JButton("Go To Calendar");
		btnGoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		
		
		
		
		
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("/Users/user/Desktop/calendar.png"));
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(month, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(day, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(year, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
								.addComponent(name)
								.addComponent(place, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName)
								.addComponent(lblPlace, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblEventInfo, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(descriptionBox)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addGap(113)))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAdd)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnGoto))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
					.addGap(22))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblEventInfo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName))
							.addGap(7)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(month, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(day, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(place, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPlace, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(119)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnAdd)
										.addComponent(btnGoto)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(descriptionBox))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addComponent(lblNewLabel)))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
