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
import com.tools20022.repository.codeset.Priority1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InformationQualifier;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Further qualifies the information provided in terms of its importance and its
 * format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InformationQualifierType#mmIsFormatted
 * InformationQualifierType.mmIsFormatted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InformationQualifierType#mmPriority
 * InformationQualifierType.mmPriority}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InformationQualifier
 * InformationQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InformationQualifierType"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further qualifies the information provided in terms of its importance and its format."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InformationQualifierType1
 * InformationQualifierType1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InformationQualifierType", propOrder = {"isFormatted", "priority"})
public class InformationQualifierType {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IsFrmtd")
	protected YesNoIndicator isFormatted;
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
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier#mmIsFormatted
	 * InformationQualifier.mmIsFormatted}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InformationQualifierType
	 * InformationQualifierType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsFrmtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IsFormatted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the information is formatted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformationQualifierType1#mmIsFormatted
	 * InformationQualifierType1.mmIsFormatted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InformationQualifierType, Optional<YesNoIndicator>> mmIsFormatted = new MMMessageAttribute<InformationQualifierType, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> InformationQualifier.mmIsFormatted;
			componentContext_lazy = () -> com.tools20022.repository.msg.InformationQualifierType.mmObject();
			isDerived = false;
			xmlTag = "IsFrmtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IsFormatted";
			definition = "Indicates whether the information is formatted.";
			nextVersions_lazy = () -> Arrays.asList(InformationQualifierType1.mmIsFormatted);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InformationQualifierType obj) {
			return obj.getIsFormatted();
		}

		@Override
		public void setValue(InformationQualifierType obj, Optional<YesNoIndicator> value) {
			obj.setIsFormatted(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected Priority1Code priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority1Code
	 * Priority1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier#mmPriority
	 * InformationQualifier.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InformationQualifierType
	 * InformationQualifierType}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority of the information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformationQualifierType1#mmPriority
	 * InformationQualifierType1.mmPriority}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InformationQualifierType, Optional<Priority1Code>> mmPriority = new MMMessageAttribute<InformationQualifierType, Optional<Priority1Code>>() {
		{
			businessElementTrace_lazy = () -> InformationQualifier.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.InformationQualifierType.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Priority of the information.";
			nextVersions_lazy = () -> Arrays.asList(InformationQualifierType1.mmPriority);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority1Code.mmObject();
		}

		@Override
		public Optional<Priority1Code> getValue(InformationQualifierType obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(InformationQualifierType obj, Optional<Priority1Code> value) {
			obj.setPriority(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InformationQualifierType.mmIsFormatted, com.tools20022.repository.msg.InformationQualifierType.mmPriority);
				trace_lazy = () -> InformationQualifier.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InformationQualifierType";
				definition = "Further qualifies the information provided in terms of its importance and its format.";
				nextVersions_lazy = () -> Arrays.asList(InformationQualifierType1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getIsFormatted() {
		return isFormatted == null ? Optional.empty() : Optional.of(isFormatted);
	}

	public InformationQualifierType setIsFormatted(YesNoIndicator isFormatted) {
		this.isFormatted = isFormatted;
		return this;
	}

	public Optional<Priority1Code> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public InformationQualifierType setPriority(Priority1Code priority) {
		this.priority = priority;
		return this;
	}
}