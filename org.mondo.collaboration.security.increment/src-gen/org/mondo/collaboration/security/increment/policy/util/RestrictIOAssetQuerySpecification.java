/**
 * Generated from platform:/resource/org.mondo.collaboration.security.increment/src/org/mondo/collaboration/security/increment/policy/policy_gen.vql
 */
package org.mondo.collaboration.security.increment.policy.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.RestrictIOAssetMatch;
import org.mondo.collaboration.security.increment.policy.RestrictIOAssetMatcher;
import org.mondo.collaboration.security.increment.policy.util.ObjectIOQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate RestrictIOAssetMatcher in a type-safe way.
 * 
 * @see RestrictIOAssetMatcher
 * @see RestrictIOAssetMatch
 * 
 */
@SuppressWarnings("all")
public final class RestrictIOAssetQuerySpecification extends BaseGeneratedEMFQuerySpecification<RestrictIOAssetMatcher> {
  private RestrictIOAssetQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static RestrictIOAssetQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RestrictIOAssetMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return RestrictIOAssetMatcher.on(engine);
  }
  
  @Override
  public RestrictIOAssetMatcher instantiate() throws ViatraQueryException {
    return RestrictIOAssetMatcher.create();
  }
  
  @Override
  public RestrictIOAssetMatch newEmptyMatch() {
    return RestrictIOAssetMatch.newEmptyMatch();
  }
  
  @Override
  public RestrictIOAssetMatch newMatch(final Object... parameters) {
    return RestrictIOAssetMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.RestrictIOAssetQuerySpecification (visibility: PUBLIC, simpleName: RestrictIOAssetQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.RestrictIOAssetQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.RestrictIOAssetQuerySpecification (visibility: PUBLIC, simpleName: RestrictIOAssetQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.RestrictIOAssetQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RestrictIOAssetQuerySpecification INSTANCE = new RestrictIOAssetQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RestrictIOAssetQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pObject = new PParameter("object", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pObject);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.restrictIOAsset";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("object");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_object = body.getOrCreateVariableByName("object");
              new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_object, parameter_pObject)
              ));
              // 	find objectIO(object)
              new PositivePatternCall(body, new FlatTuple(var_object), ObjectIOQuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
