import java.util.*;


class MyThread extends Matrix implements Runnable {


	public void run(){

		multiply();
	}

	synchronized public void multiply(){

		// Matrix m=new Matrix(); 

		int [][] C = new int[3][3];


		for(int i=0;i<3;i++){


			for (int j=0;j<3;j++ ) {

				C[i][j]=0;

				for(int k=0;k<3;k++){

					C[i][j]+=A[i][j] * B[i][j];

					Thread.currentThread().interrupt();


				}
			}
		}

		for(int i=0;i<3;i++){

			for(int j=0;j<3;j++){

				System.out.println(C[i][j]);
			}
		}

	}


}


