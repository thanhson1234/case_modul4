package com.example.case_module4.service.interfaceimpl;


import com.example.case_module4.model.AppUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IAppUserService extends UserDetailsService {
    Iterable<AppUser> findAll();

    AppUser save(AppUser appUser);

    void delete(Long id);

    Page<AppUser> findPage(Pageable pageable);

    Optional<AppUser> findById(Long id);

    Iterable<AppUser>findByName(String name);

    Optional<AppUser> findByUsername(String username);

}
