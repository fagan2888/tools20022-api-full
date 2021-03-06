/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DataSetCategory11Code;
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max10KBinary;
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.KEKIdentifier5;
import com.tools20022.repository.msg.MaintenanceDelegateAction3;
import com.tools20022.repository.msg.MaintenanceIdentificationAssociation1;
import com.tools20022.repository.msg.TerminalManagementDataSet20;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information on the delegation of a maintenance action or maintenance
 * function.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmDelegationType
 * MaintenanceDelegation5.mmDelegationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmMaintenanceService
 * MaintenanceDelegation5.mmMaintenanceService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmPartialDelegation
 * MaintenanceDelegation5.mmPartialDelegation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmPOISubset
 * MaintenanceDelegation5.mmPOISubset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmDelegatedAction
 * MaintenanceDelegation5.mmDelegatedAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmDelegationScopeIdentification
 * MaintenanceDelegation5.mmDelegationScopeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmDelegationScopeDefinition
 * MaintenanceDelegation5.mmDelegationScopeDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmCertificate
 * MaintenanceDelegation5.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmPOIIdentificationAssociation
 * MaintenanceDelegation5.mmPOIIdentificationAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmSymmetricKey
 * MaintenanceDelegation5.mmSymmetricKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmParameterDataSet
 * MaintenanceDelegation5.mmParameterDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MaintenanceDelegation5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the delegation of a maintenance action or maintenance function."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaintenanceDelegation7
 * MaintenanceDelegation7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3
 * MaintenanceDelegation3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegation5", propOrder = {"delegationType", "maintenanceService", "partialDelegation", "pOISubset", "delegatedAction", "delegationScopeIdentification", "delegationScopeDefinition", "certificate",
		"pOIIdentificationAssociation", "symmetricKey", "parameterDataSet"})
public class MaintenanceDelegation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DlgtnTp", required = true)
	protected TerminalManagementAction3Code delegationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of delegation action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmDelegationType
	 * MaintenanceDelegation7.mmDelegationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegationType
	 * MaintenanceDelegation3.mmDelegationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation5, TerminalManagementAction3Code> mmDelegationType = new MMMessageAttribute<MaintenanceDelegation5, TerminalManagementAction3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "DlgtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationType";
			definition = "Type of delegation action.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmDelegationType);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmDelegationType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}

		@Override
		public TerminalManagementAction3Code getValue(MaintenanceDelegation5 obj) {
			return obj.getDelegationType();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, TerminalManagementAction3Code value) {
			obj.setDelegationType(value);
		}
	};
	@XmlElement(name = "MntncSvc", required = true)
	protected List<DataSetCategory11Code> maintenanceService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntncSvc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintenanceService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance service to be delegated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmMaintenanceService
	 * MaintenanceDelegation7.mmMaintenanceService}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmMaintenanceService
	 * MaintenanceDelegation3.mmMaintenanceService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation5, List<DataSetCategory11Code>> mmMaintenanceService = new MMMessageAttribute<MaintenanceDelegation5, List<DataSetCategory11Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "MntncSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceService";
			definition = "Maintenance service to be delegated.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmMaintenanceService);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmMaintenanceService;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory11Code.mmObject();
		}

		@Override
		public List<DataSetCategory11Code> getValue(MaintenanceDelegation5 obj) {
			return obj.getMaintenanceService();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, List<DataSetCategory11Code> value) {
			obj.setMaintenanceService(value);
		}
	};
	@XmlElement(name = "PrtlDlgtn")
	protected TrueFalseIndicator partialDelegation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlDlgtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDelegation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag to indicate that the delegated maintenance must be performed on a subset of the terminal estate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmPartialDelegation
	 * MaintenanceDelegation7.mmPartialDelegation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmPartialDelegation
	 * MaintenanceDelegation3.mmPartialDelegation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation5, Optional<TrueFalseIndicator>> mmPartialDelegation = new MMMessageAttribute<MaintenanceDelegation5, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "PrtlDlgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDelegation";
			definition = "Flag to indicate that the delegated maintenance must be performed on a subset of the terminal estate.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmPartialDelegation);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmPartialDelegation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(MaintenanceDelegation5 obj) {
			return obj.getPartialDelegation();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, Optional<TrueFalseIndicator> value) {
			obj.setPartialDelegation(value.orElse(null));
		}
	};
	@XmlElement(name = "POISubset")
	protected List<Max35Text> pOISubset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POISubset"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POISubset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subset of the terminal estate for the delegated actions, for instance for pilot or key deactivation). The subset may be expressed as a list of POI or terminal estate subset identifier."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmPOISubset
	 * MaintenanceDelegation7.mmPOISubset}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmPOISubset
	 * MaintenanceDelegation3.mmPOISubset}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation5, List<Max35Text>> mmPOISubset = new MMMessageAttribute<MaintenanceDelegation5, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "POISubset";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISubset";
			definition = "Subset of the terminal estate for the delegated actions, for instance for pilot or key deactivation). The subset may be expressed as a list of POI or terminal estate subset identifier.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmPOISubset);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmPOISubset;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MaintenanceDelegation5 obj) {
			return obj.getPOISubset();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, List<Max35Text> value) {
			obj.setPOISubset(value);
		}
	};
	@XmlElement(name = "DlgtdActn")
	protected MaintenanceDelegateAction3 delegatedAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtdActn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegatedAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information for the MTM to build or include delegated actions in the management plan of the POI."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmDelegatedAction
	 * MaintenanceDelegation7.mmDelegatedAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegatedAction
	 * MaintenanceDelegation3.mmDelegatedAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegation5, Optional<MaintenanceDelegateAction3>> mmDelegatedAction = new MMMessageAssociationEnd<MaintenanceDelegation5, Optional<MaintenanceDelegateAction3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "DlgtdActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegatedAction";
			definition = "Information for the MTM to build or include delegated actions in the management plan of the POI.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmDelegatedAction);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmDelegatedAction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MaintenanceDelegateAction3.mmObject();
		}

		@Override
		public Optional<MaintenanceDelegateAction3> getValue(MaintenanceDelegation5 obj) {
			return obj.getDelegatedAction();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, Optional<MaintenanceDelegateAction3> value) {
			obj.setDelegatedAction(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnScpId")
	protected Max35Text delegationScopeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnScpId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationScopeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the delegation scope assigned by the MTM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmDelegationScopeIdentification
	 * MaintenanceDelegation7.mmDelegationScopeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegationScopeIdentification
	 * MaintenanceDelegation3.mmDelegationScopeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation5, Optional<Max35Text>> mmDelegationScopeIdentification = new MMMessageAttribute<MaintenanceDelegation5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeIdentification";
			definition = "Identification of the delegation scope assigned by the MTM.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmDelegationScopeIdentification);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmDelegationScopeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MaintenanceDelegation5 obj) {
			return obj.getDelegationScopeIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, Optional<Max35Text> value) {
			obj.setDelegationScopeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnScpDef")
	protected Max3000Binary delegationScopeDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnScpDef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationScopeDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of the delegation scope, for instance inside the payment application parameters the range of application profiles, the RID (registered application provider identification)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmDelegationScopeDefinition
	 * MaintenanceDelegation7.mmDelegationScopeDefinition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegationScopeDefinition
	 * MaintenanceDelegation3.mmDelegationScopeDefinition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation5, Optional<Max3000Binary>> mmDelegationScopeDefinition = new MMMessageAttribute<MaintenanceDelegation5, Optional<Max3000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeDefinition";
			definition = "Definition of the delegation scope, for instance inside the payment application parameters the range of application profiles, the RID (registered application provider identification).";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmDelegationScopeDefinition);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmDelegationScopeDefinition;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public Optional<Max3000Binary> getValue(MaintenanceDelegation5 obj) {
			return obj.getDelegationScopeDefinition();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, Optional<Max3000Binary> value) {
			obj.setDelegationScopeDefinition(value.orElse(null));
		}
	};
	@XmlElement(name = "Cert")
	protected List<Max10KBinary> certificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10KBinary Max10KBinary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate path of the terminal manager."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmCertificate
	 * MaintenanceDelegation7.mmCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmCertificate
	 * MaintenanceDelegation3.mmCertificate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation5, List<Max10KBinary>> mmCertificate = new MMMessageAttribute<MaintenanceDelegation5, List<Max10KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Certificate path of the terminal manager.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmCertificate);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmCertificate;
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}

		@Override
		public List<Max10KBinary> getValue(MaintenanceDelegation5 obj) {
			return obj.getCertificate();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, List<Max10KBinary> value) {
			obj.setCertificate(value);
		}
	};
	@XmlElement(name = "POIIdAssoctn")
	protected List<MaintenanceIdentificationAssociation1> pOIIdentificationAssociation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceIdentificationAssociation1
	 * MaintenanceIdentificationAssociation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIIdAssoctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentificationAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Association of the TM identifier and the MTM identifier of a POI."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmPOIIdentificationAssociation
	 * MaintenanceDelegation7.mmPOIIdentificationAssociation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmPOIIdentificationAssociation
	 * MaintenanceDelegation3.mmPOIIdentificationAssociation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegation5, List<MaintenanceIdentificationAssociation1>> mmPOIIdentificationAssociation = new MMMessageAssociationEnd<MaintenanceDelegation5, List<MaintenanceIdentificationAssociation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "POIIdAssoctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentificationAssociation";
			definition = "Association of the TM identifier and the MTM identifier of a POI.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmPOIIdentificationAssociation);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmPOIIdentificationAssociation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MaintenanceIdentificationAssociation1.mmObject();
		}

		@Override
		public List<MaintenanceIdentificationAssociation1> getValue(MaintenanceDelegation5 obj) {
			return obj.getPOIIdentificationAssociation();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, List<MaintenanceIdentificationAssociation1> value) {
			obj.setPOIIdentificationAssociation(value);
		}
	};
	@XmlElement(name = "SmmtrcKey")
	protected List<KEKIdentifier5> symmetricKey;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier5
	 * KEKIdentifier5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SmmtrcKey"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SymmetricKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the key to manage or to download."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmSymmetricKey
	 * MaintenanceDelegation7.mmSymmetricKey}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmSymmetricKey
	 * MaintenanceDelegation3.mmSymmetricKey}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegation5, List<KEKIdentifier5>> mmSymmetricKey = new MMMessageAssociationEnd<MaintenanceDelegation5, List<KEKIdentifier5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "SmmtrcKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SymmetricKey";
			definition = "Identification of the key to manage or to download.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmSymmetricKey);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmSymmetricKey;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KEKIdentifier5.mmObject();
		}

		@Override
		public List<KEKIdentifier5> getValue(MaintenanceDelegation5 obj) {
			return obj.getSymmetricKey();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, List<KEKIdentifier5> value) {
			obj.setSymmetricKey(value);
		}
	};
	@XmlElement(name = "ParamDataSet")
	protected TerminalManagementDataSet20 parameterDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet20
	 * TerminalManagementDataSet20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParamDataSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters of the terminal manager to be sent by the MTM."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation7#mmParameterDataSet
	 * MaintenanceDelegation7.mmParameterDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmParameterDataSet
	 * MaintenanceDelegation3.mmParameterDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegation5, Optional<TerminalManagementDataSet20>> mmParameterDataSet = new MMMessageAssociationEnd<MaintenanceDelegation5, Optional<TerminalManagementDataSet20>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "ParamDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterDataSet";
			definition = "Configuration parameters of the terminal manager to be sent by the MTM.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmParameterDataSet);
			previousVersion_lazy = () -> MaintenanceDelegation3.mmParameterDataSet;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminalManagementDataSet20.mmObject();
		}

		@Override
		public Optional<TerminalManagementDataSet20> getValue(MaintenanceDelegation5 obj) {
			return obj.getParameterDataSet();
		}

		@Override
		public void setValue(MaintenanceDelegation5 obj, Optional<TerminalManagementDataSet20> value) {
			obj.setParameterDataSet(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegation5.mmDelegationType, com.tools20022.repository.msg.MaintenanceDelegation5.mmMaintenanceService,
						com.tools20022.repository.msg.MaintenanceDelegation5.mmPartialDelegation, com.tools20022.repository.msg.MaintenanceDelegation5.mmPOISubset, com.tools20022.repository.msg.MaintenanceDelegation5.mmDelegatedAction,
						com.tools20022.repository.msg.MaintenanceDelegation5.mmDelegationScopeIdentification, com.tools20022.repository.msg.MaintenanceDelegation5.mmDelegationScopeDefinition,
						com.tools20022.repository.msg.MaintenanceDelegation5.mmCertificate, com.tools20022.repository.msg.MaintenanceDelegation5.mmPOIIdentificationAssociation,
						com.tools20022.repository.msg.MaintenanceDelegation5.mmSymmetricKey, com.tools20022.repository.msg.MaintenanceDelegation5.mmParameterDataSet);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegation5";
				definition = "Information on the delegation of a maintenance action or maintenance function.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation7.mmObject());
				previousVersion_lazy = () -> MaintenanceDelegation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getDelegationType() {
		return delegationType;
	}

	public MaintenanceDelegation5 setDelegationType(TerminalManagementAction3Code delegationType) {
		this.delegationType = Objects.requireNonNull(delegationType);
		return this;
	}

	public List<DataSetCategory11Code> getMaintenanceService() {
		return maintenanceService == null ? maintenanceService = new ArrayList<>() : maintenanceService;
	}

	public MaintenanceDelegation5 setMaintenanceService(List<DataSetCategory11Code> maintenanceService) {
		this.maintenanceService = Objects.requireNonNull(maintenanceService);
		return this;
	}

	public Optional<TrueFalseIndicator> getPartialDelegation() {
		return partialDelegation == null ? Optional.empty() : Optional.of(partialDelegation);
	}

	public MaintenanceDelegation5 setPartialDelegation(TrueFalseIndicator partialDelegation) {
		this.partialDelegation = partialDelegation;
		return this;
	}

	public List<Max35Text> getPOISubset() {
		return pOISubset == null ? pOISubset = new ArrayList<>() : pOISubset;
	}

	public MaintenanceDelegation5 setPOISubset(List<Max35Text> pOISubset) {
		this.pOISubset = Objects.requireNonNull(pOISubset);
		return this;
	}

	public Optional<MaintenanceDelegateAction3> getDelegatedAction() {
		return delegatedAction == null ? Optional.empty() : Optional.of(delegatedAction);
	}

	public MaintenanceDelegation5 setDelegatedAction(MaintenanceDelegateAction3 delegatedAction) {
		this.delegatedAction = delegatedAction;
		return this;
	}

	public Optional<Max35Text> getDelegationScopeIdentification() {
		return delegationScopeIdentification == null ? Optional.empty() : Optional.of(delegationScopeIdentification);
	}

	public MaintenanceDelegation5 setDelegationScopeIdentification(Max35Text delegationScopeIdentification) {
		this.delegationScopeIdentification = delegationScopeIdentification;
		return this;
	}

	public Optional<Max3000Binary> getDelegationScopeDefinition() {
		return delegationScopeDefinition == null ? Optional.empty() : Optional.of(delegationScopeDefinition);
	}

	public MaintenanceDelegation5 setDelegationScopeDefinition(Max3000Binary delegationScopeDefinition) {
		this.delegationScopeDefinition = delegationScopeDefinition;
		return this;
	}

	public List<Max10KBinary> getCertificate() {
		return certificate == null ? certificate = new ArrayList<>() : certificate;
	}

	public MaintenanceDelegation5 setCertificate(List<Max10KBinary> certificate) {
		this.certificate = Objects.requireNonNull(certificate);
		return this;
	}

	public List<MaintenanceIdentificationAssociation1> getPOIIdentificationAssociation() {
		return pOIIdentificationAssociation == null ? pOIIdentificationAssociation = new ArrayList<>() : pOIIdentificationAssociation;
	}

	public MaintenanceDelegation5 setPOIIdentificationAssociation(List<MaintenanceIdentificationAssociation1> pOIIdentificationAssociation) {
		this.pOIIdentificationAssociation = Objects.requireNonNull(pOIIdentificationAssociation);
		return this;
	}

	public List<KEKIdentifier5> getSymmetricKey() {
		return symmetricKey == null ? symmetricKey = new ArrayList<>() : symmetricKey;
	}

	public MaintenanceDelegation5 setSymmetricKey(List<KEKIdentifier5> symmetricKey) {
		this.symmetricKey = Objects.requireNonNull(symmetricKey);
		return this;
	}

	public Optional<TerminalManagementDataSet20> getParameterDataSet() {
		return parameterDataSet == null ? Optional.empty() : Optional.of(parameterDataSet);
	}

	public MaintenanceDelegation5 setParameterDataSet(TerminalManagementDataSet20 parameterDataSet) {
		this.parameterDataSet = parameterDataSet;
		return this;
	}
}