    public class singleton{  
        static String c;
        private singleton(String a,String b)
        {
          this.c=a.concat(b);  
        }  
       
     public static singleton get_singleton(singleton obj){  
        return obj;  
     }  
      
     public static void main(String[] args) throws Exception{  
        String a="Instance";
	    String b=" Created";
	    singleton create_obj=new singleton(a,b);
        singleton store_obj=singleton.get_singleton(create_obj);
        System.out.println(store_obj.c);
     }  
    }  