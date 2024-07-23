package com.caisse.caisseEnregistreuse.Modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    @Column(nullable = false, name = "codeBarres")
    @NotNull(message= "Ce champs est vide")
    private String codeBarres;
    @Column(nullable = false, name = "nom")
    @NotNull(message= "Ce champs est vide")
    private String nom;
    @Column(nullable = false, name = "description")
    @NotNull(message= "Ce champs est vide")
    private String description;
    @Column(nullable = false, name = "prix")
    @NotNull(message= "Ce champs est vide")
    private long prix;
    @Column(nullable = false, name = "quantiteStock")
    @NotNull(message= "Ce champs est vide")
    private String quantiteStock;
    @Column(nullable = false, name = "dateAjout")
    @NotNull(message= "Ce champs est vide")
    private LocalDate dateAjout;
}
