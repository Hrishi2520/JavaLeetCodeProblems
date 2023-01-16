class JollyJumper {
	//function to check whether given sequence is jolly jumper or not.
	pulic static isJolly(int a[], int n) {
		//boolean vector to diffset set of differences.
		//the vector is initialized as false.
		boolean []diffSet = new boolean[n];
		//traverse all array elements
		for (int i = 0; i < n-1; i++) {
			//find absolute difference between current two
			int d = Math.abs(a[i] - a[i+1]);
			//if difference is out of range or repeated, return false.
			if(d == 0 || d > n - 1 || diffset[d] == true) 
				return false;
			//set presence of d in set.
			diffSet[d] = true
		}
		return true;
	} 
	//Driver Code
	public static void main(String [] args) {
		int a[] = {11, 7, 4, 2, 1, 6};
		int n = a.length;
		if(isJolly(a,n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}