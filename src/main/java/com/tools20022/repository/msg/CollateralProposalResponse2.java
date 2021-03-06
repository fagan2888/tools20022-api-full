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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CollateralMovement;
import com.tools20022.repository.entity.CollateralProposal;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralProposalResponseType2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the collateral proposal response for the variation margin and
 * optionaly the segregated independent amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse2#mmVariationMargin
 * CollateralProposalResponse2.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse2#mmSegregatedIndependentAmount
 * CollateralProposalResponse2.mmSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralProposal
 * CollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralProposalResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the collateral proposal response for the variation margin and optionaly the segregated independent amount."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposalResponse3
 * CollateralProposalResponse3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse1
 * CollateralProposalResponse1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralProposalResponse2", propOrder = {"variationMargin", "segregatedIndependentAmount"})
public class CollateralProposalResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "VartnMrgn", required = true)
	protected CollateralProposalResponseType2 variationMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2
	 * CollateralProposalResponseType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmVariationMargin
	 * CollateralMovement.mmVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse2
	 * CollateralProposalResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral proposal response for the variation margin."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse3#mmVariationMargin
	 * CollateralProposalResponse3.mmVariationMargin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse1#mmVariationMargin
	 * CollateralProposalResponse1.mmVariationMargin}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralProposalResponse2, CollateralProposalResponseType2> mmVariationMargin = new MMMessageAssociationEnd<CollateralProposalResponse2, CollateralProposalResponseType2>() {
		{
			businessElementTrace_lazy = () -> CollateralMovement.mmVariationMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponse2.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Provides the collateral proposal response for the variation margin.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponse3.mmVariationMargin);
			previousVersion_lazy = () -> CollateralProposalResponse1.mmVariationMargin;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralProposalResponseType2.mmObject();
		}

		@Override
		public CollateralProposalResponseType2 getValue(CollateralProposalResponse2 obj) {
			return obj.getVariationMargin();
		}

		@Override
		public void setValue(CollateralProposalResponse2 obj, CollateralProposalResponseType2 value) {
			obj.setVariationMargin(value);
		}
	};
	@XmlElement(name = "SgrtdIndpdntAmt")
	protected CollateralProposalResponseType2 segregatedIndependentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2
	 * CollateralProposalResponseType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmSegregatedIndependentAmount
	 * CollateralMovement.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse2
	 * CollateralProposalResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral proposal response for the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse3#mmSegregatedIndependentAmount
	 * CollateralProposalResponse3.mmSegregatedIndependentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse1#mmSegregatedIndependentAmount
	 * CollateralProposalResponse1.mmSegregatedIndependentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralProposalResponse2, Optional<CollateralProposalResponseType2>> mmSegregatedIndependentAmount = new MMMessageAssociationEnd<CollateralProposalResponse2, Optional<CollateralProposalResponseType2>>() {
		{
			businessElementTrace_lazy = () -> CollateralMovement.mmSegregatedIndependentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponse2.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the collateral proposal response for the segregated independent amount.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponse3.mmSegregatedIndependentAmount);
			previousVersion_lazy = () -> CollateralProposalResponse1.mmSegregatedIndependentAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralProposalResponseType2.mmObject();
		}

		@Override
		public Optional<CollateralProposalResponseType2> getValue(CollateralProposalResponse2 obj) {
			return obj.getSegregatedIndependentAmount();
		}

		@Override
		public void setValue(CollateralProposalResponse2 obj, Optional<CollateralProposalResponseType2> value) {
			obj.setSegregatedIndependentAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralProposalResponse2.mmVariationMargin, com.tools20022.repository.msg.CollateralProposalResponse2.mmSegregatedIndependentAmount);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralProposalResponse2";
				definition = "Provides the collateral proposal response for the variation margin and optionaly the segregated independent amount.";
				nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponse3.mmObject());
				previousVersion_lazy = () -> CollateralProposalResponse1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralProposalResponseType2 getVariationMargin() {
		return variationMargin;
	}

	public CollateralProposalResponse2 setVariationMargin(CollateralProposalResponseType2 variationMargin) {
		this.variationMargin = Objects.requireNonNull(variationMargin);
		return this;
	}

	public Optional<CollateralProposalResponseType2> getSegregatedIndependentAmount() {
		return segregatedIndependentAmount == null ? Optional.empty() : Optional.of(segregatedIndependentAmount);
	}

	public CollateralProposalResponse2 setSegregatedIndependentAmount(CollateralProposalResponseType2 segregatedIndependentAmount) {
		this.segregatedIndependentAmount = segregatedIndependentAmount;
		return this;
	}
}