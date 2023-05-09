package com.amazon.ata.advertising.service.dependency;

import com.amazon.ata.advertising.service.dao.ContentDao;
import com.amazon.ata.advertising.service.dao.ReadableDao;
import com.amazon.ata.advertising.service.model.AdvertisementContent;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaoModule_ProvideContentDaoFactory
    implements Factory<ReadableDao<String, List<AdvertisementContent>>> {
  private final DaoModule module;

  private final Provider<ContentDao> contentDaoProvider;

  public DaoModule_ProvideContentDaoFactory(
      DaoModule module, Provider<ContentDao> contentDaoProvider) {
    this.module = module;
    this.contentDaoProvider = contentDaoProvider;
  }

  @Override
  public ReadableDao<String, List<AdvertisementContent>> get() {
    return Preconditions.checkNotNull(
        module.provideContentDao(contentDaoProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DaoModule_ProvideContentDaoFactory create(
      DaoModule module, Provider<ContentDao> contentDaoProvider) {
    return new DaoModule_ProvideContentDaoFactory(module, contentDaoProvider);
  }

  public static ReadableDao<String, List<AdvertisementContent>> proxyProvideContentDao(
      DaoModule instance, ContentDao contentDao) {
    return Preconditions.checkNotNull(
        instance.provideContentDao(contentDao),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
