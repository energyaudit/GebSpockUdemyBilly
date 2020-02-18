// Intercept - Cache - Invoke Pattern

class Developer {

    List languages = []

    def methodMissing(String name, args){//overwrite groovy default methodMissing

        println "${name}() method was called..."

        if( name.startsWith('write') ) {
            String language = name.split("write")[1]//After split ,take the second one
            println language
            if( languages.contains(language) ) {
                println("we found $languages contain $language")
                def impl = { Object[] theArgs ->
                    println "I like to write code  in $language"

                }
                println impl
 //              getMetaClass()."$name" = impl
//                return impl(args)
            }
        }
    }

}

Developer dan = new Developer()
dan.languages << "Groovy"
dan.languages << "Java"
println(dan.languages)
    println dan.metaClass.methods.size()
dan.writeGroovy()
dan.writeGroovy()
dan.writeGroovy()
  println dan.metaClass.methods.size()
dan.writeJava()
dan.writeJava()
  println dan.metaClass.methods.size()
