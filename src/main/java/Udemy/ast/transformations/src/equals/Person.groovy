package Groovy.Udemy.ast.transformations.src.equals

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode( excludes = ["email"] )
class Person {

    String first
    String last
    String email

}
