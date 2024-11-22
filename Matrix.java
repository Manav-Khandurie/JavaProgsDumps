import java.util.*;
class Matrix{

	int [][] A;

	int [][] B;


	Matrix(){

		A=new int[3][3];

		B=new int[3][3];

		Scanner s=new Scanner(System.in);

		System.out.println("Values for matrix A");

		for(int i=0;i<3;i++){

			for(int j=0;j<3;j++){

				A[i][j]=s.nextInt();
			}

		}

		System.out.println(" Values for matrix B");


		for(int i=0;i<3;i++){

			for(int j=0;j<3;j++){

				B[i][j]=s.nextInt();
			}

		}




	}


}