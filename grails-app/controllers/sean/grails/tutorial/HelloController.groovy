package sean.grails.tutorial

class HelloController {

    def index() {
        render  "Hello World from teh hello controller"
    }

    def hi() {
        render (view: 'index.gsp')
    }
}





