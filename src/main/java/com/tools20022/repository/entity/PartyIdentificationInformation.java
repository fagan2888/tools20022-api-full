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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.PartyTypeCode;
import com.tools20022.repository.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify a party
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PartyIdentificationInformation"
 * src="doc-files/PartyIdentificationInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
 * PartyIdentificationInformation.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
 * PartyIdentificationInformation.mmIdentifiedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTypeOfIdentification
 * PartyIdentificationInformation.mmTypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmDeclaration
 * PartyIdentificationInformation.mmDeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyType
 * PartyIdentificationInformation.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
 * PartyIdentificationInformation.mmPartyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmValidityPeriod
 * PartyIdentificationInformation.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedMarket
 * PartyIdentificationInformation.mmIdentifiedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
 * PartyIdentificationInformation.mmLEI}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
 * GenericIdentification.mmRelatedPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmIdentification
 * Party.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
 * PartyName.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
 * DateTimePeriod.mmRelatedIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmIdentification
 * Market.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice#mmNameAndAddress
 * PartyIdentification1Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice#mmNameAndAddress
 * PartyIdentification2Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#mmNameAndAddress
 * PartyIdentification5Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification8#mmIdentification
 * PartyIdentification8.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification32#mmIdentification
 * PartyIdentification32.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification43#mmIdentification
 * PartyIdentification43.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2#mmPartyIdentification
 * PartyIdentificationAndAccount2.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5#mmPartyIdentification
 * PartyIdentificationAndAccount5.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmPartyIdentification
 * PartyIdentificationAndAccount4.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification21#mmPartyIdentification
 * PartyIdentification21.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification12Choice#mmNameAndAddress
 * PartyIdentification12Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification36#mmIdentification
 * PartyIdentification36.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#mmNameAndAddress
 * PartyIdentification10Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount16#mmIdentification
 * PartyIdentificationAndAccount16.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice#mmNameAndAddress
 * PartyIdentification14Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification44Choice#mmNameAndAddress
 * PartyIdentification44Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification46#mmIdentification
 * PartyIdentification46.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification45Choice#mmNameAndAddress
 * PartyIdentification45Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount44#mmIdentification
 * PartyIdentificationAndAccount44.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice#mmNameAndAddress
 * PartyIdentification37Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification1#mmTypeOfIdentification
 * AlternatePartyIdentification1.mmTypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2#mmIdentificationType
 * AlternatePartyIdentification2.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount1#mmIdentification
 * PartyIdentificationAndAccount1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount1#mmAlternateIdentification
 * PartyIdentificationAndAccount1.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification29#mmPartyIdentification
 * PartyIdentification29.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification29#mmAlternateIdentification
 * PartyIdentification29.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification2#mmIdentification
 * PartyIdentification2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification2#mmAlternateIdentification
 * PartyIdentification2.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice#mmNameAndAddress
 * PartyIdentification43Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount42#mmIdentification
 * PartyIdentificationAndAccount42.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount42#mmAlternateIdentification
 * PartyIdentificationAndAccount42.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification48#mmIdentification
 * PartyIdentification48.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification48#mmAlternateIdentification
 * PartyIdentification48.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#mmIdentification
 * PartyIdentificationAndAccount11.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11#mmAlternateIdentification
 * PartyIdentificationAndAccount11.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification3Choice#mmNameAndAddress
 * PartyIdentification3Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#mmIdentification
 * PartyIdentificationAndAccount12.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12#mmAlternateIdentification
 * PartyIdentificationAndAccount12.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#mmIdentification
 * PartyIdentificationAndAccount20.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20#mmAlternateIdentification
 * PartyIdentificationAndAccount20.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification30Choice#mmNameAndAddress
 * PartyIdentification30Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#mmIdentification
 * PartyIdentificationAndAccount15.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15#mmAlternateIdentification
 * PartyIdentificationAndAccount15.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#mmIdentification
 * PartyIdentificationAndAccount39.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39#mmAlternateIdentification
 * PartyIdentificationAndAccount39.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification38Choice#mmNameAndAddress
 * PartyIdentification38Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#mmIdentification
 * PartyIdentificationAndAccount50.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50#mmAlternateIdentification
 * PartyIdentificationAndAccount50.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19#mmIdentification
 * PartyIdentificationAndAccount19.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19#mmAlternateIdentification
 * PartyIdentificationAndAccount19.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount21#mmIdentification
 * PartyIdentificationAndAccount21.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount21#mmAlternateIdentification
 * PartyIdentificationAndAccount21.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40#mmIdentification
 * PartyIdentificationAndAccount40.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40#mmAlternateIdentification
 * PartyIdentificationAndAccount40.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount41#mmIdentification
 * PartyIdentificationAndAccount41.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount41#mmAlternateIdentification
 * PartyIdentificationAndAccount41.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount43#mmIdentification
 * PartyIdentificationAndAccount43.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification58Choice#mmNameAndAddress
 * PartyIdentification58Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification53#mmIdentification
 * PartyIdentification53.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification62Choice#mmNameAndAddress
 * PartyIdentification62Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount68#mmIdentification
 * PartyIdentificationAndAccount68.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice#mmNameAndAddress
 * PartyIdentification60Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification65Choice#mmNameAndAddress
 * PartyIdentification65Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount75#mmIdentification
 * PartyIdentificationAndAccount75.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3#mmIdentificationType
 * AlternatePartyIdentification3.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount63#mmIdentification
 * PartyIdentificationAndAccount63.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount63#mmAlternateIdentification
 * PartyIdentificationAndAccount63.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification52#mmIdentification
 * PartyIdentification52.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification52#mmAlternateIdentification
 * PartyIdentification52.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#mmIdentification
 * PartyIdentificationAndAccount64.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64#mmAlternateIdentification
 * PartyIdentificationAndAccount64.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification61Choice#mmNameAndAddress
 * PartyIdentification61Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#mmIdentification
 * PartyIdentificationAndAccount60.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60#mmAlternateIdentification
 * PartyIdentificationAndAccount60.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount66#mmIdentification
 * PartyIdentificationAndAccount66.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount66#mmAlternateIdentification
 * PartyIdentificationAndAccount66.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification16Choice#mmNameAndAddress
 * PartyIdentification16Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#mmNameAndAddress
 * PartyIdentification46Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification56Choice#mmNameAndAddress
 * PartyIdentification56Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmAlternateIdentification
 * PartyIdentification33.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#mmAlternateIdentification
 * PartyIdentification34.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification48Choice#mmNameAndAddress
 * PartyIdentification48Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#mmAlternateIdentification
 * PartyIdentification50.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification52Choice#mmNameAndAddress
 * PartyIdentification52Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#mmAlternateIdentification
 * PartyIdentification51.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#mmAlternateIdentification
 * PartyIdentification56.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#mmAlternateIdentification
 * PartyIdentification57.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification35#mmIdentification
 * PartyIdentification35.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification35#mmAlternateIdentification
 * PartyIdentification35.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount14#mmIdentification
 * PartyIdentificationAndAccount14.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount14#mmAlternateIdentification
 * PartyIdentificationAndAccount14.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount17#mmIdentification
 * PartyIdentificationAndAccount17.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount17#mmAlternateIdentification
 * PartyIdentificationAndAccount17.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount18#mmIdentification
 * PartyIdentificationAndAccount18.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount18#mmAlternateIdentification
 * PartyIdentificationAndAccount18.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification17Choice#mmNameAndAddress
 * PartyIdentification17Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification37#mmIdentification
 * PartyIdentification37.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification37#mmAlternateIdentification
 * PartyIdentification37.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount22#mmIdentification
 * PartyIdentificationAndAccount22.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount22#mmAlternateIdentification
 * PartyIdentificationAndAccount22.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount23#mmIdentification
 * PartyIdentificationAndAccount23.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount23#mmAlternateIdentification
 * PartyIdentificationAndAccount23.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification31Choice#mmNameAndAddress
 * PartyIdentification31Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount24#mmIdentification
 * PartyIdentificationAndAccount24.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount24#mmAlternateIdentification
 * PartyIdentificationAndAccount24.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification39Choice#mmNameAndAddress
 * PartyIdentification39Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification47#mmIdentification
 * PartyIdentification47.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification47#mmAlternateIdentification
 * PartyIdentification47.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice#mmNameAndAddress
 * PartyIdentification40Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount51#mmIdentification
 * PartyIdentificationAndAccount51.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount51#mmAlternateIdentification
 * PartyIdentificationAndAccount51.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52#mmIdentification
 * PartyIdentificationAndAccount52.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52#mmAlternateIdentification
 * PartyIdentificationAndAccount52.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification42Choice#mmNameAndAddress
 * PartyIdentification42Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54#mmIdentification
 * PartyIdentificationAndAccount54.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54#mmAlternateIdentification
 * PartyIdentificationAndAccount54.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification53Choice#mmNameAndAddress
 * PartyIdentification53Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification49#mmIdentification
 * PartyIdentification49.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification49#mmAlternateIdentification
 * PartyIdentification49.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification54Choice#mmNameAndAddress
 * PartyIdentification54Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount56#mmIdentification
 * PartyIdentificationAndAccount56.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount56#mmAlternateIdentification
 * PartyIdentificationAndAccount56.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount57#mmIdentification
 * PartyIdentificationAndAccount57.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount57#mmAlternateIdentification
 * PartyIdentificationAndAccount57.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification55Choice#mmNameAndAddress
 * PartyIdentification55Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount58#mmIdentification
 * PartyIdentificationAndAccount58.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount58#mmAlternateIdentification
 * PartyIdentificationAndAccount58.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice#mmNameAndAddress
 * PartyIdentification47Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification57Choice#mmNameAndAddress
 * PartyIdentification57Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification49Choice#mmNameAndAddress
 * PartyIdentification49Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice#mmNameAndAddress
 * PartyIdentification59Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification15#mmIdentification
 * PartyIdentification15.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount26#mmIdentification
 * PartyIdentificationAndAccount26.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount26#mmAlternateIdentification
 * PartyIdentificationAndAccount26.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification4#mmIdentification
 * PartyIdentification4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification4#mmAlternateIdentification
 * PartyIdentification4.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#mmIdentification
 * PartyIdentificationAndAccount29.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29#mmAlternateIdentification
 * PartyIdentificationAndAccount29.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#mmIdentification
 * PartyIdentificationAndAccount27.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27#mmAlternateIdentification
 * PartyIdentificationAndAccount27.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28#mmIdentification
 * PartyIdentificationAndAccount28.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28#mmAlternateIdentification
 * PartyIdentificationAndAccount28.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount30#mmIdentification
 * PartyIdentificationAndAccount30.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount30#mmAlternateIdentification
 * PartyIdentificationAndAccount30.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount35#mmIdentification
 * PartyIdentificationAndAccount35.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount35#mmAlternateIdentification
 * PartyIdentificationAndAccount35.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#mmIdentification
 * PartyIdentificationAndAccount38.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38#mmAlternateIdentification
 * PartyIdentificationAndAccount38.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36#mmIdentification
 * PartyIdentificationAndAccount36.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36#mmAlternateIdentification
 * PartyIdentificationAndAccount36.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount37#mmIdentification
 * PartyIdentificationAndAccount37.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount37#mmAlternateIdentification
 * PartyIdentificationAndAccount37.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount49#mmIdentification
 * PartyIdentificationAndAccount49.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount49#mmAlternateIdentification
 * PartyIdentificationAndAccount49.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmIdentification
 * PartyIdentificationAndAccount59.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59#mmAlternateIdentification
 * PartyIdentificationAndAccount59.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61#mmIdentification
 * PartyIdentificationAndAccount61.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61#mmAlternateIdentification
 * PartyIdentificationAndAccount61.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount62#mmIdentification
 * PartyIdentificationAndAccount62.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount62#mmAlternateIdentification
 * PartyIdentificationAndAccount62.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount25#mmIdentification
 * PartyIdentificationAndAccount25.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65#mmIdentification
 * PartyIdentificationAndAccount65.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65#mmAlternateIdentification
 * PartyIdentificationAndAccount65.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification63Choice#mmNameAndAddress
 * PartyIdentification63Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount67#mmIdentification
 * PartyIdentificationAndAccount67.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount67#mmAlternateIdentification
 * PartyIdentificationAndAccount67.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification38#mmIdentification
 * PartyIdentification38.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice#mmNameAndAddress
 * PartyIdentification15Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#mmIdentification
 * PartyIdentificationAndAccount9.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#mmAlternateIdentification
 * PartyIdentificationAndAccount9.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice#mmNameAndAddress
 * PartyIdentification32Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5#mmIdentificationType
 * AlternatePartyIdentification5.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmIdentification
 * PartyIdentificationAndAccount79.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmAdditionalInformation
 * PartyIdentificationAndAccount79.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmAlternateIdentification
 * PartyIdentificationAndAccount79.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice#mmNameAndAddress
 * PartyIdentification70Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6#mmTypeOfIdentification
 * AlternatePartyIdentification6.mmTypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87#mmIdentification
 * PartyIdentificationAndAccount87.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87#mmAdditionalInformation
 * PartyIdentificationAndAccount87.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87#mmAlternateIdentification
 * PartyIdentificationAndAccount87.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmIdentification
 * PartyIdentificationAndAccount83.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmAdditionalInformation
 * PartyIdentificationAndAccount83.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmAlternateIdentification
 * PartyIdentificationAndAccount83.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#mmIdentification
 * PartyIdentificationAndAccount77.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#mmAlternateIdentification
 * PartyIdentificationAndAccount77.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#mmAdditionalInformation
 * PartyIdentificationAndAccount77.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#mmIdentification
 * PartyIdentificationAndAccount78.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#mmAlternateIdentification
 * PartyIdentificationAndAccount78.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#mmAdditionalInformation
 * PartyIdentificationAndAccount78.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification23#mmNameAndAddress
 * PartyIdentification23.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#mmNameAndAddress
 * PartyIdentification6Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount10#mmIdentification
 * PartyIdentificationAndAccount10.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount10#mmAlternateIdentification
 * PartyIdentificationAndAccount10.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8#mmIdentification
 * PartyIdentificationAndAccount8.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8#mmAlternateIdentification
 * PartyIdentificationAndAccount8.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification54#mmNameAndAddress
 * PartyIdentification54.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification68Choice#mmNameAndAddress
 * PartyIdentification68Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification55#mmIdentification
 * PartyIdentification55.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification55#mmAlternateIdentification
 * PartyIdentification55.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification55#mmAdditionalInformation
 * PartyIdentification55.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#mmIdentification
 * PartyIdentificationAndAccount34.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#mmAdditionalInformation
 * PartyIdentificationAndAccount34.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#mmAlternateIdentification
 * PartyIdentificationAndAccount34.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmIdentification
 * PartyIdentificationAndAccount80.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmAlternateIdentification
 * PartyIdentificationAndAccount80.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80#mmAdditionalInformation
 * PartyIdentificationAndAccount80.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification41#mmIdentification
 * PartyIdentification41.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification40#mmIdentification
 * PartyIdentification40.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyModification1#mmPartyIdentification
 * PartyModification1.mmPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty1#mmParty
 * ProprietaryParty1.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty2#mmParty
 * ProprietaryParty2.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty3#mmParty
 * ProprietaryParty3.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party7Choice#mmParty
 * Party7Choice.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice#mmParty
 * Party12Choice.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmIdentification
 * PartyIdentification42.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification7Choice#mmNameAndAddress
 * PartyIdentification7Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice#mmNameAndAddress
 * PartyIdentification8Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification19Choice#mmNameAndAddress
 * PartyIdentification19Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice#mmNameAndAddress
 * PartyIdentification73Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice#mmPartyIdentification
 * PartyIdentification73Choice.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification60#mmNameAndAddress
 * PartyIdentification60.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount3#mmPartyIdentification
 * PartyIdentificationAndAccount3.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification1#mmIdentification
 * PartyIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice#mmNameAndAddress
 * PartyIdentification9Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerInformation1#mmIdentification
 * IssuerInformation1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification39#mmIdentification
 * PartyIdentification39.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#mmIdentification
 * PartyIdentificationAndAccount53.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53#mmAlternateIdentification
 * PartyIdentificationAndAccount53.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#mmIdentification
 * PartyIdentificationAndAccount55.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55#mmAlternateIdentification
 * PartyIdentificationAndAccount55.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45#mmIdentification
 * PartyIdentificationAndAccount45.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45#mmAlternateIdentification
 * PartyIdentificationAndAccount45.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#mmIdentification
 * PartyIdentificationAndAccount48.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48#mmAlternateIdentification
 * PartyIdentificationAndAccount48.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46#mmIdentification
 * PartyIdentificationAndAccount46.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46#mmAlternateIdentification
 * PartyIdentificationAndAccount46.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount47#mmIdentification
 * PartyIdentificationAndAccount47.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount47#mmAlternateIdentification
 * PartyIdentificationAndAccount47.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount6#mmPartyIdentification
 * PartyIdentificationAndAccount6.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndContactInformation1#mmPartyIdentification
 * PartyIdentificationAndContactInformation1.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification45#mmIdentification
 * PartyIdentification45.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification29Choice#mmNameAndAddress
 * PartyIdentification29Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice#mmNameAndAddress
 * PartyIdentification33Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#mmIdentification
 * PartyIdentificationAndAccount69.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69#mmAlternateIdentification
 * PartyIdentificationAndAccount69.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#mmIdentification
 * PartyIdentificationAndAccount70.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70#mmAlternateIdentification
 * PartyIdentificationAndAccount70.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount71#mmIdentification
 * PartyIdentificationAndAccount71.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount71#mmAlternateIdentification
 * PartyIdentificationAndAccount71.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#mmIdentification
 * PartyIdentificationAndAccount72.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72#mmAlternateIdentification
 * PartyIdentificationAndAccount72.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73#mmIdentification
 * PartyIdentificationAndAccount73.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73#mmAlternateIdentification
 * PartyIdentificationAndAccount73.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74#mmIdentification
 * PartyIdentificationAndAccount74.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74#mmAlternateIdentification
 * PartyIdentificationAndAccount74.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification66Choice#mmNameAndAddress
 * PartyIdentification66Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount76#mmIdentification
 * PartyIdentificationAndAccount76.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification67Choice#mmNameAndAddress
 * PartyIdentification67Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4#mmIdentificationType
 * AlternatePartyIdentification4.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#mmIdentification
 * PartyIdentificationAndAccount31.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#mmAlternateIdentification
 * PartyIdentificationAndAccount31.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification34Choice#mmNameAndAddress
 * PartyIdentification34Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32#mmPartyIdentification
 * PartyIdentificationAndAccount32.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmIdentification
 * PartyIdentification58.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification14#mmIdentification
 * PartyIdentification14.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification11#mmIdentification
 * PartyIdentification11.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification17#mmIdentification
 * PartyIdentification17.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification19#mmIdentification
 * PartyIdentification19.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification30#mmIdentification
 * PartyIdentification30.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification18#mmIdentification
 * PartyIdentification18.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification20#mmIdentification
 * PartyIdentification20.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification31#mmIdentification
 * PartyIdentification31.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification16#mmIdentification
 * PartyIdentification16.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification26Choice#mmNameAndAddress
 * PartyIdentification26Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount13#mmPartyIdentification
 * PartyIdentificationAndAccount13.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount7#mmPartyIdentification
 * PartyIdentificationAndAccount7.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#mmNameAndAddress
 * PartyIdentification71Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification25Choice#mmIdentification
 * PartyIdentification25Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification25Choice#mmNameAndAddress
 * PartyIdentification25Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95#mmPartyIdentification
 * PartyIdentificationAndAccount95.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97#mmPartyIdentification
 * PartyIdentificationAndAccount97.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification62#mmNameAndAddress
 * PartyIdentification62.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96#mmPartyIdentification
 * PartyIdentificationAndAccount96.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification63#mmPartyIdentification
 * PartyIdentification63.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification64#mmNameAndAddress
 * PartyIdentification64.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification75Choice#mmNameAndAddress
 * PartyIdentification75Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAccountServicer
 * SafekeepingAccount5.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification83Choice#mmNameAndAddress
 * PartyIdentification83Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#mmIdentification
 * PartyIdentificationAndAccount100.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#mmAlternateIdentification
 * PartyIdentificationAndAccount100.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#mmAdditionalInformation
 * PartyIdentificationAndAccount100.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount101#mmIdentification
 * PartyIdentificationAndAccount101.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount101#mmAlternateIdentification
 * PartyIdentificationAndAccount101.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerInformation2#mmIdentification
 * IssuerInformation2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification71#mmIdentification
 * PartyIdentification71.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102#mmPartyIdentification
 * PartyIdentificationAndAccount102.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification89Choice#mmNameAndAddress
 * PartyIdentification89Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification87Choice#mmNameAndAddress
 * PartyIdentification87Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification88Choice#mmNameAndAddress
 * PartyIdentification88Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount104#mmIdentification
 * PartyIdentificationAndAccount104.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount104#mmAlternateIdentification
 * PartyIdentificationAndAccount104.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#mmShortIdentification
 * QualifiedPartyIdentification1.mmShortIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmSendingInstitution
 * CardTransactionEnvironment5.mmSendingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmReceivingInstitution
 * CardTransactionEnvironment5.mmReceivingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmSettlementInstitution
 * CardTransactionEnvironment5.mmSettlementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#mmNameAndAddress
 * PartyIdentification90Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#mmIdentification
 * PartyIdentificationAndAccount106.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#mmAlternateIdentification
 * PartyIdentificationAndAccount106.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification75#mmIdentification
 * PartyIdentification75.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification75#mmAlternateIdentification
 * PartyIdentification75.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmIdentification
 * PartyIdentificationAndAccount112.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmAlternateIdentification
 * PartyIdentificationAndAccount112.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7#mmIdentificationType
 * AlternatePartyIdentification7.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmIdentification
 * PartyIdentificationAndAccount111.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmAlternateIdentification
 * PartyIdentificationAndAccount111.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117#mmIdentification
 * PartyIdentificationAndAccount117.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#mmIdentification
 * PartyIdentificationAndAccount107.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#mmAlternateIdentification
 * PartyIdentificationAndAccount107.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification76#mmIdentification
 * PartyIdentification76.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification77#mmIdentification
 * PartyIdentification77.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party28Choice#mmParty
 * Party28Choice.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#mmNameAndAddress
 * PartyIdentification93Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification91#mmIdentification
 * PartyIdentification91.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification93#mmAlternateIdentification
 * PartyIdentification93.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122#mmIdentification
 * PartyIdentificationAndAccount122.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122#mmAlternateIdentification
 * PartyIdentificationAndAccount122.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification92#mmIdentification
 * PartyIdentification92.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification92#mmAlternateIdentification
 * PartyIdentification92.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice#mmNameAndAddress
 * PartyIdentification94Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120#mmIdentification
 * PartyIdentificationAndAccount120.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120#mmAlternateIdentification
 * PartyIdentificationAndAccount120.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121#mmIdentification
 * PartyIdentificationAndAccount121.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121#mmAlternateIdentification
 * PartyIdentificationAndAccount121.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification94#mmIdentification
 * PartyIdentification94.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#mmNameAndAddress
 * PartyIdentification97Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification97#mmPartyIdentification
 * PartyIdentification97.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124#mmPartyIdentification
 * PartyIdentificationAndAccount124.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification95#mmIdentification
 * PartyIdentification95.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmPartyIdentification
 * PartyIdentificationAndAccount123.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmNameAndAddress
 * PartyIdentification96Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification96#mmIdentification
 * PartyIdentification96.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification99Choice#mmNameAndAddress
 * PartyIdentification99Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification98#mmIdentification
 * PartyIdentification98.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification100#mmIdentification
 * PartyIdentification100.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlaceOfClearingIdentification1#mmIdentification
 * PlaceOfClearingIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification1#mmMarketTypeAndIdentification
 * PlaceOfTradeIdentification1.mmMarketTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1#mmSafekeepingPlaceFormat
 * SafeKeepingPlace1.mmSafekeepingPlaceFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification99#mmIdentification
 * PartyIdentification99.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Pledgee1#mmPledgeeTypeAndIdentification
 * Pledgee1.mmPledgeeTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#mmNameAndAddress
 * PartyIdentification100Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#mmIdentification
 * PartyIdentificationAndAccount127.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#mmAlternateIdentification
 * PartyIdentificationAndAccount127.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#mmAdditionalInformation
 * PartyIdentificationAndAccount127.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice#mmNameAndAddress
 * PartyIdentification102Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126#mmPartyIdentification
 * PartyIdentificationAndAccount126.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice#mmNameAndAddress
 * PartyIdentification101Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8#mmIdentificationType
 * AlternatePartyIdentification8.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#mmNameAndAddress
 * PartyIdentification104Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification101#mmAlternateIdentification
 * PartyIdentification101.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification111Choice#mmNameAndAddress
 * PartyIdentification111Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification102#mmIdentification
 * PartyIdentification102.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification102#mmAlternateIdentification
 * PartyIdentification102.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount129#mmIdentification
 * PartyIdentificationAndAccount129.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount129#mmAlternateIdentification
 * PartyIdentificationAndAccount129.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount130#mmIdentification
 * PartyIdentificationAndAccount130.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount130#mmAlternateIdentification
 * PartyIdentificationAndAccount130.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification9#mmIdentificationType
 * AlternatePartyIdentification9.mmIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification113Choice#mmNameAndAddress
 * PartyIdentification113Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128#mmIdentification
 * PartyIdentificationAndAccount128.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128#mmAlternateIdentification
 * PartyIdentificationAndAccount128.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification108#mmIdentification
 * PartyIdentification108.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#mmIdentification
 * PartyIdentificationAndAccount133.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#mmAlternateIdentification
 * PartyIdentificationAndAccount133.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification103#mmIdentification
 * PartyIdentification103.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification103#mmAlternateIdentification
 * PartyIdentification103.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131#mmIdentification
 * PartyIdentificationAndAccount131.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131#mmAlternateIdentification
 * PartyIdentificationAndAccount131.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount146#mmIdentification
 * PartyIdentificationAndAccount146.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136#mmIdentification
 * PartyIdentificationAndAccount136.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136#mmAlternateIdentification
 * PartyIdentificationAndAccount136.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#mmIdentification
 * PartyIdentificationAndAccount134.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#mmAlternateIdentification
 * PartyIdentificationAndAccount134.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification109#mmIdentification
 * PartyIdentification109.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification111#mmIdentification
 * PartyIdentification111.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification110#mmIdentification
 * PartyIdentification110.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice#mmNameAndAddress
 * PartyIdentification115Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafeKeepingPlace2#mmSafekeepingPlaceFormat
 * SafeKeepingPlace2.mmSafekeepingPlaceFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification2#mmMarketTypeAndIdentification
 * PlaceOfTradeIdentification2.mmMarketTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Pledgee2#mmPledgeeTypeAndIdentification
 * Pledgee2.mmPledgeeTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification112#mmIdentification
 * PartyIdentification112.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification12#mmBICFI
 * FinancialInstitutionIdentification12.mmBICFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountServicer
 * SafekeepingAccount7.mmAccountServicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification113#mmParty
 * PartyIdentification113.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147#mmPartyIdentification
 * PartyIdentificationAndAccount147.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification119#mmIdentification
 * PartyIdentification119.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification120#mmIdentification
 * PartyIdentification120.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification120#mmAlternateIdentification
 * PartyIdentification120.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification121#mmIdentification
 * PartyIdentification121.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification121#mmProprietary
 * PartyIdentification121.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginAccount1#mmIdentification
 * MarginAccount1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginAccount1#mmPositionAccount
 * MarginAccount1.mmPositionAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification122#mmIdentification
 * PartyIdentification122.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification122#mmProprietary
 * PartyIdentification122.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157#mmPartyIdentification
 * PartyIdentificationAndAccount157.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification123#mmPartyIdentification
 * PartyIdentification123.mmPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification124#mmParty
 * PartyIdentification124.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmPartyIdentification
 * PartyIdentificationAndAccount158.mmPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty4#mmParty
 * ProprietaryParty4.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification125#mmIdentification
 * PartyIdentification125.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount159#mmIdentification
 * PartyIdentificationAndAccount159.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount159#mmAlternateIdentification
 * PartyIdentificationAndAccount159.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification127#mmIdentification
 * PartyIdentification127.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification127#mmAlternateIdentification
 * PartyIdentification127.mmAlternateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party35Choice#mmParty
 * Party35Choice.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification128#mmIdentification
 * PartyIdentification128.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification128#mmAlternateIdentification
 * PartyIdentification128.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount160#mmIdentification
 * PartyIdentificationAndAccount160.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount160#mmAlternateIdentification
 * PartyIdentificationAndAccount160.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification129#mmIdentification
 * PartyIdentification129.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress2
 * NameAndAddress2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification1Choice
 * PartyIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress5
 * NameAndAddress5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
 * PartyIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification4Choice
 * PartyIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress1
 * NameAndAddress1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress4
 * NameAndAddress4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification5Choice
 * PartyIdentification5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party2Choice Party2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification8
 * PartyIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party6Choice Party6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification32
 * PartyIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party11Choice Party11Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification43
 * PartyIdentification43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification
 * PartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress7
 * NameAndAddress7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount2
 * PartyIdentificationAndAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5
 * PartyIdentificationAndAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4
 * PartyIdentificationAndAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification21
 * PartyIdentification21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification13Choice
 * PartyIdentification13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
 * PartyIdentification36Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification51Choice
 * PartyIdentification51Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification12Choice
 * PartyIdentification12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification36
 * PartyIdentification36}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
 * PartyIdentification10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount16
 * PartyIdentificationAndAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification14Choice
 * PartyIdentification14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification44Choice
 * PartyIdentification44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification46
 * PartyIdentification46}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification45Choice
 * PartyIdentification45Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount44
 * PartyIdentificationAndAccount44}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification37Choice
 * PartyIdentification37Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType2Choice
 * IdentificationType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification1
 * AlternatePartyIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType4Choice
 * IdentificationType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2
 * AlternatePartyIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation1
 * PartyTextInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount1
 * PartyIdentificationAndAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification29
 * PartyIdentification29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification2
 * PartyIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification43Choice
 * PartyIdentification43Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount42
 * PartyIdentificationAndAccount42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification48
 * PartyIdentification48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount11
 * PartyIdentificationAndAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification3Choice
 * PartyIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount12
 * PartyIdentificationAndAccount12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation2
 * PartyTextInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount20
 * PartyIdentificationAndAccount20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification30Choice
 * PartyIdentification30Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount15
 * PartyIdentificationAndAccount15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount39
 * PartyIdentificationAndAccount39}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification38Choice
 * PartyIdentification38Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount50
 * PartyIdentificationAndAccount50}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19
 * PartyIdentificationAndAccount19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount21
 * PartyIdentificationAndAccount21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40
 * PartyIdentificationAndAccount40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount41
 * PartyIdentificationAndAccount41}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount43
 * PartyIdentificationAndAccount43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress12
 * NameAndAddress12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification58Choice
 * PartyIdentification58Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification53
 * PartyIdentification53}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification62Choice
 * PartyIdentification62Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount68
 * PartyIdentificationAndAccount68}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification60Choice
 * PartyIdentification60Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification65Choice
 * PartyIdentification65Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount75
 * PartyIdentificationAndAccount75}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType5Choice
 * IdentificationType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3
 * AlternatePartyIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation3
 * PartyTextInformation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount63
 * PartyIdentificationAndAccount63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification52
 * PartyIdentification52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation4
 * PartyTextInformation4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount64
 * PartyIdentificationAndAccount64}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification61Choice
 * PartyIdentification61Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount60
 * PartyIdentificationAndAccount60}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount66
 * PartyIdentificationAndAccount66}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification18Choice
 * PartyIdentification18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification16Choice
 * PartyIdentification16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification46Choice
 * PartyIdentification46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification56Choice
 * PartyIdentification56Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification33
 * PartyIdentification33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification34
 * PartyIdentification34}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification48Choice
 * PartyIdentification48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification50
 * PartyIdentification50}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification52Choice
 * PartyIdentification52Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification51
 * PartyIdentification51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification56
 * PartyIdentification56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification57
 * PartyIdentification57}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification41Choice
 * PartyIdentification41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification50Choice
 * PartyIdentification50Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification35
 * PartyIdentification35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount14
 * PartyIdentificationAndAccount14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount17
 * PartyIdentificationAndAccount17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount18
 * PartyIdentificationAndAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification17Choice
 * PartyIdentification17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification37
 * PartyIdentification37}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount22
 * PartyIdentificationAndAccount22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount23
 * PartyIdentificationAndAccount23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification31Choice
 * PartyIdentification31Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount24
 * PartyIdentificationAndAccount24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification39Choice
 * PartyIdentification39Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification47
 * PartyIdentification47}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
 * PartyIdentification40Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount51
 * PartyIdentificationAndAccount51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount52
 * PartyIdentificationAndAccount52}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification42Choice
 * PartyIdentification42Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount54
 * PartyIdentificationAndAccount54}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification53Choice
 * PartyIdentification53Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification49
 * PartyIdentification49}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification54Choice
 * PartyIdentification54Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount56
 * PartyIdentificationAndAccount56}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount57
 * PartyIdentificationAndAccount57}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification55Choice
 * PartyIdentification55Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount58
 * PartyIdentificationAndAccount58}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
 * PartyIdentification47Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification57Choice
 * PartyIdentification57Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationSD3
 * PartyIdentificationSD3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification3
 * PartyIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification49Choice
 * PartyIdentification49Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification59Choice
 * PartyIdentification59Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification15
 * PartyIdentification15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount26
 * PartyIdentificationAndAccount26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification4
 * PartyIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount29
 * PartyIdentificationAndAccount29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount27
 * PartyIdentificationAndAccount27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28
 * PartyIdentificationAndAccount28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount30
 * PartyIdentificationAndAccount30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount35
 * PartyIdentificationAndAccount35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount38
 * PartyIdentificationAndAccount38}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36
 * PartyIdentificationAndAccount36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount37
 * PartyIdentificationAndAccount37}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount49
 * PartyIdentificationAndAccount49}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount59
 * PartyIdentificationAndAccount59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61
 * PartyIdentificationAndAccount61}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount62
 * PartyIdentificationAndAccount62}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification64Choice
 * PartyIdentification64Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount25
 * PartyIdentificationAndAccount25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65
 * PartyIdentificationAndAccount65}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification63Choice
 * PartyIdentification63Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount67
 * PartyIdentificationAndAccount67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification38
 * PartyIdentification38}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification15Choice
 * PartyIdentification15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9
 * PartyIdentificationAndAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress13
 * NameAndAddress13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification32Choice
 * PartyIdentification32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType40Choice
 * IdentificationType40Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5
 * AlternatePartyIdentification5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79
 * PartyIdentificationAndAccount79}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
 * PartyIdentification70Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType41Choice
 * IdentificationType41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification6
 * AlternatePartyIdentification6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount87
 * PartyIdentificationAndAccount87}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83
 * PartyIdentificationAndAccount83}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77
 * PartyIdentificationAndAccount77}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78
 * PartyIdentificationAndAccount78}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification23Choice
 * PartyIdentification23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
 * PartyIdentification35Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyTextInformation5
 * PartyTextInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification23
 * PartyIdentification23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole1Choice
 * PartyRole1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification6Choice
 * PartyIdentification6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount10
 * PartyIdentificationAndAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8
 * PartyIdentificationAndAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification54
 * PartyIdentification54}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification68Choice
 * PartyIdentification68Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification55
 * PartyIdentification55}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34
 * PartyIdentificationAndAccount34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount80
 * PartyIdentificationAndAccount80}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party8Choice Party8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification41
 * PartyIdentification41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification40
 * PartyIdentification40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyModification1
 * PartyModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty1
 * ProprietaryParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress3
 * NameAndAddress3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty2
 * ProprietaryParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress10
 * NameAndAddress10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty3
 * ProprietaryParty3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party7Choice Party7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice Party12Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Party10Choice Party10Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification42
 * PartyIdentification42}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party9Choice Party9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyType1Choice
 * PartyType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification7Choice
 * PartyIdentification7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress8
 * NameAndAddress8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification22
 * PartyIdentification22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification8Choice
 * PartyIdentification8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification44
 * PartyIdentification44}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification19Choice
 * PartyIdentification19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification59
 * PartyIdentification59}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
 * PartyIdentification73Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification60
 * PartyIdentification60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount3
 * PartyIdentificationAndAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party1Choice Party1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification1
 * PartyIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
 * PartyIdentification9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IssuerInformation1
 * IssuerInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification39
 * PartyIdentification39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress9
 * NameAndAddress9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification24Choice
 * PartyIdentification24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification11Choice
 * PartyIdentification11Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount53
 * PartyIdentificationAndAccount53}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount55
 * PartyIdentificationAndAccount55}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45
 * PartyIdentificationAndAccount45}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount48
 * PartyIdentificationAndAccount48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46
 * PartyIdentificationAndAccount46}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount47
 * PartyIdentificationAndAccount47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification25
 * PartyIdentification25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount6
 * PartyIdentificationAndAccount6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndContactInformation1
 * PartyIdentificationAndContactInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification45
 * PartyIdentification45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification9
 * PartyIdentification9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress6
 * NameAndAddress6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification26
 * PartyIdentification26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification27
 * PartyIdentification27}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification29Choice
 * PartyIdentification29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification28
 * PartyIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification33Choice
 * PartyIdentification33Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount69
 * PartyIdentificationAndAccount69}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount70
 * PartyIdentificationAndAccount70}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount71
 * PartyIdentificationAndAccount71}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount72
 * PartyIdentificationAndAccount72}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73
 * PartyIdentificationAndAccount73}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74
 * PartyIdentificationAndAccount74}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification66Choice
 * PartyIdentification66Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount76
 * PartyIdentificationAndAccount76}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification67Choice
 * PartyIdentification67Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType6Choice
 * IdentificationType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification4
 * AlternatePartyIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
 * PartyIdentificationAndAccount31}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification34Choice
 * PartyIdentification34Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount32
 * PartyIdentificationAndAccount32}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party13Choice Party13Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification58
 * PartyIdentification58}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyOrganisation1Choice
 * PartyOrganisation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification14
 * PartyIdentification14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyPrivate1 PartyPrivate1}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification11
 * PartyIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification17
 * PartyIdentification17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification12
 * PartyIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party5Choice Party5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification19
 * PartyIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification30
 * PartyIdentification30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification18
 * PartyIdentification18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification20
 * PartyIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification31
 * PartyIdentification31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification13
 * PartyIdentification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification16
 * PartyIdentification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress11
 * NameAndAddress11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification26Choice
 * PartyIdentification26Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount13
 * PartyIdentificationAndAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification5
 * PartyIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount7
 * PartyIdentificationAndAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification24
 * PartyIdentification24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
 * PartyIdentification72Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
 * PartyIdentification71Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TechnicalIdentification1Choice
 * TechnicalIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification25Choice
 * PartyIdentification25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole2Choice
 * PartyRole2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95
 * PartyIdentificationAndAccount95}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount97
 * PartyIdentificationAndAccount97}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification62
 * PartyIdentification62}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount96
 * PartyIdentificationAndAccount96}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification63
 * PartyIdentification63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification64
 * PartyIdentification64}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification75Choice
 * PartyIdentification75Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification83Choice
 * PartyIdentification83Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100
 * PartyIdentificationAndAccount100}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount101
 * PartyIdentificationAndAccount101}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole4Choice
 * PartyRole4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IssuerInformation2
 * IssuerInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification71
 * PartyIdentification71}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount102
 * PartyIdentificationAndAccount102}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification89Choice
 * PartyIdentification89Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification87Choice
 * PartyIdentification87Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification88Choice
 * PartyIdentification88Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount104
 * PartyIdentificationAndAccount104}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
 * QualifiedPartyIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification1Choice
 * CounterpartyIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5
 * CardTransactionEnvironment5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification90Choice
 * PartyIdentification90Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification92Choice
 * PartyIdentification92Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106
 * PartyIdentificationAndAccount106}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification75
 * PartyIdentification75}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
 * PartyIdentificationAndAccount112}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7
 * AlternatePartyIdentification7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111
 * PartyIdentificationAndAccount111}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117
 * PartyIdentificationAndAccount117}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107
 * PartyIdentificationAndAccount107}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType42Choice
 * IdentificationType42Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification76
 * PartyIdentification76}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice
 * PersonOrOrganisation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice
 * PersonOrOrganisation2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification77
 * PartyIdentification77}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party28Choice Party28Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification93Choice
 * PartyIdentification93Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification91
 * PartyIdentification91}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification93
 * PartyIdentification93}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122
 * PartyIdentificationAndAccount122}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification92
 * PartyIdentification92}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification94Choice
 * PartyIdentification94Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount120
 * PartyIdentificationAndAccount120}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount121
 * PartyIdentificationAndAccount121}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party29Choice Party29Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification94
 * PartyIdentification94}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification97Choice
 * PartyIdentification97Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification97
 * PartyIdentification97}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount124
 * PartyIdentificationAndAccount124}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyRole5Choice
 * PartyRole5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification95
 * PartyIdentification95}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
 * PartyIdentificationAndAccount123}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification96Choice
 * PartyIdentification96Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification96
 * PartyIdentification96}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification99Choice
 * PartyIdentification99Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress15
 * NameAndAddress15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification98
 * PartyIdentification98}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification100
 * PartyIdentification100}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlaceOfClearingIdentification1
 * PlaceOfClearingIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification1
 * PlaceOfTradeIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
 * SafeKeepingPlace1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification99
 * PartyIdentification99}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Pledgee1 Pledgee1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
 * PartyIdentification100Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127
 * PartyIdentificationAndAccount127}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice
 * PartyIdentification102Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126
 * PartyIdentificationAndAccount126}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice
 * PartyIdentification101Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification8
 * AlternatePartyIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType43Choice
 * IdentificationType43Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice
 * PartyIdentification104Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification101
 * PartyIdentification101}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification111Choice
 * PartyIdentification111Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification102
 * PartyIdentification102}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationType44Choice
 * IdentificationType44Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount129
 * PartyIdentificationAndAccount129}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount130
 * PartyIdentificationAndAccount130}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AlternatePartyIdentification9
 * AlternatePartyIdentification9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification103Choice
 * PartyIdentification103Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification113Choice
 * PartyIdentification113Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128
 * PartyIdentificationAndAccount128}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification108
 * PartyIdentification108}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133
 * PartyIdentificationAndAccount133}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification103
 * PartyIdentification103}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131
 * PartyIdentificationAndAccount131}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount146
 * PartyIdentificationAndAccount146}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136
 * PartyIdentificationAndAccount136}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134
 * PartyIdentificationAndAccount134}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification109
 * PartyIdentification109}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification111
 * PartyIdentification111}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification110
 * PartyIdentification110}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice
 * PartyIdentification115Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafeKeepingPlace2
 * SafeKeepingPlace2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification114Choice
 * PartyIdentification114Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PlaceOfTradeIdentification2
 * PlaceOfTradeIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Pledgee2 Pledgee2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification95Choice
 * PartyIdentification95Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification2Choice
 * CounterpartyIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification112
 * PartyIdentification112}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification12
 * FinancialInstitutionIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification113
 * PartyIdentification113}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
 * PartyIdentificationAndAccount147}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification119
 * PartyIdentification119}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification120
 * PartyIdentification120}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
 * CounterpartyIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementAgent1
 * SettlementAgent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConcentrationAgent1
 * ConcentrationAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification118Choice
 * PartyIdentification118Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CoverTwoDefaulters1
 * CoverTwoDefaulters1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification121
 * PartyIdentification121}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClearingAccount1
 * ClearingAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginAccount1 MarginAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification122
 * PartyIdentification122}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157
 * PartyIdentificationAndAccount157}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification123
 * PartyIdentification123}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification124
 * PartyIdentification124}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification119Choice
 * PartyIdentification119Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158
 * PartyIdentificationAndAccount158}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryParty4
 * ProprietaryParty4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification125
 * PartyIdentification125}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party34Choice Party34Choice}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount159
 * PartyIdentificationAndAccount159}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification127
 * PartyIdentification127}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party35Choice Party35Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification128
 * PartyIdentification128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount160
 * PartyIdentificationAndAccount160}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party36Choice Party36Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification129
 * PartyIdentification129}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentificationInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a party"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=BusinessComment, BusinessComment="Information" to be
 * removed when PartyIdentification message component is removed.</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification otherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
	 * GenericIdentification.mmRelatedPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification1Choice#mmProprietaryIdentification
	 * PartyIdentification1Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice#mmProprietaryIdentification
	 * PartyIdentification2Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification4Choice#mmProprietaryIdentification
	 * PartyIdentification4Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson5#mmOtherIdentification
	 * IndividualPerson5.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson10#mmOtherIdentification
	 * IndividualPerson10.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification3Choice#mmProprietaryIdentification
	 * FinancialInstitutionIdentification3Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmOtherIdentification
	 * IndividualPerson20.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount26#mmAccountOwnerOtherIdentification
	 * CashAccount26.mmAccountOwnerOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice#mmIdentificationNumber
	 * IndividualPersonIdentificationChoice.mmIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#mmProprietaryIdentification
	 * PartyIdentification5Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson6#mmModifiedOtherIdentification
	 * IndividualPerson6.mmModifiedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson11#mmModifiedOtherIdentification
	 * IndividualPerson11.mmModifiedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice#mmOther
	 * MemberIdentification2Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#mmProprietaryIdentification
	 * OrganisationIdentification2.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmOtherIdentification
	 * PersonIdentification3.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification4#mmOther
	 * OrganisationIdentification4.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#mmOther
	 * PersonIdentification5.mmOther}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#mmOther
	 * ContactDetails2.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8#mmOther
	 * OrganisationIdentification8.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification3#mmProprietaryIdentification
	 * FinancialInstitutionIdentification3.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification5Choice#mmProprietaryIdentification
	 * FinancialInstitutionIdentification5Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification13Choice#mmProprietaryIdentification
	 * PartyIdentification13Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice#mmProprietaryIdentification
	 * PartyIdentification36Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7#mmOther
	 * OrganisationIdentification7.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification51Choice#mmProprietaryIdentification
	 * PartyIdentification51Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification9#mmOther
	 * OrganisationIdentification9.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice#mmProprietaryIdentification
	 * PartyIdentification10Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification14Choice#mmProprietaryIdentification
	 * PartyIdentification14Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification45Choice#mmProprietaryIdentification
	 * PartyIdentification45Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification37Choice#mmProprietaryIdentification
	 * PartyIdentification37Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#mmProprietary
	 * SafekeepingPlaceFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification43Choice#mmProprietaryIdentification
	 * PartyIdentification43Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification3Choice#mmProprietaryIdentification
	 * PartyIdentification3Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification30Choice#mmProprietaryIdentification
	 * PartyIdentification30Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification38Choice#mmProprietaryIdentification
	 * PartyIdentification38Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification62Choice#mmProprietaryIdentification
	 * PartyIdentification62Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification60Choice#mmProprietaryIdentification
	 * PartyIdentification60Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification65Choice#mmProprietaryIdentification
	 * PartyIdentification65Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice#mmProprietary
	 * SafekeepingPlaceFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification61Choice#mmProprietaryIdentification
	 * PartyIdentification61Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#mmProprietary
	 * SafekeepingPlaceFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification18Choice#mmProprietaryIdentification
	 * PartyIdentification18Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice#mmProprietary
	 * SafekeepingPlaceFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification16Choice#mmProprietaryIdentification
	 * PartyIdentification16Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification46Choice#mmProprietaryIdentification
	 * PartyIdentification46Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification56Choice#mmProprietaryIdentification
	 * PartyIdentification56Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification48Choice#mmProprietaryIdentification
	 * PartyIdentification48Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification52Choice#mmProprietaryIdentification
	 * PartyIdentification52Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification41Choice#mmProprietaryIdentification
	 * PartyIdentification41Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification50Choice#mmProprietaryIdentification
	 * PartyIdentification50Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification31Choice#mmProprietaryIdentification
	 * PartyIdentification31Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice#mmProprietaryIdentification
	 * PartyIdentification40Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification42Choice#mmProprietaryIdentification
	 * PartyIdentification42Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification54Choice#mmProprietaryIdentification
	 * PartyIdentification54Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification55Choice#mmProprietaryIdentification
	 * PartyIdentification55Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice#mmProprietaryIdentification
	 * PartyIdentification47Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification57Choice#mmProprietaryIdentification
	 * PartyIdentification57Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#mmIdentificationAsDSS
	 * SafekeepingPlaceFormatChoice.mmIdentificationAsDSS}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification49Choice#mmProprietaryIdentification
	 * PartyIdentification49Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification59Choice#mmProprietaryIdentification
	 * PartyIdentification59Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification64Choice#mmProprietaryIdentification
	 * PartyIdentification64Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification63Choice#mmProprietaryIdentification
	 * PartyIdentification63Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification15Choice#mmProprietaryIdentification
	 * PartyIdentification15Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice#mmProprietaryIdentification
	 * PartyIdentification32Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice#mmProprietaryIdentification
	 * PartyIdentification70Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification23Choice#mmProprietaryIdentification
	 * PartyIdentification23Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice#mmProprietaryIdentification
	 * PartyIdentification35Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification23#mmProprietaryIdentification
	 * PartyIdentification23.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification6Choice#mmProprietaryIdentification
	 * PartyIdentification6Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification54#mmProprietaryIdentification
	 * PartyIdentification54.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification6#mmOther
	 * OrganisationIdentification6.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification22#mmAlternativeIdentifier
	 * PartyIdentification22.mmAlternativeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification44#mmAlternativeIdentifier
	 * PartyIdentification44.mmAlternativeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmAcquirerIdentification
	 * AcquirerProtocolParameters1.mmAcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmAcquirerIdentification
	 * AcquirerProtocolParameters3.mmAcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment8#mmMerchantIdentification
	 * CardPaymentEnvironment8.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment17#mmMerchantIdentification
	 * CardPaymentEnvironment17.mmMerchantIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer1#mmIdentification
	 * Acquirer1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult1#mmAuthorisationEntity
	 * AuthorisationResult1.mmAuthorisationEntity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer2#mmIdentification
	 * Acquirer2.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer3#mmIdentification
	 * Acquirer3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation8#mmIdentification
	 * Organisation8.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation9#mmIdentification
	 * Organisation9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult2#mmAuthorisationEntity
	 * AuthorisationResult2.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult3#mmAuthorisationEntity
	 * AuthorisationResult3.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3#mmMerchantIdentification
	 * CardPaymentEnvironment3.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11#mmMerchantIdentification
	 * CardPaymentEnvironment11.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#mmMerchantIdentification
	 * CardPaymentEnvironment16.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment7#mmMerchantIdentification
	 * CardPaymentEnvironment7.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment15#mmMerchantIdentification
	 * CardPaymentEnvironment15.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19#mmMerchantIdentification
	 * CardPaymentEnvironment19.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson2#mmOtherIdentification
	 * IndividualPerson2.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson12#mmOtherIdentification
	 * IndividualPerson12.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson9#mmOtherIdentification
	 * IndividualPerson9.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmProprietaryIdentification
	 * NonFinancialInstitutionIdentification1.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmOtherIdentification
	 * PersonIdentification2.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification1#mmProprietaryIdentification
	 * FinancialInstitutionIdentification1.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice#mmProprietaryIdentification
	 * PartyIdentification9Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmOtherIdentification
	 * PersonIdentificationType1Choice.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmAdditionalIdentification
	 * BeneficialOwner1.mmAdditionalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification11Choice#mmProprietaryIdentification
	 * PartyIdentification11Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification25#mmProprietaryIdentification
	 * PartyIdentification25.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6#mmProprietaryIdentification
	 * FinancialInstitutionIdentification6.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26#mmProprietaryIdentification
	 * PartyIdentification26.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification27#mmProprietaryIdentification
	 * PartyIdentification27.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification28#mmProprietaryIdentification
	 * PartyIdentification28.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification33Choice#mmProprietaryIdentification
	 * PartyIdentification33Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification66Choice#mmProprietaryIdentification
	 * PartyIdentification66Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification67Choice#mmProprietaryIdentification
	 * PartyIdentification67Choice.mmProprietaryIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails3#mmOther
	 * ContactDetails3.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType1Choice#mmProprietary
	 * IdentificationType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson15#mmOtherIdentification
	 * IndividualPerson15.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification4#mmOtherIdentification
	 * PersonIdentification4.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification5#mmProprietaryIdentification
	 * FinancialInstitutionIdentification5.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification26Choice#mmProprietaryIdentification
	 * PartyIdentification26Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification6Choice#mmProprietaryIdentification
	 * FinancialInstitutionIdentification6Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification24#mmProprietaryIdentification
	 * PartyIdentification24.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice#mmProprietaryIdentification
	 * PartyIdentification72Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice#mmProprietaryIdentification
	 * PartyIdentification71Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#mmProprietary
	 * SafekeepingPlaceFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmModifiedOtherIdentification
	 * IndividualPerson21.mmModifiedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmOtherIdentification
	 * IndividualPerson22.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification62#mmProprietaryIdentification
	 * PartyIdentification62.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification64#mmProprietaryIdentification
	 * PartyIdentification64.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#mmMerchantIdentification
	 * CardPaymentEnvironment31.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment29#mmMerchantIdentification
	 * CardPaymentEnvironment29.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmAcquirerIdentification
	 * AcquirerProtocolParameters6.mmAcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment25#mmMerchantIdentification
	 * CardPaymentEnvironment25.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmOther
	 * PersonIdentification7.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment30#mmMerchantIdentification
	 * CardPaymentEnvironment30.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#mmMerchantIdentification
	 * CardPaymentEnvironment28.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21#mmMerchantIdentification
	 * CardPaymentEnvironment21.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmOtherIdentification
	 * IndividualPerson23.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmModifiedOtherIdentification
	 * IndividualPerson24.mmModifiedOtherIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OwnerType1#mmProprietary
	 * OwnerType1.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmAdditionalIdentification
	 * BeneficialOwner2.mmAdditionalIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice#mmProprietary
	 * PledgeeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification83Choice#mmProprietaryIdentification
	 * PartyIdentification83Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#mmProprietary
	 * SafekeepingPlaceFormat7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification89Choice#mmProprietaryIdentification
	 * PartyIdentification89Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification87Choice#mmProprietaryIdentification
	 * PartyIdentification87Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification88Choice#mmProprietaryIdentification
	 * PartyIdentification88Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat2Choice#mmProprietary
	 * PledgeeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#mmMerchantIdentification
	 * CardPaymentEnvironment37.mmMerchantIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer4#mmIdentification
	 * Acquirer4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment33#mmMerchantIdentification
	 * CardPaymentEnvironment33.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmAcquirerIdentification
	 * AcquirerProtocolParameters7.mmAcquirerIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer5#mmIdentification
	 * Acquirer5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#mmMerchantIdentification
	 * CardPaymentEnvironment43.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult4#mmAuthorisationEntity
	 * AuthorisationResult4.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment41#mmMerchantIdentification
	 * CardPaymentEnvironment41.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment42#mmMerchantIdentification
	 * CardPaymentEnvironment42.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult5#mmAuthorisationEntity
	 * AuthorisationResult5.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment44#mmMerchantIdentification
	 * CardPaymentEnvironment44.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult6#mmAuthorisationEntity
	 * AuthorisationResult6.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#mmMerchantIdentification
	 * CardPaymentEnvironment38.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#mmAuthorisationEntity
	 * AuthorisationResult8.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult7#mmAuthorisationEntity
	 * AuthorisationResult7.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification1Choice#mmOther
	 * CounterpartyIdentification1Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult9#mmAuthorisationEntity
	 * AuthorisationResult9.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#mmProprietaryIdentification
	 * PartyIdentification90Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification92Choice#mmProprietaryIdentification
	 * PartyIdentification92Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#mmProprietary
	 * SafekeepingPlaceFormat8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification10#mmOther
	 * PersonIdentification10.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmInternal
	 * PersonOrOrganisation1Choice.mmInternal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmProprietary
	 * SafekeepingPlaceFormat10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification93Choice#mmProprietaryIdentification
	 * PartyIdentification93Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#mmProprietary
	 * PledgeeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice#mmProprietaryIdentification
	 * PartyIdentification94Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#mmProprietaryIdentification
	 * PartyIdentification97Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification1Choice#mmIdentificationNumber
	 * IndividualPersonIdentification1Choice.mmIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmProprietaryIdentification
	 * FinancialInstitutionIdentification7Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation12.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation13.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmAccountOwnerOtherIdentification
	 * CashAccount33.mmAccountOwnerOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice#mmIdentificationNumber
	 * IndividualPersonIdentification2Choice.mmIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmProprietaryIdentification
	 * PartyIdentification96Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#mmProprietaryIdentification
	 * PartyIdentification100Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification101Choice#mmProprietaryIdentification
	 * PartyIdentification101Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification104Choice#mmProprietaryIdentification
	 * PartyIdentification104Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice#mmProprietary
	 * SafekeepingPlaceFormat11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification103Choice#mmProprietaryIdentification
	 * PartyIdentification103Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification113Choice#mmProprietaryIdentification
	 * PartyIdentification113Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice#mmProprietary
	 * SafekeepingPlaceFormat17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification115Choice#mmProprietaryIdentification
	 * PartyIdentification115Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification114Choice#mmProprietaryIdentification
	 * PartyIdentification114Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice#mmProprietary
	 * PledgeeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#mmProprietary
	 * SafekeepingPlaceFormat26Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification95Choice#mmProprietaryIdentification
	 * PartyIdentification95Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification2Choice#mmOther
	 * CounterpartyIdentification2Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment46#mmMerchantIdentification
	 * CardPaymentEnvironment46.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmMerchantIdentification
	 * CardPaymentEnvironment50.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#mmAuthorisationEntity
	 * AuthorisationResult12.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#mmAuthorisationEntity
	 * AuthorisationResult11.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmAuthorisationEntity
	 * AuthorisationResult10.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment56#mmMerchantIdentification
	 * CardPaymentEnvironment56.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#mmMerchantIdentification
	 * CardPaymentEnvironment55.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmAcquirerIdentification
	 * AcquirerProtocolParameters9.mmAcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmOther
	 * PersonIdentification11.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation25#mmIdentification
	 * Organisation25.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmAuthorisationEntity
	 * AuthorisationResult13.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification12#mmOther
	 * PersonIdentification12.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson32#mmOtherIdentification
	 * IndividualPerson32.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmProprietaryIdentification
	 * FinancialInstitutionIdentification8Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson31#mmOtherIdentification
	 * IndividualPerson31.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation15.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation14.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice#mmIdentificationNumber
	 * IndividualPersonIdentification3Choice.mmIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#mmProprietary
	 * SafekeepingPlaceFormat27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#mmSectorAndLocation
	 * CounterpartyIdentification3Choice.mmSectorAndLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#mmNameAndLocation
	 * CounterpartyIdentification3Choice.mmNameAndLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#mmMerchantIdentification
	 * CardPaymentEnvironment64.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65#mmMerchantIdentification
	 * CardPaymentEnvironment65.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmMerchantIdentification
	 * CardPaymentEnvironment67.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment63#mmMerchantIdentification
	 * CardPaymentEnvironment63.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmAcquirerIdentification
	 * AcquirerProtocolParameters10.mmAcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification119Choice#mmProprietaryIdentification
	 * PartyIdentification119Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification13#mmOther
	 * PersonIdentification13.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification9Choice#mmProprietaryIdentification
	 * FinancialInstitutionIdentification9Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71#mmMerchantIdentification
	 * CardPaymentEnvironment71.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment69#mmMerchantIdentification
	 * CardPaymentEnvironment69.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification14#mmOther
	 * PersonIdentification14.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation32#mmIdentification
	 * Organisation32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmAcquirerIdentification
	 * AcquirerProtocolParameters11.mmAcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmOther
	 * PersonIdentification15.mmOther}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier issued to a party for which no specific identifier has been defined."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, GenericIdentification> mmOtherIdentification = new MMBusinessAssociationEnd<PartyIdentificationInformation, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyIdentification1Choice.mmProprietaryIdentification, PartyIdentification2Choice.mmProprietaryIdentification, PartyIdentification4Choice.mmProprietaryIdentification,
					IndividualPerson5.mmOtherIdentification, IndividualPerson10.mmOtherIdentification, FinancialInstitutionIdentification3Choice.mmProprietaryIdentification, IndividualPerson20.mmOtherIdentification,
					CashAccount26.mmAccountOwnerOtherIdentification, IndividualPersonIdentificationChoice.mmIdentificationNumber, PartyIdentification5Choice.mmProprietaryIdentification, IndividualPerson6.mmModifiedOtherIdentification,
					IndividualPerson11.mmModifiedOtherIdentification, MemberIdentification2Choice.mmOther, OrganisationIdentification2.mmProprietaryIdentification, PersonIdentification3.mmOtherIdentification,
					OrganisationIdentification4.mmOther, PersonIdentification5.mmOther, ContactDetails2.mmOther, OrganisationIdentification8.mmOther, FinancialInstitutionIdentification3.mmProprietaryIdentification,
					FinancialInstitutionIdentification5Choice.mmProprietaryIdentification, PartyIdentification13Choice.mmProprietaryIdentification, PartyIdentification36Choice.mmProprietaryIdentification,
					OrganisationIdentification7.mmOther, PartyIdentification51Choice.mmProprietaryIdentification, OrganisationIdentification9.mmOther, PartyIdentification10Choice.mmProprietaryIdentification,
					PartyIdentification14Choice.mmProprietaryIdentification, PartyIdentification45Choice.mmProprietaryIdentification, PartyIdentification37Choice.mmProprietaryIdentification, SafekeepingPlaceFormat3Choice.mmProprietary,
					PartyIdentification43Choice.mmProprietaryIdentification, PartyIdentification3Choice.mmProprietaryIdentification, PartyIdentification30Choice.mmProprietaryIdentification,
					PartyIdentification38Choice.mmProprietaryIdentification, PartyIdentification62Choice.mmProprietaryIdentification, PartyIdentification60Choice.mmProprietaryIdentification,
					PartyIdentification65Choice.mmProprietaryIdentification, SafekeepingPlaceFormat4Choice.mmProprietary, PartyIdentification61Choice.mmProprietaryIdentification, SafekeepingPlaceFormat2Choice.mmProprietary,
					PartyIdentification18Choice.mmProprietaryIdentification, SafekeepingPlaceFormat5Choice.mmProprietary, PartyIdentification16Choice.mmProprietaryIdentification, PartyIdentification46Choice.mmProprietaryIdentification,
					PartyIdentification56Choice.mmProprietaryIdentification, PartyIdentification48Choice.mmProprietaryIdentification, PartyIdentification52Choice.mmProprietaryIdentification,
					PartyIdentification41Choice.mmProprietaryIdentification, PartyIdentification50Choice.mmProprietaryIdentification, PartyIdentification31Choice.mmProprietaryIdentification,
					PartyIdentification40Choice.mmProprietaryIdentification, PartyIdentification42Choice.mmProprietaryIdentification, PartyIdentification54Choice.mmProprietaryIdentification,
					PartyIdentification55Choice.mmProprietaryIdentification, PartyIdentification47Choice.mmProprietaryIdentification, PartyIdentification57Choice.mmProprietaryIdentification,
					SafekeepingPlaceFormatChoice.mmIdentificationAsDSS, PartyIdentification49Choice.mmProprietaryIdentification, PartyIdentification59Choice.mmProprietaryIdentification,
					PartyIdentification64Choice.mmProprietaryIdentification, PartyIdentification63Choice.mmProprietaryIdentification, PartyIdentification15Choice.mmProprietaryIdentification,
					PartyIdentification32Choice.mmProprietaryIdentification, PartyIdentification70Choice.mmProprietaryIdentification, PartyIdentification23Choice.mmProprietaryIdentification,
					PartyIdentification35Choice.mmProprietaryIdentification, PartyIdentification23.mmProprietaryIdentification, PartyIdentification6Choice.mmProprietaryIdentification, PartyIdentification54.mmProprietaryIdentification,
					OrganisationIdentification6.mmOther, PartyIdentification22.mmAlternativeIdentifier, PartyIdentification44.mmAlternativeIdentifier, AcquirerProtocolParameters1.mmAcquirerIdentification,
					AcquirerProtocolParameters3.mmAcquirerIdentification, CardPaymentEnvironment8.mmMerchantIdentification, CardPaymentEnvironment17.mmMerchantIdentification, Acquirer1.mmIdentification,
					AuthorisationResult1.mmAuthorisationEntity, Acquirer2.mmIdentification, Acquirer3.mmIdentification, Organisation8.mmIdentification, Organisation9.mmIdentification, AuthorisationResult2.mmAuthorisationEntity,
					AuthorisationResult3.mmAuthorisationEntity, CardPaymentEnvironment3.mmMerchantIdentification, CardPaymentEnvironment11.mmMerchantIdentification, CardPaymentEnvironment16.mmMerchantIdentification,
					CardPaymentEnvironment7.mmMerchantIdentification, CardPaymentEnvironment15.mmMerchantIdentification, CardPaymentEnvironment19.mmMerchantIdentification, IndividualPerson2.mmOtherIdentification,
					IndividualPerson12.mmOtherIdentification, IndividualPerson9.mmOtherIdentification, NonFinancialInstitutionIdentification1.mmProprietaryIdentification, PersonIdentification2.mmOtherIdentification,
					FinancialInstitutionIdentification1.mmProprietaryIdentification, PartyIdentification9Choice.mmProprietaryIdentification, PersonIdentificationType1Choice.mmOtherIdentification,
					BeneficialOwner1.mmAdditionalIdentification, PartyIdentification11Choice.mmProprietaryIdentification, PartyIdentification25.mmProprietaryIdentification, FinancialInstitutionIdentification6.mmProprietaryIdentification,
					PartyIdentification26.mmProprietaryIdentification, PartyIdentification27.mmProprietaryIdentification, PartyIdentification28.mmProprietaryIdentification, PartyIdentification33Choice.mmProprietaryIdentification,
					PartyIdentification66Choice.mmProprietaryIdentification, PartyIdentification67Choice.mmProprietaryIdentification, ContactDetails3.mmOther, IdentificationType1Choice.mmProprietary,
					IndividualPerson15.mmOtherIdentification, PersonIdentification4.mmOtherIdentification, FinancialInstitutionIdentification5.mmProprietaryIdentification, PartyIdentification26Choice.mmProprietaryIdentification,
					FinancialInstitutionIdentification6Choice.mmProprietaryIdentification, PartyIdentification24.mmProprietaryIdentification, PartyIdentification72Choice.mmProprietaryIdentification,
					PartyIdentification71Choice.mmProprietaryIdentification, SafekeepingPlaceFormat1Choice.mmProprietary, IndividualPerson21.mmModifiedOtherIdentification, IndividualPerson22.mmOtherIdentification,
					PartyIdentification62.mmProprietaryIdentification, PartyIdentification64.mmProprietaryIdentification, CardPaymentEnvironment31.mmMerchantIdentification, CardPaymentEnvironment29.mmMerchantIdentification,
					AcquirerProtocolParameters6.mmAcquirerIdentification, CardPaymentEnvironment25.mmMerchantIdentification, PersonIdentification7.mmOther, CardPaymentEnvironment30.mmMerchantIdentification,
					CardPaymentEnvironment28.mmMerchantIdentification, CardPaymentEnvironment21.mmMerchantIdentification, IndividualPerson23.mmOtherIdentification, IndividualPerson24.mmModifiedOtherIdentification, OwnerType1.mmProprietary,
					BeneficialOwner2.mmAdditionalIdentification, PledgeeFormat1Choice.mmProprietary, PartyIdentification83Choice.mmProprietaryIdentification, SafekeepingPlaceFormat7Choice.mmProprietary,
					PartyIdentification89Choice.mmProprietaryIdentification, PartyIdentification87Choice.mmProprietaryIdentification, PartyIdentification88Choice.mmProprietaryIdentification, PledgeeFormat2Choice.mmProprietary,
					CardPaymentEnvironment37.mmMerchantIdentification, Acquirer4.mmIdentification, CardPaymentEnvironment33.mmMerchantIdentification, AcquirerProtocolParameters7.mmAcquirerIdentification, Acquirer5.mmIdentification,
					CardPaymentEnvironment43.mmMerchantIdentification, AuthorisationResult4.mmAuthorisationEntity, CardPaymentEnvironment41.mmMerchantIdentification, CardPaymentEnvironment42.mmMerchantIdentification,
					AuthorisationResult5.mmAuthorisationEntity, CardPaymentEnvironment44.mmMerchantIdentification, AuthorisationResult6.mmAuthorisationEntity, CardPaymentEnvironment38.mmMerchantIdentification,
					AuthorisationResult8.mmAuthorisationEntity, AuthorisationResult7.mmAuthorisationEntity, CounterpartyIdentification1Choice.mmOther, AuthorisationResult9.mmAuthorisationEntity,
					PartyIdentification90Choice.mmProprietaryIdentification, PartyIdentification92Choice.mmProprietaryIdentification, SafekeepingPlaceFormat8Choice.mmProprietary, PersonIdentification10.mmOther,
					PersonOrOrganisation1Choice.mmInternal, SafekeepingPlaceFormat10Choice.mmProprietary, PartyIdentification93Choice.mmProprietaryIdentification, PledgeeFormat3Choice.mmProprietary,
					PartyIdentification94Choice.mmProprietaryIdentification, PartyIdentification97Choice.mmProprietaryIdentification, IndividualPersonIdentification1Choice.mmIdentificationNumber,
					FinancialInstitutionIdentification7Choice.mmProprietaryIdentification, InvestmentAccountOwnershipInformation12.mmOtherIdentification, InvestmentAccountOwnershipInformation13.mmOtherIdentification,
					CashAccount33.mmAccountOwnerOtherIdentification, IndividualPersonIdentification2Choice.mmIdentificationNumber, PartyIdentification96Choice.mmProprietaryIdentification,
					PartyIdentification100Choice.mmProprietaryIdentification, PartyIdentification101Choice.mmProprietaryIdentification, PartyIdentification104Choice.mmProprietaryIdentification, SafekeepingPlaceFormat11Choice.mmProprietary,
					PartyIdentification103Choice.mmProprietaryIdentification, PartyIdentification113Choice.mmProprietaryIdentification, SafekeepingPlaceFormat17Choice.mmProprietary, PartyIdentification115Choice.mmProprietaryIdentification,
					PartyIdentification114Choice.mmProprietaryIdentification, PledgeeFormat4Choice.mmProprietary, SafekeepingPlaceFormat26Choice.mmProprietary, PartyIdentification95Choice.mmProprietaryIdentification,
					CounterpartyIdentification2Choice.mmOther, CardPaymentEnvironment46.mmMerchantIdentification, CardPaymentEnvironment50.mmMerchantIdentification, AuthorisationResult12.mmAuthorisationEntity,
					AuthorisationResult11.mmAuthorisationEntity, AuthorisationResult10.mmAuthorisationEntity, CardPaymentEnvironment56.mmMerchantIdentification, CardPaymentEnvironment55.mmMerchantIdentification,
					AcquirerProtocolParameters9.mmAcquirerIdentification, PersonIdentification11.mmOther, Organisation25.mmIdentification, AuthorisationResult13.mmAuthorisationEntity, PersonIdentification12.mmOther,
					IndividualPerson32.mmOtherIdentification, FinancialInstitutionIdentification8Choice.mmProprietaryIdentification, IndividualPerson31.mmOtherIdentification, InvestmentAccountOwnershipInformation15.mmOtherIdentification,
					InvestmentAccountOwnershipInformation14.mmOtherIdentification, IndividualPersonIdentification3Choice.mmIdentificationNumber, SafekeepingPlaceFormat27Choice.mmProprietary,
					CounterpartyIdentification3Choice.mmSectorAndLocation, CounterpartyIdentification3Choice.mmNameAndLocation, CardPaymentEnvironment64.mmMerchantIdentification, CardPaymentEnvironment65.mmMerchantIdentification,
					CardPaymentEnvironment67.mmMerchantIdentification, CardPaymentEnvironment63.mmMerchantIdentification, AcquirerProtocolParameters10.mmAcquirerIdentification, PartyIdentification119Choice.mmProprietaryIdentification,
					PersonIdentification13.mmOther, FinancialInstitutionIdentification9Choice.mmProprietaryIdentification, CardPaymentEnvironment71.mmMerchantIdentification, CardPaymentEnvironment69.mmMerchantIdentification,
					PersonIdentification14.mmOther, Organisation32.mmIdentification, AcquirerProtocolParameters11.mmAcquirerIdentification, PersonIdentification15.mmOther);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a party for which no specific identifier has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmRelatedPartyIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(PartyIdentificationInformation obj) {
			return obj.getOtherIdentification();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, GenericIdentification value) {
			obj.setOtherIdentification(value);
		}
	};
	protected Party identifiedParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1#mmParty
	 * QualifiedPartyIdentification1.mmParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which an identification is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, Optional<Party>> mmIdentifiedParty = new MMBusinessAssociationEnd<PartyIdentificationInformation, Optional<Party>>() {
		{
			derivation_lazy = () -> Arrays.asList(QualifiedPartyIdentification1.mmParty);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedParty";
			definition = "Party for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Party.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}

		@Override
		public Optional<Party> getValue(PartyIdentificationInformation obj) {
			return obj.getIdentifiedParty();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Optional<Party> value) {
			obj.setIdentifiedParty(value.orElse(null));
		}
	};
	protected Max35Text taxIdentificationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#mmTaxIdentificationNumber
	 * Organisation2.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmDebtorTaxIdentificationNumber
	 * DirectDebitMandate3.mmDebtorTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorTaxIdentificationNumber
	 * DirectDebitMandate4.mmDebtorTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#mmTaxIdentificationNumber
	 * Organisation13.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmTaxIdentificationNumber
	 * Organisation4.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#mmTaxIdentificationNumber
	 * PartyIdentification5Choice.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#mmTaxIdentificationNumber
	 * Organisation3.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification2#mmTaxIdentificationNumber
	 * OrganisationIdentification2.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification3#mmTaxIdentificationNumber
	 * PersonIdentification3.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmCreditorTaxIdentification
	 * TaxInformation2.mmCreditorTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmDebtorTaxIdentification
	 * TaxInformation2.mmDebtorTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty1#mmTaxIdentification
	 * TaxParty1.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty1#mmRegistrationIdentification
	 * TaxParty1.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty2#mmTaxIdentification
	 * TaxParty2.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty2#mmRegistrationIdentification
	 * TaxParty2.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmTaxIdentificationNumber
	 * NonFinancialInstitutionIdentification1.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification2#mmTaxIdentificationNumber
	 * PersonIdentification2.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonIdentificationType1Choice#mmTaxIdentificationNumber
	 * PersonIdentificationType1Choice.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#mmTaxIdentification
	 * TaxParty3.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#mmRegistrationIdentification
	 * TaxParty3.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmCustomerTaxIdentification
	 * BillingTaxRegion1.mmCustomerTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification24#mmTaxIdentification
	 * PartyIdentification24.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#mmTaxIdentificationNumber
	 * Organisation15.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmTaxIdentificationNumber
	 * PersonIdentification7.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmTaxIdentification
	 * Organisation16.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#mmTaxIdentification
	 * Organisation17.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation20#mmTaxationIdentificationNumber
	 * Organisation20.mmTaxationIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmTaxIdentificationNumber
	 * Organisation21.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorTaxIdentificationNumber
	 * DirectDebitMandate5.mmDebtorTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmTaxIdentificationNumber
	 * PartyIdentification96Choice.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification11#mmTaxIdentificationNumber
	 * PersonIdentification11.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation27#mmTaxIdentificationNumber
	 * Organisation27.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorTaxIdentificationNumber
	 * DirectDebitMandate6.mmDebtorTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation31#mmTaxIdentificationNumber
	 * Organisation31.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmTaxIdentificationNumber
	 * PersonIdentification15.mmTaxIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, Max35Text> mmTaxIdentificationNumber = new MMBusinessAttribute<PartyIdentificationInformation, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation2.mmTaxIdentificationNumber, DirectDebitMandate3.mmDebtorTaxIdentificationNumber, DirectDebitMandate4.mmDebtorTaxIdentificationNumber, Organisation13.mmTaxIdentificationNumber,
					Organisation4.mmTaxIdentificationNumber, PartyIdentification5Choice.mmTaxIdentificationNumber, Organisation3.mmTaxIdentificationNumber, OrganisationIdentification2.mmTaxIdentificationNumber,
					PersonIdentification3.mmTaxIdentificationNumber, TaxInformation2.mmCreditorTaxIdentification, TaxInformation2.mmDebtorTaxIdentification, TaxParty1.mmTaxIdentification, TaxParty1.mmRegistrationIdentification,
					TaxParty2.mmTaxIdentification, TaxParty2.mmRegistrationIdentification, NonFinancialInstitutionIdentification1.mmTaxIdentificationNumber, PersonIdentification2.mmTaxIdentificationNumber,
					PersonIdentificationType1Choice.mmTaxIdentificationNumber, TaxParty3.mmTaxIdentification, TaxParty3.mmRegistrationIdentification, BillingTaxRegion1.mmCustomerTaxIdentification, PartyIdentification24.mmTaxIdentification,
					Organisation15.mmTaxIdentificationNumber, PersonIdentification7.mmTaxIdentificationNumber, Organisation16.mmTaxIdentification, Organisation17.mmTaxIdentification, Organisation20.mmTaxationIdentificationNumber,
					Organisation21.mmTaxIdentificationNumber, DirectDebitMandate5.mmDebtorTaxIdentificationNumber, PartyIdentification96Choice.mmTaxIdentificationNumber, PersonIdentification11.mmTaxIdentificationNumber,
					Organisation27.mmTaxIdentificationNumber, DirectDebitMandate6.mmDebtorTaxIdentificationNumber, Organisation31.mmTaxIdentificationNumber, PersonIdentification15.mmTaxIdentificationNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PartyIdentificationInformation obj) {
			return obj.getTaxIdentificationNumber();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Max35Text value) {
			obj.setTaxIdentificationNumber(value);
		}
	};
	protected Max35Text nationalRegistrationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation2#mmNationalRegistrationNumber
	 * Organisation2.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate3#mmDebtorNationalRegistrationNumber
	 * DirectDebitMandate3.mmDebtorNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate4#mmDebtorNationalRegistrationNumber
	 * DirectDebitMandate4.mmDebtorNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#mmNationalRegistrationNumber
	 * Organisation13.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation4#mmNationalRegistrationNumber
	 * Organisation4.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice#mmNationalRegistrationNumber
	 * PartyIdentification5Choice.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation3#mmNationalRegistrationNumber
	 * Organisation3.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#mmNationalRegistrationNumber
	 * Organisation15.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmNationalRegistrationNumber
	 * Organisation16.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#mmNationalRegistrationNumber
	 * Organisation17.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation20#mmRegistrationNumber
	 * Organisation20.mmRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation21#mmNationalRegistrationNumber
	 * Organisation21.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate5#mmDebtorNationalRegistrationNumber
	 * DirectDebitMandate5.mmDebtorNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmNationalRegistrationNumber
	 * PartyIdentification96Choice.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation27#mmNationalRegistrationNumber
	 * Organisation27.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitMandate6#mmDebtorNationalRegistrationNumber
	 * DirectDebitMandate6.mmDebtorNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation31#mmNationalRegistrationNumber
	 * Organisation31.mmNationalRegistrationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, Optional<Max35Text>> mmNationalRegistrationNumber = new MMBusinessAttribute<PartyIdentificationInformation, Optional<Max35Text>>() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation2.mmNationalRegistrationNumber, DirectDebitMandate3.mmDebtorNationalRegistrationNumber, DirectDebitMandate4.mmDebtorNationalRegistrationNumber,
					Organisation13.mmNationalRegistrationNumber, Organisation4.mmNationalRegistrationNumber, PartyIdentification5Choice.mmNationalRegistrationNumber, Organisation3.mmNationalRegistrationNumber,
					Organisation15.mmNationalRegistrationNumber, Organisation16.mmNationalRegistrationNumber, Organisation17.mmNationalRegistrationNumber, Organisation20.mmRegistrationNumber, Organisation21.mmNationalRegistrationNumber,
					DirectDebitMandate5.mmDebtorNationalRegistrationNumber, PartyIdentification96Choice.mmNationalRegistrationNumber, Organisation27.mmNationalRegistrationNumber, DirectDebitMandate6.mmDebtorNationalRegistrationNumber,
					Organisation31.mmNationalRegistrationNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PartyIdentificationInformation obj) {
			return obj.getNationalRegistrationNumber();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Optional<Max35Text> value) {
			obj.setNationalRegistrationNumber(value.orElse(null));
		}
	};
	protected TypeOfIdentificationCode typeOfIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType2Choice#mmCode
	 * IdentificationType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType2Choice#mmProprietary
	 * IdentificationType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType4Choice#mmCode
	 * IdentificationType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType4Choice#mmProprietary
	 * IdentificationType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType5Choice#mmCode
	 * IdentificationType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType5Choice#mmProprietary
	 * IdentificationType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType40Choice#mmCode
	 * IdentificationType40Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType40Choice#mmProprietary
	 * IdentificationType40Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType41Choice#mmCode
	 * IdentificationType41Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType41Choice#mmProprietary
	 * IdentificationType41Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType6Choice#mmCode
	 * IdentificationType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType6Choice#mmProprietary
	 * IdentificationType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType42Choice#mmCode
	 * IdentificationType42Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType42Choice#mmProprietary
	 * IdentificationType42Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType43Choice#mmCode
	 * IdentificationType43Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType43Choice#mmProprietary
	 * IdentificationType43Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType44Choice#mmCode
	 * IdentificationType44Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationType44Choice#mmProprietary
	 * IdentificationType44Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of alternate identification which can be used to identify a party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, TypeOfIdentificationCode> mmTypeOfIdentification = new MMBusinessAttribute<PartyIdentificationInformation, TypeOfIdentificationCode>() {
		{
			derivation_lazy = () -> Arrays.asList(IdentificationType2Choice.mmCode, IdentificationType2Choice.mmProprietary, IdentificationType4Choice.mmCode, IdentificationType4Choice.mmProprietary, IdentificationType5Choice.mmCode,
					IdentificationType5Choice.mmProprietary, IdentificationType40Choice.mmCode, IdentificationType40Choice.mmProprietary, IdentificationType41Choice.mmCode, IdentificationType41Choice.mmProprietary,
					IdentificationType6Choice.mmCode, IdentificationType6Choice.mmProprietary, IdentificationType42Choice.mmCode, IdentificationType42Choice.mmProprietary, IdentificationType43Choice.mmCode,
					IdentificationType43Choice.mmProprietary, IdentificationType44Choice.mmCode, IdentificationType44Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfIdentification";
			definition = "Specifies the type of alternate identification which can be used to identify a party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfIdentificationCode.mmObject();
		}

		@Override
		public TypeOfIdentificationCode getValue(PartyIdentificationInformation obj) {
			return obj.getTypeOfIdentification();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, TypeOfIdentificationCode value) {
			obj.setTypeOfIdentification(value);
		}
	};
	protected Max350Text declaration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation1#mmDeclarationDetails
	 * PartyTextInformation1.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation2#mmDeclarationDetails
	 * PartyTextInformation2.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation3#mmDeclarationDetails
	 * PartyTextInformation3.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation4#mmDeclarationDetails
	 * PartyTextInformation4.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmDeclarationDetails
	 * PartyIdentification33.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification34#mmDeclarationDetails
	 * PartyIdentification34.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification50#mmDeclarationDetails
	 * PartyIdentification50.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification51#mmDeclarationDetails
	 * PartyIdentification51.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification56#mmDeclarationDetails
	 * PartyIdentification56.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification57#mmDeclarationDetails
	 * PartyIdentification57.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation5#mmDeclarationDetails
	 * PartyTextInformation5.mmDeclarationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declaration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides declaration details relative to the party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, Optional<Max350Text>> mmDeclaration = new MMBusinessAttribute<PartyIdentificationInformation, Optional<Max350Text>>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyTextInformation1.mmDeclarationDetails, PartyTextInformation2.mmDeclarationDetails, PartyTextInformation3.mmDeclarationDetails, PartyTextInformation4.mmDeclarationDetails,
					PartyIdentification33.mmDeclarationDetails, PartyIdentification34.mmDeclarationDetails, PartyIdentification50.mmDeclarationDetails, PartyIdentification51.mmDeclarationDetails, PartyIdentification56.mmDeclarationDetails,
					PartyIdentification57.mmDeclarationDetails, PartyTextInformation5.mmDeclarationDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Declaration";
			definition = "Provides declaration details relative to the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(PartyIdentificationInformation obj) {
			return obj.getDeclaration();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Optional<Max350Text> value) {
			obj.setDeclaration(value.orElse(null));
		}
	};
	protected PartyTypeCode partyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole1Choice#mmCode
	 * PartyRole1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole1Choice#mmProprietary
	 * PartyRole1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyType1Choice#mmCode
	 * PartyType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyType1Choice#mmProprietary
	 * PartyType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PlaceOfPresentation1#mmPlace
	 * PlaceOfPresentation1.mmPlace}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole2Choice#mmCode
	 * PartyRole2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole2Choice#mmProprietary
	 * PartyRole2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole4Choice#mmCode
	 * PartyRole4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole4Choice#mmProprietary
	 * PartyRole4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PartyRole5Choice#mmCode
	 * PartyRole5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyRole5Choice#mmProprietary
	 * PartyRole5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification92#mmType
	 * MarketIdentification92.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of party in different business contexts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, PartyTypeCode> mmPartyType = new MMBusinessAttribute<PartyIdentificationInformation, PartyTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyRole1Choice.mmCode, PartyRole1Choice.mmProprietary, PartyType1Choice.mmCode, PartyType1Choice.mmProprietary, PlaceOfPresentation1.mmPlace, PartyRole2Choice.mmCode,
					PartyRole2Choice.mmProprietary, PartyRole4Choice.mmCode, PartyRole4Choice.mmProprietary, PartyRole5Choice.mmCode, PartyRole5Choice.mmProprietary, MarketIdentification92.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of party in different business contexts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}

		@Override
		public PartyTypeCode getValue(PartyIdentificationInformation obj) {
			return obj.getPartyType();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, PartyTypeCode value) {
			obj.setPartyType(value);
		}
	};
	protected List<PartyName> partyName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PartyName PartyName}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
	 * PartyName.mmPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxOrganisationIdentification1#mmName
	 * TaxOrganisationIdentification1.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, List<PartyName>> mmPartyName = new MMBusinessAssociationEnd<PartyIdentificationInformation, List<PartyName>>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxOrganisationIdentification1.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			minOccurs = 1;
			opposite_lazy = () -> PartyName.mmPartyIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyName.mmObject();
		}

		@Override
		public List<PartyName> getValue(PartyIdentificationInformation obj) {
			return obj.getPartyName();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, List<PartyName> value) {
			obj.setPartyName(value);
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
	 * DateTimePeriod.mmRelatedIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which an identification is valid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, Optional<DateTimePeriod>> mmValidityPeriod = new MMBusinessAssociationEnd<PartyIdentificationInformation, Optional<DateTimePeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmRelatedIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public Optional<DateTimePeriod> getValue(PartyIdentificationInformation obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Optional<DateTimePeriod> value) {
			obj.setValidityPeriod(value.orElse(null));
		}
	};
	protected Market identifiedMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmIdentification
	 * Market.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which an identification is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, Market> mmIdentifiedMarket = new MMBusinessAssociationEnd<PartyIdentificationInformation, Market>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentifiedMarket";
			definition = "Market for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Market.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Market.mmObject();
		}

		@Override
		public Market getValue(PartyIdentificationInformation obj) {
			return obj.getIdentifiedMarket();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Market value) {
			obj.setIdentifiedMarket(value);
		}
	};
	protected LEIIdentifier lEI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund2#mmLegalEntityIdentifier
	 * Fund2.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmLegalEntityIdentifier
	 * Fund1.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund3#mmLegalEntityIdentifier
	 * Fund3.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund4#mmLegalEntityIdentifier
	 * Fund4.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification1Choice#mmLEI
	 * CounterpartyIdentification1Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#mmLEI
	 * PartyIdentificationAndAccount106.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification75#mmLEI
	 * PartyIdentification75.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmLEI
	 * PartyIdentificationAndAccount112.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount111#mmLEI
	 * PartyIdentificationAndAccount111.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117#mmLEI
	 * PartyIdentificationAndAccount117.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#mmLEI
	 * PartyIdentificationAndAccount108.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#mmLEI
	 * PartyIdentificationAndAccount107.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount109#mmLEI
	 * PartyIdentificationAndAccount109.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmLEI
	 * PersonOrOrganisation1Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice#mmLEI
	 * PersonOrOrganisation2Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2#mmTransmittingBuyer
	 * SecuritiesTransactionTransmission2.mmTransmittingBuyer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionTransmission2#mmTransmittingSeller
	 * SecuritiesTransactionTransmission2.mmTransmittingSeller}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification91#mmLEI
	 * PartyIdentification91.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DerivativePartyIdentification1Choice#mmLEI
	 * DerivativePartyIdentification1Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary36#mmLegalEntityIdentifier
	 * Intermediary36.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification97Choice#mmLegalEntityIdentifier
	 * PartyIdentification97Choice.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ThirdPartyRights1#mmLegalEntityIdentifier
	 * ThirdPartyRights1.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#mmLegalEntityIdentifier
	 * Organisation22.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation24#mmLegalEntityIdentifier
	 * Organisation24.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary33#mmLegalEntityIdentifier
	 * Intermediary33.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification95#mmLegalEntityIdentifier
	 * PartyIdentification95.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification96#mmLegalEntityIdentifier
	 * PartyIdentification96.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification108#mmLEI
	 * PartyIdentification108.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount133#mmLEI
	 * PartyIdentificationAndAccount133.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification103#mmLEI
	 * PartyIdentification103.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131#mmLEI
	 * PartyIdentificationAndAccount131.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount146#mmLEI
	 * PartyIdentificationAndAccount146.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135#mmLEI
	 * PartyIdentificationAndAccount135.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount137#mmLEI
	 * PartyIdentificationAndAccount137.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136#mmLEI
	 * PartyIdentificationAndAccount136.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount134#mmLEI
	 * PartyIdentificationAndAccount134.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification2Choice#mmLEI
	 * CounterpartyIdentification2Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmBranchIdentification
	 * UnsecuredMarketTransaction2.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmBranchIdentification
	 * ForeignExchangeSwapTransaction2.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmBranchIdentification
	 * SecuredMarketTransaction2.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketTransactionStatus2#mmBranchIdentification
	 * MoneyMarketTransactionStatus2.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmBranchIdentification
	 * UnsecuredMarketTransaction3.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmBranchIdentification
	 * OvernightIndexSwapTransaction3.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmBranchIdentification
	 * SecuredMarketTransaction3.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification5Choice#mmLEI
	 * OrganisationIdentification5Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification1Choice#mmLEI
	 * OrganisationIdentification1Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification3Choice#mmLEI
	 * OrganisationIdentification3Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument53#mmLEI
	 * FinancialInstrument53.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10#mmLEI
	 * FinancialInstitutionIdentification10.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmLegalEntityIdentifier
	 * Organisation30.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation29#mmLegalEntityIdentifier
	 * Organisation29.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmIssuer
	 * SecuritiesReferenceDataReport5.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice#mmLEI
	 * FinancialInstrument48Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmBranchIdentification
	 * SecuredMarketTransaction4.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#mmLEI
	 * CounterpartyIdentification3Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmBranchIdentification
	 * ForeignExchangeSwapTransaction3.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmBranchIdentification
	 * OvernightIndexSwapTransaction4.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmBranchIdentification
	 * UnsecuredMarketTransaction4.mmBranchIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementAgent1#mmIdentification
	 * SettlementAgent1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAgent1#mmIdentification
	 * ConcentrationAgent1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification118Choice#mmLEI
	 * PartyIdentification118Choice.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CoverTwoDefaulters1#mmCover1Identification
	 * CoverTwoDefaulters1.mmCover1Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CoverTwoDefaulters1#mmCover2Identification
	 * CoverTwoDefaulters1.mmCover2Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument59#mmIssuer
	 * FinancialInstrument59.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmCounterparty
	 * RepurchaseAgreement2.mmCounterparty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmTripartyAgentIdentification
	 * RepurchaseAgreement2.mmTripartyAgentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement3#mmTripartyAgent
	 * RepurchaseAgreement3.mmTripartyAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Deposit1#mmCounterpartyIdentification
	 * Deposit1.mmCounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification15#mmLEI
	 * FinancialInstitutionIdentification15.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount159#mmLEI
	 * PartyIdentificationAndAccount159.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification127#mmLEI
	 * PartyIdentification127.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification128#mmLEI
	 * PartyIdentification128.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount160#mmLEI
	 * PartyIdentificationAndAccount160.mmLEI}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, LEIIdentifier> mmLEI = new MMBusinessAttribute<PartyIdentificationInformation, LEIIdentifier>() {
		{
			derivation_lazy = () -> Arrays.asList(Fund2.mmLegalEntityIdentifier, Fund1.mmLegalEntityIdentifier, Fund3.mmLegalEntityIdentifier, Fund4.mmLegalEntityIdentifier, CounterpartyIdentification1Choice.mmLEI,
					PartyIdentificationAndAccount106.mmLEI, PartyIdentification75.mmLEI, PartyIdentificationAndAccount112.mmLEI, PartyIdentificationAndAccount111.mmLEI, PartyIdentificationAndAccount117.mmLEI,
					PartyIdentificationAndAccount108.mmLEI, PartyIdentificationAndAccount107.mmLEI, PartyIdentificationAndAccount109.mmLEI, PersonOrOrganisation1Choice.mmLEI, PersonOrOrganisation2Choice.mmLEI,
					SecuritiesTransactionTransmission2.mmTransmittingBuyer, SecuritiesTransactionTransmission2.mmTransmittingSeller, PartyIdentification91.mmLEI, DerivativePartyIdentification1Choice.mmLEI,
					Intermediary36.mmLegalEntityIdentifier, PartyIdentification97Choice.mmLegalEntityIdentifier, ThirdPartyRights1.mmLegalEntityIdentifier, Organisation22.mmLegalEntityIdentifier, Organisation24.mmLegalEntityIdentifier,
					Intermediary33.mmLegalEntityIdentifier, PartyIdentification95.mmLegalEntityIdentifier, PartyIdentification96.mmLegalEntityIdentifier, PartyIdentification108.mmLEI, PartyIdentificationAndAccount133.mmLEI,
					PartyIdentification103.mmLEI, PartyIdentificationAndAccount131.mmLEI, PartyIdentificationAndAccount146.mmLEI, PartyIdentificationAndAccount135.mmLEI, PartyIdentificationAndAccount137.mmLEI,
					PartyIdentificationAndAccount136.mmLEI, PartyIdentificationAndAccount134.mmLEI, CounterpartyIdentification2Choice.mmLEI, UnsecuredMarketTransaction2.mmBranchIdentification,
					ForeignExchangeSwapTransaction2.mmBranchIdentification, SecuredMarketTransaction2.mmBranchIdentification, MoneyMarketTransactionStatus2.mmBranchIdentification, UnsecuredMarketTransaction3.mmBranchIdentification,
					OvernightIndexSwapTransaction3.mmBranchIdentification, SecuredMarketTransaction3.mmBranchIdentification, OrganisationIdentification5Choice.mmLEI, OrganisationIdentification1Choice.mmLEI,
					OrganisationIdentification3Choice.mmLEI, FinancialInstrument53.mmLEI, FinancialInstitutionIdentification10.mmLEI, Organisation30.mmLegalEntityIdentifier, Organisation29.mmLegalEntityIdentifier,
					SecuritiesReferenceDataReport5.mmIssuer, FinancialInstrument48Choice.mmLEI, SecuredMarketTransaction4.mmBranchIdentification, CounterpartyIdentification3Choice.mmLEI,
					ForeignExchangeSwapTransaction3.mmBranchIdentification, OvernightIndexSwapTransaction4.mmBranchIdentification, UnsecuredMarketTransaction4.mmBranchIdentification, SettlementAgent1.mmIdentification,
					ConcentrationAgent1.mmIdentification, PartyIdentification118Choice.mmLEI, CoverTwoDefaulters1.mmCover1Identification, CoverTwoDefaulters1.mmCover2Identification, FinancialInstrument59.mmIssuer,
					RepurchaseAgreement2.mmCounterparty, RepurchaseAgreement2.mmTripartyAgentIdentification, RepurchaseAgreement3.mmTripartyAgent, Deposit1.mmCounterpartyIdentification, FinancialInstitutionIdentification15.mmLEI,
					PartyIdentificationAndAccount159.mmLEI, PartyIdentification127.mmLEI, PartyIdentification128.mmLEI, PartyIdentificationAndAccount160.mmLEI);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LEI";
			definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public LEIIdentifier getValue(PartyIdentificationInformation obj) {
			return obj.getLEI();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, LEIIdentifier value) {
			obj.setLEI(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "\"Information\" to be removed when PartyIdentification message component is removed."}));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationInformation";
				definition = "Unique and unambiguous way to identify a party";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmRelatedPartyIdentification, Party.mmIdentification, PartyName.mmPartyIdentification, DateTimePeriod.mmRelatedIdentification, Market.mmIdentification);
				derivationElement_lazy = () -> Arrays.asList(PartyIdentification1Choice.mmNameAndAddress, PartyIdentification2Choice.mmNameAndAddress, PartyIdentification5Choice.mmNameAndAddress, PartyIdentification8.mmIdentification,
						PartyIdentification32.mmIdentification, PartyIdentification43.mmIdentification, PartyIdentificationAndAccount2.mmPartyIdentification, PartyIdentificationAndAccount5.mmPartyIdentification,
						PartyIdentificationAndAccount4.mmPartyIdentification, PartyIdentification21.mmPartyIdentification, PartyIdentification12Choice.mmNameAndAddress, PartyIdentification36.mmIdentification,
						PartyIdentification10Choice.mmNameAndAddress, PartyIdentificationAndAccount16.mmIdentification, PartyIdentification14Choice.mmNameAndAddress, PartyIdentification44Choice.mmNameAndAddress,
						PartyIdentification46.mmIdentification, PartyIdentification45Choice.mmNameAndAddress, PartyIdentificationAndAccount44.mmIdentification, PartyIdentification37Choice.mmNameAndAddress,
						AlternatePartyIdentification1.mmTypeOfIdentification, AlternatePartyIdentification2.mmIdentificationType, PartyIdentificationAndAccount1.mmIdentification, PartyIdentificationAndAccount1.mmAlternateIdentification,
						PartyIdentification29.mmPartyIdentification, PartyIdentification29.mmAlternateIdentification, PartyIdentification2.mmIdentification, PartyIdentification2.mmAlternateIdentification,
						PartyIdentification43Choice.mmNameAndAddress, PartyIdentificationAndAccount42.mmIdentification, PartyIdentificationAndAccount42.mmAlternateIdentification, PartyIdentification48.mmIdentification,
						PartyIdentification48.mmAlternateIdentification, PartyIdentificationAndAccount11.mmIdentification, PartyIdentificationAndAccount11.mmAlternateIdentification, PartyIdentification3Choice.mmNameAndAddress,
						PartyIdentificationAndAccount12.mmIdentification, PartyIdentificationAndAccount12.mmAlternateIdentification, PartyIdentificationAndAccount20.mmIdentification,
						PartyIdentificationAndAccount20.mmAlternateIdentification, PartyIdentification30Choice.mmNameAndAddress, PartyIdentificationAndAccount15.mmIdentification, PartyIdentificationAndAccount15.mmAlternateIdentification,
						PartyIdentificationAndAccount39.mmIdentification, PartyIdentificationAndAccount39.mmAlternateIdentification, PartyIdentification38Choice.mmNameAndAddress, PartyIdentificationAndAccount50.mmIdentification,
						PartyIdentificationAndAccount50.mmAlternateIdentification, PartyIdentificationAndAccount19.mmIdentification, PartyIdentificationAndAccount19.mmAlternateIdentification,
						PartyIdentificationAndAccount21.mmIdentification, PartyIdentificationAndAccount21.mmAlternateIdentification, PartyIdentificationAndAccount40.mmIdentification,
						PartyIdentificationAndAccount40.mmAlternateIdentification, PartyIdentificationAndAccount41.mmIdentification, PartyIdentificationAndAccount41.mmAlternateIdentification,
						PartyIdentificationAndAccount43.mmIdentification, PartyIdentification58Choice.mmNameAndAddress, PartyIdentification53.mmIdentification, PartyIdentification62Choice.mmNameAndAddress,
						PartyIdentificationAndAccount68.mmIdentification, PartyIdentification60Choice.mmNameAndAddress, PartyIdentification65Choice.mmNameAndAddress, PartyIdentificationAndAccount75.mmIdentification,
						AlternatePartyIdentification3.mmIdentificationType, PartyIdentificationAndAccount63.mmIdentification, PartyIdentificationAndAccount63.mmAlternateIdentification, PartyIdentification52.mmIdentification,
						PartyIdentification52.mmAlternateIdentification, PartyIdentificationAndAccount64.mmIdentification, PartyIdentificationAndAccount64.mmAlternateIdentification, PartyIdentification61Choice.mmNameAndAddress,
						PartyIdentificationAndAccount60.mmIdentification, PartyIdentificationAndAccount60.mmAlternateIdentification, PartyIdentificationAndAccount66.mmIdentification,
						PartyIdentificationAndAccount66.mmAlternateIdentification, PartyIdentification16Choice.mmNameAndAddress, PartyIdentification46Choice.mmNameAndAddress, PartyIdentification56Choice.mmNameAndAddress,
						PartyIdentification33.mmAlternateIdentification, PartyIdentification34.mmAlternateIdentification, PartyIdentification48Choice.mmNameAndAddress, PartyIdentification50.mmAlternateIdentification,
						PartyIdentification52Choice.mmNameAndAddress, PartyIdentification51.mmAlternateIdentification, PartyIdentification56.mmAlternateIdentification, PartyIdentification57.mmAlternateIdentification,
						PartyIdentification35.mmIdentification, PartyIdentification35.mmAlternateIdentification, PartyIdentificationAndAccount14.mmIdentification, PartyIdentificationAndAccount14.mmAlternateIdentification,
						PartyIdentificationAndAccount17.mmIdentification, PartyIdentificationAndAccount17.mmAlternateIdentification, PartyIdentificationAndAccount18.mmIdentification,
						PartyIdentificationAndAccount18.mmAlternateIdentification, PartyIdentification17Choice.mmNameAndAddress, PartyIdentification37.mmIdentification, PartyIdentification37.mmAlternateIdentification,
						PartyIdentificationAndAccount22.mmIdentification, PartyIdentificationAndAccount22.mmAlternateIdentification, PartyIdentificationAndAccount23.mmIdentification,
						PartyIdentificationAndAccount23.mmAlternateIdentification, PartyIdentification31Choice.mmNameAndAddress, PartyIdentificationAndAccount24.mmIdentification, PartyIdentificationAndAccount24.mmAlternateIdentification,
						PartyIdentification39Choice.mmNameAndAddress, PartyIdentification47.mmIdentification, PartyIdentification47.mmAlternateIdentification, PartyIdentification40Choice.mmNameAndAddress,
						PartyIdentificationAndAccount51.mmIdentification, PartyIdentificationAndAccount51.mmAlternateIdentification, PartyIdentificationAndAccount52.mmIdentification,
						PartyIdentificationAndAccount52.mmAlternateIdentification, PartyIdentification42Choice.mmNameAndAddress, PartyIdentificationAndAccount54.mmIdentification, PartyIdentificationAndAccount54.mmAlternateIdentification,
						PartyIdentification53Choice.mmNameAndAddress, PartyIdentification49.mmIdentification, PartyIdentification49.mmAlternateIdentification, PartyIdentification54Choice.mmNameAndAddress,
						PartyIdentificationAndAccount56.mmIdentification, PartyIdentificationAndAccount56.mmAlternateIdentification, PartyIdentificationAndAccount57.mmIdentification,
						PartyIdentificationAndAccount57.mmAlternateIdentification, PartyIdentification55Choice.mmNameAndAddress, PartyIdentificationAndAccount58.mmIdentification, PartyIdentificationAndAccount58.mmAlternateIdentification,
						PartyIdentification47Choice.mmNameAndAddress, PartyIdentification57Choice.mmNameAndAddress, PartyIdentification49Choice.mmNameAndAddress, PartyIdentification59Choice.mmNameAndAddress,
						PartyIdentification15.mmIdentification, PartyIdentificationAndAccount26.mmIdentification, PartyIdentificationAndAccount26.mmAlternateIdentification, PartyIdentification4.mmIdentification,
						PartyIdentification4.mmAlternateIdentification, PartyIdentificationAndAccount29.mmIdentification, PartyIdentificationAndAccount29.mmAlternateIdentification, PartyIdentificationAndAccount27.mmIdentification,
						PartyIdentificationAndAccount27.mmAlternateIdentification, PartyIdentificationAndAccount28.mmIdentification, PartyIdentificationAndAccount28.mmAlternateIdentification,
						PartyIdentificationAndAccount30.mmIdentification, PartyIdentificationAndAccount30.mmAlternateIdentification, PartyIdentificationAndAccount35.mmIdentification,
						PartyIdentificationAndAccount35.mmAlternateIdentification, PartyIdentificationAndAccount38.mmIdentification, PartyIdentificationAndAccount38.mmAlternateIdentification,
						PartyIdentificationAndAccount36.mmIdentification, PartyIdentificationAndAccount36.mmAlternateIdentification, PartyIdentificationAndAccount37.mmIdentification,
						PartyIdentificationAndAccount37.mmAlternateIdentification, PartyIdentificationAndAccount49.mmIdentification, PartyIdentificationAndAccount49.mmAlternateIdentification,
						PartyIdentificationAndAccount59.mmIdentification, PartyIdentificationAndAccount59.mmAlternateIdentification, PartyIdentificationAndAccount61.mmIdentification,
						PartyIdentificationAndAccount61.mmAlternateIdentification, PartyIdentificationAndAccount62.mmIdentification, PartyIdentificationAndAccount62.mmAlternateIdentification,
						PartyIdentificationAndAccount25.mmIdentification, PartyIdentificationAndAccount65.mmIdentification, PartyIdentificationAndAccount65.mmAlternateIdentification, PartyIdentification63Choice.mmNameAndAddress,
						PartyIdentificationAndAccount67.mmIdentification, PartyIdentificationAndAccount67.mmAlternateIdentification, PartyIdentification38.mmIdentification, PartyIdentification15Choice.mmNameAndAddress,
						PartyIdentificationAndAccount9.mmIdentification, PartyIdentificationAndAccount9.mmAlternateIdentification, PartyIdentification32Choice.mmNameAndAddress, AlternatePartyIdentification5.mmIdentificationType,
						PartyIdentificationAndAccount79.mmIdentification, PartyIdentificationAndAccount79.mmAdditionalInformation, PartyIdentificationAndAccount79.mmAlternateIdentification, PartyIdentification70Choice.mmNameAndAddress,
						AlternatePartyIdentification6.mmTypeOfIdentification, PartyIdentificationAndAccount87.mmIdentification, PartyIdentificationAndAccount87.mmAdditionalInformation,
						PartyIdentificationAndAccount87.mmAlternateIdentification, PartyIdentificationAndAccount83.mmIdentification, PartyIdentificationAndAccount83.mmAdditionalInformation,
						PartyIdentificationAndAccount83.mmAlternateIdentification, PartyIdentificationAndAccount77.mmIdentification, PartyIdentificationAndAccount77.mmAlternateIdentification,
						PartyIdentificationAndAccount77.mmAdditionalInformation, PartyIdentificationAndAccount78.mmIdentification, PartyIdentificationAndAccount78.mmAlternateIdentification,
						PartyIdentificationAndAccount78.mmAdditionalInformation, PartyIdentification23.mmNameAndAddress, PartyIdentification6Choice.mmNameAndAddress, PartyIdentificationAndAccount10.mmIdentification,
						PartyIdentificationAndAccount10.mmAlternateIdentification, PartyIdentificationAndAccount8.mmIdentification, PartyIdentificationAndAccount8.mmAlternateIdentification, PartyIdentification54.mmNameAndAddress,
						PartyIdentification68Choice.mmNameAndAddress, PartyIdentification55.mmIdentification, PartyIdentification55.mmAlternateIdentification, PartyIdentification55.mmAdditionalInformation,
						PartyIdentificationAndAccount34.mmIdentification, PartyIdentificationAndAccount34.mmAdditionalInformation, PartyIdentificationAndAccount34.mmAlternateIdentification, PartyIdentificationAndAccount80.mmIdentification,
						PartyIdentificationAndAccount80.mmAlternateIdentification, PartyIdentificationAndAccount80.mmAdditionalInformation, PartyIdentification41.mmIdentification, PartyIdentification40.mmIdentification,
						PartyModification1.mmPartyIdentification, ProprietaryParty1.mmParty, ProprietaryParty2.mmParty, ProprietaryParty3.mmParty, Party7Choice.mmParty, Party12Choice.mmParty, PartyIdentification42.mmIdentification,
						PartyIdentification7Choice.mmNameAndAddress, PartyIdentification8Choice.mmNameAndAddress, PartyIdentification19Choice.mmNameAndAddress, PartyIdentification73Choice.mmNameAndAddress,
						PartyIdentification73Choice.mmPartyIdentification, PartyIdentification60.mmNameAndAddress, PartyIdentificationAndAccount3.mmPartyIdentification, PartyIdentification1.mmIdentification,
						PartyIdentification9Choice.mmNameAndAddress, IssuerInformation1.mmIdentification, PartyIdentification39.mmIdentification, PartyIdentificationAndAccount53.mmIdentification,
						PartyIdentificationAndAccount53.mmAlternateIdentification, PartyIdentificationAndAccount55.mmIdentification, PartyIdentificationAndAccount55.mmAlternateIdentification,
						PartyIdentificationAndAccount45.mmIdentification, PartyIdentificationAndAccount45.mmAlternateIdentification, PartyIdentificationAndAccount48.mmIdentification,
						PartyIdentificationAndAccount48.mmAlternateIdentification, PartyIdentificationAndAccount46.mmIdentification, PartyIdentificationAndAccount46.mmAlternateIdentification,
						PartyIdentificationAndAccount47.mmIdentification, PartyIdentificationAndAccount47.mmAlternateIdentification, PartyIdentificationAndAccount6.mmPartyIdentification,
						PartyIdentificationAndContactInformation1.mmPartyIdentification, PartyIdentification45.mmIdentification, PartyIdentification29Choice.mmNameAndAddress, PartyIdentification33Choice.mmNameAndAddress,
						PartyIdentificationAndAccount69.mmIdentification, PartyIdentificationAndAccount69.mmAlternateIdentification, PartyIdentificationAndAccount70.mmIdentification,
						PartyIdentificationAndAccount70.mmAlternateIdentification, PartyIdentificationAndAccount71.mmIdentification, PartyIdentificationAndAccount71.mmAlternateIdentification,
						PartyIdentificationAndAccount72.mmIdentification, PartyIdentificationAndAccount72.mmAlternateIdentification, PartyIdentificationAndAccount73.mmIdentification,
						PartyIdentificationAndAccount73.mmAlternateIdentification, PartyIdentificationAndAccount74.mmIdentification, PartyIdentificationAndAccount74.mmAlternateIdentification, PartyIdentification66Choice.mmNameAndAddress,
						PartyIdentificationAndAccount76.mmIdentification, PartyIdentification67Choice.mmNameAndAddress, AlternatePartyIdentification4.mmIdentificationType, PartyIdentificationAndAccount31.mmIdentification,
						PartyIdentificationAndAccount31.mmAlternateIdentification, PartyIdentification34Choice.mmNameAndAddress, PartyIdentificationAndAccount32.mmPartyIdentification, PartyIdentification58.mmIdentification,
						PartyIdentification14.mmIdentification, PartyIdentification11.mmIdentification, PartyIdentification17.mmIdentification, PartyIdentification19.mmIdentification, PartyIdentification30.mmIdentification,
						PartyIdentification18.mmIdentification, PartyIdentification20.mmIdentification, PartyIdentification31.mmIdentification, PartyIdentification16.mmIdentification, PartyIdentification26Choice.mmNameAndAddress,
						PartyIdentificationAndAccount13.mmPartyIdentification, PartyIdentificationAndAccount7.mmPartyIdentification, PartyIdentification71Choice.mmNameAndAddress, PartyIdentification25Choice.mmIdentification,
						PartyIdentification25Choice.mmNameAndAddress, PartyIdentificationAndAccount95.mmPartyIdentification, PartyIdentificationAndAccount97.mmPartyIdentification, PartyIdentification62.mmNameAndAddress,
						PartyIdentificationAndAccount96.mmPartyIdentification, PartyIdentification63.mmPartyIdentification, PartyIdentification64.mmNameAndAddress, PartyIdentification75Choice.mmNameAndAddress,
						SafekeepingAccount5.mmAccountServicer, PartyIdentification83Choice.mmNameAndAddress, PartyIdentificationAndAccount100.mmIdentification, PartyIdentificationAndAccount100.mmAlternateIdentification,
						PartyIdentificationAndAccount100.mmAdditionalInformation, PartyIdentificationAndAccount101.mmIdentification, PartyIdentificationAndAccount101.mmAlternateIdentification, IssuerInformation2.mmIdentification,
						PartyIdentification71.mmIdentification, PartyIdentificationAndAccount102.mmPartyIdentification, PartyIdentification89Choice.mmNameAndAddress, PartyIdentification87Choice.mmNameAndAddress,
						PartyIdentification88Choice.mmNameAndAddress, PartyIdentificationAndAccount104.mmIdentification, PartyIdentificationAndAccount104.mmAlternateIdentification, QualifiedPartyIdentification1.mmShortIdentification,
						CardTransactionEnvironment5.mmSendingInstitution, CardTransactionEnvironment5.mmReceivingInstitution, CardTransactionEnvironment5.mmSettlementInstitution, PartyIdentification90Choice.mmNameAndAddress,
						PartyIdentificationAndAccount106.mmIdentification, PartyIdentificationAndAccount106.mmAlternateIdentification, PartyIdentification75.mmIdentification, PartyIdentification75.mmAlternateIdentification,
						PartyIdentificationAndAccount112.mmIdentification, PartyIdentificationAndAccount112.mmAlternateIdentification, AlternatePartyIdentification7.mmIdentificationType, PartyIdentificationAndAccount111.mmIdentification,
						PartyIdentificationAndAccount111.mmAlternateIdentification, PartyIdentificationAndAccount117.mmIdentification, PartyIdentificationAndAccount107.mmIdentification,
						PartyIdentificationAndAccount107.mmAlternateIdentification, PartyIdentification76.mmIdentification, PartyIdentification77.mmIdentification, Party28Choice.mmParty, PartyIdentification93Choice.mmNameAndAddress,
						PartyIdentification91.mmIdentification, PartyIdentification93.mmAlternateIdentification, PartyIdentificationAndAccount122.mmIdentification, PartyIdentificationAndAccount122.mmAlternateIdentification,
						PartyIdentification92.mmIdentification, PartyIdentification92.mmAlternateIdentification, PartyIdentification94Choice.mmNameAndAddress, PartyIdentificationAndAccount120.mmIdentification,
						PartyIdentificationAndAccount120.mmAlternateIdentification, PartyIdentificationAndAccount121.mmIdentification, PartyIdentificationAndAccount121.mmAlternateIdentification, PartyIdentification94.mmIdentification,
						PartyIdentification97Choice.mmNameAndAddress, PartyIdentification97.mmPartyIdentification, PartyIdentificationAndAccount124.mmPartyIdentification, PartyIdentification95.mmIdentification,
						PartyIdentificationAndAccount123.mmPartyIdentification, PartyIdentification96Choice.mmNameAndAddress, PartyIdentification96.mmIdentification, PartyIdentification99Choice.mmNameAndAddress,
						PartyIdentification98.mmIdentification, PartyIdentification100.mmIdentification, PlaceOfClearingIdentification1.mmIdentification, PlaceOfTradeIdentification1.mmMarketTypeAndIdentification,
						SafeKeepingPlace1.mmSafekeepingPlaceFormat, PartyIdentification99.mmIdentification, Pledgee1.mmPledgeeTypeAndIdentification, PartyIdentification100Choice.mmNameAndAddress,
						PartyIdentificationAndAccount127.mmIdentification, PartyIdentificationAndAccount127.mmAlternateIdentification, PartyIdentificationAndAccount127.mmAdditionalInformation, PartyIdentification102Choice.mmNameAndAddress,
						PartyIdentificationAndAccount126.mmPartyIdentification, PartyIdentification101Choice.mmNameAndAddress, AlternatePartyIdentification8.mmIdentificationType, PartyIdentification104Choice.mmNameAndAddress,
						PartyIdentification101.mmAlternateIdentification, PartyIdentification111Choice.mmNameAndAddress, PartyIdentification102.mmIdentification, PartyIdentification102.mmAlternateIdentification,
						PartyIdentificationAndAccount129.mmIdentification, PartyIdentificationAndAccount129.mmAlternateIdentification, PartyIdentificationAndAccount130.mmIdentification,
						PartyIdentificationAndAccount130.mmAlternateIdentification, AlternatePartyIdentification9.mmIdentificationType, PartyIdentification113Choice.mmNameAndAddress, PartyIdentificationAndAccount128.mmIdentification,
						PartyIdentificationAndAccount128.mmAlternateIdentification, PartyIdentification108.mmIdentification, PartyIdentificationAndAccount133.mmIdentification, PartyIdentificationAndAccount133.mmAlternateIdentification,
						PartyIdentification103.mmIdentification, PartyIdentification103.mmAlternateIdentification, PartyIdentificationAndAccount131.mmIdentification, PartyIdentificationAndAccount131.mmAlternateIdentification,
						PartyIdentificationAndAccount146.mmIdentification, PartyIdentificationAndAccount136.mmIdentification, PartyIdentificationAndAccount136.mmAlternateIdentification, PartyIdentificationAndAccount134.mmIdentification,
						PartyIdentificationAndAccount134.mmAlternateIdentification, PartyIdentification109.mmIdentification, PartyIdentification111.mmIdentification, PartyIdentification110.mmIdentification,
						PartyIdentification115Choice.mmNameAndAddress, SafeKeepingPlace2.mmSafekeepingPlaceFormat, PlaceOfTradeIdentification2.mmMarketTypeAndIdentification, Pledgee2.mmPledgeeTypeAndIdentification,
						PartyIdentification112.mmIdentification, FinancialInstitutionIdentification12.mmBICFI, SafekeepingAccount7.mmAccountServicer, PartyIdentification113.mmParty, PartyIdentificationAndAccount147.mmPartyIdentification,
						PartyIdentification119.mmIdentification, PartyIdentification120.mmIdentification, PartyIdentification120.mmAlternateIdentification, PartyIdentification121.mmIdentification, PartyIdentification121.mmProprietary,
						MarginAccount1.mmIdentification, MarginAccount1.mmPositionAccount, PartyIdentification122.mmIdentification, PartyIdentification122.mmProprietary, PartyIdentificationAndAccount157.mmPartyIdentification,
						PartyIdentification123.mmPartyIdentification, PartyIdentification124.mmParty, PartyIdentificationAndAccount158.mmPartyIdentification, ProprietaryParty4.mmParty, PartyIdentification125.mmIdentification,
						PartyIdentificationAndAccount159.mmIdentification, PartyIdentificationAndAccount159.mmAlternateIdentification, PartyIdentification127.mmIdentification, PartyIdentification127.mmAlternateIdentification,
						Party35Choice.mmParty, PartyIdentification128.mmIdentification, PartyIdentification128.mmAlternateIdentification, PartyIdentificationAndAccount160.mmIdentification,
						PartyIdentificationAndAccount160.mmAlternateIdentification, PartyIdentification129.mmIdentification);
				subType_lazy = () -> Arrays.asList(OrganisationIdentification.mmObject(), PersonIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmTaxIdentificationNumber, com.tools20022.repository.entity.PartyIdentificationInformation.mmNationalRegistrationNumber,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmTypeOfIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.mmDeclaration,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyType, com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyName,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmValidityPeriod, com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedMarket,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmLEI);
				derivationComponent_lazy = () -> Arrays.asList(NameAndAddress2.mmObject(), PartyIdentification1Choice.mmObject(), NameAndAddress5.mmObject(), PartyIdentification2Choice.mmObject(), PartyIdentification4Choice.mmObject(),
						NameAndAddress1.mmObject(), NameAndAddress4.mmObject(), PartyIdentification5Choice.mmObject(), Party2Choice.mmObject(), PartyIdentification8.mmObject(), Party6Choice.mmObject(), PartyIdentification32.mmObject(),
						Party11Choice.mmObject(), PartyIdentification43.mmObject(), PartyIdentification.mmObject(), NameAndAddress7.mmObject(), PartyIdentificationAndAccount2.mmObject(), PartyIdentificationAndAccount5.mmObject(),
						PartyIdentificationAndAccount4.mmObject(), PartyIdentification21.mmObject(), PartyIdentification13Choice.mmObject(), PartyIdentification36Choice.mmObject(), PartyIdentification51Choice.mmObject(),
						PartyIdentification12Choice.mmObject(), PartyIdentification36.mmObject(), PartyIdentification10Choice.mmObject(), PartyIdentificationAndAccount16.mmObject(), PartyIdentification14Choice.mmObject(),
						PartyIdentification44Choice.mmObject(), PartyIdentification46.mmObject(), PartyIdentification45Choice.mmObject(), PartyIdentificationAndAccount44.mmObject(), PartyIdentification37Choice.mmObject(),
						IdentificationType2Choice.mmObject(), AlternatePartyIdentification1.mmObject(), IdentificationType4Choice.mmObject(), AlternatePartyIdentification2.mmObject(), PartyTextInformation1.mmObject(),
						PartyIdentificationAndAccount1.mmObject(), PartyIdentification29.mmObject(), PartyIdentification2.mmObject(), PartyIdentification43Choice.mmObject(), PartyIdentificationAndAccount42.mmObject(),
						PartyIdentification48.mmObject(), PartyIdentificationAndAccount11.mmObject(), PartyIdentification3Choice.mmObject(), PartyIdentificationAndAccount12.mmObject(), PartyTextInformation2.mmObject(),
						PartyIdentificationAndAccount20.mmObject(), PartyIdentification30Choice.mmObject(), PartyIdentificationAndAccount15.mmObject(), PartyIdentificationAndAccount39.mmObject(), PartyIdentification38Choice.mmObject(),
						PartyIdentificationAndAccount50.mmObject(), PartyIdentificationAndAccount19.mmObject(), PartyIdentificationAndAccount21.mmObject(), PartyIdentificationAndAccount40.mmObject(),
						PartyIdentificationAndAccount41.mmObject(), PartyIdentificationAndAccount43.mmObject(), NameAndAddress12.mmObject(), PartyIdentification58Choice.mmObject(), PartyIdentification53.mmObject(),
						PartyIdentification62Choice.mmObject(), PartyIdentificationAndAccount68.mmObject(), PartyIdentification60Choice.mmObject(), PartyIdentification65Choice.mmObject(), PartyIdentificationAndAccount75.mmObject(),
						IdentificationType5Choice.mmObject(), AlternatePartyIdentification3.mmObject(), PartyTextInformation3.mmObject(), PartyIdentificationAndAccount63.mmObject(), PartyIdentification52.mmObject(),
						PartyTextInformation4.mmObject(), PartyIdentificationAndAccount64.mmObject(), PartyIdentification61Choice.mmObject(), PartyIdentificationAndAccount60.mmObject(), PartyIdentificationAndAccount66.mmObject(),
						PartyIdentification18Choice.mmObject(), PartyIdentification16Choice.mmObject(), PartyIdentification46Choice.mmObject(), PartyIdentification56Choice.mmObject(), PartyIdentification33.mmObject(),
						PartyIdentification34.mmObject(), PartyIdentification48Choice.mmObject(), PartyIdentification50.mmObject(), PartyIdentification52Choice.mmObject(), PartyIdentification51.mmObject(), PartyIdentification56.mmObject(),
						PartyIdentification57.mmObject(), PartyIdentification41Choice.mmObject(), PartyIdentification50Choice.mmObject(), PartyIdentification35.mmObject(), PartyIdentificationAndAccount14.mmObject(),
						PartyIdentificationAndAccount17.mmObject(), PartyIdentificationAndAccount18.mmObject(), PartyIdentification17Choice.mmObject(), PartyIdentification37.mmObject(), PartyIdentificationAndAccount22.mmObject(),
						PartyIdentificationAndAccount23.mmObject(), PartyIdentification31Choice.mmObject(), PartyIdentificationAndAccount24.mmObject(), PartyIdentification39Choice.mmObject(), PartyIdentification47.mmObject(),
						PartyIdentification40Choice.mmObject(), PartyIdentificationAndAccount51.mmObject(), PartyIdentificationAndAccount52.mmObject(), PartyIdentification42Choice.mmObject(), PartyIdentificationAndAccount54.mmObject(),
						PartyIdentification53Choice.mmObject(), PartyIdentification49.mmObject(), PartyIdentification54Choice.mmObject(), PartyIdentificationAndAccount56.mmObject(), PartyIdentificationAndAccount57.mmObject(),
						PartyIdentification55Choice.mmObject(), PartyIdentificationAndAccount58.mmObject(), PartyIdentification47Choice.mmObject(), PartyIdentification57Choice.mmObject(), PartyIdentificationSD3.mmObject(),
						PartyIdentification3.mmObject(), PartyIdentification49Choice.mmObject(), PartyIdentification59Choice.mmObject(), PartyIdentification15.mmObject(), PartyIdentificationAndAccount26.mmObject(),
						PartyIdentification4.mmObject(), PartyIdentificationAndAccount29.mmObject(), PartyIdentificationAndAccount27.mmObject(), PartyIdentificationAndAccount28.mmObject(), PartyIdentificationAndAccount30.mmObject(),
						PartyIdentificationAndAccount35.mmObject(), PartyIdentificationAndAccount38.mmObject(), PartyIdentificationAndAccount36.mmObject(), PartyIdentificationAndAccount37.mmObject(),
						PartyIdentificationAndAccount49.mmObject(), PartyIdentificationAndAccount59.mmObject(), PartyIdentificationAndAccount61.mmObject(), PartyIdentificationAndAccount62.mmObject(), PartyIdentification64Choice.mmObject(),
						PartyIdentificationAndAccount25.mmObject(), PartyIdentificationAndAccount65.mmObject(), PartyIdentification63Choice.mmObject(), PartyIdentificationAndAccount67.mmObject(), PartyIdentification38.mmObject(),
						PartyIdentification15Choice.mmObject(), PartyIdentificationAndAccount9.mmObject(), NameAndAddress13.mmObject(), PartyIdentification32Choice.mmObject(), IdentificationType40Choice.mmObject(),
						AlternatePartyIdentification5.mmObject(), PartyIdentificationAndAccount79.mmObject(), PartyIdentification70Choice.mmObject(), IdentificationType41Choice.mmObject(), AlternatePartyIdentification6.mmObject(),
						PartyIdentificationAndAccount87.mmObject(), PartyIdentificationAndAccount83.mmObject(), PartyIdentificationAndAccount77.mmObject(), PartyIdentificationAndAccount78.mmObject(), PartyIdentification23Choice.mmObject(),
						PartyIdentification35Choice.mmObject(), PartyTextInformation5.mmObject(), PartyIdentification23.mmObject(), PartyRole1Choice.mmObject(), PartyIdentification6Choice.mmObject(),
						PartyIdentificationAndAccount10.mmObject(), PartyIdentificationAndAccount8.mmObject(), PartyIdentification54.mmObject(), PartyIdentification68Choice.mmObject(), PartyIdentification55.mmObject(),
						PartyIdentificationAndAccount34.mmObject(), PartyIdentificationAndAccount80.mmObject(), Party8Choice.mmObject(), PartyIdentification41.mmObject(), PartyIdentification40.mmObject(), PartyModification1.mmObject(),
						ProprietaryParty1.mmObject(), NameAndAddress3.mmObject(), ProprietaryParty2.mmObject(), NameAndAddress10.mmObject(), ProprietaryParty3.mmObject(), Party7Choice.mmObject(), Party12Choice.mmObject(),
						Party10Choice.mmObject(), PartyIdentification42.mmObject(), Party9Choice.mmObject(), PartyType1Choice.mmObject(), PartyIdentification7Choice.mmObject(), NameAndAddress8.mmObject(), PartyIdentification22.mmObject(),
						PartyIdentification8Choice.mmObject(), PartyIdentification44.mmObject(), PartyIdentification19Choice.mmObject(), PartyIdentification59.mmObject(), PartyIdentification73Choice.mmObject(),
						PartyIdentification60.mmObject(), PartyIdentificationAndAccount3.mmObject(), Party1Choice.mmObject(), PartyIdentification1.mmObject(), PartyIdentification9Choice.mmObject(), IssuerInformation1.mmObject(),
						PartyIdentification39.mmObject(), NameAndAddress9.mmObject(), PartyIdentification24Choice.mmObject(), PartyIdentification11Choice.mmObject(), PartyIdentificationAndAccount53.mmObject(),
						PartyIdentificationAndAccount55.mmObject(), PartyIdentificationAndAccount45.mmObject(), PartyIdentificationAndAccount48.mmObject(), PartyIdentificationAndAccount46.mmObject(),
						PartyIdentificationAndAccount47.mmObject(), PartyIdentification25.mmObject(), PartyIdentificationAndAccount6.mmObject(), PartyIdentificationAndContactInformation1.mmObject(), PartyIdentification45.mmObject(),
						PartyIdentification9.mmObject(), NameAndAddress6.mmObject(), PartyIdentification26.mmObject(), PartyIdentification27.mmObject(), PartyIdentification29Choice.mmObject(), PartyIdentification28.mmObject(),
						PartyIdentification33Choice.mmObject(), PartyIdentificationAndAccount69.mmObject(), PartyIdentificationAndAccount70.mmObject(), PartyIdentificationAndAccount71.mmObject(), PartyIdentificationAndAccount72.mmObject(),
						PartyIdentificationAndAccount73.mmObject(), PartyIdentificationAndAccount74.mmObject(), PartyIdentification66Choice.mmObject(), PartyIdentificationAndAccount76.mmObject(), PartyIdentification67Choice.mmObject(),
						IdentificationType6Choice.mmObject(), AlternatePartyIdentification4.mmObject(), PartyIdentificationAndAccount31.mmObject(), PartyIdentification34Choice.mmObject(), PartyIdentificationAndAccount32.mmObject(),
						Party13Choice.mmObject(), PartyIdentification58.mmObject(), PartyOrganisation1Choice.mmObject(), PartyIdentification14.mmObject(), PartyPrivate1.mmObject(), PartyIdentification11.mmObject(),
						PartyIdentification17.mmObject(), PartyIdentification12.mmObject(), Party5Choice.mmObject(), PartyIdentification19.mmObject(), PartyIdentification30.mmObject(), PartyIdentification18.mmObject(),
						PartyIdentification20.mmObject(), PartyIdentification31.mmObject(), PartyIdentification13.mmObject(), PartyIdentification16.mmObject(), NameAndAddress11.mmObject(), PartyIdentification26Choice.mmObject(),
						PartyIdentificationAndAccount13.mmObject(), PartyIdentification5.mmObject(), PartyIdentificationAndAccount7.mmObject(), PartyIdentification24.mmObject(), PartyIdentification72Choice.mmObject(),
						PartyIdentification71Choice.mmObject(), TechnicalIdentification1Choice.mmObject(), PartyIdentification25Choice.mmObject(), PartyRole2Choice.mmObject(), PartyIdentificationAndAccount95.mmObject(),
						PartyIdentificationAndAccount97.mmObject(), PartyIdentification62.mmObject(), PartyIdentificationAndAccount96.mmObject(), PartyIdentification63.mmObject(), PartyIdentification64.mmObject(),
						PartyIdentification75Choice.mmObject(), PartyIdentification83Choice.mmObject(), PartyIdentificationAndAccount100.mmObject(), PartyIdentificationAndAccount101.mmObject(), PartyRole4Choice.mmObject(),
						IssuerInformation2.mmObject(), PartyIdentification71.mmObject(), PartyIdentificationAndAccount102.mmObject(), PartyIdentification89Choice.mmObject(), PartyIdentification87Choice.mmObject(),
						PartyIdentification88Choice.mmObject(), PartyIdentificationAndAccount104.mmObject(), QualifiedPartyIdentification1.mmObject(), CounterpartyIdentification1Choice.mmObject(), CardTransactionEnvironment5.mmObject(),
						PartyIdentification90Choice.mmObject(), PartyIdentification92Choice.mmObject(), PartyIdentificationAndAccount106.mmObject(), PartyIdentification75.mmObject(), PartyIdentificationAndAccount112.mmObject(),
						AlternatePartyIdentification7.mmObject(), PartyIdentificationAndAccount111.mmObject(), PartyIdentificationAndAccount117.mmObject(), PartyIdentificationAndAccount107.mmObject(), IdentificationType42Choice.mmObject(),
						PartyIdentification76.mmObject(), PersonOrOrganisation1Choice.mmObject(), PersonOrOrganisation2Choice.mmObject(), PartyIdentification77.mmObject(), Party28Choice.mmObject(), PartyIdentification93Choice.mmObject(),
						PartyIdentification91.mmObject(), PartyIdentification93.mmObject(), PartyIdentificationAndAccount122.mmObject(), PartyIdentification92.mmObject(), PartyIdentification94Choice.mmObject(),
						PartyIdentificationAndAccount120.mmObject(), PartyIdentificationAndAccount121.mmObject(), Party29Choice.mmObject(), PartyIdentification94.mmObject(), PartyIdentification97Choice.mmObject(),
						PartyIdentification97.mmObject(), PartyIdentificationAndAccount124.mmObject(), PartyRole5Choice.mmObject(), PartyIdentification95.mmObject(), PartyIdentificationAndAccount123.mmObject(),
						PartyIdentification96Choice.mmObject(), PartyIdentification96.mmObject(), PartyIdentification99Choice.mmObject(), NameAndAddress15.mmObject(), PartyIdentification98.mmObject(), PartyIdentification100.mmObject(),
						PlaceOfClearingIdentification1.mmObject(), PlaceOfTradeIdentification1.mmObject(), SafeKeepingPlace1.mmObject(), PartyIdentification99.mmObject(), Pledgee1.mmObject(), PartyIdentification100Choice.mmObject(),
						PartyIdentificationAndAccount127.mmObject(), PartyIdentification102Choice.mmObject(), PartyIdentificationAndAccount126.mmObject(), PartyIdentification101Choice.mmObject(), AlternatePartyIdentification8.mmObject(),
						IdentificationType43Choice.mmObject(), PartyIdentification104Choice.mmObject(), PartyIdentification101.mmObject(), PartyIdentification111Choice.mmObject(), PartyIdentification102.mmObject(),
						IdentificationType44Choice.mmObject(), PartyIdentificationAndAccount129.mmObject(), PartyIdentificationAndAccount130.mmObject(), AlternatePartyIdentification9.mmObject(), PartyIdentification103Choice.mmObject(),
						PartyIdentification113Choice.mmObject(), PartyIdentificationAndAccount128.mmObject(), PartyIdentification108.mmObject(), PartyIdentificationAndAccount133.mmObject(), PartyIdentification103.mmObject(),
						PartyIdentificationAndAccount131.mmObject(), PartyIdentificationAndAccount146.mmObject(), PartyIdentificationAndAccount136.mmObject(), PartyIdentificationAndAccount134.mmObject(), PartyIdentification109.mmObject(),
						PartyIdentification111.mmObject(), PartyIdentification110.mmObject(), PartyIdentification115Choice.mmObject(), SafeKeepingPlace2.mmObject(), PartyIdentification114Choice.mmObject(),
						PlaceOfTradeIdentification2.mmObject(), Pledgee2.mmObject(), PartyIdentification95Choice.mmObject(), CounterpartyIdentification2Choice.mmObject(), PartyIdentification112.mmObject(),
						FinancialInstitutionIdentification12.mmObject(), PartyIdentification113.mmObject(), PartyIdentificationAndAccount147.mmObject(), PartyIdentification119.mmObject(), PartyIdentification120.mmObject(),
						CounterpartyIdentification3Choice.mmObject(), SettlementAgent1.mmObject(), ConcentrationAgent1.mmObject(), PartyIdentification118Choice.mmObject(), CoverTwoDefaulters1.mmObject(), PartyIdentification121.mmObject(),
						ClearingAccount1.mmObject(), MarginAccount1.mmObject(), PartyIdentification122.mmObject(), PartyIdentificationAndAccount157.mmObject(), PartyIdentification123.mmObject(), PartyIdentification124.mmObject(),
						PartyIdentification119Choice.mmObject(), PartyIdentificationAndAccount158.mmObject(), ProprietaryParty4.mmObject(), PartyIdentification125.mmObject(), Party34Choice.mmObject(),
						PartyIdentificationAndAccount159.mmObject(), PartyIdentification127.mmObject(), Party35Choice.mmObject(), PartyIdentification128.mmObject(), PartyIdentificationAndAccount160.mmObject(), Party36Choice.mmObject(),
						PartyIdentification129.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyIdentificationInformation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification getOtherIdentification() {
		return otherIdentification;
	}

	public PartyIdentificationInformation setOtherIdentification(GenericIdentification otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<Party> getIdentifiedParty() {
		return identifiedParty == null ? Optional.empty() : Optional.of(identifiedParty);
	}

	public PartyIdentificationInformation setIdentifiedParty(Party identifiedParty) {
		this.identifiedParty = identifiedParty;
		return this;
	}

	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public PartyIdentificationInformation setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = Objects.requireNonNull(taxIdentificationNumber);
		return this;
	}

	public Optional<Max35Text> getNationalRegistrationNumber() {
		return nationalRegistrationNumber == null ? Optional.empty() : Optional.of(nationalRegistrationNumber);
	}

	public PartyIdentificationInformation setNationalRegistrationNumber(Max35Text nationalRegistrationNumber) {
		this.nationalRegistrationNumber = nationalRegistrationNumber;
		return this;
	}

	public TypeOfIdentificationCode getTypeOfIdentification() {
		return typeOfIdentification;
	}

	public PartyIdentificationInformation setTypeOfIdentification(TypeOfIdentificationCode typeOfIdentification) {
		this.typeOfIdentification = Objects.requireNonNull(typeOfIdentification);
		return this;
	}

	public Optional<Max350Text> getDeclaration() {
		return declaration == null ? Optional.empty() : Optional.of(declaration);
	}

	public PartyIdentificationInformation setDeclaration(Max350Text declaration) {
		this.declaration = declaration;
		return this;
	}

	public PartyTypeCode getPartyType() {
		return partyType;
	}

	public PartyIdentificationInformation setPartyType(PartyTypeCode partyType) {
		this.partyType = Objects.requireNonNull(partyType);
		return this;
	}

	public List<PartyName> getPartyName() {
		return partyName == null ? partyName = new ArrayList<>() : partyName;
	}

	public PartyIdentificationInformation setPartyName(List<PartyName> partyName) {
		this.partyName = Objects.requireNonNull(partyName);
		return this;
	}

	public Optional<DateTimePeriod> getValidityPeriod() {
		return validityPeriod == null ? Optional.empty() : Optional.of(validityPeriod);
	}

	public PartyIdentificationInformation setValidityPeriod(DateTimePeriod validityPeriod) {
		this.validityPeriod = validityPeriod;
		return this;
	}

	public Market getIdentifiedMarket() {
		return identifiedMarket;
	}

	public PartyIdentificationInformation setIdentifiedMarket(Market identifiedMarket) {
		this.identifiedMarket = Objects.requireNonNull(identifiedMarket);
		return this;
	}

	public LEIIdentifier getLEI() {
		return lEI;
	}

	public PartyIdentificationInformation setLEI(LEIIdentifier lEI) {
		this.lEI = Objects.requireNonNull(lEI);
		return this;
	}
}