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
import com.tools20022.repository.choice.UnitsOrAmountOrPercentage1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument51;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates how the amount of the investment plan is split amongst the funds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition4#mmQuantity
 * Repartition4.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition4#mmFinancialInstrument
 * Repartition4.mmFinancialInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition4#mmCurrencyOfPlan
 * Repartition4.mmCurrencyOfPlan}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Repartition4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates how the amount of the investment plan is split amongst the funds."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition5 Repartition5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Repartition3
 * Repartition3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Repartition4", propOrder = {"quantity", "financialInstrument", "currencyOfPlan"})
public class Repartition4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Qty", required = true)
	protected UnitsOrAmountOrPercentage1Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitsOrAmountOrPercentage1Choice
	 * UnitsOrAmountOrPercentage1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Repartition4 Repartition4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount, units or percentage of financial instrument invested or withdrawn."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Repartition5#mmQuantity
	 * Repartition5.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Repartition3#mmQuantity
	 * Repartition3.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Repartition4, UnitsOrAmountOrPercentage1Choice> mmQuantity = new MMMessageAttribute<Repartition4, UnitsOrAmountOrPercentage1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Repartition4.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Amount, units or percentage of financial instrument invested or withdrawn.";
			nextVersions_lazy = () -> Arrays.asList(Repartition5.mmQuantity);
			previousVersion_lazy = () -> Repartition3.mmQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitsOrAmountOrPercentage1Choice.mmObject();
		}

		@Override
		public UnitsOrAmountOrPercentage1Choice getValue(Repartition4 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(Repartition4 obj, UnitsOrAmountOrPercentage1Choice value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "FinInstrm", required = true)
	protected FinancialInstrument51 financialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Repartition4 Repartition4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information about the security or investment fund."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Repartition5#mmFinancialInstrument
	 * Repartition5.mmFinancialInstrument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Repartition3#mmFinancialInstrument
	 * Repartition3.mmFinancialInstrument}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Repartition4, FinancialInstrument51> mmFinancialInstrument = new MMMessageAssociationEnd<Repartition4, FinancialInstrument51>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Repartition4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			definition = "Detailed information about the security or investment fund.";
			nextVersions_lazy = () -> Arrays.asList(Repartition5.mmFinancialInstrument);
			previousVersion_lazy = () -> Repartition3.mmFinancialInstrument;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument51.mmObject();
		}

		@Override
		public FinancialInstrument51 getValue(Repartition4 obj) {
			return obj.getFinancialInstrument();
		}

		@Override
		public void setValue(Repartition4 obj, FinancialInstrument51 value) {
			obj.setFinancialInstrument(value);
		}
	};
	@XmlElement(name = "CcyOfPlan")
	protected ActiveOrHistoricCurrencyCode currencyOfPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Repartition4 Repartition4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyOfPlan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOfPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When a fund has multiple currencies within same ISIN, this indicates the currency of the savings or withdrawal plan."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Repartition5#mmCurrencyOfPlan
	 * Repartition5.mmCurrencyOfPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Repartition3#mmCurrencyOfPlan
	 * Repartition3.mmCurrencyOfPlan}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Repartition4, Optional<ActiveOrHistoricCurrencyCode>> mmCurrencyOfPlan = new MMMessageAttribute<Repartition4, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Repartition4.mmObject();
			isDerived = false;
			xmlTag = "CcyOfPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOfPlan";
			definition = "When a fund has multiple currencies within same ISIN, this indicates the currency of the savings or withdrawal plan.";
			nextVersions_lazy = () -> Arrays.asList(Repartition5.mmCurrencyOfPlan);
			previousVersion_lazy = () -> Repartition3.mmCurrencyOfPlan;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(Repartition4 obj) {
			return obj.getCurrencyOfPlan();
		}

		@Override
		public void setValue(Repartition4 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setCurrencyOfPlan(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Repartition4.mmQuantity, com.tools20022.repository.msg.Repartition4.mmFinancialInstrument, com.tools20022.repository.msg.Repartition4.mmCurrencyOfPlan);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Repartition4";
				definition = "Indicates how the amount of the investment plan is split amongst the funds.";
				nextVersions_lazy = () -> Arrays.asList(Repartition5.mmObject());
				previousVersion_lazy = () -> Repartition3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public UnitsOrAmountOrPercentage1Choice getQuantity() {
		return quantity;
	}

	public Repartition4 setQuantity(UnitsOrAmountOrPercentage1Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public FinancialInstrument51 getFinancialInstrument() {
		return financialInstrument;
	}

	public Repartition4 setFinancialInstrument(FinancialInstrument51 financialInstrument) {
		this.financialInstrument = Objects.requireNonNull(financialInstrument);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getCurrencyOfPlan() {
		return currencyOfPlan == null ? Optional.empty() : Optional.of(currencyOfPlan);
	}

	public Repartition4 setCurrencyOfPlan(ActiveOrHistoricCurrencyCode currencyOfPlan) {
		this.currencyOfPlan = currencyOfPlan;
		return this;
	}
}