package com.leyou.module.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Author Robert
 * @Create 2020/6/18
 * @Desc TODO
 **/
@Data
@Builder
@Entity
@Table(name = "tb_category",indexes = {@Index(columnList = "id")})
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "is_parent")
    private Integer isParent;
    @Column(name = "sort")
    private Integer sort;
}
