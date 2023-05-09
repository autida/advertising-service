package com.amazon.ata.advertising.service.dependency;

import com.amazon.atacustomerservicelambda.service.ATACustomerService;
import com.amazonaws.auth.AWSCredentialsProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExternalServiceModule_ProvideCustomerServiceFactory
    implements Factory<ATACustomerService> {
  private final ExternalServiceModule module;

  private final Provider<AWSCredentialsProvider> credentialsProvider;

  public ExternalServiceModule_ProvideCustomerServiceFactory(
      ExternalServiceModule module, Provider<AWSCredentialsProvider> credentialsProvider) {
    this.module = module;
    this.credentialsProvider = credentialsProvider;
  }

  @Override
  public ATACustomerService get() {
    return Preconditions.checkNotNull(
        module.provideCustomerService(credentialsProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ExternalServiceModule_ProvideCustomerServiceFactory create(
      ExternalServiceModule module, Provider<AWSCredentialsProvider> credentialsProvider) {
    return new ExternalServiceModule_ProvideCustomerServiceFactory(module, credentialsProvider);
  }

  public static ATACustomerService proxyProvideCustomerService(
      ExternalServiceModule instance, AWSCredentialsProvider credentialsProvider) {
    return Preconditions.checkNotNull(
        instance.provideCustomerService(credentialsProvider),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
