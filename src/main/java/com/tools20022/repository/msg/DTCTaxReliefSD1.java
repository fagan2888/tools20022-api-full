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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about tax relief categories.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DTCTaxReliefSD1#mmCategoryIdentification
 * DTCTaxReliefSD1.mmCategoryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DTCTaxReliefSD1#mmCategoryDescription
 * DTCTaxReliefSD1.mmCategoryDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCTaxReliefSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about tax relief categories."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DTCTaxReliefSD1", propOrder = {"categoryIdentification", "categoryDescription"})
public class DTCTaxReliefSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtgyId", required = true)
	protected Exact3NumericText categoryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DTCTaxReliefSD1
	 * DTCTaxReliefSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC System assigned identification for tax relief category."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Tax Relief Category Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DTCTaxReliefSD1, Exact3NumericText> mmCategoryIdentification = new MMMessageAttribute<DTCTaxReliefSD1, Exact3NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DTCTaxReliefSD1.mmObject();
			isDerived = false;
			xmlTag = "CtgyId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Tax Relief Category Identification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryIdentification";
			definition = "DTC System assigned identification for tax relief category.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(DTCTaxReliefSD1 obj) {
			return obj.getCategoryIdentification();
		}

		@Override
		public void setValue(DTCTaxReliefSD1 obj, Exact3NumericText value) {
			obj.setCategoryIdentification(value);
		}
	};
	@XmlElement(name = "CtgyDesc", required = true)
	protected Max35Text categoryDescription;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DTCTaxReliefSD1
	 * DTCTaxReliefSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyDesc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes tax relief category."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Tax Relief Category Description</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DTCTaxReliefSD1, Max35Text> mmCategoryDescription = new MMMessageAttribute<DTCTaxReliefSD1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DTCTaxReliefSD1.mmObject();
			isDerived = false;
			xmlTag = "CtgyDesc";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Tax Relief Category Description"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryDescription";
			definition = "Describes tax relief category.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DTCTaxReliefSD1 obj) {
			return obj.getCategoryDescription();
		}

		@Override
		public void setValue(DTCTaxReliefSD1 obj, Max35Text value) {
			obj.setCategoryDescription(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DTCTaxReliefSD1.mmCategoryIdentification, com.tools20022.repository.msg.DTCTaxReliefSD1.mmCategoryDescription);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DTCTaxReliefSD1";
				definition = "Provides information about tax relief categories.";
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getCategoryIdentification() {
		return categoryIdentification;
	}

	public DTCTaxReliefSD1 setCategoryIdentification(Exact3NumericText categoryIdentification) {
		this.categoryIdentification = Objects.requireNonNull(categoryIdentification);
		return this;
	}

	public Max35Text getCategoryDescription() {
		return categoryDescription;
	}

	public DTCTaxReliefSD1 setCategoryDescription(Max35Text categoryDescription) {
		this.categoryDescription = Objects.requireNonNull(categoryDescription);
		return this;
	}
}