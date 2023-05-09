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
public final class CreateContentActivity_Factory implements Factory<CreateContentActivity> {
  private final Provider<ContentDao> contentDaoProvider;

  private final Provider<TargetingGroupDao> targetingGroupDaoProvider;

  public CreateContentActivity_Factory(
      Provider<ContentDao> contentDaoProvider,
      Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    this.contentDaoProvider = contentDaoProvider;
    this.targetingGroupDaoProvider = targetingGroupDaoProvider;
  }

  @Override
  public CreateContentActivity get() {
    return new CreateContentActivity(contentDaoProvider.get(), targetingGroupDaoProvider.get());
  }

  public static CreateContentActivity_Factory create(
      Provider<ContentDao> contentDaoProvider,
      Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    return new CreateContentActivity_Factory(contentDaoProvider, targetingGroupDaoProvider);
  }
}
