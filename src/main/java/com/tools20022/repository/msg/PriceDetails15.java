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
import com.tools20022.repository.choice.PriceFormat23Choice;
import com.tools20022.repository.choice.PriceFormat32Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the prices related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceDetails15#mmGenericCashPricePaidPerProduct
 * PriceDetails15.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceDetails15#mmGenericCashPriceReceivedPerProduct
 * PriceDetails15.mmGenericCashPriceReceivedPerProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceDetails15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the prices related to a corporate action option."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forPriceDetails15
 * ConstraintGenericCashPricePerProductGuideline.forPriceDetails15}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails22 PriceDetails22}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PriceDetails10
 * PriceDetails10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceDetails15", propOrder = {"genericCashPricePaidPerProduct", "genericCashPriceReceivedPerProduct"})
public class PriceDetails15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GncCshPricPdPerPdct")
	protected PriceFormat23Choice genericCashPricePaidPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat23Choice
	 * PriceFormat23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails15 PriceDetails15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricPdPerPdct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price paid per product by the underlying security holder either as a percentage or an amount or a number of points above an index, for example, reinvestment price, strike price and exercise price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#mmGenericCashPricePaidPerProduct
	 * PriceDetails22.mmGenericCashPricePaidPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails10#mmGenericCashPricePaidPerProduct
	 * PriceDetails10.mmGenericCashPricePaidPerProduct}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceDetails15, Optional<PriceFormat23Choice>> mmGenericCashPricePaidPerProduct = new MMMessageAssociationEnd<PriceDetails15, Optional<PriceFormat23Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceDetails15.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricPdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Generic cash price paid per product by the underlying security holder either as a percentage or an amount or a number of points above an index, for example, reinvestment price, strike price and exercise price.";
			nextVersions_lazy = () -> Arrays.asList(PriceDetails22.mmGenericCashPricePaidPerProduct);
			previousVersion_lazy = () -> PriceDetails10.mmGenericCashPricePaidPerProduct;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat23Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat23Choice> getValue(PriceDetails15 obj) {
			return obj.getGenericCashPricePaidPerProduct();
		}

		@Override
		public void setValue(PriceDetails15 obj, Optional<PriceFormat23Choice> value) {
			obj.setGenericCashPricePaidPerProduct(value.orElse(null));
		}
	};
	@XmlElement(name = "GncCshPricRcvdPerPdct")
	protected PriceFormat32Choice genericCashPriceReceivedPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat32Choice
	 * PriceFormat32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails15 PriceDetails15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricRcvdPerPdct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails22.mmGenericCashPriceReceivedPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails10#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails10.mmGenericCashPriceReceivedPerProduct}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceDetails15, Optional<PriceFormat32Choice>> mmGenericCashPriceReceivedPerProduct = new MMMessageAssociationEnd<PriceDetails15, Optional<PriceFormat32Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceDetails15.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricRcvdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price.";
			nextVersions_lazy = () -> Arrays.asList(PriceDetails22.mmGenericCashPriceReceivedPerProduct);
			previousVersion_lazy = () -> PriceDetails10.mmGenericCashPriceReceivedPerProduct;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat32Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat32Choice> getValue(PriceDetails15 obj) {
			return obj.getGenericCashPriceReceivedPerProduct();
		}

		@Override
		public void setValue(PriceDetails15 obj, Optional<PriceFormat32Choice> value) {
			obj.setGenericCashPriceReceivedPerProduct(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceDetails15.mmGenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails15.mmGenericCashPriceReceivedPerProduct);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails15);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceDetails15";
				definition = "Provides information about the prices related to a corporate action option.";
				nextVersions_lazy = () -> Arrays.asList(PriceDetails22.mmObject());
				previousVersion_lazy = () -> PriceDetails10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriceFormat23Choice> getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct == null ? Optional.empty() : Optional.of(genericCashPricePaidPerProduct);
	}

	public PriceDetails15 setGenericCashPricePaidPerProduct(PriceFormat23Choice genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
		return this;
	}

	public Optional<PriceFormat32Choice> getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct == null ? Optional.empty() : Optional.of(genericCashPriceReceivedPerProduct);
	}

	public PriceDetails15 setGenericCashPriceReceivedPerProduct(PriceFormat32Choice genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = genericCashPriceReceivedPerProduct;
		return this;
	}
}