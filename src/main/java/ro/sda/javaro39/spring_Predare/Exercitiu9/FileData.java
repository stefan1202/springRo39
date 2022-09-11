package ro.sda.javaro39.spring_Predare.Exercitiu9;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Setter
@Getter
@ToString
@Table(name = "file_data")
public class FileData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String file_name;
    private String extension;
    private String size_in_kb;
    private String content;
}
