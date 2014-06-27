/**
 */
package org.eclipse.emf.fcompare.core.fcompare;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.fcompare.core.fcompare.fcomapreFactory
 * @model kind="package"
 * @generated
 */
public interface fcomaprePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fcompare";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/fcompare";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.fcompare.core.fcompare";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	fcomaprePackage eINSTANCE = org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.DiffImpl <em>Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.DiffImpl
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiff()
	 * @generated
	 */
	int DIFF = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__LEFT = 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__PARENT = 4;

	/**
	 * The number of structural features of the '<em>Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Merge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF___MERGE__DIFFORIGIN = 0;

	/**
	 * The number of operations of the '<em>Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.DiffEntryImpl <em>Diff Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.DiffEntryImpl
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffEntry()
	 * @generated
	 */
	int DIFF_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENTRY__ORIGIN = 0;

	/**
	 * The number of structural features of the '<em>Diff Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diff Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.FEngineImpl <em>FEngine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.FEngineImpl
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getFEngine()
	 * @generated
	 */
	int FENGINE = 2;

	/**
	 * The feature id for the '<em><b>Differences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE__DIFFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE__STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE__LEFT = 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE__RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE__PARENT = 4;

	/**
	 * The number of structural features of the '<em>FEngine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Compute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE___COMPUTE = 0;

	/**
	 * The operation id for the '<em>Merge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE___MERGE__ELIST_DIFFORIGIN = 1;

	/**
	 * The operation id for the '<em>Roll Back</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE___ROLL_BACK = 2;

	/**
	 * The operation id for the '<em>Commit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE___COMMIT = 3;

	/**
	 * The number of operations of the '<em>FEngine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENGINE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.DiffStrategyImpl <em>Diff Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.DiffStrategyImpl
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffStrategy()
	 * @generated
	 */
	int DIFF_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Diff Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Compute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STRATEGY___COMPUTE = 0;

	/**
	 * The number of operations of the '<em>Diff Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_STRATEGY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.EagerStrategyImpl <em>Eager Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.EagerStrategyImpl
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getEagerStrategy()
	 * @generated
	 */
	int EAGER_STRATEGY = 4;

	/**
	 * The number of structural features of the '<em>Eager Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAGER_STRATEGY_FEATURE_COUNT = DIFF_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAGER_STRATEGY___COMPUTE = DIFF_STRATEGY___COMPUTE;

	/**
	 * The number of operations of the '<em>Eager Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAGER_STRATEGY_OPERATION_COUNT = DIFF_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.LazyStrategyImpl <em>Lazy Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.LazyStrategyImpl
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getLazyStrategy()
	 * @generated
	 */
	int LAZY_STRATEGY = 5;

	/**
	 * The number of structural features of the '<em>Lazy Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRATEGY_FEATURE_COUNT = DIFF_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRATEGY___COMPUTE = DIFF_STRATEGY___COMPUTE;

	/**
	 * The number of operations of the '<em>Lazy Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRATEGY_OPERATION_COUNT = DIFF_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.fcompare.core.fcompare.DiffType <em>Diff Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffType
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffType()
	 * @generated
	 */
	int DIFF_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.fcompare.core.fcompare.DiffStatus <em>Diff Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffStatus
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffStatus()
	 * @generated
	 */
	int DIFF_STATUS = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.fcompare.core.fcompare.DiffOrigin <em>Diff Origin</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffOrigin
	 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffOrigin()
	 * @generated
	 */
	int DIFF_ORIGIN = 8;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.fcompare.core.fcompare.Diff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.Diff
	 * @generated
	 */
	EClass getDiff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.Diff#getStatus()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.Diff#getType()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.Diff#getLeft()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_Left();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.Diff#getRight()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_Right();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.Diff#getParent()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_Parent();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emf.fcompare.core.fcompare.Diff#merge(org.eclipse.emf.fcompare.core.fcompare.DiffOrigin) <em>Merge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge</em>' operation.
	 * @see org.eclipse.emf.fcompare.core.fcompare.Diff#merge(org.eclipse.emf.fcompare.core.fcompare.DiffOrigin)
	 * @generated
	 */
	EOperation getDiff__Merge__DiffOrigin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.fcompare.core.fcompare.DiffEntry <em>Diff Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Entry</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffEntry
	 * @generated
	 */
	EClass getDiffEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.fcompare.core.fcompare.DiffEntry#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffEntry#getOrigin()
	 * @see #getDiffEntry()
	 * @generated
	 */
	EAttribute getDiffEntry_Origin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine <em>FEngine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FEngine</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine
	 * @generated
	 */
	EClass getFEngine();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getDifferences <em>Differences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Differences</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine#getDifferences()
	 * @see #getFEngine()
	 * @generated
	 */
	EReference getFEngine_Differences();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strategy</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine#getStrategy()
	 * @see #getFEngine()
	 * @generated
	 */
	EReference getFEngine_Strategy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine#getLeft()
	 * @see #getFEngine()
	 * @generated
	 */
	EReference getFEngine_Left();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine#getRight()
	 * @see #getFEngine()
	 * @generated
	 */
	EReference getFEngine_Right();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine#getParent()
	 * @see #getFEngine()
	 * @generated
	 */
	EReference getFEngine_Parent();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#compute() <em>Compute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute</em>' operation.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine#compute()
	 * @generated
	 */
	EOperation getFEngine__Compute();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#merge(org.eclipse.emf.common.util.EList, org.eclipse.emf.fcompare.core.fcompare.DiffOrigin) <em>Merge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge</em>' operation.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine#merge(org.eclipse.emf.common.util.EList, org.eclipse.emf.fcompare.core.fcompare.DiffOrigin)
	 * @generated
	 */
	EOperation getFEngine__Merge__EList_DiffOrigin();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#rollBack() <em>Roll Back</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Roll Back</em>' operation.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine#rollBack()
	 * @generated
	 */
	EOperation getFEngine__RollBack();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emf.fcompare.core.fcompare.FEngine#commit() <em>Commit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Commit</em>' operation.
	 * @see org.eclipse.emf.fcompare.core.fcompare.FEngine#commit()
	 * @generated
	 */
	EOperation getFEngine__Commit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.fcompare.core.fcompare.DiffStrategy <em>Diff Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Strategy</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffStrategy
	 * @generated
	 */
	EClass getDiffStrategy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.emf.fcompare.core.fcompare.DiffStrategy#compute() <em>Compute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute</em>' operation.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffStrategy#compute()
	 * @generated
	 */
	EOperation getDiffStrategy__Compute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.fcompare.core.fcompare.EagerStrategy <em>Eager Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eager Strategy</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.EagerStrategy
	 * @generated
	 */
	EClass getEagerStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.fcompare.core.fcompare.LazyStrategy <em>Lazy Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lazy Strategy</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.LazyStrategy
	 * @generated
	 */
	EClass getLazyStrategy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.fcompare.core.fcompare.DiffType <em>Diff Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Type</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffType
	 * @generated
	 */
	EEnum getDiffType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.fcompare.core.fcompare.DiffStatus <em>Diff Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Status</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffStatus
	 * @generated
	 */
	EEnum getDiffStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.fcompare.core.fcompare.DiffOrigin <em>Diff Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diff Origin</em>'.
	 * @see org.eclipse.emf.fcompare.core.fcompare.DiffOrigin
	 * @generated
	 */
	EEnum getDiffOrigin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	fcomapreFactory getfcomapreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.DiffImpl <em>Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.DiffImpl
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiff()
		 * @generated
		 */
		EClass DIFF = eINSTANCE.getDiff();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__STATUS = eINSTANCE.getDiff_Status();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__TYPE = eINSTANCE.getDiff_Type();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF__LEFT = eINSTANCE.getDiff_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF__RIGHT = eINSTANCE.getDiff_Right();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF__PARENT = eINSTANCE.getDiff_Parent();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIFF___MERGE__DIFFORIGIN = eINSTANCE.getDiff__Merge__DiffOrigin();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.DiffEntryImpl <em>Diff Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.DiffEntryImpl
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffEntry()
		 * @generated
		 */
		EClass DIFF_ENTRY = eINSTANCE.getDiffEntry();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_ENTRY__ORIGIN = eINSTANCE.getDiffEntry_Origin();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.FEngineImpl <em>FEngine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.FEngineImpl
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getFEngine()
		 * @generated
		 */
		EClass FENGINE = eINSTANCE.getFEngine();

		/**
		 * The meta object literal for the '<em><b>Differences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FENGINE__DIFFERENCES = eINSTANCE.getFEngine_Differences();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FENGINE__STRATEGY = eINSTANCE.getFEngine_Strategy();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FENGINE__LEFT = eINSTANCE.getFEngine_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FENGINE__RIGHT = eINSTANCE.getFEngine_Right();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FENGINE__PARENT = eINSTANCE.getFEngine_Parent();

		/**
		 * The meta object literal for the '<em><b>Compute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FENGINE___COMPUTE = eINSTANCE.getFEngine__Compute();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FENGINE___MERGE__ELIST_DIFFORIGIN = eINSTANCE.getFEngine__Merge__EList_DiffOrigin();

		/**
		 * The meta object literal for the '<em><b>Roll Back</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FENGINE___ROLL_BACK = eINSTANCE.getFEngine__RollBack();

		/**
		 * The meta object literal for the '<em><b>Commit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FENGINE___COMMIT = eINSTANCE.getFEngine__Commit();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.DiffStrategyImpl <em>Diff Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.DiffStrategyImpl
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffStrategy()
		 * @generated
		 */
		EClass DIFF_STRATEGY = eINSTANCE.getDiffStrategy();

		/**
		 * The meta object literal for the '<em><b>Compute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIFF_STRATEGY___COMPUTE = eINSTANCE.getDiffStrategy__Compute();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.EagerStrategyImpl <em>Eager Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.EagerStrategyImpl
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getEagerStrategy()
		 * @generated
		 */
		EClass EAGER_STRATEGY = eINSTANCE.getEagerStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.fcompare.core.fcompare.impl.LazyStrategyImpl <em>Lazy Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.LazyStrategyImpl
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getLazyStrategy()
		 * @generated
		 */
		EClass LAZY_STRATEGY = eINSTANCE.getLazyStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.fcompare.core.fcompare.DiffType <em>Diff Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.fcompare.core.fcompare.DiffType
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffType()
		 * @generated
		 */
		EEnum DIFF_TYPE = eINSTANCE.getDiffType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.fcompare.core.fcompare.DiffStatus <em>Diff Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.fcompare.core.fcompare.DiffStatus
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffStatus()
		 * @generated
		 */
		EEnum DIFF_STATUS = eINSTANCE.getDiffStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.fcompare.core.fcompare.DiffOrigin <em>Diff Origin</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.fcompare.core.fcompare.DiffOrigin
		 * @see org.eclipse.emf.fcompare.core.fcompare.impl.fcomaprePackageImpl#getDiffOrigin()
		 * @generated
		 */
		EEnum DIFF_ORIGIN = eINSTANCE.getDiffOrigin();

	}

} //fcomaprePackage
