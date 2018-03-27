/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.security.increment.policy.util.AllUsersQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.collaboration.security.increment.policy.allUsers pattern,
 * to be used in conjunction with {@link AllUsersMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AllUsersMatcher
 *  @see AllUsersProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AllUsersMatch extends BasePatternMatch {
  private String fUser;
  
  private static List<String> parameterNames = makeImmutableList("user");
  
  private AllUsersMatch(final String pUser) {
    this.fUser = pUser;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("user".equals(parameterName)) return this.fUser;
    return null;
  }
  
  public String getUser() {
    return this.fUser;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("user".equals(parameterName) ) {
        this.fUser = (String) newValue;
        return true;
    }
    return false;
  }
  
  public void setUser(final String pUser) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fUser = pUser;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.collaboration.security.increment.policy.allUsers";
  }
  
  @Override
  public List<String> parameterNames() {
    return AllUsersMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fUser};
  }
  
  @Override
  public AllUsersMatch toImmutable() {
    return isMutable() ? newMatch(fUser) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"user\"=" + prettyPrintValue(fUser));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fUser);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof AllUsersMatch)) {
        AllUsersMatch other = (AllUsersMatch) obj;
        return Objects.equals(fUser, other.fUser);
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
  public AllUsersQuerySpecification specification() {
    try {
        return AllUsersQuerySpecification.instance();
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
  public static AllUsersMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AllUsersMatch newMutableMatch(final String pUser) {
    return new Mutable(pUser);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pUser the fixed value of pattern parameter user, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AllUsersMatch newMatch(final String pUser) {
    return new Immutable(pUser);
  }
  
  private static final class Mutable extends AllUsersMatch {
    Mutable(final String pUser) {
      super(pUser);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AllUsersMatch {
    Immutable(final String pUser) {
      super(pUser);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
