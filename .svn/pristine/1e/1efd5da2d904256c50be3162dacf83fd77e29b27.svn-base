package com.project;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

@SuppressWarnings("serial")
public class TreePanel extends JFrame implements TreeSelectionListener{
	
	private JPanel treepane;
	private JPanel detailpane;
	private JPanel inputpane;
	TrieNode root;

	/**
	 * Initializes our GUI and sets the title for the application
	 */
	public TreePanel() {
		this.setLayout(new BorderLayout());
		this.setTitle("Trie");
		detailpane = new DetailPanel(this);
		treepane = new TreeDisplay(this);
		inputpane = new InputPanel((TreeDisplay) treepane);
		
		add(treepane, BorderLayout.WEST);
		add(detailpane, BorderLayout.EAST);
		add(inputpane, BorderLayout.SOUTH);

	}
	

	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
