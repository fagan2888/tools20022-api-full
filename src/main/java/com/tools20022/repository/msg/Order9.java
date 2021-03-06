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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Intention to transfer an ownership of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmClientOrderIdentification
 * Order9.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmClientOrderLinkIdentification
 * Order9.mmClientOrderLinkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmSecondaryClientOrderIdentification
 * Order9.mmSecondaryClientOrderIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmCashMargin
 * Order9.mmCashMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmTradeOriginationDate
 * Order9.mmTradeOriginationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmTradingCapacity
 * Order9.mmTradingCapacity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmPositionEffect
 * Order9.mmPositionEffect}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmDerivativeCovered
 * Order9.mmDerivativeCovered}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmSolicitedOrder
 * Order9.mmSolicitedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmComplianceIdentification
 * Order9.mmComplianceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmOrderRestrictions
 * Order9.mmOrderRestrictions}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmTradeDate
 * Order9.mmTradeDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmClearingFeeType
 * Order9.mmClearingFeeType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmSideTimeInForce
 * Order9.mmSideTimeInForce}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmCustomerCapacity
 * Order9.mmCustomerCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmForeignExchangeExecutionRequested
 * Order9.mmForeignExchangeExecutionRequested}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmSettlementCurrency
 * Order9.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmOrderOriginatorEligibility
 * Order9.mmOrderOriginatorEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmPlaceOfExecution
 * Order9.mmPlaceOfExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmSideOrderQuantityDetails
 * Order9.mmSideOrderQuantityDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmPreAllocationDetails
 * Order9.mmPreAllocationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmCommissionDetails
 * Order9.mmCommissionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmBookingDetails
 * Order9.mmBookingDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmTradingParties
 * Order9.mmTradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmSettlementDetails
 * Order9.mmSettlementDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmCashParties
 * Order9.mmCashParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmOtherBusinessParties
 * Order9.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmReceivingSettlementParties
 * Order9.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmDeliveringSettlementParties
 * Order9.mmDeliveringSettlementParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Order9#mmAmountsDetails
 * Order9.mmAmountsDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Order9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to transfer an ownership of a financial instrument."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Order9", propOrder = {"clientOrderIdentification", "clientOrderLinkIdentification", "secondaryClientOrderIdentification", "cashMargin", "tradeOriginationDate", "tradingCapacity", "positionEffect", "derivativeCovered",
		"solicitedOrder", "complianceIdentification", "orderRestrictions", "tradeDate", "clearingFeeType", "sideTimeInForce", "customerCapacity", "foreignExchangeExecutionRequested", "settlementCurrency", "orderOriginatorEligibility",
		"placeOfExecution", "sideOrderQuantityDetails", "preAllocationDetails", "commissionDetails", "bookingDetails", "tradingParties", "settlementDetails", "cashParties", "otherBusinessParties", "receivingSettlementParties",
		"deliveringSettlementParties", "amountsDetails"})
public class Order9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClntOrdrId", required = true)
	protected Max35Text clientOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 11</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Max35Text> mmClientOrderIdentification = new MMMessageAttribute<Order9, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "11"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Order9 obj) {
			return obj.getClientOrderIdentification();
		}

		@Override
		public void setValue(Order9 obj, Max35Text value) {
			obj.setClientOrderIdentification(value);
		}
	};
	@XmlElement(name = "ClntOrdrLkId")
	protected Max35Text clientOrderLinkIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrLkId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderLinkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the client order link."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 583</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<Max35Text>> mmClientOrderLinkIdentification = new MMMessageAttribute<Order9, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrLkId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "583"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderLinkIdentification";
			definition = "Unique and unambiguous identification of the client order link.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Order9 obj) {
			return obj.getClientOrderLinkIdentification();
		}

		@Override
		public void setValue(Order9 obj, Optional<Max35Text> value) {
			obj.setClientOrderLinkIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryClntOrdrId")
	protected Max35Text secondaryClientOrderIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryClntOrdrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The unique identifier for an order, as assigned by the buy-side. The identifier must be unique within a single trading day."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 526</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<Max35Text>> mmSecondaryClientOrderIdentification = new MMMessageAttribute<Order9, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "ScndryClntOrdrId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "526"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryClientOrderIdentification";
			definition = "The unique identifier for an order, as assigned by the buy-side. The identifier must be unique within a single trading day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Order9 obj) {
			return obj.getSecondaryClientOrderIdentification();
		}

		@Override
		public void setValue(Order9 obj, Optional<Max35Text> value) {
			obj.setSecondaryClientOrderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CshMrgn")
	protected CashMarginOrder1Code cashMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrder1Code
	 * CashMarginOrder1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCashMargin
	 * SecuritiesOrder.mmCashMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 544</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<CashMarginOrder1Code>> mmCashMargin = new MMMessageAttribute<Order9, Optional<CashMarginOrder1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmCashMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "CshMrgn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "544"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMargin";
			definition = "Identifies whether an order is a margin order or a non-margin order. This is primarily used when sending orders to Japanese exchanges to indicate sell margin or buy to cover. The same tag could be assigned also by buy-side to indicate the intent to sell or buy margin and the sell-side to accept or reject (base on some validation criteria) the margin request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CashMarginOrder1Code.mmObject();
		}

		@Override
		public Optional<CashMarginOrder1Code> getValue(Order9 obj) {
			return obj.getCashMargin();
		}

		@Override
		public void setValue(Order9 obj, Optional<CashMarginOrder1Code> value) {
			obj.setCashMargin(value.orElse(null));
		}
	};
	@XmlElement(name = "TradOrgtnDt")
	protected ISODateTime tradeOriginationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeOriginationDate
	 * SecuritiesTrade.mmTradeOriginationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradOrgtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeOriginationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 229</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<ISODateTime>> mmTradeOriginationDate = new MMMessageAttribute<Order9, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeOriginationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "TradOrgtnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "229"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeOriginationDate";
			definition = "Indicates the date and time of the agreement in principal between counter-parties prior to actual trade date.\nUsed with fixed income for municipal new issue markets.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Order9 obj) {
			return obj.getTradeOriginationDate();
		}

		@Override
		public void setValue(Order9 obj, Optional<ISODateTime> value) {
			obj.setTradeOriginationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgCpcty")
	protected TradingCapacity3Code tradingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity3Code
	 * TradingCapacity3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
	 * TradePartyRole.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCpcty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Designates the capacity of the firm placing the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 528</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<TradingCapacity3Code>> mmTradingCapacity = new MMMessageAttribute<Order9, Optional<TradingCapacity3Code>>() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "528"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Designates the capacity of the firm placing the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingCapacity3Code.mmObject();
		}

		@Override
		public Optional<TradingCapacity3Code> getValue(Order9 obj) {
			return obj.getTradingCapacity();
		}

		@Override
		public void setValue(Order9 obj, Optional<TradingCapacity3Code> value) {
			obj.setTradingCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "PosFct")
	protected PositionEffect1Code positionEffect;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect1Code
	 * PositionEffect1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPositionEffect
	 * SecuritiesOrder.mmPositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosFct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionEffect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resulting position after a trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 77</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<PositionEffect1Code>> mmPositionEffect = new MMMessageAttribute<Order9, Optional<PositionEffect1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPositionEffect;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "PosFct";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "77"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionEffect";
			definition = "Indicates whether the resulting position after a trade should be an opening position or closing position. Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PositionEffect1Code.mmObject();
		}

		@Override
		public Optional<PositionEffect1Code> getValue(Order9 obj) {
			return obj.getPositionEffect();
		}

		@Override
		public void setValue(Order9 obj, Optional<PositionEffect1Code> value) {
			obj.setPositionEffect(value.orElse(null));
		}
	};
	@XmlElement(name = "DerivCvrd")
	protected YesNoIndicator derivativeCovered;
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
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmDerivativeCovered
	 * Derivative.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivCvrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeCovered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative product is covered or not by an underlying financial instrument position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 203</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<YesNoIndicator>> mmDerivativeCovered = new MMMessageAttribute<Order9, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmDerivativeCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "DerivCvrd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "203"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeCovered";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Order9 obj) {
			return obj.getDerivativeCovered();
		}

		@Override
		public void setValue(Order9 obj, Optional<YesNoIndicator> value) {
			obj.setDerivativeCovered(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctdOrdr", required = true)
	protected YesNoIndicator solicitedOrder;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSolicitedOrder
	 * SecuritiesOrder.mmSolicitedOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctdOrdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an order has been generated in response to an advertisement or an indication of interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 377</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, YesNoIndicator> mmSolicitedOrder = new MMMessageAttribute<Order9, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSolicitedOrder;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "SlctdOrdr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "377"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitedOrder";
			definition = "Indicates that an order has been generated in response to an advertisement or an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Order9 obj) {
			return obj.getSolicitedOrder();
		}

		@Override
		public void setValue(Order9 obj, YesNoIndicator value) {
			obj.setSolicitedOrder(value);
		}
	};
	@XmlElement(name = "CmplcId")
	protected Max35Text complianceIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplianceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used to represent this transaction for compliance purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 659</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<Max35Text>> mmComplianceIdentification = new MMMessageAttribute<Order9, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "CmplcId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "659"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification used to represent this transaction for compliance purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Order9 obj) {
			return obj.getComplianceIdentification();
		}

		@Override
		public void setValue(Order9 obj, Optional<Max35Text> value) {
			obj.setComplianceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrRstrctns")
	protected List<OrderRestrictions1Code> orderRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderRestrictions1Code
	 * OrderRestrictions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegulatoryDetails#mmOrderRestrictions
	 * SecuritiesRegulatoryDetails.mmOrderRestrictions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRstrctns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification and restrictions linked to an order (for regulatory purpose)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 529</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, List<OrderRestrictions1Code>> mmOrderRestrictions = new MMMessageAttribute<Order9, List<OrderRestrictions1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesRegulatoryDetails.mmOrderRestrictions;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "OrdrRstrctns";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "529"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderRestrictions";
			definition = "Classification and restrictions linked to an order (for regulatory purpose).";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> OrderRestrictions1Code.mmObject();
		}

		@Override
		public List<OrderRestrictions1Code> getValue(Order9 obj) {
			return obj.getOrderRestrictions();
		}

		@Override
		public void setValue(Order9 obj, List<OrderRestrictions1Code> value) {
			obj.setOrderRestrictions(value);
		}
	};
	@XmlElement(name = "TradDt")
	protected ISODateTime tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 75</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<ISODateTime>> mmTradeDate = new MMMessageAttribute<Order9, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "75"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Order9 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(Order9 obj, Optional<ISODateTime> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrFeeTp")
	protected ClearingFeeType1Code clearingFeeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingFeeType1Code
	 * ClearingFeeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmClearingFeeType
	 * SecuritiesTrade.mmClearingFeeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrFeeTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingFeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of fee being assessed of the customer for trade executions at an exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 635</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<ClearingFeeType1Code>> mmClearingFeeType = new MMMessageAttribute<Order9, Optional<ClearingFeeType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmClearingFeeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "ClrFeeTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "635"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingFeeType";
			definition = "Indicates the type of fee being assessed of the customer for trade executions at an exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ClearingFeeType1Code.mmObject();
		}

		@Override
		public Optional<ClearingFeeType1Code> getValue(Order9 obj) {
			return obj.getClearingFeeType();
		}

		@Override
		public void setValue(Order9 obj, Optional<ClearingFeeType1Code> value) {
			obj.setClearingFeeType(value.orElse(null));
		}
	};
	@XmlElement(name = "SdTmInForce", required = true)
	protected ExecutionTimeLimit1Code sideTimeInForce;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExecutionTimeLimit1Code
	 * ExecutionTimeLimit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmExecutionTimeLimit
	 * SecuritiesOrderParameters.mmExecutionTimeLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdTmInForce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideTimeInForce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how long the order as specified in the side stays in effect. SideTimeInForce allows a two-sided cross order to specify order behavior separately for each side. Absence of this field indicates that TimeInForce should be referenced. SideTimeInForce will override TimeInForce if both are provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 962</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, ExecutionTimeLimit1Code> mmSideTimeInForce = new MMMessageAttribute<Order9, ExecutionTimeLimit1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderParameters.mmExecutionTimeLimit;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "SdTmInForce";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "962"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideTimeInForce";
			definition = "Indicates how long the order as specified in the side stays in effect. SideTimeInForce allows a two-sided cross order to specify order behavior separately for each side. Absence of this field indicates that TimeInForce should be referenced. SideTimeInForce will override TimeInForce if both are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExecutionTimeLimit1Code.mmObject();
		}

		@Override
		public ExecutionTimeLimit1Code getValue(Order9 obj) {
			return obj.getSideTimeInForce();
		}

		@Override
		public void setValue(Order9 obj, ExecutionTimeLimit1Code value) {
			obj.setSideTimeInForce(value);
		}
	};
	@XmlElement(name = "CstmrCpcty")
	protected CustomerOrderCapacity1Code customerCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacity1Code
	 * CustomerOrderCapacity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmCustomerCapacity
	 * SecuritiesOrder.mmCustomerCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCpcty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Capacity of customer placing the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 582</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<CustomerOrderCapacity1Code>> mmCustomerCapacity = new MMMessageAttribute<Order9, Optional<CustomerOrderCapacity1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmCustomerCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "CstmrCpcty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "582"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCapacity";
			definition = "Capacity of customer placing the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CustomerOrderCapacity1Code.mmObject();
		}

		@Override
		public Optional<CustomerOrderCapacity1Code> getValue(Order9 obj) {
			return obj.getCustomerCapacity();
		}

		@Override
		public void setValue(Order9 obj, Optional<CustomerOrderCapacity1Code> value) {
			obj.setCustomerCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnXchgExctnReqd", required = true)
	protected YesNoIndicator foreignExchangeExecutionRequested;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmForeignExchangeExecutionRequested
	 * SecuritiesOrder.mmForeignExchangeExecutionRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnXchgExctnReqd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeExecutionRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 121</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, YesNoIndicator> mmForeignExchangeExecutionRequested = new MMMessageAttribute<Order9, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmForeignExchangeExecutionRequested;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "FrgnXchgExctnReqd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "121"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeExecutionRequested";
			definition = "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Order9 obj) {
			return obj.getForeignExchangeExecutionRequested();
		}

		@Override
		public void setValue(Order9 obj, YesNoIndicator value) {
			obj.setForeignExchangeExecutionRequested(value);
		}
	};
	@XmlElement(name = "SttlmCcy")
	protected CurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSettlementCurrency
	 * SecuritiesOrder.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Required if ForeignExchangeExecutionRequested=Yes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<CurrencyCode>> mmSettlementCurrency = new MMMessageAttribute<Order9, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Required if ForeignExchangeExecutionRequested=Yes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(Order9 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(Order9 obj, Optional<CurrencyCode> value) {
			obj.setSettlementCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrOrgtrElgblty")
	protected Eligibility1Code orderOriginatorEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Eligibility1Code
	 * Eligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderOriginatorEligibility
	 * SecuritiesOrder.mmOrderOriginatorEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrOrgtrElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Order9, Optional<Eligibility1Code>> mmOrderOriginatorEligibility = new MMMessageAttribute<Order9, Optional<Eligibility1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderOriginatorEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "OrdrOrgtrElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligibility1Code.mmObject();
		}

		@Override
		public Optional<Eligibility1Code> getValue(Order9 obj) {
			return obj.getOrderOriginatorEligibility();
		}

		@Override
		public void setValue(Order9 obj, Optional<Eligibility1Code> value) {
			obj.setOrderOriginatorEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfExctn")
	protected MarketIdentification1 placeOfExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification1
	 * MarketIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPlaceOfTrade
	 * SecuritiesOrder.mmPlaceOfTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfExctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous way to identify an organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, Optional<MarketIdentification1>> mmPlaceOfExecution = new MMMessageAssociationEnd<Order9, Optional<MarketIdentification1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPlaceOfTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "PlcOfExctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfExecution";
			definition = "Unique and unambiguous way to identify an organisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification1.mmObject();
		}

		@Override
		public Optional<MarketIdentification1> getValue(Order9 obj) {
			return obj.getPlaceOfExecution();
		}

		@Override
		public void setValue(Order9 obj, Optional<MarketIdentification1> value) {
			obj.setPlaceOfExecution(value.orElse(null));
		}
	};
	@XmlElement(name = "SdOrdrQtyDtls")
	protected OrderQuantity1 sideOrderQuantityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderQuantity1
	 * OrderQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SdOrdrQtyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SideOrderQuantityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order details for a specific side."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, Optional<OrderQuantity1>> mmSideOrderQuantityDetails = new MMMessageAssociationEnd<Order9, Optional<OrderQuantity1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "SdOrdrQtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SideOrderQuantityDetails";
			definition = "Order details for a specific side.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrderQuantity1.mmObject();
		}

		@Override
		public Optional<OrderQuantity1> getValue(Order9 obj) {
			return obj.getSideOrderQuantityDetails();
		}

		@Override
		public void setValue(Order9 obj, Optional<OrderQuantity1> value) {
			obj.setSideOrderQuantityDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PreAllcnDtls")
	protected List<PreAllocation1> preAllocationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PreAllocation1
	 * PreAllocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderAllocation
	 * SecuritiesOrder.mmSecuritiesOrderAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreAllcnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAllocationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides PreAllocation details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, List<PreAllocation1>> mmPreAllocationDetails = new MMMessageAssociationEnd<Order9, List<PreAllocation1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSecuritiesOrderAllocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "PreAllcnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAllocationDetails";
			definition = "Provides PreAllocation details.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PreAllocation1.mmObject();
		}

		@Override
		public List<PreAllocation1> getValue(Order9 obj) {
			return obj.getPreAllocationDetails();
		}

		@Override
		public void setValue(Order9 obj, List<PreAllocation1> value) {
			obj.setPreAllocationDetails(value);
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<Commission2> commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission2
	 * Commission2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission details related that may apply to the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, List<Commission2>> mmCommissionDetails = new MMMessageAssociationEnd<Order9, List<Commission2>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission details related that may apply to the order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission2.mmObject();
		}

		@Override
		public List<Commission2> getValue(Order9 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(Order9 obj, List<Commission2> value) {
			obj.setCommissionDetails(value);
		}
	};
	@XmlElement(name = "BookgDtls")
	protected Booking1 bookingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Booking1 Booking1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmBookingInstructions
	 * SecuritiesOrder.mmBookingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the information used to book the executions of a trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, Optional<Booking1>> mmBookingDetails = new MMMessageAssociationEnd<Order9, Optional<Booking1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmBookingInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "BookgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingDetails";
			definition = "Provides details about the information used to book the executions of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Booking1.mmObject();
		}

		@Override
		public Optional<Booking1> getValue(Order9 obj) {
			return obj.getBookingDetails();
		}

		@Override
		public void setValue(Order9 obj, Optional<Booking1> value) {
			obj.setBookingDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPties")
	protected List<Intermediary14> tradingParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary14
	 * Intermediary14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parties used for acting parties that applies to individual sides of the order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, List<Intermediary14>> mmTradingParties = new MMMessageAssociationEnd<Order9, List<Intermediary14>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "TradgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParties";
			definition = "Parties used for acting parties that applies to individual sides of the order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary14.mmObject();
		}

		@Override
		public List<Intermediary14> getValue(Order9 obj) {
			return obj.getTradingParties();
		}

		@Override
		public void setValue(Order9 obj, List<Intermediary14> value) {
			obj.setTradingParties(value);
		}
	};
	@XmlElement(name = "SttlmDtls")
	protected SecuritiesSettlement1 settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesSettlement1
	 * SecuritiesSettlement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters applied to the settlement of a security transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, Optional<SecuritiesSettlement1>> mmSettlementDetails = new MMMessageAssociationEnd<Order9, Optional<SecuritiesSettlement1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Parameters applied to the settlement of a security transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlement1.mmObject();
		}

		@Override
		public Optional<SecuritiesSettlement1> getValue(Order9 obj) {
			return obj.getSettlementDetails();
		}

		@Override
		public void setValue(Order9 obj, Optional<SecuritiesSettlement1> value) {
			obj.setSettlementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties", required = true)
	protected CashParties1 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties1
	 * CashParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, CashParties1> mmCashParties = new MMMessageAssociationEnd<Order9, CashParties1>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashParties1.mmObject();
		}

		@Override
		public CashParties1 getValue(Order9 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(Order9 obj, CashParties1 value) {
			obj.setCashParties(value);
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties1 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherParties1
	 * OtherParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderPartyRole
	 * SecuritiesOrder.mmSecuritiesOrderPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties involved in the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, Optional<OtherParties1>> mmOtherBusinessParties = new MMMessageAssociationEnd<Order9, Optional<OtherParties1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSecuritiesOrderPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherParties1.mmObject();
		}

		@Override
		public Optional<OtherParties1> getValue(Order9 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(Order9 obj, Optional<OtherParties1> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties3 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, Optional<SettlementParties3>> mmReceivingSettlementParties = new MMMessageAssociationEnd<Order9, Optional<SettlementParties3>>() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public Optional<SettlementParties3> getValue(Order9 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(Order9 obj, Optional<SettlementParties3> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties", required = true)
	protected SettlementParties3 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, SettlementParties3> mmDeliveringSettlementParties = new MMMessageAssociationEnd<Order9, SettlementParties3>() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public SettlementParties3 getValue(Order9 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(Order9 obj, SettlementParties3 value) {
			obj.setDeliveringSettlementParties(value);
		}
	};
	@XmlElement(name = "AmtsDtls")
	protected List<OtherAmounts1> amountsDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherAmounts1
	 * OtherAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderExecution
	 * SecuritiesOrder.mmOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Order9
	 * Order9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtsDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money debited and credited on the books of an account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Order9, List<OtherAmounts1>> mmAmountsDetails = new MMMessageAssociationEnd<Order9, List<OtherAmounts1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.Order9.mmObject();
			isDerived = false;
			xmlTag = "AmtsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountsDetails";
			definition = "Amount of money debited and credited on the books of an account servicer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherAmounts1.mmObject();
		}

		@Override
		public List<OtherAmounts1> getValue(Order9 obj) {
			return obj.getAmountsDetails();
		}

		@Override
		public void setValue(Order9 obj, List<OtherAmounts1> value) {
			obj.setAmountsDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Order9.mmClientOrderIdentification, com.tools20022.repository.msg.Order9.mmClientOrderLinkIdentification,
						com.tools20022.repository.msg.Order9.mmSecondaryClientOrderIdentification, com.tools20022.repository.msg.Order9.mmCashMargin, com.tools20022.repository.msg.Order9.mmTradeOriginationDate,
						com.tools20022.repository.msg.Order9.mmTradingCapacity, com.tools20022.repository.msg.Order9.mmPositionEffect, com.tools20022.repository.msg.Order9.mmDerivativeCovered,
						com.tools20022.repository.msg.Order9.mmSolicitedOrder, com.tools20022.repository.msg.Order9.mmComplianceIdentification, com.tools20022.repository.msg.Order9.mmOrderRestrictions,
						com.tools20022.repository.msg.Order9.mmTradeDate, com.tools20022.repository.msg.Order9.mmClearingFeeType, com.tools20022.repository.msg.Order9.mmSideTimeInForce,
						com.tools20022.repository.msg.Order9.mmCustomerCapacity, com.tools20022.repository.msg.Order9.mmForeignExchangeExecutionRequested, com.tools20022.repository.msg.Order9.mmSettlementCurrency,
						com.tools20022.repository.msg.Order9.mmOrderOriginatorEligibility, com.tools20022.repository.msg.Order9.mmPlaceOfExecution, com.tools20022.repository.msg.Order9.mmSideOrderQuantityDetails,
						com.tools20022.repository.msg.Order9.mmPreAllocationDetails, com.tools20022.repository.msg.Order9.mmCommissionDetails, com.tools20022.repository.msg.Order9.mmBookingDetails,
						com.tools20022.repository.msg.Order9.mmTradingParties, com.tools20022.repository.msg.Order9.mmSettlementDetails, com.tools20022.repository.msg.Order9.mmCashParties,
						com.tools20022.repository.msg.Order9.mmOtherBusinessParties, com.tools20022.repository.msg.Order9.mmReceivingSettlementParties, com.tools20022.repository.msg.Order9.mmDeliveringSettlementParties,
						com.tools20022.repository.msg.Order9.mmAmountsDetails);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Order9";
				definition = "Intention to transfer an ownership of a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getClientOrderIdentification() {
		return clientOrderIdentification;
	}

	public Order9 setClientOrderIdentification(Max35Text clientOrderIdentification) {
		this.clientOrderIdentification = Objects.requireNonNull(clientOrderIdentification);
		return this;
	}

	public Optional<Max35Text> getClientOrderLinkIdentification() {
		return clientOrderLinkIdentification == null ? Optional.empty() : Optional.of(clientOrderLinkIdentification);
	}

	public Order9 setClientOrderLinkIdentification(Max35Text clientOrderLinkIdentification) {
		this.clientOrderLinkIdentification = clientOrderLinkIdentification;
		return this;
	}

	public Optional<Max35Text> getSecondaryClientOrderIdentification() {
		return secondaryClientOrderIdentification == null ? Optional.empty() : Optional.of(secondaryClientOrderIdentification);
	}

	public Order9 setSecondaryClientOrderIdentification(Max35Text secondaryClientOrderIdentification) {
		this.secondaryClientOrderIdentification = secondaryClientOrderIdentification;
		return this;
	}

	public Optional<CashMarginOrder1Code> getCashMargin() {
		return cashMargin == null ? Optional.empty() : Optional.of(cashMargin);
	}

	public Order9 setCashMargin(CashMarginOrder1Code cashMargin) {
		this.cashMargin = cashMargin;
		return this;
	}

	public Optional<ISODateTime> getTradeOriginationDate() {
		return tradeOriginationDate == null ? Optional.empty() : Optional.of(tradeOriginationDate);
	}

	public Order9 setTradeOriginationDate(ISODateTime tradeOriginationDate) {
		this.tradeOriginationDate = tradeOriginationDate;
		return this;
	}

	public Optional<TradingCapacity3Code> getTradingCapacity() {
		return tradingCapacity == null ? Optional.empty() : Optional.of(tradingCapacity);
	}

	public Order9 setTradingCapacity(TradingCapacity3Code tradingCapacity) {
		this.tradingCapacity = tradingCapacity;
		return this;
	}

	public Optional<PositionEffect1Code> getPositionEffect() {
		return positionEffect == null ? Optional.empty() : Optional.of(positionEffect);
	}

	public Order9 setPositionEffect(PositionEffect1Code positionEffect) {
		this.positionEffect = positionEffect;
		return this;
	}

	public Optional<YesNoIndicator> getDerivativeCovered() {
		return derivativeCovered == null ? Optional.empty() : Optional.of(derivativeCovered);
	}

	public Order9 setDerivativeCovered(YesNoIndicator derivativeCovered) {
		this.derivativeCovered = derivativeCovered;
		return this;
	}

	public YesNoIndicator getSolicitedOrder() {
		return solicitedOrder;
	}

	public Order9 setSolicitedOrder(YesNoIndicator solicitedOrder) {
		this.solicitedOrder = Objects.requireNonNull(solicitedOrder);
		return this;
	}

	public Optional<Max35Text> getComplianceIdentification() {
		return complianceIdentification == null ? Optional.empty() : Optional.of(complianceIdentification);
	}

	public Order9 setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = complianceIdentification;
		return this;
	}

	public List<OrderRestrictions1Code> getOrderRestrictions() {
		return orderRestrictions == null ? orderRestrictions = new ArrayList<>() : orderRestrictions;
	}

	public Order9 setOrderRestrictions(List<OrderRestrictions1Code> orderRestrictions) {
		this.orderRestrictions = Objects.requireNonNull(orderRestrictions);
		return this;
	}

	public Optional<ISODateTime> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public Order9 setTradeDate(ISODateTime tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<ClearingFeeType1Code> getClearingFeeType() {
		return clearingFeeType == null ? Optional.empty() : Optional.of(clearingFeeType);
	}

	public Order9 setClearingFeeType(ClearingFeeType1Code clearingFeeType) {
		this.clearingFeeType = clearingFeeType;
		return this;
	}

	public ExecutionTimeLimit1Code getSideTimeInForce() {
		return sideTimeInForce;
	}

	public Order9 setSideTimeInForce(ExecutionTimeLimit1Code sideTimeInForce) {
		this.sideTimeInForce = Objects.requireNonNull(sideTimeInForce);
		return this;
	}

	public Optional<CustomerOrderCapacity1Code> getCustomerCapacity() {
		return customerCapacity == null ? Optional.empty() : Optional.of(customerCapacity);
	}

	public Order9 setCustomerCapacity(CustomerOrderCapacity1Code customerCapacity) {
		this.customerCapacity = customerCapacity;
		return this;
	}

	public YesNoIndicator getForeignExchangeExecutionRequested() {
		return foreignExchangeExecutionRequested;
	}

	public Order9 setForeignExchangeExecutionRequested(YesNoIndicator foreignExchangeExecutionRequested) {
		this.foreignExchangeExecutionRequested = Objects.requireNonNull(foreignExchangeExecutionRequested);
		return this;
	}

	public Optional<CurrencyCode> getSettlementCurrency() {
		return settlementCurrency == null ? Optional.empty() : Optional.of(settlementCurrency);
	}

	public Order9 setSettlementCurrency(CurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
		return this;
	}

	public Optional<Eligibility1Code> getOrderOriginatorEligibility() {
		return orderOriginatorEligibility == null ? Optional.empty() : Optional.of(orderOriginatorEligibility);
	}

	public Order9 setOrderOriginatorEligibility(Eligibility1Code orderOriginatorEligibility) {
		this.orderOriginatorEligibility = orderOriginatorEligibility;
		return this;
	}

	public Optional<MarketIdentification1> getPlaceOfExecution() {
		return placeOfExecution == null ? Optional.empty() : Optional.of(placeOfExecution);
	}

	public Order9 setPlaceOfExecution(MarketIdentification1 placeOfExecution) {
		this.placeOfExecution = placeOfExecution;
		return this;
	}

	public Optional<OrderQuantity1> getSideOrderQuantityDetails() {
		return sideOrderQuantityDetails == null ? Optional.empty() : Optional.of(sideOrderQuantityDetails);
	}

	public Order9 setSideOrderQuantityDetails(OrderQuantity1 sideOrderQuantityDetails) {
		this.sideOrderQuantityDetails = sideOrderQuantityDetails;
		return this;
	}

	public List<PreAllocation1> getPreAllocationDetails() {
		return preAllocationDetails == null ? preAllocationDetails = new ArrayList<>() : preAllocationDetails;
	}

	public Order9 setPreAllocationDetails(List<PreAllocation1> preAllocationDetails) {
		this.preAllocationDetails = Objects.requireNonNull(preAllocationDetails);
		return this;
	}

	public List<Commission2> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public Order9 setCommissionDetails(List<Commission2> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}

	public Optional<Booking1> getBookingDetails() {
		return bookingDetails == null ? Optional.empty() : Optional.of(bookingDetails);
	}

	public Order9 setBookingDetails(Booking1 bookingDetails) {
		this.bookingDetails = bookingDetails;
		return this;
	}

	public List<Intermediary14> getTradingParties() {
		return tradingParties == null ? tradingParties = new ArrayList<>() : tradingParties;
	}

	public Order9 setTradingParties(List<Intermediary14> tradingParties) {
		this.tradingParties = Objects.requireNonNull(tradingParties);
		return this;
	}

	public Optional<SecuritiesSettlement1> getSettlementDetails() {
		return settlementDetails == null ? Optional.empty() : Optional.of(settlementDetails);
	}

	public Order9 setSettlementDetails(SecuritiesSettlement1 settlementDetails) {
		this.settlementDetails = settlementDetails;
		return this;
	}

	public CashParties1 getCashParties() {
		return cashParties;
	}

	public Order9 setCashParties(CashParties1 cashParties) {
		this.cashParties = Objects.requireNonNull(cashParties);
		return this;
	}

	public Optional<OtherParties1> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public Order9 setOtherBusinessParties(OtherParties1 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<SettlementParties3> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public Order9 setReceivingSettlementParties(SettlementParties3 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public SettlementParties3 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public Order9 setDeliveringSettlementParties(SettlementParties3 deliveringSettlementParties) {
		this.deliveringSettlementParties = Objects.requireNonNull(deliveringSettlementParties);
		return this;
	}

	public List<OtherAmounts1> getAmountsDetails() {
		return amountsDetails == null ? amountsDetails = new ArrayList<>() : amountsDetails;
	}

	public Order9 setAmountsDetails(List<OtherAmounts1> amountsDetails) {
		this.amountsDetails = Objects.requireNonNull(amountsDetails);
		return this;
	}
}