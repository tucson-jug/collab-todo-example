class TodoTests extends GroovyTestCase {

    void setUp() {
    	Todo.list()*.delete()
    }
    
    void testPersist() {
    	def now = new Date()
    	def me = new User(userName:'lenards', firstName: 'Andrew', lastName: 'Lenards')
    	def home = new Category(name: "home", description: "")
    	new Todo(name: "1", createdDate: now, category: home,
    			owner: me, priority: "1", status: "1").save()
    	new Todo(name: "2", createdDate: now, category: home,
    			owner: me, priority: "1", status: "1").save()
    	new Todo(name: "3", createdDate: now, category: home,
    			owner: me, priority: "1", status: "1").save()
    	new Todo(name: "4", createdDate: now, category: home,
    			owner: me, priority: "1", status: "1").save()
    	new Todo(name: "5", createdDate: now, category: home,
    			owner: me, priority: "1", status: "1").save()
    	
    	assert 5 == Todo.count()
    	def actualTodo = Todo.findByName("1")
    	assert actualTodo
    	assert '1' == actualTodo.name
    	assert now == actualTodo.createdDate
    	assert '1' == actualTodo.priority
    	assert '1' == actualTodo.status
    }
    
    void testToString() {
    	def todo = new Todo(name: "Pickup Laundry")
    	assertToString(todo, "Pickup Laundry")
    }
}
