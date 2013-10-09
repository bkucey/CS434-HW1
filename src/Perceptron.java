import java.util.ArrayList;
import java.util.List;


public class Perceptron {
	
	public class getRandomListElement<T>
	{
		private T [] listCopy;
		private Boolean[] gottenItems;
		
		public getRandomListElement(List<T> list)
		{
			listCopy = list.toArray(null);//giving the method null will make it return a new array copy  
			gottenItems = new Boolean [listCopy.length];//gives one boolean for each element of the list
			for(int i = 0;i<listCopy.length;i++)
			{
				gottenItems[i]=false;//initializes all the elements to indicate "not used"
			}
		}
		
		public T getRandomElement()
		{
			Boolean done = true;
			for(int i=0;i<listCopy.length;i++)//check to see if there are any elements left to return
			{
				if(!gottenItems[i])//there are more elements to return
				{ 
					done = false;
					break;
				}
			}
			if(done)//no more elements to be returned
			{
				return null;
			}else{//there are more elements to be returned
				int element;
				do{
					element = (int) (Math.random()*listCopy.length);//try another random element
				}while(gottenItems[element]);
				gottenItems[element]=true;//show this element has been used
				return listCopy[element];//return an element that hasn't been used before
			}
		}
	}
}
