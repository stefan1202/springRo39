package ro.sda.javaro39.spring_Predare.Exercitiu9.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FileDataDto {

    private Integer id;
    @NotNull
    @Length(min=3,max=55, message = "File name length must be between 3 and 55 characters")
    private String fileName;
    @NotNull
    @Length(min=2,max=3, message = "Extension length must be between 2 and 3 characters")
    private String extension;
    @NotNull
    @Min(1)
    @Max(10000)
    private int sizeInKb;
    private String content;
}
