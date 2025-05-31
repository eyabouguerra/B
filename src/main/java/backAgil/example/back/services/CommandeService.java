package backAgil.example.back.services;

import backAgil.example.back.models.Commande;
import java.util.List;

public interface CommandeService {
    List<Commande> getAllCommandes();
    Commande getCommandeById(Long id);
    void deleteCommandeById(Long id);
    Commande addCommande(Commande commande);
    Commande editCommande(Commande updatedCommande);
    boolean checkCodeCommandeExists(String codeCommande);

    // Nouvelles méthodes pour gérer le statut
    List<Commande> getCommandesByStatut(Commande.StatutCommande statut);
    Commande updateStatutCommande(Long id, Commande.StatutCommande nouveauStatut);
}