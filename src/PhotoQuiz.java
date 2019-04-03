/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window
        quizWindow.setSize(1500, 1500);
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
		String Image = "https://icdn2.digitaltrends.com/image/lamborghini-factory-tour_0980-640x640.jpg";
        // 2. create a variable ofItype "Component" that will hold your image
        Component comp;
		// 3. use the "createImage()" method below to initialize your Component
        comp = createImage(Image);
		// 4. add the image to the quiz window
        quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
        String Awnser = JOptionPane.showInputDialog("Did you make this?");
		// 7. print "CORRECT" if the user gave the right answer
        if (Awnser.equals("Yes")||Awnser.equals("yes")) {
        	System.out.println("CORRECT");
        }
		// 8. print "INCORRECT" if the answer is wrong
        else {
        	System.out.println("INCORRECT");
        }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line of code)
        Image = "https://images-na.ssl-images-amazon.com/images/I/81tlnWRchdL._SX425_.jpg";
        //Image = "https://assets.dyler.com/uploads/cars/3067/409608/large_lamborghini-aventador-full-handmade-cabriolet-roadster-2015-yellow-for-sale.jpg";
		// 11. add the second image to the quiz window
       	comp = createImage(Image);
       	System.out.println(comp);
       	quizWindow.add(comp);
		// 12. pack the quiz window
        quizWindow.pack();
		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





