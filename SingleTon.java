class SingleTon
    {
    // static variable single_instance of type Singleton
        private static SingleTon single_instance = null;
  
        // variable of type String
        public String str;
  
    // private constructor restricted to this class itself
    private SingleTon()
    {
        str = null;
    }
  
    // static method to create instance of Singleton class
    public static SingleTon getInstance()
    {
        if (single_instance == null)
            single_instance = new SingleTon();
  
        return single_instance;
    }
}
  

class MainClass{
    SingleTon s = SingleTon.getInstance();
    public MainClass(){
        //System.out.println("s.str");
        if (s.str == null){
            new Login().setVisible(true);
        }
        else if(s.str != null){
            new Home1(s.str).setVisible(true);
        }
    }

}