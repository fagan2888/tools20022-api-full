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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the instruction processing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmPendingProcessing
 * InstructionProcessingStatus14Choice.mmPendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmCancellationRequested
 * InstructionProcessingStatus14Choice.mmCancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmAcknowledgedAccepted
 * InstructionProcessingStatus14Choice.mmAcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmCancelled
 * InstructionProcessingStatus14Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmGenerated
 * InstructionProcessingStatus14Choice.mmGenerated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmRepair
 * InstructionProcessingStatus14Choice.mmRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmPendingCancellation
 * InstructionProcessingStatus14Choice.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice#mmModificationRequested
 * InstructionProcessingStatus14Choice.mmModificationRequested}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionProcessingStatus14Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the instruction processing status."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
 * InstructionProcessingStatus22Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice
 * InstructionProcessingStatus10Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionProcessingStatus14Choice", propOrder = {"pendingProcessing", "cancellationRequested", "acknowledgedAccepted", "cancelled", "generated", "repair", "pendingCancellation", "modificationRequested"})
public class InstructionProcessingStatus14Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PdgPrcg", required = true)
	protected PendingProcessingStatus3Choice pendingProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingStatus3Choice
	 * PendingProcessingStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice
	 * InstructionProcessingStatus14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing of the instruction/request is pending."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmPendingProcessing
	 * InstructionProcessingStatus22Choice.mmPendingProcessing}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmPendingProcessing
	 * InstructionProcessingStatus10Choice.mmPendingProcessing}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus14Choice, PendingProcessingStatus3Choice> mmPendingProcessing = new MMMessageAssociationEnd<InstructionProcessingStatus14Choice, PendingProcessingStatus3Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Processing of the instruction/request is pending.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus22Choice.mmPendingProcessing);
			previousVersion_lazy = () -> InstructionProcessingStatus10Choice.mmPendingProcessing;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingProcessingStatus3Choice.mmObject();
		}

		@Override
		public PendingProcessingStatus3Choice getValue(InstructionProcessingStatus14Choice obj) {
			return obj.getPendingProcessing();
		}

		@Override
		public void setValue(InstructionProcessingStatus14Choice obj, PendingProcessingStatus3Choice value) {
			obj.setPendingProcessing(value);
		}
	};
	@XmlElement(name = "CxlReqd", required = true)
	protected ProprietaryReason1 cancellationRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice
	 * InstructionProcessingStatus14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReqd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request from your counterparty for this transaction is pending waiting for your cancellation request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmCancellationRequested
	 * InstructionProcessingStatus22Choice.mmCancellationRequested}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmCancellationRequested
	 * InstructionProcessingStatus10Choice.mmCancellationRequested}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus14Choice, ProprietaryReason1> mmCancellationRequested = new MMMessageAssociationEnd<InstructionProcessingStatus14Choice, ProprietaryReason1>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			definition = "Cancellation request from your counterparty for this transaction is pending waiting for your cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus22Choice.mmCancellationRequested);
			previousVersion_lazy = () -> InstructionProcessingStatus10Choice.mmCancellationRequested;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}

		@Override
		public ProprietaryReason1 getValue(InstructionProcessingStatus14Choice obj) {
			return obj.getCancellationRequested();
		}

		@Override
		public void setValue(InstructionProcessingStatus14Choice obj, ProprietaryReason1 value) {
			obj.setCancellationRequested(value);
		}
	};
	@XmlElement(name = "AckdAccptd", required = true)
	protected AcknowledgedAcceptedStatus7Choice acknowledgedAccepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgedAcceptedStatus7Choice
	 * AcknowledgedAcceptedStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice
	 * InstructionProcessingStatus14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been acknowledged by the account servicer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus22Choice.mmAcknowledgedAccepted}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmAcknowledgedAccepted
	 * InstructionProcessingStatus10Choice.mmAcknowledgedAccepted}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus14Choice, AcknowledgedAcceptedStatus7Choice> mmAcknowledgedAccepted = new MMMessageAssociationEnd<InstructionProcessingStatus14Choice, AcknowledgedAcceptedStatus7Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			definition = "Instruction has been acknowledged by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus22Choice.mmAcknowledgedAccepted);
			previousVersion_lazy = () -> InstructionProcessingStatus10Choice.mmAcknowledgedAccepted;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcknowledgedAcceptedStatus7Choice.mmObject();
		}

		@Override
		public AcknowledgedAcceptedStatus7Choice getValue(InstructionProcessingStatus14Choice obj) {
			return obj.getAcknowledgedAccepted();
		}

		@Override
		public void setValue(InstructionProcessingStatus14Choice obj, AcknowledgedAcceptedStatus7Choice value) {
			obj.setAcknowledgedAccepted(value);
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancellationStatus7Choice cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus7Choice
	 * CancellationStatus7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice
	 * InstructionProcessingStatus14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been cancelled (only as an response to an SecuritiesTransactionStatusQuery). The status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmCancelled
	 * InstructionProcessingStatus22Choice.mmCancelled}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmCancelled
	 * InstructionProcessingStatus10Choice.mmCancelled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus14Choice, CancellationStatus7Choice> mmCancelled = new MMMessageAssociationEnd<InstructionProcessingStatus14Choice, CancellationStatus7Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Instruction has been cancelled (only as an response to an SecuritiesTransactionStatusQuery). The status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus22Choice.mmCancelled);
			previousVersion_lazy = () -> InstructionProcessingStatus10Choice.mmCancelled;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationStatus7Choice.mmObject();
		}

		@Override
		public CancellationStatus7Choice getValue(InstructionProcessingStatus14Choice obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(InstructionProcessingStatus14Choice obj, CancellationStatus7Choice value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "Gnrtd", required = true)
	protected GeneratedStatus5Choice generated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GeneratedStatus5Choice
	 * GeneratedStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
	 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice
	 * InstructionProcessingStatus14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Gnrtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Generated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The transaction was created by the account servicer or a third party. It was not instructed directly by the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmGenerated
	 * InstructionProcessingStatus22Choice.mmGenerated}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmGenerated
	 * InstructionProcessingStatus10Choice.mmGenerated}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus14Choice, GeneratedStatus5Choice> mmGenerated = new MMMessageAssociationEnd<InstructionProcessingStatus14Choice, GeneratedStatus5Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmGeneratedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmObject();
			isDerived = false;
			xmlTag = "Gnrtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			definition = "The transaction was created by the account servicer or a third party. It was not instructed directly by the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus22Choice.mmGenerated);
			previousVersion_lazy = () -> InstructionProcessingStatus10Choice.mmGenerated;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GeneratedStatus5Choice.mmObject();
		}

		@Override
		public GeneratedStatus5Choice getValue(InstructionProcessingStatus14Choice obj) {
			return obj.getGenerated();
		}

		@Override
		public void setValue(InstructionProcessingStatus14Choice obj, GeneratedStatus5Choice value) {
			obj.setGenerated(value);
		}
	};
	@XmlElement(name = "Rpr", required = true)
	protected RepairStatus5Choice repair;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RepairStatus5Choice
	 * RepairStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice
	 * InstructionProcessingStatus14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction/Request is accepted but in repair."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmRepair
	 * InstructionProcessingStatus22Choice.mmRepair}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmRepair
	 * InstructionProcessingStatus10Choice.mmRepair}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus14Choice, RepairStatus5Choice> mmRepair = new MMMessageAssociationEnd<InstructionProcessingStatus14Choice, RepairStatus5Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmObject();
			isDerived = false;
			xmlTag = "Rpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repair";
			definition = "Instruction/Request is accepted but in repair.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus22Choice.mmRepair);
			previousVersion_lazy = () -> InstructionProcessingStatus10Choice.mmRepair;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepairStatus5Choice.mmObject();
		}

		@Override
		public RepairStatus5Choice getValue(InstructionProcessingStatus14Choice obj) {
			return obj.getRepair();
		}

		@Override
		public void setValue(InstructionProcessingStatus14Choice obj, RepairStatus5Choice value) {
			obj.setRepair(value);
		}
	};
	@XmlElement(name = "PdgCxl", required = true)
	protected PendingStatus13Choice pendingCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus13Choice
	 * PendingStatus13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice
	 * InstructionProcessingStatus14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgCxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A cancellation request from yourself for this instruction is pending waiting for further processing (only as an response to an SecuritiesTransactionStatusQuery). The pending status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmPendingCancellation
	 * InstructionProcessingStatus22Choice.mmPendingCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmPendingCancellation
	 * InstructionProcessingStatus10Choice.mmPendingCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus14Choice, PendingStatus13Choice> mmPendingCancellation = new MMMessageAssociationEnd<InstructionProcessingStatus14Choice, PendingStatus13Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "A cancellation request from yourself for this instruction is pending waiting for further processing (only as an response to an SecuritiesTransactionStatusQuery). The pending status on the processing of a cancellation request must be provided using a SecuritiesTransactionCancellationRequestStatusAdvice.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus22Choice.mmPendingCancellation);
			previousVersion_lazy = () -> InstructionProcessingStatus10Choice.mmPendingCancellation;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingStatus13Choice.mmObject();
		}

		@Override
		public PendingStatus13Choice getValue(InstructionProcessingStatus14Choice obj) {
			return obj.getPendingCancellation();
		}

		@Override
		public void setValue(InstructionProcessingStatus14Choice obj, PendingStatus13Choice value) {
			obj.setPendingCancellation(value);
		}
	};
	@XmlElement(name = "ModReqd", required = true)
	protected ProprietaryReason1 modificationRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus14Choice
	 * InstructionProcessingStatus14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModReqd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification request from your counterparty for this transaction is pending waiting for your cancellation request or your consent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice#mmModificationRequested
	 * InstructionProcessingStatus22Choice.mmModificationRequested}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus10Choice#mmModificationRequested
	 * InstructionProcessingStatus10Choice.mmModificationRequested}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus14Choice, ProprietaryReason1> mmModificationRequested = new MMMessageAssociationEnd<InstructionProcessingStatus14Choice, ProprietaryReason1>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmObject();
			isDerived = false;
			xmlTag = "ModReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequested";
			definition = "Modification request from your counterparty for this transaction is pending waiting for your cancellation request or your consent.";
			nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus22Choice.mmModificationRequested);
			previousVersion_lazy = () -> InstructionProcessingStatus10Choice.mmModificationRequested;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}

		@Override
		public ProprietaryReason1 getValue(InstructionProcessingStatus14Choice obj) {
			return obj.getModificationRequested();
		}

		@Override
		public void setValue(InstructionProcessingStatus14Choice obj, ProprietaryReason1 value) {
			obj.setModificationRequested(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmPendingProcessing,
						com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmCancellationRequested, com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmAcknowledgedAccepted,
						com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmCancelled, com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmGenerated,
						com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmRepair, com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmPendingCancellation,
						com.tools20022.repository.choice.InstructionProcessingStatus14Choice.mmModificationRequested);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionProcessingStatus14Choice";
				definition = "Choice of format for the instruction processing status.";
				nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus22Choice.mmObject());
				previousVersion_lazy = () -> InstructionProcessingStatus10Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PendingProcessingStatus3Choice getPendingProcessing() {
		return pendingProcessing;
	}

	public InstructionProcessingStatus14Choice setPendingProcessing(PendingProcessingStatus3Choice pendingProcessing) {
		this.pendingProcessing = Objects.requireNonNull(pendingProcessing);
		return this;
	}

	public ProprietaryReason1 getCancellationRequested() {
		return cancellationRequested;
	}

	public InstructionProcessingStatus14Choice setCancellationRequested(ProprietaryReason1 cancellationRequested) {
		this.cancellationRequested = Objects.requireNonNull(cancellationRequested);
		return this;
	}

	public AcknowledgedAcceptedStatus7Choice getAcknowledgedAccepted() {
		return acknowledgedAccepted;
	}

	public InstructionProcessingStatus14Choice setAcknowledgedAccepted(AcknowledgedAcceptedStatus7Choice acknowledgedAccepted) {
		this.acknowledgedAccepted = Objects.requireNonNull(acknowledgedAccepted);
		return this;
	}

	public CancellationStatus7Choice getCancelled() {
		return cancelled;
	}

	public InstructionProcessingStatus14Choice setCancelled(CancellationStatus7Choice cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public GeneratedStatus5Choice getGenerated() {
		return generated;
	}

	public InstructionProcessingStatus14Choice setGenerated(GeneratedStatus5Choice generated) {
		this.generated = Objects.requireNonNull(generated);
		return this;
	}

	public RepairStatus5Choice getRepair() {
		return repair;
	}

	public InstructionProcessingStatus14Choice setRepair(RepairStatus5Choice repair) {
		this.repair = Objects.requireNonNull(repair);
		return this;
	}

	public PendingStatus13Choice getPendingCancellation() {
		return pendingCancellation;
	}

	public InstructionProcessingStatus14Choice setPendingCancellation(PendingStatus13Choice pendingCancellation) {
		this.pendingCancellation = Objects.requireNonNull(pendingCancellation);
		return this;
	}

	public ProprietaryReason1 getModificationRequested() {
		return modificationRequested;
	}

	public InstructionProcessingStatus14Choice setModificationRequested(ProprietaryReason1 modificationRequested) {
		this.modificationRequested = Objects.requireNonNull(modificationRequested);
		return this;
	}
}