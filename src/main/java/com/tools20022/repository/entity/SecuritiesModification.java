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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CorporateActionChangeTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Modification of the reference data of a security or of the organisation that
 * issued it.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesModification"
 * src="doc-files/SecuritiesModification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmChangeType
 * SecuritiesModification.mmChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
 * SecuritiesModification.mmNewOrganisationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmRelatedCorporateEvent
 * SecuritiesModification.mmRelatedCorporateEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewSecurityReferenceData
 * SecuritiesModification.mmNewSecurityReferenceData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNumberOfSharesIssued
 * SecuritiesModification.mmNumberOfSharesIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmLastTradingDate
 * SecuritiesModification.mmLastTradingDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmModification
 * Security.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmSecuritiesModification
 * Organisation.mmSecuritiesModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesModification
 * CorporateActionEvent.mmSecuritiesModification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat2Choice
 * CorporateActionChangeTypeFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat4Choice
 * CorporateActionChangeTypeFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice
 * CorporateActionChangeTypeFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat3Choice
 * CorporateActionChangeTypeFormat3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeType1FormatChoice
 * CorporateActionChangeType1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat5Choice
 * CorporateActionChangeTypeFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat6Choice
 * CorporateActionChangeTypeFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat8Choice
 * CorporateActionChangeTypeFormat8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat7Choice
 * CorporateActionChangeTypeFormat7Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesModification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification of the reference data of a security or of the organisation that issued it."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesModification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionChangeTypeCode changeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
	 * CorporateActionChangeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat2Choice#mmCode
	 * CorporateActionChangeTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat2Choice#mmProprietary
	 * CorporateActionChangeTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption5#mmChangeType
	 * CorporateActionOption5.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat4Choice#mmCode
	 * CorporateActionChangeTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat4Choice#mmProprietary
	 * CorporateActionChangeTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption13#mmChangeType
	 * CorporateActionOption13.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption25#mmChangeType
	 * CorporateActionOption25.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption30#mmChangeType
	 * CorporateActionOption30.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption38#mmChangeType
	 * CorporateActionOption38.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption47#mmChangeType
	 * CorporateActionOption47.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption57#mmChangeType
	 * CorporateActionOption57.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption58#mmChangeType
	 * CorporateActionOption58.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice#mmCode
	 * CorporateActionChangeTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice#mmProprietary
	 * CorporateActionChangeTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmChangeType
	 * CorporateAction3.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat3Choice#mmCode
	 * CorporateActionChangeTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat3Choice#mmProprietary
	 * CorporateActionChangeTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmChangeType
	 * CorporateAction4.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmChangeType
	 * CorporateAction5.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmChangeType
	 * CorporateAction6.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmChangeType
	 * CorporateAction7.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmChangeType
	 * CorporateAction8.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmChangeType
	 * CorporateAction10.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmChangeType
	 * CorporateAction11.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeType1FormatChoice#mmCode
	 * CorporateActionChangeType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeType1FormatChoice#mmProprietary
	 * CorporateActionChangeType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmChangeType
	 * CorporateAction2.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption103#mmChangeType
	 * CorporateActionOption103.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmChangeType
	 * CorporateAction12.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption107#mmChangeType
	 * CorporateActionOption107.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmChangeType
	 * CorporateAction17.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption118#mmChangeType
	 * CorporateActionOption118.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmChangeType
	 * CorporateAction31.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat5Choice#mmCode
	 * CorporateActionChangeTypeFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat5Choice#mmProprietary
	 * CorporateActionChangeTypeFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat6Choice#mmCode
	 * CorporateActionChangeTypeFormat6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat6Choice#mmProprietary
	 * CorporateActionChangeTypeFormat6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption123#mmChangeType
	 * CorporateActionOption123.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmChangeType
	 * CorporateAction40.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat8Choice#mmCode
	 * CorporateActionChangeTypeFormat8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat8Choice#mmProprietary
	 * CorporateActionChangeTypeFormat8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat7Choice#mmCode
	 * CorporateActionChangeTypeFormat7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat7Choice#mmProprietary
	 * CorporateActionChangeTypeFormat7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption131#mmChangeType
	 * CorporateActionOption131.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption134#mmChangeType
	 * CorporateActionOption134.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmChangeType
	 * CorporateAction41.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption142#mmChangeType
	 * CorporateActionOption142.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption146#mmChangeType
	 * CorporateActionOption146.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmChangeType
	 * CorporateAction51.mmChangeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of changes affecting the security form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesModification, CorporateActionChangeTypeCode> mmChangeType = new MMBusinessAttribute<SecuritiesModification, CorporateActionChangeTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionChangeTypeFormat2Choice.mmCode, CorporateActionChangeTypeFormat2Choice.mmProprietary, CorporateActionOption5.mmChangeType, CorporateActionChangeTypeFormat4Choice.mmCode,
					CorporateActionChangeTypeFormat4Choice.mmProprietary, CorporateActionOption13.mmChangeType, CorporateActionOption25.mmChangeType, CorporateActionOption30.mmChangeType, CorporateActionOption38.mmChangeType,
					CorporateActionOption47.mmChangeType, CorporateActionOption57.mmChangeType, CorporateActionOption58.mmChangeType, CorporateActionChangeTypeFormat1Choice.mmCode, CorporateActionChangeTypeFormat1Choice.mmProprietary,
					CorporateAction3.mmChangeType, CorporateActionChangeTypeFormat3Choice.mmCode, CorporateActionChangeTypeFormat3Choice.mmProprietary, CorporateAction4.mmChangeType, CorporateAction5.mmChangeType,
					CorporateAction6.mmChangeType, CorporateAction7.mmChangeType, CorporateAction8.mmChangeType, CorporateAction10.mmChangeType, CorporateAction11.mmChangeType, CorporateActionChangeType1FormatChoice.mmCode,
					CorporateActionChangeType1FormatChoice.mmProprietary, CorporateAction2.mmChangeType, CorporateActionOption103.mmChangeType, CorporateAction12.mmChangeType, CorporateActionOption107.mmChangeType,
					CorporateAction17.mmChangeType, CorporateActionOption118.mmChangeType, CorporateAction31.mmChangeType, CorporateActionChangeTypeFormat5Choice.mmCode, CorporateActionChangeTypeFormat5Choice.mmProprietary,
					CorporateActionChangeTypeFormat6Choice.mmCode, CorporateActionChangeTypeFormat6Choice.mmProprietary, CorporateActionOption123.mmChangeType, CorporateAction40.mmChangeType, CorporateActionChangeTypeFormat8Choice.mmCode,
					CorporateActionChangeTypeFormat8Choice.mmProprietary, CorporateActionChangeTypeFormat7Choice.mmCode, CorporateActionChangeTypeFormat7Choice.mmProprietary, CorporateActionOption131.mmChangeType,
					CorporateActionOption134.mmChangeType, CorporateAction41.mmChangeType, CorporateActionOption142.mmChangeType, CorporateActionOption146.mmChangeType, CorporateAction51.mmChangeType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChangeType";
			definition = "Type of changes affecting the security form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionChangeTypeCode.mmObject();
		}

		@Override
		public CorporateActionChangeTypeCode getValue(SecuritiesModification obj) {
			return obj.getChangeType();
		}

		@Override
		public void setValue(SecuritiesModification obj, CorporateActionChangeTypeCode value) {
			obj.setChangeType(value);
		}
	};
	protected Organisation newOrganisationInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmSecuritiesModification
	 * Organisation.mmSecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmNewPlaceOfIncorporation
	 * CorporateAction3.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmNewPlaceOfIncorporation
	 * CorporateAction4.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmNewPlaceOfIncorporation
	 * CorporateAction5.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmNewPlaceOfIncorporation
	 * CorporateAction6.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmNewPlaceOfIncorporation
	 * CorporateAction7.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmNewPlaceOfIncorporation
	 * CorporateAction8.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmNewPlaceOfIncorporation
	 * CorporateAction10.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmNewPlaceOfIncorporation
	 * CorporateAction11.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmNewPlaceOfIncorporation
	 * CorporateAction2.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmNewPlaceOfIncorporation
	 * CorporateAction12.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmNewPlaceOfIncorporation
	 * CorporateAction17.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmNewPlaceOfIncorporation
	 * CorporateAction31.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmNewPlaceOfIncorporation
	 * CorporateAction40.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmNewPlaceOfIncorporation
	 * CorporateAction41.mmNewPlaceOfIncorporation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction51#mmNewPlaceOfIncorporation
	 * CorporateAction51.mmNewPlaceOfIncorporation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewOrganisationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New name of a company following a name change."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesModification, Organisation> mmNewOrganisationInformation = new MMBusinessAssociationEnd<SecuritiesModification, Organisation>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction3.mmNewPlaceOfIncorporation, CorporateAction4.mmNewPlaceOfIncorporation, CorporateAction5.mmNewPlaceOfIncorporation, CorporateAction6.mmNewPlaceOfIncorporation,
					CorporateAction7.mmNewPlaceOfIncorporation, CorporateAction8.mmNewPlaceOfIncorporation, CorporateAction10.mmNewPlaceOfIncorporation, CorporateAction11.mmNewPlaceOfIncorporation,
					CorporateAction2.mmNewPlaceOfIncorporation, CorporateAction12.mmNewPlaceOfIncorporation, CorporateAction17.mmNewPlaceOfIncorporation, CorporateAction31.mmNewPlaceOfIncorporation,
					CorporateAction40.mmNewPlaceOfIncorporation, CorporateAction41.mmNewPlaceOfIncorporation, CorporateAction51.mmNewPlaceOfIncorporation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewOrganisationInformation";
			definition = "New name of a company following a name change.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Organisation.mmSecuritiesModification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}

		@Override
		public Organisation getValue(SecuritiesModification obj) {
			return obj.getNewOrganisationInformation();
		}

		@Override
		public void setValue(SecuritiesModification obj, Organisation value) {
			obj.setNewOrganisationInformation(value);
		}
	};
	protected CorporateActionEvent relatedCorporateEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesModification
	 * CorporateActionEvent.mmSecuritiesModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters of the event related to the modification of the securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesModification, CorporateActionEvent> mmRelatedCorporateEvent = new MMBusinessAssociationEnd<SecuritiesModification, CorporateActionEvent>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Specifies the parameters of the event related to the modification of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionEvent.mmSecuritiesModification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public CorporateActionEvent getValue(SecuritiesModification obj) {
			return obj.getRelatedCorporateEvent();
		}

		@Override
		public void setValue(SecuritiesModification obj, CorporateActionEvent value) {
			obj.setRelatedCorporateEvent(value);
		}
	};
	protected Security newSecurityReferenceData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmModification
	 * Security.mmModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecurityReferenceData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the updated information of the new security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesModification, Optional<Security>> mmNewSecurityReferenceData = new MMBusinessAssociationEnd<SecuritiesModification, Optional<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewSecurityReferenceData";
			definition = "Specifies the updated information of the new security.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Security.mmModification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Optional<Security> getValue(SecuritiesModification obj) {
			return obj.getNewSecurityReferenceData();
		}

		@Override
		public void setValue(SecuritiesModification obj, Optional<Security> value) {
			obj.setNewSecurityReferenceData(value.orElse(null));
		}
	};
	protected Number numberOfSharesIssued;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfSharesIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The number of shares the issuer is creating as part of the event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesModification, Number> mmNumberOfSharesIssued = new MMBusinessAttribute<SecuritiesModification, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfSharesIssued";
			definition = "The number of shares the issuer is creating as part of the event";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(SecuritiesModification obj) {
			return obj.getNumberOfSharesIssued();
		}

		@Override
		public void setValue(SecuritiesModification obj, Number value) {
			obj.setNumberOfSharesIssued(value);
		}
	};
	protected ISODateTime lastTradingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification
	 * SecuritiesModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTradingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the securities to be reorganised will cease to be tradeable."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesModification, ISODateTime> mmLastTradingDate = new MMBusinessAttribute<SecuritiesModification, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesModification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LastTradingDate";
			definition = "Date/time at which the securities to be reorganised will cease to be tradeable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(SecuritiesModification obj) {
			return obj.getLastTradingDate();
		}

		@Override
		public void setValue(SecuritiesModification obj, ISODateTime value) {
			obj.setLastTradingDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesModification";
				definition = "Modification of the reference data of a security or of the organisation that issued it.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmModification, Organisation.mmSecuritiesModification, CorporateActionEvent.mmSecuritiesModification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesModification.mmChangeType, com.tools20022.repository.entity.SecuritiesModification.mmNewOrganisationInformation,
						com.tools20022.repository.entity.SecuritiesModification.mmRelatedCorporateEvent, com.tools20022.repository.entity.SecuritiesModification.mmNewSecurityReferenceData,
						com.tools20022.repository.entity.SecuritiesModification.mmNumberOfSharesIssued, com.tools20022.repository.entity.SecuritiesModification.mmLastTradingDate);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionChangeTypeFormat2Choice.mmObject(), CorporateActionChangeTypeFormat4Choice.mmObject(), CorporateActionChangeTypeFormat1Choice.mmObject(),
						CorporateActionChangeTypeFormat3Choice.mmObject(), CorporateActionChangeType1FormatChoice.mmObject(), CorporateActionChangeTypeFormat5Choice.mmObject(), CorporateActionChangeTypeFormat6Choice.mmObject(),
						CorporateActionChangeTypeFormat8Choice.mmObject(), CorporateActionChangeTypeFormat7Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesModification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionChangeTypeCode getChangeType() {
		return changeType;
	}

	public SecuritiesModification setChangeType(CorporateActionChangeTypeCode changeType) {
		this.changeType = Objects.requireNonNull(changeType);
		return this;
	}

	public Organisation getNewOrganisationInformation() {
		return newOrganisationInformation;
	}

	public SecuritiesModification setNewOrganisationInformation(Organisation newOrganisationInformation) {
		this.newOrganisationInformation = Objects.requireNonNull(newOrganisationInformation);
		return this;
	}

	public CorporateActionEvent getRelatedCorporateEvent() {
		return relatedCorporateEvent;
	}

	public SecuritiesModification setRelatedCorporateEvent(CorporateActionEvent relatedCorporateEvent) {
		this.relatedCorporateEvent = Objects.requireNonNull(relatedCorporateEvent);
		return this;
	}

	public Optional<Security> getNewSecurityReferenceData() {
		return newSecurityReferenceData == null ? Optional.empty() : Optional.of(newSecurityReferenceData);
	}

	public SecuritiesModification setNewSecurityReferenceData(Security newSecurityReferenceData) {
		this.newSecurityReferenceData = newSecurityReferenceData;
		return this;
	}

	public Number getNumberOfSharesIssued() {
		return numberOfSharesIssued;
	}

	public SecuritiesModification setNumberOfSharesIssued(Number numberOfSharesIssued) {
		this.numberOfSharesIssued = Objects.requireNonNull(numberOfSharesIssued);
		return this;
	}

	public ISODateTime getLastTradingDate() {
		return lastTradingDate;
	}

	public SecuritiesModification setLastTradingDate(ISODateTime lastTradingDate) {
		this.lastTradingDate = Objects.requireNonNull(lastTradingDate);
		return this;
	}
}