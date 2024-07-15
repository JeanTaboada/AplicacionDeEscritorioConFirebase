package com.mycompany.netbeansfirebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author t42131
 */
public class PersonaProvide {

    CollectionReference reference;
    static Firestore db;

    public static boolean guardarPersona(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();

        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Guardado correctamente");
            return true;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());

        }
        return false;
    }

    public static boolean actualizarPersona(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();

        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.update(data);
            System.out.println("Actualizado correctamente");
            return true;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());

        }
        return false;
    }

    public static boolean eliminarPersona(String coleccion, String documento) {
        db = FirestoreClient.getFirestore();

        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
            System.out.println("Eliminado correctamente");
            return true;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());

        }
        return false;
    }
    public static boolean cargarTablaPersona(JTable table) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombres y Apellidos");
        model.addColumn("DNI");
        model.addColumn("Edad");
        model.addColumn("Email");
        model.addColumn("Rubro");
        model.addColumn("ID - Catg");

        try {
            CollectionReference personas = connection.db.collection("Persona");
            ApiFuture<QuerySnapshot> querySnap = personas.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                model.addRow(new Object[]{
                    document.getId(),
                    document.getString("Nombres y Apellidos"),
                    document.getString("DNI"),
                    document.getString("Edad"),
                    document.getString("Email"),
                    document.getString("Rubro"),
                    document.getString("ID - Catg")
                });
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());

        }
        table.setModel(model);
        return false;
    }
     public static boolean cargarTablaCatg1(JTable table, String categoria1) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombres y Apellidos");
        model.addColumn("DNI");
        model.addColumn("Edad");
        model.addColumn("Email");
        model.addColumn("Rubro");
        model.addColumn("ID - Catg");


            try {
                CollectionReference personas = connection.db.collection("Persona");
                ApiFuture<QuerySnapshot> querySnap = personas.whereEqualTo("ID - Catg", categoria1).get();
                
                for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                    model.addRow(new Object[]{
                        document.getId(),
                        document.getString("Nombres y Apellidos"),
                        document.getString("DNI"),
                        document.getString("Edad"),
                        document.getString("Email"),
                        document.getString("Rubro"),
                        document.getString("ID - Catg")
                    });
                }
            } catch (InterruptedException | ExecutionException e) {
                System.err.println("Error: " + e.getMessage());
                
            }
        table.setModel(model);
        return false;
    }
}

