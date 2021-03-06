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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Investor;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DeMinimusApplicable1;
import com.tools20022.repository.msg.DeMinimusNotApplicable1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the investment account ownership with respect to new issue
 * allocation for a hedge fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#DeMinimusApplicableOrNotApplicableRule
 * NewIssueAllocation1.DeMinimusApplicableOrNotApplicableRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmRestricted
 * NewIssueAllocation1.mmRestricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmExemptPersonReason
 * NewIssueAllocation1.mmExemptPersonReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmDeMinimusApplicable
 * NewIssueAllocation1.mmDeMinimusApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmDeMinimusNotApplicable
 * NewIssueAllocation1.mmDeMinimusNotApplicable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Investor Investor}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmNewIssueAllocation
 * AccountDetailsConfirmationV02.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmNewIssueAllocation
 * AccountDetailsConfirmationV03.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV02#mmNewIssueAllocation
 * AccountOpeningInstructionV02.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmNewIssueAllocation
 * AccountOpeningInstructionV03.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV04#mmNewIssueAllocation
 * AccountDetailsConfirmationV04.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV04#mmNewIssueAllocation
 * AccountOpeningInstructionV04.mmNewIssueAllocation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NewIssueAllocation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the investment account ownership with respect to new issue allocation for a hedge fund."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NewIssueAllocation2
 * NewIssueAllocation2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NewIssueAllocation1", propOrder = {"restricted", "exemptPersonReason", "deMinimusApplicable", "deMinimusNotApplicable"})
public class NewIssueAllocation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rstrctd", required = true)
	protected YesNoIndicator restricted;
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
	 * {@linkplain com.tools20022.repository.entity.Investor#mmRestricted
	 * Investor.mmRestricted}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1
	 * NewIssueAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor is eligible to participate in the profits and losses from a new issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2#mmRestricted
	 * NewIssueAllocation2.mmRestricted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NewIssueAllocation1, YesNoIndicator> mmRestricted = new MMMessageAttribute<NewIssueAllocation1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Investor.mmRestricted;
			componentContext_lazy = () -> com.tools20022.repository.msg.NewIssueAllocation1.mmObject();
			isDerived = false;
			xmlTag = "Rstrctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			definition = "Indicates whether the investor is eligible to participate in the profits and losses from a new issue.";
			nextVersions_lazy = () -> Arrays.asList(NewIssueAllocation2.mmRestricted);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(NewIssueAllocation1 obj) {
			return obj.getRestricted();
		}

		@Override
		public void setValue(NewIssueAllocation1 obj, YesNoIndicator value) {
			obj.setRestricted(value);
		}
	};
	@XmlElement(name = "XmptPrsnRsn")
	protected Max350Text exemptPersonReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1
	 * NewIssueAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptPrsnRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptPersonReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for exemption."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2#mmExemptPersonReason
	 * NewIssueAllocation2.mmExemptPersonReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NewIssueAllocation1, Optional<Max350Text>> mmExemptPersonReason = new MMMessageAttribute<NewIssueAllocation1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NewIssueAllocation1.mmObject();
			isDerived = false;
			xmlTag = "XmptPrsnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptPersonReason";
			definition = "Reason for exemption.";
			nextVersions_lazy = () -> Arrays.asList(NewIssueAllocation2.mmExemptPersonReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(NewIssueAllocation1 obj) {
			return obj.getExemptPersonReason();
		}

		@Override
		public void setValue(NewIssueAllocation1 obj, Optional<Max350Text> value) {
			obj.setExemptPersonReason(value.orElse(null));
		}
	};
	@XmlElement(name = "DeMnmsAplbl")
	protected DeMinimusApplicable1 deMinimusApplicable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DeMinimusApplicable1
	 * DeMinimusApplicable1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Investor#mmDeMinimusApplicable
	 * Investor.mmDeMinimusApplicable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1
	 * NewIssueAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeMnmsAplbl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeMinimusApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions applicable when the investor is covered by the \"de minimis\" exemption."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NewIssueAllocation1, Optional<DeMinimusApplicable1>> mmDeMinimusApplicable = new MMMessageAssociationEnd<NewIssueAllocation1, Optional<DeMinimusApplicable1>>() {
		{
			businessElementTrace_lazy = () -> Investor.mmDeMinimusApplicable;
			componentContext_lazy = () -> com.tools20022.repository.msg.NewIssueAllocation1.mmObject();
			isDerived = false;
			xmlTag = "DeMnmsAplbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeMinimusApplicable";
			definition = "Conditions applicable when the investor is covered by the \"de minimis\" exemption.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeMinimusApplicable1.mmObject();
		}

		@Override
		public Optional<DeMinimusApplicable1> getValue(NewIssueAllocation1 obj) {
			return obj.getDeMinimusApplicable();
		}

		@Override
		public void setValue(NewIssueAllocation1 obj, Optional<DeMinimusApplicable1> value) {
			obj.setDeMinimusApplicable(value.orElse(null));
		}
	};
	@XmlElement(name = "DeMnmsNotAplbl")
	protected DeMinimusNotApplicable1 deMinimusNotApplicable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DeMinimusNotApplicable1
	 * DeMinimusNotApplicable1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Investor Investor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1
	 * NewIssueAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeMnmsNotAplbl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeMinimusNotApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions applicable when the investor is not covered by the \"de minimis\" exemption."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NewIssueAllocation1, Optional<DeMinimusNotApplicable1>> mmDeMinimusNotApplicable = new MMMessageAssociationEnd<NewIssueAllocation1, Optional<DeMinimusNotApplicable1>>() {
		{
			businessComponentTrace_lazy = () -> Investor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NewIssueAllocation1.mmObject();
			isDerived = false;
			xmlTag = "DeMnmsNotAplbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeMinimusNotApplicable";
			definition = "Conditions applicable when the investor is not covered by the \"de minimis\" exemption.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeMinimusNotApplicable1.mmObject();
		}

		@Override
		public Optional<DeMinimusNotApplicable1> getValue(NewIssueAllocation1 obj) {
			return obj.getDeMinimusNotApplicable();
		}

		@Override
		public void setValue(NewIssueAllocation1 obj, Optional<DeMinimusNotApplicable1> value) {
			obj.setDeMinimusNotApplicable(value.orElse(null));
		}
	};
	/**
	 * Either DeMinimusApplicable Or DeMinimusNotApplicable maybe present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1
	 * NewIssueAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmDeMinimusApplicable
	 * NewIssueAllocation1.mmDeMinimusApplicable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmDeMinimusNotApplicable
	 * NewIssueAllocation1.mmDeMinimusNotApplicable}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeMinimusApplicableOrNotApplicableRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either DeMinimusApplicable Or DeMinimusNotApplicable maybe present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor DeMinimusApplicableOrNotApplicableRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeMinimusApplicableOrNotApplicableRule";
			definition = "Either DeMinimusApplicable Or DeMinimusNotApplicable maybe present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.NewIssueAllocation1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NewIssueAllocation1.mmDeMinimusApplicable, com.tools20022.repository.msg.NewIssueAllocation1.mmDeMinimusNotApplicable);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NewIssueAllocation1.mmRestricted, com.tools20022.repository.msg.NewIssueAllocation1.mmExemptPersonReason,
						com.tools20022.repository.msg.NewIssueAllocation1.mmDeMinimusApplicable, com.tools20022.repository.msg.NewIssueAllocation1.mmDeMinimusNotApplicable);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV02.mmNewIssueAllocation, AccountDetailsConfirmationV03.mmNewIssueAllocation, AccountOpeningInstructionV02.mmNewIssueAllocation,
						AccountOpeningInstructionV03.mmNewIssueAllocation, AccountDetailsConfirmationV04.mmNewIssueAllocation, AccountOpeningInstructionV04.mmNewIssueAllocation);
				trace_lazy = () -> Investor.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "NewIssueAllocation1";
				definition = "Information about the investment account ownership with respect to new issue allocation for a hedge fund.";
				nextVersions_lazy = () -> Arrays.asList(NewIssueAllocation2.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NewIssueAllocation1.DeMinimusApplicableOrNotApplicableRule);
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getRestricted() {
		return restricted;
	}

	public NewIssueAllocation1 setRestricted(YesNoIndicator restricted) {
		this.restricted = Objects.requireNonNull(restricted);
		return this;
	}

	public Optional<Max350Text> getExemptPersonReason() {
		return exemptPersonReason == null ? Optional.empty() : Optional.of(exemptPersonReason);
	}

	public NewIssueAllocation1 setExemptPersonReason(Max350Text exemptPersonReason) {
		this.exemptPersonReason = exemptPersonReason;
		return this;
	}

	public Optional<DeMinimusApplicable1> getDeMinimusApplicable() {
		return deMinimusApplicable == null ? Optional.empty() : Optional.of(deMinimusApplicable);
	}

	public NewIssueAllocation1 setDeMinimusApplicable(DeMinimusApplicable1 deMinimusApplicable) {
		this.deMinimusApplicable = deMinimusApplicable;
		return this;
	}

	public Optional<DeMinimusNotApplicable1> getDeMinimusNotApplicable() {
		return deMinimusNotApplicable == null ? Optional.empty() : Optional.of(deMinimusNotApplicable);
	}

	public NewIssueAllocation1 setDeMinimusNotApplicable(DeMinimusNotApplicable1 deMinimusNotApplicable) {
		this.deMinimusNotApplicable = deMinimusNotApplicable;
		return this;
	}
}