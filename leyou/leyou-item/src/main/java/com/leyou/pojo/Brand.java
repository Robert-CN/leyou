package com.leyou.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;

/**
 * @Author Robert
 * @Create 2020/6/18
 * @Desc TODO
 **/
@Data
@Builder
@Entity
@Table(name = "tb_brand",indexes = {@Index(columnList = "id")})
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "letter")
    private String letter;
}
