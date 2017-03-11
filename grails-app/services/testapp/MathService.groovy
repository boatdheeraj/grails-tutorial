package testapp

import grails.transaction.Transactional

@Transactional
class MathService {

    def add(numberOne, numberTwo) {
      numberOne + numberTwo
    }
}
