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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdvice002V08;
import com.tools20022.repository.choice.CancelledStatus14Choice;
import com.tools20022.repository.choice.PendingCancellationStatus8Choice;
import com.tools20022.repository.choice.RejectedStatus20Choice;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NoSpecifiedReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between different instruction cancellation request statuses.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmCancellationCompleted
 * InstructionCancellationRequestStatus12Choice.mmCancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmAccepted
 * InstructionCancellationRequestStatus12Choice.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmRejected
 * InstructionCancellationRequestStatus12Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmPendingCancellation
 * InstructionCancellationRequestStatus12Choice.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice#mmProprietaryStatus
 * InstructionCancellationRequestStatus12Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdvice002V08#mmInstructionCancellationRequestStatus
 * CorporateActionInstructionCancellationRequestStatusAdvice002V08.
 * mmInstructionCancellationRequestStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionCancellationRequestStatus12Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between different instruction cancellation request statuses."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionCancellationRequestStatus12Choice", propOrder = {"cancellationCompleted", "accepted", "rejected", "pendingCancellation", "proprietaryStatus"})
public class InstructionCancellationRequestStatus12Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlCmpltd", required = true)
	protected CancelledStatus14Choice cancellationCompleted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus14Choice
	 * CancelledStatus14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice
	 * InstructionCancellationRequestStatus12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlCmpltd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a instruction cancellation request completed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//CAND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, CancelledStatus14Choice> mmCancellationCompleted = new MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, CancelledStatus14Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlCmpltd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			definition = "Provides status information related to a instruction cancellation request completed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatus14Choice.mmObject();
		}

		@Override
		public CancelledStatus14Choice getValue(InstructionCancellationRequestStatus12Choice obj) {
			return obj.getCancellationCompleted();
		}

		@Override
		public void setValue(InstructionCancellationRequestStatus12Choice obj, CancelledStatus14Choice value) {
			obj.setCancellationCompleted(value);
		}
	};
	@XmlElement(name = "Accptd", required = true)
	protected NoSpecifiedReason1 accepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
	 * NoSpecifiedReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmAcceptedReason
	 * CorporateActionStatusReason.mmAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice
	 * InstructionCancellationRequestStatus12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a cancellation request accepted for further processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//PACK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, NoSpecifiedReason1> mmAccepted = new MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, NoSpecifiedReason1>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmObject();
			isDerived = false;
			xmlTag = "Accptd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Provides status information related to a cancellation request accepted for further processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}

		@Override
		public NoSpecifiedReason1 getValue(InstructionCancellationRequestStatus12Choice obj) {
			return obj.getAccepted();
		}

		@Override
		public void setValue(InstructionCancellationRequestStatus12Choice obj, NoSpecifiedReason1 value) {
			obj.setAccepted(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus20Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus20Choice
	 * RejectedStatus20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice
	 * InstructionCancellationRequestStatus12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a cancellation request rejected for further processing due to system (data) reasons."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//REJT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, RejectedStatus20Choice> mmRejected = new MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, RejectedStatus20Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//REJT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Provides status information related to a cancellation request rejected for further processing due to system (data) reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus20Choice.mmObject();
		}

		@Override
		public RejectedStatus20Choice getValue(InstructionCancellationRequestStatus12Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(InstructionCancellationRequestStatus12Choice obj, RejectedStatus20Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "PdgCxl", required = true)
	protected PendingCancellationStatus8Choice pendingCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationStatus8Choice
	 * PendingCancellationStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice
	 * InstructionCancellationRequestStatus12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgCxl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a pending cancellation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC//CANP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, PendingCancellationStatus8Choice> mmPendingCancellation = new MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, PendingCancellationStatus8Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxl";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC//CANP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Provides status information related to a pending cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingCancellationStatus8Choice.mmObject();
		}

		@Override
		public PendingCancellationStatus8Choice getValue(InstructionCancellationRequestStatus12Choice obj) {
			return obj.getPendingCancellation();
		}

		@Override
		public void setValue(InstructionCancellationRequestStatus12Choice obj, PendingCancellationStatus8Choice value) {
			obj.setPendingCancellation(value);
		}
	};
	@XmlElement(name = "PrtrySts", required = true)
	protected ProprietaryStatusAndReason7 proprietaryStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7
	 * ProprietaryStatusAndReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice
	 * InstructionCancellationRequestStatus12Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary status related to an instruction cancellation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::CPRC/[8c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, ProprietaryStatusAndReason7> mmProprietaryStatus = new MMMessageAssociationEnd<InstructionCancellationRequestStatus12Choice, ProprietaryStatusAndReason7>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::CPRC/[8c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Proprietary status related to an instruction cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason7.mmObject();
		}

		@Override
		public ProprietaryStatusAndReason7 getValue(InstructionCancellationRequestStatus12Choice obj) {
			return obj.getProprietaryStatus();
		}

		@Override
		public void setValue(InstructionCancellationRequestStatus12Choice obj, ProprietaryStatusAndReason7 value) {
			obj.setProprietaryStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmCancellationCompleted,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmAccepted, com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmRejected,
						com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmPendingCancellation, com.tools20022.repository.choice.InstructionCancellationRequestStatus12Choice.mmProprietaryStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionCancellationRequestStatusAdvice002V08.mmInstructionCancellationRequestStatus);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionCancellationRequestStatus12Choice";
				definition = "Choice between different instruction cancellation request statuses.";
			}
		});
		return mmObject_lazy.get();
	}

	public CancelledStatus14Choice getCancellationCompleted() {
		return cancellationCompleted;
	}

	public InstructionCancellationRequestStatus12Choice setCancellationCompleted(CancelledStatus14Choice cancellationCompleted) {
		this.cancellationCompleted = Objects.requireNonNull(cancellationCompleted);
		return this;
	}

	public NoSpecifiedReason1 getAccepted() {
		return accepted;
	}

	public InstructionCancellationRequestStatus12Choice setAccepted(NoSpecifiedReason1 accepted) {
		this.accepted = Objects.requireNonNull(accepted);
		return this;
	}

	public RejectedStatus20Choice getRejected() {
		return rejected;
	}

	public InstructionCancellationRequestStatus12Choice setRejected(RejectedStatus20Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public PendingCancellationStatus8Choice getPendingCancellation() {
		return pendingCancellation;
	}

	public InstructionCancellationRequestStatus12Choice setPendingCancellation(PendingCancellationStatus8Choice pendingCancellation) {
		this.pendingCancellation = Objects.requireNonNull(pendingCancellation);
		return this;
	}

	public ProprietaryStatusAndReason7 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public InstructionCancellationRequestStatus12Choice setProprietaryStatus(ProprietaryStatusAndReason7 proprietaryStatus) {
		this.proprietaryStatus = Objects.requireNonNull(proprietaryStatus);
		return this;
	}
}