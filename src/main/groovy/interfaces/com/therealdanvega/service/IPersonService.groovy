package interfaces.com.therealdanvega.service

import interfaces.com.therealdanvega.domain.Person

interface IPersonService {

    Person find()

    List<Person> findAll()

}