package grailspractice

import grails.transaction.Transactional

@Transactional
class StudentService {
    List filteredStudent(){
        return Student.list()
    }

    List filteredStudentWithLastNameDoeOrReferenceNumLessThen45(){
        def criteria = Student.createCriteria()
        def result = criteria.list {
            or {
                    eq('lastName','Doe')
                    lt('referenceNumber',45)
                }
            }
        result
    }


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
