import java.util.*;
class MultiplyMatrixThread extends Thread
{
    int a[][],b[][],c[][],val=0;
    Scanner sc=new Scanner(System.in);
    MultiplyMatrixThread()
    {   this.val=3;
        a=new int[val][val];
        b=new int[val][val];
        c=new int[val][val];
    }
    void input()
    {       System.out.println("Enter matrix size:- ");
            this.val=sc.nextInt();
            System.out.println("Enter \"A\" matrix :- ");
            for(int i=0;i<val;i++)
            {   for(int j=0;j<val;j++)
                a[i][j]=sc.nextInt();
            }
            System.out.println("Enter \"B\" matrix :- ");
            for(int i=0;i<val;i++)
            {   for(int j=0;j<val;j++)
                b[i][j]=sc.nextInt();
            }
    }
    void display()
    {       System.out.println("The \"A\" matrix :- ");
            for(int i=0;i<val;i++)
            {   for(int j=0;j<val;j++)
                System.out.print(a[i][j]+"\t");System.out.println();
            }
            System.out.println("The \"B\" matrix :- ");
            for(int i=0;i<val;i++)
            {   for(int j=0;j<val;j++)
                System.out.print(b[i][j]+"\t");System.out.println();
            }
    }
    void process()
    {   display();
        for(int i=0;i<val;i++)
        {   for(int j=0;j<val;j++)
            {   for(int k=0;k<val;k++)
                {
                    int i1=i,i2=j,i3=k;
                    Multiplythread t=new Multiplythread(){
                    public void run(){
                    synchronized(this){
                    c[i1][i2]+=a[i1][i3]*b[i3][i2];
                    //System.out.println(a[i1][i3]+"\t"+c[i1][i2]);
                     }}
                    };
                    t.start();
                    /**try{t.join();}catch(InterruptedException e){e.printStackTrace();}**/
                }
            }
        }
    }
    void output()
    {       System.out.println("The \"C\" matrix :- ");
            for(int i=0;i<val;i++)
            {   for(int j=0;j<val;j++)
                System.out.print(c[i][j]+"\t");
                System.out.println();
            }
    }
    public static void main(String args[])
    {
       MultiplyMatrixThread obj=new MultiplyMatrixThread();
       obj.input();obj.process();obj.output();
       try{ currentThread().setDaemon(false);
        //Thread.currentThread().join();
       }//catch(InterruptedException e){e.printStackTrace();}
       catch(IllegalThreadStateException e){}
       catch(Exception e) {e.printStackTrace();}
    }
}