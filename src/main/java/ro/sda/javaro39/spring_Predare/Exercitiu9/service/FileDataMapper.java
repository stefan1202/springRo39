package ro.sda.javaro39.spring_Predare.Exercitiu9.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ro.sda.javaro39.spring_Predare.Exercitiu9.dto.FileDataDto;
import ro.sda.javaro39.spring_Predare.Exercitiu9.entities.FileData;
import ro.sda.javaro39.spring_Predare.Exercitiu9.repositories.FileDataRepository;

@Service
@AllArgsConstructor
public class FileDataMapper implements Mapper<FileData, FileDataDto>{
    FileDataRepository fileDataRepository;
    @Override
    public FileDataDto convertToDto(FileData entity) {
        FileDataDto dto = new FileDataDto();
        dto.setExtension(entity.getExtension());
        dto.setFileName(entity.getFileName());
        dto.setContent(entity.getContent());
        dto.setSizeInKb(entity.getSizeInKb());
        dto.setId(entity.getId());
        return dto;
    }

    @Override
    public FileData convertToEntity(FileDataDto dto) {
        FileData entity = new FileData();
        if (dto.getId() !=null){
            entity = fileDataRepository.findById(dto.getId()).orElse(entity);
        }
        entity.setContent(dto.getContent());
        entity.setFileName(dto.getFileName());
        entity.setExtension(dto.getExtension());
        entity.setSizeInKb(dto.getSizeInKb());
        return entity;
    }
}
