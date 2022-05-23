package com.example.openapi3.controller;

import com.example.openapi.api.V1Api;
import com.example.openapi.model.BackupMessagesResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messageController implements V1Api {

    @Override
    public ResponseEntity<BackupMessagesResponse> getBackupMessages(String warehouseId, String content) {
        return V1Api.super.getBackupMessages(warehouseId, content);
    }
}
