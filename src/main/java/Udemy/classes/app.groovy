package Groovy.Udemy.classes
// create a new instance of a developer
@groovy.transform.ToString()
class Developer {

    String first
    String last
    def languages = []

    void work() {
        println "$first $last is working..."
    }

}
Developer d = new Developer()
d.first = "Dan"
d.setLast("Vega")

// assign some languages
d.languages << "Groovy"
d.languages << "Java"

// call some methods
d.work()