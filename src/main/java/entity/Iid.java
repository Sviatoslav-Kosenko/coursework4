package entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@MappedSuperclass

public class Iid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
