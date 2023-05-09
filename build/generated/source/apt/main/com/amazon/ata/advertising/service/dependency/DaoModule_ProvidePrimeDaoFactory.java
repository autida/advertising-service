package com.amazon.ata.advertising.service.dependency;

import com.amazon.ata.advertising.service.dao.ReadableDao;
import com.amazon.ata.advertising.service.model.RequestContext;
import com.amazon.ataprimeclubservicelambda.service.ATAPrimeClubService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaoModule_ProvidePrimeDaoFactory
    implements Factory<ReadableDao<RequestContext, List<String>>> {
  private final DaoModule module;

  private final Provider<ATAPrimeClubService> primeClubServiceClientProvider;

  public DaoModule_ProvidePrimeDaoFactory(
      DaoModule module, Provider<ATAPrimeClubService> primeClubServiceClientProvider) {
    this.module = module;
    this.primeClubServiceClientProvider = primeClubServiceClientProvider;
  }

  @Override
  public ReadableDao<RequestContext, List<String>> get() {
    return Preconditions.checkNotNull(
        module.providePrimeDao(primeClubServiceClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DaoModule_ProvidePrimeDaoFactory create(
      DaoModule module, Provider<ATAPrimeClubService> primeClubServiceClientProvider) {
    return new DaoModule_ProvidePrimeDaoFactory(module, primeClubServiceClientProvider);
  }

  public static ReadableDao<RequestContext, List<String>> proxyProvidePrimeDao(
      DaoModule instance, ATAPrimeClubService primeClubServiceClient) {
    return Preconditions.checkNotNull(
        instance.providePrimeDao(primeClubServiceClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
