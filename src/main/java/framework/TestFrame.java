package framework;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnOk;
	private TextFieldPanel panel;
	//private ComboPanel<T> panel_1;
	private RadioPanel panel_3;
	private CheckBoxPanel panel_5;
	private TextFieldFormatPanel panel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("[0-9]{4}");
//		Pattern pattern = Pattern.compile("[0-9a-z]*");
//		Pattern pattern = Pattern.compile("[^0-9]*");
//		Pattern pattern = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}");
		Pattern pattern = Pattern.compile(".*many.*");
		Matcher matcher = pattern.matcher("many123");
		System.out.println(matcher.matches());
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame frame = new TestFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

	/**
	 * Create the frame.
	 */
	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new TextFieldPanel();
		panel.setTitle("부서");
		panel.setTfValue("부서다");
		contentPane.add(panel);
		
		
			
		/*panel_1 = new ComboPanel();
			class Title{
				int no;
				String name;
				
				public Title(int no, String name) {
					
					this.no = no;
					this.name = name;
				}

				@Override
				public String toString() {
					return String.format("Title [no=%s, name=%s]", no, name);
				}

				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + no;
					return result;
				}

				@Override
				public boolean equals(Object obj) {
					if (this == obj) {
						return true;
					}
					if (obj == null) {
						return false;
					}
					if (!(obj instanceof Title)) {
						return false;
					}
					Title other = (Title) obj;
					if (no != other.no) {
						return false;
					}
					return true;
				}
			}*/
		
		//Vector<Title> items = new Vector<>();
		//items.add(new Title(1, "이승우"));
		//panel_1.setComboData(items);
		//contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		panel_2.add(btnOk);
		
		panel_3 = new RadioPanel();
		panel_3.setRadioItems("나","가","다");
		panel_3.setSelectedItem("가");
		contentPane.add(panel_3);
		
		panel_1 = new TextFieldFormatPanel();
		contentPane.add(panel_1);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		String.format("%s", "");
		JOptionPane.showMessageDialog(null, panel.getTfValue());
	}

	
}
