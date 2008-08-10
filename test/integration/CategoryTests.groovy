class CategoryTests extends GroovyTestCase {

	void setUp() {
		Category.list()*.delete()
	}
	
	void testPersist() {
		new Category(name: "home", description: "todos related to home").save()
		new Category(name: "work", description: "todos related to work").save()
		
		assert 2 == Category.count()
		
		def actualCat = Category.findByName("home")
		assert actualCat
		assert 'home' == actualCat.name
		assert 'todos related to home' == actualCat.description
	}
	
	void testToString() {
		def cat = new Category(name: "Home")
		assertToString(cat, "Home")
	}
}
