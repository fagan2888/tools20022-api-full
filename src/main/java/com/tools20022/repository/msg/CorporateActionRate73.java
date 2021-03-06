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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RateAndAmountFormat43Choice;
import com.tools20022.repository.choice.RateAndAmountFormat45Choice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxVoucher;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies rates related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmProposedRate
 * CorporateActionRate73.mmProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmOversubscriptionRate
 * CorporateActionRate73.mmOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmRequestedWithholdingTaxRate
 * CorporateActionRate73.mmRequestedWithholdingTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmRequestedSecondLevelTaxRate
 * CorporateActionRate73.mmRequestedSecondLevelTaxRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate73"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates related to a corporate action option."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate73", propOrder = {"proposedRate", "oversubscriptionRate", "requestedWithholdingTaxRate", "requestedSecondLevelTaxRate"})
public class CorporateActionRate73 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PropsdRate")
	protected PercentageRate proposedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProposedRate
	 * BiddingConditions.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73
	 * CorporateActionRate73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate proposed in a remarketing of variable rate notes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::OFFR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate73, Optional<PercentageRate>> mmProposedRate = new MMMessageAttribute<CorporateActionRate73, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProposedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate73.mmObject();
			isDerived = false;
			xmlTag = "PropsdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::OFFR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionRate73 obj) {
			return obj.getProposedRate();
		}

		@Override
		public void setValue(CorporateActionRate73 obj, Optional<PercentageRate> value) {
			obj.setProposedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "OvrsbcptRate")
	protected RateAndAmountFormat43Choice oversubscriptionRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat43Choice
	 * RateAndAmountFormat43Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmOversubscriptionRate
	 * BiddingConditions.mmOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73
	 * CorporateActionRate73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of allowed over-subscription."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::OSUB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate73, Optional<RateAndAmountFormat43Choice>> mmOversubscriptionRate = new MMMessageAttribute<CorporateActionRate73, Optional<RateAndAmountFormat43Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmOversubscriptionRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate73.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::OSUB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of allowed over-subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat43Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat43Choice> getValue(CorporateActionRate73 obj) {
			return obj.getOversubscriptionRate();
		}

		@Override
		public void setValue(CorporateActionRate73 obj, Optional<RateAndAmountFormat43Choice> value) {
			obj.setOversubscriptionRate(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdWhldgTaxRate")
	protected List<RateAndAmountFormat45Choice> requestedWithholdingTaxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat45Choice
	 * RateAndAmountFormat45Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRequestedTaxationRate
	 * TaxVoucher.mmRequestedTaxationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73
	 * CorporateActionRate73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdWhldgTaxRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedWithholdingTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested tax rate that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::TAXB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate73, List<RateAndAmountFormat45Choice>> mmRequestedWithholdingTaxRate = new MMMessageAttribute<CorporateActionRate73, List<RateAndAmountFormat45Choice>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRequestedTaxationRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate73.mmObject();
			isDerived = false;
			xmlTag = "ReqdWhldgTaxRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::TAXB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedWithholdingTaxRate";
			definition = "Requested tax rate that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible.";
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat45Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat45Choice> getValue(CorporateActionRate73 obj) {
			return obj.getRequestedWithholdingTaxRate();
		}

		@Override
		public void setValue(CorporateActionRate73 obj, List<RateAndAmountFormat45Choice> value) {
			obj.setRequestedWithholdingTaxRate(value);
		}
	};
	@XmlElement(name = "ReqdScndLvlTaxRate")
	protected List<RateAndAmountFormat45Choice> requestedSecondLevelTaxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat45Choice
	 * RateAndAmountFormat45Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73
	 * CorporateActionRate73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdScndLvlTaxRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSecondLevelTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested rate at which the income will be withheld by the jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate73, List<RateAndAmountFormat45Choice>> mmRequestedSecondLevelTaxRate = new MMMessageAssociationEnd<CorporateActionRate73, List<RateAndAmountFormat45Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate73.mmObject();
			isDerived = false;
			xmlTag = "ReqdScndLvlTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSecondLevelTaxRate";
			definition = "Requested rate at which the income will be withheld by the jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat45Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat45Choice> getValue(CorporateActionRate73 obj) {
			return obj.getRequestedSecondLevelTaxRate();
		}

		@Override
		public void setValue(CorporateActionRate73 obj, List<RateAndAmountFormat45Choice> value) {
			obj.setRequestedSecondLevelTaxRate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate73.mmProposedRate, com.tools20022.repository.msg.CorporateActionRate73.mmOversubscriptionRate,
						com.tools20022.repository.msg.CorporateActionRate73.mmRequestedWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate73.mmRequestedSecondLevelTaxRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate73";
				definition = "Specifies rates related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PercentageRate> getProposedRate() {
		return proposedRate == null ? Optional.empty() : Optional.of(proposedRate);
	}

	public CorporateActionRate73 setProposedRate(PercentageRate proposedRate) {
		this.proposedRate = proposedRate;
		return this;
	}

	public Optional<RateAndAmountFormat43Choice> getOversubscriptionRate() {
		return oversubscriptionRate == null ? Optional.empty() : Optional.of(oversubscriptionRate);
	}

	public CorporateActionRate73 setOversubscriptionRate(RateAndAmountFormat43Choice oversubscriptionRate) {
		this.oversubscriptionRate = oversubscriptionRate;
		return this;
	}

	public List<RateAndAmountFormat45Choice> getRequestedWithholdingTaxRate() {
		return requestedWithholdingTaxRate == null ? requestedWithholdingTaxRate = new ArrayList<>() : requestedWithholdingTaxRate;
	}

	public CorporateActionRate73 setRequestedWithholdingTaxRate(List<RateAndAmountFormat45Choice> requestedWithholdingTaxRate) {
		this.requestedWithholdingTaxRate = Objects.requireNonNull(requestedWithholdingTaxRate);
		return this;
	}

	public List<RateAndAmountFormat45Choice> getRequestedSecondLevelTaxRate() {
		return requestedSecondLevelTaxRate == null ? requestedSecondLevelTaxRate = new ArrayList<>() : requestedSecondLevelTaxRate;
	}

	public CorporateActionRate73 setRequestedSecondLevelTaxRate(List<RateAndAmountFormat45Choice> requestedSecondLevelTaxRate) {
		this.requestedSecondLevelTaxRate = Objects.requireNonNull(requestedSecondLevelTaxRate);
		return this;
	}
}