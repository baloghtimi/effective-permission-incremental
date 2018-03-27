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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementMatch;
import org.mondo.collaboration.security.increment.policy.ExplicitJudgementMatcher;
import org.mondo.collaboration.security.increment.policy.util.AllUsersQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableIOAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableIOUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableRootAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.EnableRootUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ObjectAllObjectsQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.ReadWriteOperationQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictIOAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictIOUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictNotIOAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictNotIOUserQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictRootAssetQuerySpecification;
import org.mondo.collaboration.security.increment.policy.util.RestrictRootUserQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate ExplicitJudgementMatcher in a type-safe way.
 * 
 * @see ExplicitJudgementMatcher
 * @see ExplicitJudgementMatch
 * 
 */
@SuppressWarnings("all")
public final class ExplicitJudgementQuerySpecification extends BaseGeneratedEMFQuerySpecification<ExplicitJudgementMatcher> {
  private ExplicitJudgementQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ExplicitJudgementQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ExplicitJudgementMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ExplicitJudgementMatcher.on(engine);
  }
  
  @Override
  public ExplicitJudgementMatcher instantiate() throws ViatraQueryException {
    return ExplicitJudgementMatcher.create();
  }
  
  @Override
  public ExplicitJudgementMatch newEmptyMatch() {
    return ExplicitJudgementMatch.newEmptyMatch();
  }
  
  @Override
  public ExplicitJudgementMatch newMatch(final Object... parameters) {
    return ExplicitJudgementMatch.newMatch((java.lang.String) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1], (org.mondo.collaboration.security.increment.vocabulary.OperationType) parameters[2], (org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel) parameters[3], (java.lang.Integer) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementQuerySpecification (visibility: PUBLIC, simpleName: ExplicitJudgementQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementQuerySpecification (visibility: PUBLIC, simpleName: ExplicitJudgementQuerySpecification, identifier: org.mondo.collaboration.security.increment.policy.util.ExplicitJudgementQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: org.mondo.collaboration.security.increment.policy.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ExplicitJudgementQuerySpecification INSTANCE = new ExplicitJudgementQuerySpecification();
    
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
    private final static ExplicitJudgementQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pUser = new PParameter("user", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAsset = new PParameter("asset", "org.eclipse.emf.ecore.EObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOperation = new PParameter("operation", "org.mondo.collaboration.security.increment.vocabulary.OperationType", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pAccess = new PParameter("access", "org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel", (IInputKey)null, PParameterDirection.INOUT);
    
    private final PParameter parameter_pPriority = new PParameter("priority", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pUser, parameter_pAsset, parameter_pOperation, parameter_pAccess, parameter_pPriority);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.collaboration.security.increment.policy.explicitJudgement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("user","asset","operation","access","priority");
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
              PVariable var_priority = body.getOrCreateVariableByName("priority");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_asset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeFilterConstraint(body, new FlatTuple(var_priority), new JavaTransitiveInstancesKey(java.lang.Integer.class));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_asset, parameter_pAsset),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess),
                 new ExportedParameter(body, var_priority, parameter_pPriority)
              ));
              // 	//  rule restrictRoot    find restrictRootAsset(asset)
              new PositivePatternCall(body, new FlatTuple(var_asset), RestrictRootAssetQuerySpecification.instance().getInternalQueryRepresentation());
              //     find restrictRootUser(user)
              new PositivePatternCall(body, new FlatTuple(var_user), RestrictRootUserQuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::WRITE
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("WRITE"));
              new Equality(body, var_operation, var__virtual_0_);
              //     access == AccessibilityLevel::DENY
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("DENY"));
              new Equality(body, var_access, var__virtual_1_);
              //     priority == 1
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, 1);
              new Equality(body, var_priority, var__virtual_2_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_asset = body.getOrCreateVariableByName("asset");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_priority = body.getOrCreateVariableByName("priority");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_asset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeFilterConstraint(body, new FlatTuple(var_priority), new JavaTransitiveInstancesKey(java.lang.Integer.class));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_asset, parameter_pAsset),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess),
                 new ExportedParameter(body, var_priority, parameter_pPriority)
              ));
              // //  rule enableRoot    find enableRootAsset(asset)
              new PositivePatternCall(body, new FlatTuple(var_asset), EnableRootAssetQuerySpecification.instance().getInternalQueryRepresentation());
              //     find enableRootUser(user)
              new PositivePatternCall(body, new FlatTuple(var_user), EnableRootUserQuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::READ
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("READ"));
              new Equality(body, var_operation, var__virtual_0_);
              //     access == AccessibilityLevel::ALLOW
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("ALLOW"));
              new Equality(body, var_access, var__virtual_1_);
              //     priority == 1
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, 1);
              new Equality(body, var_priority, var__virtual_2_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_asset = body.getOrCreateVariableByName("asset");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_priority = body.getOrCreateVariableByName("priority");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_asset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeFilterConstraint(body, new FlatTuple(var_priority), new JavaTransitiveInstancesKey(java.lang.Integer.class));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_asset, parameter_pAsset),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess),
                 new ExportedParameter(body, var_priority, parameter_pPriority)
              ));
              // //  rule enableIO    find enableIOAsset(asset)
              new PositivePatternCall(body, new FlatTuple(var_asset), EnableIOAssetQuerySpecification.instance().getInternalQueryRepresentation());
              //     find enableIOUser(user)
              new PositivePatternCall(body, new FlatTuple(var_user), EnableIOUserQuerySpecification.instance().getInternalQueryRepresentation());
              //     find readWriteOperation(operation)
              new PositivePatternCall(body, new FlatTuple(var_operation), ReadWriteOperationQuerySpecification.instance().getInternalQueryRepresentation());
              //     access == AccessibilityLevel::ALLOW
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("ALLOW"));
              new Equality(body, var_access, var__virtual_0_);
              //     priority == 1
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, 1);
              new Equality(body, var_priority, var__virtual_1_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_asset = body.getOrCreateVariableByName("asset");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_priority = body.getOrCreateVariableByName("priority");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_asset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeFilterConstraint(body, new FlatTuple(var_priority), new JavaTransitiveInstancesKey(java.lang.Integer.class));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_asset, parameter_pAsset),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess),
                 new ExportedParameter(body, var_priority, parameter_pPriority)
              ));
              // //  rule restrictNotIO    find restrictNotIOAsset(asset)
              new PositivePatternCall(body, new FlatTuple(var_asset), RestrictNotIOAssetQuerySpecification.instance().getInternalQueryRepresentation());
              //     find restrictNotIOUser(user)
              new PositivePatternCall(body, new FlatTuple(var_user), RestrictNotIOUserQuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::READ
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("READ"));
              new Equality(body, var_operation, var__virtual_0_);
              //     access == AccessibilityLevel::DENY
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("DENY"));
              new Equality(body, var_access, var__virtual_1_);
              //     priority == 1
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, 1);
              new Equality(body, var_priority, var__virtual_2_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_asset = body.getOrCreateVariableByName("asset");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_priority = body.getOrCreateVariableByName("priority");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_asset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeFilterConstraint(body, new FlatTuple(var_priority), new JavaTransitiveInstancesKey(java.lang.Integer.class));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_asset, parameter_pAsset),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess),
                 new ExportedParameter(body, var_priority, parameter_pPriority)
              ));
              // //  rule restrictIO    find restrictIOAsset(asset)
              new PositivePatternCall(body, new FlatTuple(var_asset), RestrictIOAssetQuerySpecification.instance().getInternalQueryRepresentation());
              //     find restrictIOUser(user)
              new PositivePatternCall(body, new FlatTuple(var_user), RestrictIOUserQuerySpecification.instance().getInternalQueryRepresentation());
              //     operation == OperationType::WRITE
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.OperationType.get("WRITE"));
              new Equality(body, var_operation, var__virtual_0_);
              //     access == AccessibilityLevel::DENY
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("DENY"));
              new Equality(body, var_access, var__virtual_1_);
              //     priority == 1
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new ConstantValue(body, var__virtual_2_, 1);
              new Equality(body, var_priority, var__virtual_2_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_user = body.getOrCreateVariableByName("user");
              PVariable var_asset = body.getOrCreateVariableByName("asset");
              PVariable var_operation = body.getOrCreateVariableByName("operation");
              PVariable var_access = body.getOrCreateVariableByName("access");
              PVariable var_priority = body.getOrCreateVariableByName("priority");
              new TypeFilterConstraint(body, new FlatTuple(var_user), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_asset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
              new TypeFilterConstraint(body, new FlatTuple(var_priority), new JavaTransitiveInstancesKey(java.lang.Integer.class));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_user, parameter_pUser),
                 new ExportedParameter(body, var_asset, parameter_pAsset),
                 new ExportedParameter(body, var_operation, parameter_pOperation),
                 new ExportedParameter(body, var_access, parameter_pAccess),
                 new ExportedParameter(body, var_priority, parameter_pPriority)
              ));
              // //  rule default    find objectAllObjects(asset)
              new PositivePatternCall(body, new FlatTuple(var_asset), ObjectAllObjectsQuerySpecification.instance().getInternalQueryRepresentation());
              //     find allUsers(user)
              new PositivePatternCall(body, new FlatTuple(var_user), AllUsersQuerySpecification.instance().getInternalQueryRepresentation());
              //     find readWriteOperation(operation)
              new PositivePatternCall(body, new FlatTuple(var_operation), ReadWriteOperationQuerySpecification.instance().getInternalQueryRepresentation());
              //     access == AccessibilityLevel::ALLOW
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, org.mondo.collaboration.security.increment.vocabulary.AccessibilityLevel.get("ALLOW"));
              new Equality(body, var_access, var__virtual_0_);
              //     priority == 0
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, 0);
              new Equality(body, var_priority, var__virtual_1_);
              bodies.add(body);
          }
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1() {
    return 1;
  }
  
  private static int evaluateExpression_2_1() {
    return 1;
  }
  
  private static int evaluateExpression_3_1() {
    return 1;
  }
  
  private static int evaluateExpression_4_1() {
    return 1;
  }
  
  private static int evaluateExpression_5_1() {
    return 1;
  }
  
  private static int evaluateExpression_6_1() {
    return 0;
  }
}
