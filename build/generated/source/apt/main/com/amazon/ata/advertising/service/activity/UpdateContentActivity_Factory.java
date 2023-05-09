package com.amazon.ata.advertising.service.activity;

import com.amazon.ata.advertising.service.dao.ContentDao;
import com.amazon.ata.advertising.service.dao.TargetingGroupDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdateContentActivity_Factory implements Factory<UpdateContentActivity> {
  private final Provider<ContentDao> contentDaoProvider;

  private final Provider<TargetingGroupDao> targetingGroupDaoProvider;

  public UpdateContentActivity_Factory(
      Provider<ContentDao> contentDaoProvider,
      Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    this.contentDaoProvider = contentDaoProvider;
    this.targetingGroupDaoProvider = targetingGroupDaoProvider;
  }

  @Override
  public UpdateContentActivity get() {
    return new UpdateContentActivity(contentDaoProvider.get(), targetingGroupDaoProvider.get());
  }

  public static UpdateContentActivity_Factory create(
      Provider<ContentDao> contentDaoProvider,
      Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    return new UpdateContentActivity_Factory(contentDaoProvider, targetingGroupDaoProvider);
  }
}
