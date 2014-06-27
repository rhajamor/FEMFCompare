/**
 */
package org.eclipse.emf.fcompare.core.fcompare.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.fcompare.core.fcompare.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class fcomapreFactoryImpl extends EFactoryImpl implements fcomapreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static fcomapreFactory init() {
		try {
			fcomapreFactory thefcomapreFactory = (fcomapreFactory)EPackage.Registry.INSTANCE.getEFactory(fcomaprePackage.eNS_URI);
			if (thefcomapreFactory != null) {
				return thefcomapreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new fcomapreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fcomapreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case fcomaprePackage.DIFF: return createDiff();
			case fcomaprePackage.DIFF_ENTRY: return createDiffEntry();
			case fcomaprePackage.FENGINE: return createFEngine();
			case fcomaprePackage.EAGER_STRATEGY: return createEagerStrategy();
			case fcomaprePackage.LAZY_STRATEGY: return createLazyStrategy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case fcomaprePackage.DIFF_TYPE:
				return createDiffTypeFromString(eDataType, initialValue);
			case fcomaprePackage.DIFF_STATUS:
				return createDiffStatusFromString(eDataType, initialValue);
			case fcomaprePackage.DIFF_ORIGIN:
				return createDiffOriginFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case fcomaprePackage.DIFF_TYPE:
				return convertDiffTypeToString(eDataType, instanceValue);
			case fcomaprePackage.DIFF_STATUS:
				return convertDiffStatusToString(eDataType, instanceValue);
			case fcomaprePackage.DIFF_ORIGIN:
				return convertDiffOriginToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diff createDiff() {
		DiffImpl diff = new DiffImpl();
		return diff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffEntry createDiffEntry() {
		DiffEntryImpl diffEntry = new DiffEntryImpl();
		return diffEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FEngine createFEngine() {
		FEngineImpl fEngine = new FEngineImpl();
		return fEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EagerStrategy createEagerStrategy() {
		EagerStrategyImpl eagerStrategy = new EagerStrategyImpl();
		return eagerStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyStrategy createLazyStrategy() {
		LazyStrategyImpl lazyStrategy = new LazyStrategyImpl();
		return lazyStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffType createDiffTypeFromString(EDataType eDataType, String initialValue) {
		DiffType result = DiffType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiffTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffStatus createDiffStatusFromString(EDataType eDataType, String initialValue) {
		DiffStatus result = DiffStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiffStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffOrigin createDiffOriginFromString(EDataType eDataType, String initialValue) {
		DiffOrigin result = DiffOrigin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiffOriginToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fcomaprePackage getfcomaprePackage() {
		return (fcomaprePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static fcomaprePackage getPackage() {
		return fcomaprePackage.eINSTANCE;
	}

} //fcomapreFactoryImpl
