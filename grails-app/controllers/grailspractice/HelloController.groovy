package grailspractice

class HelloController {

    def index() {
        def persons = Person.list()
        [persons: persons]
    }

    def hi() {
        render (view: 'index.gsp')
    }

    def displayForm() {
        Person person = new Person(age:55)
        [ person:person]
    }
}





