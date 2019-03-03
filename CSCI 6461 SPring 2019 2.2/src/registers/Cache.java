package registers;

import java.util.LinkedList;

import instructions.UnitConverter;

/**
 * 
 * @author Implement a fully associative cache A fully associative cache
 *         consists of a single set (i.e., E = C/B) that contains all of the
 *         cache lines
 */
public class Cache {
	LinkedList<CacheLine> cacheLine;

	Memory memory;
	/*
	 * Class CacheLine
	 * a fullt associative cache contains tag and block offset
	 */
	public class CacheLine {
		int tag;
		String data;
		
		public CacheLine(int tag,String data ) {
			this.tag = tag;
			this.data = data;
		}
		public int getTag() {
			return this.tag;
		}
		
		public void setTag(int tag) {
			this.tag = tag;
		}
		
		public String getData() {
			return this.data;
		}
		
		public void setData(String data) {
			this.data = data;
		}
	}
	
	
	
	public Cache() {
		this.cacheLine = new LinkedList<CacheLine>();
		
	}
	
	public LinkedList<CacheLine> getCacheLine(){
		return cacheLine;
	}
	/*
	public String getFromCache(String address) {
		for(CacheLine lineInCache : cache.getCacheLine()) {
			if(UnitConverter.binaryStringToInteger(address) == lineInCache.getTag()) {
				return lineInCache.getData();
						
			}
		}
		//cannot find from cache
		String data = memory.getFromMemory(UnitConverter.binaryStringToInteger(address));
		cache.setToCache(UnitConverter.binaryStringToInteger(address), data);
		return data;
	}
	*/
	public void setToCache(int address, String value) {
		//assume cache with 16 lines
		if(this.cacheLine.size() >= 16) {
			//using FIFO method
			this.cacheLine.removeLast();
		}
		else
			this.cacheLine.addFirst(new CacheLine(address, value));
	}
	
	
}
