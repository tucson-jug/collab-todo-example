class User {
	String userName
	String firstName
	String lastName
	
	static constraints = {
		userName(blank: false, unique: true)
		firstName(blank: false)
		lastName(blank: false)
	}
	
	String toString() {
		"$lastName, $firstName"
	}
}
