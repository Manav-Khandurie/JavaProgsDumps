public class MainClass
{
    public static void main(String args[])
    {
        OuterClass outer=new OuterClass();
        //System.out.println(outer.num);
        //outer.msg();
        OuterClass.InnerClass inner=new OuterClass.InnerClass();//for static inner class
        //OuterClass.InnerClass inner=(new OuterClass()).new InnerClass();//for non static inner class
        //For non static inner class <<Outer Class>>.<<Inner Class>> <<InnerClass object>>=<<Outer class Object>>.new <<InnerClass>>();
        //System.out.println(inner.num);
        inner.msg();
    }
}