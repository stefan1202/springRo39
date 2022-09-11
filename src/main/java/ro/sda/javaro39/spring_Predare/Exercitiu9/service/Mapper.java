package ro.sda.javaro39.spring_Predare.Exercitiu9.service;

public interface Mapper <E,D>{
    D convertToDto(E entity);
    E convertToEntity(D dto);
}
