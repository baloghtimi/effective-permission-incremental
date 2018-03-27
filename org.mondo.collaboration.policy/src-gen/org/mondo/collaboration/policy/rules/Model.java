/**
 * generated by Xtext 2.13.0
 */
package org.mondo.collaboration.policy.rules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mondo.collaboration.policy.rules.Model#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.mondo.collaboration.policy.rules.Model#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see org.mondo.collaboration.policy.rules.RulesPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link org.mondo.collaboration.policy.rules.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getModel_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy</em>' containment reference.
   * @see #setPolicy(Policy)
   * @see org.mondo.collaboration.policy.rules.RulesPackage#getModel_Policy()
   * @model containment="true"
   * @generated
   */
  Policy getPolicy();

  /**
   * Sets the value of the '{@link org.mondo.collaboration.policy.rules.Model#getPolicy <em>Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy</em>' containment reference.
   * @see #getPolicy()
   * @generated
   */
  void setPolicy(Policy value);

} // Model
