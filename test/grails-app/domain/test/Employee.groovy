package test

class Employee {

	String userName
	String fullName
	String password
	
	
	
    static constraints = {
		fullName(nullable:false)
		userName(nullable:false, unique:true)
		password(nullable:false, password:true)
	}
	
	
}
