package com.project;
import java.util.Collection;
import java.util.TreeMap;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


/**
 * Implementation of a Trie node and contains everything we need to be able to implement our trie and GUI.
 * @author Anthony and Kevin
 *
 */
public class TrieNode extends DefaultMutableTreeNode{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private char character;
	private String string;
	private TrieNode parent;
	/**
	 * My basic idea for a TrieNode, change as you see fit.
	 */
	private TreeMap<Character, TrieNode> children;
	private int value;
	public TrieNode(char c, String name, TrieNode parent){
		super(name);
		children = new TreeMap<Character,TrieNode>();
		value = -1;
		this.character = c;
		string = null;
		this.parent = parent;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public TrieNode getChild(char c){
		return children.get(c);
	}
	
	public void giveChild(char c, DefaultTreeModel model){
		TrieNode newNode = new TrieNode(c, c + "", this);
		children.put(c, newNode);
		super.add(newNode);
		model.insertNodeInto(newNode, this, children.size() - 1);
	}
	
	public boolean hasChild(char c){
		return children.containsKey(c);
	}
	
	public int numChildren(){
		return children.size();
	}
	
	public void removeChild(char c, DefaultTreeModel model){
		TrieNode node = children.get(c);
		model.removeNodeFromParent(node);
		children.remove(c);
	}
	
	public Collection<TrieNode> getAllChildren(){
		return children.values();
	}
	public char getCharacter(){
		return character;
	}
	
	public void setString(String s){
		this.string = s;
	}
	
	public String getString(){
		return string;
	}
}
