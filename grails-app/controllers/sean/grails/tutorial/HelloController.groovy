package sean.grails.tutorial

class HelloController {

    def index() {
        Person person = new Person(firstName: 'Sean', lastName:'Laing', age:27)
       [ person:person ]// render  "Hello World from teh hello controller"
    }

 //   def hi() {
   //     render (view: 'index.gsp')
    //}
}





