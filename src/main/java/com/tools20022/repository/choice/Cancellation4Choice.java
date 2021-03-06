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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.TransferOutCancellationRequestV05;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TransferOut11;
import com.tools20022.repository.msg.TransferReference5;
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
 * Choice between cancellation by reference or by transfer details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation4Choice#mmReferences
 * Cancellation4Choice.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Cancellation4Choice#mmTransferOutDetails
 * Cancellation4Choice.mmTransferOutDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV05#mmCancellation
 * TransferOutCancellationRequestV05.mmCancellation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cancellation4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between cancellation by reference or by transfer details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Cancellation8Choice
 * Cancellation8Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.Cancellation1Choice
 * Cancellation1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Cancellation4Choice", propOrder = {"references", "transferOutDetails"})
public class Cancellation4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs", required = true)
	protected List<TransferReference5> references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference5
	 * TransferReference5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation4Choice
	 * Cancellation4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the transfer to be cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation8Choice#mmReferences
	 * Cancellation8Choice.mmReferences}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation1Choice#mmReference
	 * Cancellation1Choice.mmReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cancellation4Choice, List<TransferReference5>> mmReferences = new MMMessageAttribute<Cancellation4Choice, List<TransferReference5>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.choice.Cancellation4Choice.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference of the transfer to be cancelled.";
			nextVersions_lazy = () -> Arrays.asList(Cancellation8Choice.mmReferences);
			previousVersion_lazy = () -> Cancellation1Choice.mmReference;
			minOccurs = 1;
			complexType_lazy = () -> TransferReference5.mmObject();
		}

		@Override
		public List<TransferReference5> getValue(Cancellation4Choice obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(Cancellation4Choice obj, List<TransferReference5> value) {
			obj.setReferences(value);
		}
	};
	@XmlElement(name = "TrfOutDtls", required = true)
	protected TransferOut11 transferOutDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TransferOut11
	 * TransferOut11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation4Choice
	 * Cancellation4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfOutDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOutDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transfer out request to cancel."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Cancellation8Choice#mmTransferOutDetails
	 * Cancellation8Choice.mmTransferOutDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation1Choice#mmTransferOutDetails
	 * Cancellation1Choice.mmTransferOutDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cancellation4Choice, TransferOut11> mmTransferOutDetails = new MMMessageAttribute<Cancellation4Choice, TransferOut11>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.Cancellation4Choice.mmObject();
			isDerived = false;
			xmlTag = "TrfOutDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOutDetails";
			definition = "Details of the transfer out request to cancel.";
			nextVersions_lazy = () -> Arrays.asList(Cancellation8Choice.mmTransferOutDetails);
			previousVersion_lazy = () -> Cancellation1Choice.mmTransferOutDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransferOut11.mmObject();
		}

		@Override
		public TransferOut11 getValue(Cancellation4Choice obj) {
			return obj.getTransferOutDetails();
		}

		@Override
		public void setValue(Cancellation4Choice obj, TransferOut11 value) {
			obj.setTransferOutDetails(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Cancellation4Choice.mmReferences, com.tools20022.repository.choice.Cancellation4Choice.mmTransferOutDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferOutCancellationRequestV05.mmCancellation);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cancellation4Choice";
				definition = "Choice between cancellation by reference or by transfer details.";
				nextVersions_lazy = () -> Arrays.asList(Cancellation8Choice.mmObject());
				previousVersion_lazy = () -> Cancellation1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<TransferReference5> getReferences() {
		return references == null ? references = new ArrayList<>() : references;
	}

	public Cancellation4Choice setReferences(List<TransferReference5> references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public TransferOut11 getTransferOutDetails() {
		return transferOutDetails;
	}

	public Cancellation4Choice setTransferOutDetails(TransferOut11 transferOutDetails) {
		this.transferOutDetails = Objects.requireNonNull(transferOutDetails);
		return this;
	}
}