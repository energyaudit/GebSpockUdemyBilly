package com.therealdanvega

// Every read access to a property can be intercepted by overriding the getProperty() method of the current object.

class PropertyDemo2 {

    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    def getProperty(String name){
        println "getProperty() called with argument $name"

// last line by default return,so no need write return
             metaClass.getProperty(this,name)

    }

}

def pd = new PropertyDemo2()
println "last line by default return,so no need write return\n"
println pd.prop1
println pd.prop2
println pd.prop3
//println pd.prop4