package com.amazon.ata.advertising.service.dependency;

import com.amazon.ata.advertising.service.targeting.predicate.AgeTargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.CategorySpendFrequencyTargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.CategorySpendValueTargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.ParentPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.PrimeBenefitTargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.RecognizedTargetingPredicate;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TargetingPredicateInjector_Factory
    implements Factory<TargetingPredicateInjector> {
  private final Provider<MembersInjector<AgeTargetingPredicate>> agePredicateInjectorProvider;

  private final Provider<MembersInjector<CategorySpendFrequencyTargetingPredicate>>
      spendFrequencyPredicateInjectorProvider;

  private final Provider<MembersInjector<CategorySpendValueTargetingPredicate>>
      spendValuePredicateInjectorProvider;

  private final Provider<MembersInjector<PrimeBenefitTargetingPredicate>>
      primePredicateInjectorProvider;

  private final Provider<MembersInjector<ParentPredicate>> parentPredicateInjectorProvider;

  private final Provider<MembersInjector<RecognizedTargetingPredicate>>
      recognizedPredicateInjectorProvider;

  public TargetingPredicateInjector_Factory(
      Provider<MembersInjector<AgeTargetingPredicate>> agePredicateInjectorProvider,
      Provider<MembersInjector<CategorySpendFrequencyTargetingPredicate>>
          spendFrequencyPredicateInjectorProvider,
      Provider<MembersInjector<CategorySpendValueTargetingPredicate>>
          spendValuePredicateInjectorProvider,
      Provider<MembersInjector<PrimeBenefitTargetingPredicate>> primePredicateInjectorProvider,
      Provider<MembersInjector<ParentPredicate>> parentPredicateInjectorProvider,
      Provider<MembersInjector<RecognizedTargetingPredicate>> recognizedPredicateInjectorProvider) {
    this.agePredicateInjectorProvider = agePredicateInjectorProvider;
    this.spendFrequencyPredicateInjectorProvider = spendFrequencyPredicateInjectorProvider;
    this.spendValuePredicateInjectorProvider = spendValuePredicateInjectorProvider;
    this.primePredicateInjectorProvider = primePredicateInjectorProvider;
    this.parentPredicateInjectorProvider = parentPredicateInjectorProvider;
    this.recognizedPredicateInjectorProvider = recognizedPredicateInjectorProvider;
  }

  @Override
  public TargetingPredicateInjector get() {
    return new TargetingPredicateInjector(
        agePredicateInjectorProvider.get(),
        spendFrequencyPredicateInjectorProvider.get(),
        spendValuePredicateInjectorProvider.get(),
        primePredicateInjectorProvider.get(),
        parentPredicateInjectorProvider.get(),
        recognizedPredicateInjectorProvider.get());
  }

  public static TargetingPredicateInjector_Factory create(
      Provider<MembersInjector<AgeTargetingPredicate>> agePredicateInjectorProvider,
      Provider<MembersInjector<CategorySpendFrequencyTargetingPredicate>>
          spendFrequencyPredicateInjectorProvider,
      Provider<MembersInjector<CategorySpendValueTargetingPredicate>>
          spendValuePredicateInjectorProvider,
      Provider<MembersInjector<PrimeBenefitTargetingPredicate>> primePredicateInjectorProvider,
      Provider<MembersInjector<ParentPredicate>> parentPredicateInjectorProvider,
      Provider<MembersInjector<RecognizedTargetingPredicate>> recognizedPredicateInjectorProvider) {
    return new TargetingPredicateInjector_Factory(
        agePredicateInjectorProvider,
        spendFrequencyPredicateInjectorProvider,
        spendValuePredicateInjectorProvider,
        primePredicateInjectorProvider,
        parentPredicateInjectorProvider,
        recognizedPredicateInjectorProvider);
  }
}
