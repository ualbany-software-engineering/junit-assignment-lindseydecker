package sampleQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class QueueTest{

	/**
	 * Tests for Queue.
	 */

	// Tests for queue using default constructor- no max size
	@Nested
	@DisplayName("Tests for queue without max size")
	class TestsUsingQueueWithoutMaxSize{

		private Queue<String> q; 

		// Initializes new empty queue q using default constructur before each test
		@BeforeEach
		void init() {
			this.q = new Queue<String>();
		}

		// Test constructor 1: initializes empty queue
		@Test
		@DisplayName("Check constructor 1")
		void checkConstructor1(){
			assertEquals(0, this.q.length());
		}

		//  Tests enqueue method
		@Test
		@DisplayName("check enqueue")
		void checkEnqueueMethod(){
			assertTrue(this.q.isEmpty());
			this.q.enqueue("apple");
			assertEquals("apple", this.q.peek());
			this.q.enqueue("pear");
			assertEquals("apple", this.q.peek());
		}

		// Checks dequeue method
		@Test
		@DisplayName("check dequeue method")
		void checkDequeue(){
			this.q.enqueue("tiger");
			this.q.enqueue("lion");
			assertEquals("tiger", this.q.dequeue());
			assertEquals("lion", this.q.dequeue());
		}

		// Checks dequeue exception is thrown
		@Test
		@DisplayName("check exception is thrown when queue is empty for dequeue")
		void checkDequeueExceptionThrown(){
			assertTrue(this.q.isEmpty());
			assertThrows(NoSuchElementException.class, this.q::dequeue);
		}

		@Test
		@DisplayName("peek")
		void checkPeek(){
			this.q.enqueue("tomato");
			this.q.enqueue("celery");
			this.q.enqueue("carrot");
			assertEquals("tomato", this.q.peek());
		}

		@Test
		@DisplayName("length")
		void checkLength(){
			assertEquals(0, this.q.length());
			this.q.enqueue("daisy");
			this.q.enqueue("lily");
			this.q.enqueue("rose");
			assertEquals(3, this.q.length());
		}

		@Test
		@DisplayName("isEmpty")
		void checkIsEmpty(){
			assertEquals(true, this.q.isEmpty());
			this.q.enqueue("banana");
			assertEquals(false, this.q.isEmpty());
		}

		@Test
		@DisplayName("removeAll")
		void checkRemoveAll(){
			this.q.enqueue("whale");
			this.q.enqueue("dolphin");
			this.q.enqueue("shark");
			assertEquals(3, this.q.length());
			this.q.removeAll();
			assertEquals(0, this.q.length());
		}

	}


	// Tests using a queue with a maximum size (in this case 2)
	@Nested
	@DisplayName("Tests for queue with max size of 2")
	class testsUsingFixedSizeQueue{

		private Queue<String> q2;

		//Initializes a new empty queue with a max size of 2 before each test in Enqueue class
		@BeforeEach
		void init() {
			this.q2 = new Queue<String>(2);
		}

		//Test constructor 2 with max length of 2
		@Test
		@DisplayName("Constructor 2")
		void checkConstructor2(){
			this.q2 = new Queue<String>(2);
			assertTrue(q2.isEmpty());
			this.q2.enqueue("dalmation");
			this.q2.enqueue("poodle");
			assertEquals(2, this.q2.length());
		}

		// Checks exception is thrown when queue is full- THIS TEST FAILS
		@Test
		@DisplayName("check full queue exception- FAILS")
		void checkFullQueueException(){
			this.q2.enqueue("koala");
			this.q2.enqueue("kangaroo");
			assertThrows(IndexOutOfBoundsException.class, () -> { this.q2.enqueue("wombat"); });
		}
	}	

		

	// // // BELOW WAS GIVEN

	// private static final String SOME_ITEM = "some-content";	
	// private Queue<String> q; 

	// @Test
	// @Disabled
	// @DisplayName("is instantiated with new Queue()")
	// void isInstantiatedWithNew() {
	// 	new Queue<>();
	// }

	// @Test
	// @DisplayName("Verify Queue isEmpty when queue is initialized")
	// void isEmptyShouldGiveTrueOnQueueInit() {
	// 	assertTrue(q.isEmpty());
	// }

	// //Example of Wrong Test! 
	// @Test
	// @Disabled
	// @DisplayName("Verify Queue isEmpty returns false when queue is not empty")
	// void isEmptyShouldGiveFalseWhenQueueIsNotEmpty() {
	// 	this.q.enqueue(SOME_ITEM);
	// 	assertFalse(q.isEmpty());
	// }


}