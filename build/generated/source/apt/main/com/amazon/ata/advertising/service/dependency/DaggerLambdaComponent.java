package com.amazon.ata.advertising.service.dependency;

import com.amazon.ata.advertising.service.activity.AddTargetingGroupActivity;
import com.amazon.ata.advertising.service.activity.CreateContentActivity;
import com.amazon.ata.advertising.service.activity.DeleteContentActivity;
import com.amazon.ata.advertising.service.activity.GenerateAdActivity;
import com.amazon.ata.advertising.service.activity.UpdateClickThroughRateActivity;
import com.amazon.ata.advertising.service.activity.UpdateContentActivity;
import com.amazon.ata.advertising.service.businesslogic.AdvertisementSelectionLogic;
import com.amazon.ata.advertising.service.dao.ContentDao;
import com.amazon.ata.advertising.service.dao.ReadableDao;
import com.amazon.ata.advertising.service.dao.TargetingGroupDao;
import com.amazon.ata.advertising.service.model.AdvertisementContent;
import com.amazon.ata.advertising.service.targeting.TargetingGroup;
import com.amazon.ata.advertising.service.targeting.predicate.AgeTargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.AgeTargetingPredicate_MembersInjector;
import com.amazon.ata.advertising.service.targeting.predicate.CategorySpendFrequencyTargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.CategorySpendFrequencyTargetingPredicate_MembersInjector;
import com.amazon.ata.advertising.service.targeting.predicate.CategorySpendValueTargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.CategorySpendValueTargetingPredicate_MembersInjector;
import com.amazon.ata.advertising.service.targeting.predicate.ParentPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.ParentPredicate_MembersInjector;
import com.amazon.ata.advertising.service.targeting.predicate.PrimeBenefitTargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.PrimeBenefitTargetingPredicate_MembersInjector;
import com.amazon.ata.advertising.service.targeting.predicate.RecognizedTargetingPredicate;
import com.amazon.atacustomerservicelambda.service.ATACustomerService;
import com.amazon.ataprimeclubservicelambda.service.ATAPrimeClubService;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerLambdaComponent implements LambdaComponent {
  private DaoModule daoModule;

  private Provider<AWSCredentialsProvider> provideAWSCredentialsProvider;

  private Provider<ATACustomerService> provideCustomerServiceProvider;

  private DaoModule_ProvideCustomerProfileDaoFactory provideCustomerProfileDaoProvider;

  private Provider<MembersInjector<AgeTargetingPredicate>>
      ageTargetingPredicateMembersInjectorProvider;

  private DaoModule_ProvideCustomerSpendDaoFactory provideCustomerSpendDaoProvider;

  private Provider<MembersInjector<CategorySpendFrequencyTargetingPredicate>>
      categorySpendFrequencyTargetingPredicateMembersInjectorProvider;

  private Provider<MembersInjector<CategorySpendValueTargetingPredicate>>
      categorySpendValueTargetingPredicateMembersInjectorProvider;

  private Provider<ATAPrimeClubService> providePrimeClubServiceProvider;

  private DaoModule_ProvidePrimeDaoFactory providePrimeDaoProvider;

  private Provider<MembersInjector<PrimeBenefitTargetingPredicate>>
      primeBenefitTargetingPredicateMembersInjectorProvider;

  private Provider<MembersInjector<ParentPredicate>> parentPredicateMembersInjectorProvider;

  private Provider<MembersInjector<RecognizedTargetingPredicate>>
      recognizedTargetingPredicateMembersInjectorProvider;

  private Provider<DynamoDBMapper> provideDynamoDBMapperProvider;

  private DaggerLambdaComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static LambdaComponent create() {
    return new Builder().build();
  }

  private ContentDao getContentDao() {
    return new ContentDao(provideDynamoDBMapperProvider.get());
  }

  private ReadableDao<String, List<AdvertisementContent>>
      getReadableDaoOfStringAndListOfAdvertisementContent() {
    return DaoModule_ProvideContentDaoFactory.proxyProvideContentDao(daoModule, getContentDao());
  }

  private TargetingGroupDao getTargetingGroupDao() {
    return new TargetingGroupDao(
        getTargetingPredicateInjector(), provideDynamoDBMapperProvider.get());
  }

  private ReadableDao<String, List<TargetingGroup>>
      getReadableDaoOfStringAndListOfTargetingGroup() {
    return DaoModule_ProvideTargetingGroupDaoFactory.proxyProvideTargetingGroupDao(
        daoModule, getTargetingGroupDao());
  }

  private AdvertisementSelectionLogic getAdvertisementSelectionLogic() {
    return new AdvertisementSelectionLogic(
        getReadableDaoOfStringAndListOfAdvertisementContent(),
        getReadableDaoOfStringAndListOfTargetingGroup());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideAWSCredentialsProvider =
        DoubleCheck.provider(
            ExternalServiceModule_ProvideAWSCredentialsProviderFactory.create(
                builder.externalServiceModule));
    this.provideCustomerServiceProvider =
        DoubleCheck.provider(
            ExternalServiceModule_ProvideCustomerServiceFactory.create(
                builder.externalServiceModule, provideAWSCredentialsProvider));
    this.provideCustomerProfileDaoProvider =
        DaoModule_ProvideCustomerProfileDaoFactory.create(
            builder.daoModule, provideCustomerServiceProvider);
    this.ageTargetingPredicateMembersInjectorProvider =
        InstanceFactory.create(
            AgeTargetingPredicate_MembersInjector.create(provideCustomerProfileDaoProvider));
    this.provideCustomerSpendDaoProvider =
        DaoModule_ProvideCustomerSpendDaoFactory.create(
            builder.daoModule, provideCustomerServiceProvider);
    this.categorySpendFrequencyTargetingPredicateMembersInjectorProvider =
        InstanceFactory.create(
            CategorySpendFrequencyTargetingPredicate_MembersInjector.create(
                provideCustomerSpendDaoProvider));
    this.categorySpendValueTargetingPredicateMembersInjectorProvider =
        InstanceFactory.create(
            CategorySpendValueTargetingPredicate_MembersInjector.create(
                provideCustomerSpendDaoProvider));
    this.providePrimeClubServiceProvider =
        DoubleCheck.provider(
            ExternalServiceModule_ProvidePrimeClubServiceFactory.create(
                builder.externalServiceModule, provideAWSCredentialsProvider));
    this.providePrimeDaoProvider =
        DaoModule_ProvidePrimeDaoFactory.create(builder.daoModule, providePrimeClubServiceProvider);
    this.primeBenefitTargetingPredicateMembersInjectorProvider =
        InstanceFactory.create(
            PrimeBenefitTargetingPredicate_MembersInjector.create(providePrimeDaoProvider));
    this.parentPredicateMembersInjectorProvider =
        InstanceFactory.create(
            ParentPredicate_MembersInjector.create(provideCustomerProfileDaoProvider));
    this.recognizedTargetingPredicateMembersInjectorProvider =
        InstanceFactory.create(MembersInjectors.<RecognizedTargetingPredicate>noOp());
    this.daoModule = builder.daoModule;
    this.provideDynamoDBMapperProvider =
        DoubleCheck.provider(
            DynamoDBModule_ProvideDynamoDBMapperFactory.create(builder.dynamoDBModule));
  }

  @Override
  public TargetingPredicateInjector getTargetingPredicateInjector() {
    return new TargetingPredicateInjector(
        ageTargetingPredicateMembersInjectorProvider.get(),
        categorySpendFrequencyTargetingPredicateMembersInjectorProvider.get(),
        categorySpendValueTargetingPredicateMembersInjectorProvider.get(),
        primeBenefitTargetingPredicateMembersInjectorProvider.get(),
        parentPredicateMembersInjectorProvider.get(),
        recognizedTargetingPredicateMembersInjectorProvider.get());
  }

  @Override
  public GenerateAdActivity provideGenerateAdActivity() {
    return new GenerateAdActivity(getAdvertisementSelectionLogic());
  }

  @Override
  public AddTargetingGroupActivity provideAddTargetingGroupActivity() {
    return new AddTargetingGroupActivity(getTargetingGroupDao());
  }

  @Override
  public CreateContentActivity provideCreateContentActivity() {
    return new CreateContentActivity(getContentDao(), getTargetingGroupDao());
  }

  @Override
  public DeleteContentActivity provideDeleteContentActivity() {
    return new DeleteContentActivity(getContentDao(), getTargetingGroupDao());
  }

  @Override
  public UpdateClickThroughRateActivity provideUpdateClickThroughRateActivity() {
    return new UpdateClickThroughRateActivity(getTargetingGroupDao());
  }

  @Override
  public UpdateContentActivity provideUpdateContentActivity() {
    return new UpdateContentActivity(getContentDao(), getTargetingGroupDao());
  }

  public static final class Builder {
    private ExternalServiceModule externalServiceModule;

    private DaoModule daoModule;

    private DynamoDBModule dynamoDBModule;

    private Builder() {}

    public LambdaComponent build() {
      if (externalServiceModule == null) {
        this.externalServiceModule = new ExternalServiceModule();
      }
      if (daoModule == null) {
        this.daoModule = new DaoModule();
      }
      if (dynamoDBModule == null) {
        this.dynamoDBModule = new DynamoDBModule();
      }
      return new DaggerLambdaComponent(this);
    }

    public Builder externalServiceModule(ExternalServiceModule externalServiceModule) {
      this.externalServiceModule = Preconditions.checkNotNull(externalServiceModule);
      return this;
    }

    public Builder daoModule(DaoModule daoModule) {
      this.daoModule = Preconditions.checkNotNull(daoModule);
      return this;
    }

    public Builder dynamoDBModule(DynamoDBModule dynamoDBModule) {
      this.dynamoDBModule = Preconditions.checkNotNull(dynamoDBModule);
      return this;
    }
  }
}
