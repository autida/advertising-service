package com.amazon.ata.advertising.service.activity;

import com.amazon.ata.advertising.service.dao.TargetingGroupDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdateClickThroughRateActivity_Factory
    implements Factory<UpdateClickThroughRateActivity> {
  private final Provider<TargetingGroupDao> targetingGroupDaoProvider;

  public UpdateClickThroughRateActivity_Factory(
      Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    this.targetingGroupDaoProvider = targetingGroupDaoProvider;
  }

  @Override
  public UpdateClickThroughRateActivity get() {
    return new UpdateClickThroughRateActivity(targetingGroupDaoProvider.get());
  }

  public static UpdateClickThroughRateActivity_Factory create(
      Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    return new UpdateClickThroughRateActivity_Factory(targetingGroupDaoProvider);
  }
}
