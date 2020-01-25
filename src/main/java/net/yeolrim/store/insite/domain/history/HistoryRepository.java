package net.yeolrim.store.insite.domain.history;

import net.yeolrim.store.insite.domain.audience.Audience;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HistoryRepository extends MongoRepository<History, String> {

    Optional<History> findByAudience(Audience audience);
}
