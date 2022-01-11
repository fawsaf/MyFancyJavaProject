public class singleton{  
        static String c;
        private static singleton obj=null;
        private singleton(String a,String b)
        {
          this.c=a.concat(b);  
        }  
       
        public static singleton get_singleton(String a, String b){  
	        if (obj==null)
                obj=new singleton(a,b);
	
            return obj;  
     }  
     	 public static void main(String[] args) throws Exception
	 {
	    String a="Instance created";
	    String b=" & Conflict resolved";
            singleton store_obj=singleton.get_singleton(a,b);
            System.out.println(store_obj.c);
	 }
  
    }