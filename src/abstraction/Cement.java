package abstraction;
//implement -> interface
//extend - class/ abstract class

public class Cement extends Clinkers implements Plasters, DryProCement{
    @Override
    public void clinkerBuild() {
        System.out.println("Crush the clinker to powder for Cement");

    }

    @Override
    public void water() {

    }

    @Override
    public void soil() {

    }

    @Override
    public void limeStone() {

    }

    @Override
    public void gypsum() {

    }

    @Override
    public void dryProcessCement() {
        System.out.println("");

    }


}
//method overriding -- same method name , same parameters, in the different class
// also known as dynamic polymorphism or run time polymorphism.
// end result of the abstraction is to get all the result,
// in one page, from previous interfaces , classes or abstract classes.
//we can implement one or more interfaces.
//Only one abstract class or regular class is allowed.

