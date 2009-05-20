/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OntoUML.DirectedRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link OntoUML.DirectedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link OntoUML.DirectedRelationship#getTargetAux1 <em>Target Aux1</em>}</li>
 *   <li>{@link OntoUML.DirectedRelationship#getSourceAux1 <em>Source Aux1</em>}</li>
 *   <li>{@link OntoUML.DirectedRelationship#getTargetAux2 <em>Target Aux2</em>}</li>
 *   <li>{@link OntoUML.DirectedRelationship#getSourceAux2 <em>Source Aux2</em>}</li>
 * </ul>
 * </p>
 *
 * @see OntoUML.OntoUMLPackage#getDirectedRelationship()
 * @model
 * @generated
 */
public interface DirectedRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see OntoUML.OntoUMLPackage#getDirectedRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	EList<Element> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see OntoUML.OntoUMLPackage#getDirectedRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<Element> getSource();

	/**
	 * Returns the value of the '<em><b>Target Aux1</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Aux1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Aux1</em>' reference list.
	 * @see OntoUML.OntoUMLPackage#getDirectedRelationship_TargetAux1()
	 * @model
	 * @generated
	 */
	EList<Element> getTargetAux1();

	/**
	 * Returns the value of the '<em><b>Source Aux1</b></em>' reference list.
	 * The list contents are of type {@link OntoUML.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Aux1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Aux1</em>' reference list.
	 * @see OntoUML.OntoUMLPackage#getDirectedRelationship_SourceAux1()
	 * @model
	 * @generated
	 */
	EList<Element> getSourceAux1();

	/**
	 * Returns the value of the '<em><b>Target Aux2</b></em>' containment reference list.
	 * The list contents are of type {@link OntoUML.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Aux2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Aux2</em>' containment reference list.
	 * @see OntoUML.OntoUMLPackage#getDirectedRelationship_TargetAux2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getTargetAux2();

	/**
	 * Returns the value of the '<em><b>Source Aux2</b></em>' containment reference list.
	 * The list contents are of type {@link OntoUML.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Aux2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Aux2</em>' containment reference list.
	 * @see OntoUML.OntoUMLPackage#getDirectedRelationship_SourceAux2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getSourceAux2();

} // DirectedRelationship
