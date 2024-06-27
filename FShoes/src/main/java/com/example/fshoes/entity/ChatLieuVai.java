package com.example.fshoes.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Table(name = "chatlieuvai")
public class ChatLieuVai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ten_loai_chat_lieu_vai")
    private String tenChatLieuVai;
    @Column(name="created_At")
    private LocalDateTime createdAt;
    @Column(name="updated_At")
    private LocalDateTime updatedAt;
    @Column(name="trang_thai")
    private int trangThai;


}
