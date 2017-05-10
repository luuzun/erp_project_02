package framework;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JCheckBox;

public class CheckBoxPanel extends CompPanel {
	
	public CheckBoxPanel() {
		pValue.setLayout(new GridLayout(1, 0, 0, 0));
	}

	public void setCheckItems(String... items) {
		for (int i = 0; i < items.length; i++) {
			pValue.add(new JCheckBox(items[i]));
		}
	}

	public void setSelectedItems(ArrayList<String> items) {
		JCheckBox jcb = null;
		for (String item : items) {
			for (Component c : pValue.getComponents()) {
				jcb = (JCheckBox) c;
				if (jcb.getText().equals(item)) {
					jcb.setSelected(true);
				}
			}
		}
	}

	public void setclearItems() {
		for (Component c : pValue.getComponents()) {
			((JCheckBox) c).setSelected(false);
		}
	}
	
	public ArrayList<String> getSelectedItems(){
		JCheckBox jcb = null;
		ArrayList<String> items = new ArrayList<>();
		for (Component c : pValue.getComponents()){
			jcb = (JCheckBox) c;
			if(jcb.isSelected()){
				items.add(jcb.getText());
			}
		}
		return items;
	}
}
