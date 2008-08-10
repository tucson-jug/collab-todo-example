class Category {
	String name
	String description
	
	static constraints = {
		name(blank: false)
	}
	
	String toString() {
		name
	}
}
