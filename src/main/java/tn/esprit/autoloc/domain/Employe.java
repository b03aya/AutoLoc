package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmploye;

    @Column(nullable = false, length = 50)
    private String nom;
    @Column(nullable = false, length = 20)
    private String prenom;

    @Enumerated
    @Column(nullable = false, length = 8)
    private RoleEmploye role;
}
