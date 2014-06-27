/**
 */
package org.eclipse.emf.fcompare.core.fcompare;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getDiffStrategy()
 * @model abstract="true"
 * @generated
 */
public interface DiffStrategy extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Diff compute();

} // DiffStrategy
