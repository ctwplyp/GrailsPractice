import grailspractice.Person
class BootStrap {
    def studentService
    def init = { servletContext ->
    //   if (Person.count() ==0) {
         //   new Person(firstName: 'alfredo', lastName:'doe', age:56).save()
         //   new Person(firstName: 'Yogi', lastName:'bear', age:56).save()
           studentService.createStudent("alfredo","doe")
           studentService.createStudent('Yogi','bear')
    //   }
    }
    def destroy = {
    }
}
