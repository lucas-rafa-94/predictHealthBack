package com.predicthealth.app.controller;

import com.predicthealth.app.model.PredictHealthModel;
import com.predicthealth.app.service.PredictHealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/predict-health")
public class PredictHealthController {

    @Autowired
    PredictHealthService predictHealthService;

    @PostMapping(produces = "application/json")
    public String submitForm(@RequestBody PredictHealthModel predictHealthModel){
            return predictHealthService.postAzure(predictHealthModel);
    }
}
