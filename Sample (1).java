
class Sample
    {
        int a,b;
        public static void main(String[] args)
        {
            Sample s1=new Sample();
            s1.a=10;
            s1.b=20;
            Sample s2=new Sample();
            s2.a=100;
            s2.b=200;
            System.out.println("a="+s1.a+" b="+s1.b);
            System.out.println("a="+s2.a+" b="+s2.b);
        }
    }
