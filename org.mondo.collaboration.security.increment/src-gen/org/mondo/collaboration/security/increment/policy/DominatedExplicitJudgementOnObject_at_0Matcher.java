/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_domination_same_priority.vql
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
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.security.increment.policy.DominatedExplicitJudgementOnObject_at_0Match;
import org.mondo.collaboration.security.increment.policy.util.DominatedExplicitJudgementOnObject_at_0QuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.collaboration.security.increment.policy.dominatedExplicitJudgementOnObject_at_0 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DominatedExplicitJudgementOnObject_at_0Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern dominatedExplicitJudgementOnObject_at_0(user: java String, object: EObject, operation, dominatedAccess) 
 * {
 *     find explicitJudgementOnObject(user, object, operation, dominatedAccess, 0);
 *     find explicitJudgementOnObject(user, object, operation, prevailingAccess, 0);
 *     find resolution(dominatedAccess, prevailingAccess);
 * }
 * </pre></code>
 * 
 * @see DominatedExplicitJudgementOnObject_at_0Match
 *  @see DominatedExplicitJudgementOnObject_at_0Processor
 * @see DominatedExplicitJudgementOnObject_at_0QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DominatedExplicitJudgementOnObject_at_0Matcher extends BaseMatcher<DominatedExplicitJudgementOnObject_at_0Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DominatedExplicitJudgementOnObject_at_0Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    DominatedExplicitJudgementOnObject_at_0Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (DominatedExplicitJudgementOnObject_at_0Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static DominatedExplicitJudgementOnObject_at_0Matcher create() throws ViatraQueryException {
    return new DominatedExplicitJudgementOnObject_at_0Matcher();
  }
  
  private final static int POSITION_USER = 0;
  
  private final static int POSITION_OBJECT = 1;
  
  private final static int POSITION_OPERATION = 2;
  
  private final static int POSITION_DOMINATEDACCESS = 3;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DominatedExplicitJudgementOnObject_at_0Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private DominatedExplicitJudgementOnObject_at_0Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @return matches represented as a DominatedExplicitJudgementOnObject_at_0Match object.
   * 
   */
  public Collection<DominatedExplicitJudgementOnObject_at_0Match> getAllMatches(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    return rawGetAllMatches(new Object[]{pUser, pObject, pOperation, pDominatedAccess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @return a match represented as a DominatedExplicitJudgementOnObject_at_0Match object, or null if no match is found.
   * 
   */
  public DominatedExplicitJudgementOnObject_at_0Match getOneArbitraryMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    return rawGetOneArbitraryMatch(new Object[]{pUser, pObject, pOperation, pDominatedAccess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    return rawHasMatch(new Object[]{pUser, pObject, pOperation, pDominatedAccess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    return rawCountMatches(new Object[]{pUser, pObject, pOperation, pDominatedAccess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess, final IMatchProcessor<? super DominatedExplicitJudgementOnObject_at_0Match> processor) {
    rawForEachMatch(new Object[]{pUser, pObject, pOperation, pDominatedAccess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess, final IMatchProcessor<? super DominatedExplicitJudgementOnObject_at_0Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pUser, pObject, pOperation, pDominatedAccess}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pDominatedAccess the fixed value of pattern parameter dominatedAccess, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DominatedExplicitJudgementOnObject_at_0Match newMatch(final String pUser, final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    return DominatedExplicitJudgementOnObject_at_0Match.newMatch(pUser, pObject, pOperation, pDominatedAccess);
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
  public Set<String> getAllValuesOfuser(final DominatedExplicitJudgementOnObject_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfuser(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for user.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfuser(final EObject pObject, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    return rawAccumulateAllValuesOfuser(new Object[]{
    null, 
    pObject, 
    pOperation, 
    pDominatedAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfobject(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_OBJECT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject() {
    return rawAccumulateAllValuesOfobject(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject(final DominatedExplicitJudgementOnObject_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfobject(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject(final String pUser, final OperationType pOperation, final AccessibilityLevel pDominatedAccess) {
    return rawAccumulateAllValuesOfobject(new Object[]{
    pUser, 
    null, 
    pOperation, 
    pDominatedAccess
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<OperationType> rawAccumulateAllValuesOfoperation(final Object[] parameters) {
    Set<OperationType> results = new HashSet<OperationType>();
    rawAccumulateAllValues(POSITION_OPERATION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation() {
    return rawAccumulateAllValuesOfoperation(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation(final DominatedExplicitJudgementOnObject_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfoperation(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for operation.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationType> getAllValuesOfoperation(final String pUser, final EObject pObject, final AccessibilityLevel pDominatedAccess) {
    return rawAccumulateAllValuesOfoperation(new Object[]{
    pUser, 
    pObject, 
    null, 
    pDominatedAccess
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
  public Set<AccessibilityLevel> getAllValuesOfdominatedAccess(final DominatedExplicitJudgementOnObject_at_0Match partialMatch) {
    return rawAccumulateAllValuesOfdominatedAccess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dominatedAccess.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AccessibilityLevel> getAllValuesOfdominatedAccess(final String pUser, final EObject pObject, final OperationType pOperation) {
    return rawAccumulateAllValuesOfdominatedAccess(new Object[]{
    pUser, 
    pObject, 
    pOperation, 
    null
    });
  }
  
  @Override
  protected DominatedExplicitJudgementOnObject_at_0Match tupleToMatch(final Tuple t) {
    try {
        return DominatedExplicitJudgementOnObject_at_0Match.newMatch((String) t.get(POSITION_USER), (EObject) t.get(POSITION_OBJECT), (OperationType) t.get(POSITION_OPERATION), (AccessibilityLevel) t.get(POSITION_DOMINATEDACCESS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected DominatedExplicitJudgementOnObject_at_0Match arrayToMatch(final Object[] match) {
    try {
        return DominatedExplicitJudgementOnObject_at_0Match.newMatch((String) match[POSITION_USER], (EObject) match[POSITION_OBJECT], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_DOMINATEDACCESS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected DominatedExplicitJudgementOnObject_at_0Match arrayToMatchMutable(final Object[] match) {
    try {
        return DominatedExplicitJudgementOnObject_at_0Match.newMutableMatch((String) match[POSITION_USER], (EObject) match[POSITION_OBJECT], (OperationType) match[POSITION_OPERATION], (AccessibilityLevel) match[POSITION_DOMINATEDACCESS]);
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
  public static IQuerySpecification<DominatedExplicitJudgementOnObject_at_0Matcher> querySpecification() throws ViatraQueryException {
    return DominatedExplicitJudgementOnObject_at_0QuerySpecification.instance();
  }
}