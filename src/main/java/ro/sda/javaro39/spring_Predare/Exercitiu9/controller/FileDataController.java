package ro.sda.javaro39.spring_Predare.Exercitiu9.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.sda.javaro39.spring_Predare.Exercitiu9.dto.FileDataDto;
import ro.sda.javaro39.spring_Predare.Exercitiu9.entities.FileData;
import ro.sda.javaro39.spring_Predare.Exercitiu9.repositories.FileDataRepository;
import ro.sda.javaro39.spring_Predare.Exercitiu9.exceptions.SdaException;
import ro.sda.javaro39.spring_Predare.Exercitiu9.service.FileDataService;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(path = "/api/files-data")
@AllArgsConstructor
@Slf4j
public class FileDataController {
    FileDataService fileDataService;


    @GetMapping()
    public List<FileDataDto> getAllFiledata() {
        return fileDataService.findAll();
    }

    @GetMapping(path = "/{id}")
    public FileDataDto getFileData(@PathVariable(name = "id") Integer id) {
        return fileDataService.findById(id);
    }

    @PostMapping()
    public ResponseEntity<FileDataDto> createFileData(@Valid @RequestBody FileDataDto incomingFile) throws URISyntaxException {
        FileDataDto savedObject = fileDataService.save(incomingFile);
        return ResponseEntity.created(new URI("/api/files-data/" + savedObject.getId())).build();
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateFileData(@Valid @RequestBody FileDataDto fileData, @PathVariable(name = "id") Integer id) {
        fileDataService.update(fileData, id);
    }


    @DeleteMapping(path = "/{id}")
    public void deleteFileData(@PathVariable(name = "id") Integer id) {
        fileDataService.deleteById(id);
    }

    @ExceptionHandler(value = {SdaException.class})
    public String handleSdaException(SdaException e){
        log.error(e.getMessage(),e);
        return e.getMessage();
    }
}


