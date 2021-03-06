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
import com.tools20022.repository.datatype.LongDecimalNumber;
import com.tools20022.repository.entity.QuantityRatio;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Ratio expressed as a quotient of quantities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2#mmLongQuantity1
 * LongQuantityToQuantityRatio2.mmLongQuantity1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2#mmLongQuantity2
 * LongQuantityToQuantityRatio2.mmLongQuantity2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.QuantityRatio
 * QuantityRatio}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LongQuantityToQuantityRatio2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Ratio expressed as a quotient of quantities."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LongQuantityToQuantityRatio2", propOrder = {"longQuantity1", "longQuantity2"})
public class LongQuantityToQuantityRatio2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LngQty1", required = true)
	protected LongDecimalNumber longQuantity1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LongDecimalNumber
	 * LongDecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmQuantity1
	 * QuantityRatio.mmQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2
	 * LongQuantityToQuantityRatio2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngQty1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongQuantity1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "High precision numerator of the quotient of quantities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LongQuantityToQuantityRatio2, LongDecimalNumber> mmLongQuantity1 = new MMMessageAttribute<LongQuantityToQuantityRatio2, LongDecimalNumber>() {
		{
			businessElementTrace_lazy = () -> QuantityRatio.mmQuantity1;
			componentContext_lazy = () -> com.tools20022.repository.msg.LongQuantityToQuantityRatio2.mmObject();
			isDerived = false;
			xmlTag = "LngQty1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongQuantity1";
			definition = "High precision numerator of the quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LongDecimalNumber.mmObject();
		}

		@Override
		public LongDecimalNumber getValue(LongQuantityToQuantityRatio2 obj) {
			return obj.getLongQuantity1();
		}

		@Override
		public void setValue(LongQuantityToQuantityRatio2 obj, LongDecimalNumber value) {
			obj.setLongQuantity1(value);
		}
	};
	@XmlElement(name = "LngQty2", required = true)
	protected LongDecimalNumber longQuantity2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LongDecimalNumber
	 * LongDecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmQuantity2
	 * QuantityRatio.mmQuantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2
	 * LongQuantityToQuantityRatio2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngQty2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongQuantity2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "High precision denominator of the quotient of quantities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LongQuantityToQuantityRatio2, LongDecimalNumber> mmLongQuantity2 = new MMMessageAttribute<LongQuantityToQuantityRatio2, LongDecimalNumber>() {
		{
			businessElementTrace_lazy = () -> QuantityRatio.mmQuantity2;
			componentContext_lazy = () -> com.tools20022.repository.msg.LongQuantityToQuantityRatio2.mmObject();
			isDerived = false;
			xmlTag = "LngQty2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongQuantity2";
			definition = "High precision denominator of the quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LongDecimalNumber.mmObject();
		}

		@Override
		public LongDecimalNumber getValue(LongQuantityToQuantityRatio2 obj) {
			return obj.getLongQuantity2();
		}

		@Override
		public void setValue(LongQuantityToQuantityRatio2 obj, LongDecimalNumber value) {
			obj.setLongQuantity2(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LongQuantityToQuantityRatio2.mmLongQuantity1, com.tools20022.repository.msg.LongQuantityToQuantityRatio2.mmLongQuantity2);
				trace_lazy = () -> QuantityRatio.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LongQuantityToQuantityRatio2";
				definition = "Ratio expressed as a quotient of quantities.";
			}
		});
		return mmObject_lazy.get();
	}

	public LongDecimalNumber getLongQuantity1() {
		return longQuantity1;
	}

	public LongQuantityToQuantityRatio2 setLongQuantity1(LongDecimalNumber longQuantity1) {
		this.longQuantity1 = Objects.requireNonNull(longQuantity1);
		return this;
	}

	public LongDecimalNumber getLongQuantity2() {
		return longQuantity2;
	}

	public LongQuantityToQuantityRatio2 setLongQuantity2(LongDecimalNumber longQuantity2) {
		this.longQuantity2 = Objects.requireNonNull(longQuantity2);
		return this;
	}
}