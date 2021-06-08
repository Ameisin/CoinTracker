package com.mbac.springboot.web.app.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.mbac.springboot.web.app.dto.CoinDTO;
import com.mbac.springboot.web.app.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class CoinsService {

    public static final String COL_NAME = "Coins";

    public String addCoin(CoinDTO coin) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = db.collection(COL_NAME).document(String.valueOf(coin.getId())).set(coin);
        return "Created coin with id "+coin.getId()+" at "+ writeResult.get().getUpdateTime();
    }

    public CoinDTO getCoin(Integer id) throws NotFoundException, ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        DocumentReference docRef = db.collection(COL_NAME).document(String.valueOf(id));
        ApiFuture<DocumentSnapshot> apiFuture = docRef.get();
        DocumentSnapshot docSnap = apiFuture.get();
        if (docSnap.exists()) {
            return docSnap.toObject(CoinDTO.class);
        } else {
            throw new NotFoundException("Coin not found: " + id);
        }
    }

    public String updateCoin(CoinDTO coin) throws ExecutionException, InterruptedException, NotFoundException {
        CoinDTO dbCoin = getCoin(coin.getId());
        if (null != dbCoin) {
            Firestore db = FirestoreClient.getFirestore();
            ApiFuture<WriteResult> writeResult = db.collection(COL_NAME).document(String.valueOf(coin.getId())).set(coin);
            return "Updated coin with id "+coin.getId()+" at "+ writeResult.get().getUpdateTime();
        } else {
            throw new NotFoundException("Coin not found: " + coin.getId());
        }
    }

    public String deleteCoin(Integer id) throws NotFoundException, ExecutionException, InterruptedException {
        CoinDTO dbCoin = getCoin(id);
        if (null != dbCoin){
            Firestore db = FirestoreClient.getFirestore();
            ApiFuture<WriteResult> writeResult = db.collection(COL_NAME).document(String.valueOf(id)).delete();
            return "Deleted coin with id "+id+" at "+ writeResult.get().getUpdateTime();
        }else {
            throw new NotFoundException("Coin not found: " + id);
        }
    }

}