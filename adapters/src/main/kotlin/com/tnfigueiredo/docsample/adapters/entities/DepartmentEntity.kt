package com.tnfigueiredo.docsample.adapters.entities

import com.tnfigueiredo.docsample.domain.model.Department
import jakarta.persistence.*
import org.hibernate.proxy.HibernateProxy


@Entity(name = "DEPARTMENT")
data class DepartmentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    override val id: Int? = null,
    @Column(unique = true)
    override val name: String = "",
    @Column(unique = true)
    override val abbreviation: String = "",
    @Column
    override val creatorId: Int? = 1
):Department(
    id = id,
    name = name,
    abbreviation = abbreviation,
    creatorId = creatorId
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        val oEffectiveClass =
            if (other is HibernateProxy) other.hibernateLazyInitializer.persistentClass else other.javaClass
        val thisEffectiveClass = this.javaClass
        if (thisEffectiveClass != oEffectiveClass) return false
        other as DepartmentEntity

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return super.toString()
    }
}
