package kuliah.uts.airplane.service;

import kuliah.uts.airplane.entity.Destination;
import kuliah.uts.airplane.model.CreateOrupdateDestinationRequest;
import kuliah.uts.airplane.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {
    @Autowired
    private DestinationRepository destinationRepository;

    public Destination create(CreateOrupdateDestinationRequest request) {
        // TODO: validation
        // TODO: checking country exist
        // TODO : store to db
        return new Destination();
    }

    public Destination update(Integer id ,CreateOrupdateDestinationRequest request) {
        // TODO: validation
        // TODO: checking country exist
        // TODO : update to db
        return new Destination();
    }

    public Destination get(Integer id) {
        // TODO: validation
        // TODO: get from db by id
        Destination destination = new  Destination();
        return destination;
    }

    public List<Destination> getAll() {
        return destinationRepository.findAll();
    }

    public Destination delete(Integer id) {
        // TODO: validation
        // TODO: checking destination exist
        // TODO: delete destination from db
        Destination destination = new  Destination();
        return destination;
    }
}
