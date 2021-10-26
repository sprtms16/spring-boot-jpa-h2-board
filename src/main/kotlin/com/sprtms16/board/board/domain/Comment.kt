package com.sprtms16.board.board.domain

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null
    var content: String? = null
    var password: String? = null
    var writer: String? = null

    @CreationTimestamp
    var createdAt: LocalDateTime = LocalDateTime.now()

    @UpdateTimestamp
    var updatedAt: LocalDateTime = LocalDateTime.now()

    @ManyToOne
    @JoinColumn(name = "board_id")
    var board: Board? = null

    @ManyToOne
    @JoinColumn(name = "comment_id")
    var comment: Comment? = null

    @OneToMany(mappedBy = "comment", orphanRemoval = true)
    var childComments: MutableList<Comment> = mutableListOf()
}
