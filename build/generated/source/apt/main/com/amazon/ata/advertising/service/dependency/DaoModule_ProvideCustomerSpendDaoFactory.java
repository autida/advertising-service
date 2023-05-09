package com.amazon.ata.advertising.service.dependency;

import com.amazon.ata.advertising.service.dao.ReadableDao;
import com.amazon.ata.advertising.service.model.RequestContext;
import com.amazon.ata.customerservice.Spend;
import com.amazon.atacustomerservicelambda.service.ATACustomerService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaoModule_ProvideCustomerSpendDaoFactory
    implements Factory<ReadableDao<RequestContext, Map<String, Spend>>> {
  private final DaoModule module;

  private final Provider<ATACustomerService> customerClientProvider;

  public DaoModule_ProvideCustomerSpendDaoFactory(
      DaoModule module, Provider<ATACustomerService> customerClientProvider) {
    this.module = module;
    this.customerClientProvider = customerClientProvider;
  }

  @Override
  public ReadableDao<RequestContext, Map<String, Spend>> get() {
    return Preconditions.checkNotNull(
        module.provideCustomerSpendDao(customerClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DaoModule_ProvideCustomerSpendDaoFactory create(
      DaoModule module, Provider<ATACustomerService> customerClientProvider) {
    return new DaoModule_ProvideCustomerSpendDaoFactory(module, customerClientProvider);
  }

  public static ReadableDao<RequestContext, Map<String, Spend>> proxyProvideCustomerSpendDao(
      DaoModule instance, ATACustomerService customerClient) {
    return Preconditions.checkNotNull(
        instance.provideCustomerSpendDao(customerClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
