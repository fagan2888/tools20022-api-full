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
import com.tools20022.repository.area.sese.TransferOutInstruction;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DeliveryParameters2;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1#mmSettlementPartiesDetails
 * ReceiveInformation1.mmSettlementPartiesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1#mmPhysicalTransferIndicator
 * ReceiveInformation1.mmPhysicalTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1#mmPhysicalTransferDetails
 * ReceiveInformation1.mmPhysicalTransferDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstruction#mmSettlementDetails
 * TransferOutInstruction.mmSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReceiveInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation1
 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation1
 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation1
 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReceiveInformation1", propOrder = {"settlementPartiesDetails", "physicalTransferIndicator", "physicalTransferDetails"})
public class ReceiveInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmPtiesDtls", required = true)
	protected ReceivingPartiesAndAccount1 settlementPartiesDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
	 * ReceivingPartiesAndAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1
	 * ReceiveInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPtiesDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartiesDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceiveInformation1, ReceivingPartiesAndAccount1> mmSettlementPartiesDetails = new MMMessageAssociationEnd<ReceiveInformation1, ReceivingPartiesAndAccount1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation1.mmObject();
			isDerived = false;
			xmlTag = "SttlmPtiesDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPartiesDetails";
			definition = "Chain of parties involved in the settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReceivingPartiesAndAccount1.mmObject();
		}

		@Override
		public ReceivingPartiesAndAccount1 getValue(ReceiveInformation1 obj) {
			return obj.getSettlementPartiesDetails();
		}

		@Override
		public void setValue(ReceiveInformation1 obj, ReceivingPartiesAndAccount1 value) {
			obj.setSettlementPartiesDetails(value);
		}
	};
	@XmlElement(name = "PhysTrfInd", required = true)
	protected YesNoIndicator physicalTransferIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1
	 * ReceiveInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysTrfInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReceiveInformation1, YesNoIndicator> mmPhysicalTransferIndicator = new MMMessageAttribute<ReceiveInformation1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation1.mmObject();
			isDerived = false;
			xmlTag = "PhysTrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ReceiveInformation1 obj) {
			return obj.getPhysicalTransferIndicator();
		}

		@Override
		public void setValue(ReceiveInformation1 obj, YesNoIndicator value) {
			obj.setPhysicalTransferIndicator(value);
		}
	};
	@XmlElement(name = "PhysTrfDtls")
	protected DeliveryParameters2 physicalTransferDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DeliveryParameters2
	 * DeliveryParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1
	 * ReceiveInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysTrfDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters of a physical delivery."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceiveInformation1, Optional<DeliveryParameters2>> mmPhysicalTransferDetails = new MMMessageAssociationEnd<ReceiveInformation1, Optional<DeliveryParameters2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceiveInformation1.mmObject();
			isDerived = false;
			xmlTag = "PhysTrfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetails";
			definition = "Parameters of a physical delivery.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveryParameters2.mmObject();
		}

		@Override
		public Optional<DeliveryParameters2> getValue(ReceiveInformation1 obj) {
			return obj.getPhysicalTransferDetails();
		}

		@Override
		public void setValue(ReceiveInformation1 obj, Optional<DeliveryParameters2> value) {
			obj.setPhysicalTransferDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceiveInformation1.mmSettlementPartiesDetails, com.tools20022.repository.msg.ReceiveInformation1.mmPhysicalTransferIndicator,
						com.tools20022.repository.msg.ReceiveInformation1.mmPhysicalTransferDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferOutInstruction.mmSettlementDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation1,
						com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation1, com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceiveInformation1";
				definition = "Parameters applied to the settlement of a security transfer.";
			}
		});
		return mmObject_lazy.get();
	}

	public ReceivingPartiesAndAccount1 getSettlementPartiesDetails() {
		return settlementPartiesDetails;
	}

	public ReceiveInformation1 setSettlementPartiesDetails(ReceivingPartiesAndAccount1 settlementPartiesDetails) {
		this.settlementPartiesDetails = Objects.requireNonNull(settlementPartiesDetails);
		return this;
	}

	public YesNoIndicator getPhysicalTransferIndicator() {
		return physicalTransferIndicator;
	}

	public ReceiveInformation1 setPhysicalTransferIndicator(YesNoIndicator physicalTransferIndicator) {
		this.physicalTransferIndicator = Objects.requireNonNull(physicalTransferIndicator);
		return this;
	}

	public Optional<DeliveryParameters2> getPhysicalTransferDetails() {
		return physicalTransferDetails == null ? Optional.empty() : Optional.of(physicalTransferDetails);
	}

	public ReceiveInformation1 setPhysicalTransferDetails(DeliveryParameters2 physicalTransferDetails) {
		this.physicalTransferDetails = physicalTransferDetails;
		return this;
	}
}