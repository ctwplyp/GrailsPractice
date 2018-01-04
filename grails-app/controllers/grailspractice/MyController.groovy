package grailspractice

class MyController {
    def studentService
    def displayForm(){

    }
    def index() { }
    def handleFormSubmit() {
        def student = studentService.createStudent(params.lastName, params.firstName)
        [student: student]
    }
}
