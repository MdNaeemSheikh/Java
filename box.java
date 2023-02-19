public class box {
    private int var;
    public box(){
        this.var=10;
    }
    public int getvalue(){
        return var;
    }
    public static void main(String[] args){
       box obj=new box();
       box obj2=new box( 100);
       System.out.println( obj.getvalue());
       System.out.println( obj2.getvalue());
    }
}
