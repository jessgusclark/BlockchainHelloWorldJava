package blockchain.block;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BlockTest {

	@Test
	public void testCreateBlock() {
		
		Block b = new Block(1);
		Assert.assertSame(1, b.getId());
	
		Assert.assertSame(0, b.getHash());
		
	}

}
