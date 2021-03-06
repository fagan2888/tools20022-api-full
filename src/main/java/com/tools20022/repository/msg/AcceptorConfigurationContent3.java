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
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * Content of the acceptor configuration.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent3.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmMerchantParameters
 * AcceptorConfigurationContent3.mmMerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmTerminalParameters
 * AcceptorConfigurationContent3.mmTerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmApplicationParameters
 * AcceptorConfigurationContent3.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmHostCommunicationParameters
 * AcceptorConfigurationContent3.mmHostCommunicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmSecurityParameters
 * AcceptorConfigurationContent3.mmSecurityParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorConfigurationContent3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Content of the acceptor configuration."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4
 * AcceptorConfigurationContent4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2
 * AcceptorConfigurationContent2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorConfigurationContent3", propOrder = {"acquirerProtocolParameters", "merchantParameters", "terminalParameters", "applicationParameters", "hostCommunicationParameters", "securityParameters"})
public class AcceptorConfigurationContent3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcqrrPrtcolParams")
	protected List<AcquirerProtocolParameters6> acquirerProtocolParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrPrtcolParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to an acquirer protocol."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#mmAcquirerProtocolParameters
	 * AcceptorConfigurationContent4.mmAcquirerProtocolParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmAcquirerProtocolParameters
	 * AcceptorConfigurationContent2.mmAcquirerProtocolParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorConfigurationContent3, List<AcquirerProtocolParameters6>> mmAcquirerProtocolParameters = new MMMessageAssociationEnd<AcceptorConfigurationContent3, List<AcquirerProtocolParameters6>>() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent3.mmObject();
			isDerived = false;
			xmlTag = "AcqrrPrtcolParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Acceptor parameters dedicated to an acquirer protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent4.mmAcquirerProtocolParameters);
			previousVersion_lazy = () -> AcceptorConfigurationContent2.mmAcquirerProtocolParameters;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AcquirerProtocolParameters6.mmObject();
		}

		@Override
		public List<AcquirerProtocolParameters6> getValue(AcceptorConfigurationContent3 obj) {
			return obj.getAcquirerProtocolParameters();
		}

		@Override
		public void setValue(AcceptorConfigurationContent3 obj, List<AcquirerProtocolParameters6> value) {
			obj.setAcquirerProtocolParameters(value);
		}
	};
	@XmlElement(name = "MrchntParams")
	protected List<Max10000Binary> merchantParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmRetailerParameters
	 * AcceptorConfiguration.mmRetailerParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to the merchant."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#mmMerchantParameters
	 * AcceptorConfigurationContent4.mmMerchantParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmMerchantParameters
	 * AcceptorConfigurationContent2.mmMerchantParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptorConfigurationContent3, List<Max10000Binary>> mmMerchantParameters = new MMMessageAttribute<AcceptorConfigurationContent3, List<Max10000Binary>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmRetailerParameters;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent3.mmObject();
			isDerived = false;
			xmlTag = "MrchntParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			definition = "Acceptor parameters dedicated to the merchant.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent4.mmMerchantParameters);
			previousVersion_lazy = () -> AcceptorConfigurationContent2.mmMerchantParameters;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public List<Max10000Binary> getValue(AcceptorConfigurationContent3 obj) {
			return obj.getMerchantParameters();
		}

		@Override
		public void setValue(AcceptorConfigurationContent3 obj, List<Max10000Binary> value) {
			obj.setMerchantParameters(value);
		}
	};
	@XmlElement(name = "TermnlParams")
	protected List<PaymentTerminalParameters1> terminalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters1
	 * PaymentTerminalParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manufacturer configuration parameters of the point of interaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#mmTerminalParameters
	 * AcceptorConfigurationContent4.mmTerminalParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmTerminalParameters
	 * AcceptorConfigurationContent2.mmTerminalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptorConfigurationContent3, List<PaymentTerminalParameters1>> mmTerminalParameters = new MMMessageAttribute<AcceptorConfigurationContent3, List<PaymentTerminalParameters1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent3.mmObject();
			isDerived = false;
			xmlTag = "TermnlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			definition = "Manufacturer configuration parameters of the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent4.mmTerminalParameters);
			previousVersion_lazy = () -> AcceptorConfigurationContent2.mmTerminalParameters;
			minOccurs = 0;
			complexType_lazy = () -> PaymentTerminalParameters1.mmObject();
		}

		@Override
		public List<PaymentTerminalParameters1> getValue(AcceptorConfigurationContent3 obj) {
			return obj.getTerminalParameters();
		}

		@Override
		public void setValue(AcceptorConfigurationContent3 obj, List<PaymentTerminalParameters1> value) {
			obj.setTerminalParameters(value);
		}
	};
	@XmlElement(name = "ApplParams")
	protected List<ApplicationParameters3> applicationParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ApplicationParameters3
	 * ApplicationParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationParameters
	 * AcceptorConfiguration.mmApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor parameters dedicated to a payment application of the point of interaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#mmApplicationParameters
	 * AcceptorConfigurationContent4.mmApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmApplicationParameters
	 * AcceptorConfigurationContent2.mmApplicationParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorConfigurationContent3, List<ApplicationParameters3>> mmApplicationParameters = new MMMessageAssociationEnd<AcceptorConfigurationContent3, List<ApplicationParameters3>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmApplicationParameters;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent3.mmObject();
			isDerived = false;
			xmlTag = "ApplParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			definition = "Acceptor parameters dedicated to a payment application of the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent4.mmApplicationParameters);
			previousVersion_lazy = () -> AcceptorConfigurationContent2.mmApplicationParameters;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ApplicationParameters3.mmObject();
		}

		@Override
		public List<ApplicationParameters3> getValue(AcceptorConfigurationContent3 obj) {
			return obj.getApplicationParameters();
		}

		@Override
		public void setValue(AcceptorConfigurationContent3 obj, List<ApplicationParameters3> value) {
			obj.setApplicationParameters(value);
		}
	};
	@XmlElement(name = "HstComParams")
	protected List<HostCommunicationParameter2> hostCommunicationParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter2
	 * HostCommunicationParameter2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstComParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostCommunicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor parameters dedicated to the communication with an acquirer host."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#mmHostCommunicationParameters
	 * AcceptorConfigurationContent4.mmHostCommunicationParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmHostCommunicationParameters
	 * AcceptorConfigurationContent2.mmHostCommunicationParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorConfigurationContent3, List<HostCommunicationParameter2>> mmHostCommunicationParameters = new MMMessageAssociationEnd<AcceptorConfigurationContent3, List<HostCommunicationParameter2>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent3.mmObject();
			isDerived = false;
			xmlTag = "HstComParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCommunicationParameters";
			definition = "Acceptor parameters dedicated to the communication with an acquirer host.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent4.mmHostCommunicationParameters);
			previousVersion_lazy = () -> AcceptorConfigurationContent2.mmHostCommunicationParameters;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> HostCommunicationParameter2.mmObject();
		}

		@Override
		public List<HostCommunicationParameter2> getValue(AcceptorConfigurationContent3 obj) {
			return obj.getHostCommunicationParameters();
		}

		@Override
		public void setValue(AcceptorConfigurationContent3 obj, List<HostCommunicationParameter2> value) {
			obj.setHostCommunicationParameters(value);
		}
	};
	@XmlElement(name = "SctyParams")
	protected List<SecurityParameters2> securityParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters2
	 * SecurityParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
	 * AcceptorConfigurationContent3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters related to the security of software application and application protocol."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#mmSecurityParameters
	 * AcceptorConfigurationContent4.mmSecurityParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmSecurityParameters
	 * AcceptorConfigurationContent2.mmSecurityParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptorConfigurationContent3, List<SecurityParameters2>> mmSecurityParameters = new MMMessageAttribute<AcceptorConfigurationContent3, List<SecurityParameters2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent3.mmObject();
			isDerived = false;
			xmlTag = "SctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			definition = "Point of interaction parameters related to the security of software application and application protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent4.mmSecurityParameters);
			previousVersion_lazy = () -> AcceptorConfigurationContent2.mmSecurityParameters;
			minOccurs = 0;
			complexType_lazy = () -> SecurityParameters2.mmObject();
		}

		@Override
		public List<SecurityParameters2> getValue(AcceptorConfigurationContent3 obj) {
			return obj.getSecurityParameters();
		}

		@Override
		public void setValue(AcceptorConfigurationContent3 obj, List<SecurityParameters2> value) {
			obj.setSecurityParameters(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent3.mmAcquirerProtocolParameters, com.tools20022.repository.msg.AcceptorConfigurationContent3.mmMerchantParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent3.mmTerminalParameters, com.tools20022.repository.msg.AcceptorConfigurationContent3.mmApplicationParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent3.mmHostCommunicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent3.mmSecurityParameters);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfigurationContent3";
				definition = "Content of the acceptor configuration.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationContent4.mmObject());
				previousVersion_lazy = () -> AcceptorConfigurationContent2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<AcquirerProtocolParameters6> getAcquirerProtocolParameters() {
		return acquirerProtocolParameters == null ? acquirerProtocolParameters = new ArrayList<>() : acquirerProtocolParameters;
	}

	public AcceptorConfigurationContent3 setAcquirerProtocolParameters(List<AcquirerProtocolParameters6> acquirerProtocolParameters) {
		this.acquirerProtocolParameters = Objects.requireNonNull(acquirerProtocolParameters);
		return this;
	}

	public List<Max10000Binary> getMerchantParameters() {
		return merchantParameters == null ? merchantParameters = new ArrayList<>() : merchantParameters;
	}

	public AcceptorConfigurationContent3 setMerchantParameters(List<Max10000Binary> merchantParameters) {
		this.merchantParameters = Objects.requireNonNull(merchantParameters);
		return this;
	}

	public List<PaymentTerminalParameters1> getTerminalParameters() {
		return terminalParameters == null ? terminalParameters = new ArrayList<>() : terminalParameters;
	}

	public AcceptorConfigurationContent3 setTerminalParameters(List<PaymentTerminalParameters1> terminalParameters) {
		this.terminalParameters = Objects.requireNonNull(terminalParameters);
		return this;
	}

	public List<ApplicationParameters3> getApplicationParameters() {
		return applicationParameters == null ? applicationParameters = new ArrayList<>() : applicationParameters;
	}

	public AcceptorConfigurationContent3 setApplicationParameters(List<ApplicationParameters3> applicationParameters) {
		this.applicationParameters = Objects.requireNonNull(applicationParameters);
		return this;
	}

	public List<HostCommunicationParameter2> getHostCommunicationParameters() {
		return hostCommunicationParameters == null ? hostCommunicationParameters = new ArrayList<>() : hostCommunicationParameters;
	}

	public AcceptorConfigurationContent3 setHostCommunicationParameters(List<HostCommunicationParameter2> hostCommunicationParameters) {
		this.hostCommunicationParameters = Objects.requireNonNull(hostCommunicationParameters);
		return this;
	}

	public List<SecurityParameters2> getSecurityParameters() {
		return securityParameters == null ? securityParameters = new ArrayList<>() : securityParameters;
	}

	public AcceptorConfigurationContent3 setSecurityParameters(List<SecurityParameters2> securityParameters) {
		this.securityParameters = Objects.requireNonNull(securityParameters);
		return this;
	}
}