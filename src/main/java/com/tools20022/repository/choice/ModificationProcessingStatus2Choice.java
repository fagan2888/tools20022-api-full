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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the processing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmAcknowledgedAccepted
 * ModificationProcessingStatus2Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmPendingProcessing
 * ModificationProcessingStatus2Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmDenied
 * ModificationProcessingStatus2Choice.mmDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmRejected
 * ModificationProcessingStatus2Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmRepaired
 * ModificationProcessingStatus2Choice.mmRepaired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmModified
 * ModificationProcessingStatus2Choice.mmModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice#mmProprietary
 * ModificationProcessingStatus2Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV01#mmModificationProcessingStatus
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.
 * mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmModificationProcessingStatus
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
 * mmModificationProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModificationProcessingStatus2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the processing status."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice
 * ModificationProcessingStatus4Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ModificationProcessingStatus2Choice", propOrder = {"acknowledgedAccepted", "pendingProcessing", "denied", "rejected", "repaired", "modified", "proprietary"})
public class ModificationProcessingStatus2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AckdAccptd", required = true)
	protected AcknowledgedAcceptedStatus14Choice acknowledgedAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus14Choice
	 * AcknowledgedAcceptedStatus14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
	 * ModificationProcessingStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged by the account servicer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//PACK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmAcknowledgedAccepted
	 * ModificationProcessingStatus4Choice.mmAcknowledgedAccepted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus2Choice, AcknowledgedAcceptedStatus14Choice> mmAcknowledgedAccepted = new MMMessageAssociationEnd<ModificationProcessingStatus2Choice, AcknowledgedAcceptedStatus14Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(ModificationProcessingStatus4Choice.mmAcknowledgedAccepted);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcknowledgedAcceptedStatus14Choice.mmObject();
		}

		@Override
		public AcknowledgedAcceptedStatus14Choice getValue(ModificationProcessingStatus2Choice obj) {
			return obj.getAcknowledgedAccepted();
		}

		@Override
		public void setValue(ModificationProcessingStatus2Choice obj, AcknowledgedAcceptedStatus14Choice value) {
			obj.setAcknowledgedAccepted(value);
		}
	};
	@XmlElement(name = "PdgPrcg", required = true)
	protected PendingProcessingStatus7Choice pendingProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus7Choice
	 * PendingProcessingStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
	 * ModificationProcessingStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The modification is pending processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmPendingProcessing
	 * ModificationProcessingStatus4Choice.mmPendingProcessing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus2Choice, PendingProcessingStatus7Choice> mmPendingProcessing = new MMMessageAssociationEnd<ModificationProcessingStatus2Choice, PendingProcessingStatus7Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "The modification is pending processing.";
			nextVersions_lazy = () -> Arrays.asList(ModificationProcessingStatus4Choice.mmPendingProcessing);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingProcessingStatus7Choice.mmObject();
		}

		@Override
		public PendingProcessingStatus7Choice getValue(ModificationProcessingStatus2Choice obj) {
			return obj.getPendingProcessing();
		}

		@Override
		public void setValue(ModificationProcessingStatus2Choice obj, PendingProcessingStatus7Choice value) {
			obj.setPendingProcessing(value);
		}
	};
	@XmlElement(name = "Dnd", required = true)
	protected DeniedStatus6Choice denied;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DeniedStatus6Choice
	 * DeniedStatus6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
	 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
	 * ModificationProcessingStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dnd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification request will not be executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//DEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmDenied
	 * ModificationProcessingStatus4Choice.mmDenied}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus2Choice, DeniedStatus6Choice> mmDenied = new MMMessageAssociationEnd<ModificationProcessingStatus2Choice, DeniedStatus6Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmDeniedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Dnd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//DEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Modification request will not be executed.";
			nextVersions_lazy = () -> Arrays.asList(ModificationProcessingStatus4Choice.mmDenied);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DeniedStatus6Choice.mmObject();
		}

		@Override
		public DeniedStatus6Choice getValue(ModificationProcessingStatus2Choice obj) {
			return obj.getDenied();
		}

		@Override
		public void setValue(ModificationProcessingStatus2Choice obj, DeniedStatus6Choice value) {
			obj.setDenied(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectionStatus8Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus8Choice
	 * RejectionStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
	 * ModificationProcessingStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification request has been rejected for further processing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmRejected
	 * ModificationProcessingStatus4Choice.mmRejected}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus2Choice, RejectionStatus8Choice> mmRejected = new MMMessageAssociationEnd<ModificationProcessingStatus2Choice, RejectionStatus8Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Modification request has been rejected for further processing.";
			nextVersions_lazy = () -> Arrays.asList(ModificationProcessingStatus4Choice.mmRejected);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectionStatus8Choice.mmObject();
		}

		@Override
		public RejectionStatus8Choice getValue(ModificationProcessingStatus2Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(ModificationProcessingStatus2Choice obj, RejectionStatus8Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Rprd", required = true)
	protected RepairStatus8Choice repaired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RepairStatus8Choice
	 * RepairStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
	 * ModificationProcessingStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rprd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repaired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification request is accepted but in repair."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmRepaired
	 * ModificationProcessingStatus4Choice.mmRepaired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus2Choice, RepairStatus8Choice> mmRepaired = new MMMessageAssociationEnd<ModificationProcessingStatus2Choice, RepairStatus8Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Rprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repaired";
			definition = "Modification request is accepted but in repair.";
			nextVersions_lazy = () -> Arrays.asList(ModificationProcessingStatus4Choice.mmRepaired);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepairStatus8Choice.mmObject();
		}

		@Override
		public RepairStatus8Choice getValue(ModificationProcessingStatus2Choice obj) {
			return obj.getRepaired();
		}

		@Override
		public void setValue(ModificationProcessingStatus2Choice obj, RepairStatus8Choice value) {
			obj.setRepaired(value);
		}
	};
	@XmlElement(name = "Modfd", required = true)
	protected ModificationStatus2Choice modified;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationStatus2Choice
	 * ModificationStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmModifiedStatusReason
	 * SecuritiesTradeStatusReason.mmModifiedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
	 * ModificationProcessingStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Modfd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//CAND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmModified
	 * ModificationProcessingStatus4Choice.mmModified}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ModificationProcessingStatus2Choice, ModificationStatus2Choice> mmModified = new MMMessageAttribute<ModificationProcessingStatus2Choice, ModificationStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmModifiedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Modfd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modified";
			definition = "Instruction has been modified.";
			nextVersions_lazy = () -> Arrays.asList(ModificationProcessingStatus4Choice.mmModified);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ModificationStatus2Choice.mmObject();
		}

		@Override
		public ModificationStatus2Choice getValue(ModificationProcessingStatus2Choice obj) {
			return obj.getModified();
		}

		@Override
		public void setValue(ModificationProcessingStatus2Choice obj, ModificationStatus2Choice value) {
			obj.setModified(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected ProprietaryStatusAndReason1 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus2Choice
	 * ModificationProcessingStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC/4!c[4c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice#mmProprietary
	 * ModificationProcessingStatus4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ModificationProcessingStatus2Choice, ProprietaryStatusAndReason1> mmProprietary = new MMMessageAssociationEnd<ModificationProcessingStatus2Choice, ProprietaryStatusAndReason1>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC/4!c[4c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary status.";
			nextVersions_lazy = () -> Arrays.asList(ModificationProcessingStatus4Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}

		@Override
		public ProprietaryStatusAndReason1 getValue(ModificationProcessingStatus2Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(ModificationProcessingStatus2Choice obj, ProprietaryStatusAndReason1 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmAcknowledgedAccepted,
						com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmPendingProcessing, com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmDenied,
						com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmRejected, com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmRepaired,
						com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmModified, com.tools20022.repository.choice.ModificationProcessingStatus2Choice.mmProprietary);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV01.mmModificationProcessingStatus,
						SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmModificationProcessingStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ModificationProcessingStatus2Choice";
				definition = "Choice of format for the processing status.";
				nextVersions_lazy = () -> Arrays.asList(ModificationProcessingStatus4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AcknowledgedAcceptedStatus14Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public ModificationProcessingStatus2Choice setAcknowledgedAccepted(AcknowledgedAcceptedStatus14Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = Objects.requireNonNull(acknowledgedAccepted);
		return this;
	}

	public PendingProcessingStatus7Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public ModificationProcessingStatus2Choice setPendingProcessing(PendingProcessingStatus7Choice pendingProcessing) {
		this.pendingProcessing = Objects.requireNonNull(pendingProcessing);
		return this;
	}

	public DeniedStatus6Choice getDenied() {
		return denied;
	}

	public ModificationProcessingStatus2Choice setDenied(DeniedStatus6Choice denied) {
		this.denied = Objects.requireNonNull(denied);
		return this;
	}

	public RejectionStatus8Choice getRejected() {
		return rejected;
	}

	public ModificationProcessingStatus2Choice setRejected(RejectionStatus8Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public RepairStatus8Choice getRepaired() {
		return repaired;
	}

	public ModificationProcessingStatus2Choice setRepaired(RepairStatus8Choice repaired) {
		this.repaired = Objects.requireNonNull(repaired);
		return this;
	}

	public ModificationStatus2Choice getModified() {
		return modified;
	}

	public ModificationProcessingStatus2Choice setModified(ModificationStatus2Choice modified) {
		this.modified = Objects.requireNonNull(modified);
		return this;
	}

	public ProprietaryStatusAndReason1 getProprietary() {
		return proprietary;
	}

	public ModificationProcessingStatus2Choice setProprietary(ProprietaryStatusAndReason1 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}