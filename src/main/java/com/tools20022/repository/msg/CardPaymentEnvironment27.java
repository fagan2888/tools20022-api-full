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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the card payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmAcquirer
 * CardPaymentEnvironment27.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmMerchant
 * CardPaymentEnvironment27.mmMerchant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmPOI
 * CardPaymentEnvironment27.mmPOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmCard
 * CardPaymentEnvironment27.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmCardholder
 * CardPaymentEnvironment27.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmProtectedCardholderData
 * CardPaymentEnvironment27.mmProtectedCardholderData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentEnvironment27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the card payment transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40
 * CardPaymentEnvironment40}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14
 * CardPaymentEnvironment14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentEnvironment27", propOrder = {"acquirer", "merchant", "pOI", "card", "cardholder", "protectedCardholderData"})
public class CardPaymentEnvironment27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acqrr")
	protected Acquirer2 acquirer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer2 Acquirer2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcquirerRole AcquirerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27
	 * CardPaymentEnvironment27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer involved in the card payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmAcquirer
	 * CardPaymentEnvironment40.mmAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmAcquirer
	 * CardPaymentEnvironment14.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment27, Optional<Acquirer2>> mmAcquirer = new MMMessageAssociationEnd<CardPaymentEnvironment27, Optional<Acquirer2>>() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment27.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment40.mmAcquirer);
			previousVersion_lazy = () -> CardPaymentEnvironment14.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Acquirer2.mmObject();
		}

		@Override
		public Optional<Acquirer2> getValue(CardPaymentEnvironment27 obj) {
			return obj.getAcquirer();
		}

		@Override
		public void setValue(CardPaymentEnvironment27 obj, Optional<Acquirer2> value) {
			obj.setAcquirer(value.orElse(null));
		}
	};
	@XmlElement(name = "Mrchnt")
	protected Organisation8 merchant;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation8
	 * Organisation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27
	 * CardPaymentEnvironment27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mrchnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant performing the transaction.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmMerchant
	 * CardPaymentEnvironment40.mmMerchant}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmMerchant
	 * CardPaymentEnvironment14.mmMerchant}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment27, Optional<Organisation8>> mmMerchant = new MMMessageAssociationEnd<CardPaymentEnvironment27, Optional<Organisation8>>() {
		{
			businessComponentTrace_lazy = () -> MerchantRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment27.mmObject();
			isDerived = false;
			xmlTag = "Mrchnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merchant";
			definition = "Merchant performing the transaction.\r\nUsage: In some cases, merchant and acceptor may be regarded as the same entity.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment40.mmMerchant);
			previousVersion_lazy = () -> CardPaymentEnvironment14.mmMerchant;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation8.mmObject();
		}

		@Override
		public Optional<Organisation8> getValue(CardPaymentEnvironment27 obj) {
			return obj.getMerchant();
		}

		@Override
		public void setValue(CardPaymentEnvironment27 obj, Optional<Organisation8> value) {
			obj.setMerchant(value.orElse(null));
		}
	};
	@XmlElement(name = "POI")
	protected PointOfInteraction3 pOI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteraction3
	 * PointOfInteraction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27
	 * CardPaymentEnvironment27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Point of interaction (POI) performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmPOI
	 * CardPaymentEnvironment40.mmPOI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmPOI
	 * CardPaymentEnvironment14.mmPOI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentEnvironment27, Optional<PointOfInteraction3>> mmPOI = new MMMessageAttribute<CardPaymentEnvironment27, Optional<PointOfInteraction3>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment27.mmObject();
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Point of interaction (POI) performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment40.mmPOI);
			previousVersion_lazy = () -> CardPaymentEnvironment14.mmPOI;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PointOfInteraction3.mmObject();
		}

		@Override
		public Optional<PointOfInteraction3> getValue(CardPaymentEnvironment27 obj) {
			return obj.getPOI();
		}

		@Override
		public void setValue(CardPaymentEnvironment27 obj, Optional<PointOfInteraction3> value) {
			obj.setPOI(value.orElse(null));
		}
	};
	@XmlElement(name = "Card", required = true)
	protected PaymentCard8 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PaymentCard8
	 * PaymentCard8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27
	 * CardPaymentEnvironment27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmCard
	 * CardPaymentEnvironment40.mmCard}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmCard
	 * CardPaymentEnvironment14.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentEnvironment27, PaymentCard8> mmCard = new MMMessageAttribute<CardPaymentEnvironment27, PaymentCard8>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment27.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Payment card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment40.mmCard);
			previousVersion_lazy = () -> CardPaymentEnvironment14.mmCard;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentCard8.mmObject();
		}

		@Override
		public PaymentCard8 getValue(CardPaymentEnvironment27 obj) {
			return obj.getCard();
		}

		@Override
		public void setValue(CardPaymentEnvironment27 obj, PaymentCard8 value) {
			obj.setCard(value);
		}
	};
	@XmlElement(name = "Crdhldr")
	protected Cardholder6 cardholder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cardholder6
	 * Cardholder6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27
	 * CardPaymentEnvironment27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Crdhldr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder involved in the card payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmCardholder
	 * CardPaymentEnvironment40.mmCardholder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmCardholder
	 * CardPaymentEnvironment14.mmCardholder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment27, Optional<Cardholder6>> mmCardholder = new MMMessageAssociationEnd<CardPaymentEnvironment27, Optional<Cardholder6>>() {
		{
			businessComponentTrace_lazy = () -> CardholderRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment27.mmObject();
			isDerived = false;
			xmlTag = "Crdhldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cardholder";
			definition = "Cardholder involved in the card payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment40.mmCardholder);
			previousVersion_lazy = () -> CardPaymentEnvironment14.mmCardholder;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Cardholder6.mmObject();
		}

		@Override
		public Optional<Cardholder6> getValue(CardPaymentEnvironment27 obj) {
			return obj.getCardholder();
		}

		@Override
		public void setValue(CardPaymentEnvironment27 obj, Optional<Cardholder6> value) {
			obj.setCardholder(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdCrdhldrData")
	protected ContentInformationType7 protectedCardholderData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType7
	 * ContentInformationType7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27
	 * CardPaymentEnvironment27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCrdhldrData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardholderData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement of the message element Cardholder by a digital envelope using a cryptographic key."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmProtectedCardholderData
	 * CardPaymentEnvironment40.mmProtectedCardholderData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment27, Optional<ContentInformationType7>> mmProtectedCardholderData = new MMMessageAssociationEnd<CardPaymentEnvironment27, Optional<ContentInformationType7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment27.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCrdhldrData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardholderData";
			definition = "Replacement of the message element Cardholder by a digital envelope using a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment40.mmProtectedCardholderData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType7.mmObject();
		}

		@Override
		public Optional<ContentInformationType7> getValue(CardPaymentEnvironment27 obj) {
			return obj.getProtectedCardholderData();
		}

		@Override
		public void setValue(CardPaymentEnvironment27 obj, Optional<ContentInformationType7> value) {
			obj.setProtectedCardholderData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment27.mmAcquirer, com.tools20022.repository.msg.CardPaymentEnvironment27.mmMerchant,
						com.tools20022.repository.msg.CardPaymentEnvironment27.mmPOI, com.tools20022.repository.msg.CardPaymentEnvironment27.mmCard, com.tools20022.repository.msg.CardPaymentEnvironment27.mmCardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment27.mmProtectedCardholderData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment27";
				definition = "Environment of the card payment transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment40.mmObject());
				previousVersion_lazy = () -> CardPaymentEnvironment14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer2> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public CardPaymentEnvironment27 setAcquirer(Acquirer2 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Organisation8> getMerchant() {
		return merchant == null ? Optional.empty() : Optional.of(merchant);
	}

	public CardPaymentEnvironment27 setMerchant(Organisation8 merchant) {
		this.merchant = merchant;
		return this;
	}

	public Optional<PointOfInteraction3> getPOI() {
		return pOI == null ? Optional.empty() : Optional.of(pOI);
	}

	public CardPaymentEnvironment27 setPOI(PointOfInteraction3 pOI) {
		this.pOI = pOI;
		return this;
	}

	public PaymentCard8 getCard() {
		return card;
	}

	public CardPaymentEnvironment27 setCard(PaymentCard8 card) {
		this.card = Objects.requireNonNull(card);
		return this;
	}

	public Optional<Cardholder6> getCardholder() {
		return cardholder == null ? Optional.empty() : Optional.of(cardholder);
	}

	public CardPaymentEnvironment27 setCardholder(Cardholder6 cardholder) {
		this.cardholder = cardholder;
		return this;
	}

	public Optional<ContentInformationType7> getProtectedCardholderData() {
		return protectedCardholderData == null ? Optional.empty() : Optional.of(protectedCardholderData);
	}

	public CardPaymentEnvironment27 setProtectedCardholderData(ContentInformationType7 protectedCardholderData) {
		this.protectedCardholderData = protectedCardholderData;
		return this;
	}
}