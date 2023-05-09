package com.amazon.ata.advertising.service.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContentDao_Factory implements Factory<ContentDao> {
  private final Provider<DynamoDBMapper> mapperProvider;

  public ContentDao_Factory(Provider<DynamoDBMapper> mapperProvider) {
    this.mapperProvider = mapperProvider;
  }

  @Override
  public ContentDao get() {
    return new ContentDao(mapperProvider.get());
  }

  public static ContentDao_Factory create(Provider<DynamoDBMapper> mapperProvider) {
    return new ContentDao_Factory(mapperProvider);
  }
}
