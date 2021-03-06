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
import com.tools20022.repository.choice.Registration8Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax210Text;
import com.tools20022.repository.entity.BasicSecuritiesRegistration;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason of registration.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RegistrationReason4#mmCode
 * RegistrationReason4.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegistrationReason4#mmAdditionalInformation
 * RegistrationReason4.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
 * BasicSecuritiesRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegistrationReason4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason of registration."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RegistrationReason2
 * RegistrationReason2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegistrationReason4", propOrder = {"code", "additionalInformation"})
public class RegistrationReason4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected Registration8Choice code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Registration8Choice
	 * Registration8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmRegistrationInstruction
	 * BasicSecuritiesRegistration.mmRegistrationInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationReason4
	 * RegistrationReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reaoson of the holding status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RegistrationReason4, Registration8Choice> mmCode = new MMMessageAssociationEnd<RegistrationReason4, Registration8Choice>() {
		{
			businessElementTrace_lazy = () -> BasicSecuritiesRegistration.mmRegistrationInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegistrationReason4.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the reaoson of the holding status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Registration8Choice.mmObject();
		}

		@Override
		public Registration8Choice getValue(RegistrationReason4 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(RegistrationReason4 obj, Registration8Choice value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected RestrictedFINXMax210Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax210Text
	 * RestrictedFINXMax210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationReason4
	 * RegistrationReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional reason information that cannot be provided in a structured field."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RegistrationReason4, Optional<RestrictedFINXMax210Text>> mmAdditionalInformation = new MMMessageAttribute<RegistrationReason4, Optional<RestrictedFINXMax210Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegistrationReason4.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional reason information that cannot be provided in a structured field.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax210Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax210Text> getValue(RegistrationReason4 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(RegistrationReason4 obj, Optional<RestrictedFINXMax210Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegistrationReason4.mmCode, com.tools20022.repository.msg.RegistrationReason4.mmAdditionalInformation);
				trace_lazy = () -> BasicSecuritiesRegistration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegistrationReason4";
				definition = "Reason of registration.";
				previousVersion_lazy = () -> RegistrationReason2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Registration8Choice getCode() {
		return code;
	}

	public RegistrationReason4 setCode(Registration8Choice code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public Optional<RestrictedFINXMax210Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public RegistrationReason4 setAdditionalInformation(RestrictedFINXMax210Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}