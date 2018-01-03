import grailspractice.Person
class BootStrap {

    def init = { servletContext ->
       if (Person.count() ==0) {
            new Person(firstName: 'alfredo', lastName:'doe', age:56).save()
            new Person(firstName: 'Yogi', lastName:'bear', age:56).save()
       }
    }
    def destroy = {
    }
}
