class EmployeeAccount(private var employeeId : String,
                      private var employeeName: String,
                      private var basicSalary: Double,
                      private var performanceRating : Int,
) {
    fun viewSalaryDetails(){
        println("Current  salary: $basicSalary")
    }
    fun addBonus(){
        if(basicSalary > 0.0 && performanceRating == 5){
            val bonusSalary = (basicSalary*0.10)
            basicSalary += bonusSalary
            println("Bonus :$bonusSalary , Now  Bonus salary : $basicSalary")
        }
        else {
            println("No Bonus salary,current salary : $basicSalary")
        }
    }
    fun deductTax(percentage: Double) {
        val deduct = (basicSalary*percentage)
        basicSalary -= deduct
        println("Deduct 15% , Deduct salary : $basicSalary")
    }
}
fun main() {
    print("Enter your EmployeeId: ")
    val a = readLine()!!

    print("Enter your EmployeeName: ")
    val b = readLine()!!

    print("Enter your BasicSalary: ")
    val c = readLine()!!.toDouble()

    print("Enter your performance rating(1 to 5): ")
    val rating = readLine()!!.toInt()
    val employeeAccount = EmployeeAccount(a, b, c, rating)
    employeeAccount.viewSalaryDetails()
    employeeAccount.addBonus()
    employeeAccount.deductTax(0.15)
    employeeAccount.viewSalaryDetails()
}
