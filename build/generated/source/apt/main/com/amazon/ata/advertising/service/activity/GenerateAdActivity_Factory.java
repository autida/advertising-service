package com.amazon.ata.advertising.service.activity;

import com.amazon.ata.advertising.service.businesslogic.AdvertisementSelectionLogic;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GenerateAdActivity_Factory implements Factory<GenerateAdActivity> {
  private final Provider<AdvertisementSelectionLogic> advertisementSelectorProvider;

  public GenerateAdActivity_Factory(
      Provider<AdvertisementSelectionLogic> advertisementSelectorProvider) {
    this.advertisementSelectorProvider = advertisementSelectorProvider;
  }

  @Override
  public GenerateAdActivity get() {
    return new GenerateAdActivity(advertisementSelectorProvider.get());
  }

  public static GenerateAdActivity_Factory create(
      Provider<AdvertisementSelectionLogic> advertisementSelectorProvider) {
    return new GenerateAdActivity_Factory(advertisementSelectorProvider);
  }
}
