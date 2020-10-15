package edu.yaksha.stockItems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemService {
	public Set<Item> collectAllItems(List<String> inputList)
	{
		 Set<Item> itemSet=new HashSet<>();
		 for(String itemDetails:inputList)
		 {
		/* Your Code */
    	 try
    	 {
    		 /* 
    		  * your code
    		  */
    	 }
    	 catch(PriceException p) {}
    	 catch(GradeMismatchedException g) {}
    	 catch(EssentialCommodityException e) {}
     }// end of loop
		 return itemSet;
	}
	

}
