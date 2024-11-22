/**
#include<stdio.h>
#include<string.h>
#define N 10
**/
import java.util.*;
class PerformTask
{
    int length;String word;
    String combo[]=new String[100];int value=0;
    char characters[]=new char[100];
    void printingsmallest(String combo[])
    {
        String search=this.word;boolean flag=false;int pos=0;
        for(int i=0;i<value;i++)
        {
            if(search.equals(combo[i]))
            {
                pos=i-1;
                flag=true;
            }
        }
        if(flag==false){
        System.out.println("NONE!!!!");
        return;
        }
        System.out.println(combo[pos]);
    }
    void printing(String combo[])
    {
        for(int i=0;i<value;i++)
        {
            System.out.println(combo[i]);
        }
    }
    void sort(String characters[])
    {
        for(int i=0;i<value;i++)
        {
            for(int j=i+1;j<value-1;j++)
            {
                if(characters[j].compareTo(characters[j+1])<0){
                   String temp=characters[j];
                   characters[j]=characters[j+1];
                   characters[j+1]=temp;
                }
            }
        }
        sort(characters);
        //printingsmallest(characters);
    }
    void combinations(String word)
    {
        char temp;
        this.word=word;
        int n=word.length();
        //System.out.println("\nEnter a list of numbers to see all combinations:\n");
        for (int i = 0 ; i < n; i++)
            characters[i]=word.charAt(i);
        for (int j = 1; j <= n; j++) {
            for (int i = 0; i < n-1; i++) {
                temp = characters[i];
                characters[i] = characters[i+1];
                characters[i+1] = temp;
                lex(characters, n);
            }
        }//lex(characters,n);
        sort(combo);
        printing(combo);
    }
    void lex(char num[], int n)
    {
        int i;
        for ( i = 0 ; i < n ; i++)
        {   if(combo[value]==null)
            combo[value]=Character.toString(num[i]);
            else
            combo[value]+=num[i];
            //System.out.print( num[i]);
        }value++;
        //System.out.println("\n");
    }
}/**
class Lexicographically extends PerformTask
{
    String words[];
    void constraints(String word,int length)
    {
        if(!(length>0&&length<(int)Math.pow(10,5)&&word.length()>=1&&word.length()<=100))
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input amount of words :-");
        int length=sc.nextInt();
        words=new String[length];
        System.out.println("Input:-");
        for(int i=0;i<words.length;i++)
        {
            words[i]=sc.next();
            constraints(words[i],length);
        }
    }
    void perform()
    {
        PerformTask obj=new PerformTask();
        for(int i=0;i<words.length;i++)
        {
            obj.combinations(words[i]);
        }
    }
    public static void main(String args[])
    {
        Lexicographically obj=new Lexicographically();
        obj.perform();
        obj.input();
    }
}**/