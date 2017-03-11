package testapp

class Item {

    String name
    Integer amount
    static belongsTo = [invoice: Invoice]

    static constraints = {
    }
}
