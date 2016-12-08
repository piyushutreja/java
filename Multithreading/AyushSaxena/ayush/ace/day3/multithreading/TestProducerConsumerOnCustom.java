package ayush.ace.day3.multithreading;

public class TestProducerConsumerOnCustom {

	CustomThreadSafeList<Integer> c = new CustomThreadSafeList<>(10);
	
	public static void main(String[] args){
		
		CustomThreadSafeList<Integer> c = new CustomThreadSafeList<>(10);	
		Thread producer = new Thread(new CustomProducer(c));
		Thread producer1 = new Thread(new CustomProducer(c));
		Thread consumer = new Thread(new CustomConsumer(c));
		Thread consumer1 = new Thread(new CustomConsumer(c));
		
		producer.setName("Ayush");
		producer1.setName("Ankit");
		
		producer1.start();
		producer.start();
		consumer.start();
		//consumer1.start();
	}
	
	
	
	
}
