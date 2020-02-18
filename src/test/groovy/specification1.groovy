import spock.lang.Specification
import spock.lang.*


class specification extends Specification {
//instance fields

   // @Shared
    def obj1 = new SumOfTwoNumber()

    def " Feature method one"()
    {
        given:
        obj1
    }

    def " Feature method two"()
    {
        given:
        obj1
    }
}
