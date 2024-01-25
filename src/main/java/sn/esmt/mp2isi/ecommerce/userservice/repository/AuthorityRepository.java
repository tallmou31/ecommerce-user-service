package sn.esmt.mp2isi.ecommerce.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.esmt.mp2isi.ecommerce.userservice.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
