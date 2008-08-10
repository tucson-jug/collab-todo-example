class Todo {
	String name
	String note
	Date createdDate
	Date dueDate
	Date completedDate
	String priority
	String status 
	User owner
	Category category
	
	static belongsTo = [User, Category]	
	
	static constraints = {
		name(blank: false)
		createdDate()
		priority()
		status()
		note(maxSize: 1000, nullable:true)
		completedDate(nullable: true)
		dueDate(nullable: true)
		owner(nullable: true)
		category(nullable: true)
	}
	
	String toString() {
		name
	}
}
