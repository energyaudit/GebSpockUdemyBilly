def file=new File("newFile1.txt")
file<<"Java installed: java -version Add system enviroment: method 1: add jdk path directly at end of path, method2:add JAVA_HOME first then past %JAVA_HOME%\bin	 at end of path."
println file.absolutePath
println file.size()
println "File ? ${file.isFile()}"
println "Director ? ${file.isDirectory()}"