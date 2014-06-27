/**
 */
package org.eclipse.emf.fcompare.core.fcompare.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.fcompare.core.fcompare.Diff;
import org.eclipse.emf.fcompare.core.fcompare.DiffStrategy;
import org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DiffStrategyImpl extends MinimalEObjectImpl.Container implements DiffStrategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fcomaprePackage.Literals.DIFF_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diff compute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case fcomaprePackage.DIFF_STRATEGY___COMPUTE:
				return compute();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiffStrategyImpl
