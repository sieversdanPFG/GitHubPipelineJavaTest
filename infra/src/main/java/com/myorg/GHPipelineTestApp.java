package com.myorg;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.StackProps;

import java.util.Arrays;

public class GHPipelineTestApp {
    public static void main(final String[] args) {
        App app = new App();

        new GHPipelineTestStack(app, "GHPipelineTestStack", StackProps.builder()

                // For more information, see https://docs.aws.amazon.com/cdk/latest/guide/environments.html
                .build());

        app.synth();
    }
}
