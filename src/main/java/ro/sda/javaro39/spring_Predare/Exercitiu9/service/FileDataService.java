package ro.sda.javaro39.spring_Predare.Exercitiu9.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ro.sda.javaro39.spring_Predare.Exercitiu9.dto.FileDataDto;
import ro.sda.javaro39.spring_Predare.Exercitiu9.entities.FileData;
import ro.sda.javaro39.spring_Predare.Exercitiu9.exceptions.SdaException;
import ro.sda.javaro39.spring_Predare.Exercitiu9.repositories.FileDataRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FileDataService {
    FileDataRepository fileDataRepository;
    FileDataMapper fileDataMapper;

    public List<FileDataDto> findAll() {
        return fileDataRepository.findAll()
                .stream()
                .map((entity) ->fileDataMapper.convertToDto(entity))
                .collect(Collectors.toList());
    }

    public FileDataDto findById(Integer id) {
        FileData fileData= retrieveById(id);
        return fileDataMapper.convertToDto(fileData);
    }

    private FileData retrieveById(Integer id){
        return fileDataRepository.findById(id).orElseThrow(() -> new SdaException(String.format("Object with id %s not found",String.valueOf(id))));
    }

    public FileDataDto save(FileDataDto incomingFile) {
        FileData entity = fileDataMapper.convertToEntity(incomingFile);
        fileDataRepository.save(entity);
        return fileDataMapper.convertToDto(entity);
    }

    public void update(FileDataDto fileData, Integer id) {
        FileData existing = retrieveById(id);
        existing.setExtension(fileData.getExtension());
        existing.setFileName(fileData.getFileName());
        existing.setSizeInKb(fileData.getSizeInKb());
        fileDataRepository.save(existing);
    }

    public void deleteById(Integer id) {
        FileData fileData = retrieveById(id);
        fileDataRepository.delete(fileData);
    }
}
