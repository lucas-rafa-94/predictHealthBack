package com.predicthealth.app.service;

import com.predicthealth.app.model.PredictHealthModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PredictHealthService {

    public String postAzure(PredictHealthModel predictHealthModel){

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Authorization", "Bearer zXDT8DtcpmIdlyRiXAteUKAr8yrffCd6y5/RtQIReOLwFp3KZo+7842wbBLtv1zbZsrW2liuVEV8KUluw6CANQ==");

        String payload = "{\n" +
                "        \"Inputs\": {\n" +
                "                \"input1\":\n" +
                "                [\n" +
                "                    {\n" +
                "                            'temperatura': \""+ predictHealthModel.getTemperatura() +"\",\n" +
                "                            'nausea': \""+ predictHealthModel.getNausea()+"\",\n" +
                "                            'dor lombar': \""+ predictHealthModel.getDorLombar() +"\",\n" +
                "                            'urinando muito': \""+ predictHealthModel.getUrinandoMuito() +"\",\n" +
                "                            'Dor ao urinar': \""+ predictHealthModel.getDorAoUrinar() +"\",\n" +
                "                            'queimcao na uretra': \""+ predictHealthModel.getQueimacaoNaUretra() +"\",\n" +
                "                    }\n" +
                "                ],\n" +
                "        },\n" +
                "    \"GlobalParameters\":  {\n" +
                "    }\n" +
                "}";

        HttpEntity<String> request = new HttpEntity<>(payload, headers);

        String response = restTemplate.postForObject("https://ussouthcentral.services.azureml.net/workspaces/f2fc0aabc6bc41b39e6f56afd008532b/services/0e9bf66c686842a3958f9a11ae33dc5a/execute?api-version=2.0&format=swagger", request, String.class);

        return response;
    }
}
