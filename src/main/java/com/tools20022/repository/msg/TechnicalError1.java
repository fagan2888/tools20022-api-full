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
import com.tools20022.repository.choice.TechnicalError1Choice;
import com.tools20022.repository.codeset.ErrorSeverity1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies information concerning the technical error that prevented delivery
 * of the referenced messaging by the payment gateway application.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TechnicalError1#mmSeverity
 * TechnicalError1.mmSeverity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TechnicalError1#mmErrorCode
 * TechnicalError1.mmErrorCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TechnicalError1#mmDescription
 * TechnicalError1.mmDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TechnicalError1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies information concerning the technical error that prevented delivery of the referenced messaging by the payment gateway application."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TechnicalError1", propOrder = {"severity", "errorCode", "description"})
public class TechnicalError1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "svrty", required = true)
	protected ErrorSeverity1Code severity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorSeverity1Code
	 * ErrorSeverity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TechnicalError1
	 * TechnicalError1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "svrty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Severity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the severity of the related error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TechnicalError1, ErrorSeverity1Code> mmSeverity = new MMMessageAttribute<TechnicalError1, ErrorSeverity1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TechnicalError1.mmObject();
			isDerived = false;
			xmlTag = "svrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Severity";
			definition = "Indicates the severity of the related error.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ErrorSeverity1Code.mmObject();
		}

		@Override
		public ErrorSeverity1Code getValue(TechnicalError1 obj) {
			return obj.getSeverity();
		}

		@Override
		public void setValue(TechnicalError1 obj, ErrorSeverity1Code value) {
			obj.setSeverity(value);
		}
	};
	@XmlElement(name = "ErrCd", required = true)
	protected TechnicalError1Choice errorCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TechnicalError1Choice
	 * TechnicalError1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TechnicalError1
	 * TechnicalError1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ErrCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the error code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TechnicalError1, TechnicalError1Choice> mmErrorCode = new MMMessageAssociationEnd<TechnicalError1, TechnicalError1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TechnicalError1.mmObject();
			isDerived = false;
			xmlTag = "ErrCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorCode";
			definition = "Specifies the error code.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TechnicalError1Choice.mmObject();
		}

		@Override
		public TechnicalError1Choice getValue(TechnicalError1 obj) {
			return obj.getErrorCode();
		}

		@Override
		public void setValue(TechnicalError1 obj, TechnicalError1Choice value) {
			obj.setErrorCode(value);
		}
	};
	@XmlElement(name = "Desc", required = true)
	protected List<Max140Text> description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TechnicalError1
	 * TechnicalError1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specification of the error, in free format."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TechnicalError1, List<Max140Text>> mmDescription = new MMMessageAttribute<TechnicalError1, List<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TechnicalError1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Specification of the error, in free format.";
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public List<Max140Text> getValue(TechnicalError1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(TechnicalError1 obj, List<Max140Text> value) {
			obj.setDescription(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TechnicalError1.mmSeverity, com.tools20022.repository.msg.TechnicalError1.mmErrorCode, com.tools20022.repository.msg.TechnicalError1.mmDescription);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TechnicalError1";
				definition = "Specifies information concerning the technical error that prevented delivery of the referenced messaging by the payment gateway application.";
			}
		});
		return mmObject_lazy.get();
	}

	public ErrorSeverity1Code getSeverity() {
		return severity;
	}

	public TechnicalError1 setSeverity(ErrorSeverity1Code severity) {
		this.severity = Objects.requireNonNull(severity);
		return this;
	}

	public TechnicalError1Choice getErrorCode() {
		return errorCode;
	}

	public TechnicalError1 setErrorCode(TechnicalError1Choice errorCode) {
		this.errorCode = Objects.requireNonNull(errorCode);
		return this;
	}

	public List<Max140Text> getDescription() {
		return description == null ? description = new ArrayList<>() : description;
	}

	public TechnicalError1 setDescription(List<Max140Text> description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}
}