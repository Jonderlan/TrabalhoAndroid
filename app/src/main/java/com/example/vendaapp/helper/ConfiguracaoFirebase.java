package com.example.vendaapp.helper;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ConfiguracaoFirebase {

    private static DatabaseReference refereciaFirebase;
    private static FirebaseAuth referenciaAutenducacao;
    private static StorageReference referenciaStorage;

    public static DatabaseReference getFirebase(){
        if (refereciaFirebase == null){
            refereciaFirebase = FirebaseDatabase.getInstance().getReference();
        }
            return refereciaFirebase;
    }

    //retorna instancia do FirebaseAuth
    public static FirebaseAuth getFirebaseAutenticacao(){
        if(referenciaAutenducacao == null){
            referenciaAutenducacao = FirebaseAuth.getInstance();
        }
        return referenciaAutenducacao;
    }

    public static StorageReference getFirebaseStorage(){
        if(referenciaStorage == null){
            referenciaStorage = FirebaseStorage.getInstance().getReference();
        }
        return referenciaStorage;
    }


}
