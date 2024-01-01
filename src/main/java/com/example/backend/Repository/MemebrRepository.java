package com.example.backend.Repository;

import com.example.backend.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemebrRepository extends JpaRepository<Member, String> {
}
