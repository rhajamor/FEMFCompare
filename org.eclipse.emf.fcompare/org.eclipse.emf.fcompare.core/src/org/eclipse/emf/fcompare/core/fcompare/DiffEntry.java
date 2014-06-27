/**
 */
package org.eclipse.emf.fcompare.core.fcompare;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.DiffEntry#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getDiffEntry()
 * @model
 * @generated
 */
public interface DiffEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.fcompare.core.fcompare.DiffOrigin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffOrigin
	 * @see #setOrigin(DiffOrigin)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getDiffEntry_Origin()
	 * @model
	 * @generated
	 */
	DiffOrigin getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.DiffEntry#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffOrigin
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(DiffOrigin value);

} // DiffEntry
