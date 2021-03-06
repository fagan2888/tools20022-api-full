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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification19;
import com.tools20022.repository.msg.NameAndAddress5;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of identification of a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#mmAnyBIC
 * PartyIdentification46Choice.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#mmProprietaryIdentification
 * PartyIdentification46Choice.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#mmNameAndAddress
 * PartyIdentification46Choice.mmNameAndAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmIssuerAgent
 * CorporateActionCancellationAdviceV02.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmPayingAgent
 * CorporateActionCancellationAdviceV02.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmSubPayingAgent
 * CorporateActionCancellationAdviceV02.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmRegistrar
 * CorporateActionCancellationAdviceV02.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmResellingAgent
 * CorporateActionCancellationAdviceV02.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV02.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmDropAgent
 * CorporateActionCancellationAdviceV02.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmSolicitationAgent
 * CorporateActionCancellationAdviceV02.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV02#mmInformationAgent
 * CorporateActionCancellationAdviceV02.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmIssuerAgent
 * CorporateActionCancellationAdviceV03.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmPayingAgent
 * CorporateActionCancellationAdviceV03.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmSubPayingAgent
 * CorporateActionCancellationAdviceV03.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmRegistrar
 * CorporateActionCancellationAdviceV03.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmResellingAgent
 * CorporateActionCancellationAdviceV03.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV03.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmDropAgent
 * CorporateActionCancellationAdviceV03.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmSolicitationAgent
 * CorporateActionCancellationAdviceV03.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV03#mmInformationAgent
 * CorporateActionCancellationAdviceV03.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmIssuerAgent
 * CorporateActionCancellationAdviceV04.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmPayingAgent
 * CorporateActionCancellationAdviceV04.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmSubPayingAgent
 * CorporateActionCancellationAdviceV04.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmRegistrar
 * CorporateActionCancellationAdviceV04.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmResellingAgent
 * CorporateActionCancellationAdviceV04.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV04.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmDropAgent
 * CorporateActionCancellationAdviceV04.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmSolicitationAgent
 * CorporateActionCancellationAdviceV04.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV04#mmInformationAgent
 * CorporateActionCancellationAdviceV04.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#mmIssuerAgent
 * CorporateActionMovementConfirmationV02.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#mmPayingAgent
 * CorporateActionMovementConfirmationV02.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02#mmSubPayingAgent
 * CorporateActionMovementConfirmationV02.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#mmIssuerAgent
 * CorporateActionMovementConfirmationV03.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#mmPayingAgent
 * CorporateActionMovementConfirmationV03.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03#mmSubPayingAgent
 * CorporateActionMovementConfirmationV03.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmIssuerAgent
 * CorporateActionMovementConfirmationV04.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmPayingAgent
 * CorporateActionMovementConfirmationV04.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04#mmSubPayingAgent
 * CorporateActionMovementConfirmationV04.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV02.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV02.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV02.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV02.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV02.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV02.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV02.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV02.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV02.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV03.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV03.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV03.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV03.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV03.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV03.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV03.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV03.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV03.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV04.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV04.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV04.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV04.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV04.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV04.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV04.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV04.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV04.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#mmIssuerAgent
 * CorporateActionMovementReversalAdviceV02.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#mmPayingAgent
 * CorporateActionMovementReversalAdviceV02.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02#mmSubPayingAgent
 * CorporateActionMovementReversalAdviceV02.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#mmIssuerAgent
 * CorporateActionMovementReversalAdviceV03.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#mmPayingAgent
 * CorporateActionMovementReversalAdviceV03.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03#mmSubPayingAgent
 * CorporateActionMovementReversalAdviceV03.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#mmIssuerAgent
 * CorporateActionMovementReversalAdviceV04.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#mmPayingAgent
 * CorporateActionMovementReversalAdviceV04.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04#mmSubPayingAgent
 * CorporateActionMovementReversalAdviceV04.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV05#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.
 * mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmIssuerAgent
 * CorporateActionCancellationAdviceV05.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmPayingAgent
 * CorporateActionCancellationAdviceV05.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmSubPayingAgent
 * CorporateActionCancellationAdviceV05.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmRegistrar
 * CorporateActionCancellationAdviceV05.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmResellingAgent
 * CorporateActionCancellationAdviceV05.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmPhysicalSecuritiesAgent
 * CorporateActionCancellationAdviceV05.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmDropAgent
 * CorporateActionCancellationAdviceV05.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmSolicitationAgent
 * CorporateActionCancellationAdviceV05.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV05#mmInformationAgent
 * CorporateActionCancellationAdviceV05.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#mmIssuerAgent
 * CorporateActionMovementConfirmationV05.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#mmPayingAgent
 * CorporateActionMovementConfirmationV05.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05#mmSubPayingAgent
 * CorporateActionMovementConfirmationV05.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV05.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV05.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV05.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV05.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV05.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV05.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV05.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV05.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV05#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV05.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#mmIssuerAgent
 * CorporateActionMovementReversalAdviceV05.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#mmPayingAgent
 * CorporateActionMovementReversalAdviceV05.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05#mmSubPayingAgent
 * CorporateActionMovementReversalAdviceV05.mmSubPayingAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification46Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of identification of a party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistencePartyProprietaryIdentificationRule#forPartyIdentification46Choice
 * ConstraintCoexistencePartyProprietaryIdentificationRule.
 * forPartyIdentification46Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceNameAndAdressRule#forPartyIdentification46Choice
 * ConstraintCoexistenceNameAndAdressRule.forPartyIdentification46Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification46Choice", propOrder = {"anyBIC", "proprietaryIdentification", "nameAndAddress"})
public class PartyIdentification46Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AnyBIC", required = true)
	protected AnyBICIdentifier anyBIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification46Choice, AnyBICIdentifier> mmAnyBIC = new MMMessageAttribute<PartyIdentification46Choice, AnyBICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification46Choice.mmObject();
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(PartyIdentification46Choice obj) {
			return obj.getAnyBIC();
		}

		@Override
		public void setValue(PartyIdentification46Choice obj, AnyBICIdentifier value) {
			obj.setAnyBIC(value);
		}
	};
	@XmlElement(name = "PrtryId", required = true)
	protected GenericIdentification19 proprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19
	 * GenericIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95R:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification46Choice, GenericIdentification19> mmProprietaryIdentification = new MMMessageAssociationEnd<PartyIdentification46Choice, GenericIdentification19>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification46Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95R:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification19.mmObject();
		}

		@Override
		public GenericIdentification19 getValue(PartyIdentification46Choice obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(PartyIdentification46Choice obj, GenericIdentification19 value) {
			obj.setProprietaryIdentification(value);
		}
	};
	@XmlElement(name = "NmAndAdr", required = true)
	protected NameAndAddress5 nameAndAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
	 * PartyIdentification46Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address of a party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95Q:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification46Choice, NameAndAddress5> mmNameAndAddress = new MMMessageAssociationEnd<PartyIdentification46Choice, NameAndAddress5>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification46Choice.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95Q:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NameAndAddress5.mmObject();
		}

		@Override
		public NameAndAddress5 getValue(PartyIdentification46Choice obj) {
			return obj.getNameAndAddress();
		}

		@Override
		public void setValue(PartyIdentification46Choice obj, NameAndAddress5 value) {
			obj.setNameAndAddress(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification46Choice.mmAnyBIC, com.tools20022.repository.choice.PartyIdentification46Choice.mmProprietaryIdentification,
						com.tools20022.repository.choice.PartyIdentification46Choice.mmNameAndAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionCancellationAdviceV02.mmIssuerAgent, CorporateActionCancellationAdviceV02.mmPayingAgent, CorporateActionCancellationAdviceV02.mmSubPayingAgent,
						CorporateActionCancellationAdviceV02.mmRegistrar, CorporateActionCancellationAdviceV02.mmResellingAgent, CorporateActionCancellationAdviceV02.mmPhysicalSecuritiesAgent,
						CorporateActionCancellationAdviceV02.mmDropAgent, CorporateActionCancellationAdviceV02.mmSolicitationAgent, CorporateActionCancellationAdviceV02.mmInformationAgent,
						CorporateActionCancellationAdviceV03.mmIssuerAgent, CorporateActionCancellationAdviceV03.mmPayingAgent, CorporateActionCancellationAdviceV03.mmSubPayingAgent, CorporateActionCancellationAdviceV03.mmRegistrar,
						CorporateActionCancellationAdviceV03.mmResellingAgent, CorporateActionCancellationAdviceV03.mmPhysicalSecuritiesAgent, CorporateActionCancellationAdviceV03.mmDropAgent,
						CorporateActionCancellationAdviceV03.mmSolicitationAgent, CorporateActionCancellationAdviceV03.mmInformationAgent, CorporateActionCancellationAdviceV04.mmIssuerAgent,
						CorporateActionCancellationAdviceV04.mmPayingAgent, CorporateActionCancellationAdviceV04.mmSubPayingAgent, CorporateActionCancellationAdviceV04.mmRegistrar, CorporateActionCancellationAdviceV04.mmResellingAgent,
						CorporateActionCancellationAdviceV04.mmPhysicalSecuritiesAgent, CorporateActionCancellationAdviceV04.mmDropAgent, CorporateActionCancellationAdviceV04.mmSolicitationAgent,
						CorporateActionCancellationAdviceV04.mmInformationAgent, CorporateActionMovementConfirmationV02.mmIssuerAgent, CorporateActionMovementConfirmationV02.mmPayingAgent,
						CorporateActionMovementConfirmationV02.mmSubPayingAgent, CorporateActionMovementConfirmationV03.mmIssuerAgent, CorporateActionMovementConfirmationV03.mmPayingAgent,
						CorporateActionMovementConfirmationV03.mmSubPayingAgent, CorporateActionMovementConfirmationV04.mmIssuerAgent, CorporateActionMovementConfirmationV04.mmPayingAgent,
						CorporateActionMovementConfirmationV04.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceV02.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceV02.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceV02.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceV02.mmRegistrar, CorporateActionMovementPreliminaryAdviceV02.mmResellingAgent,
						CorporateActionMovementPreliminaryAdviceV02.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdviceV02.mmDropAgent, CorporateActionMovementPreliminaryAdviceV02.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceV02.mmInformationAgent, CorporateActionMovementPreliminaryAdviceV03.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceV03.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceV03.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceV03.mmRegistrar, CorporateActionMovementPreliminaryAdviceV03.mmResellingAgent,
						CorporateActionMovementPreliminaryAdviceV03.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdviceV03.mmDropAgent, CorporateActionMovementPreliminaryAdviceV03.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceV03.mmInformationAgent, CorporateActionMovementPreliminaryAdviceV04.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceV04.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceV04.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceV04.mmRegistrar, CorporateActionMovementPreliminaryAdviceV04.mmResellingAgent,
						CorporateActionMovementPreliminaryAdviceV04.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdviceV04.mmDropAgent, CorporateActionMovementPreliminaryAdviceV04.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceV04.mmInformationAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmIssuerAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmRegistrar, CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmResellingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmDropAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmSolicitationAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmInformationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmRegistrar,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmResellingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmDropAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmInformationAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmIssuerAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmRegistrar, CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmResellingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmDropAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmSolicitationAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmInformationAgent,
						CorporateActionMovementReversalAdviceV02.mmIssuerAgent, CorporateActionMovementReversalAdviceV02.mmPayingAgent, CorporateActionMovementReversalAdviceV02.mmSubPayingAgent,
						CorporateActionMovementReversalAdviceV03.mmIssuerAgent, CorporateActionMovementReversalAdviceV03.mmPayingAgent, CorporateActionMovementReversalAdviceV03.mmSubPayingAgent,
						CorporateActionMovementReversalAdviceV04.mmIssuerAgent, CorporateActionMovementReversalAdviceV04.mmPayingAgent, CorporateActionMovementReversalAdviceV04.mmSubPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmRegistrar,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmResellingAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmPhysicalSecuritiesAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmDropAgent, CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV05.mmInformationAgent, CorporateActionCancellationAdviceV05.mmIssuerAgent, CorporateActionCancellationAdviceV05.mmPayingAgent,
						CorporateActionCancellationAdviceV05.mmSubPayingAgent, CorporateActionCancellationAdviceV05.mmRegistrar, CorporateActionCancellationAdviceV05.mmResellingAgent,
						CorporateActionCancellationAdviceV05.mmPhysicalSecuritiesAgent, CorporateActionCancellationAdviceV05.mmDropAgent, CorporateActionCancellationAdviceV05.mmSolicitationAgent,
						CorporateActionCancellationAdviceV05.mmInformationAgent, CorporateActionMovementConfirmationV05.mmIssuerAgent, CorporateActionMovementConfirmationV05.mmPayingAgent,
						CorporateActionMovementConfirmationV05.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceV05.mmIssuerAgent, CorporateActionMovementPreliminaryAdviceV05.mmPayingAgent,
						CorporateActionMovementPreliminaryAdviceV05.mmSubPayingAgent, CorporateActionMovementPreliminaryAdviceV05.mmRegistrar, CorporateActionMovementPreliminaryAdviceV05.mmResellingAgent,
						CorporateActionMovementPreliminaryAdviceV05.mmPhysicalSecuritiesAgent, CorporateActionMovementPreliminaryAdviceV05.mmDropAgent, CorporateActionMovementPreliminaryAdviceV05.mmSolicitationAgent,
						CorporateActionMovementPreliminaryAdviceV05.mmInformationAgent, CorporateActionMovementReversalAdviceV05.mmIssuerAgent, CorporateActionMovementReversalAdviceV05.mmPayingAgent,
						CorporateActionMovementReversalAdviceV05.mmSubPayingAgent);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistencePartyProprietaryIdentificationRule.forPartyIdentification46Choice,
						com.tools20022.repository.constraints.ConstraintCoexistenceNameAndAdressRule.forPartyIdentification46Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartyIdentification46Choice";
				definition = "Choice of identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}

	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public PartyIdentification46Choice setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = Objects.requireNonNull(anyBIC);
		return this;
	}

	public GenericIdentification19 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public PartyIdentification46Choice setProprietaryIdentification(GenericIdentification19 proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}

	public NameAndAddress5 getNameAndAddress() {
		return nameAndAddress;
	}

	public PartyIdentification46Choice setNameAndAddress(NameAndAddress5 nameAndAddress) {
		this.nameAndAddress = Objects.requireNonNull(nameAndAddress);
		return this;
	}
}