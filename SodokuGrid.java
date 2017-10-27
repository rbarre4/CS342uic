import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridPanel extends JPanel implements ActionListener {
	
	private Container largeContainer, smallContainer, gridContainer;
	private GridLayout grid, miniGrid;
	
	private MyJButton gridButtons[];
	private JPanel mainGrid[];
	private JPanel panel;

	
	private boolean toggle = true;
	private String placeHolders[] = {"1", "2", "3", "4", "5", "6","7","8","9"};
	
	
	
	public GridPanel(){
		
		grid = new GridLayout(3, 3, 5, 5);
		miniGrid = new GridLayout(3, 3, 0, 0);
		//ourMenu = new MenuBar();
		//largeContainer = getContentPane();
		//largeContainer.setLayout(grid);
		//largeContainer.add(new MenuBar());
		
		panel = new JPanel(grid);
		panel.setLayout(new BorderLayout());
		
		//largeContainer.add(panel);
		gridButtons = new MyJButton[9];
		mainGrid = new MyJPanel[9];
		
		for(int i = 0; i < 9; i++)
		{
			
			mainGrid[i] = new MyJPanel(miniGrid, i+1);
			
			smallContainer = mainGrid[i];
			smallContainer.setLayout(miniGrid);
	
			panel.add(mainGrid[i]);
			for(int j = 0; j < gridButtons.length; j++){
				gridButtons[j] = new MyJButton(placeHolders[j]);
				gridButtons[j].setNumber(j);
				gridButtons[j].addActionListener(this);
				smallContainer.add(gridButtons[j]);
				
			}
			
		}
		setSize(500,500);
		setVisible( true );
		
		
		
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(toggle){
			
		}
		toggle = !toggle;
		smallContainer.validate();
		
	//	MyJButton temp = ()
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		SodokuGrid application = new SodokuGrid();
	    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}*/
	
	

}

class MyJPanel extends JPanel
{
	int region;
	public MyJPanel(GridLayout g, int r){
		super(g);
		region = r;
	}
	public int getRegion(){
		return this.region;
	}
	public void setRegion(int r){
		region = r;
	}
	
}


class MyJButton extends JButton
{
  private int num;
  private int x;
  private int y;
  public MyJButton ( String text )
  {
    super (text);
    //setText (text);
  }
  
  public MyJButton (String text, int a, int b){
	  super(text);
	  x = a;
	  y = b;
  }
  
  public MyJButton ( String text , int n)
  {
    super (text);
    num = n;
  }
  
  public void setNumber (int n)
  {
    num = n;
  }
  
  public int getNumber ()
  {
    return num;
  }
  public void setCoordintes(int a, int b){
	  this.x = a;
	  this.y = b;
  }
  
  public int getXCoordinate(){
	  return this.x;
  }
  
  public int getYCoordinate(){
	  return this.y;
  }
}

