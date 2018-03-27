/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgement_at_0Match;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgement_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;
import org.mondo.collaboration.security.increment.vocabulary.OperationType;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.effectiveJudgement_at_0 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EffectiveJudgement_at_0Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern effectiveJudgement_at_0(user: java String, asset: EObject, operation, access) 
 * {
 * 	find judgement_at_0(user, asset, operation, access);
 * 	neg find domination_of_0(user, asset, operation, access, _prevailingAccess);
 * }
 * </pre></code>
 * 
 * @see EffectiveJudgement_at_0Match
 *  @see EffectiveJudgement_at_0Processor
 * @see EffectiveJudgement_at_0QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EffectiveJudgement_at_0Matcher extends BaseMatcher<EffectiveJudgement_at_0Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EffectiveJudgement_at_0Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    EffectiveJudgement_at_0Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (EffectiveJudgement_at_0Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static EffectiveJudgement_at_0Matcher create() throws ViatraQueryException {
    return new EffectiveJudgement_at_0Matcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_ASSET = 1;
  
  private final static int POSITION_OPERATION = 2;
  
  private final static int POSITION_ACCESS = 3;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EffectiveJudgement_at_0Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private EffectiveJudgement_at_0Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return matches represented as a EffectiveJudgement_at_0Match object.
   * 
   */
  public Collection<EffectiveJudgement_at_0Match> getAllMatches(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
    return rawGetAllMatches(new Object[]{pUser, pAsset, pOperation, pAccess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return a match represented as a EffectiveJudgement_at_0Match object, or null if no match is found.
   * 
   */
  public EffectiveJudgement_at_0Match getOneArbitraryMatch(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pAsset, pOperation, pAccess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
    return rawHasMatch(new Object[]{pUser, pAsset, pOperation, pAccess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
    return rawCountMatches(new Object[]{pUser, pAsset, pOperation, pAccess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess, final IMatchProcessor<? super EffectiveJudgement_at_0Match> processor) {
    rawForEachMatch(new Object[]{pUser, pAsset, pOperation, pAccess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess, final IMatchProcessor<? super EffectiveJudgement_at_0Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pAsset, pOperation, pAccess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EffectiveJudgement_at_0Match newMatch(final String pUser, final EObject pAsset, final Object pOperation, final Object pAccess) {
    return EffectiveJudgement_at_0Match.newMatch(pUser, pAsset, pOperation, pAccess);
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfuser(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_USER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser() {
    return rawAccumulateAllValuesOfuser(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EffectiveJudgement_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pAsset, final Object pOperation, final Object pAccess) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pAsset, 
    pOperation, 
    pAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for asset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfasset(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_ASSET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for asset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfasset() {
    return rawAccumulateAllValuesOfasset(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for asset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfasset(final EffectiveJudgement_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfasset(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for asset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfasset(final String pUser, final Object pOperation, final Object pAccess) {
    return rawAccumulateAllValuesOfasset(new Object[]{
    pUser, 
    null, 
    pOperation, 
    pAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfoperation(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_OPERATION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfoperation() {
    return rawAccumulateAllValuesOfoperation(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfoperation(final EffectiveJudgement_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfoperation(final String pUser, final EObject pAsset, final Object pAccess) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pAsset, 
    null, 
    pAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfaccess(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_ACCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfaccess() {
    return rawAccumulateAllValuesOfaccess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfaccess(final EffectiveJudgement_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfaccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for access.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfaccess(final String pUser, final EObject pAsset, final Object pOperation) {
    return rawAccumulateAllValuesOfaccess(new Object[]{
    pUser, 
    pAsset, 
    pOperation, 
    null
    });
  }
  
  @Override
  protected EffectiveJudgement_at_0Match tupleToMatch(final Tuple t) {
    try {
        return EffectiveJudgement_at_0Match.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_ASSET), (OperationType) t.get(POSITION_OPERATION), (AccessibilityLevel) t.get(POSITION_ACCESS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected EffectiveJudgement_at_0Match arrayToMatch(final Object[] match) {
    try {
        return EffectiveJudgement_at_0Match.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_ASSET], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected EffectiveJudgement_at_0Match arrayToMatchMutable(final Object[] match) {
    try {
        return EffectiveJudgement_at_0Match.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_ASSET], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_ACCESS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<EffectiveJudgement_at_0Matcher> querySpecification() throws ViatraQueryException {
    return EffectiveJudgement_at_0QuerySpecification.instance();
  }
}
