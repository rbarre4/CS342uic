/* David Qiao
 * CS 342 Fall 2017
 * Professor Troy
 * Project 3 - Sudoku Solver (Menu)
 * Group - Boris Pisabaj, Robert Barrera
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBar extends JFrame {
	
	public MenuBar() {
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic( 'F' );

		JMenuItem saveItem = new JMenuItem( "Save puzzle" );
	    saveItem.setMnemonic( 'S' );
	    fileMenu.add( saveItem );
	    saveItem.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
		            {
		               //save file action to be placed here
		            }
	    		}
	    );
		
		
	    JMenuItem loadItem = new JMenuItem( "Load puzzle..." );
	    loadItem.setMnemonic( 'L' );
	    fileMenu.add( loadItem );
	    loadItem.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
		            {
		               //load file action to be placed here
		            }
	    		}
	    );
	    

	    JMenuItem exitItem = new JMenuItem( "Exit" );
	    exitItem.setMnemonic( 'x' );
	    fileMenu.add( exitItem );
	    exitItem.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				System.exit( 0 );
	    			}
	    		}
	    );
	    
	    
	    JMenu helpMenu = new JMenu("Help");
		helpMenu.setMnemonic( 'H' );
		
		JMenuItem how2play = new JMenuItem( "How to play Sudoku" );
	    how2play.setMnemonic( 'S' );
	    helpMenu.add( how2play );
	    how2play.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				JOptionPane.showMessageDialog( MenuBar.this,
	    		        "This is how you play Sudoku...",
	    		        "How to play", JOptionPane.PLAIN_MESSAGE );
	    			}
	    		}
	    );
	    
	    
	    JMenuItem how2interface = new JMenuItem( "How to use the interface" );
	    how2interface.setMnemonic( 'i' );
	    helpMenu.add( how2interface );
	    how2interface.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				JOptionPane.showMessageDialog( MenuBar.this,
	    	    		"This is how you use the interface...",
	    	    		"How to use", JOptionPane.PLAIN_MESSAGE );
	    			}
	    		}
	    );
	    
	    JMenuItem aboutItem = new JMenuItem( "About..." );
	    aboutItem.setMnemonic( 'A' );
	    helpMenu.add( aboutItem );
	    aboutItem.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				JOptionPane.showMessageDialog( MenuBar.this,
	    	    		"Robert Barrera - rbarre4 \nBoris Pisabaj - bpisab3 \nDavid Qiao - dqiao4",
	    	    		"Creators of this program", JOptionPane.PLAIN_MESSAGE );
	    			}
	    		}
	    );
	    
	    
	    JMenu hintMenu = new JMenu("Hints");
		hintMenu.setMnemonic( 'n' );
		
		JMenuItem checkOnFill = new JMenuItem( "Toggle Check on Fill mode" );
	    checkOnFill.setMnemonic( 'C' );
	    hintMenu.add( checkOnFill );
	    checkOnFill.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				//Check on Fill toggle to be placed here
	    			}
	    		}
	    );
	    
	    JMenuItem sAlgorithm = new JMenuItem( "Use Single Algorithm" );
	    sAlgorithm.setMnemonic( 'S' );
	    hintMenu.add( sAlgorithm );
	    sAlgorithm.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				//Single algorithm action to be placed here
	    			}
	    		}
	    );
	    
	    JMenuItem hAlgorithm = new JMenuItem( "Use Hidden Single Algorithm" );
	    hAlgorithm.setMnemonic( 'H' );
	    hintMenu.add( hAlgorithm );
	    hAlgorithm.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				//Hidden Single algorithm action to be placed here
	    			}
	    		}
	    );
	    
	    JMenuItem lAlgorithm = new JMenuItem( "Use Locked Candidate Algorithm" );
	    lAlgorithm.setMnemonic( 'L' );
	    hintMenu.add( lAlgorithm );
	    lAlgorithm.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				//Locked Candidate algorithm action to be placed here
	    			}
	    		}
	    );
	    
	    JMenuItem nAlgorithm = new JMenuItem( "Use Naked Pairs Algorithm" );
	    nAlgorithm.setMnemonic( 'N' );
	    hintMenu.add( nAlgorithm );
	    nAlgorithm.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				//Naked Pairs algorithm action to be placed here
	    			}
	    		}
	    );
	    
	    JMenuItem useAll = new JMenuItem( "Fill in all!" );
	    useAll.setMnemonic( 'a' );
	    hintMenu.add( useAll );
	    useAll.addActionListener(

	    		new ActionListener() {

	    			public void actionPerformed( ActionEvent event )
	    			{
	    				//all 4 algorithm actions placed here
	    			}
	    		}
	    );
	    
	    JMenuBar bar = new JMenuBar();  
	    setJMenuBar( bar );  
	    bar.add( fileMenu );
	    bar.add( helpMenu );
	    bar.add( hintMenu );
	    
	    JLabel displayLabel = new JLabel( "Sample Text", SwingConstants.CENTER );
	      displayLabel.setForeground( Color.BLACK );
	      displayLabel.setFont( new Font( "Serif", Font.PLAIN, 72 ) );

	      getContentPane().setBackground( Color.CYAN );
	      getContentPane().add( displayLabel, BorderLayout.CENTER );

	      setSize( 500, 200 );
	      setVisible( true );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuBar application = new MenuBar();
	    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}
