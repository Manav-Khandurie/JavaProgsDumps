public  class OuterClass
{
    static int num=0;
    public void msg()
    {
        System.out.println("OC");
    }
    public static class InnerClass
    {
        static int num=1;
        public  void msg()
        {
            System.out.println(OuterClass.num);
        }
    }
}