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

package com.tools20022.repository.area.caaa;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive;
import com.tools20022.repository.msg.CardPaymentBatchTransfer3;
import com.tools20022.repository.msg.ContentInformationType12;
import com.tools20022.repository.msg.Header12;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer
 * the financial data of a collection of transactions to the acquirer (or its
 * agent).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.011.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive
 * AcceptortoAcquirerCardTransactionArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV04#mmHeader
 * AcceptorBatchTransferV04.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV04#mmBatchTransfer
 * AcceptorBatchTransferV04.mmBatchTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV04#mmSecurityTrailer
 * AcceptorBatchTransferV04.mmSecurityTrailer}</li>
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
 * xmlTag} = "AccptrBtchTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorBatchTransferV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer the financial data of a collection of transactions to the acquirer (or its agent)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV05
 * AcceptorBatchTransferV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV03
 * AcceptorBatchTransferV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorBatchTransferV04", propOrder = {"header", "batchTransfer", "securityTrailer"})
public class AcceptorBatchTransferV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header12 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header12
	 * Header12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Batch capture message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV05#mmHeader
	 * AcceptorBatchTransferV05.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV03#mmHeader
	 * AcceptorBatchTransferV03.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorBatchTransferV04, Header12> mmHeader = new MMMessageBuildingBlock<AcceptorBatchTransferV04, Header12>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Batch capture message management information.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorBatchTransferV05.mmHeader);
			previousVersion_lazy = () -> AcceptorBatchTransferV03.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header12.mmObject();
		}

		@Override
		public Header12 getValue(AcceptorBatchTransferV04 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorBatchTransferV04 obj, Header12 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "BtchTrf", required = true)
	protected CardPaymentBatchTransfer3 batchTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer3
	 * CardPaymentBatchTransfer3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transactions from one or several data set of transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV05#mmBatchTransfer
	 * AcceptorBatchTransferV05.mmBatchTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV03#mmBatchTransfer
	 * AcceptorBatchTransferV03.mmBatchTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorBatchTransferV04, CardPaymentBatchTransfer3> mmBatchTransfer = new MMMessageBuildingBlock<AcceptorBatchTransferV04, CardPaymentBatchTransfer3>() {
		{
			xmlTag = "BtchTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransfer";
			definition = "Card payment transactions from one or several data set of transactions.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorBatchTransferV05.mmBatchTransfer);
			previousVersion_lazy = () -> AcceptorBatchTransferV03.mmBatchTransfer;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentBatchTransfer3.mmObject();
		}

		@Override
		public CardPaymentBatchTransfer3 getValue(AcceptorBatchTransferV04 obj) {
			return obj.getBatchTransfer();
		}

		@Override
		public void setValue(AcceptorBatchTransferV04 obj, CardPaymentBatchTransfer3 value) {
			obj.setBatchTransfer(value);
		}
	};
	@XmlElement(name = "SctyTrlr", required = true)
	protected ContentInformationType12 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV05#mmSecurityTrailer
	 * AcceptorBatchTransferV05.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV03#mmSecurityTrailer
	 * AcceptorBatchTransferV03.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorBatchTransferV04, ContentInformationType12> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorBatchTransferV04, ContentInformationType12>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorBatchTransferV05.mmSecurityTrailer);
			previousVersion_lazy = () -> AcceptorBatchTransferV03.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType12.mmObject();
		}

		@Override
		public ContentInformationType12 getValue(AcceptorBatchTransferV04 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorBatchTransferV04 obj, ContentInformationType12 value) {
			obj.setSecurityTrailer(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorBatchTransferV04";
				definition = "The AcceptorBatchTransfer is sent by an acceptor (or its agent) to transfer the financial data of a collection of transactions to the acquirer (or its agent).";
				nextVersions_lazy = () -> Arrays.asList(AcceptorBatchTransferV05.mmObject());
				previousVersion_lazy = () -> AcceptorBatchTransferV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrBtchTrf";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorBatchTransferV04.mmHeader, com.tools20022.repository.area.caaa.AcceptorBatchTransferV04.mmBatchTransfer,
						com.tools20022.repository.area.caaa.AcceptorBatchTransferV04.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "011";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorBatchTransferV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header12 getHeader() {
		return header;
	}

	public AcceptorBatchTransferV04 setHeader(Header12 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public CardPaymentBatchTransfer3 getBatchTransfer() {
		return batchTransfer;
	}

	public AcceptorBatchTransferV04 setBatchTransfer(CardPaymentBatchTransfer3 batchTransfer) {
		this.batchTransfer = Objects.requireNonNull(batchTransfer);
		return this;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return securityTrailer;
	}

	public AcceptorBatchTransferV04 setSecurityTrailer(ContentInformationType12 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.04")
	static public class Document {
		@XmlElement(name = "AccptrBtchTrf", required = true)
		public AcceptorBatchTransferV04 messageBody;
	}
}