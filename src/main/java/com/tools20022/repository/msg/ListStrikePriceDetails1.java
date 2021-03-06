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
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ListTrading;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentAttributes1;
import com.tools20022.repository.msg.FinancialInstrumentStipulations;
import com.tools20022.repository.msg.Price1;
import com.tools20022.repository.msg.SecurityIdentification7;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details for negotiating and trading a large number of securities
 * contained in or comprising a portfolio.
 * 
 * One example is index arbitrage, which consists in the purchase or sale of a
 * basket of stocks in conjunction with the sale or purchase of a derivative
 * product (for example index futures) to profit from price differences between
 * the basket and the derivative product.
 * 
 * Other examples include liquidation of EFP (Exchange for Physical) stock
 * positions, portfolio realignment and portfolio liquidation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmClientOrderIdentification
 * ListStrikePriceDetails1.mmClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmStrikePrice
 * ListStrikePriceDetails1.mmStrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmSecondaryClientOrderIdentification
 * ListStrikePriceDetails1.mmSecondaryClientOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmPreviousClosingPrice
 * ListStrikePriceDetails1.mmPreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmSide
 * ListStrikePriceDetails1.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmUnderlyingFinancialInstrument
 * ListStrikePriceDetails1.mmUnderlyingFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmStipulations
 * ListStrikePriceDetails1.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmUnderlyingStipulations
 * ListStrikePriceDetails1.mmUnderlyingStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmFinancialInstrumentAttributes
 * ListStrikePriceDetails1.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmUnderlyingFinancialInstrumentAttributes
 * ListStrikePriceDetails1.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1#mmFinancialInstrument
 * ListStrikePriceDetails1.mmFinancialInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ListTrading
 * ListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ListStrikePriceDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ListStrikePriceDetails1", propOrder = {"clientOrderIdentification", "strikePrice", "secondaryClientOrderIdentification", "previousClosingPrice", "side", "underlyingFinancialInstrument", "stipulations",
		"underlyingStipulations", "financialInstrumentAttributes", "underlyingFinancialInstrumentAttributes", "financialInstrument"})
public class ListStrikePriceDetails1 {

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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ListStrikePriceDetails1, Max35Text> mmClientOrderIdentification = new MMMessageAttribute<ListStrikePriceDetails1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderIdentification";
			definition = "Unique identifier for the order as assigned by the buy-side. Uniqueness must be guaranteed within a single trading day. Firms, particularly those that electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClientOrderIdentification element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ListStrikePriceDetails1 obj) {
			return obj.getClientOrderIdentification();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, Max35Text value) {
			obj.setClientOrderIdentification(value);
		}
	};
	@XmlElement(name = "StrkPric", required = true)
	protected Price1 strikePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
	 * SecuritiesOrder.mmOrderPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money for which goods or services are offered, sold, or bought."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ListStrikePriceDetails1, Price1> mmStrikePrice = new MMMessageAttribute<ListStrikePriceDetails1, Price1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "StrkPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			definition = "Amount of money for which goods or services are offered, sold, or bought.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Price1 getValue(ListStrikePriceDetails1 obj) {
			return obj.getStrikePrice();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, Price1 value) {
			obj.setStrikePrice(value);
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryClntOrdrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryClientOrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assigned by the party that originates the order. Can be used to provide the ClientOrderIdentification used by an exchange or executing system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ListStrikePriceDetails1, Optional<Max35Text>> mmSecondaryClientOrderIdentification = new MMMessageAttribute<ListStrikePriceDetails1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "ScndryClntOrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryClientOrderIdentification";
			definition = "Assigned by the party that originates the order. Can be used to provide the ClientOrderIdentification used by an exchange or executing system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ListStrikePriceDetails1 obj) {
			return obj.getSecondaryClientOrderIdentification();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, Optional<Max35Text> value) {
			obj.setSecondaryClientOrderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsClsgPric")
	protected Price1 previousClosingPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsClsgPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price of a financial instrument at closing time of the exchange in which it is traded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ListStrikePriceDetails1, Optional<Price1>> mmPreviousClosingPrice = new MMMessageAttribute<ListStrikePriceDetails1, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "PrvsClsgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Price of a financial instrument at closing time of the exchange in which it is traded.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(ListStrikePriceDetails1 obj) {
			return obj.getPreviousClosingPrice();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, Optional<Price1> value) {
			obj.setPreviousClosingPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "Sd")
	protected Side1Code side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coded list to specify the side of the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ListStrikePriceDetails1, Optional<Side1Code>> mmSide = new MMMessageAttribute<ListStrikePriceDetails1, Optional<Side1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Coded list to specify the side of the order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Side1Code.mmObject();
		}

		@Override
		public Optional<Side1Code> getValue(ListStrikePriceDetails1 obj) {
			return obj.getSide();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, Optional<Side1Code> value) {
			obj.setSide(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygFinInstrm")
	protected List<SecurityIdentification7> underlyingFinancialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ListStrikePriceDetails1, List<SecurityIdentification7>> mmUnderlyingFinancialInstrument = new MMMessageAssociationEnd<ListStrikePriceDetails1, List<SecurityIdentification7>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrument";
			definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public List<SecurityIdentification7> getValue(ListStrikePriceDetails1 obj) {
			return obj.getUnderlyingFinancialInstrument();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, List<SecurityIdentification7> value) {
			obj.setUnderlyingFinancialInstrument(value);
		}
	};
	@XmlElement(name = "Stiptns")
	protected FinancialInstrumentStipulations stipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stiptns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument stipulations."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ListStrikePriceDetails1, Optional<FinancialInstrumentStipulations>> mmStipulations = new MMMessageAssociationEnd<ListStrikePriceDetails1, Optional<FinancialInstrumentStipulations>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "Stiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stipulations";
			definition = "Provides details about the financial instrument stipulations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentStipulations.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentStipulations> getValue(ListStrikePriceDetails1 obj) {
			return obj.getStipulations();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, Optional<FinancialInstrumentStipulations> value) {
			obj.setStipulations(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygStiptns")
	protected List<FinancialInstrumentStipulations> underlyingStipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygStiptns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingStipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument stipulations."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ListStrikePriceDetails1, List<FinancialInstrumentStipulations>> mmUnderlyingStipulations = new MMMessageAssociationEnd<ListStrikePriceDetails1, List<FinancialInstrumentStipulations>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingStipulations";
			definition = "Provides details about the underlying financial instrument stipulations.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentStipulations.mmObject();
		}

		@Override
		public List<FinancialInstrumentStipulations> getValue(ListStrikePriceDetails1 obj) {
			return obj.getUnderlyingStipulations();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, List<FinancialInstrumentStipulations> value) {
			obj.setUnderlyingStipulations(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes1 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument attributes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ListStrikePriceDetails1, Optional<FinancialInstrumentAttributes1>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<ListStrikePriceDetails1, Optional<FinancialInstrumentAttributes1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Provides details about the financial instrument attributes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes1> getValue(ListStrikePriceDetails1 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, Optional<FinancialInstrumentAttributes1> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygFinInstrmAttrbts")
	protected List<FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedSecurity
	 * SecuritiesOrder.mmOrderedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument attributes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ListStrikePriceDetails1, List<FinancialInstrumentAttributes1>> mmUnderlyingFinancialInstrumentAttributes = new MMMessageAssociationEnd<ListStrikePriceDetails1, List<FinancialInstrumentAttributes1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentAttributes";
			definition = "Provides details about the underlying financial instrument attributes.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes1.mmObject();
		}

		@Override
		public List<FinancialInstrumentAttributes1> getValue(ListStrikePriceDetails1 obj) {
			return obj.getUnderlyingFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, List<FinancialInstrumentAttributes1> value) {
			obj.setUnderlyingFinancialInstrumentAttributes(value);
		}
	};
	@XmlElement(name = "FinInstrm", required = true)
	protected SecurityIdentification7 financialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ListStrikePriceDetails1
	 * ListStrikePriceDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ListStrikePriceDetails1, SecurityIdentification7> mmFinancialInstrument = new MMMessageAssociationEnd<ListStrikePriceDetails1, SecurityIdentification7>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ListStrikePriceDetails1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public SecurityIdentification7 getValue(ListStrikePriceDetails1 obj) {
			return obj.getFinancialInstrument();
		}

		@Override
		public void setValue(ListStrikePriceDetails1 obj, SecurityIdentification7 value) {
			obj.setFinancialInstrument(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ListStrikePriceDetails1.mmClientOrderIdentification, com.tools20022.repository.msg.ListStrikePriceDetails1.mmStrikePrice,
						com.tools20022.repository.msg.ListStrikePriceDetails1.mmSecondaryClientOrderIdentification, com.tools20022.repository.msg.ListStrikePriceDetails1.mmPreviousClosingPrice,
						com.tools20022.repository.msg.ListStrikePriceDetails1.mmSide, com.tools20022.repository.msg.ListStrikePriceDetails1.mmUnderlyingFinancialInstrument,
						com.tools20022.repository.msg.ListStrikePriceDetails1.mmStipulations, com.tools20022.repository.msg.ListStrikePriceDetails1.mmUnderlyingStipulations,
						com.tools20022.repository.msg.ListStrikePriceDetails1.mmFinancialInstrumentAttributes, com.tools20022.repository.msg.ListStrikePriceDetails1.mmUnderlyingFinancialInstrumentAttributes,
						com.tools20022.repository.msg.ListStrikePriceDetails1.mmFinancialInstrument);
				trace_lazy = () -> ListTrading.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ListStrikePriceDetails1";
				definition = "Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. \n\nOne example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of\na derivative product (for example index futures) to profit from price differences between the basket and the derivative product. \n\nOther examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getClientOrderIdentification() {
		return clientOrderIdentification;
	}

	public ListStrikePriceDetails1 setClientOrderIdentification(Max35Text clientOrderIdentification) {
		this.clientOrderIdentification = Objects.requireNonNull(clientOrderIdentification);
		return this;
	}

	public Price1 getStrikePrice() {
		return strikePrice;
	}

	public ListStrikePriceDetails1 setStrikePrice(Price1 strikePrice) {
		this.strikePrice = Objects.requireNonNull(strikePrice);
		return this;
	}

	public Optional<Max35Text> getSecondaryClientOrderIdentification() {
		return secondaryClientOrderIdentification == null ? Optional.empty() : Optional.of(secondaryClientOrderIdentification);
	}

	public ListStrikePriceDetails1 setSecondaryClientOrderIdentification(Max35Text secondaryClientOrderIdentification) {
		this.secondaryClientOrderIdentification = secondaryClientOrderIdentification;
		return this;
	}

	public Optional<Price1> getPreviousClosingPrice() {
		return previousClosingPrice == null ? Optional.empty() : Optional.of(previousClosingPrice);
	}

	public ListStrikePriceDetails1 setPreviousClosingPrice(Price1 previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
		return this;
	}

	public Optional<Side1Code> getSide() {
		return side == null ? Optional.empty() : Optional.of(side);
	}

	public ListStrikePriceDetails1 setSide(Side1Code side) {
		this.side = side;
		return this;
	}

	public List<SecurityIdentification7> getUnderlyingFinancialInstrument() {
		return underlyingFinancialInstrument == null ? underlyingFinancialInstrument = new ArrayList<>() : underlyingFinancialInstrument;
	}

	public ListStrikePriceDetails1 setUnderlyingFinancialInstrument(List<SecurityIdentification7> underlyingFinancialInstrument) {
		this.underlyingFinancialInstrument = Objects.requireNonNull(underlyingFinancialInstrument);
		return this;
	}

	public Optional<FinancialInstrumentStipulations> getStipulations() {
		return stipulations == null ? Optional.empty() : Optional.of(stipulations);
	}

	public ListStrikePriceDetails1 setStipulations(FinancialInstrumentStipulations stipulations) {
		this.stipulations = stipulations;
		return this;
	}

	public List<FinancialInstrumentStipulations> getUnderlyingStipulations() {
		return underlyingStipulations == null ? underlyingStipulations = new ArrayList<>() : underlyingStipulations;
	}

	public ListStrikePriceDetails1 setUnderlyingStipulations(List<FinancialInstrumentStipulations> underlyingStipulations) {
		this.underlyingStipulations = Objects.requireNonNull(underlyingStipulations);
		return this;
	}

	public Optional<FinancialInstrumentAttributes1> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public ListStrikePriceDetails1 setFinancialInstrumentAttributes(FinancialInstrumentAttributes1 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public List<FinancialInstrumentAttributes1> getUnderlyingFinancialInstrumentAttributes() {
		return underlyingFinancialInstrumentAttributes == null ? underlyingFinancialInstrumentAttributes = new ArrayList<>() : underlyingFinancialInstrumentAttributes;
	}

	public ListStrikePriceDetails1 setUnderlyingFinancialInstrumentAttributes(List<FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes) {
		this.underlyingFinancialInstrumentAttributes = Objects.requireNonNull(underlyingFinancialInstrumentAttributes);
		return this;
	}

	public SecurityIdentification7 getFinancialInstrument() {
		return financialInstrument;
	}

	public ListStrikePriceDetails1 setFinancialInstrument(SecurityIdentification7 financialInstrument) {
		this.financialInstrument = Objects.requireNonNull(financialInstrument);
		return this;
	}
}