package org.ensim.pfa.pfa_backend.repositories.views_repositories;

import org.ensim.pfa.pfa_backend.model.views.MySecondDbtModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface MySecondDbtModelRepository extends JpaRepository<MySecondDbtModel, Long> {

    @Query("select m from MySecondDbtModel m")
    Page<MySecondDbtModel> findAll(Pageable pageable);
}
