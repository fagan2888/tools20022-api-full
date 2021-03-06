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
import com.tools20022.repository.codeset.ClearingAccountTypeCode;
import com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesAccount" src="doc-files/SecuritiesAccount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesAccountType
 * SecuritiesAccount.mmSecuritiesAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedInvestmentAccount
 * SecuritiesAccount.mmRelatedInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedTransfer
 * SecuritiesAccount.mmRelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesPartyRole
 * SecuritiesAccount.mmSecuritiesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecurity
 * SecuritiesAccount.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedRegistrar
 * SecuritiesAccount.mmRelatedRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
 * SecuritiesAccount.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
 * SecuritiesAccount.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmCorporateActionServicing
 * SecuritiesAccount.mmCorporateActionServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedAllocation
 * SecuritiesAccount.mmRelatedAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesEntry
 * SecuritiesAccount.mmSecuritiesEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountOwner
 * SecuritiesAccount.mmClearingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmMarginAccountOwner
 * SecuritiesAccount.mmMarginAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDeliveryAccountOwner
 * SecuritiesAccount.mmDeliveryAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedPowerOfAttorney
 * SecuritiesAccount.mmRelatedPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedMeetingInstruction
 * SecuritiesAccount.mmRelatedMeetingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountType
 * SecuritiesAccount.mmClearingAccountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmRelatedOrder
 * SecuritiesAccount.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDisclosedListTrading
 * SecuritiesAccount.mmDisclosedListTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmAccountLink
 * SecuritiesAccount.mmAccountLink}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
 * Security.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSecuritiesAccount
 * InvestmentAccount.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
 * SecuritiesTransfer.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
 * ClearingMemberRole.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmMarginAccount
 * ClearingMemberRole.mmMarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
 * ClearingMemberRole.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecuritiesAccount
 * SecuritiesPartyRole.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesAccount
 * SecuritiesEntry.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmRelatedSecuritiesAccount
 * SafekeepingPlace.mmRelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
 * SecuritiesBalance.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegistrarRole#mmRegistrarAccount
 * RegistrarRole.mmRegistrarAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
 * CorporateActionServicing.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderingAccount
 * SecuritiesOrder.mmOrderingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocationAccount
 * Allocation.mmAllocationAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSafekeepingAccount
 * InstructionForMeeting.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedAccount
 * PowerOfAttorney.mmAuthorisedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountLink#mmSecuritiesAccount
 * AccountLink.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmDisclosedListTradingAccount
 * DisclosedListTrading.mmDisclosedListTradingAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount16#mmSafekeepingAccount
 * PartyIdentificationAndAccount16.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount44#mmSafekeepingAccount
 * PartyIdentificationAndAccount44.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount1#mmSafekeepingAccount
 * PartyIdentificationAndAccount1.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount42#mmSafekeepingAccount
 * PartyIdentificationAndAccount42.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount19#mmSafekeepingAccount
 * PartyIdentificationAndAccount19.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount21#mmSafekeepingAccount
 * PartyIdentificationAndAccount21.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount40#mmSafekeepingAccount
 * PartyIdentificationAndAccount40.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount41#mmSafekeepingAccount
 * PartyIdentificationAndAccount41.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount81#mmSafekeepingAccount
 * PartyIdentificationAndAccount81.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#mmSafekeepingAccount
 * QuantityAndAccount30.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount43#mmSafekeepingAccount
 * PartyIdentificationAndAccount43.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount68#mmSafekeepingAccount
 * PartyIdentificationAndAccount68.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount75#mmSafekeepingAccount
 * PartyIdentificationAndAccount75.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount63#mmSafekeepingAccount
 * PartyIdentificationAndAccount63.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount88#mmSafekeepingAccount
 * PartyIdentificationAndAccount88.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount66#mmSafekeepingAccount
 * PartyIdentificationAndAccount66.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#mmSafekeepingAccount
 * QuantityAndAccount33.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification9#mmSafekeepingAccount
 * AccountIdentification9.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification14#mmSafekeepingAccount
 * AccountIdentification14.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification15#mmSafekeepingAccount
 * AccountIdentification15.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification21#mmSafekeepingAccount
 * AccountIdentification21.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance2#mmSafekeepingAccount
 * AccountAndBalance2.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance5#mmSafekeepingAccount
 * AccountAndBalance5.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance10#mmSafekeepingAccount
 * AccountAndBalance10.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance12#mmSafekeepingAccount
 * AccountAndBalance12.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance17#mmSafekeepingAccount
 * AccountAndBalance17.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance20#mmSafekeepingAccount
 * AccountAndBalance20.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification8#mmSafekeepingAccount
 * AccountIdentification8.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification17#mmSafekeepingAccount
 * AccountIdentification17.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification19#mmSafekeepingAccount
 * AccountIdentification19.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification6#mmSafekeepingAccount
 * AccountIdentification6.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification12#mmSafekeepingAccount
 * AccountIdentification12.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification16#mmSafekeepingAccount
 * AccountIdentification16.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification22#mmSafekeepingAccount
 * AccountIdentification22.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification23#mmSafekeepingAccount
 * AccountIdentification23.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification24#mmSafekeepingAccount
 * AccountIdentification24.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification25#mmSafekeepingAccount
 * AccountIdentification25.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#mmSafekeepingAccount
 * AccountIdentification29.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance3#mmSafekeepingAccount
 * AccountAndBalance3.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount14#mmSafekeepingAccount
 * PartyIdentificationAndAccount14.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance6#mmSafekeepingAccount
 * AccountAndBalance6.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount22#mmSafekeepingAccount
 * PartyIdentificationAndAccount22.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance11#mmSafekeepingAccount
 * AccountAndBalance11.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount51#mmSafekeepingAccount
 * PartyIdentificationAndAccount51.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance13#mmSafekeepingAccount
 * AccountAndBalance13.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount56#mmSafekeepingAccount
 * PartyIdentificationAndAccount56.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance16#mmSafekeepingAccount
 * AccountAndBalance16.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance19#mmSafekeepingAccount
 * AccountAndBalance19.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance22#mmSafekeepingAccount
 * AccountAndBalance22.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance23#mmSafekeepingAccount
 * AccountAndBalance23.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance1#mmSafekeepingAccount
 * AccountAndBalance1.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification7Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification7Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance7#mmSafekeepingAccount
 * AccountAndBalance7.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification8Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification8Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance9#mmSafekeepingAccount
 * AccountAndBalance9.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification12Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification12Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance14#mmSafekeepingAccount
 * AccountAndBalance14.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification15Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification15Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance15#mmSafekeepingAccount
 * AccountAndBalance15.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification18Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification18Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance18#mmSafekeepingAccount
 * AccountAndBalance18.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification19Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification19Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance21#mmSafekeepingAccount
 * AccountAndBalance21.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification21Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification21Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance24#mmSafekeepingAccount
 * AccountAndBalance24.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification22Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification22Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance4#mmSafekeepingAccount
 * AccountAndBalance4.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance8#mmSafekeepingAccount
 * AccountAndBalance8.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification10#mmSafekeepingAccount
 * SubAccountIdentification10.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification13#mmSafekeepingAccount
 * SubAccountIdentification13.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification16#mmSafekeepingAccount
 * SubAccountIdentification16.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification20#mmSafekeepingAccount
 * SubAccountIdentification20.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification23#mmSafekeepingAccount
 * SubAccountIdentification23.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification26#mmSafekeepingAccount
 * SubAccountIdentification26.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification29#mmSafekeepingAccount
 * SubAccountIdentification29.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification31#mmSafekeepingAccount
 * SubAccountIdentification31.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification11#mmSafekeepingAccount
 * SubAccountIdentification11.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification12#mmSafekeepingAccount
 * SubAccountIdentification12.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification17#mmSafekeepingAccount
 * SubAccountIdentification17.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification19#mmSafekeepingAccount
 * SubAccountIdentification19.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification22#mmSafekeepingAccount
 * SubAccountIdentification22.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification25#mmSafekeepingAccount
 * SubAccountIdentification25.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification28#mmSafekeepingAccount
 * SubAccountIdentification28.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification32#mmSafekeepingAccount
 * SubAccountIdentification32.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#mmSafekeepingAccount
 * QuantityAndAccount6.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#mmSafekeepingAccount
 * QuantityAndAccount11.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount26#mmSafekeepingAccount
 * PartyIdentificationAndAccount26.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount28#mmSafekeepingAccount
 * PartyIdentificationAndAccount28.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount30#mmSafekeepingAccount
 * PartyIdentificationAndAccount30.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#mmSafekeepingAccount
 * QuantityAndAccount18.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount35#mmSafekeepingAccount
 * PartyIdentificationAndAccount35.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount36#mmSafekeepingAccount
 * PartyIdentificationAndAccount36.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount37#mmSafekeepingAccount
 * PartyIdentificationAndAccount37.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#mmSafekeepingAccount
 * QuantityAndAccount19.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount49#mmSafekeepingAccount
 * PartyIdentificationAndAccount49.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount61#mmSafekeepingAccount
 * PartyIdentificationAndAccount61.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount62#mmSafekeepingAccount
 * PartyIdentificationAndAccount62.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#mmSafekeepingAccount
 * QuantityAndAccount1.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#mmSafekeepingAccount
 * QuantityAndAccount5.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#mmSafekeepingAccount
 * QuantityAndAccount17.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#mmSafekeepingAccount
 * QuantityAndAccount24.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#mmSafekeepingAccount
 * QuantityAndAccount25.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#mmSafekeepingAccount
 * QuantityAndAccount34.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount25#mmSafekeepingAccount
 * PartyIdentificationAndAccount25.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmSafekeepingAccount
 * QuantityAndAccount2.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmSafekeepingAccount
 * QuantityAndAccount12.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmSafekeepingAccount
 * QuantityAndAccount15.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmSafekeepingAccount
 * QuantityAndAccount20.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount65#mmSafekeepingAccount
 * PartyIdentificationAndAccount65.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount67#mmSafekeepingAccount
 * PartyIdentificationAndAccount67.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmSafekeepingAccount
 * QuantityAndAccount28.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmSafekeepingAccount
 * QuantityAndAccount37.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification9#mmSafekeepingAccount
 * SubAccountIdentification9.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification14#mmSafekeepingAccount
 * SubAccountIdentification14.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification15#mmSafekeepingAccount
 * SubAccountIdentification15.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification18#mmSafekeepingAccount
 * SubAccountIdentification18.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification21#mmSafekeepingAccount
 * SubAccountIdentification21.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification24#mmSafekeepingAccount
 * SubAccountIdentification24.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification30#mmSafekeepingAccount
 * SubAccountIdentification30.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification33#mmSafekeepingAccount
 * SubAccountIdentification33.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount9#mmSafekeepingAccount
 * PartyIdentificationAndAccount9.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79#mmSafekeepingAccount
 * PartyIdentificationAndAccount79.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount83#mmSafekeepingAccount
 * PartyIdentificationAndAccount83.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount77#mmSafekeepingAccount
 * PartyIdentificationAndAccount77.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails4#mmSafekeepingAccount
 * ConfirmationPartyDetails4.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary14#mmSafekeepingDetails
 * Intermediary14.mmSafekeepingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3#mmSafekeepingAccount
 * ConfirmationPartyDetails3.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount10#mmSafekeepingAccount
 * PartyIdentificationAndAccount10.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount8#mmSafekeepingAccount
 * PartyIdentificationAndAccount8.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6#mmSafekeepingAccount
 * ConfirmationPartyDetails6.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount34#mmSafekeepingAccount
 * PartyIdentificationAndAccount34.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityMovement1#mmAccountDetails
 * SecurityMovement1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesProceeds1#mmAccountDetails
 * SecuritiesProceeds1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1#mmAccountDetails
 * CorporateActionStandingInstructionGeneralInformation1.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1#mmSecuritiesDistributionDetails
 * CorporateActionStandingInstruction1.mmSecuritiesDistributionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount7#mmSafekeepingAccount
 * QuantityAndAccount7.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16#mmSafekeepingAccount
 * QuantityAndAccount16.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails2.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails8.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#mmSafekeepingAccount
 * QuantityAndAccount3.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#mmSafekeepingAccount
 * QuantityAndAccount13.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45#mmSafekeepingAccount
 * PartyIdentificationAndAccount45.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount46#mmSafekeepingAccount
 * PartyIdentificationAndAccount46.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount47#mmSafekeepingAccount
 * PartyIdentificationAndAccount47.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification7#mmSafekeepingAccount
 * AccountIdentification7.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification13#mmSafekeepingAccount
 * AccountIdentification13.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification18#mmSafekeepingAccount
 * AccountIdentification18.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification20#mmSafekeepingAccount
 * AccountIdentification20.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount10#mmSafekeepingAccount
 * QuantityAndAccount10.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount21#mmSafekeepingAccount
 * QuantityAndAccount21.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails6.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails10.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails17.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails18.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#mmSafekeepingAccount
 * QuantityAndAccount4.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#mmSafekeepingAccount
 * QuantityAndAccount22.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#mmSafekeepingAccount
 * QuantityAndAccount27.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#mmSafekeepingAccount
 * QuantityAndAccount36.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount71#mmSafekeepingAccount
 * PartyIdentificationAndAccount71.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount73#mmSafekeepingAccount
 * PartyIdentificationAndAccount73.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount74#mmSafekeepingAccount
 * PartyIdentificationAndAccount74.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount76#mmSafekeepingAccount
 * PartyIdentificationAndAccount76.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmSubAccount
 * SecuritiesAccount21.mmSubAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport1#mmMarginAccount
 * MarginReport1.mmMarginAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginReport2#mmMarginAccount
 * MarginReport2.mmMarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification11#mmSafekeepingAccount
 * AccountIdentification11.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount1Choice#mmAccount
 * SecuritiesAccount1Choice.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification27#mmSafekeepingAccount
 * SubAccountIdentification27.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification7#mmSafekeepingAccount
 * SubaccountIdentification7.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubaccountIdentification8#mmSafekeepingAccount
 * SubaccountIdentification8.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification20Choice#mmSecuritiesAccountIdentification
 * AccountIdentification20Choice.mmSecuritiesAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification34#mmSafekeepingAccount
 * SubAccountIdentification34.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails21.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification23Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification23Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance26#mmSafekeepingAccount
 * AccountAndBalance26.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance25#mmSafekeepingAccount
 * AccountAndBalance25.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount95#mmAccountIdentification
 * PartyIdentificationAndAccount95.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance32#mmSafekeepingAccount
 * AccountAndBalance32.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification26Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification26Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance29#mmSafekeepingAccount
 * AccountAndBalance29.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification35#mmSafekeepingAccount
 * SubAccountIdentification35.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails22.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAccountIdentification
 * SafekeepingAccount5.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAccountSubLevel1
 * SafekeepingAccount5.mmAccountSubLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel1#mmAccountSubLevel2
 * AccountSubLevel1.mmAccountSubLevel2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel4#mmAccountSubLevel5
 * AccountSubLevel4.mmAccountSubLevel5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel5#mmAccountSubLevel6
 * AccountSubLevel5.mmAccountSubLevel6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel2#mmAccountSubLevel3
 * AccountSubLevel2.mmAccountSubLevel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel3#mmAccountSubLevel4
 * AccountSubLevel3.mmAccountSubLevel4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel6#mmAccountSubLevel7
 * AccountSubLevel6.mmAccountSubLevel7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel7#mmAccountSubLevel8
 * AccountSubLevel7.mmAccountSubLevel8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmAccountSubLevel9
 * AccountSubLevel8.mmAccountSubLevel9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails24.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification38#mmSafekeepingAccount
 * SubAccountIdentification38.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification37#mmSafekeepingAccount
 * SubAccountIdentification37.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100#mmSafekeepingAccount
 * PartyIdentificationAndAccount100.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReportItem1#mmAccountIdentification
 * ReportItem1.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification40#mmSafekeepingAccount
 * SubAccountIdentification40.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails25.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification39#mmSafekeepingAccount
 * SubAccountIdentification39.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#mmSafekeepingAccount
 * QuantityAndAccount39.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification42#mmSafekeepingAccount
 * SubAccountIdentification42.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmSafekeepingAccount
 * QuantityAndAccount41.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification44#mmSafekeepingAccount
 * SubAccountIdentification44.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmSafekeepingAccount
 * QuantityAndAccount40.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#mmSafekeepingAccount
 * QuantityAndAccount42.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#mmSafekeepingAccount
 * QuantityAndAccount38.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails26.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#mmSafekeepingAccount
 * SubAccountIdentification43.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount106#mmSafekeepingAccount
 * PartyIdentificationAndAccount106.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#mmSafekeepingAccount
 * QuantityAndAccount43.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount117#mmSafekeepingAccount
 * PartyIdentificationAndAccount117.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount108#mmSafekeepingAccount
 * PartyIdentificationAndAccount108.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount107#mmSafekeepingAccount
 * PartyIdentificationAndAccount107.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#mmSafekeepingAccount
 * AccountAndBalance34.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#mmSafekeepingAccount
 * AccountAndBalance35.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance36#mmSafekeepingAccount
 * AccountAndBalance36.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification33#mmSafekeepingAccount
 * AccountIdentification33.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification32Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification32Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification31#mmSafekeepingAccount
 * AccountIdentification31.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount122#mmSafekeepingAccount
 * PartyIdentificationAndAccount122.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#mmSafekeepingAccount
 * AccountAndBalance33.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#mmSafekeepingAccount
 * AccountIdentification32.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127#mmSafekeepingAccount
 * PartyIdentificationAndAccount127.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance40#mmSafekeepingAccount
 * AccountAndBalance40.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance38#mmSafekeepingAccount
 * AccountAndBalance38.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification36Choice#mmAccountsListAndBalanceDetails
 * AccountIdentification36Choice.mmAccountsListAndBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification35#mmSafekeepingAccount
 * AccountIdentification35.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance37#mmSafekeepingAccount
 * AccountAndBalance37.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification34#mmSafekeepingAccount
 * AccountIdentification34.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification37#mmSafekeepingAccount
 * AccountIdentification37.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance39#mmSafekeepingAccount
 * AccountAndBalance39.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128#mmSafekeepingAccount
 * PartyIdentificationAndAccount128.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification47#mmSafekeepingAccount
 * SubAccountIdentification47.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#mmSafekeepingAccount
 * QuantityAndAccount47.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails33.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification45#mmSafekeepingAccount
 * SubAccountIdentification45.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount48#mmSafekeepingAccount
 * QuantityAndAccount48.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#mmSafekeepingAccount
 * QuantityAndAccount46.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification46#mmSafekeepingAccount
 * SubAccountIdentification46.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmSafekeepingAccount
 * QuantityAndAccount51.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#mmSafekeepingAccount
 * QuantityAndAccount49.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount131#mmSafekeepingAccount
 * PartyIdentificationAndAccount131.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount146#mmSafekeepingAccount
 * PartyIdentificationAndAccount146.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount135#mmSafekeepingAccount
 * PartyIdentificationAndAccount135.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount136#mmSafekeepingAccount
 * PartyIdentificationAndAccount136.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#mmSafekeepingAccount
 * QuantityAndAccount55.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification39#mmSafekeepingAccount
 * AccountIdentification39.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification38Choice#mmSecuritiesAccountIdentification
 * AccountIdentification38Choice.mmSecuritiesAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount2Choice#mmAccount
 * SecuritiesAccount2Choice.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification48#mmSafekeepingAccount
 * SubAccountIdentification48.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountIdentification
 * SafekeepingAccount7.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7#mmAccountSubLevel1
 * SafekeepingAccount7.mmAccountSubLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountSubLevel6
 * AccountSubLevel15.mmAccountSubLevel6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel16#mmAccountSubLevel7
 * AccountSubLevel16.mmAccountSubLevel7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel18#mmAccountSubLevel9
 * AccountSubLevel18.mmAccountSubLevel9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel11#mmAccountSubLevel2
 * AccountSubLevel11.mmAccountSubLevel2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel12#mmAccountSubLevel3
 * AccountSubLevel12.mmAccountSubLevel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel17#mmAccountSubLevel8
 * AccountSubLevel17.mmAccountSubLevel8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountSubLevel4
 * AccountSubLevel13.mmAccountSubLevel4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel14#mmAccountSubLevel5
 * AccountSubLevel14.mmAccountSubLevel5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification40#mmSafekeepingAccount
 * AccountIdentification40.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification49#mmSafekeepingAccount
 * SubAccountIdentification49.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails35.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification50#mmSafekeepingAccount
 * SubAccountIdentification50.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification41#mmSafekeepingAccount
 * AccountIdentification41.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmSafekeepingAccount
 * SecuritiesFinancingTransactionDetails36.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmSafekeepingAccount
 * QuantityAndAccount57.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#mmSafekeepingAccount
 * QuantityAndAccount58.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#mmSafekeepingAccount
 * QuantityAndAccount56.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount61#mmSafekeepingAccount
 * QuantityAndAccount61.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#mmSafekeepingAccount
 * QuantityAndAccount62.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#mmSafekeepingAccount
 * QuantityAndAccount60.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification42#mmSafekeepingAccount
 * AccountIdentification42.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification51#mmSafekeepingAccount
 * SubAccountIdentification51.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount64#mmSafekeepingAccount
 * QuantityAndAccount64.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63#mmSafekeepingAccount
 * QuantityAndAccount63.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount159#mmSafekeepingAccount
 * PartyIdentificationAndAccount159.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount65#mmSafekeepingAccount
 * QuantityAndAccount65.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount68#mmSafekeepingAccount
 * QuantityAndAccount68.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification43#mmSafekeepingAccount
 * AccountIdentification43.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification44#mmSafekeepingAccount
 * AccountIdentification44.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount160#mmSafekeepingAccount
 * PartyIdentificationAndAccount160.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount69#mmSafekeepingAccount
 * QuantityAndAccount69.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount70#mmSafekeepingAccount
 * QuantityAndAccount70.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount72#mmSafekeepingAccount
 * QuantityAndAccount72.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount76#mmSafekeepingAccount
 * QuantityAndAccount76.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification52#mmSafekeepingAccount
 * SubAccountIdentification52.mmSafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount1
 * SecuritiesAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount4
 * SecuritiesAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13
 * SecuritiesAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount17
 * SecuritiesAccount17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance2
 * AccountAndBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance5
 * AccountAndBalance5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance10
 * AccountAndBalance10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance12
 * AccountAndBalance12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance17
 * AccountAndBalance17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance20
 * AccountAndBalance20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance3
 * AccountAndBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance6
 * AccountAndBalance6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance11
 * AccountAndBalance11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance13
 * AccountAndBalance13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance16
 * AccountAndBalance16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance19
 * AccountAndBalance19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance22
 * AccountAndBalance22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance23
 * AccountAndBalance23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance1
 * AccountAndBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance7
 * AccountAndBalance7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance9
 * AccountAndBalance9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance14
 * AccountAndBalance14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance15
 * AccountAndBalance15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance18
 * AccountAndBalance18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance21
 * AccountAndBalance21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance24
 * AccountAndBalance24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance4
 * AccountAndBalance4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance8
 * AccountAndBalance8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode1Choice
 * PurposeCode1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount11
 * SecuritiesAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount2
 * SecuritiesAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode2Choice
 * PurposeCode2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount14
 * SecuritiesAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode3Choice
 * PurposeCode3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount15
 * SecuritiesAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode4Choice
 * PurposeCode4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount16
 * SecuritiesAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount1
 * SafekeepingAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount2
 * SafekeepingAccount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification29
 * SubAccountIdentification29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification31
 * SubAccountIdentification31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification28
 * SubAccountIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification32
 * SubAccountIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification30
 * SubAccountIdentification30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification33
 * SubAccountIdentification33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount20
 * SecuritiesAccount20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode5Choice
 * PurposeCode5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount3
 * SecuritiesAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount3
 * SafekeepingAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount4
 * SafekeepingAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount7
 * SecuritiesAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount9
 * SecuritiesAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount12
 * SecuritiesAccount12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount8
 * SecuritiesAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount10
 * SecuritiesAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IncludedAccount1
 * IncludedAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount6
 * SecuritiesAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount21
 * SecuritiesAccount21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19
 * SecuritiesAccount19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount18
 * SecuritiesAccount18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount5
 * SecuritiesAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SecuritiesAccount1Choice
 * SecuritiesAccount1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification34
 * SubAccountIdentification34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance26
 * AccountAndBalance26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance25
 * AccountAndBalance25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22
 * SecuritiesAccount22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance32
 * AccountAndBalance32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance29
 * AccountAndBalance29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification35
 * SubAccountIdentification35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount5
 * SafekeepingAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel1
 * AccountSubLevel1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel4
 * AccountSubLevel4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel5
 * AccountSubLevel5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel2
 * AccountSubLevel2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel3
 * AccountSubLevel3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel6
 * AccountSubLevel6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel7
 * AccountSubLevel7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel8
 * AccountSubLevel8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel9
 * AccountSubLevel9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification38
 * SubAccountIdentification38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification37
 * SubAccountIdentification37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount6
 * SafekeepingAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification40
 * SubAccountIdentification40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification39
 * SubAccountIdentification39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24
 * SecuritiesAccount24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification42
 * SubAccountIdentification42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification44
 * SubAccountIdentification44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification43
 * SubAccountIdentification43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount26
 * SecuritiesAccount26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount25
 * SecuritiesAccount25}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode7Choice
 * PurposeCode7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance34
 * AccountAndBalance34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance35
 * AccountAndBalance35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance36
 * AccountAndBalance36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance33
 * AccountAndBalance33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance40
 * AccountAndBalance40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance38
 * AccountAndBalance38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance37
 * AccountAndBalance37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndBalance39
 * AccountAndBalance39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification47
 * SubAccountIdentification47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount33
 * SecuritiesAccount33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification45
 * SubAccountIdentification45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification46
 * SubAccountIdentification46}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount27
 * SecuritiesAccount27}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeCode8Choice
 * PurposeCode8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount30
 * SecuritiesAccount30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount34
 * SecuritiesAccount34}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SecuritiesAccount2Choice
 * SecuritiesAccount2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount7
 * SafekeepingAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel15
 * AccountSubLevel15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel16
 * AccountSubLevel16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel18
 * AccountSubLevel18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel19
 * AccountSubLevel19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel11
 * AccountSubLevel11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel12
 * AccountSubLevel12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel17
 * AccountSubLevel17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel13
 * AccountSubLevel13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel14
 * AccountSubLevel14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification49
 * SubAccountIdentification49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification50
 * SubAccountIdentification50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification51
 * SubAccountIdentification51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubAccountIdentification52
 * SubAccountIdentification52}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a securities entry is made."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesAccountPurposeTypeCode securitiesAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode
	 * SecuritiesAccountPurposeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndPurpose#mmPurpose
	 * AccountIdentificationAndPurpose.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount13#mmType
	 * SecuritiesAccount13.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount17#mmType
	 * SecuritiesAccount17.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode1Choice#mmCode
	 * PurposeCode1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode1Choice#mmProprietary
	 * PurposeCode1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount11#mmType
	 * SecuritiesAccount11.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount2#mmType
	 * SecuritiesAccount2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode2Choice#mmCode
	 * PurposeCode2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode2Choice#mmProprietary
	 * PurposeCode2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount14#mmType
	 * SecuritiesAccount14.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode3Choice#mmCode
	 * PurposeCode3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode3Choice#mmProprietary
	 * PurposeCode3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount15#mmType
	 * SecuritiesAccount15.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode4Choice#mmCode
	 * PurposeCode4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode4Choice#mmProprietary
	 * PurposeCode4Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount16#mmType
	 * SecuritiesAccount16.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount20#mmType
	 * SecuritiesAccount20.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode5Choice#mmCode
	 * PurposeCode5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode5Choice#mmProprietary
	 * PurposeCode5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount3#mmType
	 * SecuritiesAccount3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmType
	 * SecuritiesAccount19.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount18#mmType
	 * SecuritiesAccount18.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount22#mmType
	 * SecuritiesAccount22.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount24#mmType
	 * SecuritiesAccount24.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount26#mmType
	 * SecuritiesAccount26.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount25#mmType
	 * SecuritiesAccount25.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode7Choice#mmCode
	 * PurposeCode7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode7Choice#mmProprietary
	 * PurposeCode7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount33#mmType
	 * SecuritiesAccount33.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount27#mmType
	 * SecuritiesAccount27.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode8Choice#mmCode
	 * PurposeCode8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeCode8Choice#mmProprietary
	 * PurposeCode8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount30#mmType
	 * SecuritiesAccount30.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount34#mmType
	 * SecuritiesAccount34.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesAccount, SecuritiesAccountPurposeTypeCode> mmSecuritiesAccountType = new MMBusinessAttribute<SecuritiesAccount, SecuritiesAccountPurposeTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentificationAndPurpose.mmPurpose, SecuritiesAccount13.mmType, SecuritiesAccount17.mmType, PurposeCode1Choice.mmCode, PurposeCode1Choice.mmProprietary, SecuritiesAccount11.mmType,
					SecuritiesAccount2.mmType, PurposeCode2Choice.mmCode, PurposeCode2Choice.mmProprietary, SecuritiesAccount14.mmType, PurposeCode3Choice.mmCode, PurposeCode3Choice.mmProprietary, SecuritiesAccount15.mmType,
					PurposeCode4Choice.mmCode, PurposeCode4Choice.mmProprietary, SecuritiesAccount16.mmType, SecuritiesAccount20.mmType, PurposeCode5Choice.mmCode, PurposeCode5Choice.mmProprietary, SecuritiesAccount3.mmType,
					SecuritiesAccount19.mmType, SecuritiesAccount18.mmType, SecuritiesAccount22.mmType, SecuritiesAccount24.mmType, SecuritiesAccount26.mmType, SecuritiesAccount25.mmType, PurposeCode7Choice.mmCode,
					PurposeCode7Choice.mmProprietary, SecuritiesAccount33.mmType, SecuritiesAccount27.mmType, PurposeCode8Choice.mmCode, PurposeCode8Choice.mmProprietary, SecuritiesAccount30.mmType, SecuritiesAccount34.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccountType";
			definition = "Specifies the type of securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
		}

		@Override
		public SecuritiesAccountPurposeTypeCode getValue(SecuritiesAccount obj) {
			return obj.getSecuritiesAccountType();
		}

		@Override
		public void setValue(SecuritiesAccount obj, SecuritiesAccountPurposeTypeCode value) {
			obj.setSecuritiesAccountType(value);
		}
	};
	protected InvestmentAccount relatedInvestmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSecuritiesAccount
	 * InvestmentAccount.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account which contains a securities account to make securities movements."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, InvestmentAccount> mmRelatedInvestmentAccount = new MMBusinessAssociationEnd<SecuritiesAccount, InvestmentAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account which contains a securities account to make securities movements.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentAccount.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}

		@Override
		public InvestmentAccount getValue(SecuritiesAccount obj) {
			return obj.getRelatedInvestmentAccount();
		}

		@Override
		public void setValue(SecuritiesAccount obj, InvestmentAccount value) {
			obj.setRelatedInvestmentAccount(value);
		}
	};
	protected List<SecuritiesTransfer> relatedTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmAccount
	 * SecuritiesTransfer.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the process which moves securities out of an account to another one."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesTransfer>> mmRelatedTransfer = new MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesTransfer>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransfer";
			definition = "Specifies the process which moves securities out of an account to another one.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTransfer.mmAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}

		@Override
		public List<SecuritiesTransfer> getValue(SecuritiesAccount obj) {
			return obj.getRelatedTransfer();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<SecuritiesTransfer> value) {
			obj.setRelatedTransfer(value);
		}
	};
	protected SecuritiesPartyRole securitiesPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecuritiesAccount
	 * SecuritiesPartyRole.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role which uses a securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, com.tools20022.repository.entity.SecuritiesPartyRole> mmSecuritiesPartyRole = new MMBusinessAssociationEnd<SecuritiesAccount, com.tools20022.repository.entity.SecuritiesPartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.SecuritiesPartyRole getValue(SecuritiesAccount obj) {
			return obj.getSecuritiesPartyRole();
		}

		@Override
		public void setValue(SecuritiesAccount obj, com.tools20022.repository.entity.SecuritiesPartyRole value) {
			obj.setSecuritiesPartyRole(value);
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification9#mmFinancialInstrumentDetails
	 * SubAccountIdentification9.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification14#mmFinancialInstrumentDetails
	 * SubAccountIdentification14.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification15#mmFinancialInstrumentDetails
	 * SubAccountIdentification15.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification18#mmFinancialInstrumentDetails
	 * SubAccountIdentification18.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification21#mmFinancialInstrumentDetails
	 * SubAccountIdentification21.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification24#mmFinancialInstrumentDetails
	 * SubAccountIdentification24.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification30#mmFinancialInstrumentDetails
	 * SubAccountIdentification30.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification33#mmFinancialInstrumentDetails
	 * SubAccountIdentification33.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification34#mmFinancialInstrumentDetails
	 * SubAccountIdentification34.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification35#mmFinancialInstrumentDetails
	 * SubAccountIdentification35.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification44#mmFinancialInstrumentDetails
	 * SubAccountIdentification44.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification47#mmFinancialInstrumentDetails
	 * SubAccountIdentification47.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification49#mmFinancialInstrumentDetails
	 * SubAccountIdentification49.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification50#mmFinancialInstrumentDetails
	 * SubAccountIdentification50.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification51#mmFinancialInstrumentDetails
	 * SubAccountIdentification51.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification52#mmFinancialInstrumentDetails
	 * SubAccountIdentification52.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is held on the securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesAccount, List<Security>>() {
		{
			derivation_lazy = () -> Arrays.asList(SubAccountIdentification9.mmFinancialInstrumentDetails, SubAccountIdentification14.mmFinancialInstrumentDetails, SubAccountIdentification15.mmFinancialInstrumentDetails,
					SubAccountIdentification18.mmFinancialInstrumentDetails, SubAccountIdentification21.mmFinancialInstrumentDetails, SubAccountIdentification24.mmFinancialInstrumentDetails,
					SubAccountIdentification30.mmFinancialInstrumentDetails, SubAccountIdentification33.mmFinancialInstrumentDetails, SubAccountIdentification34.mmFinancialInstrumentDetails,
					SubAccountIdentification35.mmFinancialInstrumentDetails, SubAccountIdentification44.mmFinancialInstrumentDetails, SubAccountIdentification47.mmFinancialInstrumentDetails,
					SubAccountIdentification49.mmFinancialInstrumentDetails, SubAccountIdentification50.mmFinancialInstrumentDetails, SubAccountIdentification51.mmFinancialInstrumentDetails,
					SubAccountIdentification52.mmFinancialInstrumentDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is held on the securities account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}

		@Override
		public List<Security> getValue(SecuritiesAccount obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<Security> value) {
			obj.setSecurity(value);
		}
	};
	protected RegistrarRole relatedRegistrar;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegistrarRole
	 * RegistrarRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegistrarRole#mmRegistrarAccount
	 * RegistrarRole.mmRegistrarAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the financial instruments are registered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<RegistrarRole>> mmRelatedRegistrar = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<RegistrarRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRegistrar";
			definition = "Specifies where the financial instruments are registered.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> RegistrarRole.mmRegistrarAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegistrarRole.mmObject();
		}

		@Override
		public Optional<RegistrarRole> getValue(SecuritiesAccount obj) {
			return obj.getRelatedRegistrar();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<RegistrarRole> value) {
			obj.setRelatedRegistrar(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmRelatedSecuritiesAccount
	 * SafekeepingPlace.mmRelatedSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification9#mmSafekeepingPlace
	 * AccountIdentification9.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification14#mmSafekeepingPlace
	 * AccountIdentification14.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification15#mmSafekeepingPlace
	 * AccountIdentification15.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification21#mmSafekeepingPlace
	 * AccountIdentification21.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification8#mmSafekeepingPlace
	 * AccountIdentification8.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification17#mmSafekeepingPlace
	 * AccountIdentification17.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification19#mmSafekeepingPlace
	 * AccountIdentification19.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification6#mmSafekeepingPlace
	 * AccountIdentification6.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification12#mmSafekeepingPlace
	 * AccountIdentification12.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification16#mmSafekeepingPlace
	 * AccountIdentification16.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification22#mmSafekeepingPlace
	 * AccountIdentification22.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification23#mmSafekeepingPlace
	 * AccountIdentification23.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification24#mmSafekeepingPlace
	 * AccountIdentification24.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification7#mmSafekeepingPlace
	 * AccountIdentification7.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification13#mmSafekeepingPlace
	 * AccountIdentification13.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification18#mmSafekeepingPlace
	 * AccountIdentification18.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification20#mmSafekeepingPlace
	 * AccountIdentification20.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification11#mmSafekeepingPlace
	 * AccountIdentification11.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmSafekeepingPlace
	 * TradeLeg8.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmSafekeepingPlace
	 * SettlementObligation7.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmSafekeepingPlace
	 * TradeLeg10.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmSafekeepingPlace
	 * TradeLeg9.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSafekeepingPlace
	 * SettlementObligation8.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification31#mmSafekeepingPlace
	 * AccountIdentification31.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#mmSafekeepingPlace
	 * AccountIdentification32.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification34#mmSafekeepingPlace
	 * AccountIdentification34.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification37#mmSafekeepingPlace
	 * AccountIdentification37.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification39#mmSafekeepingPlace
	 * AccountIdentification39.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification42#mmSafekeepingPlace
	 * AccountIdentification42.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location where the financial instruments are safekept."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<SafekeepingPlace>> mmSafekeepingPlace = new MMBusinessAssociationEnd<SecuritiesAccount, List<SafekeepingPlace>>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountIdentification9.mmSafekeepingPlace, AccountIdentification14.mmSafekeepingPlace, AccountIdentification15.mmSafekeepingPlace, AccountIdentification21.mmSafekeepingPlace,
					AccountIdentification8.mmSafekeepingPlace, AccountIdentification17.mmSafekeepingPlace, AccountIdentification19.mmSafekeepingPlace, AccountIdentification6.mmSafekeepingPlace, AccountIdentification12.mmSafekeepingPlace,
					AccountIdentification16.mmSafekeepingPlace, AccountIdentification22.mmSafekeepingPlace, AccountIdentification23.mmSafekeepingPlace, AccountIdentification24.mmSafekeepingPlace, AccountIdentification7.mmSafekeepingPlace,
					AccountIdentification13.mmSafekeepingPlace, AccountIdentification18.mmSafekeepingPlace, AccountIdentification20.mmSafekeepingPlace, AccountIdentification11.mmSafekeepingPlace, TradeLeg8.mmSafekeepingPlace,
					SettlementObligation7.mmSafekeepingPlace, TradeLeg10.mmSafekeepingPlace, TradeLeg9.mmSafekeepingPlace, SettlementObligation8.mmSafekeepingPlace, AccountIdentification31.mmSafekeepingPlace,
					AccountIdentification32.mmSafekeepingPlace, AccountIdentification34.mmSafekeepingPlace, AccountIdentification37.mmSafekeepingPlace, AccountIdentification39.mmSafekeepingPlace, AccountIdentification42.mmSafekeepingPlace);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Location where the financial instruments are safekept.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmRelatedSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}

		@Override
		public List<SafekeepingPlace> getValue(SecuritiesAccount obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<SafekeepingPlace> value) {
			obj.setSafekeepingPlace(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesAccount
	 * SecuritiesBalance.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance2#mmBalance
	 * AccountAndBalance2.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance5#mmBalance
	 * AccountAndBalance5.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance10#mmBalance
	 * AccountAndBalance10.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance12#mmBalance
	 * AccountAndBalance12.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance17#mmBalance
	 * AccountAndBalance17.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance20#mmBalance
	 * AccountAndBalance20.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance3#mmBalance
	 * AccountAndBalance3.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance6#mmBalance
	 * AccountAndBalance6.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance11#mmBalance
	 * AccountAndBalance11.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance13#mmBalance
	 * AccountAndBalance13.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance16#mmBalance
	 * AccountAndBalance16.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance19#mmBalance
	 * AccountAndBalance19.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance22#mmBalance
	 * AccountAndBalance22.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance23#mmBalance
	 * AccountAndBalance23.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance1#mmBalance
	 * AccountAndBalance1.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance7#mmBalance
	 * AccountAndBalance7.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance9#mmBalance
	 * AccountAndBalance9.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance14#mmBalance
	 * AccountAndBalance14.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance15#mmBalance
	 * AccountAndBalance15.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance18#mmBalance
	 * AccountAndBalance18.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance21#mmBalance
	 * AccountAndBalance21.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance24#mmBalance
	 * AccountAndBalance24.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance4#mmConfirmedBalance
	 * AccountAndBalance4.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance8#mmConfirmedBalance
	 * AccountAndBalance8.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification29#mmBalanceForSubAccount
	 * SubAccountIdentification29.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification31#mmBalanceForSubAccount
	 * SubAccountIdentification31.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification28#mmBalanceForSubAccount
	 * SubAccountIdentification28.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification32#mmBalanceForSubAccount
	 * SubAccountIdentification32.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition2#mmPosition
	 * SecurityPosition2.mmPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition1#mmPosition
	 * SecurityPosition1.mmPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount3#mmInstructedBalance
	 * SafekeepingAccount3.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4#mmInstructedBalance
	 * SafekeepingAccount4.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification7#mmConfirmedBalance
	 * AccountIdentification7.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification13#mmConfirmedBalance
	 * AccountIdentification13.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification18#mmConfirmedBalance
	 * AccountIdentification18.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification20#mmConfirmedBalance
	 * AccountIdentification20.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance26#mmBalance
	 * AccountAndBalance26.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance25#mmBalance
	 * AccountAndBalance25.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance32#mmBalance
	 * AccountAndBalance32.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance29#mmBalance
	 * AccountAndBalance29.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification38#mmBalanceForSubAccount
	 * SubAccountIdentification38.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification37#mmBalanceForSubAccount
	 * SubAccountIdentification37.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount6#mmInstructedBalance
	 * SafekeepingAccount6.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification40#mmBalanceForSubAccount
	 * SubAccountIdentification40.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification39#mmBalanceForSubAccount
	 * SubAccountIdentification39.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification42#mmBalanceForSubAccount
	 * SubAccountIdentification42.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#mmBalanceForSubAccount
	 * SubAccountIdentification43.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#mmBalance
	 * AccountAndBalance34.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#mmBalance
	 * AccountAndBalance35.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance36#mmConfirmedBalance
	 * AccountAndBalance36.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#mmBalance
	 * AccountAndBalance33.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification32#mmConfirmedBalance
	 * AccountIdentification32.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance40#mmConfirmedBalance
	 * AccountAndBalance40.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance38#mmBalance
	 * AccountAndBalance38.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance37#mmBalance
	 * AccountAndBalance37.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification37#mmConfirmedBalance
	 * AccountIdentification37.mmConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountAndBalance39#mmBalance
	 * AccountAndBalance39.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification45#mmBalanceForSubAccount
	 * SubAccountIdentification45.mmBalanceForSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification46#mmBalanceForSubAccount
	 * SubAccountIdentification46.mmBalanceForSubAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesBalance>> mmSecuritiesBalance = new MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountAndBalance2.mmBalance, AccountAndBalance5.mmBalance, AccountAndBalance10.mmBalance, AccountAndBalance12.mmBalance, AccountAndBalance17.mmBalance, AccountAndBalance20.mmBalance,
					AccountAndBalance3.mmBalance, AccountAndBalance6.mmBalance, AccountAndBalance11.mmBalance, AccountAndBalance13.mmBalance, AccountAndBalance16.mmBalance, AccountAndBalance19.mmBalance, AccountAndBalance22.mmBalance,
					AccountAndBalance23.mmBalance, AccountAndBalance1.mmBalance, AccountAndBalance7.mmBalance, AccountAndBalance9.mmBalance, AccountAndBalance14.mmBalance, AccountAndBalance15.mmBalance, AccountAndBalance18.mmBalance,
					AccountAndBalance21.mmBalance, AccountAndBalance24.mmBalance, AccountAndBalance4.mmConfirmedBalance, AccountAndBalance8.mmConfirmedBalance, SubAccountIdentification29.mmBalanceForSubAccount,
					SubAccountIdentification31.mmBalanceForSubAccount, SubAccountIdentification28.mmBalanceForSubAccount, SubAccountIdentification32.mmBalanceForSubAccount, SecurityPosition2.mmPosition, SecurityPosition1.mmPosition,
					SafekeepingAccount3.mmInstructedBalance, SafekeepingAccount4.mmInstructedBalance, AccountIdentification7.mmConfirmedBalance, AccountIdentification13.mmConfirmedBalance, AccountIdentification18.mmConfirmedBalance,
					AccountIdentification20.mmConfirmedBalance, AccountAndBalance26.mmBalance, AccountAndBalance25.mmBalance, AccountAndBalance32.mmBalance, AccountAndBalance29.mmBalance, SubAccountIdentification38.mmBalanceForSubAccount,
					SubAccountIdentification37.mmBalanceForSubAccount, SafekeepingAccount6.mmInstructedBalance, SubAccountIdentification40.mmBalanceForSubAccount, SubAccountIdentification39.mmBalanceForSubAccount,
					SubAccountIdentification42.mmBalanceForSubAccount, SubAccountIdentification43.mmBalanceForSubAccount, AccountAndBalance34.mmBalance, AccountAndBalance35.mmBalance, AccountAndBalance36.mmConfirmedBalance,
					AccountAndBalance33.mmBalance, AccountIdentification32.mmConfirmedBalance, AccountAndBalance40.mmConfirmedBalance, AccountAndBalance38.mmBalance, AccountAndBalance37.mmBalance,
					AccountIdentification37.mmConfirmedBalance, AccountAndBalance39.mmBalance, SubAccountIdentification45.mmBalanceForSubAccount, SubAccountIdentification46.mmBalanceForSubAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Value of financial assets held by a person or an organisation. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(SecuritiesAccount obj) {
			return obj.getSecuritiesBalance();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<SecuritiesBalance> value) {
			obj.setSecuritiesBalance(value);
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionServicing> corporateActionServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmSecuritiesAccount
	 * CorporateActionServicing.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actions taken in relation with the securities account in the context of the corporate action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<CorporateActionServicing>> mmCorporateActionServicing = new MMBusinessAssociationEnd<SecuritiesAccount, List<CorporateActionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionServicing";
			definition = "Actions taken in relation with the securities account in the context of the corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}

		@Override
		public List<CorporateActionServicing> getValue(SecuritiesAccount obj) {
			return obj.getCorporateActionServicing();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<CorporateActionServicing> value) {
			obj.setCorporateActionServicing(value);
		}
	};
	protected Allocation relatedAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocationAccount
	 * Allocation.mmAllocationAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which an account is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<Allocation>> mmRelatedAllocation = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<Allocation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAllocation";
			definition = "Allocation process for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Allocation.mmAllocationAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Allocation.mmObject();
		}

		@Override
		public Optional<Allocation> getValue(SecuritiesAccount obj) {
			return obj.getRelatedAllocation();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<Allocation> value) {
			obj.setRelatedAllocation(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesEntry
	 * SecuritiesEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmSecuritiesAccount
	 * SecuritiesEntry.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of the movements into or out of an account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesEntry>> mmSecuritiesEntry = new MMBusinessAssociationEnd<SecuritiesAccount, List<SecuritiesEntry>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}

		@Override
		public List<SecuritiesEntry> getValue(SecuritiesAccount obj) {
			return obj.getSecuritiesEntry();
		}

		@Override
		public void setValue(SecuritiesAccount obj, List<SecuritiesEntry> value) {
			obj.setSecuritiesEntry(value);
		}
	};
	protected ClearingMemberRole clearingAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
	 * ClearingMemberRole.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a clearing account at a CCP."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>> mmClearingAccountOwner = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountOwner";
			definition = "Clearing member which holds a clearing account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ClearingMemberRole.mmClearingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public Optional<ClearingMemberRole> getValue(SecuritiesAccount obj) {
			return obj.getClearingAccountOwner();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<ClearingMemberRole> value) {
			obj.setClearingAccountOwner(value.orElse(null));
		}
	};
	protected ClearingMemberRole marginAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmMarginAccount
	 * ClearingMemberRole.mmMarginAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a margin account at a CCP."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>> mmMarginAccountOwner = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginAccountOwner";
			definition = "Clearing member which holds a margin account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ClearingMemberRole.mmMarginAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public Optional<ClearingMemberRole> getValue(SecuritiesAccount obj) {
			return obj.getMarginAccountOwner();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<ClearingMemberRole> value) {
			obj.setMarginAccountOwner(value.orElse(null));
		}
	};
	protected ClearingMemberRole deliveryAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
	 * ClearingMemberRole.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing member which holds a delivery account at a CCP."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>> mmDeliveryAccountOwner = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<ClearingMemberRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccountOwner";
			definition = "Clearing member which holds a delivery account at a CCP.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ClearingMemberRole.mmDeliveryAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}

		@Override
		public Optional<ClearingMemberRole> getValue(SecuritiesAccount obj) {
			return obj.getDeliveryAccountOwner();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<ClearingMemberRole> value) {
			obj.setDeliveryAccountOwner(value.orElse(null));
		}
	};
	protected PowerOfAttorney relatedPowerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PowerOfAttorney
	 * PowerOfAttorney}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorney#mmAuthorisedAccount
	 * PowerOfAttorney.mmAuthorisedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Power of attorney related to the securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<PowerOfAttorney>> mmRelatedPowerOfAttorney = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<PowerOfAttorney>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPowerOfAttorney";
			definition = "Power of attorney related to the securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PowerOfAttorney.mmAuthorisedAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PowerOfAttorney.mmObject();
		}

		@Override
		public Optional<PowerOfAttorney> getValue(SecuritiesAccount obj) {
			return obj.getRelatedPowerOfAttorney();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<PowerOfAttorney> value) {
			obj.setRelatedPowerOfAttorney(value.orElse(null));
		}
	};
	protected InstructionForMeeting relatedMeetingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting
	 * InstructionForMeeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSafekeepingAccount
	 * InstructionForMeeting.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeetingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting instruction which specifies an account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<InstructionForMeeting>> mmRelatedMeetingInstruction = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<InstructionForMeeting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingInstruction";
			definition = "Meeting instruction which specifies an account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> InstructionForMeeting.mmSafekeepingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InstructionForMeeting.mmObject();
		}

		@Override
		public Optional<InstructionForMeeting> getValue(SecuritiesAccount obj) {
			return obj.getRelatedMeetingInstruction();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<InstructionForMeeting> value) {
			obj.setRelatedMeetingInstruction(value.orElse(null));
		}
	};
	protected ClearingAccountTypeCode clearingAccountType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
	 * ClearingAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation4#mmClearingAccountType
	 * SettlementObligation4.mmClearingAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmClearingAccountType
	 * SettlementObligation8.mmClearingAccountType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the clearing account type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesAccount, ClearingAccountTypeCode> mmClearingAccountType = new MMBusinessAttribute<SecuritiesAccount, ClearingAccountTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementObligation4.mmClearingAccountType, SettlementObligation8.mmClearingAccountType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingAccountType";
			definition = "Specifies the clearing account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingAccountTypeCode.mmObject();
		}

		@Override
		public ClearingAccountTypeCode getValue(SecuritiesAccount obj) {
			return obj.getClearingAccountType();
		}

		@Override
		public void setValue(SecuritiesAccount obj, ClearingAccountTypeCode value) {
			obj.setClearingAccountType(value);
		}
	};
	protected SecuritiesOrder relatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderingAccount
	 * SecuritiesOrder.mmOrderingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order process for which an ordering account is specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<SecuritiesOrder>> mmRelatedOrder = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<SecuritiesOrder>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order process for which an ordering account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrder.mmOrderingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public Optional<SecuritiesOrder> getValue(SecuritiesAccount obj) {
			return obj.getRelatedOrder();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<SecuritiesOrder> value) {
			obj.setRelatedOrder(value.orElse(null));
		}
	};
	protected DisclosedListTrading disclosedListTrading;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading
	 * DisclosedListTrading}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DisclosedListTrading#mmDisclosedListTradingAccount
	 * DisclosedListTrading.mmDisclosedListTradingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisclosedListTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disclosed list trading process for which a trading account is specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, Optional<DisclosedListTrading>> mmDisclosedListTrading = new MMBusinessAssociationEnd<SecuritiesAccount, Optional<DisclosedListTrading>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisclosedListTrading";
			definition = "Disclosed list trading process for which a trading account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmDisclosedListTradingAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DisclosedListTrading.mmObject();
		}

		@Override
		public Optional<DisclosedListTrading> getValue(SecuritiesAccount obj) {
			return obj.getDisclosedListTrading();
		}

		@Override
		public void setValue(SecuritiesAccount obj, Optional<DisclosedListTrading> value) {
			obj.setDisclosedListTrading(value.orElse(null));
		}
	};
	protected AccountLink accountLink;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountLink
	 * AccountLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountLink#mmSecuritiesAccount
	 * AccountLink.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the link between a cash account and a securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesAccount, com.tools20022.repository.entity.AccountLink> mmAccountLink = new MMBusinessAssociationEnd<SecuritiesAccount, com.tools20022.repository.entity.AccountLink>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.mmSecuritiesAccount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.AccountLink getValue(SecuritiesAccount obj) {
			return obj.getAccountLink();
		}

		@Override
		public void setValue(SecuritiesAccount obj, com.tools20022.repository.entity.AccountLink value) {
			obj.setAccountLink(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount";
				definition = "Account to or from which a securities entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesAccount, InvestmentAccount.mmSecuritiesAccount, SecuritiesTransfer.mmAccount, ClearingMemberRole.mmClearingAccount,
						ClearingMemberRole.mmMarginAccount, ClearingMemberRole.mmDeliveryAccount, com.tools20022.repository.entity.SecuritiesPartyRole.mmSecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesEntry.mmSecuritiesAccount, com.tools20022.repository.entity.SafekeepingPlace.mmRelatedSecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesBalance.mmSecuritiesAccount, RegistrarRole.mmRegistrarAccount, com.tools20022.repository.entity.CorporateActionServicing.mmSecuritiesAccount,
						SecuritiesOrder.mmOrderingAccount, Allocation.mmAllocationAccount, InstructionForMeeting.mmSafekeepingAccount, PowerOfAttorney.mmAuthorisedAccount, com.tools20022.repository.entity.AccountLink.mmSecuritiesAccount,
						com.tools20022.repository.entity.DisclosedListTrading.mmDisclosedListTradingAccount);
				derivationElement_lazy = () -> Arrays.asList(PartyIdentificationAndAccount16.mmSafekeepingAccount, PartyIdentificationAndAccount44.mmSafekeepingAccount, PartyIdentificationAndAccount1.mmSafekeepingAccount,
						PartyIdentificationAndAccount42.mmSafekeepingAccount, PartyIdentificationAndAccount19.mmSafekeepingAccount, PartyIdentificationAndAccount21.mmSafekeepingAccount, PartyIdentificationAndAccount40.mmSafekeepingAccount,
						PartyIdentificationAndAccount41.mmSafekeepingAccount, PartyIdentificationAndAccount81.mmSafekeepingAccount, QuantityAndAccount30.mmSafekeepingAccount, PartyIdentificationAndAccount43.mmSafekeepingAccount,
						PartyIdentificationAndAccount68.mmSafekeepingAccount, PartyIdentificationAndAccount75.mmSafekeepingAccount, PartyIdentificationAndAccount63.mmSafekeepingAccount, PartyIdentificationAndAccount88.mmSafekeepingAccount,
						PartyIdentificationAndAccount66.mmSafekeepingAccount, QuantityAndAccount33.mmSafekeepingAccount, AccountIdentification9.mmSafekeepingAccount, AccountIdentification14.mmSafekeepingAccount,
						AccountIdentification15.mmSafekeepingAccount, AccountIdentification21.mmSafekeepingAccount, AccountAndBalance2.mmSafekeepingAccount, AccountAndBalance5.mmSafekeepingAccount, AccountAndBalance10.mmSafekeepingAccount,
						AccountAndBalance12.mmSafekeepingAccount, AccountAndBalance17.mmSafekeepingAccount, AccountAndBalance20.mmSafekeepingAccount, AccountIdentification8.mmSafekeepingAccount,
						AccountIdentification17.mmSafekeepingAccount, AccountIdentification19.mmSafekeepingAccount, AccountIdentification6.mmSafekeepingAccount, AccountIdentification12.mmSafekeepingAccount,
						AccountIdentification16.mmSafekeepingAccount, AccountIdentification22.mmSafekeepingAccount, AccountIdentification23.mmSafekeepingAccount, AccountIdentification24.mmSafekeepingAccount,
						AccountIdentification25.mmSafekeepingAccount, AccountIdentification29.mmSafekeepingAccount, AccountAndBalance3.mmSafekeepingAccount, PartyIdentificationAndAccount14.mmSafekeepingAccount,
						AccountAndBalance6.mmSafekeepingAccount, PartyIdentificationAndAccount22.mmSafekeepingAccount, AccountAndBalance11.mmSafekeepingAccount, PartyIdentificationAndAccount51.mmSafekeepingAccount,
						AccountAndBalance13.mmSafekeepingAccount, PartyIdentificationAndAccount56.mmSafekeepingAccount, AccountAndBalance16.mmSafekeepingAccount, AccountAndBalance19.mmSafekeepingAccount,
						AccountAndBalance22.mmSafekeepingAccount, AccountAndBalance23.mmSafekeepingAccount, AccountAndBalance1.mmSafekeepingAccount, AccountIdentification7Choice.mmAccountsListAndBalanceDetails,
						AccountAndBalance7.mmSafekeepingAccount, AccountIdentification8Choice.mmAccountsListAndBalanceDetails, AccountAndBalance9.mmSafekeepingAccount, AccountIdentification12Choice.mmAccountsListAndBalanceDetails,
						AccountAndBalance14.mmSafekeepingAccount, AccountIdentification15Choice.mmAccountsListAndBalanceDetails, AccountAndBalance15.mmSafekeepingAccount, AccountIdentification18Choice.mmAccountsListAndBalanceDetails,
						AccountAndBalance18.mmSafekeepingAccount, AccountIdentification19Choice.mmAccountsListAndBalanceDetails, AccountAndBalance21.mmSafekeepingAccount, AccountIdentification21Choice.mmAccountsListAndBalanceDetails,
						AccountAndBalance24.mmSafekeepingAccount, AccountIdentification22Choice.mmAccountsListAndBalanceDetails, AccountAndBalance4.mmSafekeepingAccount, AccountAndBalance8.mmSafekeepingAccount,
						SubAccountIdentification10.mmSafekeepingAccount, SubAccountIdentification13.mmSafekeepingAccount, SubAccountIdentification16.mmSafekeepingAccount, SubAccountIdentification20.mmSafekeepingAccount,
						SubAccountIdentification23.mmSafekeepingAccount, SubAccountIdentification26.mmSafekeepingAccount, SubAccountIdentification29.mmSafekeepingAccount, SubAccountIdentification31.mmSafekeepingAccount,
						SubAccountIdentification11.mmSafekeepingAccount, SubAccountIdentification12.mmSafekeepingAccount, SubAccountIdentification17.mmSafekeepingAccount, SubAccountIdentification19.mmSafekeepingAccount,
						SubAccountIdentification22.mmSafekeepingAccount, SubAccountIdentification25.mmSafekeepingAccount, SubAccountIdentification28.mmSafekeepingAccount, SubAccountIdentification32.mmSafekeepingAccount,
						QuantityAndAccount6.mmSafekeepingAccount, QuantityAndAccount11.mmSafekeepingAccount, PartyIdentificationAndAccount26.mmSafekeepingAccount, PartyIdentificationAndAccount28.mmSafekeepingAccount,
						PartyIdentificationAndAccount30.mmSafekeepingAccount, QuantityAndAccount18.mmSafekeepingAccount, PartyIdentificationAndAccount35.mmSafekeepingAccount, PartyIdentificationAndAccount36.mmSafekeepingAccount,
						PartyIdentificationAndAccount37.mmSafekeepingAccount, QuantityAndAccount19.mmSafekeepingAccount, PartyIdentificationAndAccount49.mmSafekeepingAccount, PartyIdentificationAndAccount61.mmSafekeepingAccount,
						PartyIdentificationAndAccount62.mmSafekeepingAccount, QuantityAndAccount1.mmSafekeepingAccount, QuantityAndAccount5.mmSafekeepingAccount, QuantityAndAccount17.mmSafekeepingAccount,
						QuantityAndAccount24.mmSafekeepingAccount, QuantityAndAccount25.mmSafekeepingAccount, QuantityAndAccount34.mmSafekeepingAccount, PartyIdentificationAndAccount25.mmSafekeepingAccount,
						QuantityAndAccount2.mmSafekeepingAccount, QuantityAndAccount12.mmSafekeepingAccount, QuantityAndAccount15.mmSafekeepingAccount, QuantityAndAccount20.mmSafekeepingAccount,
						PartyIdentificationAndAccount65.mmSafekeepingAccount, PartyIdentificationAndAccount67.mmSafekeepingAccount, QuantityAndAccount28.mmSafekeepingAccount, QuantityAndAccount37.mmSafekeepingAccount,
						SubAccountIdentification9.mmSafekeepingAccount, SubAccountIdentification14.mmSafekeepingAccount, SubAccountIdentification15.mmSafekeepingAccount, SubAccountIdentification18.mmSafekeepingAccount,
						SubAccountIdentification21.mmSafekeepingAccount, SubAccountIdentification24.mmSafekeepingAccount, SubAccountIdentification30.mmSafekeepingAccount, SubAccountIdentification33.mmSafekeepingAccount,
						PartyIdentificationAndAccount9.mmSafekeepingAccount, PartyIdentificationAndAccount79.mmSafekeepingAccount, PartyIdentificationAndAccount83.mmSafekeepingAccount, PartyIdentificationAndAccount77.mmSafekeepingAccount,
						ConfirmationPartyDetails4.mmSafekeepingAccount, Intermediary14.mmSafekeepingDetails, ConfirmationPartyDetails3.mmSafekeepingAccount, PartyIdentificationAndAccount10.mmSafekeepingAccount,
						PartyIdentificationAndAccount8.mmSafekeepingAccount, ConfirmationPartyDetails6.mmSafekeepingAccount, PartyIdentificationAndAccount34.mmSafekeepingAccount, SecurityMovement1.mmAccountDetails,
						SecuritiesProceeds1.mmAccountDetails, CorporateActionStandingInstructionGeneralInformation1.mmAccountDetails, CorporateActionStandingInstruction1.mmSecuritiesDistributionDetails,
						QuantityAndAccount7.mmSafekeepingAccount, QuantityAndAccount16.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails2.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails8.mmSafekeepingAccount,
						QuantityAndAccount3.mmSafekeepingAccount, QuantityAndAccount13.mmSafekeepingAccount, PartyIdentificationAndAccount45.mmSafekeepingAccount, PartyIdentificationAndAccount46.mmSafekeepingAccount,
						PartyIdentificationAndAccount47.mmSafekeepingAccount, AccountIdentification7.mmSafekeepingAccount, AccountIdentification13.mmSafekeepingAccount, AccountIdentification18.mmSafekeepingAccount,
						AccountIdentification20.mmSafekeepingAccount, QuantityAndAccount10.mmSafekeepingAccount, QuantityAndAccount21.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails6.mmSafekeepingAccount,
						SecuritiesFinancingTransactionDetails10.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails17.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails18.mmSafekeepingAccount,
						QuantityAndAccount4.mmSafekeepingAccount, QuantityAndAccount22.mmSafekeepingAccount, QuantityAndAccount27.mmSafekeepingAccount, QuantityAndAccount36.mmSafekeepingAccount,
						PartyIdentificationAndAccount71.mmSafekeepingAccount, PartyIdentificationAndAccount73.mmSafekeepingAccount, PartyIdentificationAndAccount74.mmSafekeepingAccount, PartyIdentificationAndAccount76.mmSafekeepingAccount,
						SecuritiesAccount21.mmSubAccount, MarginReport1.mmMarginAccount, MarginReport2.mmMarginAccount, AccountIdentification11.mmSafekeepingAccount, SecuritiesAccount1Choice.mmAccount,
						SubAccountIdentification27.mmSafekeepingAccount, SubaccountIdentification7.mmSafekeepingAccount, SubaccountIdentification8.mmSafekeepingAccount, AccountIdentification20Choice.mmSecuritiesAccountIdentification,
						SubAccountIdentification34.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails21.mmSafekeepingAccount, AccountIdentification23Choice.mmAccountsListAndBalanceDetails, AccountAndBalance26.mmSafekeepingAccount,
						AccountAndBalance25.mmSafekeepingAccount, PartyIdentificationAndAccount95.mmAccountIdentification, AccountAndBalance32.mmSafekeepingAccount, AccountIdentification26Choice.mmAccountsListAndBalanceDetails,
						AccountAndBalance29.mmSafekeepingAccount, SubAccountIdentification35.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails22.mmSafekeepingAccount, SafekeepingAccount5.mmAccountIdentification,
						SafekeepingAccount5.mmAccountSubLevel1, AccountSubLevel1.mmAccountSubLevel2, AccountSubLevel4.mmAccountSubLevel5, AccountSubLevel5.mmAccountSubLevel6, AccountSubLevel2.mmAccountSubLevel3,
						AccountSubLevel3.mmAccountSubLevel4, AccountSubLevel6.mmAccountSubLevel7, AccountSubLevel7.mmAccountSubLevel8, AccountSubLevel8.mmAccountSubLevel9, SecuritiesFinancingTransactionDetails24.mmSafekeepingAccount,
						SubAccountIdentification38.mmSafekeepingAccount, SubAccountIdentification37.mmSafekeepingAccount, PartyIdentificationAndAccount100.mmSafekeepingAccount, ReportItem1.mmAccountIdentification,
						SubAccountIdentification40.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails25.mmSafekeepingAccount, SubAccountIdentification39.mmSafekeepingAccount, QuantityAndAccount39.mmSafekeepingAccount,
						SubAccountIdentification42.mmSafekeepingAccount, QuantityAndAccount41.mmSafekeepingAccount, SubAccountIdentification44.mmSafekeepingAccount, QuantityAndAccount40.mmSafekeepingAccount,
						QuantityAndAccount42.mmSafekeepingAccount, QuantityAndAccount38.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails26.mmSafekeepingAccount, SubAccountIdentification43.mmSafekeepingAccount,
						PartyIdentificationAndAccount106.mmSafekeepingAccount, QuantityAndAccount43.mmSafekeepingAccount, PartyIdentificationAndAccount117.mmSafekeepingAccount, PartyIdentificationAndAccount108.mmSafekeepingAccount,
						PartyIdentificationAndAccount107.mmSafekeepingAccount, AccountAndBalance34.mmSafekeepingAccount, AccountAndBalance35.mmSafekeepingAccount, AccountAndBalance36.mmSafekeepingAccount,
						AccountIdentification33.mmSafekeepingAccount, AccountIdentification32Choice.mmAccountsListAndBalanceDetails, AccountIdentification31.mmSafekeepingAccount, PartyIdentificationAndAccount122.mmSafekeepingAccount,
						AccountAndBalance33.mmSafekeepingAccount, AccountIdentification32.mmSafekeepingAccount, PartyIdentificationAndAccount127.mmSafekeepingAccount, AccountAndBalance40.mmSafekeepingAccount,
						AccountAndBalance38.mmSafekeepingAccount, AccountIdentification36Choice.mmAccountsListAndBalanceDetails, AccountIdentification35.mmSafekeepingAccount, AccountAndBalance37.mmSafekeepingAccount,
						AccountIdentification34.mmSafekeepingAccount, AccountIdentification37.mmSafekeepingAccount, AccountAndBalance39.mmSafekeepingAccount, PartyIdentificationAndAccount128.mmSafekeepingAccount,
						SubAccountIdentification47.mmSafekeepingAccount, QuantityAndAccount47.mmSafekeepingAccount, SecuritiesFinancingTransactionDetails33.mmSafekeepingAccount, SubAccountIdentification45.mmSafekeepingAccount,
						QuantityAndAccount48.mmSafekeepingAccount, QuantityAndAccount46.mmSafekeepingAccount, SubAccountIdentification46.mmSafekeepingAccount, QuantityAndAccount51.mmSafekeepingAccount,
						QuantityAndAccount49.mmSafekeepingAccount, PartyIdentificationAndAccount131.mmSafekeepingAccount, PartyIdentificationAndAccount146.mmSafekeepingAccount, PartyIdentificationAndAccount135.mmSafekeepingAccount,
						PartyIdentificationAndAccount136.mmSafekeepingAccount, QuantityAndAccount55.mmSafekeepingAccount, AccountIdentification39.mmSafekeepingAccount, AccountIdentification38Choice.mmSecuritiesAccountIdentification,
						SecuritiesAccount2Choice.mmAccount, SubAccountIdentification48.mmSafekeepingAccount, SafekeepingAccount7.mmAccountIdentification, SafekeepingAccount7.mmAccountSubLevel1, AccountSubLevel15.mmAccountSubLevel6,
						AccountSubLevel16.mmAccountSubLevel7, AccountSubLevel18.mmAccountSubLevel9, AccountSubLevel11.mmAccountSubLevel2, AccountSubLevel12.mmAccountSubLevel3, AccountSubLevel17.mmAccountSubLevel8,
						AccountSubLevel13.mmAccountSubLevel4, AccountSubLevel14.mmAccountSubLevel5, AccountIdentification40.mmSafekeepingAccount, SubAccountIdentification49.mmSafekeepingAccount,
						SecuritiesFinancingTransactionDetails35.mmSafekeepingAccount, SubAccountIdentification50.mmSafekeepingAccount, AccountIdentification41.mmSafekeepingAccount,
						SecuritiesFinancingTransactionDetails36.mmSafekeepingAccount, QuantityAndAccount57.mmSafekeepingAccount, QuantityAndAccount58.mmSafekeepingAccount, QuantityAndAccount56.mmSafekeepingAccount,
						QuantityAndAccount61.mmSafekeepingAccount, QuantityAndAccount62.mmSafekeepingAccount, QuantityAndAccount60.mmSafekeepingAccount, AccountIdentification42.mmSafekeepingAccount,
						SubAccountIdentification51.mmSafekeepingAccount, QuantityAndAccount64.mmSafekeepingAccount, QuantityAndAccount63.mmSafekeepingAccount, PartyIdentificationAndAccount159.mmSafekeepingAccount,
						QuantityAndAccount65.mmSafekeepingAccount, QuantityAndAccount68.mmSafekeepingAccount, AccountIdentification43.mmSafekeepingAccount, AccountIdentification44.mmSafekeepingAccount,
						PartyIdentificationAndAccount160.mmSafekeepingAccount, QuantityAndAccount69.mmSafekeepingAccount, QuantityAndAccount70.mmSafekeepingAccount, QuantityAndAccount72.mmSafekeepingAccount,
						QuantityAndAccount76.mmSafekeepingAccount, SubAccountIdentification52.mmSafekeepingAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesAccountType, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedTransfer, com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesPartyRole, com.tools20022.repository.entity.SecuritiesAccount.mmSecurity,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedRegistrar, com.tools20022.repository.entity.SecuritiesAccount.mmSafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesAccount.mmCorporateActionServicing, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedAllocation,
						com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesEntry, com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.mmMarginAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.mmDeliveryAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.mmRelatedPowerOfAttorney, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedMeetingInstruction,
						com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountType, com.tools20022.repository.entity.SecuritiesAccount.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesAccount.mmDisclosedListTrading,
						com.tools20022.repository.entity.SecuritiesAccount.mmAccountLink);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesAccount1.mmObject(), SecuritiesAccount4.mmObject(), SecuritiesAccount13.mmObject(), SecuritiesAccount17.mmObject(), AccountAndBalance2.mmObject(),
						AccountAndBalance5.mmObject(), AccountAndBalance10.mmObject(), AccountAndBalance12.mmObject(), AccountAndBalance17.mmObject(), AccountAndBalance20.mmObject(), AccountAndBalance3.mmObject(),
						AccountAndBalance6.mmObject(), AccountAndBalance11.mmObject(), AccountAndBalance13.mmObject(), AccountAndBalance16.mmObject(), AccountAndBalance19.mmObject(), AccountAndBalance22.mmObject(),
						AccountAndBalance23.mmObject(), AccountAndBalance1.mmObject(), AccountAndBalance7.mmObject(), AccountAndBalance9.mmObject(), AccountAndBalance14.mmObject(), AccountAndBalance15.mmObject(),
						AccountAndBalance18.mmObject(), AccountAndBalance21.mmObject(), AccountAndBalance24.mmObject(), AccountAndBalance4.mmObject(), AccountAndBalance8.mmObject(), PurposeCode1Choice.mmObject(),
						SecuritiesAccount11.mmObject(), SecuritiesAccount2.mmObject(), PurposeCode2Choice.mmObject(), SecuritiesAccount14.mmObject(), PurposeCode3Choice.mmObject(), SecuritiesAccount15.mmObject(),
						PurposeCode4Choice.mmObject(), SecuritiesAccount16.mmObject(), SafekeepingAccount1.mmObject(), SafekeepingAccount2.mmObject(), SubAccountIdentification29.mmObject(), SubAccountIdentification31.mmObject(),
						SubAccountIdentification28.mmObject(), SubAccountIdentification32.mmObject(), SubAccountIdentification30.mmObject(), SubAccountIdentification33.mmObject(), SecuritiesAccount20.mmObject(),
						PurposeCode5Choice.mmObject(), SecuritiesAccount3.mmObject(), SafekeepingAccount3.mmObject(), SafekeepingAccount4.mmObject(), SecuritiesAccount7.mmObject(), SecuritiesAccount9.mmObject(),
						SecuritiesAccount12.mmObject(), SecuritiesAccount8.mmObject(), SecuritiesAccount10.mmObject(), IncludedAccount1.mmObject(), SecuritiesAccount6.mmObject(), SecuritiesAccount21.mmObject(),
						SecuritiesAccount19.mmObject(), SecuritiesAccount18.mmObject(), SecuritiesAccount5.mmObject(), SecuritiesAccount1Choice.mmObject(), SubAccountIdentification34.mmObject(), AccountAndBalance26.mmObject(),
						AccountAndBalance25.mmObject(), SecuritiesAccount22.mmObject(), AccountAndBalance32.mmObject(), AccountAndBalance29.mmObject(), SubAccountIdentification35.mmObject(), SafekeepingAccount5.mmObject(),
						AccountSubLevel1.mmObject(), AccountSubLevel4.mmObject(), AccountSubLevel5.mmObject(), AccountSubLevel2.mmObject(), AccountSubLevel3.mmObject(), AccountSubLevel6.mmObject(), AccountSubLevel7.mmObject(),
						AccountSubLevel8.mmObject(), AccountSubLevel9.mmObject(), SubAccountIdentification38.mmObject(), SubAccountIdentification37.mmObject(), SafekeepingAccount6.mmObject(), SubAccountIdentification40.mmObject(),
						SubAccountIdentification39.mmObject(), SecuritiesAccount24.mmObject(), SubAccountIdentification42.mmObject(), SubAccountIdentification44.mmObject(), SubAccountIdentification43.mmObject(),
						SecuritiesAccount26.mmObject(), SecuritiesAccount25.mmObject(), PurposeCode7Choice.mmObject(), AccountAndBalance34.mmObject(), AccountAndBalance35.mmObject(), AccountAndBalance36.mmObject(),
						AccountAndBalance33.mmObject(), AccountAndBalance40.mmObject(), AccountAndBalance38.mmObject(), AccountAndBalance37.mmObject(), AccountAndBalance39.mmObject(), SubAccountIdentification47.mmObject(),
						SecuritiesAccount33.mmObject(), SubAccountIdentification45.mmObject(), SubAccountIdentification46.mmObject(), SecuritiesAccount27.mmObject(), PurposeCode8Choice.mmObject(), SecuritiesAccount30.mmObject(),
						SecuritiesAccount34.mmObject(), SecuritiesAccount2Choice.mmObject(), SafekeepingAccount7.mmObject(), AccountSubLevel15.mmObject(), AccountSubLevel16.mmObject(), AccountSubLevel18.mmObject(),
						AccountSubLevel19.mmObject(), AccountSubLevel11.mmObject(), AccountSubLevel12.mmObject(), AccountSubLevel17.mmObject(), AccountSubLevel13.mmObject(), AccountSubLevel14.mmObject(),
						SubAccountIdentification49.mmObject(), SubAccountIdentification50.mmObject(), SubAccountIdentification51.mmObject(), SubAccountIdentification52.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesAccount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccountPurposeTypeCode getSecuritiesAccountType() {
		return securitiesAccountType;
	}

	public SecuritiesAccount setSecuritiesAccountType(SecuritiesAccountPurposeTypeCode securitiesAccountType) {
		this.securitiesAccountType = Objects.requireNonNull(securitiesAccountType);
		return this;
	}

	public InvestmentAccount getRelatedInvestmentAccount() {
		return relatedInvestmentAccount;
	}

	public SecuritiesAccount setRelatedInvestmentAccount(InvestmentAccount relatedInvestmentAccount) {
		this.relatedInvestmentAccount = Objects.requireNonNull(relatedInvestmentAccount);
		return this;
	}

	public List<SecuritiesTransfer> getRelatedTransfer() {
		return relatedTransfer == null ? relatedTransfer = new ArrayList<>() : relatedTransfer;
	}

	public SecuritiesAccount setRelatedTransfer(List<SecuritiesTransfer> relatedTransfer) {
		this.relatedTransfer = Objects.requireNonNull(relatedTransfer);
		return this;
	}

	public SecuritiesPartyRole getSecuritiesPartyRole() {
		return securitiesPartyRole;
	}

	public SecuritiesAccount setSecuritiesPartyRole(com.tools20022.repository.entity.SecuritiesPartyRole securitiesPartyRole) {
		this.securitiesPartyRole = Objects.requireNonNull(securitiesPartyRole);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesAccount setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public Optional<RegistrarRole> getRelatedRegistrar() {
		return relatedRegistrar == null ? Optional.empty() : Optional.of(relatedRegistrar);
	}

	public SecuritiesAccount setRelatedRegistrar(RegistrarRole relatedRegistrar) {
		this.relatedRegistrar = relatedRegistrar;
		return this;
	}

	public List<SafekeepingPlace> getSafekeepingPlace() {
		return safekeepingPlace == null ? safekeepingPlace = new ArrayList<>() : safekeepingPlace;
	}

	public SecuritiesAccount setSafekeepingPlace(List<com.tools20022.repository.entity.SafekeepingPlace> safekeepingPlace) {
		this.safekeepingPlace = Objects.requireNonNull(safekeepingPlace);
		return this;
	}

	public List<SecuritiesBalance> getSecuritiesBalance() {
		return securitiesBalance == null ? securitiesBalance = new ArrayList<>() : securitiesBalance;
	}

	public SecuritiesAccount setSecuritiesBalance(List<com.tools20022.repository.entity.SecuritiesBalance> securitiesBalance) {
		this.securitiesBalance = Objects.requireNonNull(securitiesBalance);
		return this;
	}

	public List<CorporateActionServicing> getCorporateActionServicing() {
		return corporateActionServicing == null ? corporateActionServicing = new ArrayList<>() : corporateActionServicing;
	}

	public SecuritiesAccount setCorporateActionServicing(List<com.tools20022.repository.entity.CorporateActionServicing> corporateActionServicing) {
		this.corporateActionServicing = Objects.requireNonNull(corporateActionServicing);
		return this;
	}

	public Optional<Allocation> getRelatedAllocation() {
		return relatedAllocation == null ? Optional.empty() : Optional.of(relatedAllocation);
	}

	public SecuritiesAccount setRelatedAllocation(Allocation relatedAllocation) {
		this.relatedAllocation = relatedAllocation;
		return this;
	}

	public List<SecuritiesEntry> getSecuritiesEntry() {
		return securitiesEntry == null ? securitiesEntry = new ArrayList<>() : securitiesEntry;
	}

	public SecuritiesAccount setSecuritiesEntry(List<com.tools20022.repository.entity.SecuritiesEntry> securitiesEntry) {
		this.securitiesEntry = Objects.requireNonNull(securitiesEntry);
		return this;
	}

	public Optional<ClearingMemberRole> getClearingAccountOwner() {
		return clearingAccountOwner == null ? Optional.empty() : Optional.of(clearingAccountOwner);
	}

	public SecuritiesAccount setClearingAccountOwner(ClearingMemberRole clearingAccountOwner) {
		this.clearingAccountOwner = clearingAccountOwner;
		return this;
	}

	public Optional<ClearingMemberRole> getMarginAccountOwner() {
		return marginAccountOwner == null ? Optional.empty() : Optional.of(marginAccountOwner);
	}

	public SecuritiesAccount setMarginAccountOwner(ClearingMemberRole marginAccountOwner) {
		this.marginAccountOwner = marginAccountOwner;
		return this;
	}

	public Optional<ClearingMemberRole> getDeliveryAccountOwner() {
		return deliveryAccountOwner == null ? Optional.empty() : Optional.of(deliveryAccountOwner);
	}

	public SecuritiesAccount setDeliveryAccountOwner(ClearingMemberRole deliveryAccountOwner) {
		this.deliveryAccountOwner = deliveryAccountOwner;
		return this;
	}

	public Optional<PowerOfAttorney> getRelatedPowerOfAttorney() {
		return relatedPowerOfAttorney == null ? Optional.empty() : Optional.of(relatedPowerOfAttorney);
	}

	public SecuritiesAccount setRelatedPowerOfAttorney(PowerOfAttorney relatedPowerOfAttorney) {
		this.relatedPowerOfAttorney = relatedPowerOfAttorney;
		return this;
	}

	public Optional<InstructionForMeeting> getRelatedMeetingInstruction() {
		return relatedMeetingInstruction == null ? Optional.empty() : Optional.of(relatedMeetingInstruction);
	}

	public SecuritiesAccount setRelatedMeetingInstruction(InstructionForMeeting relatedMeetingInstruction) {
		this.relatedMeetingInstruction = relatedMeetingInstruction;
		return this;
	}

	public ClearingAccountTypeCode getClearingAccountType() {
		return clearingAccountType;
	}

	public SecuritiesAccount setClearingAccountType(ClearingAccountTypeCode clearingAccountType) {
		this.clearingAccountType = Objects.requireNonNull(clearingAccountType);
		return this;
	}

	public Optional<SecuritiesOrder> getRelatedOrder() {
		return relatedOrder == null ? Optional.empty() : Optional.of(relatedOrder);
	}

	public SecuritiesAccount setRelatedOrder(SecuritiesOrder relatedOrder) {
		this.relatedOrder = relatedOrder;
		return this;
	}

	public Optional<DisclosedListTrading> getDisclosedListTrading() {
		return disclosedListTrading == null ? Optional.empty() : Optional.of(disclosedListTrading);
	}

	public SecuritiesAccount setDisclosedListTrading(com.tools20022.repository.entity.DisclosedListTrading disclosedListTrading) {
		this.disclosedListTrading = disclosedListTrading;
		return this;
	}

	public AccountLink getAccountLink() {
		return accountLink;
	}

	public SecuritiesAccount setAccountLink(com.tools20022.repository.entity.AccountLink accountLink) {
		this.accountLink = Objects.requireNonNull(accountLink);
		return this;
	}
}