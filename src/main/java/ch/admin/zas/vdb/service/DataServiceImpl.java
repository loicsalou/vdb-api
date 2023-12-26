package ch.admin.zas.vdb.service;

import ch.admin.zas.vdb.dto.Data;
import ch.admin.zas.vdb.dto.Server;
import ch.admin.zas.vdb.dto.Vulnerability;
import ch.admin.zas.vdb.interfaces.DataService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    public Collection<Data> getData() {
        return List.of(mockData());
    }

    private Data mockData() {
        return new Data(1, new Vulnerability("2", "vuln 2",2), new Server("127.0.0.1", "Serveur 3"));
    }
}
