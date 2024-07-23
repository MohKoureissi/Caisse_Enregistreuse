package com.caisse.caisseEnregistreuse.Modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUtilisateur;
@Column(nullable = false, name ="nom")
    @NotNull(message = "Ce champs est vide")
    private String nom;
@Column( nullable = false, name = "prenom")
    @NotNull(message = "Ce champs est vide")
    private String prenom;
@Column(nullable = false, name = "email")
    @NotNull(message = "Ce champs est vide")
    private String email;
    @Column(nullable = false, name = "motdepasse")
    @NotNull(message = "Ce champs est vide")
    private String motdepasse;
    @Column(nullable = false, name = "role")
    @NotNull(message = "Ce champs est vide")
    private String role;
    @Column(nullable = false, name = "datecreation")
    @NotNull(message = "Ce champs est vide")
    private String datecreation;
}
