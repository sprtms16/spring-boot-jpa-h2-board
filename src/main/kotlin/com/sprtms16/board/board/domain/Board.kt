package com.sprtms16.board.board.domain

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null
    var title: String? = null
    var content: String? = null
    var writer: String? = null
    var password: String? = null
    var viewCount: Int = 0

    @OneToMany(mappedBy = "board", orphanRemoval = true)
    var comments: MutableList<Comment> = mutableListOf()

    @CreationTimestamp
    var createdAt: LocalDateTime? = null

    @UpdateTimestamp
    var updatedAt: LocalDateTime? = null
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Board) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Board(id=$id, title=$title, content=$content, writer=$writer, password=$password, viewCount=$viewCount, comments=$comments, createdAt=$createdAt, updatedAt=$updatedAt)"
    }


}
