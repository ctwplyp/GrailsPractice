package grailspractice

class HelloController {

    def index() {
        Person p1 = new Person(firstName:'John', lastName:'Doe', age:45).save()
        Person p2 = new Person(firstName: 'Sean', lastName:'Laing', age:27).save()
        Person p3 = new Person(firstName: 'Max', lastName:'Powers', age:37).save()
        Person p4 = new Person(firstName: 'Amy', lastName:'Moly', age:24).save()
        displayForm()
        def list =[]
     /*   list << new Person(firstName: 'Sean', lastName:'Laing', age:27)
        list << new Person(firstName: 'Max', lastName:'Powers', age:37)
        list << new Person(firstName: 'Amy', lastName:'Moly', age:24)*/
     //   list << p1
        list << Person.findAllByAgeGreaterThan(24)
    //    list << Pers
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





