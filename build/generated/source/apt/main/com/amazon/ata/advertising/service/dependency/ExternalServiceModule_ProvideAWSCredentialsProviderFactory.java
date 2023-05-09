package com.amazon.ata.advertising.service.dependency;

import com.amazonaws.auth.AWSCredentialsProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExternalServiceModule_ProvideAWSCredentialsProviderFactory
    implements Factory<AWSCredentialsProvider> {
  private final ExternalServiceModule module;

  public ExternalServiceModule_ProvideAWSCredentialsProviderFactory(ExternalServiceModule module) {
    this.module = module;
  }

  @Override
  public AWSCredentialsProvider get() {
    return Preconditions.checkNotNull(
        module.provideAWSCredentialsProvider(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ExternalServiceModule_ProvideAWSCredentialsProviderFactory create(
      ExternalServiceModule module) {
    return new ExternalServiceModule_ProvideAWSCredentialsProviderFactory(module);
  }

  public static AWSCredentialsProvider proxyProvideAWSCredentialsProvider(
      ExternalServiceModule instance) {
    return Preconditions.checkNotNull(
        instance.provideAWSCredentialsProvider(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
