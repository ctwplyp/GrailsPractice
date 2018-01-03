package sean.grails.tutorial

class HelloController {

    def index() {
        displayForm()
        def list =[]
        list << new Person(firstName: 'Sean', lastName:'Laing', age:27)
        list << new Person(firstName: 'Max', lastName:'Powers', age:37)
        list << new Person(firstName: 'Amy', lastName:'Moly', age:24)
       [ list:list ]// render  "Hello World from teh hello controller"
    }

    def hi() {
        render (view: 'index.gsp')
    }

    def displayForm() {
        Person person = new Person(age:55)
        [ person:person]
    }
}




