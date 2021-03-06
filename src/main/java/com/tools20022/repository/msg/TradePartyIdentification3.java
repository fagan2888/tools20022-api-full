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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.trea.*;
import com.tools20022.repository.choice.PartyIdentification8Choice;
import com.tools20022.repository.entity.SubmittingPartyRole;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.entity.TreasuryTradingParty;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FundIdentification2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3#mmFundInformation
 * TradePartyIdentification3.mmFundInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3#mmSubmittingParty
 * TradePartyIdentification3.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3#mmTradeParty
 * TradePartyIdentification3.mmTradeParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmTradingSideIdentification
 * CreateNonDeliverableForwardOpeningV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmCounterpartySideIdentification
 * CreateNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardOpeningV02#mmTradingSideIdentification
 * AmendNonDeliverableForwardOpeningV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardOpeningV02#mmCounterpartySideIdentification
 * AmendNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmTradingSideIdentification
 * CancelNonDeliverableForwardOpeningV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmCounterpartySideIdentification
 * CancelNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmTradingSideIdentification
 * CreateNonDeliverableForwardValuationV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmCounterpartySideIdentification
 * CreateNonDeliverableForwardValuationV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardValuationV02#mmTradingSideIdentification
 * AmendNonDeliverableForwardValuationV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardValuationV02#mmCounterpartySideIdentification
 * AmendNonDeliverableForwardValuationV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardValuationV02#mmTradingSideIdentification
 * CancelNonDeliverableForwardValuationV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardValuationV02#mmCounterpartySideIdentification
 * CancelNonDeliverableForwardValuationV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmTradingSideIdentification
 * NonDeliverableForwardNotificationV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmCounterpartySideIdentification
 * NonDeliverableForwardNotificationV02.mmCounterpartySideIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradePartyIdentification3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradePartyIdentification3", propOrder = {"fundInformation", "submittingParty", "tradeParty"})
public class TradePartyIdentification3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FndInf")
	protected FundIdentification2 fundInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundIdentification2
	 * FundIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#mmInvestmentFund
	 * TreasuryTradingParty.mmInvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3
	 * TradePartyIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the fund which is one of the parties in a treasury trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePartyIdentification3, Optional<FundIdentification2>> mmFundInformation = new MMMessageAssociationEnd<TradePartyIdentification3, Optional<FundIdentification2>>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradingParty.mmInvestmentFund;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification3.mmObject();
			isDerived = false;
			xmlTag = "FndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundInformation";
			definition = "Identifies the fund which is one of the parties in a treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundIdentification2.mmObject();
		}

		@Override
		public Optional<FundIdentification2> getValue(TradePartyIdentification3 obj) {
			return obj.getFundInformation();
		}

		@Override
		public void setValue(TradePartyIdentification3 obj, Optional<FundIdentification2> value) {
			obj.setFundInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SubmitgPty", required = true)
	protected PartyIdentification8Choice submittingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice
	 * PartyIdentification8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubmittingPartyRole
	 * SubmittingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3
	 * TradePartyIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitgPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party which submits a treasury trade to a matching system or to a settlement system or to a counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePartyIdentification3, PartyIdentification8Choice> mmSubmittingParty = new MMMessageAssociationEnd<TradePartyIdentification3, PartyIdentification8Choice>() {
		{
			businessComponentTrace_lazy = () -> SubmittingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification3.mmObject();
			isDerived = false;
			xmlTag = "SubmitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingParty";
			definition = "Specifies the party which submits a treasury trade to a matching system or to a settlement system or to a counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification8Choice.mmObject();
		}

		@Override
		public PartyIdentification8Choice getValue(TradePartyIdentification3 obj) {
			return obj.getSubmittingParty();
		}

		@Override
		public void setValue(TradePartyIdentification3 obj, PartyIdentification8Choice value) {
			obj.setSubmittingParty(value);
		}
	};
	@XmlElement(name = "TradPty", required = true)
	protected PartyIdentification8Choice tradeParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice
	 * PartyIdentification8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty
	 * TreasuryTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3
	 * TradePartyIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party which originated a treasury trade. This party may be the same as the submitting party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePartyIdentification3, PartyIdentification8Choice> mmTradeParty = new MMMessageAssociationEnd<TradePartyIdentification3, PartyIdentification8Choice>() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradingParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification3.mmObject();
			isDerived = false;
			xmlTag = "TradPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeParty";
			definition = "Specifies the party which originated a treasury trade. This party may be the same as the submitting party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification8Choice.mmObject();
		}

		@Override
		public PartyIdentification8Choice getValue(TradePartyIdentification3 obj) {
			return obj.getTradeParty();
		}

		@Override
		public void setValue(TradePartyIdentification3 obj, PartyIdentification8Choice value) {
			obj.setTradeParty(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradePartyIdentification3.mmFundInformation, com.tools20022.repository.msg.TradePartyIdentification3.mmSubmittingParty,
						com.tools20022.repository.msg.TradePartyIdentification3.mmTradeParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(CreateNonDeliverableForwardOpeningV02.mmTradingSideIdentification, CreateNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification,
						AmendNonDeliverableForwardOpeningV02.mmTradingSideIdentification, AmendNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification, CancelNonDeliverableForwardOpeningV02.mmTradingSideIdentification,
						CancelNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification, CreateNonDeliverableForwardValuationV02.mmTradingSideIdentification, CreateNonDeliverableForwardValuationV02.mmCounterpartySideIdentification,
						AmendNonDeliverableForwardValuationV02.mmTradingSideIdentification, AmendNonDeliverableForwardValuationV02.mmCounterpartySideIdentification, CancelNonDeliverableForwardValuationV02.mmTradingSideIdentification,
						CancelNonDeliverableForwardValuationV02.mmCounterpartySideIdentification, NonDeliverableForwardNotificationV02.mmTradingSideIdentification, NonDeliverableForwardNotificationV02.mmCounterpartySideIdentification);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradePartyIdentification3";
				definition = "Entity involved in an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FundIdentification2> getFundInformation() {
		return fundInformation == null ? Optional.empty() : Optional.of(fundInformation);
	}

	public TradePartyIdentification3 setFundInformation(FundIdentification2 fundInformation) {
		this.fundInformation = fundInformation;
		return this;
	}

	public PartyIdentification8Choice getSubmittingParty() {
		return submittingParty;
	}

	public TradePartyIdentification3 setSubmittingParty(PartyIdentification8Choice submittingParty) {
		this.submittingParty = Objects.requireNonNull(submittingParty);
		return this;
	}

	public PartyIdentification8Choice getTradeParty() {
		return tradeParty;
	}

	public TradePartyIdentification3 setTradeParty(PartyIdentification8Choice tradeParty) {
		this.tradeParty = Objects.requireNonNull(tradeParty);
		return this;
	}
}