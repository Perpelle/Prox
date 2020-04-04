package Proxemic;
import Proxemic.Distance;
import Proxemic.ProxZone;
import java.util.ArrayList;

// Scenario projet confidentiel

//Permet de définir les zones  proxémiques
    ProxZone proxzone;
            String zoneProxemique;
//Permet de définir la distance séparant une entité à la caméra placé près de la machine
            Distance distance;

//Initialisation des distances
            distance = new Distance();

//Calcul de la distance

public class Distance {

    public double setBluetoothDistance(double rssi, double txPower) {
        return this.distance = Math.pow(10.0D, (txPower - rssi) / 20.0D);
    }
}

    public double getDistance() {
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


//Définition des zones proxémiques (valeurs exactes à définir)
    proxzone = new ProxZone(0.25D, 0.45D, 1.0D, 2.0D);
            zoneProxemique = new String();

// Met à jour la zone proxémique en fonction de la distance
            zoneProxemique = proxzone.setDistanceofEntity(distance.getDistance());

//Affiche les informations en fonction de la zone proxémique
            void AfficherInformation(String zoneProxemique) {
            if (zoneProxemique == "intimiZone") {
            //Alarme sur le telephone

            }
            else if (zoneProxemique == "personalZone") {
            //Alarme sur le telephone

            }

            else if (zoneProxemique == "socialZone") {
            //Afficher certaines informations

            }

            else if (zoneProxemique == "publicZone") {
            //Afficher certaines informations

            }

