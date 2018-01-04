package grailspractice

import grails.transaction.Transactional

@Transactional
class StudentService {
    def count =1
    Student createStudent(String lastName, String firstName) {
        Student student = new Student()
        student.lastName = lastName
        student.firstName = firstName
        student.referenceNumber=generateReferenceNumber()
        student.save()
        return student
    }
    private String generateReferenceNumber() {
        def referenceNumber =Student.count()+1;
        return referenceNumber
    }

    def serviceMethod() {

    }
}
