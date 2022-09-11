package ro.sda.javaro39.spring_Predare.Exercitiu6;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "pl.sdacademy.zad6")
@Data
@Validated
public class Persoana {
    @NotNull(message = "Email is mandatory")
    @Email(message = "Nu esti valid")
    private String email;

    private String firstName;

    @NotNull
    @Length(min = 3, max = 20, message = "Numele nu este adecvat")
    private String lastName;

    @NotNull(message = "Address is required")
    private String address;

    @Min(value = 18, message = "varsta intersiza")
    private int age;

    @NotEmpty(message = "The field must not be empty")
    private List<String> values;

    private Map<String, String> customAttributes;

    @AssertTrue(message = "Address is invalid")
    public boolean isAddressValid() {
        return address != null && address.split(" ").length == 2;

    }
}
