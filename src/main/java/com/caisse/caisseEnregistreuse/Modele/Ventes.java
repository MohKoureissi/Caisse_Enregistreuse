package com.caisse.caisseEnregistreuse.Modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ventes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVente;
    
}
