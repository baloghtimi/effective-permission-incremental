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
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementMatch;
import org.mondo.collaboration.security.increment.policy.EffectiveJudgementMatcher;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgement_at_0QuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EffectiveJudgement_at_1QuerySpecification;

/**
 * A pattern-specific query specification that can instantiate EffectiveJudgementMatcher in a type-safe way.
 * 
 * @see EffectiveJudgementMatcher
 * @see EffectiveJudgementMatch
 * 
 */
@SuppressWarnings("all")
public final class EffectiveJudgementQuerySpecification extends BaseGeneratedEMFQuerySpecification<EffectiveJudgementMatcher> {
  private EffectiveJudgementQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static EffectiveJudgementQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EffectiveJudgementMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EffectiveJudgementMatcher.on(engine);
  }
  
  @Override
  public EffectiveJudgementMatcher instantiate() throws ViatraQueryException {
    return EffectiveJudgementMatcher.create();
  }
  
  @Override
  public EffectiveJudgementMatch newEmptyMatch() {
    return EffectiveJudgementMatch.newEmptyMatch();
  }
  
  @Override
  public EffectiveJudgementMatch newMatch(final Object... parameters) {
    return EffectiveJudgementMatch.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (java.lang.Object) parameters[2], (java.lang.Object) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementQuerySpecification (visibility: PUBLIC, simpleName: EffectiveJudgementQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementQuerySpecification (visibility: PUBLIC, simpleName: EffectiveJudgementQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.EffectiveJudgementQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EffectiveJudgementQuerySpecification INSTANCE = new EffectiveJudgementQuerySpecification();
    
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
    private final static EffectiveJudgementQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAsset = new PParameter("asset", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "java.lang.Object", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pAccess = new PParameter("access", "java.lang.Object", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pAsset, parameter_pOperation, parameter_pAccess);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.effectiveJudgement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user","asset","operation","access");
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
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_asset = body.getOrCreateVariableByName("asset");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_asset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_asset, parameter_pAsset),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              // 	find effectiveJudgement_at_0(user, asset, operation, access)
              new PositivePatternCall(body, new FlatTuple(var_user, var_asset, var_operation, var_access), EffectiveJudgement_at_0QuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_asset = body.getOrCreateVariableByName("asset");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_asset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_asset, parameter_pAsset),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess)
              ));
              // 	find effectiveJudgement_at_1(user, asset, operation, access)
              new PositivePatternCall(body, new FlatTuple(var_user, var_asset, var_operation, var_access), EffectiveJudgement_at_1QuerySpecification.instance().getInternalQueryRepresentation());
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
