package com.insurance.homeInsurance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.insurance.homeInsurance.entity.Feature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.insurance.homeInsurance.exception.CustomerException;
import com.insurance.homeInsurance.exception.FeatureException;
import com.insurance.homeInsurance.service.FeatureService;

 

@SpringBootTest
public class FeatureTest {
    @Autowired
    private FeatureService featureService;


    @Test
    public void addFeatureTest() throws FeatureException {
        Feature feature = this.featureService.addFeature(new Feature(122,"feature1",145.90));
        assertEquals(true,feature);
    }

//    @Test
//    public void updateFeatureTest() throws CustomerException {
//        Feature feature = this.featureService.updateFeature(new Feature(122,"feature1",145.90));
//        assertEquals("feature1",feature.getFeatureName());
//    }
    @Test
    public void getAllFeatures() throws FeatureException {
        this.featureService.addFeature(new Feature(122,"feature1",145.90));
        assertEquals(2,this.featureService.getAllFeatures().size());
    }
    @Test
    public void deleteFeatureByIdTest() throws FeatureException {

            this.featureService.deleteFeatureById(9);
            assertTrue(this.featureService.getFeatureByOwnedPolicyId(1)==null);

    }

    @Test
    public void getFeatureByOwnedPolicyIdTest() {
//        assertEquals("",this.featureService.getFeatureByOwnedPolicyId(17).get);
    }

}
