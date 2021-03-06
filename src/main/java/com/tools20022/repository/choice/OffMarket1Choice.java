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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OffMarket1Code;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice for specifying how the trade was executed off-market.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OffMarket1Choice#mmOffMarketIndicator
 * OffMarket1Choice.mmOffMarketIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OffMarket1Choice#mmSystematicInternaliser
 * OffMarket1Choice.mmSystematicInternaliser}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
 * SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OffMarket1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice for specifying how the trade was executed off-market."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OffMarket1Choice", propOrder = {"offMarketIndicator", "systematicInternaliser"})
public class OffMarket1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OffMktInd", required = true)
	protected OffMarket1Code offMarketIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OffMarket1Code
	 * OffMarket1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmOffMarketReason
	 * SecuritiesTradeExecution.mmOffMarketReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OffMarket1Choice
	 * OffMarket1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffMktInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffMarketIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade was executed off-exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OffMarket1Choice, OffMarket1Code> mmOffMarketIndicator = new MMMessageAttribute<OffMarket1Choice, OffMarket1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmOffMarketReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.OffMarket1Choice.mmObject();
			isDerived = false;
			xmlTag = "OffMktInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffMarketIndicator";
			definition = "Indicates that the trade was executed off-exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffMarket1Code.mmObject();
		}

		@Override
		public OffMarket1Code getValue(OffMarket1Choice obj) {
			return obj.getOffMarketIndicator();
		}

		@Override
		public void setValue(OffMarket1Choice obj, OffMarket1Code value) {
			obj.setOffMarketIndicator(value);
		}
	};
	@XmlElement(name = "SystmtcIntlr", required = true)
	protected AnyBICIdentifier systematicInternaliser;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OffMarket1Choice
	 * OffMarket1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SystmtcIntlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystematicInternaliser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the BIC code of the systematic internaliser."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OffMarket1Choice, AnyBICIdentifier> mmSystematicInternaliser = new MMMessageAttribute<OffMarket1Choice, AnyBICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.OffMarket1Choice.mmObject();
			isDerived = false;
			xmlTag = "SystmtcIntlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystematicInternaliser";
			definition = "Provides the BIC code of the systematic internaliser.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(OffMarket1Choice obj) {
			return obj.getSystematicInternaliser();
		}

		@Override
		public void setValue(OffMarket1Choice obj, AnyBICIdentifier value) {
			obj.setSystematicInternaliser(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OffMarket1Choice.mmOffMarketIndicator, com.tools20022.repository.choice.OffMarket1Choice.mmSystematicInternaliser);
				trace_lazy = () -> SecuritiesTradeExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OffMarket1Choice";
				definition = "Choice for specifying how the trade was executed off-market.";
			}
		});
		return mmObject_lazy.get();
	}

	public OffMarket1Code getOffMarketIndicator() {
		return offMarketIndicator;
	}

	public OffMarket1Choice setOffMarketIndicator(OffMarket1Code offMarketIndicator) {
		this.offMarketIndicator = Objects.requireNonNull(offMarketIndicator);
		return this;
	}

	public AnyBICIdentifier getSystematicInternaliser() {
		return systematicInternaliser;
	}

	public OffMarket1Choice setSystematicInternaliser(AnyBICIdentifier systematicInternaliser) {
		this.systematicInternaliser = Objects.requireNonNull(systematicInternaliser);
		return this;
	}
}