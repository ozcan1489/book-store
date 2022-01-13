package com.sbHanokai.bookstore.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table
@Data
@Getter
@Setter
@Builder
@Entity(name = "bookOrder")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;

    @ElementCollection
    private List<Integer> bookList;
    private Double totalPrice;

}
