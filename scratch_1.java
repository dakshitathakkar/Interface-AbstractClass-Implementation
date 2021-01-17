interface Human{
    public static final int number=4;
    //variables in an interface are by default static, final and public
    //modifiers other than public are not allowed

    abstract void breathe();
    //interface methods cannot have bodies which means all methods in an
    // interface are abstract
    //all methods in interface are public
}

abstract class Man implements Human{ // man IS-A human,
    @Override // annotation for compiler
    public void breathe(){
        System.out.println("Inhale and Exhale");
    }
}

class Student extends Man{
    /*//in order to inherit the properties of abstract class Man
    @Override
    public void breathe(){
        //super.breathe();
        System.out.println(".........");

        //overridden its own method
    }

     */
}


class Main{
    public static void main(String[] args) {
        /*Student student = new Student();
        student.breathe();*/

        Man man = new Student();
        man.breathe();
        //student class ka method chlega
        //after removing student class ka method



        //abstract class cannot be instantiated
        /*Man man = new Man() {
           @Override
            public void breathe(){
               System.out.println("");
           }
        };
        */


        /*
        System.out.println(Human.number);

        Human nitin = () ->{

            System.out.println("Inhale and exhale");

            }
        };//anonymous inner class - overriding method
        //problem 1 - jitni baar nya object bnayenge utni baar override krna pdega
        //2- jitni baar arraylist bnaenge utni baar override krna pdega
        //soln- if human is functional interface we can write lambda exps
        */
    }
}


















//functional interface has only one abstract method
//for defining methods we use lambda expressions
//runnable interface is an example of functional interface