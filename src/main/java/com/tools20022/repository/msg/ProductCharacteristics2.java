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
import com.tools20022.repository.choice.ProductCharacteristics1Choice;
import com.tools20022.repository.entity.ProductCharacteristics;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Quantity3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Product characteristic applicable to this trade product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProductCharacteristics2#mmCharacteristic
 * ProductCharacteristics2.mmCharacteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProductCharacteristics2#mmValueMeasure
 * ProductCharacteristics2.mmValueMeasure}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProductCharacteristics
 * ProductCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductCharacteristics2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Product characteristic applicable to this trade product."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProductCharacteristics3
 * ProductCharacteristics3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProductCharacteristics2", propOrder = {"characteristic", "valueMeasure"})
public class ProductCharacteristics2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Chrtc")
	protected ProductCharacteristics1Choice characteristic;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProductCharacteristics1Choice
	 * ProductCharacteristics1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductCharacteristics#mmCharacteristics
	 * ProductCharacteristics.mmCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProductCharacteristics2
	 * ProductCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrtc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Characteristic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Characteristics of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProductCharacteristics3#mmCharacteristic
	 * ProductCharacteristics3.mmCharacteristic}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProductCharacteristics2, Optional<ProductCharacteristics1Choice>> mmCharacteristic = new MMMessageAttribute<ProductCharacteristics2, Optional<ProductCharacteristics1Choice>>() {
		{
			businessElementTrace_lazy = () -> ProductCharacteristics.mmCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProductCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "Chrtc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Characteristic";
			definition = "Characteristics of the product.";
			nextVersions_lazy = () -> Arrays.asList(ProductCharacteristics3.mmCharacteristic);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProductCharacteristics1Choice.mmObject();
		}

		@Override
		public Optional<ProductCharacteristics1Choice> getValue(ProductCharacteristics2 obj) {
			return obj.getCharacteristic();
		}

		@Override
		public void setValue(ProductCharacteristics2 obj, Optional<ProductCharacteristics1Choice> value) {
			obj.setCharacteristic(value.orElse(null));
		}
	};
	@XmlElement(name = "ValMeasr")
	protected Quantity3 valueMeasure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProductCharacteristics2
	 * ProductCharacteristics2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValMeasr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Measurement value for this product characteristic."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProductCharacteristics3#mmValueMeasure
	 * ProductCharacteristics3.mmValueMeasure}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProductCharacteristics2, Optional<Quantity3>> mmValueMeasure = new MMMessageAttribute<ProductCharacteristics2, Optional<Quantity3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProductCharacteristics2.mmObject();
			isDerived = false;
			xmlTag = "ValMeasr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueMeasure";
			definition = "Measurement value for this product characteristic.";
			nextVersions_lazy = () -> Arrays.asList(ProductCharacteristics3.mmValueMeasure);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3.mmObject();
		}

		@Override
		public Optional<Quantity3> getValue(ProductCharacteristics2 obj) {
			return obj.getValueMeasure();
		}

		@Override
		public void setValue(ProductCharacteristics2 obj, Optional<Quantity3> value) {
			obj.setValueMeasure(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProductCharacteristics2.mmCharacteristic, com.tools20022.repository.msg.ProductCharacteristics2.mmValueMeasure);
				trace_lazy = () -> ProductCharacteristics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCharacteristics2";
				definition = "Product characteristic applicable to this trade product.";
				nextVersions_lazy = () -> Arrays.asList(ProductCharacteristics3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ProductCharacteristics1Choice> getCharacteristic() {
		return characteristic == null ? Optional.empty() : Optional.of(characteristic);
	}

	public ProductCharacteristics2 setCharacteristic(ProductCharacteristics1Choice characteristic) {
		this.characteristic = characteristic;
		return this;
	}

	public Optional<Quantity3> getValueMeasure() {
		return valueMeasure == null ? Optional.empty() : Optional.of(valueMeasure);
	}

	public ProductCharacteristics2 setValueMeasure(Quantity3 valueMeasure) {
		this.valueMeasure = valueMeasure;
		return this;
	}
}