/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_consequence.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.WeakConsequenceOnReferenceQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.weakConsequenceOnReference pattern,
 * to be used in conjunction with {@link WeakConsequenceOnReferenceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see WeakConsequenceOnReferenceMatcher
 *  @see WeakConsequenceOnReferenceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class WeakConsequenceOnReferenceMatch extends BasePatternMatch {
  private String fUser;
  
  private EObject fSource;
  
  private EObject fTarget;
  
  private EReference fReference;
  
  private Object fOperation;
  
  private Object fAccess;
  
  private static List<String> parameterNames = makeImmutableList("user", "source", "target", "reference", "operation", "access");
  
  private WeakConsequenceOnReferenceMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation, final Object pAccess) {
    this.fUser = pUser;
    this.fSource = pSource;
    this.fTarget = pTarget;
    this.fReference = pReference;
    this.fOperation = pOperation;
    this.fAccess = pAccess;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    if ("source".equals(parameterName)) return this.fSource;
    if ("target".equals(parameterName)) return this.fTarget;
    if ("reference".equals(parameterName)) return this.fReference;
    if ("operation".equals(parameterName)) return this.fOperation;
    if ("access".equals(parameterName)) return this.fAccess;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  public EObject getSource() {
    return this.fSource;
  }
  
  public EObject getTarget() {
    return this.fTarget;
  }
  
  public EReference getReference() {
    return this.fReference;
  }
  
  public Object getOperation() {
    return this.fOperation;
  }
  
  public Object getAccess() {
    return this.fAccess;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("user".equals(parameterName) ) {
        this.fUser = (String) newValue;
        return true;
    }
    if ("source".equals(parameterName) ) {
        this.fSource = (EObject) newValue;
        return true;
    }
    if ("target".equals(parameterName) ) {
        this.fTarget = (EObject) newValue;
        return true;
    }
    if ("reference".equals(parameterName) ) {
        this.fReference = (EReference) newValue;
        return true;
    }
    if ("operation".equals(parameterName) && newValue instanceof Object) {
        this.fOperation = (Object) newValue;
        return true;
    }
    if ("access".equals(parameterName) && newValue instanceof Object) {
        this.fAccess = (Object) newValue;
        return true;
    }
    return false;
  }
  
  public void setUser(final String pUser) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fUser = pUser;
  }
  
  public void setSource(final EObject pSource) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSource = pSource;
  }
  
  public void setTarget(final EObject pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
  }
  
  public void setReference(final EReference pReference) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fReference = pReference;
  }
  
  public void setOperation(final Object pOperation) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOperation = pOperation;
  }
  
  public void setAccess(final Object pAccess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAccess = pAccess;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.weakConsequenceOnReference";
  }
  
  @Override
  public List<String> parameterNames() {
    return WeakConsequenceOnReferenceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser, fSource, fTarget, fReference, fOperation, fAccess};
  }
  
  @Override
  public WeakConsequenceOnReferenceMatch toImmutable() {
    return isMutable() ? newMatch(fUser, fSource, fTarget, fReference, fOperation, fAccess) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser) + ", ");
    result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
    result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
    result.append("\"operation\"=" + prettyPrintValue(fOperation) + ", ");
    result.append("\"access\"=" + prettyPrintValue(fAccess));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser, fSource, fTarget, fReference, fOperation, fAccess);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof WeakConsequenceOnReferenceMatch)) {
        WeakConsequenceOnReferenceMatch other = (WeakConsequenceOnReferenceMatch) obj;
        return Objects.equals(fUser, other.fUser) && Objects.equals(fSource, other.fSource) && Objects.equals(fTarget, other.fTarget) && Objects.equals(fReference, other.fReference) && Objects.equals(fOperation, other.fOperation) && Objects.equals(fAccess, other.fAccess);
    } else {
        // this should be infrequent
        if (!(obj instanceof IPatternMatch)) {
            return false;
        }
        IPatternMatch otherSig  = (IPatternMatch) obj;
        return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
    }
  }
  
  @Override
  public WeakConsequenceOnReferenceQuerySpecification specification() {
    try {
        return WeakConsequenceOnReferenceQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
         // This cannot happen, as the match object can only be instantiated if the query specification exists
         throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static WeakConsequenceOnReferenceMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static WeakConsequenceOnReferenceMatch newMutableMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation, final Object pAccess) {
    return new Mutable(pUser, pSource, pTarget, pReference, pOperation, pAccess);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pReference the fixed value of pattern parameter reference, or null if not bound.
   * @param pOperation the fixed value of pattern parameter operation, or null if not bound.
   * @param pAccess the fixed value of pattern parameter access, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static WeakConsequenceOnReferenceMatch newMatch(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation, final Object pAccess) {
    return new Immutable(pUser, pSource, pTarget, pReference, pOperation, pAccess);
  }
  
  private static final class Mutable extends WeakConsequenceOnReferenceMatch {
    Mutable(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation, final Object pAccess) {
      super(pUser, pSource, pTarget, pReference, pOperation, pAccess);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends WeakConsequenceOnReferenceMatch {
    Immutable(final String pUser, final EObject pSource, final EObject pTarget, final EReference pReference, final Object pOperation, final Object pAccess) {
      super(pUser, pSource, pTarget, pReference, pOperation, pAccess);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}