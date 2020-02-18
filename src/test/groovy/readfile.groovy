def file=new File('newFile.txt')
println file.text

println "read file line by line......................................"
println file.readLines()[2]
file.readLines().each {
    line->println line
}

println "read file word by word......................................"
println file.readLines()[2]
file.readLines().each {
    line->line.tokenize().each {
              word1->println word1
                                }

//    line->line.tokenize().each {
//
//        word->if(word=='Code .') {
//            println "we have found you looking for:"
//            println word
//                 }


    }

println "read file by absolutely path......................................"
def file1=new File('/Billy/Architech/CypressSetUp.txt')
file1<<"Find by CSS Class\t\$('.myCSSClass')\tFind all the elements with class=myCSSClass"
println file1.text

