package net.yeolrim.store.insite.domain.audience;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AudienceRepository extends MongoRepository<Audience, String> {

    Optional<Audience> findById(String id);
}
