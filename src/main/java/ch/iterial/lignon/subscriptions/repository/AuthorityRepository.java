package ch.iterial.lignon.subscriptions.repository;

import ch.iterial.lignon.subscriptions.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
