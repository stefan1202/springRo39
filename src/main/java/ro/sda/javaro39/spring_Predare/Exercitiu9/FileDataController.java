package ro.sda.javaro39.spring_Predare.Exercitiu9;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(path = "/api/files-data")
public class FileDataController {
    FileDataRepository fileDataRepository;

    public FileDataController(FileDataRepository fileDataRepository) {
        this.fileDataRepository = fileDataRepository;
    }

    @GetMapping()
    public List<FileData> getAllFiledata() {
        return fileDataRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public FileData getFileData(@PathVariable(name = "id") Integer id) {
        return fileDataRepository.findById(id).orElseThrow(() -> new SdaException("Object not found"));
    }

    @PostMapping()
    public ResponseEntity<FileData> createFileData(@RequestBody FileData incomingFile) throws URISyntaxException {

        fileDataRepository.save(incomingFile);
        return ResponseEntity.created(new URI("/api/files-data/" + incomingFile.getId())).build();
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateFileData(@RequestBody FileData fileData, @PathVariable(name = "id") Integer id) {
        FileData existing = fileDataRepository.findById(id).orElseThrow(() -> new SdaException("Object not found"));
        existing.setExtension(fileData.getExtension());
        fileDataRepository.save(fileData);
    }


    @DeleteMapping(path = "/{id}")
    public void deleteFileData(@PathVariable(name = "id") Integer id) {
//        if (fileDataRepository.findById(id).isPresent()) {
//            fileDataRepository.deleteById(id);
//        } else {
//            throw new SdaException("Object not found");
//        }

        FileData fileData = fileDataRepository.findById(id).orElseThrow(() -> new SdaException("Object not found"));
        fileDataRepository.delete(fileData);
    }
}


