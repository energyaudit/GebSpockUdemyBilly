package Groovy.Udemy.simpledatatypes
// Java Sample Pattern

import java.util.regex.*
Pattern pattern = Pattern.compile("a\\\\b")
println pattern
println pattern.class

// What patterns will look like in Groovy
Pattern pattern1 = Pattern.compile(/a\\b/)
println pattern1
String slashy = /a\b/
String url = $/http://threaldanvega.com/blog/$

println slashy.class

def pattern2 = ~/a\b/
println pattern2.class

// Find | Match

def text = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern3 = ~/Cleveland Sports Fan/
def finder = text =~ pattern3
def matcher = text ==~ pattern3

println finder
println finder.size()
println matcher

// ----------------------------------------------------------------------------------

def text1 = "Cleveland Sports Fan"
def pattern4 = ~/Cleveland Sports Fan/
def matcher2 = text1 ==~ pattern4

println matcher2

if( matcher ) { println  "do something"}


// ----------------------------------------------------------------------------------

def text2 = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern5 = ~/Cleveland/

text2 = text2.replaceFirst(pattern5,"Buffalo")
println text2
