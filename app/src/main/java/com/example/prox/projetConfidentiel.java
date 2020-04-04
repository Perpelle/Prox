package com.example.prox;
import android.app.Activity;
import android.media.MediaPlayer;

import Proxemic.Distance;
import Proxemic.ProxZone;
import java.io.*;
import java.util.ArrayList;

public class projetConfidentiel extends Activity {

    public double setBluetoothDistance(double rssi, double txPower) {
        double distanceTest;
        return distanceTest = Math.pow(10.0D, (txPower - rssi) / 20.0D);
    }

    //Définition des zones proxémiques (valeurs exactes à définir)
    ProxZone proxzone = new ProxZone(0.25D, 0.45D, 1.0D, 2.0D);


    // Met à jour la zone proxémique en fonction de la distance
    Distance distance = new Distance();
    String zoneProxemique = proxzone.setDistanceofEntity(distance.getDistance());
    //Alarme sur le telephone
    MediaPlayer alarme = MediaPlayer.create(this, R.raw.alarme1);

    //Affiche les informations en fonction de la zone proxémique
    void AfficherInformation(String zoneProxemique) {
        if (zoneProxemique == "intimiZone") {
            alarme.start();

        } else if (zoneProxemique == "personalZone") {
            //Alarme sur le telephone
            alarme.start();

        } else if (zoneProxemique == "socialZone") {
            //Afficher certaines informations

        } else if (zoneProxemique == "publicZone") {
            //Afficher certaines informations

        }


    }
}