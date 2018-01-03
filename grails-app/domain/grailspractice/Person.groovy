package grailspractice

class Person {

    String firstName
    String lastName
    Date dateOfBirth
    static constraints = {
        firstName (blank: false)
        lastName (blank: false )
        dateOfBirth (blank: false)
    }
}
