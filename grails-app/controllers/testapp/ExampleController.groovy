package testapp

class ExampleController {

    def index() {
      def myMap = [name: "Oliver", id: 123]
      respond myMap
    }
}
