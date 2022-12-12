package com.example.case_module4.repository;


import com.example.case_module4.model.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IAppUserRepository extends PagingAndSortingRepository<AppUser,Long> {
    Optional<AppUser> findByUsername(String username);
    Iterable<AppUser> findAllByUsernameContaining(String username);


}
