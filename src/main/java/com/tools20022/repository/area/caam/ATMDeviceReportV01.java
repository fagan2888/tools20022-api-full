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

package com.tools20022.repository.area.caam;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ATMManagementArchive;
import com.tools20022.repository.msg.ATMDeviceReport1;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType13;
import com.tools20022.repository.msg.Header20;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The ATMDeviceReport message is sent to an acquirer by an ATM, or forwarded by
 * an agent, to report:<br>
 * - The result of maintenance commands performed by the ATM,<br>
 * - The components of the ATM,<br>
 * - The status of the ATM components.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caam.001.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMManagementArchive
 * ATMManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV01#mmHeader
 * ATMDeviceReportV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV01#mmProtectedATMDeviceReport
 * ATMDeviceReportV01.mmProtectedATMDeviceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV01#mmATMDeviceReport
 * ATMDeviceReportV01.mmATMDeviceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV01#mmSecurityTrailer
 * ATMDeviceReportV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMDvcRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMDeviceReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMDeviceReport message is sent to an acquirer by an ATM, or forwarded by an agent, to report:\r\n- The result of maintenance commands performed by the ATM,\r\n- The components of the ATM,\r\n- The status of the ATM components."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV02
 * ATMDeviceReportV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDeviceReportV01", propOrder = {"header", "protectedATMDeviceReport", "aTMDeviceReport", "securityTrailer"})
public class ATMDeviceReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header20 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the protocol management on a segment of the path from the ATM to the acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDeviceReportV01, Header20> mmHeader = new MMMessageBuildingBlock<ATMDeviceReportV01, Header20>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header20.mmObject();
		}

		@Override
		public Header20 getValue(ATMDeviceReportV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ATMDeviceReportV01 obj, Header20 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "PrtctdATMDvcRpt")
	protected ContentInformationType10 protectedATMDeviceReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdATMDvcRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMDeviceReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDeviceReportV01, Optional<ContentInformationType10>> mmProtectedATMDeviceReport = new MMMessageBuildingBlock<ATMDeviceReportV01, Optional<ContentInformationType10>>() {
		{
			xmlTag = "PrtctdATMDvcRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMDeviceReport";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMDeviceReportV01 obj) {
			return obj.getProtectedATMDeviceReport();
		}

		@Override
		public void setValue(ATMDeviceReportV01 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedATMDeviceReport(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMDvcRpt")
	protected ATMDeviceReport1 aTMDeviceReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport1
	 * ATMDeviceReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMDvcRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDeviceReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the status report from an ATM device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDeviceReportV01, Optional<ATMDeviceReport1>> mmATMDeviceReport = new MMMessageBuildingBlock<ATMDeviceReportV01, Optional<ATMDeviceReport1>>() {
		{
			xmlTag = "ATMDvcRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDeviceReport";
			definition = "Information related to the status report from an ATM device.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMDeviceReport1.mmObject();
		}

		@Override
		public Optional<ATMDeviceReport1> getValue(ATMDeviceReportV01 obj) {
			return obj.getATMDeviceReport();
		}

		@Override
		public void setValue(ATMDeviceReportV01 obj, Optional<ATMDeviceReport1> value) {
			obj.setATMDeviceReport(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType13 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13
	 * ContentInformationType13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trailer of the message containing a MAC or a digital signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDeviceReportV01, Optional<ContentInformationType13>> mmSecurityTrailer = new MMMessageBuildingBlock<ATMDeviceReportV01, Optional<ContentInformationType13>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType13.mmObject();
		}

		@Override
		public Optional<ContentInformationType13> getValue(ATMDeviceReportV01 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(ATMDeviceReportV01 obj, Optional<ContentInformationType13> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDeviceReportV01";
				definition = "The ATMDeviceReport message is sent to an acquirer by an ATM, or forwarded by an agent, to report:\r\n- The result of maintenance commands performed by the ATM,\r\n- The components of the ATM,\r\n- The status of the ATM components.";
				nextVersions_lazy = () -> Arrays.asList(ATMDeviceReportV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "ATMDvcRpt";
				businessArea_lazy = () -> ATMManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caam.ATMDeviceReportV01.mmHeader, com.tools20022.repository.area.caam.ATMDeviceReportV01.mmProtectedATMDeviceReport,
						com.tools20022.repository.area.caam.ATMDeviceReportV01.mmATMDeviceReport, com.tools20022.repository.area.caam.ATMDeviceReportV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caam";
						messageFunctionality = "001";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMDeviceReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header20 getHeader() {
		return header;
	}

	public ATMDeviceReportV01 setHeader(Header20 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedATMDeviceReport() {
		return protectedATMDeviceReport == null ? Optional.empty() : Optional.of(protectedATMDeviceReport);
	}

	public ATMDeviceReportV01 setProtectedATMDeviceReport(ContentInformationType10 protectedATMDeviceReport) {
		this.protectedATMDeviceReport = protectedATMDeviceReport;
		return this;
	}

	public Optional<ATMDeviceReport1> getATMDeviceReport() {
		return aTMDeviceReport == null ? Optional.empty() : Optional.of(aTMDeviceReport);
	}

	public ATMDeviceReportV01 setATMDeviceReport(ATMDeviceReport1 aTMDeviceReport) {
		this.aTMDeviceReport = aTMDeviceReport;
		return this;
	}

	public Optional<ContentInformationType13> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public ATMDeviceReportV01 setSecurityTrailer(ContentInformationType13 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.001.001.01")
	static public class Document {
		@XmlElement(name = "ATMDvcRpt", required = true)
		public ATMDeviceReportV01 messageBody;
	}
}