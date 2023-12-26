package ch.admin.zas.vdb.api;

import ch.admin.zas.vdb.interfaces.DataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Controller {
    private final DataService dataService;

    public Controller(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping(path = "/data")
    public ResponseEntity<Object> getData() {
        return ResponseEntity.ok().body(dataService.getData());
    }
}
