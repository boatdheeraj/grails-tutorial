package testapp

class Invoice {

    String name

    static hasMany = [items: item]
    static constraints = {
    }

    def getTotal() {
      items.sum { it.amount }
    }
}
