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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Mandate5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the mandate that is being accepted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate3Choice#mmOriginalMandateIdentification
 * OriginalMandate3Choice.mmOriginalMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.OriginalMandate3Choice#mmOriginalMandate
 * OriginalMandate3Choice.mmOriginalMandate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalMandate3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the mandate that is being accepted."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.OriginalMandate4Choice
 * OriginalMandate4Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.OriginalMandate2Choice
 * OriginalMandate2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalMandate3Choice", propOrder = {"originalMandateIdentification", "originalMandate"})
public class OriginalMandate3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMndtId", required = true)
	protected Max35Text originalMandateIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate3Choice
	 * OriginalMandate3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice#mmOriginalMandateIdentification
	 * OriginalMandate4Choice.mmOriginalMandateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate2Choice#mmOriginalMandateIdentification
	 * OriginalMandate2Choice.mmOriginalMandateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalMandate3Choice, Max35Text> mmOriginalMandateIdentification = new MMMessageAttribute<OriginalMandate3Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.OriginalMandate3Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the original mandate.";
			nextVersions_lazy = () -> Arrays.asList(OriginalMandate4Choice.mmOriginalMandateIdentification);
			previousVersion_lazy = () -> OriginalMandate2Choice.mmOriginalMandateIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalMandate3Choice obj) {
			return obj.getOriginalMandateIdentification();
		}

		@Override
		public void setValue(OriginalMandate3Choice obj, Max35Text value) {
			obj.setOriginalMandateIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlMndt", required = true)
	protected Mandate5 originalMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Mandate5 Mandate5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate3Choice
	 * OriginalMandate3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the original mandate data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice#mmOriginalMandate
	 * OriginalMandate4Choice.mmOriginalMandate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate2Choice#mmOriginalMandate
	 * OriginalMandate2Choice.mmOriginalMandate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalMandate3Choice, Mandate5> mmOriginalMandate = new MMMessageAssociationEnd<OriginalMandate3Choice, Mandate5>() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.OriginalMandate3Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Provides the original mandate data.";
			nextVersions_lazy = () -> Arrays.asList(OriginalMandate4Choice.mmOriginalMandate);
			previousVersion_lazy = () -> OriginalMandate2Choice.mmOriginalMandate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Mandate5.mmObject();
		}

		@Override
		public Mandate5 getValue(OriginalMandate3Choice obj) {
			return obj.getOriginalMandate();
		}

		@Override
		public void setValue(OriginalMandate3Choice obj, Mandate5 value) {
			obj.setOriginalMandate(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OriginalMandate3Choice.mmOriginalMandateIdentification, com.tools20022.repository.choice.OriginalMandate3Choice.mmOriginalMandate);
				trace_lazy = () -> Mandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalMandate3Choice";
				definition = "Specifies the mandate that is being accepted.";
				nextVersions_lazy = () -> Arrays.asList(OriginalMandate4Choice.mmObject());
				previousVersion_lazy = () -> OriginalMandate2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalMandateIdentification() {
		return originalMandateIdentification;
	}

	public OriginalMandate3Choice setOriginalMandateIdentification(Max35Text originalMandateIdentification) {
		this.originalMandateIdentification = Objects.requireNonNull(originalMandateIdentification);
		return this;
	}

	public Mandate5 getOriginalMandate() {
		return originalMandate;
	}

	public OriginalMandate3Choice setOriginalMandate(Mandate5 originalMandate) {
		this.originalMandate = Objects.requireNonNull(originalMandate);
		return this;
	}
}