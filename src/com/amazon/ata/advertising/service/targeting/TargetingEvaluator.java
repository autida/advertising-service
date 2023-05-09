package com.amazon.ata.advertising.service.targeting;

import com.amazon.ata.advertising.service.model.AdvertisementContent;
import com.amazon.ata.advertising.service.model.EmptyGeneratedAdvertisement;
import com.amazon.ata.advertising.service.model.GeneratedAdvertisement;
import com.amazon.ata.advertising.service.model.RequestContext;
import com.amazon.ata.advertising.service.targeting.predicate.TargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.TargetingPredicateResult;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * Evaluates TargetingPredicates for a given RequestContext.
 */
public class TargetingEvaluator implements Callable<GeneratedAdvertisement> {
    public static final boolean IMPLEMENTED_STREAMS = true;
    public static final boolean IMPLEMENTED_CONCURRENCY = true;
    private final RequestContext requestContext;
    private TargetingGroup targetingGroup;
    private AdvertisementContent content;

    /**
     * Creates an evaluator for targeting predicates.
     * @param requestContext Context that can be used to evaluate the predicates.
     */
    public TargetingEvaluator(RequestContext requestContext, TargetingGroup targetingGroup, AdvertisementContent content) {
        this.requestContext = requestContext;
        this.targetingGroup = targetingGroup;
        this.content = content;
    }

    /**
     * Evaluate a TargetingGroup to determine if all of its TargetingPredicates are TRUE or not for the given
     * RequestContext.
     * @param targetingGroup Targeting group for an advertisement, including TargetingPredicates.
     * @return TRUE if all of the TargetingPredicates evaluate to TRUE against the RequestContext, FALSE otherwise.
     */
    public TargetingPredicateResult evaluate(TargetingGroup targetingGroup) {
        return targetingGroup.getTargetingPredicates()
                .stream()
                .map(targetingPredicate -> targetingPredicate.evaluate(requestContext))
                .allMatch(TargetingPredicateResult::isTrue) ? TargetingPredicateResult.TRUE:
                TargetingPredicateResult.FALSE;
    }

    @Override
    public GeneratedAdvertisement call() throws Exception {
        return evaluate(targetingGroup).isTrue() ? new GeneratedAdvertisement(content) : null;
    }
}
