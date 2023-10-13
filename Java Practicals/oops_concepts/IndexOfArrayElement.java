package oops_concepts;

public class IndexOfArrayElement {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		int item=5;
		int index=-1;
		for(int i=0;i<=array.length;i++)
			if(array[i]==item)
			{
				index=i;
				break;
			}
		System.out.println("5 is located at "+index+" index.");
	}

}
