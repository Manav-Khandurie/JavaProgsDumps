package collectioneg;
import java.util.*;
class ssc implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        Integer i=(Integer)o1;Integer j=(Integer)o2;
        return (i>j)? 1:-1;//ascending order
    }
}