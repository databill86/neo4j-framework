package com.graphaware.runtime.config;

import com.graphaware.common.strategy.InclusionStrategies;

/**
 *
 */
public class MinimalRuntimeModuleConfiguration extends BaseRuntimeModuleConfiguration<MinimalRuntimeModuleConfiguration> implements RuntimeModuleConfiguration {

    public MinimalRuntimeModuleConfiguration() {
        super(InclusionStrategies.all());
    }

    public MinimalRuntimeModuleConfiguration(InclusionStrategies inclusionStrategies) {
        super(inclusionStrategies);
    }

    @Override
    protected MinimalRuntimeModuleConfiguration newInstance(InclusionStrategies inclusionStrategies) {
        return new MinimalRuntimeModuleConfiguration(inclusionStrategies);
    }
}