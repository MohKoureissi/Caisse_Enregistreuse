package com.caisse.caisseEnregistreuse.Modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ventes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVente;
@Column(nullable = false, name = "dateVente")
@NotNull(message = "Ce champs est vide")
private LocalDate dateVente;
@Column(nullable = false, name = "montant")
@NotNull(message = "Ce champs est vide")
private long montant;

    @ManyToOne()
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;


}
