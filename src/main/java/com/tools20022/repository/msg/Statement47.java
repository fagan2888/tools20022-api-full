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
import com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV05;
import com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV06;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.DateOrDateTimePeriodChoice;
import com.tools20022.repository.choice.Frequency25Choice;
import com.tools20022.repository.choice.UpdateType15Choice;
import com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code;
import com.tools20022.repository.codeset.CorporateActionStatementType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General characteristics related to a statement which reports information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Statement47#mmStatementType
 * Statement47.mmStatementType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement47#mmReportingType
 * Statement47.mmReportingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement47#mmStatementIdentification
 * Statement47.mmStatementIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement47#mmReportNumber
 * Statement47.mmReportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement47#mmStatementDateTime
 * Statement47.mmStatementDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement47#mmFrequency
 * Statement47.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Statement47#mmUpdateType
 * Statement47.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement47#mmActivityIndicator
 * Statement47.mmActivityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Statement47#mmNotificationDeadlinePeriod
 * Statement47.mmNotificationDeadlinePeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV05#mmStatementGeneralDetails
 * CorporateActionInstructionStatementReportV05.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV06#mmStatementGeneralDetails
 * CorporateActionInstructionStatementReportV06.mmStatementGeneralDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Statement47"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General characteristics related to a statement which reports information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Statement65 Statement65}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Statement12
 * Statement12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Statement47", propOrder = {"statementType", "reportingType", "statementIdentification", "reportNumber", "statementDateTime", "frequency", "updateType", "activityIndicator", "notificationDeadlinePeriod"})
public class Statement47 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtTp", required = true)
	protected CorporateActionStatementType1Code statementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementType1Code
	 * CorporateActionStatementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement47 Statement47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement contains missing instructions only or all instructions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement65#mmStatementType
	 * Statement65.mmStatementType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement12#mmStatementType
	 * Statement12.mmStatementType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement47, CorporateActionStatementType1Code> mmStatementType = new MMMessageAttribute<Statement47, CorporateActionStatementType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement47.mmObject();
			isDerived = false;
			xmlTag = "StmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementType";
			definition = "Indicates whether the statement contains missing instructions only or all instructions.";
			nextVersions_lazy = () -> Arrays.asList(Statement65.mmStatementType);
			previousVersion_lazy = () -> Statement12.mmStatementType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionStatementType1Code.mmObject();
		}

		@Override
		public CorporateActionStatementType1Code getValue(Statement47 obj) {
			return obj.getStatementType();
		}

		@Override
		public void setValue(Statement47 obj, CorporateActionStatementType1Code value) {
			obj.setStatementType(value);
		}
	};
	@XmlElement(name = "RptgTp", required = true)
	protected CorporateActionStatementReportingType1Code reportingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementReportingType1Code
	 * CorporateActionStatementReportingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement47 Statement47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the statement report on account holdings for corporate action events is for single account/multiple events or multiple accounts/single event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement65#mmReportingType
	 * Statement65.mmReportingType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement12#mmReportingType
	 * Statement12.mmReportingType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement47, CorporateActionStatementReportingType1Code> mmReportingType = new MMMessageAttribute<Statement47, CorporateActionStatementReportingType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement47.mmObject();
			isDerived = false;
			xmlTag = "RptgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingType";
			definition = "Indicates whether the statement report on account holdings for corporate action events is for single account/multiple events or multiple accounts/single event.";
			nextVersions_lazy = () -> Arrays.asList(Statement65.mmReportingType);
			previousVersion_lazy = () -> Statement12.mmReportingType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionStatementReportingType1Code.mmObject();
		}

		@Override
		public CorporateActionStatementReportingType1Code getValue(Statement47 obj) {
			return obj.getReportingType();
		}

		@Override
		public void setValue(Statement47 obj, CorporateActionStatementReportingType1Code value) {
			obj.setReportingType(value);
		}
	};
	@XmlElement(name = "StmtId", required = true)
	protected Max35Text statementIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement47 Statement47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement65#mmStatementIdentification
	 * Statement65.mmStatementIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement12#mmStatementIdentification
	 * Statement12.mmStatementIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement47, Max35Text> mmStatementIdentification = new MMMessageAttribute<Statement47, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement47.mmObject();
			isDerived = false;
			xmlTag = "StmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementIdentification";
			definition = "Reference of the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement65.mmStatementIdentification);
			previousVersion_lazy = () -> Statement12.mmStatementIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Statement47 obj) {
			return obj.getStatementIdentification();
		}

		@Override
		public void setValue(Statement47 obj, Max35Text value) {
			obj.setStatementIdentification(value);
		}
	};
	@XmlElement(name = "RptNb")
	protected Max5NumericText reportNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement47 Statement47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::STAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Statement65#mmReportNumber
	 * Statement65.mmReportNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement12#mmReportNumber
	 * Statement12.mmReportNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement47, Optional<Max5NumericText>> mmReportNumber = new MMMessageAttribute<Statement47, Optional<Max5NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement47.mmObject();
			isDerived = false;
			xmlTag = "RptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportNumber";
			definition = "Sequential number of the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement65.mmReportNumber);
			previousVersion_lazy = () -> Statement12.mmReportNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Optional<Max5NumericText> getValue(Statement47 obj) {
			return obj.getReportNumber();
		}

		@Override
		public void setValue(Statement47 obj, Optional<Max5NumericText> value) {
			obj.setReportNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtDtTm", required = true)
	protected DateAndDateTimeChoice statementDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement47 Statement47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::STAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement65#mmStatementDateTime
	 * Statement65.mmStatementDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement12#mmStatementDateTime
	 * Statement12.mmStatementDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement47, DateAndDateTimeChoice> mmStatementDateTime = new MMMessageAttribute<Statement47, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement47.mmObject();
			isDerived = false;
			xmlTag = "StmtDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::STAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateTime";
			definition = "Date of the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement65.mmStatementDateTime);
			previousVersion_lazy = () -> Statement12.mmStatementDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(Statement47 obj) {
			return obj.getStatementDateTime();
		}

		@Override
		public void setValue(Statement47 obj, DateAndDateTimeChoice value) {
			obj.setStatementDateTime(value);
		}
	};
	@XmlElement(name = "Frqcy", required = true)
	protected Frequency25Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency25Choice
	 * Frequency25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement47 Statement47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SFRE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Statement65#mmFrequency
	 * Statement65.mmFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement12#mmFrequency
	 * Statement12.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement47, Frequency25Choice> mmFrequency = new MMMessageAttribute<Statement47, Frequency25Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement47.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SFRE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement65.mmFrequency);
			previousVersion_lazy = () -> Statement12.mmFrequency;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency25Choice.mmObject();
		}

		@Override
		public Frequency25Choice getValue(Statement47 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(Statement47 obj, Frequency25Choice value) {
			obj.setFrequency(value);
		}
	};
	@XmlElement(name = "UpdTp", required = true)
	protected UpdateType15Choice updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType15Choice
	 * UpdateType15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement47 Statement47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the report is complete or contains changes only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CODE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Statement65#mmUpdateType
	 * Statement65.mmUpdateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement12#mmUpdateType
	 * Statement12.mmUpdateType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement47, UpdateType15Choice> mmUpdateType = new MMMessageAttribute<Statement47, UpdateType15Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement47.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CODE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the report is complete or contains changes only.";
			nextVersions_lazy = () -> Arrays.asList(Statement65.mmUpdateType);
			previousVersion_lazy = () -> Statement12.mmUpdateType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UpdateType15Choice.mmObject();
		}

		@Override
		public UpdateType15Choice getValue(Statement47 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(Statement47 obj, UpdateType15Choice value) {
			obj.setUpdateType(value);
		}
	};
	@XmlElement(name = "ActvtyInd", required = true)
	protected YesNoIndicator activityIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement47 Statement47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is activity or information update reported in the statement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACTI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement65#mmActivityIndicator
	 * Statement65.mmActivityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement12#mmActivityIndicator
	 * Statement12.mmActivityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Statement47, YesNoIndicator> mmActivityIndicator = new MMMessageAttribute<Statement47, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement47.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACTI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or information update reported in the statement.";
			nextVersions_lazy = () -> Arrays.asList(Statement65.mmActivityIndicator);
			previousVersion_lazy = () -> Statement12.mmActivityIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Statement47 obj) {
			return obj.getActivityIndicator();
		}

		@Override
		public void setValue(Statement47 obj, YesNoIndicator value) {
			obj.setActivityIndicator(value);
		}
	};
	@XmlElement(name = "NtfctnDdlnPrd")
	protected DateOrDateTimePeriodChoice notificationDeadlinePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriodChoice
	 * DateOrDateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Statement47 Statement47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnDdlnPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationDeadlinePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which identification deadline has been set."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Statement65#mmNotificationDeadlinePeriod
	 * Statement65.mmNotificationDeadlinePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Statement12#mmNotificationDeadlinePeriod
	 * Statement12.mmNotificationDeadlinePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Statement47, Optional<DateOrDateTimePeriodChoice>> mmNotificationDeadlinePeriod = new MMMessageAssociationEnd<Statement47, Optional<DateOrDateTimePeriodChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Statement47.mmObject();
			isDerived = false;
			xmlTag = "NtfctnDdlnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationDeadlinePeriod";
			definition = "Period during which identification deadline has been set.";
			nextVersions_lazy = () -> Arrays.asList(Statement65.mmNotificationDeadlinePeriod);
			previousVersion_lazy = () -> Statement12.mmNotificationDeadlinePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateOrDateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateOrDateTimePeriodChoice> getValue(Statement47 obj) {
			return obj.getNotificationDeadlinePeriod();
		}

		@Override
		public void setValue(Statement47 obj, Optional<DateOrDateTimePeriodChoice> value) {
			obj.setNotificationDeadlinePeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Statement47.mmStatementType, com.tools20022.repository.msg.Statement47.mmReportingType,
						com.tools20022.repository.msg.Statement47.mmStatementIdentification, com.tools20022.repository.msg.Statement47.mmReportNumber, com.tools20022.repository.msg.Statement47.mmStatementDateTime,
						com.tools20022.repository.msg.Statement47.mmFrequency, com.tools20022.repository.msg.Statement47.mmUpdateType, com.tools20022.repository.msg.Statement47.mmActivityIndicator,
						com.tools20022.repository.msg.Statement47.mmNotificationDeadlinePeriod);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionStatementReportV05.mmStatementGeneralDetails, CorporateActionInstructionStatementReportV06.mmStatementGeneralDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Statement47";
				definition = "General characteristics related to a statement which reports information.";
				nextVersions_lazy = () -> Arrays.asList(Statement65.mmObject());
				previousVersion_lazy = () -> Statement12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionStatementType1Code getStatementType() {
		return statementType;
	}

	public Statement47 setStatementType(CorporateActionStatementType1Code statementType) {
		this.statementType = Objects.requireNonNull(statementType);
		return this;
	}

	public CorporateActionStatementReportingType1Code getReportingType() {
		return reportingType;
	}

	public Statement47 setReportingType(CorporateActionStatementReportingType1Code reportingType) {
		this.reportingType = Objects.requireNonNull(reportingType);
		return this;
	}

	public Max35Text getStatementIdentification() {
		return statementIdentification;
	}

	public Statement47 setStatementIdentification(Max35Text statementIdentification) {
		this.statementIdentification = Objects.requireNonNull(statementIdentification);
		return this;
	}

	public Optional<Max5NumericText> getReportNumber() {
		return reportNumber == null ? Optional.empty() : Optional.of(reportNumber);
	}

	public Statement47 setReportNumber(Max5NumericText reportNumber) {
		this.reportNumber = reportNumber;
		return this;
	}

	public DateAndDateTimeChoice getStatementDateTime() {
		return statementDateTime;
	}

	public Statement47 setStatementDateTime(DateAndDateTimeChoice statementDateTime) {
		this.statementDateTime = Objects.requireNonNull(statementDateTime);
		return this;
	}

	public Frequency25Choice getFrequency() {
		return frequency;
	}

	public Statement47 setFrequency(Frequency25Choice frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public UpdateType15Choice getUpdateType() {
		return updateType;
	}

	public Statement47 setUpdateType(UpdateType15Choice updateType) {
		this.updateType = Objects.requireNonNull(updateType);
		return this;
	}

	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public Statement47 setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = Objects.requireNonNull(activityIndicator);
		return this;
	}

	public Optional<DateOrDateTimePeriodChoice> getNotificationDeadlinePeriod() {
		return notificationDeadlinePeriod == null ? Optional.empty() : Optional.of(notificationDeadlinePeriod);
	}

	public Statement47 setNotificationDeadlinePeriod(DateOrDateTimePeriodChoice notificationDeadlinePeriod) {
		this.notificationDeadlinePeriod = notificationDeadlinePeriod;
		return this;
	}
}