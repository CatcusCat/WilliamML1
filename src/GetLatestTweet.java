import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {

	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JTextField tf1 = new JTextField();
	JButton b1 = new JButton();
	JTextPane tp1 = new JTextPane();
	
	

	public static void main(String[] args) {
		
		new GetLatestTweet();
	}

	public GetLatestTweet() {
		f1.setLayout(new GridLayout(2, 1));
		f1.add(p1);
		f1.add(p2);
		p1.setLayout(new GridLayout(2, 1));
		p1.add(tf1);
		p1.add(b1);
		b1.setText("Search the Twitterverse");
		p1.setBackground(new Color(0, 220, 255));
		p2.setBackground(new Color(0, 220, 255));
		b1.addActionListener(this);
		p2.add(tp1);
		tf1.setSize(15, 1);
		tp1.setPreferredSize(new Dimension(300, 100));
		tp1.setEditable(false);
		JScrollPane scroll = new JScrollPane(tp1);
		p2.add(scroll);
		

		f1.pack();
		f1.setDefaultCloseOperation(3);
		f1.setVisible(true);
		JOptionPane.showMessageDialog(null, "Top: Text Input Keywords \n Centre: Search for Tweets \n Bottom: 15 Latest Tweets");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			tp1.setText(getLatestTweet(tf1.getText()) + "\n New Tweet: \n");

		}
	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		String meme = "";
		
		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);

		

			for (int i = 0; i < 14; i++) {
				meme += result.getTweets().get(i).getText() ; 
			}

			return meme;

		} catch (Exception e) {
			System.err.print(e.getMessage());
			return meme;
		}
	}

}
