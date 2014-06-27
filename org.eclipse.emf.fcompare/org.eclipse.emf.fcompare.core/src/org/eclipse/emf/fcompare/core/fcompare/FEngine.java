/**
 */
package org.eclipse.emf.fcompare.core.fcompare;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FEngine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getDifferences <em>Differences</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getFEngine()
 * @model
 * @generated
 */
public interface FEngine extends EObject {
	/**
	 * Returns the value of the '<em><b>Differences</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.fcompare.core.fcompare.Diff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Differences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Differences</em>' reference list.
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getFEngine_Differences()
	 * @model
	 * @generated
	 */
	EList<Diff> getDifferences();

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' reference.
	 * @see #setStrategy(DiffStrategy)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getFEngine_Strategy()
	 * @model
	 * @generated
	 */
	DiffStrategy getStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getStrategy <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(DiffStrategy value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(EObject)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getFEngine_Left()
	 * @model
	 * @generated
	 */
	EObject getLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(EObject value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(EObject)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getFEngine_Right()
	 * @model
	 * @generated
	 */
	EObject getRight();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(EObject value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(EObject)
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#getFEngine_Parent()
	 * @model
	 * @generated
	 */
	EObject getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<?> compute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model differencesMany="false"
	 * @generated
	 */
	boolean merge(EList<?> differences, DiffOrigin side);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void rollBack();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void commit();

} // FEngine
