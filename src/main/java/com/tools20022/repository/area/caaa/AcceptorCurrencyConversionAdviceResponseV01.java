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
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionPreviousVersion;
import com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header34;
import com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorCurrencyConversionAdviceResponse message is sent by the service
 * provider to acknowledge the acceptor about the notification of the reception
 * of the currency conversion advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.019.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionPreviousVersion
 * AcceptortoAcquirerCardTransactionPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01#mmHeader
 * AcceptorCurrencyConversionAdviceResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01#mmCurrencyConversionAdviceResponse
 * AcceptorCurrencyConversionAdviceResponseV01.
 * mmCurrencyConversionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01#mmSecurityTrailer
 * AcceptorCurrencyConversionAdviceResponseV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion
 * CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCcyConvsAdvcRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCurrencyConversionAdviceResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorCurrencyConversionAdviceResponse message is sent by the service provider to acknowledge the acceptor about the notification of the reception of the currency conversion advice."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV02
 * AcceptorCurrencyConversionAdviceResponseV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCurrencyConversionAdviceResponseV01", propOrder = {"header", "currencyConversionAdviceResponse", "securityTrailer"})
public class AcceptorCurrencyConversionAdviceResponseV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header34 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header34
	 * Header34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation advice response message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV02#mmHeader
	 * AcceptorCurrencyConversionAdviceResponseV02.mmHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorCurrencyConversionAdviceResponseV01, Header34> mmHeader = new MMMessageBuildingBlock<AcceptorCurrencyConversionAdviceResponseV01, Header34>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Cancellation advice response message management information.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionAdviceResponseV02.mmHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header34.mmObject();
		}

		@Override
		public Header34 getValue(AcceptorCurrencyConversionAdviceResponseV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorCurrencyConversionAdviceResponseV01 obj, Header34 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "CcyConvsAdvcRspn", required = true)
	protected AcceptorCancellationAdviceResponse6 currencyConversionAdviceResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6
	 * AcceptorCancellationAdviceResponse6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsAdvcRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the currency conversion advice response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV02#mmCurrencyConversionAdviceResponse
	 * AcceptorCurrencyConversionAdviceResponseV02.
	 * mmCurrencyConversionAdviceResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorCurrencyConversionAdviceResponseV01, AcceptorCancellationAdviceResponse6> mmCurrencyConversionAdviceResponse = new MMMessageBuildingBlock<AcceptorCurrencyConversionAdviceResponseV01, AcceptorCancellationAdviceResponse6>() {
		{
			xmlTag = "CcyConvsAdvcRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdviceResponse";
			definition = "Information related to the currency conversion advice response.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionAdviceResponseV02.mmCurrencyConversionAdviceResponse);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorCancellationAdviceResponse6.mmObject();
		}

		@Override
		public AcceptorCancellationAdviceResponse6 getValue(AcceptorCurrencyConversionAdviceResponseV01 obj) {
			return obj.getCurrencyConversionAdviceResponse();
		}

		@Override
		public void setValue(AcceptorCurrencyConversionAdviceResponseV01 obj, AcceptorCancellationAdviceResponse6 value) {
			obj.setCurrencyConversionAdviceResponse(value);
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType15 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV02#mmSecurityTrailer
	 * AcceptorCurrencyConversionAdviceResponseV02.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorCurrencyConversionAdviceResponseV01, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorCurrencyConversionAdviceResponseV01, Optional<ContentInformationType15>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionAdviceResponseV02.mmSecurityTrailer);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		@Override
		public Optional<ContentInformationType15> getValue(AcceptorCurrencyConversionAdviceResponseV01 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorCurrencyConversionAdviceResponseV01 obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCurrencyConversionAdviceResponseV01";
				definition = "The AcceptorCurrencyConversionAdviceResponse message is sent by the service provider to acknowledge the acceptor about the notification of the reception of the currency conversion advice.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionAdviceResponseV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCcyConvsAdvcRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01.mmHeader,
						com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01.mmCurrencyConversionAdviceResponse, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "019";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorCurrencyConversionAdviceResponseV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header34 getHeader() {
		return header;
	}

	public AcceptorCurrencyConversionAdviceResponseV01 setHeader(Header34 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorCancellationAdviceResponse6 getCurrencyConversionAdviceResponse() {
		return currencyConversionAdviceResponse;
	}

	public AcceptorCurrencyConversionAdviceResponseV01 setCurrencyConversionAdviceResponse(AcceptorCancellationAdviceResponse6 currencyConversionAdviceResponse) {
		this.currencyConversionAdviceResponse = Objects.requireNonNull(currencyConversionAdviceResponse);
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public AcceptorCurrencyConversionAdviceResponseV01 setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.019.001.01")
	static public class Document {
		@XmlElement(name = "AccptrCcyConvsAdvcRspn", required = true)
		public AcceptorCurrencyConversionAdviceResponseV01 messageBody;
	}
}