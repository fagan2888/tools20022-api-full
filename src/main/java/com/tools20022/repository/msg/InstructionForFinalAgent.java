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
import com.tools20022.repository.codeset.Instruction3Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Further information related to the processing of the payment instruction,
 * provided by the initiating party, and intended for the final agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent#mmCode
 * InstructionForFinalAgent.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent#mmProprietary
 * InstructionForFinalAgent.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionForFinalAgent"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the final agent."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionForFinalAgent", propOrder = {"code", "proprietary"})
public class InstructionForFinalAgent {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd")
	protected List<Instruction3Code> code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
	 * Payment.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent
	 * InstructionForFinalAgent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the final agent, in coded form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionForFinalAgent, List<Instruction3Code>> mmCode = new MMMessageAttribute<InstructionForFinalAgent, List<Instruction3Code>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructionForCreditorAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructionForFinalAgent.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the final agent, in coded form.";
			maxOccurs = 2;
			minOccurs = 0;
			simpleType_lazy = () -> Instruction3Code.mmObject();
		}

		@Override
		public List<Instruction3Code> getValue(InstructionForFinalAgent obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(InstructionForFinalAgent obj, List<Instruction3Code> value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry")
	protected Max140Text proprietary;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
	 * Payment.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent
	 * InstructionForFinalAgent}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to the final agent that is specific to a user community and is required for use within that user community.\n\nUsage: The proprietary element should only be used when the coded element does not provide sufficient codes or when the selected code in the coded element needs to be supplemented by additional information such as a passport number or telephone number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionForFinalAgent, Optional<Max140Text>> mmProprietary = new MMMessageAttribute<InstructionForFinalAgent, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructionForCreditorAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructionForFinalAgent.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Instruction to the final agent that is specific to a user community and is required for use within that user community.\n\nUsage: The proprietary element should only be used when the coded element does not provide sufficient codes or when the selected code in the coded element needs to be supplemented by additional information such as a passport number or telephone number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(InstructionForFinalAgent obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(InstructionForFinalAgent obj, Optional<Max140Text> value) {
			obj.setProprietary(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionForFinalAgent.mmCode, com.tools20022.repository.msg.InstructionForFinalAgent.mmProprietary);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionForFinalAgent";
				definition = "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the final agent.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Instruction3Code> getCode() {
		return code == null ? code = new ArrayList<>() : code;
	}

	public InstructionForFinalAgent setCode(List<Instruction3Code> code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public Optional<Max140Text> getProprietary() {
		return proprietary == null ? Optional.empty() : Optional.of(proprietary);
	}

	public InstructionForFinalAgent setProprietary(Max140Text proprietary) {
		this.proprietary = proprietary;
		return this;
	}
}