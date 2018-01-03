package grailspractice

class PersonController {
    def form(){

    }

    def save(){
        def person5 = new Person(params)
        person5.save()
        render "Success!"
    }

}
