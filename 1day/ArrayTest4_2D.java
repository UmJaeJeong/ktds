
public class ArrayTest4_2D {

	public static void main(String[] args) {
		//1.정방형
		int[][] n = new int[3][2]; //[행크기][열크기]
		
		for(int i=0; i<n.length;i++) {
			for(int j=0 ; j<n[i].length;j++) {
				System.out.println("["+i+"]"+"["+j+"] = "+ n[i][j]);
			}
		}
		System.out.println("행의 갯수 : " + n.length);
		System.out.println("1행의 열갯수: "+n[0].length);
		System.out.println("2행의 열갯수: "+n[1].length);
		//2.비정방형 ==> 행크기만 먼저 지정하고 나중에 열은 동적으로 생성
		int[][] n2 = new int[3][]; //[행크기][열크기]
		
		n2[0] = new int[2];
		n2[1] = new int[1];
		n2[3] = new int[3];
		
		for(int i=0; i<n2.length;i++) {
			for(int j=0; j<n2[i].length;j++) {
				System.out.println("["+i+"]"+"["+j+"] = "+ n[i][j]);
			}
		}
		System.out.println("행의 갯수 : " + n2.length);
		System.out.println("1행의 열갯수: "+n2[0].length);
		System.out.println("2행의 열갯수: "+n2[1].length);
	}

}
