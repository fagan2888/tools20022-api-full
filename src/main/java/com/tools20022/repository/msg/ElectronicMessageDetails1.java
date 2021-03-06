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
import com.tools20022.repository.datatype.Max35Text;
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
 * Summary of electronic message details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElectronicMessageDetails1#mmElectronicSystemInformationMessageIdentifier
 * ElectronicMessageDetails1.mmElectronicSystemInformationMessageIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElectronicMessageDetails1#mmElectronicSystemInformationMessagePacketIdentifier
 * ElectronicMessageDetails1.
 * mmElectronicSystemInformationMessagePacketIdentifier}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ElectronicMessageDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Summary of electronic message details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ElectronicMessageDetails1", propOrder = {"electronicSystemInformationMessageIdentifier", "electronicSystemInformationMessagePacketIdentifier"})
public class ElectronicMessageDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ElctrncSysInfMsgIdr", required = true)
	protected Max35Text electronicSystemInformationMessageIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.ElectronicMessageDetails1
	 * ElectronicMessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSysInfMsgIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSystemInformationMessageIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about separate electronic system information message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ElectronicMessageDetails1, Max35Text> mmElectronicSystemInformationMessageIdentifier = new MMMessageAttribute<ElectronicMessageDetails1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ElectronicMessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSysInfMsgIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSystemInformationMessageIdentifier";
			definition = "Information about separate electronic system information message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ElectronicMessageDetails1 obj) {
			return obj.getElectronicSystemInformationMessageIdentifier();
		}

		@Override
		public void setValue(ElectronicMessageDetails1 obj, Max35Text value) {
			obj.setElectronicSystemInformationMessageIdentifier(value);
		}
	};
	@XmlElement(name = "ElctrncSysInfMsgPacketIdr")
	protected Max35Text electronicSystemInformationMessagePacketIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.ElectronicMessageDetails1
	 * ElectronicMessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSysInfMsgPacketIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSystemInformationMessagePacketIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about packet of electronic system messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ElectronicMessageDetails1, Optional<Max35Text>> mmElectronicSystemInformationMessagePacketIdentifier = new MMMessageAttribute<ElectronicMessageDetails1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ElectronicMessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSysInfMsgPacketIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSystemInformationMessagePacketIdentifier";
			definition = "Information about packet of electronic system messages.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ElectronicMessageDetails1 obj) {
			return obj.getElectronicSystemInformationMessagePacketIdentifier();
		}

		@Override
		public void setValue(ElectronicMessageDetails1 obj, Optional<Max35Text> value) {
			obj.setElectronicSystemInformationMessagePacketIdentifier(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ElectronicMessageDetails1.mmElectronicSystemInformationMessageIdentifier,
						com.tools20022.repository.msg.ElectronicMessageDetails1.mmElectronicSystemInformationMessagePacketIdentifier);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ElectronicMessageDetails1";
				definition = "Summary of electronic message details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getElectronicSystemInformationMessageIdentifier() {
		return electronicSystemInformationMessageIdentifier;
	}

	public ElectronicMessageDetails1 setElectronicSystemInformationMessageIdentifier(Max35Text electronicSystemInformationMessageIdentifier) {
		this.electronicSystemInformationMessageIdentifier = Objects.requireNonNull(electronicSystemInformationMessageIdentifier);
		return this;
	}

	public Optional<Max35Text> getElectronicSystemInformationMessagePacketIdentifier() {
		return electronicSystemInformationMessagePacketIdentifier == null ? Optional.empty() : Optional.of(electronicSystemInformationMessagePacketIdentifier);
	}

	public ElectronicMessageDetails1 setElectronicSystemInformationMessagePacketIdentifier(Max35Text electronicSystemInformationMessagePacketIdentifier) {
		this.electronicSystemInformationMessagePacketIdentifier = electronicSystemInformationMessagePacketIdentifier;
		return this;
	}
}