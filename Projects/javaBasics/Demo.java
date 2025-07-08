public class Demo
{
    private String name;
    private int age;
    public Demo()
    {
     System.out.println("Constructor");    }
     public int getAge()
     {
        return age;
     }
     public String getName()
     {
        return name;
     }
     public void setAge( int age)
     {
        this.age=age;
     }
     public void setName(String name)
     {
        this.name=name;
     }

     public static void main(String a[])
    {
        Demo obj=new Demo();
        System.out.println(obj.getName()+ ":" + obj.getAge() );
        obj.setName("Patnala Shanmukh");
        obj.setAge(21);
        System.out.println("updated info" );
        System.out.println(obj.getName()+ ":" + obj.getAge() );
    }
}
