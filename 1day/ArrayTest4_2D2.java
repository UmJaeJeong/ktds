
public class ArrayTest4_2D2 {

	public static void main(String[] args) {
		
		//2. 리터널
		int[][] n = {{1,2,3},{5,4},{6}};
		for(int i=0; i<n.length;i++) {
			for(int j=0; j<n[i].length;j++) {
				System.out.println("["+i+"]"+"["+j+"] = "+ n[i][j]);
			}
		}
		
		// 3. new+ liternal 혼합
		int[][] n2 = new int[][] {{1,2,3},{5,4},{6}};
		for(int i=0; i<n.length;i++) {
			for(int j=0; j<n[i].length;j++) {
				System.out.println("["+i+"]"+"["+j+"] = "+ n[i][j]);
			}
		}
	}

}
