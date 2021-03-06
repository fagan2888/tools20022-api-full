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
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.SystemEventInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the Financial Institution responding to the request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ResponderDetails1#mmDateTimeStamp
 * ResponderDetails1.mmDateTimeStamp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ResponderDetails1#mmResponder
 * ResponderDetails1.mmResponder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResponderDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the Financial Institution responding to the request."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResponderDetails1", propOrder = {"dateTimeStamp", "responder"})
public class ResponderDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtTmStmp", required = true)
	protected ISODateTime dateTimeStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponderDetails1
	 * ResponderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTmStmp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the response was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponderDetails1, ISODateTime> mmDateTimeStamp = new MMMessageAttribute<ResponderDetails1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponderDetails1.mmObject();
			isDerived = false;
			xmlTag = "DtTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTimeStamp";
			definition = "Date and time at which the response was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ResponderDetails1 obj) {
			return obj.getDateTimeStamp();
		}

		@Override
		public void setValue(ResponderDetails1 obj, ISODateTime value) {
			obj.setDateTimeStamp(value);
		}
	};
	@XmlElement(name = "Rspndr", required = true)
	protected AnyBICIdentifier responder;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ResponderDetails1
	 * ResponderDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rspndr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Responder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the responder."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ResponderDetails1, AnyBICIdentifier> mmResponder = new MMMessageAttribute<ResponderDetails1, AnyBICIdentifier>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ResponderDetails1.mmObject();
			isDerived = false;
			xmlTag = "Rspndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Responder";
			definition = "Identification of the responder.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(ResponderDetails1 obj) {
			return obj.getResponder();
		}

		@Override
		public void setValue(ResponderDetails1 obj, AnyBICIdentifier value) {
			obj.setResponder(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ResponderDetails1.mmDateTimeStamp, com.tools20022.repository.msg.ResponderDetails1.mmResponder);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResponderDetails1";
				definition = "Details of the Financial Institution responding to the request.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getDateTimeStamp() {
		return dateTimeStamp;
	}

	public ResponderDetails1 setDateTimeStamp(ISODateTime dateTimeStamp) {
		this.dateTimeStamp = Objects.requireNonNull(dateTimeStamp);
		return this;
	}

	public AnyBICIdentifier getResponder() {
		return responder;
	}

	public ResponderDetails1 setResponder(AnyBICIdentifier responder) {
		this.responder = Objects.requireNonNull(responder);
		return this;
	}
}