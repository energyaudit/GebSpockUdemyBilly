package Groovy.Udemy.ast.transformations.src.tuple

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Person {

    String first
    String last
    String email

}
