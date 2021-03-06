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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PrePaymentSpeed1Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.PrePaymentSpeed;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the type and rate of prepayment speed of the fixed income
 * instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PrePaymentSpeed1#mmType
 * PrePaymentSpeed1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PrePaymentSpeed1#mmRate
 * PrePaymentSpeed1.mmRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PrePaymentSpeed
 * PrePaymentSpeed}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PrePaymentSpeed1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type and rate of prepayment speed of the fixed income instrument."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PrePaymentSpeed1", propOrder = {"type", "rate"})
public class PrePaymentSpeed1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected PrePaymentSpeed1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code
	 * PrePaymentSpeed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrePaymentSpeed#mmType
	 * PrePaymentSpeed.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PrePaymentSpeed1
	 * PrePaymentSpeed1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of prepayment speed of the fixed income instrument in coded form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PrePaymentSpeed1, PrePaymentSpeed1Code> mmType = new MMMessageAttribute<PrePaymentSpeed1, PrePaymentSpeed1Code>() {
		{
			businessElementTrace_lazy = () -> PrePaymentSpeed.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PrePaymentSpeed1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of prepayment speed of the fixed income instrument in coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PrePaymentSpeed1Code.mmObject();
		}

		@Override
		public PrePaymentSpeed1Code getValue(PrePaymentSpeed1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PrePaymentSpeed1 obj, PrePaymentSpeed1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Rate", required = true)
	protected PercentageRate rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrePaymentSpeed#mmRate
	 * PrePaymentSpeed.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PrePaymentSpeed1
	 * PrePaymentSpeed1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of prepayment speed of the fixed income instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PrePaymentSpeed1, PercentageRate> mmRate = new MMMessageAttribute<PrePaymentSpeed1, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> PrePaymentSpeed.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PrePaymentSpeed1.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Rate of prepayment speed of the fixed income instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(PrePaymentSpeed1 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(PrePaymentSpeed1 obj, PercentageRate value) {
			obj.setRate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PrePaymentSpeed1.mmType, com.tools20022.repository.msg.PrePaymentSpeed1.mmRate);
				trace_lazy = () -> PrePaymentSpeed.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PrePaymentSpeed1";
				definition = "Specifies the type and rate of prepayment speed of the fixed income instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public PrePaymentSpeed1Code getType() {
		return type;
	}

	public PrePaymentSpeed1 setType(PrePaymentSpeed1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public PrePaymentSpeed1 setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}
}