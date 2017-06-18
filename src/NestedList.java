import java.util.List;

//Calculate the sum of a nested list of int array, multiply by depth
//http://readyforsoftwareinterview.blogspot.com/

public class NestedList {
	private Integer val;
	private List<NestedList> n1;

	public NestedList(Integer val){
		this.val=val;
	}

	public boolean isNestedList() {
	return n1 != null;
	}

	public Integer depthSum(){
		return cal(this,1);
	}

	public Integer cal(NestedList nestedList,Integer depth){
		Integer totalSum= nestedList.val*depth;
		if(nestedList.isNestedList()){
			int newDepth=++depth;
			for(NestedList nestedList1 : nestedList.n1){
				totalSum += cal(nestedList,newDepth);
			}

		}
		return totalSum;
	}






}


//{1,{2,{3,{4,5}}} = 1*1 + 2*2 + 3*3 + 4*4 + 5*4 = 1+4+9+16+20=50