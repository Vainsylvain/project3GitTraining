package fr.isika.cda13.squeletteProjet3.launchers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;
import fr.isika.cda13.squeletteProjet3.devRepo.MessageRepository;
import fr.isika.cda13.squeletteProjet3.devRepo.ActivityRepository;
import fr.isika.cda13.squeletteProjet3.devRepo.PersonRepository;
import fr.isika.cda13.squeletteProjet3.model.Message;

public class LauncherMappingUserZone {
	
    public static void main(String[] args) {
        // Seulement pour un petit TP on fait un try catch pour éviter 
        // de faire crasher l'application
        
    	PersonRepository pr = new PersonRepository();
		pr.dataSet();
		
		MessageRepository mr = null;
		
		ActivityRepository ar = new ActivityRepository();
		
        System.out.println("Lancement Test ...");
        
        try {
            System.out.println("Lancement et démarrage de l'entity manager ...");
            
            // La classe de lancement HibernateUtil est 
            // utilisée dans ArticleRepository implicitement
            mr = new MessageRepository();
            ar = new ActivityRepository();
            
            Message jeuSteam = new Message();
            
            Activity testActivity = new Activity();
            
            // Appel persistance en BDD
            Long id = mr.persister(jeuSteam);
            System.out.println("Message persisté avec id : " + id);

            Long id_activity = ar.persister(testActivity);
            System.out.println("Activité persistée avec id : " + id);
             
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // On ferme l'entity manager pour nettoyer les ressources
            mr.closeEntityManager();
            // On arrête l'application (à ne pas faire dans une vraie application)
            System.exit(0);
        }
    }
        private static Date getTodaysDate() {
            return Date.from(LocalDate.now().atStartOfDay()
                             .atZone(ZoneId.systemDefault()).toInstant());
        }
    }