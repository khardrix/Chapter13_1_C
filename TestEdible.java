/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                   Chapter 13: Problem 1, Part a                                          *****
 *****__________________________________________________________________________________________________________*****
 *****     1.  Implement the Edible interface on page 510 and then the code in listing 13.7 on pages 510-511.   *****
 *****                          Run the TestEdible program and examine the output.                              *****
 *****                                       Next, do the following.                                            *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****              a.  Remove the first @Override (in Chicken right before the howToEat method).               *****
 *****                                    Compile and run your program.                                         *****
 *****                                                                                                          *****
 *****__________________________________________________________________________________________________________*****
 *****                                            Questions:                                                    *****
 *****                                Q-1a_a - Does the program compile?                                        *****
 *****                                 Q-1a_b - Does it run as expected?                                        *****
 *****                        Q-1a_c - What is the significance of @Override then?                              *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                            Answers:                                                      *****
 *****                          	        Q-1a_a - Answer: Yes                                                *****
 *****                                      Q-1a_b - Answer: Yes                                                *****
 *****                  Q-1a_c - Answer: To signify that this method is being over-ridden from a                *****
 *****                                previous version in the parent class.                                     *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                Course Provided Solution (13_1_A):                                        *****
 *****                              Yes, it compiles and runs as expected.                                      *****
 *****      The reason for using @Override is to alert the compiler that we are overriding a method that,       *****
 *****                 should we specify something incorrectly, should be alerted to us.                        *****
 *****                               So if we had implemented howToEat wrong,                                   *****
 *****     having @Override forces the compiler to check that our method is correctly specified and if not,     *****
 *****   we get a syntax error. But if we specify the method properly, removing @Override has no consequence.   *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

/////-------------------------------------------------------------------------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////
/////------------------------------------------- Chapter 13: Problem 1 -------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////

/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                   Chapter 13: Problem 1, Part b                                          *****
 *****__________________________________________________________________________________________________________*****
 *****     1.  Implement the Edible interface on page 510 and then the code in listing 13.7 on pages 510-511.   *****
 *****                          Run the TestEdible program and examine the output.                              *****
 *****                                       Next, do the following.                                            *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****             b.  Remove both the @Override and method sound from Tiger and compile your code.             *****
 *****               After you get the answer(s) to the question(s), reinsert these lines of code.              *****
 *****                                                                                                          *****
 *****__________________________________________________________________________________________________________*****
 *****                                            Questions:                                                    *****
 *****                                      What happens and why?                                               *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                            Answers:                                                      *****
 *****                                         What happens:                                                    *****
 *****                           It does not compile. We get the syntax error:                                  *****
 *****     Error:(92, 1) java: Tiger is not abstract and does not override abstract method sound() in Animal    *****
 *****                                                                                                          *****
 *****                                              Why?                                                        *****
 *****                   Tiger extends the Animal class. The Animal class is an abstract class                  *****
 *****                 that includes the abstract sound() method. Any class that extends Animal                 *****
 *****    must implement the abstract method, sound(). If we remove the "@Override", the program will still     *****
 *****   compile and run normally (Since the sound() method was implemented correctly), but if we remove the    *****
 *****        sound() method, the program will not compile or run. If we just left "@Override" in there,        *****
 *****      we would get an error and the program would not compile and/or run, because we would have the       *****
 *****       "@Override" annotation in there and then no "overridden" method following the annotation.          *****
 *****    Additionally, we would not have implemented the sound() method and not satisfied the condition        *****
 *****                     of implementing all abstract methods from the parent class.                          *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                               Course Provided Solution (13_1_B):                                         *****
 *****   We get the syntax error: error: Tiger is not abstract and does not override abstract method sound()    *****
 ***** in Animal because Tiger, which extends Animal, must implement the abstract method of sound and does not. *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

/////-------------------------------------------------------------------------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////
/////------------------------------------------- Chapter 13: Problem 1 -------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////
/////-------------------------------------------------------------------------------------------------------------/////

/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                   Chapter 13: Problem 1, Part c                                          *****
 *****__________________________________________________________________________________________________________*****
 *****     1.  Implement the Edible interface on page 510 and then the code in listing 13.7 on pages 510-511.   *****
 *****                          Run the TestEdible program and examine the output.                              *****
 *****                                       Next, do the following.                                            *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                  c.  Remove the method howToEat from Apple and compile your code.                        *****
 *****                                                                                                          *****
 *****__________________________________________________________________________________________________________*****
 *****                                            Questions:                                                    *****
 *****                                       What happens and why?                                              *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                            Answers:                                                      *****
 *****                                         What happens:                                                    *****
 *****                          It does not compile. We get the syntax error:                                   *****
 *****  Error:(164, 1) java: Apple is not abstract and does not override abstract method howToEat() in Edible   *****
 *****                                                                                                          *****
 *****                                              Why:                                                        *****
 *****     The class Apple extends Fruit. Fruit is an abstract class that implements the Edible interface,      *****
 *****   The Edible interface includes the abstract method howToEat(), so any class that implements the Edible  *****
 *****             interface and any class that extends a class that implements the Edible interface,           *****
 *****          must actually implement the howToEat() method. Otherwise, the program will not compile.         *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                               Course Provided Solution (13_1_C):                                         *****
 *****                                       We get the error:                                                  *****
 *****         error: Apple is not abstract and does not override abstract method howToEat() in Edible          *****
 *****             because to implement a Fruit subclass, we must implement all abstract methods,               *****
 *****                                 which in this case is howToEat.                                          *****
 *****       We can avoid this error if we either implement this in Apple or make Apple an abstract class.      *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

public class TestEdible {

    public static void main(String[] args) {

        Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        for(int i = 0; i < objects.length; i++){
            if(objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());

            if(objects[i] instanceof Animal)
                System.out.println(((Animal)objects[i]).sound());
        }
    }
}


abstract class Animal{

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Return animal sound
    public abstract String sound();
}


class Chicken extends Animal implements Edible {

    @Override
    public String howToEat(){
        return "Chicken: Fry it";
    }

    @Override
    public String sound(){
        return "Chicken: cock-a-doodle-doo";
    }
}


class Tiger extends Animal{

     @Override
     public String sound(){
        return "Tiger: RROOAARR";
     }
}


abstract class Fruit implements Edible{

    // Data fields, constructors and methods omitted here
}


class Apple extends Fruit{

    @Override
    public String howToEat(){
        return "Apple: Make apple cider";
    }
}


class Orange extends Fruit{

    @Override
    public String howToEat(){
        return "Orange: Make orange juice";
    }
}