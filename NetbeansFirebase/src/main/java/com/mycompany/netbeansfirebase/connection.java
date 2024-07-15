package com.mycompany.netbeansfirebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author t42131
 */
public class connection {

    public static Firestore db;

    public static void connectioFirebase() {
        try {
            FileInputStream Cuentas = new FileInputStream("NetbeansFirebaseConnection.json");

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(Cuentas))
                    .build();

            FirebaseApp.initializeApp(options);
            db = FirestoreClient.getFirestore();
            System.out.println("Conección Exitosa");
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
