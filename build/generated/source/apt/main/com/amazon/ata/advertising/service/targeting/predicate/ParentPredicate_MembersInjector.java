package com.amazon.ata.advertising.service.targeting.predicate;

import com.amazon.ata.advertising.service.dao.ReadableDao;
import com.amazon.ata.customerservice.CustomerProfile;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ParentPredicate_MembersInjector implements MembersInjector<ParentPredicate> {
  private final Provider<ReadableDao<String, CustomerProfile>> customerProfileDaoProvider;

  public ParentPredicate_MembersInjector(
      Provider<ReadableDao<String, CustomerProfile>> customerProfileDaoProvider) {
    this.customerProfileDaoProvider = customerProfileDaoProvider;
  }

  public static MembersInjector<ParentPredicate> create(
      Provider<ReadableDao<String, CustomerProfile>> customerProfileDaoProvider) {
    return new ParentPredicate_MembersInjector(customerProfileDaoProvider);
  }

  @Override
  public void injectMembers(ParentPredicate instance) {
    injectCustomerProfileDao(instance, customerProfileDaoProvider.get());
  }

  public static void injectCustomerProfileDao(
      ParentPredicate instance, ReadableDao<String, CustomerProfile> customerProfileDao) {
    instance.customerProfileDao = customerProfileDao;
  }
}
