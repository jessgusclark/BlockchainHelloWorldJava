package blockchain.block;

public class Block {

	private int id; 
	private int nonce;
	private String hash;
	
	public Block(int i) {
		id = i;
	}
	
	
	public int getId(){
		return id;
	}
	
	public int getHash(){
		return this.hashCode();
	}
	
}
