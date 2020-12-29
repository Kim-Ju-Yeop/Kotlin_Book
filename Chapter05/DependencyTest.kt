package Chapter05

class Patient2(val name: String, var id: Int) {
    fun doctor2List(d2: Doctor2) {
        println("Patient2: $name, Doctor2: ${d2.name}")
    }
}

class Doctor2(val name: String, val p2: Patient2) {
    val customerId: Int = p2.id

    fun patient2List() {
        println("Doctor2: $name, Patient2: ${p2.name}")
        println("Patient2 Id: $customerId")
    }
}

fun main() {
    val patient2 = Patient2("Kildong", 1234)
    val doc2 = Doctor2("KimSabu", patient2)

    doc2.patient2List()
}