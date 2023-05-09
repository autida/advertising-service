package com.amazon.ata.advertising.service.dependency;

import com.amazon.ata.advertising.service.dao.ReadableDao;
import com.amazon.ata.customerservice.CustomerProfile;
import com.amazon.atacustomerservicelambda.service.ATACustomerService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaoModule_ProvideCustomerProfileDaoFactory
    implements Factory<ReadableDao<String, CustomerProfile>> {
  private final DaoModule module;

  private final Provider<ATACustomerService> customerClientProvider;

  public DaoModule_ProvideCustomerProfileDaoFactory(
      DaoModule module, Provider<ATACustomerService> customerClientProvider) {
    this.module = module;
    this.customerClientProvider = customerClientProvider;
  }

  @Override
  public ReadableDao<String, CustomerProfile> get() {
    return Preconditions.checkNotNull(
        module.provideCustomerProfileDao(customerClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DaoModule_ProvideCustomerProfileDaoFactory create(
      DaoModule module, Provider<ATACustomerService> customerClientProvider) {
    return new DaoModule_ProvideCustomerProfileDaoFactory(module, customerClientProvider);
  }

  public static ReadableDao<String, CustomerProfile> proxyProvideCustomerProfileDao(
      DaoModule instance, ATACustomerService customerClient) {
    return Preconditions.checkNotNull(
        instance.provideCustomerProfileDao(customerClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
