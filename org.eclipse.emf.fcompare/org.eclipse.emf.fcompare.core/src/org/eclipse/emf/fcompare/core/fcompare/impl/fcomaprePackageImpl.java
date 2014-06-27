/**
 */
package org.eclipse.emf.fcompare.core.fcompare.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.fcompare.core.fcompare.Diff;
import org.eclipse.emf.fcompare.core.fcompare.DiffEntry;
import org.eclipse.emf.fcompare.core.fcompare.DiffOrigin;
import org.eclipse.emf.fcompare.core.fcompare.DiffStatus;
import org.eclipse.emf.fcompare.core.fcompare.DiffStrategy;
import org.eclipse.emf.fcompare.core.fcompare.DiffType;
import org.eclipse.emf.fcompare.core.fcompare.EagerStrategy;
import org.eclipse.emf.fcompare.core.fcompare.FEngine;
import org.eclipse.emf.fcompare.core.fcompare.LazyStrategy;
import org.eclipse.emf.fcompare.core.fcompare.fcomapreFactory;
import org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class fcomaprePackageImpl extends EPackageImpl implements fcomaprePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eagerStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lazyStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diffTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diffStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diffOriginEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.fcompare.core.fcompare.fcomaprePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private fcomaprePackageImpl() {
		super(eNS_URI, fcomapreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link fcomaprePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static fcomaprePackage init() {
		if (isInited) return (fcomaprePackage)EPackage.Registry.INSTANCE.getEPackage(fcomaprePackage.eNS_URI);

		// Obtain or create and register package
		fcomaprePackageImpl thefcomaprePackage = (fcomaprePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof fcomaprePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new fcomaprePackageImpl());

		isInited = true;

		// Create package meta-data objects
		thefcomaprePackage.createPackageContents();

		// Initialize created meta-data
		thefcomaprePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thefcomaprePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(fcomaprePackage.eNS_URI, thefcomaprePackage);
		return thefcomaprePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiff() {
		return diffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiff_Status() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiff_Type() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiff_Left() {
		return (EReference)diffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiff_Right() {
		return (EReference)diffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiff_Parent() {
		return (EReference)diffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiff__Merge__DiffOrigin() {
		return diffEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffEntry() {
		return diffEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffEntry_Origin() {
		return (EAttribute)diffEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFEngine() {
		return fEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFEngine_Differences() {
		return (EReference)fEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFEngine_Strategy() {
		return (EReference)fEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFEngine_Left() {
		return (EReference)fEngineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFEngine_Right() {
		return (EReference)fEngineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFEngine_Parent() {
		return (EReference)fEngineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFEngine__Compute() {
		return fEngineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFEngine__Merge__EList_DiffOrigin() {
		return fEngineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFEngine__RollBack() {
		return fEngineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFEngine__Commit() {
		return fEngineEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffStrategy() {
		return diffStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiffStrategy__Compute() {
		return diffStrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEagerStrategy() {
		return eagerStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLazyStrategy() {
		return lazyStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiffType() {
		return diffTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiffStatus() {
		return diffStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiffOrigin() {
		return diffOriginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fcomapreFactory getfcomapreFactory() {
		return (fcomapreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		diffEClass = createEClass(DIFF);
		createEAttribute(diffEClass, DIFF__STATUS);
		createEAttribute(diffEClass, DIFF__TYPE);
		createEReference(diffEClass, DIFF__LEFT);
		createEReference(diffEClass, DIFF__RIGHT);
		createEReference(diffEClass, DIFF__PARENT);
		createEOperation(diffEClass, DIFF___MERGE__DIFFORIGIN);

		diffEntryEClass = createEClass(DIFF_ENTRY);
		createEAttribute(diffEntryEClass, DIFF_ENTRY__ORIGIN);

		fEngineEClass = createEClass(FENGINE);
		createEReference(fEngineEClass, FENGINE__DIFFERENCES);
		createEReference(fEngineEClass, FENGINE__STRATEGY);
		createEReference(fEngineEClass, FENGINE__LEFT);
		createEReference(fEngineEClass, FENGINE__RIGHT);
		createEReference(fEngineEClass, FENGINE__PARENT);
		createEOperation(fEngineEClass, FENGINE___COMPUTE);
		createEOperation(fEngineEClass, FENGINE___MERGE__ELIST_DIFFORIGIN);
		createEOperation(fEngineEClass, FENGINE___ROLL_BACK);
		createEOperation(fEngineEClass, FENGINE___COMMIT);

		diffStrategyEClass = createEClass(DIFF_STRATEGY);
		createEOperation(diffStrategyEClass, DIFF_STRATEGY___COMPUTE);

		eagerStrategyEClass = createEClass(EAGER_STRATEGY);

		lazyStrategyEClass = createEClass(LAZY_STRATEGY);

		// Create enums
		diffTypeEEnum = createEEnum(DIFF_TYPE);
		diffStatusEEnum = createEEnum(DIFF_STATUS);
		diffOriginEEnum = createEEnum(DIFF_ORIGIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eagerStrategyEClass.getESuperTypes().add(this.getDiffStrategy());
		lazyStrategyEClass.getESuperTypes().add(this.getDiffStrategy());

		// Initialize classes, features, and operations; add parameters
		initEClass(diffEClass, Diff.class, "Diff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiff_Status(), this.getDiffStatus(), "status", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiff_Type(), this.getDiffType(), "type", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiff_Left(), this.getDiffEntry(), null, "left", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiff_Right(), this.getDiffEntry(), null, "right", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiff_Parent(), this.getDiffEntry(), null, "parent", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDiff__Merge__DiffOrigin(), null, "merge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDiffOrigin(), "side", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diffEntryEClass, DiffEntry.class, "DiffEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffEntry_Origin(), this.getDiffOrigin(), "origin", null, 0, 1, DiffEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fEngineEClass, FEngine.class, "FEngine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFEngine_Differences(), this.getDiff(), null, "differences", null, 0, -1, FEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFEngine_Strategy(), this.getDiffStrategy(), null, "strategy", null, 0, 1, FEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFEngine_Left(), ecorePackage.getEObject(), null, "left", null, 0, 1, FEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFEngine_Right(), ecorePackage.getEObject(), null, "right", null, 0, 1, FEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFEngine_Parent(), ecorePackage.getEObject(), null, "parent", null, 0, 1, FEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFEngine__Compute(), null, "compute", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getFEngine__Merge__EList_DiffOrigin(), ecorePackage.getEBoolean(), "merge", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "differences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDiffOrigin(), "side", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFEngine__RollBack(), null, "rollBack", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFEngine__Commit(), null, "commit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diffStrategyEClass, DiffStrategy.class, "DiffStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDiffStrategy__Compute(), this.getDiff(), "compute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eagerStrategyEClass, EagerStrategy.class, "EagerStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lazyStrategyEClass, LazyStrategy.class, "LazyStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(diffTypeEEnum, DiffType.class, "DiffType");
		addEEnumLiteral(diffTypeEEnum, DiffType.DIFFERENCE);
		addEEnumLiteral(diffTypeEEnum, DiffType.CONFLICT);

		initEEnum(diffStatusEEnum, DiffStatus.class, "DiffStatus");
		addEEnumLiteral(diffStatusEEnum, DiffStatus.MERGED);
		addEEnumLiteral(diffStatusEEnum, DiffStatus.UNMERGED);

		initEEnum(diffOriginEEnum, DiffOrigin.class, "DiffOrigin");
		addEEnumLiteral(diffOriginEEnum, DiffOrigin.LEFT);
		addEEnumLiteral(diffOriginEEnum, DiffOrigin.RIGHT);

		// Create resource
		createResource(eNS_URI);
	}

} //fcomaprePackageImpl
