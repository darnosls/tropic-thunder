package com.store.tropicthunder.repository;

import com.store.tropicthunder.model.Characters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharactersRepository extends JpaRepository<Characters, Long>
{
}
