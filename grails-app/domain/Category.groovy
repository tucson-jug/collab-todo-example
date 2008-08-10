class Category {
	String name
	String description
	User user

	static belongsTo = User
	static hasMany = [todos: Todo]
	
	static constraints = {
		name(blank: false)
		user(nullable: true)
	}
	
	String toString() {
		name
	}
}
