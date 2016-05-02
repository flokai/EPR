package Teil5;

public class Dame {
	
	private int x;
	private int y;
	
	public Dame () {
		this.x = 1;
		this.y = 1;
	}
	
	public Dame (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX () {
		return this.x;	
	}	
	
	public int getY () {
		return this.y;		
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	public boolean canCapture (Dame dame) {
		if (this.x == dame.getX()){
			return true;
		} 
		else if (this.y == dame.getY()){
				return true;
		} 
		else if (dame.getX() - this.x == dame.getY() - this.y) {
			return true;
		}
		else if (dame.getX() - this.x == this.y - dame.getY()) {
			return true;
		}
		else return false;
		
	}
	

}
