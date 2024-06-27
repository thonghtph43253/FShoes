package com.example.fshoes.repository;

import com.example.fshoes.entity.ChatLieuVai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatLieuVaiRepo extends JpaRepository<ChatLieuVai, Long> {
}
