/**
 */
package org.eclipse.emf.fcompare.core.fcompare;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage
 * @generated
 */
public interface fcomapreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	fcomapreFactory eINSTANCE = org.eclipse.emf.fcompare.core.fcompare.impl.fcomapreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff</em>'.
	 * @generated
	 */
	Diff createDiff();

	/**
	 * Returns a new object of class '<em>Diff Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Entry</em>'.
	 * @generated
	 */
	DiffEntry createDiffEntry();

	/**
	 * Returns a new object of class '<em>FEngine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FEngine</em>'.
	 * @generated
	 */
	FEngine createFEngine();

	/**
	 * Returns a new object of class '<em>Eager Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eager Strategy</em>'.
	 * @generated
	 */
	EagerStrategy createEagerStrategy();

	/**
	 * Returns a new object of class '<em>Lazy Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lazy Strategy</em>'.
	 * @generated
	 */
	LazyStrategy createLazyStrategy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	fcomaprePackage getfcomaprePackage();

} //fcomapreFactory
