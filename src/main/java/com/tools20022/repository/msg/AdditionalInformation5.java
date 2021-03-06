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
import com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV01;
import com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02;
import com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01;
import com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.GeneratedRepository;
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
 * Contains additional information related to the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation5#mmInformation
 * AdditionalInformation5.mmInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV01#mmAdditionalMessageInformation
 * AccountExcludedMandateMaintenanceRequestV01.mmAdditionalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmAdditionalMessageInformation
 * AccountExcludedMandateMaintenanceRequestV02.mmAdditionalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmAdditionalMessageInformation
 * AccountMandateMaintenanceRequestV01.mmAdditionalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#mmAdditionalMessageInformation
 * AccountMandateMaintenanceRequestV02.mmAdditionalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmAdditionalInformation
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalInformation5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contains additional information related to the message."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalInformation5", propOrder = "information")
public class AdditionalInformation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Inf", required = true)
	protected List<Max256Text> information;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation5
	 * AdditionalInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Inf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contains additional information related to the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalInformation5, List<Max256Text>> mmInformation = new MMMessageAttribute<AdditionalInformation5, List<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation5.mmObject();
			isDerived = false;
			xmlTag = "Inf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Contains additional information related to the message.";
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public List<Max256Text> getValue(AdditionalInformation5 obj) {
			return obj.getInformation();
		}

		@Override
		public void setValue(AdditionalInformation5 obj, List<Max256Text> value) {
			obj.setInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalInformation5.mmInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountExcludedMandateMaintenanceRequestV01.mmAdditionalMessageInformation, AccountExcludedMandateMaintenanceRequestV02.mmAdditionalMessageInformation,
						AccountMandateMaintenanceRequestV01.mmAdditionalMessageInformation, AccountMandateMaintenanceRequestV02.mmAdditionalMessageInformation,
						ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmAdditionalInformation);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalInformation5";
				definition = "Contains additional information related to the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max256Text> getInformation() {
		return information == null ? information = new ArrayList<>() : information;
	}

	public AdditionalInformation5 setInformation(List<Max256Text> information) {
		this.information = Objects.requireNonNull(information);
		return this;
	}
}