package net.yeolrim.store.insite.domain.search;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SearchRepository extends MongoRepository<Search, String> {

    Optional<Search> findById(String id);

    List<Search> findBySearchText(String searchText);
}
