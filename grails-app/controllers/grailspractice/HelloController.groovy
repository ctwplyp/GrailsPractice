package grailspractice

class HelloController {

    def index() {
        def persons = Person.list()
        [persons: persons]
    }

    def hi() {
        render (view: 'form.gsp')
    }

    def displayForm() {
        Person person = new Person(age:55)
        [ person:person]
    }
}





