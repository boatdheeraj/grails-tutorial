package testapp

class ExampleController {

    def mathService
    def index() {
      def sumResult = mathService.add(1,3)
      def myMap = [
        name: "${params.name}",
        id: 123,
        sumResult: sumResult]
      respond myMap
    }
}
