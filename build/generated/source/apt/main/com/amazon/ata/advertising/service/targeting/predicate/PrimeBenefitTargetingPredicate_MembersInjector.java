package com.amazon.ata.advertising.service.targeting.predicate;

import com.amazon.ata.advertising.service.dao.ReadableDao;
import com.amazon.ata.advertising.service.model.RequestContext;
import dagger.MembersInjector;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimeBenefitTargetingPredicate_MembersInjector
    implements MembersInjector<PrimeBenefitTargetingPredicate> {
  private final Provider<ReadableDao<RequestContext, List<String>>> primeDaoProvider;

  public PrimeBenefitTargetingPredicate_MembersInjector(
      Provider<ReadableDao<RequestContext, List<String>>> primeDaoProvider) {
    this.primeDaoProvider = primeDaoProvider;
  }

  public static MembersInjector<PrimeBenefitTargetingPredicate> create(
      Provider<ReadableDao<RequestContext, List<String>>> primeDaoProvider) {
    return new PrimeBenefitTargetingPredicate_MembersInjector(primeDaoProvider);
  }

  @Override
  public void injectMembers(PrimeBenefitTargetingPredicate instance) {
    injectPrimeDao(instance, primeDaoProvider.get());
  }

  public static void injectPrimeDao(
      PrimeBenefitTargetingPredicate instance, ReadableDao<RequestContext, List<String>> primeDao) {
    instance.primeDao = primeDao;
  }
}
