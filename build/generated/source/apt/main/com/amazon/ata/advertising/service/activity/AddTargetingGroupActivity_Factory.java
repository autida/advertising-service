package com.amazon.ata.advertising.service.activity;

import com.amazon.ata.advertising.service.dao.TargetingGroupDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddTargetingGroupActivity_Factory implements Factory<AddTargetingGroupActivity> {
  private final Provider<TargetingGroupDao> targetingGroupDaoProvider;

  public AddTargetingGroupActivity_Factory(Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    this.targetingGroupDaoProvider = targetingGroupDaoProvider;
  }

  @Override
  public AddTargetingGroupActivity get() {
    return new AddTargetingGroupActivity(targetingGroupDaoProvider.get());
  }

  public static AddTargetingGroupActivity_Factory create(
      Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    return new AddTargetingGroupActivity_Factory(targetingGroupDaoProvider);
  }
}
