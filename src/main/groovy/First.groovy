class FirstJavaClass {

    def name;


    def Sucess() {
        return "Hello${name}";
    }
    static void main(String [] args) {
        def fj=new FirstJavaClass();
        fj.setName("Java to Groovy");
        println(fj.Sucess());
    }
}
