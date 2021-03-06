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
import com.tools20022.repository.codeset.RequestType1Code;
import com.tools20022.repository.codeset.RequestType2Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the type of action to be performed in the request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RequestType1Choice#mmPaymentControl
 * RequestType1Choice.mmPaymentControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RequestType1Choice#mmEnquiry
 * RequestType1Choice.mmEnquiry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the type of action to be performed in the request."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestType1Choice", propOrder = {"paymentControl", "enquiry"})
public class RequestType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCtrl", required = true)
	protected RequestType1Code paymentControl;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RequestType1Code
	 * RequestType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RequestType1Choice
	 * RequestType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCtrl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request type is a control command on a set of transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestType1Choice, RequestType1Code> mmPaymentControl = new MMMessageAttribute<RequestType1Choice, RequestType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RequestType1Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtCtrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentControl";
			definition = "Request type is a control command on a set of transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestType1Code.mmObject();
		}

		@Override
		public RequestType1Code getValue(RequestType1Choice obj) {
			return obj.getPaymentControl();
		}

		@Override
		public void setValue(RequestType1Choice obj, RequestType1Code value) {
			obj.setPaymentControl(value);
		}
	};
	@XmlElement(name = "Enqry", required = true)
	protected RequestType2Code enquiry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RequestType2Code
	 * RequestType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RequestType1Choice
	 * RequestType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Enqry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request type is an enquiry on the a position or a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestType1Choice, RequestType2Code> mmEnquiry = new MMMessageAttribute<RequestType1Choice, RequestType2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RequestType1Choice.mmObject();
			isDerived = false;
			xmlTag = "Enqry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enquiry";
			definition = "Request type is an enquiry on the a position or a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestType2Code.mmObject();
		}

		@Override
		public RequestType2Code getValue(RequestType1Choice obj) {
			return obj.getEnquiry();
		}

		@Override
		public void setValue(RequestType1Choice obj, RequestType2Code value) {
			obj.setEnquiry(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RequestType1Choice.mmPaymentControl, com.tools20022.repository.choice.RequestType1Choice.mmEnquiry);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RequestType1Choice";
				definition = "Defines the type of action to be performed in the request.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestType1Code getPaymentControl() {
		return paymentControl;
	}

	public RequestType1Choice setPaymentControl(RequestType1Code paymentControl) {
		this.paymentControl = Objects.requireNonNull(paymentControl);
		return this;
	}

	public RequestType2Code getEnquiry() {
		return enquiry;
	}

	public RequestType1Choice setEnquiry(RequestType2Code enquiry) {
		this.enquiry = Objects.requireNonNull(enquiry);
		return this;
	}
}