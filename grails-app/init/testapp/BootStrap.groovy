package testapp

class BootStrap {

    def init = { servletContext ->
      def person = new Person(firstName: "Eric", lastName: "Helgeson")
      person.firstName = "Bob"
      assert person.active == false
      person.save(flush: true)
      Person.findByFirstName("Bob")
    }
    def destroy = {
    }
}
