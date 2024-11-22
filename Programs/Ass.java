class Ass {

	public static void main(String args[]) throws Exception{



		MyThread[] t=new MyThread[9];

		Thread [] th=new Thread[9];

		for(int i=1;i<=9;i++){

			t[i]=new MyThread();

			th[i]=new Thread(t[i]);

			th[i].start();


		}
                //currentThread().setDeamon(true);
	}
}
