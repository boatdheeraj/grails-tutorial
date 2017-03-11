package testapp

class ExampleController {

    def index() {
      def myMap = [name: "${params.name}", id: 123]
      respond myMap
    }
}
