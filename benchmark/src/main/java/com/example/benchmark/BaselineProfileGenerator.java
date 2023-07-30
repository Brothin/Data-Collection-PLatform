package com.example.benchmark;

import androidx.benchmark.macro.ExperimentalBaselineProfilesApi;
import androidx.benchmark.macro.junit4.BaselineProfileRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import kotlin.OptIn;

@OptIn(markerClass = ExperimentalBaselineProfilesApi.class)
@RunWith(AndroidJUnit4.class)
public class BaselineProfileGenerator {

    @Rule
    BaselineProfileRule baselineRule= new BaselineProfileRule();

    @Test
    void generateBaselineProfile(){
        baselineRule.collectBaselineProfile(
                "com.example.datacollectionplatform",
                scope -> {
                    scope.pressHome();
                    scope.startActivityAndWait();
                    return null;
                });
    }
}
