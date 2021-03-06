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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.QuoteStatus1Code;
import com.tools20022.repository.codeset.RejectionReason3Code;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Intermediary14;
import com.tools20022.repository.msg.QuoteSet2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the status of a quote and if required, the rejection reason, and
 * the parties and the details of the quote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#mmQuoteStatus
 * QuoteStatus2.mmQuoteStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#mmRejectionReason
 * QuoteStatus2.mmRejectionReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#mmQuoteSetDetails
 * QuoteStatus2.mmQuoteSetDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteStatus2#mmRelatedParties
 * QuoteStatus2.mmRelatedParties}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the status of a quote and if required, the rejection reason, and the parties and the details of the quote."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QuoteStatus2", propOrder = {"quoteStatus", "rejectionReason", "quoteSetDetails", "relatedParties"})
public class QuoteStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QtSts", required = true)
	protected QuoteStatus1Code quoteStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatus1Code
	 * QuoteStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteStatus2 QuoteStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information related to the status of a quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 297</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteStatus2, QuoteStatus1Code> mmQuoteStatus = new MMMessageAttribute<QuoteStatus2, QuoteStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteStatus2.mmObject();
			isDerived = false;
			xmlTag = "QtSts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "297"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteStatus";
			definition = "Provides information related to the status of a quote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QuoteStatus1Code.mmObject();
		}

		@Override
		public QuoteStatus1Code getValue(QuoteStatus2 obj) {
			return obj.getQuoteStatus();
		}

		@Override
		public void setValue(QuoteStatus2 obj, QuoteStatus1Code value) {
			obj.setQuoteStatus(value);
		}
	};
	@XmlElement(name = "RjctnRsn")
	protected RejectionReason3Code rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason3Code
	 * RejectionReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteStatus2 QuoteStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information related to the rejection of the quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteStatus2, Optional<RejectionReason3Code>> mmRejectionReason = new MMMessageAttribute<QuoteStatus2, Optional<RejectionReason3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteStatus2.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Provides information related to the rejection of the quote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RejectionReason3Code.mmObject();
		}

		@Override
		public Optional<RejectionReason3Code> getValue(QuoteStatus2 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(QuoteStatus2 obj, Optional<RejectionReason3Code> value) {
			obj.setRejectionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "QtSetDtls")
	protected List<QuoteSet2> quoteSetDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuoteSet2 QuoteSet2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteStatus2 QuoteStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtSetDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteSetDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about a group of related quotes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteStatus2, List<QuoteSet2>> mmQuoteSetDetails = new MMMessageAssociationEnd<QuoteStatus2, List<QuoteSet2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteStatus2.mmObject();
			isDerived = false;
			xmlTag = "QtSetDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteSetDetails";
			definition = "Provides details about a group of related quotes.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuoteSet2.mmObject();
		}

		@Override
		public List<QuoteSet2> getValue(QuoteStatus2 obj) {
			return obj.getQuoteSetDetails();
		}

		@Override
		public void setValue(QuoteStatus2 obj, List<QuoteSet2> value) {
			obj.setQuoteSetDetails(value);
		}
	};
	@XmlElement(name = "RltdPties")
	protected List<Intermediary14> relatedParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary14
	 * Intermediary14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteStatus2 QuoteStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parties used for acting parties that applies either to the whole message or to individual sides."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteStatus2, List<Intermediary14>> mmRelatedParties = new MMMessageAssociationEnd<QuoteStatus2, List<Intermediary14>>() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteStatus2.mmObject();
			isDerived = false;
			xmlTag = "RltdPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedParties";
			definition = "Parties used for acting parties that applies either to the whole message or to individual sides.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary14.mmObject();
		}

		@Override
		public List<Intermediary14> getValue(QuoteStatus2 obj) {
			return obj.getRelatedParties();
		}

		@Override
		public void setValue(QuoteStatus2 obj, List<Intermediary14> value) {
			obj.setRelatedParties(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuoteStatus2.mmQuoteStatus, com.tools20022.repository.msg.QuoteStatus2.mmRejectionReason, com.tools20022.repository.msg.QuoteStatus2.mmQuoteSetDetails,
						com.tools20022.repository.msg.QuoteStatus2.mmRelatedParties);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuoteStatus2";
				definition = "Identifies the status of a quote and if required, the rejection reason, and the parties and the details of the quote.";
			}
		});
		return mmObject_lazy.get();
	}

	public QuoteStatus1Code getQuoteStatus() {
		return quoteStatus;
	}

	public QuoteStatus2 setQuoteStatus(QuoteStatus1Code quoteStatus) {
		this.quoteStatus = Objects.requireNonNull(quoteStatus);
		return this;
	}

	public Optional<RejectionReason3Code> getRejectionReason() {
		return rejectionReason == null ? Optional.empty() : Optional.of(rejectionReason);
	}

	public QuoteStatus2 setRejectionReason(RejectionReason3Code rejectionReason) {
		this.rejectionReason = rejectionReason;
		return this;
	}

	public List<QuoteSet2> getQuoteSetDetails() {
		return quoteSetDetails == null ? quoteSetDetails = new ArrayList<>() : quoteSetDetails;
	}

	public QuoteStatus2 setQuoteSetDetails(List<QuoteSet2> quoteSetDetails) {
		this.quoteSetDetails = Objects.requireNonNull(quoteSetDetails);
		return this;
	}

	public List<Intermediary14> getRelatedParties() {
		return relatedParties == null ? relatedParties = new ArrayList<>() : relatedParties;
	}

	public QuoteStatus2 setRelatedParties(List<Intermediary14> relatedParties) {
		this.relatedParties = Objects.requireNonNull(relatedParties);
		return this;
	}
}