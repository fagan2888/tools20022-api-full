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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.RestrictedFINXMax140Text;
import com.tools20022.repository.datatype.RestrictedFINZMax256Text;
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
 * Additional information with update description and date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation3#mmUpdateDescription
 * UpdatedURLlnformation3.mmUpdateDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation3#mmUpdateDate
 * UpdatedURLlnformation3.mmUpdateDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation3#mmURLAddress
 * UpdatedURLlnformation3.mmURLAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UpdatedURLlnformation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional information with update description and date."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UpdatedURLlnformation3", propOrder = {"updateDescription", "updateDate", "uRLAddress"})
public class UpdatedURLlnformation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UpdDesc")
	protected RestrictedFINXMax140Text updateDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax140Text
	 * RestrictedFINXMax140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation3
	 * UpdatedURLlnformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdDesc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amendments made to the narrative since the last message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedURLlnformation3, Optional<RestrictedFINXMax140Text>> mmUpdateDescription = new MMMessageAttribute<UpdatedURLlnformation3, Optional<RestrictedFINXMax140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedURLlnformation3.mmObject();
			isDerived = false;
			xmlTag = "UpdDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateDescription";
			definition = "Specifies the amendments made to the narrative since the last message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax140Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax140Text> getValue(UpdatedURLlnformation3 obj) {
			return obj.getUpdateDescription();
		}

		@Override
		public void setValue(UpdatedURLlnformation3 obj, Optional<RestrictedFINXMax140Text> value) {
			obj.setUpdateDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "UpdDt")
	protected ISODate updateDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation3
	 * UpdatedURLlnformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date at which the narrative has been updated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedURLlnformation3, Optional<ISODate>> mmUpdateDate = new MMMessageAttribute<UpdatedURLlnformation3, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedURLlnformation3.mmObject();
			isDerived = false;
			xmlTag = "UpdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateDate";
			definition = "Specifies the date at which the narrative has been updated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(UpdatedURLlnformation3 obj) {
			return obj.getUpdateDate();
		}

		@Override
		public void setValue(UpdatedURLlnformation3 obj, Optional<ISODate> value) {
			obj.setUpdateDate(value.orElse(null));
		}
	};
	@XmlElement(name = "URLAdr", required = true)
	protected RestrictedFINZMax256Text uRLAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINZMax256Text
	 * RestrictedFINZMax256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation3
	 * UpdatedURLlnformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "URLAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the web address, that is, the address for the Universal Resource Locator (URL), to use over the www (HTTP) service where additional information may be found."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::WEBB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedURLlnformation3, RestrictedFINZMax256Text> mmURLAddress = new MMMessageAttribute<UpdatedURLlnformation3, RestrictedFINZMax256Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedURLlnformation3.mmObject();
			isDerived = false;
			xmlTag = "URLAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::WEBB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URLAddress";
			definition = "Provides the web address, that is, the address for the Universal Resource Locator (URL), to use over the www (HTTP) service where additional information may be found.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINZMax256Text.mmObject();
		}

		@Override
		public RestrictedFINZMax256Text getValue(UpdatedURLlnformation3 obj) {
			return obj.getURLAddress();
		}

		@Override
		public void setValue(UpdatedURLlnformation3 obj, RestrictedFINZMax256Text value) {
			obj.setURLAddress(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UpdatedURLlnformation3.mmUpdateDescription, com.tools20022.repository.msg.UpdatedURLlnformation3.mmUpdateDate,
						com.tools20022.repository.msg.UpdatedURLlnformation3.mmURLAddress);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UpdatedURLlnformation3";
				definition = "Additional information with update description and date.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RestrictedFINXMax140Text> getUpdateDescription() {
		return updateDescription == null ? Optional.empty() : Optional.of(updateDescription);
	}

	public UpdatedURLlnformation3 setUpdateDescription(RestrictedFINXMax140Text updateDescription) {
		this.updateDescription = updateDescription;
		return this;
	}

	public Optional<ISODate> getUpdateDate() {
		return updateDate == null ? Optional.empty() : Optional.of(updateDate);
	}

	public UpdatedURLlnformation3 setUpdateDate(ISODate updateDate) {
		this.updateDate = updateDate;
		return this;
	}

	public RestrictedFINZMax256Text getURLAddress() {
		return uRLAddress;
	}

	public UpdatedURLlnformation3 setURLAddress(RestrictedFINZMax256Text uRLAddress) {
		this.uRLAddress = Objects.requireNonNull(uRLAddress);
		return this;
	}
}