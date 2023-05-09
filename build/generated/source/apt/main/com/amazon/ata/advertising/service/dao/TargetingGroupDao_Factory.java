package com.amazon.ata.advertising.service.dao;

import com.amazon.ata.advertising.service.dependency.TargetingPredicateInjector;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TargetingGroupDao_Factory implements Factory<TargetingGroupDao> {
  private final Provider<TargetingPredicateInjector> targetingPredicateInjectorProvider;

  private final Provider<DynamoDBMapper> mapperProvider;

  public TargetingGroupDao_Factory(
      Provider<TargetingPredicateInjector> targetingPredicateInjectorProvider,
      Provider<DynamoDBMapper> mapperProvider) {
    this.targetingPredicateInjectorProvider = targetingPredicateInjectorProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public TargetingGroupDao get() {
    return new TargetingGroupDao(targetingPredicateInjectorProvider.get(), mapperProvider.get());
  }

  public static TargetingGroupDao_Factory create(
      Provider<TargetingPredicateInjector> targetingPredicateInjectorProvider,
      Provider<DynamoDBMapper> mapperProvider) {
    return new TargetingGroupDao_Factory(targetingPredicateInjectorProvider, mapperProvider);
  }
}
