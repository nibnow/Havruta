package com.example.havruta.data.entity;

import com.example.havruta.data.entity.serializable.CategoryProblemId;
import com.example.havruta.data.entity.serializable.MemberId;
import com.example.havruta.data.repository.ProblemRepository;
import lombok.*;

import javax.persistence.*;

@Table(name = "members")
@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryProblemEntity {
    @EmbeddedId
    private CategoryProblemId id;

    @ManyToOne
    @MapsId("categoryId")
    private CategoryEntity categoryEntity;

    @ManyToOne
    @MapsId("problemId")
    private ProblemEntity problemEntity;
}