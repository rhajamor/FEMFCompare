/**
 */
package org.eclipse.emf.fcompare.core.fcompare;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getDiff()
 * @model
 * @generated
 */
public interface Diff extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.fcompare.core.fcompare.DiffStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffStatus
	 * @see #setStatus(DiffStatus)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getDiff_Status()
	 * @model
	 * @generated
	 */
	DiffStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DiffStatus value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.fcompare.core.fcompare.DiffType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffType
	 * @see #setType(DiffType)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getDiff_Type()
	 * @model
	 * @generated
	 */
	DiffType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffType
	 * @see #getType()
	 * @generated
	 */
	void setType(DiffType value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(DiffEntry)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getDiff_Left()
	 * @model
	 * @generated
	 */
	DiffEntry getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(DiffEntry value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(DiffEntry)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getDiff_Right()
	 * @model
	 * @generated
	 */
	DiffEntry getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(DiffEntry value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(DiffEntry)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getDiff_Parent()
	 * @model
	 * @generated
	 */
	DiffEntry getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DiffEntry value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void merge(DiffOrigin side);

} // Diff
