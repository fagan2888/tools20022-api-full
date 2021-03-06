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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Goods;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Quantity4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics of the goods that are certified, in the context of a
 * commercial trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmOrigin
 * CertifiedCharacteristics1Choice.mmOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmQuality
 * CertifiedCharacteristics1Choice.mmQuality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmAnalysis
 * CertifiedCharacteristics1Choice.mmAnalysis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmWeight
 * CertifiedCharacteristics1Choice.mmWeight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmQuantity
 * CertifiedCharacteristics1Choice.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmHealthIndication
 * CertifiedCharacteristics1Choice.mmHealthIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice#mmPhytosanitaryIndication
 * CertifiedCharacteristics1Choice.mmPhytosanitaryIndication}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CertifiedCharacteristics1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics of the goods that are certified, in the context of a commercial trade transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice
 * CertifiedCharacteristics2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CertifiedCharacteristics1Choice", propOrder = {"origin", "quality", "analysis", "weight", "quantity", "healthIndication", "phytosanitaryIndication"})
public class CertifiedCharacteristics1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Orgn", required = true)
	protected CountryCode origin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmOrigin
	 * Product.mmOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
	 * CertifiedCharacteristics1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Orgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Origin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of origin of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmOrigin
	 * CertifiedCharacteristics2Choice.mmOrigin}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertifiedCharacteristics1Choice, CountryCode> mmOrigin = new MMMessageAttribute<CertifiedCharacteristics1Choice, CountryCode>() {
		{
			businessElementTrace_lazy = () -> Product.mmOrigin;
			componentContext_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmObject();
			isDerived = false;
			xmlTag = "Orgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Origin";
			definition = "Country of origin of the goods, as proven by the certificate.";
			nextVersions_lazy = () -> Arrays.asList(CertifiedCharacteristics2Choice.mmOrigin);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(CertifiedCharacteristics1Choice obj) {
			return obj.getOrigin();
		}

		@Override
		public void setValue(CertifiedCharacteristics1Choice obj, CountryCode value) {
			obj.setOrigin(value);
		}
	};
	@XmlElement(name = "Qlty", required = true)
	protected Max70Text quality;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuality
	 * Product.mmQuality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
	 * CertifiedCharacteristics1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qlty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quality of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuality
	 * CertifiedCharacteristics2Choice.mmQuality}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertifiedCharacteristics1Choice, Max70Text> mmQuality = new MMMessageAttribute<CertifiedCharacteristics1Choice, Max70Text>() {
		{
			businessElementTrace_lazy = () -> Product.mmQuality;
			componentContext_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmObject();
			isDerived = false;
			xmlTag = "Qlty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quality";
			definition = "Quality of the goods, as proven by the certificate.";
			nextVersions_lazy = () -> Arrays.asList(CertifiedCharacteristics2Choice.mmQuality);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(CertifiedCharacteristics1Choice obj) {
			return obj.getQuality();
		}

		@Override
		public void setValue(CertifiedCharacteristics1Choice obj, Max70Text value) {
			obj.setQuality(value);
		}
	};
	@XmlElement(name = "Anlys", required = true)
	protected Max70Text analysis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmAnalysis
	 * Goods.mmAnalysis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
	 * CertifiedCharacteristics1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Anlys"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Analysis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Analysis of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmAnalysis
	 * CertifiedCharacteristics2Choice.mmAnalysis}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertifiedCharacteristics1Choice, Max70Text> mmAnalysis = new MMMessageAttribute<CertifiedCharacteristics1Choice, Max70Text>() {
		{
			businessElementTrace_lazy = () -> Goods.mmAnalysis;
			componentContext_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmObject();
			isDerived = false;
			xmlTag = "Anlys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Analysis";
			definition = "Analysis of the goods, as proven by the certificate.";
			nextVersions_lazy = () -> Arrays.asList(CertifiedCharacteristics2Choice.mmAnalysis);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(CertifiedCharacteristics1Choice obj) {
			return obj.getAnalysis();
		}

		@Override
		public void setValue(CertifiedCharacteristics1Choice obj, Max70Text value) {
			obj.setAnalysis(value);
		}
	};
	@XmlElement(name = "Wght", required = true)
	protected Quantity4 weight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity4
	 * Quantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
	 * CertifiedCharacteristics1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wght"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Weight of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmWeight
	 * CertifiedCharacteristics2Choice.mmWeight}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertifiedCharacteristics1Choice, Quantity4> mmWeight = new MMMessageAttribute<CertifiedCharacteristics1Choice, Quantity4>() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmObject();
			isDerived = false;
			xmlTag = "Wght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weight";
			definition = "Weight of the goods, as proven by the certificate.";
			nextVersions_lazy = () -> Arrays.asList(CertifiedCharacteristics2Choice.mmWeight);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity4.mmObject();
		}

		@Override
		public Quantity4 getValue(CertifiedCharacteristics1Choice obj) {
			return obj.getWeight();
		}

		@Override
		public void setValue(CertifiedCharacteristics1Choice obj, Quantity4 value) {
			obj.setWeight(value);
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected Quantity4 quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity4
	 * Quantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
	 * CertifiedCharacteristics1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of the goods, as proven by the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmQuantity
	 * CertifiedCharacteristics2Choice.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertifiedCharacteristics1Choice, Quantity4> mmQuantity = new MMMessageAttribute<CertifiedCharacteristics1Choice, Quantity4>() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of the goods, as proven by the certificate.";
			nextVersions_lazy = () -> Arrays.asList(CertifiedCharacteristics2Choice.mmQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity4.mmObject();
		}

		@Override
		public Quantity4 getValue(CertifiedCharacteristics1Choice obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(CertifiedCharacteristics1Choice obj, Quantity4 value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "HlthIndctn", required = true)
	protected YesNoIndicator healthIndication;
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
	 * {@linkplain com.tools20022.repository.entity.Goods#mmHealthCheck
	 * Goods.mmHealthCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
	 * CertifiedCharacteristics1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HlthIndctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HealthIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the goods have passed the health check."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmHealthIndication
	 * CertifiedCharacteristics2Choice.mmHealthIndication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertifiedCharacteristics1Choice, YesNoIndicator> mmHealthIndication = new MMMessageAttribute<CertifiedCharacteristics1Choice, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Goods.mmHealthCheck;
			componentContext_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmObject();
			isDerived = false;
			xmlTag = "HlthIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HealthIndication";
			definition = "Indicates if the goods have passed the health check.";
			nextVersions_lazy = () -> Arrays.asList(CertifiedCharacteristics2Choice.mmHealthIndication);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CertifiedCharacteristics1Choice obj) {
			return obj.getHealthIndication();
		}

		@Override
		public void setValue(CertifiedCharacteristics1Choice obj, YesNoIndicator value) {
			obj.setHealthIndication(value);
		}
	};
	@XmlElement(name = "PhytosntryIndctn", required = true)
	protected YesNoIndicator phytosanitaryIndication;
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
	 * {@linkplain com.tools20022.repository.entity.Goods#mmPhytosanitaryInspection
	 * Goods.mmPhytosanitaryInspection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics1Choice
	 * CertifiedCharacteristics1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhytosntryIndctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhytosanitaryIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the goods have passed the phytosanitary check."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertifiedCharacteristics2Choice#mmPhytosanitaryIndication
	 * CertifiedCharacteristics2Choice.mmPhytosanitaryIndication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CertifiedCharacteristics1Choice, YesNoIndicator> mmPhytosanitaryIndication = new MMMessageAttribute<CertifiedCharacteristics1Choice, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Goods.mmPhytosanitaryInspection;
			componentContext_lazy = () -> com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmObject();
			isDerived = false;
			xmlTag = "PhytosntryIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhytosanitaryIndication";
			definition = "Indicates if the goods have passed the phytosanitary check.";
			nextVersions_lazy = () -> Arrays.asList(CertifiedCharacteristics2Choice.mmPhytosanitaryIndication);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CertifiedCharacteristics1Choice obj) {
			return obj.getPhytosanitaryIndication();
		}

		@Override
		public void setValue(CertifiedCharacteristics1Choice obj, YesNoIndicator value) {
			obj.setPhytosanitaryIndication(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmOrigin, com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmQuality,
						com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmAnalysis, com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmWeight,
						com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmQuantity, com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmHealthIndication,
						com.tools20022.repository.choice.CertifiedCharacteristics1Choice.mmPhytosanitaryIndication);
				trace_lazy = () -> Product.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CertifiedCharacteristics1Choice";
				definition = "Characteristics of the goods that are certified, in the context of a commercial trade transaction.";
				nextVersions_lazy = () -> Arrays.asList(CertifiedCharacteristics2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getOrigin() {
		return origin;
	}

	public CertifiedCharacteristics1Choice setOrigin(CountryCode origin) {
		this.origin = Objects.requireNonNull(origin);
		return this;
	}

	public Max70Text getQuality() {
		return quality;
	}

	public CertifiedCharacteristics1Choice setQuality(Max70Text quality) {
		this.quality = Objects.requireNonNull(quality);
		return this;
	}

	public Max70Text getAnalysis() {
		return analysis;
	}

	public CertifiedCharacteristics1Choice setAnalysis(Max70Text analysis) {
		this.analysis = Objects.requireNonNull(analysis);
		return this;
	}

	public Quantity4 getWeight() {
		return weight;
	}

	public CertifiedCharacteristics1Choice setWeight(Quantity4 weight) {
		this.weight = Objects.requireNonNull(weight);
		return this;
	}

	public Quantity4 getQuantity() {
		return quantity;
	}

	public CertifiedCharacteristics1Choice setQuantity(Quantity4 quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public YesNoIndicator getHealthIndication() {
		return healthIndication;
	}

	public CertifiedCharacteristics1Choice setHealthIndication(YesNoIndicator healthIndication) {
		this.healthIndication = Objects.requireNonNull(healthIndication);
		return this;
	}

	public YesNoIndicator getPhytosanitaryIndication() {
		return phytosanitaryIndication;
	}

	public CertifiedCharacteristics1Choice setPhytosanitaryIndication(YesNoIndicator phytosanitaryIndication) {
		this.phytosanitaryIndication = Objects.requireNonNull(phytosanitaryIndication);
		return this;
	}
}