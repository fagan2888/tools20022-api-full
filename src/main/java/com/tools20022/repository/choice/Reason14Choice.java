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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRepoCallAcknowledgementReason
 * Reason14Choice.mmRepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmCancellationReason
 * Reason14Choice.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingCancellationReason
 * Reason14Choice.mmPendingCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmGeneratedReason
 * Reason14Choice.mmGeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmDeniedReason
 * Reason14Choice.mmDeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmAcknowledgedAcceptedReason
 * Reason14Choice.mmAcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingReason
 * Reason14Choice.mmPendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmFailingReason
 * Reason14Choice.mmFailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingProcessingReason
 * Reason14Choice.mmPendingProcessingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRejectionReason
 * Reason14Choice.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmRepairReason
 * Reason14Choice.mmRepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmPendingModificationReason
 * Reason14Choice.mmPendingModificationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason14Choice#mmUnmatchedReason
 * Reason14Choice.mmUnmatchedReason}</li>
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
 * "Reason14Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reason."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonRule#forReason14Choice
 * ConstraintReasonRule.forReason14Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Reason16Choice
 * Reason16Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Reason12Choice Reason12Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Reason14Choice", propOrder = {"repoCallAcknowledgementReason", "cancellationReason", "pendingCancellationReason", "generatedReason", "deniedReason", "acknowledgedAcceptedReason", "pendingReason", "failingReason",
		"pendingProcessingReason", "rejectionReason", "repairReason", "pendingModificationReason", "unmatchedReason"})
public class Reason14Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RepoCallAckRsn")
	protected AcknowledgementReason3Choice repoCallAcknowledgementReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason3Choice
	 * AcknowledgementReason3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepoCallAcknowledgementReason
	 * SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RepoCallAckRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallAcknowledgementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information on the repurchase agreement call request acknowledgement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRepoCallAcknowledgementReason
	 * Reason16Choice.mmRepoCallAcknowledgementReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRepoCallAcknowledgementReason
	 * Reason12Choice.mmRepoCallAcknowledgementReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<AcknowledgementReason3Choice>> mmRepoCallAcknowledgementReason = new MMMessageAssociationEnd<Reason14Choice, Optional<AcknowledgementReason3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "RepoCallAckRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information on the repurchase agreement call request acknowledgement.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmRepoCallAcknowledgementReason);
			previousVersion_lazy = () -> Reason12Choice.mmRepoCallAcknowledgementReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AcknowledgementReason3Choice.mmObject();
		}

		@Override
		public Optional<AcknowledgementReason3Choice> getValue(Reason14Choice obj) {
			return obj.getRepoCallAcknowledgementReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<AcknowledgementReason3Choice> value) {
			obj.setRepoCallAcknowledgementReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRsn")
	protected CancellationReason9Choice cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationReason9Choice
	 * CancellationReason9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmCancellationReason
	 * Reason16Choice.mmCancellationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmCancellationReason
	 * Reason12Choice.mmCancellationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<CancellationReason9Choice>> mmCancellationReason = new MMMessageAssociationEnd<Reason14Choice, Optional<CancellationReason9Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmCancellationReason);
			previousVersion_lazy = () -> Reason12Choice.mmCancellationReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CancellationReason9Choice.mmObject();
		}

		@Override
		public Optional<CancellationReason9Choice> getValue(Reason14Choice obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<CancellationReason9Choice> value) {
			obj.setCancellationReason(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgCxlRsn")
	protected PendingCancellationReasons2Choice pendingCancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons2Choice
	 * PendingCancellationReasons2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgCxlRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the cancellation request is pending."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingCancellationReason
	 * Reason16Choice.mmPendingCancellationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingCancellationReason
	 * Reason12Choice.mmPendingCancellationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<PendingCancellationReasons2Choice>> mmPendingCancellationReason = new MMMessageAssociationEnd<Reason14Choice, Optional<PendingCancellationReasons2Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellationReason";
			definition = "Specifies the reason why the cancellation request is pending.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmPendingCancellationReason);
			previousVersion_lazy = () -> Reason12Choice.mmPendingCancellationReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingCancellationReasons2Choice.mmObject();
		}

		@Override
		public Optional<PendingCancellationReasons2Choice> getValue(Reason14Choice obj) {
			return obj.getPendingCancellationReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<PendingCancellationReasons2Choice> value) {
			obj.setPendingCancellationReason(value.orElse(null));
		}
	};
	@XmlElement(name = "GnrtdRsn")
	protected GeneratedReasons3Choice generatedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons3Choice
	 * GeneratedReasons3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
	 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnrtdRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneratedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the transaction was generated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmGeneratedReason
	 * Reason16Choice.mmGeneratedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmGeneratedReason
	 * Reason12Choice.mmGeneratedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<GeneratedReasons3Choice>> mmGeneratedReason = new MMMessageAssociationEnd<Reason14Choice, Optional<GeneratedReasons3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmGeneratedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "GnrtdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmGeneratedReason);
			previousVersion_lazy = () -> Reason12Choice.mmGeneratedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GeneratedReasons3Choice.mmObject();
		}

		@Override
		public Optional<GeneratedReasons3Choice> getValue(Reason14Choice obj) {
			return obj.getGeneratedReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<GeneratedReasons3Choice> value) {
			obj.setGeneratedReason(value.orElse(null));
		}
	};
	@XmlElement(name = "DndRsn")
	protected DeniedReason8Choice deniedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DeniedReason8Choice
	 * DeniedReason8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
	 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DndRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the request was denied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmDeniedReason
	 * Reason16Choice.mmDeniedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmDeniedReason
	 * Reason12Choice.mmDeniedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<DeniedReason8Choice>> mmDeniedReason = new MMMessageAssociationEnd<Reason14Choice, Optional<DeniedReason8Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmDeniedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "DndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmDeniedReason);
			previousVersion_lazy = () -> Reason12Choice.mmDeniedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeniedReason8Choice.mmObject();
		}

		@Override
		public Optional<DeniedReason8Choice> getValue(Reason14Choice obj) {
			return obj.getDeniedReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<DeniedReason8Choice> value) {
			obj.setDeniedReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AckdAccptdRsn")
	protected AcknowledgementReason4Choice acknowledgedAcceptedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason4Choice
	 * AcknowledgementReason4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptdRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAcceptedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmAcknowledgedAcceptedReason
	 * Reason16Choice.mmAcknowledgedAcceptedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmAcknowledgedAcceptedReason
	 * Reason12Choice.mmAcknowledgedAcceptedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<AcknowledgementReason4Choice>> mmAcknowledgedAcceptedReason = new MMMessageAssociationEnd<Reason14Choice, Optional<AcknowledgementReason4Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmAcknowledgedAcceptedReason);
			previousVersion_lazy = () -> Reason12Choice.mmAcknowledgedAcceptedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AcknowledgementReason4Choice.mmObject();
		}

		@Override
		public Optional<AcknowledgementReason4Choice> getValue(Reason14Choice obj) {
			return obj.getAcknowledgedAcceptedReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<AcknowledgementReason4Choice> value) {
			obj.setAcknowledgedAcceptedReason(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgRsn")
	protected PendingReason11Choice pendingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingReason11Choice
	 * PendingReason11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a pending status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingReason
	 * Reason16Choice.mmPendingReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingReason
	 * Reason12Choice.mmPendingReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<PendingReason11Choice>> mmPendingReason = new MMMessageAssociationEnd<Reason14Choice, Optional<PendingReason11Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction has a pending status.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmPendingReason);
			previousVersion_lazy = () -> Reason12Choice.mmPendingReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingReason11Choice.mmObject();
		}

		@Override
		public Optional<PendingReason11Choice> getValue(Reason14Choice obj) {
			return obj.getPendingReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<PendingReason11Choice> value) {
			obj.setPendingReason(value.orElse(null));
		}
	};
	@XmlElement(name = "FlngRsn")
	protected FailingReason1Choice failingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FailingReason1Choice
	 * FailingReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmFailingReason
	 * StatusReason.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlngRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a failing settlement status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmFailingReason
	 * Reason16Choice.mmFailingReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmFailingReason
	 * Reason12Choice.mmFailingReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<FailingReason1Choice>> mmFailingReason = new MMMessageAssociationEnd<Reason14Choice, Optional<FailingReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmFailingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "FlngRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailingReason";
			definition = "Specifies the reason why the instruction has a failing settlement status.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmFailingReason);
			previousVersion_lazy = () -> Reason12Choice.mmFailingReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FailingReason1Choice.mmObject();
		}

		@Override
		public Optional<FailingReason1Choice> getValue(Reason14Choice obj) {
			return obj.getFailingReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<FailingReason1Choice> value) {
			obj.setFailingReason(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgPrcgRsn")
	protected PendingProcessingReason1Choice pendingProcessingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason1Choice
	 * PendingProcessingReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcgRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a pending processing status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingProcessingReason
	 * Reason16Choice.mmPendingProcessingReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingProcessingReason
	 * Reason12Choice.mmPendingProcessingReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<PendingProcessingReason1Choice>> mmPendingProcessingReason = new MMMessageAssociationEnd<Reason14Choice, Optional<PendingProcessingReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessingReason";
			definition = "Specifies the reason why the instruction has a pending processing status.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmPendingProcessingReason);
			previousVersion_lazy = () -> Reason12Choice.mmPendingProcessingReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingProcessingReason1Choice.mmObject();
		}

		@Override
		public Optional<PendingProcessingReason1Choice> getValue(Reason14Choice obj) {
			return obj.getPendingProcessingReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<PendingProcessingReason1Choice> value) {
			obj.setPendingProcessingReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctnRsn")
	protected RejectionReason16Choice rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason16Choice
	 * RejectionReason16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a rejected status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRejectionReason
	 * Reason16Choice.mmRejectionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRejectionReason
	 * Reason12Choice.mmRejectionReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<RejectionReason16Choice>> mmRejectionReason = new MMMessageAssociationEnd<Reason14Choice, Optional<RejectionReason16Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a rejected status.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmRejectionReason);
			previousVersion_lazy = () -> Reason12Choice.mmRejectionReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RejectionReason16Choice.mmObject();
		}

		@Override
		public Optional<RejectionReason16Choice> getValue(Reason14Choice obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<RejectionReason16Choice> value) {
			obj.setRejectionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RprRsn")
	protected RepairReason7Choice repairReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RepairReason7Choice
	 * RepairReason7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the instruction is in repair."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmRepairReason
	 * Reason16Choice.mmRepairReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmRepairReason
	 * Reason12Choice.mmRepairReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<RepairReason7Choice>> mmRepairReason = new MMMessageAssociationEnd<Reason14Choice, Optional<RepairReason7Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "RprRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction is in repair.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmRepairReason);
			previousVersion_lazy = () -> Reason12Choice.mmRepairReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RepairReason7Choice.mmObject();
		}

		@Override
		public Optional<RepairReason7Choice> getValue(Reason14Choice obj) {
			return obj.getRepairReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<RepairReason7Choice> value) {
			obj.setRepairReason(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgModRsn")
	protected PendingReason2Choice pendingModificationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingReason2Choice
	 * PendingReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgModRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingModificationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the modification request is pending."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmPendingModificationReason
	 * Reason16Choice.mmPendingModificationReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmPendingModificationReason
	 * Reason12Choice.mmPendingModificationReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<PendingReason2Choice>> mmPendingModificationReason = new MMMessageAssociationEnd<Reason14Choice, Optional<PendingReason2Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgModRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingModificationReason";
			definition = "Specifies the reason why the modification request is pending.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmPendingModificationReason);
			previousVersion_lazy = () -> Reason12Choice.mmPendingModificationReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingReason2Choice.mmObject();
		}

		@Override
		public Optional<PendingReason2Choice> getValue(Reason14Choice obj) {
			return obj.getPendingModificationReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<PendingReason2Choice> value) {
			obj.setPendingModificationReason(value.orElse(null));
		}
	};
	@XmlElement(name = "UmtchdRsn")
	protected UnmatchedReason16Choice unmatchedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason16Choice
	 * UnmatchedReason16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmUnmatchedReason
	 * SecuritiesTradeStatusReason.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason14Choice
	 * Reason14Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UmtchdRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has an unmatched status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Reason16Choice#mmUnmatchedReason
	 * Reason16Choice.mmUnmatchedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Reason12Choice#mmUnmatchedReason
	 * Reason12Choice.mmUnmatchedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Reason14Choice, Optional<UnmatchedReason16Choice>> mmUnmatchedReason = new MMMessageAssociationEnd<Reason14Choice, Optional<UnmatchedReason16Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmUnmatchedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason14Choice.mmObject();
			isDerived = false;
			xmlTag = "UmtchdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedReason";
			definition = "Specifies the reason why the instruction has an unmatched status.";
			nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmUnmatchedReason);
			previousVersion_lazy = () -> Reason12Choice.mmUnmatchedReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnmatchedReason16Choice.mmObject();
		}

		@Override
		public Optional<UnmatchedReason16Choice> getValue(Reason14Choice obj) {
			return obj.getUnmatchedReason();
		}

		@Override
		public void setValue(Reason14Choice obj, Optional<UnmatchedReason16Choice> value) {
			obj.setUnmatchedReason(value.orElse(null));
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reason14Choice.mmRepoCallAcknowledgementReason, com.tools20022.repository.choice.Reason14Choice.mmCancellationReason,
						com.tools20022.repository.choice.Reason14Choice.mmPendingCancellationReason, com.tools20022.repository.choice.Reason14Choice.mmGeneratedReason, com.tools20022.repository.choice.Reason14Choice.mmDeniedReason,
						com.tools20022.repository.choice.Reason14Choice.mmAcknowledgedAcceptedReason, com.tools20022.repository.choice.Reason14Choice.mmPendingReason, com.tools20022.repository.choice.Reason14Choice.mmFailingReason,
						com.tools20022.repository.choice.Reason14Choice.mmPendingProcessingReason, com.tools20022.repository.choice.Reason14Choice.mmRejectionReason, com.tools20022.repository.choice.Reason14Choice.mmRepairReason,
						com.tools20022.repository.choice.Reason14Choice.mmPendingModificationReason, com.tools20022.repository.choice.Reason14Choice.mmUnmatchedReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReasonRule.forReason14Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reason14Choice";
				definition = "Choice of reason.";
				nextVersions_lazy = () -> Arrays.asList(Reason16Choice.mmObject());
				previousVersion_lazy = () -> Reason12Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AcknowledgementReason3Choice> getRepoCallAcknowledgementReason() {
		return repoCallAcknowledgementReason == null ? Optional.empty() : Optional.of(repoCallAcknowledgementReason);
	}

	public Reason14Choice setRepoCallAcknowledgementReason(AcknowledgementReason3Choice repoCallAcknowledgementReason) {
		this.repoCallAcknowledgementReason = repoCallAcknowledgementReason;
		return this;
	}

	public Optional<CancellationReason9Choice> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public Reason14Choice setCancellationReason(CancellationReason9Choice cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}

	public Optional<PendingCancellationReasons2Choice> getPendingCancellationReason() {
		return pendingCancellationReason == null ? Optional.empty() : Optional.of(pendingCancellationReason);
	}

	public Reason14Choice setPendingCancellationReason(PendingCancellationReasons2Choice pendingCancellationReason) {
		this.pendingCancellationReason = pendingCancellationReason;
		return this;
	}

	public Optional<GeneratedReasons3Choice> getGeneratedReason() {
		return generatedReason == null ? Optional.empty() : Optional.of(generatedReason);
	}

	public Reason14Choice setGeneratedReason(GeneratedReasons3Choice generatedReason) {
		this.generatedReason = generatedReason;
		return this;
	}

	public Optional<DeniedReason8Choice> getDeniedReason() {
		return deniedReason == null ? Optional.empty() : Optional.of(deniedReason);
	}

	public Reason14Choice setDeniedReason(DeniedReason8Choice deniedReason) {
		this.deniedReason = deniedReason;
		return this;
	}

	public Optional<AcknowledgementReason4Choice> getAcknowledgedAcceptedReason() {
		return acknowledgedAcceptedReason == null ? Optional.empty() : Optional.of(acknowledgedAcceptedReason);
	}

	public Reason14Choice setAcknowledgedAcceptedReason(AcknowledgementReason4Choice acknowledgedAcceptedReason) {
		this.acknowledgedAcceptedReason = acknowledgedAcceptedReason;
		return this;
	}

	public Optional<PendingReason11Choice> getPendingReason() {
		return pendingReason == null ? Optional.empty() : Optional.of(pendingReason);
	}

	public Reason14Choice setPendingReason(PendingReason11Choice pendingReason) {
		this.pendingReason = pendingReason;
		return this;
	}

	public Optional<FailingReason1Choice> getFailingReason() {
		return failingReason == null ? Optional.empty() : Optional.of(failingReason);
	}

	public Reason14Choice setFailingReason(FailingReason1Choice failingReason) {
		this.failingReason = failingReason;
		return this;
	}

	public Optional<PendingProcessingReason1Choice> getPendingProcessingReason() {
		return pendingProcessingReason == null ? Optional.empty() : Optional.of(pendingProcessingReason);
	}

	public Reason14Choice setPendingProcessingReason(PendingProcessingReason1Choice pendingProcessingReason) {
		this.pendingProcessingReason = pendingProcessingReason;
		return this;
	}

	public Optional<RejectionReason16Choice> getRejectionReason() {
		return rejectionReason == null ? Optional.empty() : Optional.of(rejectionReason);
	}

	public Reason14Choice setRejectionReason(RejectionReason16Choice rejectionReason) {
		this.rejectionReason = rejectionReason;
		return this;
	}

	public Optional<RepairReason7Choice> getRepairReason() {
		return repairReason == null ? Optional.empty() : Optional.of(repairReason);
	}

	public Reason14Choice setRepairReason(RepairReason7Choice repairReason) {
		this.repairReason = repairReason;
		return this;
	}

	public Optional<PendingReason2Choice> getPendingModificationReason() {
		return pendingModificationReason == null ? Optional.empty() : Optional.of(pendingModificationReason);
	}

	public Reason14Choice setPendingModificationReason(PendingReason2Choice pendingModificationReason) {
		this.pendingModificationReason = pendingModificationReason;
		return this;
	}

	public Optional<UnmatchedReason16Choice> getUnmatchedReason() {
		return unmatchedReason == null ? Optional.empty() : Optional.of(unmatchedReason);
	}

	public Reason14Choice setUnmatchedReason(UnmatchedReason16Choice unmatchedReason) {
		this.unmatchedReason = unmatchedReason;
		return this;
	}
}