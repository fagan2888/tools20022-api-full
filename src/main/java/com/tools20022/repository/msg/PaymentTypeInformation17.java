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
import com.tools20022.repository.choice.LocalInstrument1Choice;
import com.tools20022.repository.codeset.PaymentCategoryPurpose1Code;
import com.tools20022.repository.codeset.Priority2Code;
import com.tools20022.repository.codeset.SequenceType1Code;
import com.tools20022.repository.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ServiceLevel5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements that further details the information related to the type of
 * payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmInstructionPriority
 * PaymentTypeInformation17.mmInstructionPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmServiceLevel
 * PaymentTypeInformation17.mmServiceLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmLocalInstrument
 * PaymentTypeInformation17.mmLocalInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmSequenceType
 * PaymentTypeInformation17.mmSequenceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17#mmCategoryPurpose
 * PaymentTypeInformation17.mmCategoryPurpose}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
 * PaymentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTypeInformation17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements that further details the information related to the type of payment."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTypeInformation17", propOrder = {"instructionPriority", "serviceLevel", "localInstrument", "sequenceType", "categoryPurpose"})
public class PaymentTypeInformation17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrPrty")
	protected Priority2Code instructionPriority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Priority2Code
	 * Priority2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPriority
	 * PaymentProcessing.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17
	 * PaymentTypeInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionPriority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTypeInformation17, Optional<Priority2Code>> mmInstructionPriority = new MMMessageAttribute<PaymentTypeInformation17, Optional<Priority2Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation17.mmObject();
			isDerived = false;
			xmlTag = "InstrPrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionPriority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Priority2Code.mmObject();
		}

		@Override
		public Optional<Priority2Code> getValue(PaymentTypeInformation17 obj) {
			return obj.getInstructionPriority();
		}

		@Override
		public void setValue(PaymentTypeInformation17 obj, Optional<Priority2Code> value) {
			obj.setInstructionPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "SvcLvl", required = true)
	protected ServiceLevel5 serviceLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ServiceLevel5
	 * ServiceLevel5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
	 * PaymentProcessing.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17
	 * PaymentTypeInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which or rules under which the transaction should be processed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTypeInformation17, ServiceLevel5> mmServiceLevel = new MMMessageAssociationEnd<PaymentTypeInformation17, ServiceLevel5>() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmServiceLevel;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation17.mmObject();
			isDerived = false;
			xmlTag = "SvcLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ServiceLevel5.mmObject();
		}

		@Override
		public ServiceLevel5 getValue(PaymentTypeInformation17 obj) {
			return obj.getServiceLevel();
		}

		@Override
		public void setValue(PaymentTypeInformation17 obj, ServiceLevel5 value) {
			obj.setServiceLevel(value);
		}
	};
	@XmlElement(name = "LclInstrm")
	protected LocalInstrument1Choice localInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LocalInstrument1Choice
	 * LocalInstrument1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmLocalInstrument
	 * PaymentProcessing.mmLocalInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17
	 * PaymentTypeInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LclInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User community specific instrument.\n\nUsage: When available, codes provided by local authorities should be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTypeInformation17, Optional<LocalInstrument1Choice>> mmLocalInstrument = new MMMessageAssociationEnd<PaymentTypeInformation17, Optional<LocalInstrument1Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmLocalInstrument;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation17.mmObject();
			isDerived = false;
			xmlTag = "LclInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\n\nUsage: When available, codes provided by local authorities should be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LocalInstrument1Choice.mmObject();
		}

		@Override
		public Optional<LocalInstrument1Choice> getValue(PaymentTypeInformation17 obj) {
			return obj.getLocalInstrument();
		}

		@Override
		public void setValue(PaymentTypeInformation17 obj, Optional<LocalInstrument1Choice> value) {
			obj.setLocalInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqTp", required = true)
	protected SequenceType1Code sequenceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceType1Code
	 * SequenceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmSequenceType
	 * PaymentProcessing.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17
	 * PaymentTypeInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the direct debit sequence, eg, first, recurrent, final or one-off."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTypeInformation17, SequenceType1Code> mmSequenceType = new MMMessageAttribute<PaymentTypeInformation17, SequenceType1Code>() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmSequenceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation17.mmObject();
			isDerived = false;
			xmlTag = "SeqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceType";
			definition = "Identifies the direct debit sequence, eg, first, recurrent, final or one-off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SequenceType1Code.mmObject();
		}

		@Override
		public SequenceType1Code getValue(PaymentTypeInformation17 obj) {
			return obj.getSequenceType();
		}

		@Override
		public void setValue(PaymentTypeInformation17 obj, SequenceType1Code value) {
			obj.setSequenceType(value);
		}
	};
	@XmlElement(name = "CtgyPurp")
	protected PaymentCategoryPurpose1Code categoryPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmCategoryPurpose
	 * PaymentProcessing.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation17
	 * PaymentTypeInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyPurp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the high level purpose of the instruction based on a set of pre-defined categories."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentTypeInformation17, Optional<PaymentCategoryPurpose1Code>> mmCategoryPurpose = new MMMessageAttribute<PaymentTypeInformation17, Optional<PaymentCategoryPurpose1Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmCategoryPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation17.mmObject();
			isDerived = false;
			xmlTag = "CtgyPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}

		@Override
		public Optional<PaymentCategoryPurpose1Code> getValue(PaymentTypeInformation17 obj) {
			return obj.getCategoryPurpose();
		}

		@Override
		public void setValue(PaymentTypeInformation17 obj, Optional<PaymentCategoryPurpose1Code> value) {
			obj.setCategoryPurpose(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation17.mmInstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation17.mmServiceLevel,
						com.tools20022.repository.msg.PaymentTypeInformation17.mmLocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation17.mmSequenceType,
						com.tools20022.repository.msg.PaymentTypeInformation17.mmCategoryPurpose);
				trace_lazy = () -> PaymentProcessing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentTypeInformation17";
				definition = "Set of elements that further details the information related to the type of payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Priority2Code> getInstructionPriority() {
		return instructionPriority == null ? Optional.empty() : Optional.of(instructionPriority);
	}

	public PaymentTypeInformation17 setInstructionPriority(Priority2Code instructionPriority) {
		this.instructionPriority = instructionPriority;
		return this;
	}

	public ServiceLevel5 getServiceLevel() {
		return serviceLevel;
	}

	public PaymentTypeInformation17 setServiceLevel(ServiceLevel5 serviceLevel) {
		this.serviceLevel = Objects.requireNonNull(serviceLevel);
		return this;
	}

	public Optional<LocalInstrument1Choice> getLocalInstrument() {
		return localInstrument == null ? Optional.empty() : Optional.of(localInstrument);
	}

	public PaymentTypeInformation17 setLocalInstrument(LocalInstrument1Choice localInstrument) {
		this.localInstrument = localInstrument;
		return this;
	}

	public SequenceType1Code getSequenceType() {
		return sequenceType;
	}

	public PaymentTypeInformation17 setSequenceType(SequenceType1Code sequenceType) {
		this.sequenceType = Objects.requireNonNull(sequenceType);
		return this;
	}

	public Optional<PaymentCategoryPurpose1Code> getCategoryPurpose() {
		return categoryPurpose == null ? Optional.empty() : Optional.of(categoryPurpose);
	}

	public PaymentTypeInformation17 setCategoryPurpose(PaymentCategoryPurpose1Code categoryPurpose) {
		this.categoryPurpose = categoryPurpose;
		return this;
	}
}