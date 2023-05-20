package trananhhien.Lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trananhhien.Lab3.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
