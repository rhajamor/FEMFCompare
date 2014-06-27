/**
 */
package org.eclipse.emf.fcompare.core.fcompare.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.fcompare.core.fcompare.Diff;
import org.eclipse.emf.fcompare.core.fcompare.DiffOrigin;
import org.eclipse.emf.fcompare.core.fcompare.DiffStrategy;
import org.eclipse.emf.fcompare.core.fcompare.FEngine;
import org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FEngine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.impl.FEngineImpl#getDifferences <em>Differences</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.impl.FEngineImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.impl.FEngineImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.impl.FEngineImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclipse.emf.fcompare.core.fcompare.impl.FEngineImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FEngineImpl extends MinimalEObjectImpl.Container implements FEngine {
	/**
	 * The cached value of the '{@link #getDifferences() <em>Differences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Diff> differences;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected DiffStrategy strategy;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EObject left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EObject right;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EObject parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fcomaprePackage.Literals.FENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Diff> getDifferences() {
		if (differences == null) {
			differences = new EObjectResolvingEList<Diff>(Diff.class, this, fcomaprePackage.FENGINE__DIFFERENCES);
		}
		return differences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffStrategy getStrategy() {
		if (strategy != null && strategy.eIsProxy()) {
			InternalEObject oldStrategy = (InternalEObject)strategy;
			strategy = (DiffStrategy)eResolveProxy(oldStrategy);
			if (strategy != oldStrategy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, fcomaprePackage.FENGINE__STRATEGY, oldStrategy, strategy));
			}
		}
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffStrategy basicGetStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(DiffStrategy newStrategy) {
		DiffStrategy oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, fcomaprePackage.FENGINE__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, fcomaprePackage.FENGINE__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(EObject newLeft) {
		EObject oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, fcomaprePackage.FENGINE__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, fcomaprePackage.FENGINE__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(EObject newRight) {
		EObject oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, fcomaprePackage.FENGINE__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, fcomaprePackage.FENGINE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(EObject newParent) {
		EObject oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, fcomaprePackage.FENGINE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> compute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean merge(EList<?> differences, DiffOrigin side) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rollBack() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void commit() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case fcomaprePackage.FENGINE__DIFFERENCES:
				return getDifferences();
			case fcomaprePackage.FENGINE__STRATEGY:
				if (resolve) return getStrategy();
				return basicGetStrategy();
			case fcomaprePackage.FENGINE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case fcomaprePackage.FENGINE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case fcomaprePackage.FENGINE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case fcomaprePackage.FENGINE__DIFFERENCES:
				getDifferences().clear();
				getDifferences().addAll((Collection<? extends Diff>)newValue);
				return;
			case fcomaprePackage.FENGINE__STRATEGY:
				setStrategy((DiffStrategy)newValue);
				return;
			case fcomaprePackage.FENGINE__LEFT:
				setLeft((EObject)newValue);
				return;
			case fcomaprePackage.FENGINE__RIGHT:
				setRight((EObject)newValue);
				return;
			case fcomaprePackage.FENGINE__PARENT:
				setParent((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case fcomaprePackage.FENGINE__DIFFERENCES:
				getDifferences().clear();
				return;
			case fcomaprePackage.FENGINE__STRATEGY:
				setStrategy((DiffStrategy)null);
				return;
			case fcomaprePackage.FENGINE__LEFT:
				setLeft((EObject)null);
				return;
			case fcomaprePackage.FENGINE__RIGHT:
				setRight((EObject)null);
				return;
			case fcomaprePackage.FENGINE__PARENT:
				setParent((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case fcomaprePackage.FENGINE__DIFFERENCES:
				return differences != null && !differences.isEmpty();
			case fcomaprePackage.FENGINE__STRATEGY:
				return strategy != null;
			case fcomaprePackage.FENGINE__LEFT:
				return left != null;
			case fcomaprePackage.FENGINE__RIGHT:
				return right != null;
			case fcomaprePackage.FENGINE__PARENT:
				return parent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case fcomaprePackage.FENGINE___COMPUTE:
				return compute();
			case fcomaprePackage.FENGINE___MERGE__ELIST_DIFFORIGIN:
				return merge((EList<?>)arguments.get(0), (DiffOrigin)arguments.get(1));
			case fcomaprePackage.FENGINE___ROLL_BACK:
				rollBack();
				return null;
			case fcomaprePackage.FENGINE___COMMIT:
				commit();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FEngineImpl
