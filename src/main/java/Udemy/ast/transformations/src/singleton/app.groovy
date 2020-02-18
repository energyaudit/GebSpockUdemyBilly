package Groovy.Udemy.ast.transformations.src.singleton

//DatabaseConnection dbConnection = new DatabaseConnection()
//println dbConnection

DatabaseConnection db = DatabaseConnection.instance
println db