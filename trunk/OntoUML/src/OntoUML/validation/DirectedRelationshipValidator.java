/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.validation;

import OntoUML.Element;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link OntoUML.DirectedRelationship}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DirectedRelationshipValidator {
	boolean validate();

	boolean validateTarget(EList<Element> value);
	boolean validateSource(EList<Element> value);
	boolean validateTargetAux1(EList<Element> value);
	boolean validateSourceAux1(EList<Element> value);
	boolean validateTargetAux2(EList<Element> value);
	boolean validateSourceAux2(EList<Element> value);
}
