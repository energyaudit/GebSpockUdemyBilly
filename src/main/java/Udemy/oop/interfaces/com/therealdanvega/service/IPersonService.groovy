package Udemy.oop.interfaces.com.therealdanvega.service

import Udemy.oop.interfaces.com.therealdanvega.domain.Person

interface IPersonService {

    Person find()

    List<Person> findAll()

}