class UserTests extends GroovyTestCase {
	void setUp() {
		User.list()*.delete()
	}
	
	void testPersist() {
		new User(userName: 'pataki', firstName: 'Scott', lastName: 'Pataki').save()
		new User(userName: 'antkow', firstName: 'Lisa', lastName: 'Antkow').save()
		new User(userName: 'marsh', firstName: 'Aaron', lastName: 'Marsh').save()
		
		assert 3 == User.count()
		def actualUser = User.findByUserName("antkow")
		assert actualUser 
		assert 'antkow' == actualUser.userName
		assert 'Lisa' == actualUser.firstName
		assert 'Antkow' == actualUser.lastName
	}
	
	void testToString() {
		def usr = new User(userName: 'lenards', 
						firstName: 'Andrew', 
						lastName: 'Lenards')
		assertToString(usr, "Lenards, Andrew")
	}
}
