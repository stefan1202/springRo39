package ro.sda.javaro39.spring_Predare.FirstExerciseMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}

//	@Bean
//	public TestClass alabalaPortocala(){
//		return new TestClass();
//	}

	@Bean("mickeyMouse")
	@Primary
	public SimpleLogger miniLogger(){
		return new SimpleLogger() {
			@Override
			public void printMessage(String message) {
				System.out.println("Mini logger: " + message);
			}
		};
	}
}
