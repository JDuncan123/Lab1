// IDK what is to string
public class Photo {
	
	protected int length;
	protected int height;
	
	public Photo() {
		length=0;
		height=0;
	}

	public Photo(int len, int ht ) {
		length=len;
		height=ht;
	}
	
	public Photo(Photo pic) {
		setLength(pic.getLength());
		setHeight(pic.getHeight());
	}
	public void setLength(int len) {
		length=len;
	}
	
	public void setHeight(int ht) {
		height=ht;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getHeight() {
		return height;
	}
}
