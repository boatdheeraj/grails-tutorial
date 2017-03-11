package testapp

class Person {
    String firstName
    String lastName
    String emailAddress
    Boolean active = false

    static constraints = {
      emailAddress nullable: false, email: true, unique: true
    }

    String toString(){
      firstName + " " + lastName
    }
}
