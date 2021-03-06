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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AccountContract;
import com.tools20022.repository.entity.CashAccountContract;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies target dates dates related to account opening and closing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract2#mmTargetGoLiveDate
 * AccountContract2.mmTargetGoLiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountContract2#mmTargetClosingDate
 * AccountContract2.mmTargetClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountContract2#mmUrgencyFlag
 * AccountContract2.mmUrgencyFlag}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV01#mmContractDates
 * AccountExcludedMandateMaintenanceAmendmentRequestV01.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#mmContractDates
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV01#mmContractDates
 * AccountExcludedMandateMaintenanceRequestV01.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmContractDates
 * AccountExcludedMandateMaintenanceRequestV02.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV01#mmContractDates
 * AccountMandateMaintenanceAmendmentRequestV01.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmContractDates
 * AccountMandateMaintenanceAmendmentRequestV02.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmContractDates
 * AccountMandateMaintenanceRequestV01.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#mmContractDates
 * AccountMandateMaintenanceRequestV02.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmContractDates
 * AccountOpeningAmendmentRequestV01.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#mmContractDates
 * AccountOpeningAmendmentRequestV02.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV01#mmContractDates
 * AccountOpeningRequestV01.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#mmContractDates
 * AccountOpeningRequestV02.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV01#mmContractDates
 * AccountReportRequestV01.mmContractDates}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountContract2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies target dates dates related to account opening and closing."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountContract2", propOrder = {"targetGoLiveDate", "targetClosingDate", "urgencyFlag"})
public class AccountContract2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrgtGoLiveDt")
	protected ISODate targetGoLiveDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTargetGoLiveDate
	 * AccountContract.mmTargetGoLiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract2
	 * AccountContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtGoLiveDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetGoLiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related basic services are expected to be operational for the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountContract2, Optional<ISODate>> mmTargetGoLiveDate = new MMMessageAttribute<AccountContract2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmTargetGoLiveDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountContract2.mmObject();
			isDerived = false;
			xmlTag = "TrgtGoLiveDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetGoLiveDate";
			definition = "Date on which the account and related basic services are expected to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AccountContract2 obj) {
			return obj.getTargetGoLiveDate();
		}

		@Override
		public void setValue(AccountContract2 obj, Optional<ISODate> value) {
			obj.setTargetGoLiveDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TrgtClsgDt")
	protected ISODate targetClosingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTargetClosingDate
	 * AccountContract.mmTargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract2
	 * AccountContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrgtClsgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services are expected to cease to be operational for the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountContract2, Optional<ISODate>> mmTargetClosingDate = new MMMessageAttribute<AccountContract2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmTargetClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountContract2.mmObject();
			isDerived = false;
			xmlTag = "TrgtClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TargetClosingDate";
			definition = "Date on which the account and related services are expected to cease to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AccountContract2 obj) {
			return obj.getTargetClosingDate();
		}

		@Override
		public void setValue(AccountContract2 obj, Optional<ISODate> value) {
			obj.setTargetClosingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "UrgcyFlg")
	protected YesNoIndicator urgencyFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmUrgencyFlag
	 * AccountContract.mmUrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract2
	 * AccountContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UrgcyFlg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UrgencyFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator that the account opening/maintenance/closing process needs to be treated urgently, that is, sooner than the terms established by the service level agreed between the account holder customer and the account servicing institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountContract2, Optional<YesNoIndicator>> mmUrgencyFlag = new MMMessageAttribute<AccountContract2, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmUrgencyFlag;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountContract2.mmObject();
			isDerived = false;
			xmlTag = "UrgcyFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgencyFlag";
			definition = "Indicator that the account opening/maintenance/closing process needs to be treated urgently, that is, sooner than the terms established by the service level agreed between the account holder customer and the account servicing institution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(AccountContract2 obj) {
			return obj.getUrgencyFlag();
		}

		@Override
		public void setValue(AccountContract2 obj, Optional<YesNoIndicator> value) {
			obj.setUrgencyFlag(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountContract2.mmTargetGoLiveDate, com.tools20022.repository.msg.AccountContract2.mmTargetClosingDate,
						com.tools20022.repository.msg.AccountContract2.mmUrgencyFlag);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountExcludedMandateMaintenanceAmendmentRequestV01.mmContractDates, AccountExcludedMandateMaintenanceAmendmentRequestV02.mmContractDates,
						AccountExcludedMandateMaintenanceRequestV01.mmContractDates, AccountExcludedMandateMaintenanceRequestV02.mmContractDates, AccountMandateMaintenanceAmendmentRequestV01.mmContractDates,
						AccountMandateMaintenanceAmendmentRequestV02.mmContractDates, AccountMandateMaintenanceRequestV01.mmContractDates, AccountMandateMaintenanceRequestV02.mmContractDates,
						AccountOpeningAmendmentRequestV01.mmContractDates, AccountOpeningAmendmentRequestV02.mmContractDates, AccountOpeningRequestV01.mmContractDates, AccountOpeningRequestV02.mmContractDates,
						AccountReportRequestV01.mmContractDates);
				trace_lazy = () -> CashAccountContract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountContract2";
				definition = "Specifies target dates dates related to account opening and closing.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getTargetGoLiveDate() {
		return targetGoLiveDate == null ? Optional.empty() : Optional.of(targetGoLiveDate);
	}

	public AccountContract2 setTargetGoLiveDate(ISODate targetGoLiveDate) {
		this.targetGoLiveDate = targetGoLiveDate;
		return this;
	}

	public Optional<ISODate> getTargetClosingDate() {
		return targetClosingDate == null ? Optional.empty() : Optional.of(targetClosingDate);
	}

	public AccountContract2 setTargetClosingDate(ISODate targetClosingDate) {
		this.targetClosingDate = targetClosingDate;
		return this;
	}

	public Optional<YesNoIndicator> getUrgencyFlag() {
		return urgencyFlag == null ? Optional.empty() : Optional.of(urgencyFlag);
	}

	public AccountContract2 setUrgencyFlag(YesNoIndicator urgencyFlag) {
		this.urgencyFlag = urgencyFlag;
		return this;
	}
}