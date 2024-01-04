class Sample
    {
        int a,b;
        
        void get(int x,int y)
        {
            a=x;
            b=y;
        }
        
        void show()
        {
            System.out.println("a="+a+" b="+b);
        }
        public static void main(String[] args)
        {
            Sample s1=new Sample();
            Sample s2=new Sample();
            s1.get(12,66);
            s2.get(88,43);
            s1.show();
            s2.show();
        }
    }
