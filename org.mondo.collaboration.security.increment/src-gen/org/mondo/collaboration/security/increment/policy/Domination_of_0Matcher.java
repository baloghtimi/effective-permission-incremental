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
import org.mondo.collaboration.security.increment.policy.Domination_of_0Match;
import org.mondo.collaboration.security.increment.policy.util.Domination_of_0QuerySpecification;
import org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.domination_of_0 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Domination_of_0Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern domination_of_0(user: java String, asset: EObject, operation, dominatedAccess, prevailingAccess) 
 * {
 * 	find domination_by_1(user, asset, operation, dominatedAccess, prevailingAccess);
 * }
 * </pre></code>
 * 
 * @see Domination_of_0Match
 *  @see Domination_of_0Processor
 * @see Domination_of_0QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Domination_of_0Matcher extends BaseMatcher<Domination_of_0Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Domination_of_0Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    Domination_of_0Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (Domination_of_0Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static Domination_of_0Matcher create() throws ViatraQueryException {
    return new Domination_of_0Matcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_ASSET = 1;
  
  private final static int POSITION_OPERATION = 2;
  
  private final static int POSITION_DOMINATEDACCESS = 3;
  
  private final static int POSITION_PREVAILINGACCESS = 4;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Domination_of_0Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private Domination_of_0Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return matches represented as a Domination_of_0Match object.
   * 
   */
  public Collection<Domination_of_0Match> getAllMatches(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawGetAllMatches(new Object[]{pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return a match represented as a Domination_of_0Match object, or null if no match is found.
   * 
   */
  public Domination_of_0Match getOneArbitraryMatch(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawHasMatch(new Object[]{pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawCountMatches(new Object[]{pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess, final IMatchProcessor<? super Domination_of_0Match> processor) {
    rawForEachMatch(new Object[]{pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess, final IMatchProcessor<? super Domination_of_0Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pAsset the fixed value of pattern parameter asset, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param pPrevailingAccess the fixed value of pattern parameter prevailingAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Domination_of_0Match newMatch(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return Domination_of_0Match.newMatch(pUser, pAsset, pOperation, pDominatedAccess, pPrevailingAccess);
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
  public Set<String> getAllValuesOfuser(final Domination_of_0Match partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pAsset, 
    pOperation, 
    pDominatedAccess, 
    pPrevailingAccess
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
  public Set<EObject> getAllValuesOfasset(final Domination_of_0Match partialMatch) {
    return rawAccumulateAllValuesOfasset(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for asset.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfasset(final String pUser, final Object pOperation, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOfasset(new Object[]{
    pUser, 
    null, 
    pOperation, 
    pDominatedAccess, 
    pPrevailingAccess
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
  public Set<Object> getAllValuesOfoperation(final Domination_of_0Match partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfoperation(final String pUser, final EObject pAsset, final AccessibilityLevel pDominatedAccess, final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pAsset, 
    null, 
    pDominatedAccess, 
    pPrevailingAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for dominatedAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AccessibilityLevel> rawAccumulateAllValuesOfdominatedAccess(final Object[] parameters) {
    Set<AccessibilityLevel> results = new HashSet<AccessibilityLevel>();
    rawAccumulateAllValues(POSITION_DOMINATEDACCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for dominatedAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdominatedAccess() {
    return rawAccumulateAllValuesOfdominatedAccess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dominatedAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdominatedAccess(final Domination_of_0Match partialMatch) {
    return rawAccumulateAllValuesOfdominatedAccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dominatedAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdominatedAccess(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pPrevailingAccess) {
    return rawAccumulateAllValuesOfdominatedAccess(new Object[]{
    pUser, 
    pAsset, 
    pOperation, 
    null, 
    pPrevailingAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AccessibilityLevel> rawAccumulateAllValuesOfprevailingAccess(final Object[] parameters) {
    Set<AccessibilityLevel> results = new HashSet<AccessibilityLevel>();
    rawAccumulateAllValues(POSITION_PREVAILINGACCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfprevailingAccess() {
    return rawAccumulateAllValuesOfprevailingAccess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfprevailingAccess(final Domination_of_0Match partialMatch) {
    return rawAccumulateAllValuesOfprevailingAccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for prevailingAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfprevailingAccess(final String pUser, final EObject pAsset, final Object pOperation, final AccessibilityLevel pDominatedAccess) {
    return rawAccumulateAllValuesOfprevailingAccess(new Object[]{
    pUser, 
    pAsset, 
    pOperation, 
    pDominatedAccess, 
    null
    });
  }
  
  @Override
  protected Domination_of_0Match tupleToMatch(final Tuple t) {
    try {
        return Domination_of_0Match.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_ASSET), (Object) t.get(POSITION_OPERATION), (AccessibilityLevel) t.get(POSITION_DOMINATEDACCESS), (AccessibilityLevel) t.get(POSITION_PREVAILINGACCESS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Domination_of_0Match arrayToMatch(final Object[] match) {
    try {
        return Domination_of_0Match.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_ASSET], (Object) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_DOMINATEDACCESS], (AccessibilityLevel) match[POSITION_PREVAILINGACCESS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Domination_of_0Match arrayToMatchMutable(final Object[] match) {
    try {
        return Domination_of_0Match.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_ASSET], (Object) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_DOMINATEDACCESS], (AccessibilityLevel) match[POSITION_PREVAILINGACCESS]);
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
  public static IQuerySpecification<Domination_of_0Matcher> querySpecification() throws ViatraQueryException {
    return Domination_of_0QuerySpecification.instance();
  }
}
