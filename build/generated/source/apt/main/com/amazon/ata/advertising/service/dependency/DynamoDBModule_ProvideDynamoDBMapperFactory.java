package com.amazon.ata.advertising.service.dependency;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DynamoDBModule_ProvideDynamoDBMapperFactory implements Factory<DynamoDBMapper> {
  private final DynamoDBModule module;

  public DynamoDBModule_ProvideDynamoDBMapperFactory(DynamoDBModule module) {
    this.module = module;
  }

  @Override
  public DynamoDBMapper get() {
    return Preconditions.checkNotNull(
        module.provideDynamoDBMapper(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DynamoDBModule_ProvideDynamoDBMapperFactory create(DynamoDBModule module) {
    return new DynamoDBModule_ProvideDynamoDBMapperFactory(module);
  }

  public static DynamoDBMapper proxyProvideDynamoDBMapper(DynamoDBModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDynamoDBMapper(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
