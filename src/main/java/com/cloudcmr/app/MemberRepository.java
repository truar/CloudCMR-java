package com.cloudcmr.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "members", path = "members")
public interface MemberRepository extends CrudRepository<Member, Long> {

    List<Member> findByLastName(@Param("lastName") String lastName);
}
