package grailspractice

class Student {
    String firstName
    String lastName
    Integer referenceNumber
    static constraints = {
        firstName (blank: false)
        lastName (blank: false )
    }
}
