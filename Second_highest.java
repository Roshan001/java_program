
public class Second_highest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] integer = {20,10,40,30,50,60,90,80,100};
		int flag = 0;
		double[] arr = {1.1,1.2,1.3,1.8,1.5,1.9,0.9};
		double small = Integer.MAX_VALUE, sec_small = Integer.MAX_VALUE;
		System.out.println(Integer.MAX_VALUE);
		for(int i=arr.length-1;i>=0;i--){				
			if(small > arr[i]){
				sec_small = small;
				small = arr[i];
			}
			else
			flag++;;
		
		}
		System.out.println(small);
		if(flag==arr.length-1){
			for(int i=arr.length-1;i>=0;i--){
				if(arr[i]!=small && sec_small>arr[i]){
					sec_small = arr[i];
				}
			}
		}
		
		
		
		System.out.println("Sec small: "+sec_small);
	}

}

