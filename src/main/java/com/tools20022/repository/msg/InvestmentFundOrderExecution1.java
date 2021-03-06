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
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestmentFundOrderExecution2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reference of an order, deal reference, client reference and master reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#mmMasterReference
 * InvestmentFundOrderExecution1.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#mmAmendmentIndicator
 * InvestmentFundOrderExecution1.mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1#mmOrderReferences
 * InvestmentFundOrderExecution1.mmOrderReferences}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * RedemptionOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * SubscriptionOrderConfirmationCancellationInstructionV01.
 * mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundOrderExecution1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference of an order, deal reference, client reference and master reference."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentFundOrderExecution1", propOrder = {"masterReference", "amendmentIndicator", "orderReferences"})
public class InvestmentFundOrderExecution1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
	 * InvestmentFundOrderExecution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundOrderExecution1, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<InvestmentFundOrderExecution1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundOrderExecution1.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentFundOrderExecution1 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution1 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "AmdmntInd", required = true)
	protected YesNoIndicator amendmentIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
	 * InvestmentFundOrderExecution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundOrderExecution1, YesNoIndicator> mmAmendmentIndicator = new MMMessageAttribute<InvestmentFundOrderExecution1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundOrderExecution1.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InvestmentFundOrderExecution1 obj) {
			return obj.getAmendmentIndicator();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution1 obj, YesNoIndicator value) {
			obj.setAmendmentIndicator(value);
		}
	};
	@XmlElement(name = "OrdrRefs", required = true)
	protected List<InvestmentFundOrderExecution2> orderReferences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution2
	 * InvestmentFundOrderExecution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
	 * InvestmentFundOrderExecution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRefs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of an order, client or deal reference."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentFundOrderExecution1, List<InvestmentFundOrderExecution2>> mmOrderReferences = new MMMessageAssociationEnd<InvestmentFundOrderExecution1, List<InvestmentFundOrderExecution2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundOrderExecution1.mmObject();
			isDerived = false;
			xmlTag = "OrdrRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReferences";
			definition = "Reference of an order, client or deal reference.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentFundOrderExecution2.mmObject();
		}

		@Override
		public List<InvestmentFundOrderExecution2> getValue(InvestmentFundOrderExecution1 obj) {
			return obj.getOrderReferences();
		}

		@Override
		public void setValue(InvestmentFundOrderExecution1 obj, List<InvestmentFundOrderExecution2> value) {
			obj.setOrderReferences(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundOrderExecution1.mmMasterReference, com.tools20022.repository.msg.InvestmentFundOrderExecution1.mmAmendmentIndicator,
						com.tools20022.repository.msg.InvestmentFundOrderExecution1.mmOrderReferences);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionBulkOrderConfirmationCancellationInstructionV01.mmCancellationByReference, RedemptionOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
						SubscriptionBulkOrderConfirmationCancellationInstructionV01.mmCancellationByReference, SubscriptionOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
						SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByReference);
				trace_lazy = () -> InvestmentFundOrderExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundOrderExecution1";
				definition = "Reference of an order, deal reference, client reference and master reference.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public InvestmentFundOrderExecution1 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public YesNoIndicator getAmendmentIndicator() {
		return amendmentIndicator;
	}

	public InvestmentFundOrderExecution1 setAmendmentIndicator(YesNoIndicator amendmentIndicator) {
		this.amendmentIndicator = Objects.requireNonNull(amendmentIndicator);
		return this;
	}

	public List<InvestmentFundOrderExecution2> getOrderReferences() {
		return orderReferences == null ? orderReferences = new ArrayList<>() : orderReferences;
	}

	public InvestmentFundOrderExecution1 setOrderReferences(List<InvestmentFundOrderExecution2> orderReferences) {
		this.orderReferences = Objects.requireNonNull(orderReferences);
		return this;
	}
}