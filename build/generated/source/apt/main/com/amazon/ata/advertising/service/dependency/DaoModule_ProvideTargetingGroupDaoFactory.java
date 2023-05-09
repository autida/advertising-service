package com.amazon.ata.advertising.service.dependency;

import com.amazon.ata.advertising.service.dao.ReadableDao;
import com.amazon.ata.advertising.service.dao.TargetingGroupDao;
import com.amazon.ata.advertising.service.targeting.TargetingGroup;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaoModule_ProvideTargetingGroupDaoFactory
    implements Factory<ReadableDao<String, List<TargetingGroup>>> {
  private final DaoModule module;

  private final Provider<TargetingGroupDao> targetingGroupDaoProvider;

  public DaoModule_ProvideTargetingGroupDaoFactory(
      DaoModule module, Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    this.module = module;
    this.targetingGroupDaoProvider = targetingGroupDaoProvider;
  }

  @Override
  public ReadableDao<String, List<TargetingGroup>> get() {
    return Preconditions.checkNotNull(
        module.provideTargetingGroupDao(targetingGroupDaoProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DaoModule_ProvideTargetingGroupDaoFactory create(
      DaoModule module, Provider<TargetingGroupDao> targetingGroupDaoProvider) {
    return new DaoModule_ProvideTargetingGroupDaoFactory(module, targetingGroupDaoProvider);
  }

  public static ReadableDao<String, List<TargetingGroup>> proxyProvideTargetingGroupDao(
      DaoModule instance, TargetingGroupDao targetingGroupDao) {
    return Preconditions.checkNotNull(
        instance.provideTargetingGroupDao(targetingGroupDao),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
