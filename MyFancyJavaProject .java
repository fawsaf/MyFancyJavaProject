    public class singleton{  
        public static int count_func(String n) { 
            int s = 0; 
            int len=n.length()+1;
            char[] ch=new char[len];
      
            for (int i=0; i<n.length();i++) {
                ch[i]=n.charAt(i);
            }
            for (int i=0;ch[i]!='\0';i++)
            {
                if(ch[i]==' ')
                    s++;
            }
            return s+1; 
        }
        
        static String c;
        static int count;
        private singleton(String a,String b)
        {
          this.c=a.concat(b);  
          this.count=count_func(c);
        }  
       
     public static singleton get_singleton(singleton obj){  
        return obj;  
     }  
      
     public static void main(String[] args) throws Exception{  
        String a="Count word";
    	String b=" containing in the final string";
	    singleton create_obj=new singleton(a,b);
        singleton store_obj=singleton.get_singleton(create_obj);
        System.out.println(store_obj.c);
        System.out.println("Word count of string: " + store_obj.count);
     }  
    }  