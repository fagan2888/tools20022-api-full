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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Status of a securities trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeStatus"
 * src="doc-files/SecuritiesTradeStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
 * SecuritiesTradeStatus.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
 * SecuritiesTradeStatus.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSecuritiesTrade
 * SecuritiesTradeStatus.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTransactionStatus
 * SecuritiesTradeStatus.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReplacementProcessingStatus
 * SecuritiesTradeStatus.mmReplacementProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCancellationStatus
 * SecuritiesTradeStatus.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCancellationRight
 * SecuritiesTradeStatus.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTransferStatus
 * SecuritiesTradeStatus.mmTransferStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAllegedStatus
 * SecuritiesTradeStatus.mmAllegedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmCollateralAllocationStatus
 * SecuritiesTradeStatus.mmCollateralAllocationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRepoCallRequestStatus
 * SecuritiesTradeStatus.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmSettlementConditionModificationStatus
 * SecuritiesTradeStatus.mmSettlementConditionModificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingProcess
 * SecuritiesTradeStatus.mmMatchingProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmRelatedSecuritiesTransfer
 * SecuritiesTradeStatus.mmRelatedSecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTradeConfirmationStatus
 * SecuritiesTradeStatus.mmTradeConfirmationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmStatus
 * SecuritiesTransfer.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmSecuritiesTradeStatus
 * SecuritiesTradeStatusReason.mmSecuritiesTradeStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus2Choice#mmProprietary
 * MatchingStatus2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice#mmProprietary
 * MatchingStatus7Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus2Choice#mmPending
 * SettlementStatus2Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus2Choice#mmFailing
 * SettlementStatus2Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus2Choice#mmProprietary
 * SettlementStatus2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice#mmPending
 * SettlementStatus7Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice#mmFailing
 * SettlementStatus7Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice#mmProprietary
 * SettlementStatus7Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus18Choice#mmProprietary
 * MatchingStatus18Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus13Choice#mmPending
 * SettlementStatus13Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus13Choice#mmFailing
 * SettlementStatus13Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus13Choice#mmProprietary
 * SettlementStatus13Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus6Choice#mmProprietary
 * MatchingStatus6Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus4Choice#mmPending
 * SettlementStatus4Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus4Choice#mmFailing
 * SettlementStatus4Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus4Choice#mmProprietary
 * SettlementStatus4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#mmProprietaryStatus
 * MatchingStatus9Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#mmProprietaryStatus
 * CancellationProcessingStatus6Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmStatus
 * CancellationStatusAndReason.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#mmStatus
 * CancellationStatusAndReason2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmStatus
 * TransferStatusAndReason.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmStatus
 * TransferStatusAndReason2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus3Choice#mmProprietary
 * MatchingStatus3Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus2Choice#mmProprietary
 * RepoCallRequestStatus2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters1#mmStatus
 * AdditionalQueryParameters1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters3#mmStatus
 * AdditionalQueryParameters3.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus4Choice#mmProprietary
 * MatchingStatus4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus4Choice#mmProprietary
 * RepoCallRequestStatus4Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus12Choice#mmProprietary
 * MatchingStatus12Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus10Choice#mmPending
 * SettlementStatus10Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus10Choice#mmFailing
 * SettlementStatus10Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus10Choice#mmProprietary
 * SettlementStatus10Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus5Choice#mmProprietary
 * RepoCallRequestStatus5Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus16Choice#mmProprietary
 * MatchingStatus16Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus12Choice#mmPending
 * SettlementStatus12Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus12Choice#mmFailing
 * SettlementStatus12Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus12Choice#mmProprietary
 * SettlementStatus12Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus6Choice#mmProprietary
 * RepoCallRequestStatus6Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters2#mmStatus
 * AdditionalQueryParameters2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters4#mmStatus
 * AdditionalQueryParameters4.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5#mmStatus
 * AdditionalQueryParameters5.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters6#mmStatus
 * AdditionalQueryParameters6.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus9Choice#mmPending
 * SettlementStatus9Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus9Choice#mmFailing
 * SettlementStatus9Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus9Choice#mmProprietary
 * SettlementStatus9Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus15Choice#mmPending
 * SettlementStatus15Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus15Choice#mmFailing
 * SettlementStatus15Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus15Choice#mmProprietary
 * SettlementStatus15Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus34Choice#mmProprietary
 * ProcessingStatus34Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason1#mmSettlementStatus
 * IntraPositionStatusAndReason1.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason1#mmSettled
 * IntraPositionStatusAndReason1.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus1#mmType
 * IntraPositionQueryStatus1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmStatus
 * TransferStatus1Choice.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7#mmStatus
 * AdditionalQueryParameters7.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus20Choice#mmProprietary
 * MatchingStatus20Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice#mmProprietary
 * MatchingStatus19Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus37Choice#mmProprietary
 * ProcessingStatus37Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus21Choice#mmProprietary
 * MatchingStatus21Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters8#mmStatus
 * AdditionalQueryParameters8.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus42Choice#mmProprietary
 * ProcessingStatus42Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus22Choice#mmProprietary
 * MatchingStatus22Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmProprietaryStatus
 * MatchingStatus23Choice.mmProprietaryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9#mmStatus
 * AdditionalQueryParameters9.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters10#mmStatus
 * AdditionalQueryParameters10.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice#mmPending
 * SettlementStatus16Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice#mmFailing
 * SettlementStatus16Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus16Choice#mmProprietary
 * SettlementStatus16Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice#mmProprietary
 * ProcessingStatus48Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice#mmProprietary
 * MatchingStatus24Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#mmPending
 * SettlementStatus17Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#mmFailing
 * SettlementStatus17Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#mmProprietary
 * SettlementStatus17Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11#mmStatus
 * AdditionalQueryParameters11.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice#mmProprietary
 * MatchingStatus26Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice#mmProprietary
 * RepoCallRequestStatus7Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice#mmPending
 * SettlementStatus18Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice#mmFailing
 * SettlementStatus18Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice#mmProprietary
 * SettlementStatus18Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#mmProprietary
 * MatchingStatus25Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmStatus
 * TransferStatus2Choice.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice#mmStatus
 * Status21Choice.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus21Choice#mmPending
 * SettlementStatus21Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus21Choice#mmFailing
 * SettlementStatus21Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus21Choice#mmProprietary
 * SettlementStatus21Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus9Choice#mmProprietary
 * RepoCallRequestStatus9Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice#mmProprietary
 * MatchingStatus29Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalQueryParameters12#mmStatus
 * AdditionalQueryParameters12.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus20Choice#mmPending
 * SettlementStatus20Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus20Choice#mmFailing
 * SettlementStatus20Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus20Choice#mmProprietary
 * SettlementStatus20Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice#mmProprietary
 * ProcessingStatus63Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus32Choice#mmProprietary
 * MatchingStatus32Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus30Choice#mmProprietary
 * MatchingStatus30Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice#mmPending
 * SettlementStatus22Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice#mmFailing
 * SettlementStatus22Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice#mmProprietary
 * SettlementStatus22Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus2#mmType
 * IntraPositionQueryStatus2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProcessingStatus66Choice#mmProprietary
 * ProcessingStatus66Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason2#mmSettlementStatus
 * IntraPositionStatusAndReason2.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason2#mmSettled
 * IntraPositionStatusAndReason2.mmSettled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus2Choice
 * MatchingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus7Choice
 * MatchingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus2Choice
 * SettlementStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus7Choice
 * SettlementStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus18Choice
 * MatchingStatus18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus13Choice
 * SettlementStatus13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus1Choice
 * MatchingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus1Choice
 * AffirmationStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus5Choice
 * MatchingStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus2Choice
 * AffirmationStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus6Choice
 * MatchingStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus4Choice
 * SettlementStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice
 * AffirmationStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice
 * AffirmationStatus6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus2Choice
 * InstructionProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus9Choice
 * MatchingStatus9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice
 * CancellationProcessingStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus8Choice
 * MatchingStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationRight1
 * CancellationRight1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferCancellationStatus
 * TransferCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationStatusAndReason
 * CancellationStatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferCancellationStatus2
 * TransferCancellationStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2
 * CancellationStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstructionStatus
 * TransferInstructionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason
 * TransferStatusAndReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstructionStatus2
 * TransferInstructionStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason2
 * TransferStatusAndReason2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1
 * TradeTransactionStatusAndReason1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2
 * TradeTransactionStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus3Choice
 * MatchingStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus2Choice
 * RepoCallRequestStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementStatus1Choice
 * AllegementStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllocationSatus1Choice
 * AllocationSatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus1Choice
 * RepoCallRequestStatus1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus1Choice
 * CancellationProcessingStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters1
 * AdditionalQueryParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus5Choice
 * SettlementStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters3
 * AdditionalQueryParameters3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus4Choice
 * MatchingStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus4Choice
 * RepoCallRequestStatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus12Choice
 * MatchingStatus12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus10Choice
 * SettlementStatus10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus5Choice
 * RepoCallRequestStatus5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus16Choice
 * MatchingStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus12Choice
 * SettlementStatus12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus6Choice
 * RepoCallRequestStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementStatus2Choice
 * AllegementStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllocationSatus2Choice
 * AllocationSatus2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus3Choice
 * RepoCallRequestStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus5Choice
 * InstructionProcessingStatus5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus2Choice
 * CancellationProcessingStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters2
 * AdditionalQueryParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus6Choice
 * SettlementStatus6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters4
 * AdditionalQueryParameters4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters5
 * AdditionalQueryParameters5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters6
 * AdditionalQueryParameters6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus9Choice
 * SettlementStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus15Choice
 * SettlementStatus15Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus3Choice
 * CancellationProcessingStatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason1
 * IntraPositionStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionStatusType1
 * IntraPositionStatusType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus1
 * IntraPositionQueryStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason3
 * TransferStatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransferStatus1Choice
 * TransferStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstructionStatus3
 * TransferInstructionStatus3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters7
 * AdditionalQueryParameters7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus20Choice
 * MatchingStatus20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus19Choice
 * MatchingStatus19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus21Choice
 * MatchingStatus21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters8
 * AdditionalQueryParameters8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus22Choice
 * MatchingStatus22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProcessingStatus43Choice
 * ProcessingStatus43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus23Choice
 * MatchingStatus23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters9
 * AdditionalQueryParameters9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters10
 * AdditionalQueryParameters10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeConfirmation1Choice
 * TradeConfirmation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus16Choice
 * SettlementStatus16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus24Choice
 * MatchingStatus24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus17Choice
 * SettlementStatus17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters11
 * AdditionalQueryParameters11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus26Choice
 * MatchingStatus26Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice
 * RepoCallRequestStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus18Choice
 * SettlementStatus18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus8Choice
 * RepoCallRequestStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice
 * AffirmationStatus8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus27Choice
 * MatchingStatus27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus25Choice
 * MatchingStatus25Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus23Choice
 * InstructionProcessingStatus23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllocationSatus3Choice
 * AllocationSatus3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementStatus3Choice
 * AllegementStatus3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus7Choice
 * CancellationProcessingStatus7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus19Choice
 * SettlementStatus19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationStatusAndReason3
 * CancellationStatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason4
 * TransferStatusAndReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstructionStatus4
 * TransferInstructionStatus4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransferStatus2Choice
 * TransferStatus2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus21Choice
 * SettlementStatus21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus9Choice
 * RepoCallRequestStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus29Choice
 * MatchingStatus29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalQueryParameters12
 * AdditionalQueryParameters12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus20Choice
 * SettlementStatus20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus32Choice
 * MatchingStatus32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AffirmationStatus9Choice
 * AffirmationStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus28Choice
 * MatchingStatus28Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus8Choice
 * CancellationProcessingStatus8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus10Choice
 * RepoCallRequestStatus10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus26Choice
 * InstructionProcessingStatus26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus25Choice
 * SettlementStatus25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllocationSatus4Choice
 * AllocationSatus4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MatchingStatus30Choice
 * MatchingStatus30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus22Choice
 * SettlementStatus22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AllegementStatus4Choice
 * AllegementStatus4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus9Choice
 * CancellationProcessingStatus9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionQueryStatus2
 * IntraPositionQueryStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionStatusType2
 * IntraPositionStatusType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason2
 * IntraPositionStatusAndReason2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
 * TransferStatusAndReason5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CancellationStatusAndReason4
 * CancellationStatusAndReason4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PortfolioTransferStatus1Choice
 * PortfolioTransferStatus1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a securities trade."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesTradeStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected MatchingStatusCode matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingStatusCode
	 * MatchingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus2Choice#mmMatched
	 * MatchingStatus2Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice#mmMatched
	 * MatchingStatus7Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmInferredMatchingStatus
	 * StatusTrail2.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail2#mmMatchingStatus
	 * StatusTrail2.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus18Choice#mmMatched
	 * MatchingStatus18Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmInferredMatchingStatus
	 * StatusTrail3.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail3#mmMatchingStatus
	 * StatusTrail3.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus1Choice#mmCode
	 * MatchingStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus1Choice#mmProprietary
	 * MatchingStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmMatchingStatus
	 * SecuritiesTradeDetails25.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmMatchingStatus
	 * SecuritiesTradeDetails26.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus5Choice#mmCode
	 * MatchingStatus5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus5Choice#mmProprietary
	 * MatchingStatus5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmMatchingStatus
	 * SecuritiesTradeDetails27.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmMatchingStatus
	 * SecuritiesTradeDetails28.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmMatchingStatus
	 * SecuritiesTradeDetails3.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmMatchingStatus
	 * SecuritiesTradeDetails11.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmMatchingStatus
	 * SecuritiesTradeDetails1.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3#mmInferredMatchingStatus
	 * StatusAndReason3.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason3#mmMatchingStatus
	 * StatusAndReason3.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmMatchingStatus
	 * SecuritiesTradeDetails15.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus6Choice#mmMatched
	 * MatchingStatus6Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6#mmInferredMatchingStatus
	 * StatusAndReason6.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason6#mmMatchingStatus
	 * StatusAndReason6.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#mmInferredMatchingStatus
	 * StatusAndReason12.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason12#mmMatchingStatus
	 * StatusAndReason12.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#mmInferredMatchingStatus
	 * StatusAndReason14.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason14#mmMatchingStatus
	 * StatusAndReason14.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#mmMatchingStatus
	 * Status2Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status2Choice#mmInferredMatchingStatus
	 * Status2Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#mmMatchingStatus
	 * Status4Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status4Choice#mmInferredMatchingStatus
	 * Status4Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#mmMatchingStatus
	 * Status9Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status9Choice#mmInferredMatchingStatus
	 * Status9Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#mmMatchingStatus
	 * Status11Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status11Choice#mmInferredMatchingStatus
	 * Status11Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#mmMatched
	 * MatchingStatus9Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#mmMatchedWithTolerance
	 * MatchingStatus9Choice.mmMatchedWithTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#mmMatchingAlleged
	 * MatchingStatus9Choice.mmMatchingAlleged}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus8Choice#mmCode
	 * MatchingStatus8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus8Choice#mmProprietary
	 * MatchingStatus8Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmMatchStatus
	 * Order16.mmMatchStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmMatchStatus
	 * Order14.mmMatchStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus3Choice#mmMatched
	 * MatchingStatus3Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmInferredMatchingStatus
	 * Status1Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmMatchingStatus
	 * Status1Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmInferredMatchingStatus
	 * Status8Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmMatchingStatus
	 * Status8Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus4Choice#mmMatched
	 * MatchingStatus4Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus12Choice#mmMatched
	 * MatchingStatus12Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus16Choice#mmMatched
	 * MatchingStatus16Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmInferredMatchingStatus
	 * Status3Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmMatchingStatus
	 * Status3Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmInferredMatchingStatus
	 * Status10Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmMatchingStatus
	 * Status10Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#mmMatchingStatus
	 * Status15Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status15Choice#mmInferredMatchingStatus
	 * Status15Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus20Choice#mmMatched
	 * MatchingStatus20Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmMatchingStatus
	 * SecuritiesTradeDetails33.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#mmInferredMatchingStatus
	 * StatusAndReason19.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason19#mmMatchingStatus
	 * StatusAndReason19.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice#mmMatched
	 * MatchingStatus19Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmMatchingStatus
	 * SecuritiesTradeDetails37.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmMatchingStatus
	 * SecuritiesTradeDetails34.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmMatchingStatus
	 * SecuritiesTradeDetails32.mmMatchingStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmMatchStatus
	 * Order17.mmMatchStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmMatchStatus
	 * Order18.mmMatchStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmMatchingStatus
	 * SecuritiesTradeDetails44.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#mmInferredMatchingStatus
	 * StatusAndReason20.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason20#mmMatchingStatus
	 * StatusAndReason20.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus21Choice#mmMatched
	 * MatchingStatus21Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmMatchingStatus
	 * SecuritiesTradeDetails40.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus22Choice#mmMatched
	 * MatchingStatus22Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#mmMatchingStatus
	 * Status16Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status16Choice#mmInferredMatchingStatus
	 * Status16Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmMatchingStatus
	 * SecuritiesTradeDetails46.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmMatchingStatus
	 * SecuritiesTradeDetails47.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmMatched
	 * MatchingStatus23Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmMatchedWithTolerance
	 * MatchingStatus23Choice.mmMatchedWithTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmMatchingAlleged
	 * MatchingStatus23Choice.mmMatchingAlleged}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmInferredMatchingStatus
	 * StatusTrail4.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail4#mmMatchingStatus
	 * StatusTrail4.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmInferredMatchingStatus
	 * StatusTrail5.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmMatchingStatus
	 * StatusTrail5.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmInferredMatchingStatus
	 * StatusAndReason28.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason28#mmMatchingStatus
	 * StatusAndReason28.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmMatchingStatus
	 * SecuritiesTradeDetails51.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmInferredMatchingStatus
	 * StatusTrail6.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail6#mmMatchingStatus
	 * StatusTrail6.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice#mmMatched
	 * MatchingStatus24Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmMatchingStatus
	 * SecuritiesTradeDetails56.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice#mmMatched
	 * MatchingStatus26Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmMatchingStatus
	 * SecuritiesTradeDetails52.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus27Choice#mmCode
	 * MatchingStatus27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus27Choice#mmProprietary
	 * MatchingStatus27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmMatchingStatus
	 * Status18Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmInferredMatchingStatus
	 * Status18Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmMatchingStatus
	 * SecuritiesTradeDetails50.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#mmMatched
	 * MatchingStatus25Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmInferredMatchingStatus
	 * Status19Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmMatchingStatus
	 * Status19Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmMatchingStatus
	 * SecuritiesTradeDetails59.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice#mmMatched
	 * MatchingStatus29Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmMatchingStatus
	 * SecuritiesTradeDetails63.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#mmInferredMatchingStatus
	 * StatusAndReason29.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason29#mmMatchingStatus
	 * StatusAndReason29.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmInferredMatchingStatus
	 * StatusTrail7.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusTrail7#mmMatchingStatus
	 * StatusTrail7.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus32Choice#mmMatched
	 * MatchingStatus32Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus28Choice#mmCode
	 * MatchingStatus28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus28Choice#mmProprietary
	 * MatchingStatus28Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmInferredMatchingStatus
	 * Status22Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmMatchingStatus
	 * Status22Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#mmMatchingStatus
	 * Status23Choice.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status23Choice#mmInferredMatchingStatus
	 * Status23Choice.mmInferredMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus30Choice#mmMatched
	 * MatchingStatus30Choice.mmMatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmMatchingStatus
	 * SecuritiesTradeDetails65.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmMatchingStatus
	 * SecuritiesTradeDetails66.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmMatchingStatus
	 * SecuritiesTradeDetails67.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmMatchingStatus
	 * SecuritiesTradeDetails70.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmMatchingStatus
	 * SecuritiesTradeDetails73.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmMatchingStatus
	 * SecuritiesTradeDetails75.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmMatchingStatus
	 * SecuritiesTradeDetails77.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmMatchingStatus
	 * SecuritiesTradeDetails78.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmMatchingStatus
	 * SecuritiesTradeDetails79.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails83#mmMatchingStatus
	 * SecuritiesTradeDetails83.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87#mmMatchingStatus
	 * SecuritiesTradeDetails87.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88#mmMatchingStatus
	 * SecuritiesTradeDetails88.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89#mmMatchingStatus
	 * SecuritiesTradeDetails89.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90#mmMatchingStatus
	 * SecuritiesTradeDetails90.mmMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of matching of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, MatchingStatusCode> mmMatchingStatus = new MMBusinessAttribute<SecuritiesTradeStatus, MatchingStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(MatchingStatus2Choice.mmMatched, MatchingStatus7Choice.mmMatched, StatusTrail2.mmInferredMatchingStatus, StatusTrail2.mmMatchingStatus, MatchingStatus18Choice.mmMatched,
					StatusTrail3.mmInferredMatchingStatus, StatusTrail3.mmMatchingStatus, MatchingStatus1Choice.mmCode, MatchingStatus1Choice.mmProprietary, SecuritiesTradeDetails25.mmMatchingStatus,
					SecuritiesTradeDetails26.mmMatchingStatus, MatchingStatus5Choice.mmCode, MatchingStatus5Choice.mmProprietary, SecuritiesTradeDetails27.mmMatchingStatus, SecuritiesTradeDetails28.mmMatchingStatus,
					SecuritiesTradeDetails3.mmMatchingStatus, SecuritiesTradeDetails11.mmMatchingStatus, SecuritiesTradeDetails1.mmMatchingStatus, StatusAndReason3.mmInferredMatchingStatus, StatusAndReason3.mmMatchingStatus,
					SecuritiesTradeDetails15.mmMatchingStatus, MatchingStatus6Choice.mmMatched, StatusAndReason6.mmInferredMatchingStatus, StatusAndReason6.mmMatchingStatus, StatusAndReason12.mmInferredMatchingStatus,
					StatusAndReason12.mmMatchingStatus, StatusAndReason14.mmInferredMatchingStatus, StatusAndReason14.mmMatchingStatus, Status2Choice.mmMatchingStatus, Status2Choice.mmInferredMatchingStatus, Status4Choice.mmMatchingStatus,
					Status4Choice.mmInferredMatchingStatus, Status9Choice.mmMatchingStatus, Status9Choice.mmInferredMatchingStatus, Status11Choice.mmMatchingStatus, Status11Choice.mmInferredMatchingStatus, MatchingStatus9Choice.mmMatched,
					MatchingStatus9Choice.mmMatchedWithTolerance, MatchingStatus9Choice.mmMatchingAlleged, MatchingStatus8Choice.mmCode, MatchingStatus8Choice.mmProprietary, Order16.mmMatchStatus, Order14.mmMatchStatus,
					MatchingStatus3Choice.mmMatched, Status1Choice.mmInferredMatchingStatus, Status1Choice.mmMatchingStatus, Status8Choice.mmInferredMatchingStatus, Status8Choice.mmMatchingStatus, MatchingStatus4Choice.mmMatched,
					MatchingStatus12Choice.mmMatched, MatchingStatus16Choice.mmMatched, Status3Choice.mmInferredMatchingStatus, Status3Choice.mmMatchingStatus, Status10Choice.mmInferredMatchingStatus, Status10Choice.mmMatchingStatus,
					Status15Choice.mmMatchingStatus, Status15Choice.mmInferredMatchingStatus, MatchingStatus20Choice.mmMatched, SecuritiesTradeDetails33.mmMatchingStatus, StatusAndReason19.mmInferredMatchingStatus,
					StatusAndReason19.mmMatchingStatus, MatchingStatus19Choice.mmMatched, SecuritiesTradeDetails37.mmMatchingStatus, SecuritiesTradeDetails34.mmMatchingStatus, SecuritiesTradeDetails32.mmMatchingStatus,
					Order17.mmMatchStatus, Order18.mmMatchStatus, SecuritiesTradeDetails44.mmMatchingStatus, StatusAndReason20.mmInferredMatchingStatus, StatusAndReason20.mmMatchingStatus, MatchingStatus21Choice.mmMatched,
					SecuritiesTradeDetails40.mmMatchingStatus, MatchingStatus22Choice.mmMatched, Status16Choice.mmMatchingStatus, Status16Choice.mmInferredMatchingStatus, SecuritiesTradeDetails46.mmMatchingStatus,
					SecuritiesTradeDetails47.mmMatchingStatus, MatchingStatus23Choice.mmMatched, MatchingStatus23Choice.mmMatchedWithTolerance, MatchingStatus23Choice.mmMatchingAlleged, StatusTrail4.mmInferredMatchingStatus,
					StatusTrail4.mmMatchingStatus, StatusTrail5.mmInferredMatchingStatus, StatusTrail5.mmMatchingStatus, StatusAndReason28.mmInferredMatchingStatus, StatusAndReason28.mmMatchingStatus,
					SecuritiesTradeDetails51.mmMatchingStatus, StatusTrail6.mmInferredMatchingStatus, StatusTrail6.mmMatchingStatus, MatchingStatus24Choice.mmMatched, SecuritiesTradeDetails56.mmMatchingStatus,
					MatchingStatus26Choice.mmMatched, SecuritiesTradeDetails52.mmMatchingStatus, MatchingStatus27Choice.mmCode, MatchingStatus27Choice.mmProprietary, Status18Choice.mmMatchingStatus, Status18Choice.mmInferredMatchingStatus,
					SecuritiesTradeDetails50.mmMatchingStatus, MatchingStatus25Choice.mmMatched, Status19Choice.mmInferredMatchingStatus, Status19Choice.mmMatchingStatus, SecuritiesTradeDetails59.mmMatchingStatus,
					MatchingStatus29Choice.mmMatched, SecuritiesTradeDetails63.mmMatchingStatus, StatusAndReason29.mmInferredMatchingStatus, StatusAndReason29.mmMatchingStatus, StatusTrail7.mmInferredMatchingStatus,
					StatusTrail7.mmMatchingStatus, MatchingStatus32Choice.mmMatched, MatchingStatus28Choice.mmCode, MatchingStatus28Choice.mmProprietary, Status22Choice.mmInferredMatchingStatus, Status22Choice.mmMatchingStatus,
					Status23Choice.mmMatchingStatus, Status23Choice.mmInferredMatchingStatus, MatchingStatus30Choice.mmMatched, SecuritiesTradeDetails65.mmMatchingStatus, SecuritiesTradeDetails66.mmMatchingStatus,
					SecuritiesTradeDetails67.mmMatchingStatus, SecuritiesTradeDetails70.mmMatchingStatus, SecuritiesTradeDetails73.mmMatchingStatus, SecuritiesTradeDetails75.mmMatchingStatus, SecuritiesTradeDetails77.mmMatchingStatus,
					SecuritiesTradeDetails78.mmMatchingStatus, SecuritiesTradeDetails79.mmMatchingStatus, SecuritiesTradeDetails83.mmMatchingStatus, SecuritiesTradeDetails87.mmMatchingStatus, SecuritiesTradeDetails88.mmMatchingStatus,
					SecuritiesTradeDetails89.mmMatchingStatus, SecuritiesTradeDetails90.mmMatchingStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingStatus";
			definition = "Status of matching of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MatchingStatusCode.mmObject();
		}

		@Override
		public MatchingStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, MatchingStatusCode value) {
			obj.setMatchingStatus(value);
		}
	};
	protected AffirmationStatusCode affirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmationStatusCode
	 * AffirmationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus1Choice#mmCode
	 * AffirmationStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus1Choice#mmProprietary
	 * AffirmationStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmAffirmationStatus
	 * SecuritiesTradeDetails25.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmAffirmationStatus
	 * SecuritiesTradeDetails26.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus2Choice#mmCode
	 * AffirmationStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus2Choice#mmProprietary
	 * AffirmationStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmAffirmationStatus
	 * SecuritiesTradeDetails27.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmAffirmationStatus
	 * SecuritiesTradeDetails28.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmAffirmationStatus
	 * SecuritiesTradeDetails3.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmAffirmationStatus
	 * SecuritiesTradeDetails11.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmAffirmationStatus
	 * SecuritiesTradeDetails1.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmAffirmationStatus
	 * SecuritiesTradeDetails15.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice#mmCode
	 * AffirmationStatus7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus7Choice#mmProprietary
	 * AffirmationStatus7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason10#mmAffirmationStatus
	 * StatusAndReason10.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#mmAffirmed
	 * AffirmationStatus6Choice.mmAffirmed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#mmUnaffirmed
	 * AffirmationStatus6Choice.mmUnaffirmed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#mmProprietaryStatus
	 * AffirmationStatus6Choice.mmProprietaryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmAffirmationStatus
	 * Status1Choice.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmAffirmationStatus
	 * Status8Choice.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmAffirmationStatus
	 * Status3Choice.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmAffirmationStatus
	 * Status10Choice.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmAffirmationStatus
	 * SecuritiesTradeDetails33.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmAffirmationStatus
	 * SecuritiesTradeDetails37.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmAffirmationStatus
	 * SecuritiesTradeDetails34.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmAffirmationStatus
	 * SecuritiesTradeDetails32.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmAffirmationStatus
	 * SecuritiesTradeDetails44.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmAffirmationStatus
	 * SecuritiesTradeDetails40.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmAffirmationStatus
	 * SecuritiesTradeDetails46.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmAffirmationStatus
	 * SecuritiesTradeDetails47.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmAffirmationStatus
	 * SecuritiesTradeDetails51.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmAffirmationStatus
	 * SecuritiesTradeDetails56.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice#mmCode
	 * AffirmationStatus8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus8Choice#mmProprietary
	 * AffirmationStatus8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmAffirmationStatus
	 * SecuritiesTradeDetails52.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmAffirmationStatus
	 * SecuritiesTradeDetails50.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmAffirmationStatus
	 * Status19Choice.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmAffirmationStatus
	 * SecuritiesTradeDetails59.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmAffirmationStatus
	 * SecuritiesTradeDetails63.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus9Choice#mmCode
	 * AffirmationStatus9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus9Choice#mmProprietary
	 * AffirmationStatus9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmAffirmationStatus
	 * Status22Choice.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmAffirmationStatus
	 * SecuritiesTradeDetails65.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmAffirmationStatus
	 * SecuritiesTradeDetails66.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmAffirmationStatus
	 * SecuritiesTradeDetails67.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmAffirmationStatus
	 * SecuritiesTradeDetails70.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmAffirmationStatus
	 * SecuritiesTradeDetails73.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmAffirmationStatus
	 * SecuritiesTradeDetails75.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmAffirmationStatus
	 * SecuritiesTradeDetails77.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmAffirmationStatus
	 * SecuritiesTradeDetails78.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmAffirmationStatus
	 * SecuritiesTradeDetails79.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails83#mmAffirmationStatus
	 * SecuritiesTradeDetails83.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87#mmAffirmationStatus
	 * SecuritiesTradeDetails87.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88#mmAffirmationStatus
	 * SecuritiesTradeDetails88.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89#mmAffirmationStatus
	 * SecuritiesTradeDetails89.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90#mmAffirmationStatus
	 * SecuritiesTradeDetails90.mmAffirmationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, AffirmationStatusCode> mmAffirmationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, AffirmationStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AffirmationStatus1Choice.mmCode, AffirmationStatus1Choice.mmProprietary, SecuritiesTradeDetails25.mmAffirmationStatus, SecuritiesTradeDetails26.mmAffirmationStatus,
					AffirmationStatus2Choice.mmCode, AffirmationStatus2Choice.mmProprietary, SecuritiesTradeDetails27.mmAffirmationStatus, SecuritiesTradeDetails28.mmAffirmationStatus, SecuritiesTradeDetails3.mmAffirmationStatus,
					SecuritiesTradeDetails11.mmAffirmationStatus, SecuritiesTradeDetails1.mmAffirmationStatus, SecuritiesTradeDetails15.mmAffirmationStatus, AffirmationStatus7Choice.mmCode, AffirmationStatus7Choice.mmProprietary,
					StatusAndReason10.mmAffirmationStatus, AffirmationStatus6Choice.mmAffirmed, AffirmationStatus6Choice.mmUnaffirmed, AffirmationStatus6Choice.mmProprietaryStatus, Status1Choice.mmAffirmationStatus,
					Status8Choice.mmAffirmationStatus, Status3Choice.mmAffirmationStatus, Status10Choice.mmAffirmationStatus, SecuritiesTradeDetails33.mmAffirmationStatus, SecuritiesTradeDetails37.mmAffirmationStatus,
					SecuritiesTradeDetails34.mmAffirmationStatus, SecuritiesTradeDetails32.mmAffirmationStatus, SecuritiesTradeDetails44.mmAffirmationStatus, SecuritiesTradeDetails40.mmAffirmationStatus,
					SecuritiesTradeDetails46.mmAffirmationStatus, SecuritiesTradeDetails47.mmAffirmationStatus, SecuritiesTradeDetails51.mmAffirmationStatus, SecuritiesTradeDetails56.mmAffirmationStatus, AffirmationStatus8Choice.mmCode,
					AffirmationStatus8Choice.mmProprietary, SecuritiesTradeDetails52.mmAffirmationStatus, SecuritiesTradeDetails50.mmAffirmationStatus, Status19Choice.mmAffirmationStatus, SecuritiesTradeDetails59.mmAffirmationStatus,
					SecuritiesTradeDetails63.mmAffirmationStatus, AffirmationStatus9Choice.mmCode, AffirmationStatus9Choice.mmProprietary, Status22Choice.mmAffirmationStatus, SecuritiesTradeDetails65.mmAffirmationStatus,
					SecuritiesTradeDetails66.mmAffirmationStatus, SecuritiesTradeDetails67.mmAffirmationStatus, SecuritiesTradeDetails70.mmAffirmationStatus, SecuritiesTradeDetails73.mmAffirmationStatus,
					SecuritiesTradeDetails75.mmAffirmationStatus, SecuritiesTradeDetails77.mmAffirmationStatus, SecuritiesTradeDetails78.mmAffirmationStatus, SecuritiesTradeDetails79.mmAffirmationStatus,
					SecuritiesTradeDetails83.mmAffirmationStatus, SecuritiesTradeDetails87.mmAffirmationStatus, SecuritiesTradeDetails88.mmAffirmationStatus, SecuritiesTradeDetails89.mmAffirmationStatus,
					SecuritiesTradeDetails90.mmAffirmationStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AffirmationStatus";
			definition = "Status of affirmation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AffirmationStatusCode.mmObject();
		}

		@Override
		public AffirmationStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getAffirmationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, AffirmationStatusCode value) {
			obj.setAffirmationStatus(value);
		}
	};
	protected List<SecuritiesTradeStatusReason> reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmSecuritiesTradeStatus
	 * SecuritiesTradeStatusReason.mmSecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus2Choice#mmUnmatched
	 * MatchingStatus2Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus7Choice#mmUnmatched
	 * MatchingStatus7Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus18Choice#mmUnmatched
	 * MatchingStatus18Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmDeliveryReturnReason
	 * SettlementDetails50.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmDeliveryReturnReason
	 * SettlementDetails51.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmDeliveryReturnReason
	 * SettlementDetails1.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmDeliveryReturnReason
	 * SettlementDetails19.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus6Choice#mmUnmatched
	 * MatchingStatus6Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmDeliveryReturnReason
	 * SettlementDetails22.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmDeliveryReturnReason
	 * SettlementDetails35.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmDeliveryReturnReason
	 * SettlementDetails42.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmDeliveryReturnReason
	 * SettlementDetails52.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus9Choice#mmUnmatched
	 * MatchingStatus9Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#mmCancellationPending
	 * CancellationProcessingStatus6Choice.mmCancellationPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmRejected
	 * CancellationStatusAndReason.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason#mmComplete
	 * CancellationStatusAndReason.mmComplete}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#mmRejected
	 * CancellationStatusAndReason2.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#mmComplete
	 * CancellationStatusAndReason2.mmComplete}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason2#mmPending
	 * CancellationStatusAndReason2.mmPending}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmPendingSettlement
	 * TransferStatusAndReason.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmUnmatched
	 * TransferStatusAndReason.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmInRepair
	 * TransferStatusAndReason.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason#mmRejected
	 * TransferStatusAndReason.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmPendingSettlement
	 * TransferStatusAndReason2.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmUnmatched
	 * TransferStatusAndReason2.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmInRepair
	 * TransferStatusAndReason2.mmInRepair}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmRejected
	 * TransferStatusAndReason2.mmRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmFailedSettlement
	 * TransferStatusAndReason2.mmFailedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmCancelled
	 * TransferStatusAndReason2.mmCancelled}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason2#mmReversed
	 * TransferStatusAndReason2.mmReversed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus3Choice#mmUnmatched
	 * MatchingStatus3Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus4Choice#mmUnmatched
	 * MatchingStatus4Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus12Choice#mmUnmatched
	 * MatchingStatus12Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus16Choice#mmUnmatched
	 * MatchingStatus16Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason1#mmProcessingStatus
	 * IntraPositionStatusAndReason1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#mmProcessingStatus
	 * IntraPositionModification2.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1#mmProcessingStatus
	 * IntraPositionModification1.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus1Choice#mmReversed
	 * TransferStatus1Choice.mmReversed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmDeliveryReturnReason
	 * SettlementDetails67.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmDeliveryReturnReason
	 * SettlementDetails68.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus20Choice#mmUnmatched
	 * MatchingStatus20Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus19Choice#mmUnmatched
	 * MatchingStatus19Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmDeliveryReturnReason
	 * SettlementDetails81.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus21Choice#mmUnmatched
	 * MatchingStatus21Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus22Choice#mmUnmatched
	 * MatchingStatus22Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmDeliveryReturnReason
	 * SettlementDetails83.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmUnmatched
	 * MatchingStatus23Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmDeliveryReturnReason
	 * SettlementDetails93.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice#mmUnmatched
	 * MatchingStatus24Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice#mmUnmatched
	 * MatchingStatus26Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmDeliveryReturnReason
	 * SettlementDetails94.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus25Choice#mmUnmatched
	 * MatchingStatus25Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice#mmReversed
	 * TransferStatus2Choice.mmReversed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmDeliveryReturnReason
	 * SettlementDetails101.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus29Choice#mmUnmatched
	 * MatchingStatus29Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmDeliveryReturnReason
	 * SettlementDetails111.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmDeliveryReturnReason
	 * SettlementDetails112.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus32Choice#mmUnmatched
	 * MatchingStatus32Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus30Choice#mmUnmatched
	 * MatchingStatus30Choice.mmUnmatched}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmDeliveryReturnReason
	 * SettlementDetails113.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification3#mmProcessingStatus
	 * IntraPositionModification3.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification4#mmProcessingStatus
	 * IntraPositionModification4.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionStatusAndReason2#mmProcessingStatus
	 * IntraPositionStatusAndReason2.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmDeliveryReturnReason
	 * SettlementDetails120.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmDeliveryReturnReason
	 * SettlementDetails119.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmDeliveryReturnReason
	 * SettlementDetails122.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmDeliveryReturnReason
	 * SettlementDetails137.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmDeliveryReturnReason
	 * SettlementDetails132.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmDeliveryReturnReason
	 * SettlementDetails138.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmDeliveryReturnReason
	 * SettlementDetails140.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmDeliveryReturnReason
	 * SettlementDetails142.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmDeliveryReturnReason
	 * SettlementDetails145.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmDeliveryReturnReason
	 * SettlementDetails146.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmDeliveryReturnReason
	 * SettlementDetails156.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmDeliveryReturnReason
	 * SettlementDetails157.mmDeliveryReturnReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmDeliveryReturnReason
	 * SettlementDetails158.mmDeliveryReturnReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTradeStatus, List<SecuritiesTradeStatusReason>> mmReason = new MMBusinessAssociationEnd<SecuritiesTradeStatus, List<SecuritiesTradeStatusReason>>() {
		{
			derivation_lazy = () -> Arrays.asList(MatchingStatus2Choice.mmUnmatched, MatchingStatus7Choice.mmUnmatched, MatchingStatus18Choice.mmUnmatched, SettlementDetails50.mmDeliveryReturnReason,
					SettlementDetails51.mmDeliveryReturnReason, SettlementDetails1.mmDeliveryReturnReason, SettlementDetails19.mmDeliveryReturnReason, MatchingStatus6Choice.mmUnmatched, SettlementDetails22.mmDeliveryReturnReason,
					SettlementDetails35.mmDeliveryReturnReason, SettlementDetails42.mmDeliveryReturnReason, SettlementDetails52.mmDeliveryReturnReason, MatchingStatus9Choice.mmUnmatched,
					CancellationProcessingStatus6Choice.mmCancellationPending, CancellationStatusAndReason.mmRejected, CancellationStatusAndReason.mmComplete, CancellationStatusAndReason2.mmRejected,
					CancellationStatusAndReason2.mmComplete, CancellationStatusAndReason2.mmPending, TransferStatusAndReason.mmPendingSettlement, TransferStatusAndReason.mmUnmatched, TransferStatusAndReason.mmInRepair,
					TransferStatusAndReason.mmRejected, TransferStatusAndReason2.mmPendingSettlement, TransferStatusAndReason2.mmUnmatched, TransferStatusAndReason2.mmInRepair, TransferStatusAndReason2.mmRejected,
					TransferStatusAndReason2.mmFailedSettlement, TransferStatusAndReason2.mmCancelled, TransferStatusAndReason2.mmReversed, MatchingStatus3Choice.mmUnmatched, MatchingStatus4Choice.mmUnmatched,
					MatchingStatus12Choice.mmUnmatched, MatchingStatus16Choice.mmUnmatched, IntraPositionStatusAndReason1.mmProcessingStatus, IntraPositionModification2.mmProcessingStatus, IntraPositionModification1.mmProcessingStatus,
					TransferStatus1Choice.mmReversed, SettlementDetails67.mmDeliveryReturnReason, SettlementDetails68.mmDeliveryReturnReason, MatchingStatus20Choice.mmUnmatched, MatchingStatus19Choice.mmUnmatched,
					SettlementDetails81.mmDeliveryReturnReason, MatchingStatus21Choice.mmUnmatched, MatchingStatus22Choice.mmUnmatched, SettlementDetails83.mmDeliveryReturnReason, MatchingStatus23Choice.mmUnmatched,
					SettlementDetails93.mmDeliveryReturnReason, MatchingStatus24Choice.mmUnmatched, MatchingStatus26Choice.mmUnmatched, SettlementDetails94.mmDeliveryReturnReason, MatchingStatus25Choice.mmUnmatched,
					TransferStatus2Choice.mmReversed, SettlementDetails101.mmDeliveryReturnReason, MatchingStatus29Choice.mmUnmatched, SettlementDetails111.mmDeliveryReturnReason, SettlementDetails112.mmDeliveryReturnReason,
					MatchingStatus32Choice.mmUnmatched, MatchingStatus30Choice.mmUnmatched, SettlementDetails113.mmDeliveryReturnReason, IntraPositionModification3.mmProcessingStatus, IntraPositionModification4.mmProcessingStatus,
					IntraPositionStatusAndReason2.mmProcessingStatus, SettlementDetails120.mmDeliveryReturnReason, SettlementDetails119.mmDeliveryReturnReason, SettlementDetails122.mmDeliveryReturnReason,
					SettlementDetails137.mmDeliveryReturnReason, SettlementDetails132.mmDeliveryReturnReason, SettlementDetails138.mmDeliveryReturnReason, SettlementDetails140.mmDeliveryReturnReason,
					SettlementDetails142.mmDeliveryReturnReason, SettlementDetails145.mmDeliveryReturnReason, SettlementDetails146.mmDeliveryReturnReason, SettlementDetails156.mmDeliveryReturnReason,
					SettlementDetails157.mmDeliveryReturnReason, SettlementDetails158.mmDeliveryReturnReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Specifies the reasons for the status. It is derived from the relationship between Status and Status Reason.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesTradeStatusReason.mmSecuritiesTradeStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeStatusReason.mmObject();
		}

		@Override
		public List<SecuritiesTradeStatusReason> getValue(SecuritiesTradeStatus obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, List<SecuritiesTradeStatusReason> value) {
			obj.setReason(value);
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesTrade> securitiesTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
	 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trade which has a specific status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTradeStatus, List<SecuritiesTrade>> mmSecuritiesTrade = new MMBusinessAssociationEnd<SecuritiesTradeStatus, List<SecuritiesTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Specifies the trade which has a specific status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}

		@Override
		public List<SecuritiesTrade> getValue(SecuritiesTradeStatus obj) {
			return obj.getSecuritiesTrade();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, List<SecuritiesTrade> value) {
			obj.setSecuritiesTrade(value);
		}
	};
	protected TransactionStatusCode transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatusCode
	 * TransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction2#mmBookingStatus
	 * InvestmentFundTransaction2.mmBookingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmBookingStatus
	 * InvestmentFundTransaction3.mmBookingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmBookingStatus
	 * InvestmentFundTransaction4.mmBookingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an investment fund transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, TransactionStatusCode> mmTransactionStatus = new MMBusinessAttribute<SecuritiesTradeStatus, TransactionStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentFundTransaction2.mmBookingStatus, InvestmentFundTransaction3.mmBookingStatus, InvestmentFundTransaction4.mmBookingStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionStatus";
			definition = "Status of an investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionStatusCode.mmObject();
		}

		@Override
		public TransactionStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getTransactionStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, TransactionStatusCode value) {
			obj.setTransactionStatus(value);
		}
	};
	protected ReplacementProcessingStatusCode replacementProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReplacementProcessingStatusCode
	 * ReplacementProcessingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus1Choice#mmCode
	 * ReplacementProcessingStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus2Choice#mmCode
	 * ReplacementProcessingStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus8Choice#mmCode
	 * ReplacementProcessingStatus8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReplacementProcessingStatus9Choice#mmCode
	 * ReplacementProcessingStatus9Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacementProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the processing status of the replacement request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, ReplacementProcessingStatusCode> mmReplacementProcessingStatus = new MMBusinessAttribute<SecuritiesTradeStatus, ReplacementProcessingStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ReplacementProcessingStatus1Choice.mmCode, ReplacementProcessingStatus2Choice.mmCode, ReplacementProcessingStatus8Choice.mmCode, ReplacementProcessingStatus9Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReplacementProcessingStatus";
			definition = "Provides the processing status of the replacement request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReplacementProcessingStatusCode.mmObject();
		}

		@Override
		public ReplacementProcessingStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getReplacementProcessingStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, ReplacementProcessingStatusCode value) {
			obj.setReplacementProcessingStatus(value);
		}
	};
	protected CancellationStatusCode cancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatusCode
	 * CancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#mmCancellationRequested
	 * CancellationProcessingStatus6Choice.mmCancellationRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus6Choice#mmCancellationCompleted
	 * CancellationProcessingStatus6Choice.mmCancellationCompleted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationStatus#mmStatus
	 * TransferCancellationStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferCancellationStatus2#mmStatus
	 * TransferCancellationStatus2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the cancellation of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, CancellationStatusCode> mmCancellationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, CancellationStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationProcessingStatus6Choice.mmCancellationRequested, CancellationProcessingStatus6Choice.mmCancellationCompleted, TransferCancellationStatus.mmStatus,
					TransferCancellationStatus2.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationStatusCode.mmObject();
		}

		@Override
		public CancellationStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getCancellationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, CancellationStatusCode value) {
			obj.setCancellationStatus(value);
		}
	};
	protected CancellationRightCode cancellationRight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRightCode
	 * CancellationRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CancellationRight1#mmStructured
	 * CancellationRight1.mmStructured}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, CancellationRightCode> mmCancellationRight = new MMBusinessAttribute<SecuritiesTradeStatus, CancellationRightCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CancellationRight1.mmStructured);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationRightCode.mmObject();
		}

		@Override
		public CancellationRightCode getValue(SecuritiesTradeStatus obj) {
			return obj.getCancellationRight();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, CancellationRightCode value) {
			obj.setCancellationRight(value);
		}
	};
	protected TransferStatusCode transferStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferStatusCode
	 * TransferStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus#mmStatus
	 * TransferInstructionStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus2#mmStatus
	 * TransferInstructionStatus2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason3#mmTransferStatus
	 * TransferStatusAndReason3.mmTransferStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus3#mmStatus
	 * TransferInstructionStatus3.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason4#mmTransferStatus
	 * TransferStatusAndReason4.mmTransferStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferInstructionStatus4#mmStatus
	 * TransferInstructionStatus4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmTransferStatus
	 * TransferStatusAndReason5.mmTransferStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the transfer is accepted, sent to next party, matched, already executed, or settled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, TransferStatusCode> mmTransferStatus = new MMBusinessAttribute<SecuritiesTradeStatus, TransferStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TransferInstructionStatus.mmStatus, TransferInstructionStatus2.mmStatus, TransferStatusAndReason3.mmTransferStatus, TransferInstructionStatus3.mmStatus,
					TransferStatusAndReason4.mmTransferStatus, TransferInstructionStatus4.mmStatus, TransferStatusAndReason5.mmTransferStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferStatus";
			definition = "Status of the transfer is accepted, sent to next party, matched, already executed, or settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransferStatusCode.mmObject();
		}

		@Override
		public TransferStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getTransferStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, TransferStatusCode value) {
			obj.setTransferStatus(value);
		}
	};
	protected AllegementStatusCode allegedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllegementStatusCode
	 * AllegementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus1Choice#mmCode
	 * AllegementStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus1Choice#mmProprietary
	 * AllegementStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmStatus
	 * SecuritiesTradeDetails4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmStatus
	 * SecuritiesTradeDetails17.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus2Choice#mmCode
	 * AllegementStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus2Choice#mmProprietary
	 * AllegementStatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmStatus
	 * SecuritiesTradeDetails10.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmStatus
	 * SecuritiesTradeDetails22.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmStatus
	 * SecuritiesTradeDetails23.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmStatus
	 * SecuritiesTradeDetails29.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmStatus
	 * SecuritiesTradeDetails35.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmStatus
	 * SecuritiesTradeDetails42.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmStatus
	 * SecuritiesTradeDetails49.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus3Choice#mmCode
	 * AllegementStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus3Choice#mmProprietary
	 * AllegementStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmStatus
	 * SecuritiesTradeDetails61.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus4Choice#mmCode
	 * AllegementStatus4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllegementStatus4Choice#mmProprietary
	 * AllegementStatus4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmStatus
	 * SecuritiesTradeDetails68.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmStatus
	 * SecuritiesTradeDetails69.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71#mmStatus
	 * SecuritiesTradeDetails71.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmStatus
	 * SecuritiesTradeDetails72.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PortfolioTransferStatus1Choice#mmCode
	 * PortfolioTransferStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PortfolioTransferStatus1Choice#mmProprietary
	 * PortfolioTransferStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81#mmStatus
	 * SecuritiesTradeDetails81.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85#mmStatus
	 * SecuritiesTradeDetails85.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of an allegement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, AllegementStatusCode> mmAllegedStatus = new MMBusinessAttribute<SecuritiesTradeStatus, AllegementStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AllegementStatus1Choice.mmCode, AllegementStatus1Choice.mmProprietary, SecuritiesTradeDetails4.mmStatus, SecuritiesTradeDetails17.mmStatus, AllegementStatus2Choice.mmCode,
					AllegementStatus2Choice.mmProprietary, SecuritiesTradeDetails10.mmStatus, SecuritiesTradeDetails22.mmStatus, SecuritiesTradeDetails23.mmStatus, SecuritiesTradeDetails29.mmStatus, SecuritiesTradeDetails35.mmStatus,
					SecuritiesTradeDetails42.mmStatus, SecuritiesTradeDetails49.mmStatus, AllegementStatus3Choice.mmCode, AllegementStatus3Choice.mmProprietary, SecuritiesTradeDetails61.mmStatus, AllegementStatus4Choice.mmCode,
					AllegementStatus4Choice.mmProprietary, SecuritiesTradeDetails68.mmStatus, SecuritiesTradeDetails69.mmStatus, SecuritiesTradeDetails71.mmStatus, SecuritiesTradeDetails72.mmStatus, PortfolioTransferStatus1Choice.mmCode,
					PortfolioTransferStatus1Choice.mmProprietary, SecuritiesTradeDetails81.mmStatus, SecuritiesTradeDetails85.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllegedStatus";
			definition = "Provides the status of an allegement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllegementStatusCode.mmObject();
		}

		@Override
		public AllegementStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getAllegedStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, AllegementStatusCode value) {
			obj.setAllegedStatus(value);
		}
	};
	protected AllocationStatusCode collateralAllocationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationStatusCode
	 * AllocationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus1Choice#mmCode
	 * AllocationSatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus1Choice#mmProprietary
	 * AllocationSatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmAllocationStatus
	 * Status1Choice.mmAllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmAllocationStatus
	 * Status8Choice.mmAllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus2Choice#mmCode
	 * AllocationSatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus2Choice#mmProprietary
	 * AllocationSatus2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmAllocationStatus
	 * Status3Choice.mmAllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmAllocationStatus
	 * Status10Choice.mmAllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus3Choice#mmCode
	 * AllocationSatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus3Choice#mmProprietary
	 * AllocationSatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmAllocationStatus
	 * Status19Choice.mmAllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmAllocationStatus
	 * Status22Choice.mmAllocationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus4Choice#mmCode
	 * AllocationSatus4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AllocationSatus4Choice#mmProprietary
	 * AllocationSatus4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAllocationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of allocation of collateral to cover the instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, AllocationStatusCode> mmCollateralAllocationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, AllocationStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AllocationSatus1Choice.mmCode, AllocationSatus1Choice.mmProprietary, Status1Choice.mmAllocationStatus, Status8Choice.mmAllocationStatus, AllocationSatus2Choice.mmCode,
					AllocationSatus2Choice.mmProprietary, Status3Choice.mmAllocationStatus, Status10Choice.mmAllocationStatus, AllocationSatus3Choice.mmCode, AllocationSatus3Choice.mmProprietary, Status19Choice.mmAllocationStatus,
					Status22Choice.mmAllocationStatus, AllocationSatus4Choice.mmCode, AllocationSatus4Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAllocationStatus";
			definition = "Provides the status of allocation of collateral to cover the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AllocationStatusCode.mmObject();
		}

		@Override
		public AllocationStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getCollateralAllocationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, AllocationStatusCode value) {
			obj.setCollateralAllocationStatus(value);
		}
	};
	protected RepoCallRequestStatusCode repoCallRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallRequestStatusCode
	 * RepoCallRequestStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus1Choice#mmCode
	 * RepoCallRequestStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus1Choice#mmProprietary
	 * RepoCallRequestStatus1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmRepoCallRequestStatus
	 * Status1Choice.mmRepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmRepoCallRequestStatus
	 * Status8Choice.mmRepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus3Choice#mmCode
	 * RepoCallRequestStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus3Choice#mmProprietary
	 * RepoCallRequestStatus3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmRepoCallRequestStatus
	 * Status3Choice.mmRepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmRepoCallRequestStatus
	 * Status10Choice.mmRepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus8Choice#mmCode
	 * RepoCallRequestStatus8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus8Choice#mmProprietary
	 * RepoCallRequestStatus8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmRepoCallRequestStatus
	 * Status19Choice.mmRepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmRepoCallRequestStatus
	 * Status22Choice.mmRepoCallRequestStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus10Choice#mmCode
	 * RepoCallRequestStatus10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus10Choice#mmProprietary
	 * RepoCallRequestStatus10Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the status of the repurchase agreement call processed instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, RepoCallRequestStatusCode> mmRepoCallRequestStatus = new MMBusinessAttribute<SecuritiesTradeStatus, RepoCallRequestStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RepoCallRequestStatus1Choice.mmCode, RepoCallRequestStatus1Choice.mmProprietary, Status1Choice.mmRepoCallRequestStatus, Status8Choice.mmRepoCallRequestStatus,
					RepoCallRequestStatus3Choice.mmCode, RepoCallRequestStatus3Choice.mmProprietary, Status3Choice.mmRepoCallRequestStatus, Status10Choice.mmRepoCallRequestStatus, RepoCallRequestStatus8Choice.mmCode,
					RepoCallRequestStatus8Choice.mmProprietary, Status19Choice.mmRepoCallRequestStatus, Status22Choice.mmRepoCallRequestStatus, RepoCallRequestStatus10Choice.mmCode, RepoCallRequestStatus10Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Specifies additional information about the status of the repurchase agreement call processed instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepoCallRequestStatusCode.mmObject();
		}

		@Override
		public RepoCallRequestStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getRepoCallRequestStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, RepoCallRequestStatusCode value) {
			obj.setRepoCallRequestStatus(value);
		}
	};
	protected SettlementConditionModificationStatusStatusCode settlementConditionModificationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
	 * SettlementConditionModificationStatusStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus1Choice#mmCode
	 * SettlementConditionModificationStatus1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status1Choice#mmSettlementConditionModificationStatus
	 * Status1Choice.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status8Choice#mmSettlementConditionModificationStatus
	 * Status8Choice.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus2Choice#mmCode
	 * SettlementConditionModificationStatus2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status3Choice#mmSettlementConditionModificationStatus
	 * Status3Choice.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status10Choice#mmSettlementConditionModificationStatus
	 * Status10Choice.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status19Choice#mmSettlementConditionModificationStatus
	 * Status19Choice.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus3Choice#mmCode
	 * SettlementConditionModificationStatus3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status22Choice#mmSettlementConditionModificationStatus
	 * Status22Choice.mmSettlementConditionModificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementConditionModificationStatus4Choice#mmCode
	 * SettlementConditionModificationStatus4Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementConditionModificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the securities settlement condition modification request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, SettlementConditionModificationStatusStatusCode> mmSettlementConditionModificationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, SettlementConditionModificationStatusStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementConditionModificationStatus1Choice.mmCode, Status1Choice.mmSettlementConditionModificationStatus, Status8Choice.mmSettlementConditionModificationStatus,
					SettlementConditionModificationStatus2Choice.mmCode, Status3Choice.mmSettlementConditionModificationStatus, Status10Choice.mmSettlementConditionModificationStatus, Status19Choice.mmSettlementConditionModificationStatus,
					SettlementConditionModificationStatus3Choice.mmCode, Status22Choice.mmSettlementConditionModificationStatus, SettlementConditionModificationStatus4Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementConditionModificationStatus";
			definition = "Provides the status of the securities settlement condition modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
		}

		@Override
		public SettlementConditionModificationStatusStatusCode getValue(SecuritiesTradeStatus obj) {
			return obj.getSettlementConditionModificationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, SettlementConditionModificationStatusStatusCode value) {
			obj.setSettlementConditionModificationStatus(value);
		}
	};
	protected MatchingProcessCode matchingProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MatchingProcessCode
	 * MatchingProcessCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the matching status of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, MatchingProcessCode> mmMatchingProcess = new MMBusinessAttribute<SecuritiesTradeStatus, MatchingProcessCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingProcess";
			definition = "Specifies the matching status of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MatchingProcessCode.mmObject();
		}

		@Override
		public MatchingProcessCode getValue(SecuritiesTradeStatus obj) {
			return obj.getMatchingProcess();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, MatchingProcessCode value) {
			obj.setMatchingProcess(value);
		}
	};
	protected SecuritiesTransfer relatedSecuritiesTransfer;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmStatus
	 * SecuritiesTransfer.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer operation for which a status is provided"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesTradeStatus, SecuritiesTransfer> mmRelatedSecuritiesTransfer = new MMBusinessAssociationEnd<SecuritiesTradeStatus, SecuritiesTransfer>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesTransfer";
			definition = "Transfer operation for which a status is provided";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesTransfer.mmStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}

		@Override
		public SecuritiesTransfer getValue(SecuritiesTradeStatus obj) {
			return obj.getRelatedSecuritiesTransfer();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, SecuritiesTransfer value) {
			obj.setRelatedSecuritiesTransfer(value);
		}
	};
	protected TradeConfirmationTypeCode tradeConfirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationTypeCode
	 * TradeConfirmationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecuritiesTradeStatus, TradeConfirmationTypeCode> mmTradeConfirmationStatus = new MMBusinessAttribute<SecuritiesTradeStatus, TradeConfirmationTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeConfirmationStatus";
			definition = "Specifies whether the contract was electronically confirmed, non-electronically confirmed or remains unconfirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeConfirmationTypeCode.mmObject();
		}

		@Override
		public TradeConfirmationTypeCode getValue(SecuritiesTradeStatus obj) {
			return obj.getTradeConfirmationStatus();
		}

		@Override
		public void setValue(SecuritiesTradeStatus obj, TradeConfirmationTypeCode value) {
			obj.setTradeConfirmationStatus(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeStatus";
				definition = "Status of a securities trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeStatus, SecuritiesTransfer.mmStatus, SecuritiesTradeStatusReason.mmSecuritiesTradeStatus);
				derivationElement_lazy = () -> Arrays.asList(MatchingStatus2Choice.mmProprietary, MatchingStatus7Choice.mmProprietary, SettlementStatus2Choice.mmPending, SettlementStatus2Choice.mmFailing,
						SettlementStatus2Choice.mmProprietary, SettlementStatus7Choice.mmPending, SettlementStatus7Choice.mmFailing, SettlementStatus7Choice.mmProprietary, MatchingStatus18Choice.mmProprietary,
						SettlementStatus13Choice.mmPending, SettlementStatus13Choice.mmFailing, SettlementStatus13Choice.mmProprietary, MatchingStatus6Choice.mmProprietary, SettlementStatus4Choice.mmPending,
						SettlementStatus4Choice.mmFailing, SettlementStatus4Choice.mmProprietary, MatchingStatus9Choice.mmProprietaryStatus, CancellationProcessingStatus6Choice.mmProprietaryStatus, CancellationStatusAndReason.mmStatus,
						CancellationStatusAndReason2.mmStatus, TransferStatusAndReason.mmStatus, TransferStatusAndReason2.mmStatus, MatchingStatus3Choice.mmProprietary, RepoCallRequestStatus2Choice.mmProprietary,
						AdditionalQueryParameters1.mmStatus, AdditionalQueryParameters3.mmStatus, MatchingStatus4Choice.mmProprietary, RepoCallRequestStatus4Choice.mmProprietary, MatchingStatus12Choice.mmProprietary,
						SettlementStatus10Choice.mmPending, SettlementStatus10Choice.mmFailing, SettlementStatus10Choice.mmProprietary, RepoCallRequestStatus5Choice.mmProprietary, MatchingStatus16Choice.mmProprietary,
						SettlementStatus12Choice.mmPending, SettlementStatus12Choice.mmFailing, SettlementStatus12Choice.mmProprietary, RepoCallRequestStatus6Choice.mmProprietary, AdditionalQueryParameters2.mmStatus,
						AdditionalQueryParameters4.mmStatus, AdditionalQueryParameters5.mmStatus, AdditionalQueryParameters6.mmStatus, SettlementStatus9Choice.mmPending, SettlementStatus9Choice.mmFailing,
						SettlementStatus9Choice.mmProprietary, SettlementStatus15Choice.mmPending, SettlementStatus15Choice.mmFailing, SettlementStatus15Choice.mmProprietary, ProcessingStatus34Choice.mmProprietary,
						IntraPositionStatusAndReason1.mmSettlementStatus, IntraPositionStatusAndReason1.mmSettled, IntraPositionQueryStatus1.mmType, TransferStatus1Choice.mmStatus, AdditionalQueryParameters7.mmStatus,
						MatchingStatus20Choice.mmProprietary, MatchingStatus19Choice.mmProprietary, ProcessingStatus37Choice.mmProprietary, MatchingStatus21Choice.mmProprietary, AdditionalQueryParameters8.mmStatus,
						ProcessingStatus42Choice.mmProprietary, MatchingStatus22Choice.mmProprietary, MatchingStatus23Choice.mmProprietaryStatus, AdditionalQueryParameters9.mmStatus, AdditionalQueryParameters10.mmStatus,
						SettlementStatus16Choice.mmPending, SettlementStatus16Choice.mmFailing, SettlementStatus16Choice.mmProprietary, ProcessingStatus48Choice.mmProprietary, MatchingStatus24Choice.mmProprietary,
						SettlementStatus17Choice.mmPending, SettlementStatus17Choice.mmFailing, SettlementStatus17Choice.mmProprietary, AdditionalQueryParameters11.mmStatus, MatchingStatus26Choice.mmProprietary,
						RepoCallRequestStatus7Choice.mmProprietary, SettlementStatus18Choice.mmPending, SettlementStatus18Choice.mmFailing, SettlementStatus18Choice.mmProprietary, MatchingStatus25Choice.mmProprietary,
						TransferStatus2Choice.mmStatus, Status21Choice.mmStatus, SettlementStatus21Choice.mmPending, SettlementStatus21Choice.mmFailing, SettlementStatus21Choice.mmProprietary, RepoCallRequestStatus9Choice.mmProprietary,
						MatchingStatus29Choice.mmProprietary, AdditionalQueryParameters12.mmStatus, SettlementStatus20Choice.mmPending, SettlementStatus20Choice.mmFailing, SettlementStatus20Choice.mmProprietary,
						ProcessingStatus63Choice.mmProprietary, MatchingStatus32Choice.mmProprietary, MatchingStatus30Choice.mmProprietary, SettlementStatus22Choice.mmPending, SettlementStatus22Choice.mmFailing,
						SettlementStatus22Choice.mmProprietary, IntraPositionQueryStatus2.mmType, ProcessingStatus66Choice.mmProprietary, IntraPositionStatusAndReason2.mmSettlementStatus, IntraPositionStatusAndReason2.mmSettled);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeStatus.mmMatchingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmAffirmationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmReason, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSecuritiesTrade, com.tools20022.repository.entity.SecuritiesTradeStatus.mmTransactionStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmReplacementProcessingStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmCancellationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmCancellationRight, com.tools20022.repository.entity.SecuritiesTradeStatus.mmTransferStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmAllegedStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmCollateralAllocationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmRepoCallRequestStatus, com.tools20022.repository.entity.SecuritiesTradeStatus.mmSettlementConditionModificationStatus,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmMatchingProcess, com.tools20022.repository.entity.SecuritiesTradeStatus.mmRelatedSecuritiesTransfer,
						com.tools20022.repository.entity.SecuritiesTradeStatus.mmTradeConfirmationStatus);
				derivationComponent_lazy = () -> Arrays.asList(MatchingStatus2Choice.mmObject(), MatchingStatus7Choice.mmObject(), SettlementStatus2Choice.mmObject(), SettlementStatus7Choice.mmObject(), MatchingStatus18Choice.mmObject(),
						SettlementStatus13Choice.mmObject(), MatchingStatus1Choice.mmObject(), AffirmationStatus1Choice.mmObject(), MatchingStatus5Choice.mmObject(), AffirmationStatus2Choice.mmObject(), MatchingStatus6Choice.mmObject(),
						SettlementStatus4Choice.mmObject(), AffirmationStatus7Choice.mmObject(), AffirmationStatus6Choice.mmObject(), InstructionProcessingStatus2Choice.mmObject(), MatchingStatus9Choice.mmObject(),
						CancellationProcessingStatus6Choice.mmObject(), MatchingStatus8Choice.mmObject(), CancellationRight1.mmObject(), TransferCancellationStatus.mmObject(), CancellationStatusAndReason.mmObject(),
						TransferCancellationStatus2.mmObject(), CancellationStatusAndReason2.mmObject(), TransferInstructionStatus.mmObject(), TransferStatusAndReason.mmObject(), TransferInstructionStatus2.mmObject(),
						TransferStatusAndReason2.mmObject(), TradeTransactionStatusAndReason1.mmObject(), TradeTransactionStatusAndReason2.mmObject(), MatchingStatus3Choice.mmObject(), RepoCallRequestStatus2Choice.mmObject(),
						AllegementStatus1Choice.mmObject(), AllocationSatus1Choice.mmObject(), RepoCallRequestStatus1Choice.mmObject(), CancellationProcessingStatus1Choice.mmObject(), AdditionalQueryParameters1.mmObject(),
						SettlementStatus5Choice.mmObject(), AdditionalQueryParameters3.mmObject(), MatchingStatus4Choice.mmObject(), RepoCallRequestStatus4Choice.mmObject(), MatchingStatus12Choice.mmObject(),
						SettlementStatus10Choice.mmObject(), RepoCallRequestStatus5Choice.mmObject(), MatchingStatus16Choice.mmObject(), SettlementStatus12Choice.mmObject(), RepoCallRequestStatus6Choice.mmObject(),
						AllegementStatus2Choice.mmObject(), AllocationSatus2Choice.mmObject(), RepoCallRequestStatus3Choice.mmObject(), InstructionProcessingStatus5Choice.mmObject(), CancellationProcessingStatus2Choice.mmObject(),
						AdditionalQueryParameters2.mmObject(), SettlementStatus6Choice.mmObject(), AdditionalQueryParameters4.mmObject(), AdditionalQueryParameters5.mmObject(), AdditionalQueryParameters6.mmObject(),
						SettlementStatus9Choice.mmObject(), SettlementStatus15Choice.mmObject(), CancellationProcessingStatus3Choice.mmObject(), IntraPositionStatusAndReason1.mmObject(), IntraPositionStatusType1.mmObject(),
						IntraPositionQueryStatus1.mmObject(), TransferStatusAndReason3.mmObject(), TransferStatus1Choice.mmObject(), TransferInstructionStatus3.mmObject(), AdditionalQueryParameters7.mmObject(),
						MatchingStatus20Choice.mmObject(), MatchingStatus19Choice.mmObject(), MatchingStatus21Choice.mmObject(), AdditionalQueryParameters8.mmObject(), MatchingStatus22Choice.mmObject(), ProcessingStatus43Choice.mmObject(),
						MatchingStatus23Choice.mmObject(), AdditionalQueryParameters9.mmObject(), AdditionalQueryParameters10.mmObject(), TradeConfirmation1Choice.mmObject(), SettlementStatus16Choice.mmObject(),
						MatchingStatus24Choice.mmObject(), SettlementStatus17Choice.mmObject(), AdditionalQueryParameters11.mmObject(), MatchingStatus26Choice.mmObject(), RepoCallRequestStatus7Choice.mmObject(),
						SettlementStatus18Choice.mmObject(), RepoCallRequestStatus8Choice.mmObject(), AffirmationStatus8Choice.mmObject(), MatchingStatus27Choice.mmObject(), MatchingStatus25Choice.mmObject(),
						InstructionProcessingStatus23Choice.mmObject(), AllocationSatus3Choice.mmObject(), AllegementStatus3Choice.mmObject(), CancellationProcessingStatus7Choice.mmObject(), SettlementStatus19Choice.mmObject(),
						CancellationStatusAndReason3.mmObject(), TransferStatusAndReason4.mmObject(), TransferInstructionStatus4.mmObject(), TransferStatus2Choice.mmObject(), SettlementStatus21Choice.mmObject(),
						RepoCallRequestStatus9Choice.mmObject(), MatchingStatus29Choice.mmObject(), AdditionalQueryParameters12.mmObject(), SettlementStatus20Choice.mmObject(), MatchingStatus32Choice.mmObject(),
						AffirmationStatus9Choice.mmObject(), MatchingStatus28Choice.mmObject(), CancellationProcessingStatus8Choice.mmObject(), RepoCallRequestStatus10Choice.mmObject(), InstructionProcessingStatus26Choice.mmObject(),
						SettlementStatus25Choice.mmObject(), AllocationSatus4Choice.mmObject(), MatchingStatus30Choice.mmObject(), SettlementStatus22Choice.mmObject(), AllegementStatus4Choice.mmObject(),
						CancellationProcessingStatus9Choice.mmObject(), IntraPositionQueryStatus2.mmObject(), IntraPositionStatusType2.mmObject(), IntraPositionStatusAndReason2.mmObject(), TransferStatusAndReason5.mmObject(),
						CancellationStatusAndReason4.mmObject(), PortfolioTransferStatus1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MatchingStatusCode getMatchingStatus() {
		return matchingStatus;
	}

	public SecuritiesTradeStatus setMatchingStatus(MatchingStatusCode matchingStatus) {
		this.matchingStatus = Objects.requireNonNull(matchingStatus);
		return this;
	}

	public AffirmationStatusCode getAffirmationStatus() {
		return affirmationStatus;
	}

	public SecuritiesTradeStatus setAffirmationStatus(AffirmationStatusCode affirmationStatus) {
		this.affirmationStatus = Objects.requireNonNull(affirmationStatus);
		return this;
	}

	public List<SecuritiesTradeStatusReason> getReason() {
		return reason == null ? reason = new ArrayList<>() : reason;
	}

	public SecuritiesTradeStatus setReason(List<SecuritiesTradeStatusReason> reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public List<SecuritiesTrade> getSecuritiesTrade() {
		return securitiesTrade == null ? securitiesTrade = new ArrayList<>() : securitiesTrade;
	}

	public SecuritiesTradeStatus setSecuritiesTrade(List<com.tools20022.repository.entity.SecuritiesTrade> securitiesTrade) {
		this.securitiesTrade = Objects.requireNonNull(securitiesTrade);
		return this;
	}

	public TransactionStatusCode getTransactionStatus() {
		return transactionStatus;
	}

	public SecuritiesTradeStatus setTransactionStatus(TransactionStatusCode transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public ReplacementProcessingStatusCode getReplacementProcessingStatus() {
		return replacementProcessingStatus;
	}

	public SecuritiesTradeStatus setReplacementProcessingStatus(ReplacementProcessingStatusCode replacementProcessingStatus) {
		this.replacementProcessingStatus = Objects.requireNonNull(replacementProcessingStatus);
		return this;
	}

	public CancellationStatusCode getCancellationStatus() {
		return cancellationStatus;
	}

	public SecuritiesTradeStatus setCancellationStatus(CancellationStatusCode cancellationStatus) {
		this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
		return this;
	}

	public CancellationRightCode getCancellationRight() {
		return cancellationRight;
	}

	public SecuritiesTradeStatus setCancellationRight(CancellationRightCode cancellationRight) {
		this.cancellationRight = Objects.requireNonNull(cancellationRight);
		return this;
	}

	public TransferStatusCode getTransferStatus() {
		return transferStatus;
	}

	public SecuritiesTradeStatus setTransferStatus(TransferStatusCode transferStatus) {
		this.transferStatus = Objects.requireNonNull(transferStatus);
		return this;
	}

	public AllegementStatusCode getAllegedStatus() {
		return allegedStatus;
	}

	public SecuritiesTradeStatus setAllegedStatus(AllegementStatusCode allegedStatus) {
		this.allegedStatus = Objects.requireNonNull(allegedStatus);
		return this;
	}

	public AllocationStatusCode getCollateralAllocationStatus() {
		return collateralAllocationStatus;
	}

	public SecuritiesTradeStatus setCollateralAllocationStatus(AllocationStatusCode collateralAllocationStatus) {
		this.collateralAllocationStatus = Objects.requireNonNull(collateralAllocationStatus);
		return this;
	}

	public RepoCallRequestStatusCode getRepoCallRequestStatus() {
		return repoCallRequestStatus;
	}

	public SecuritiesTradeStatus setRepoCallRequestStatus(RepoCallRequestStatusCode repoCallRequestStatus) {
		this.repoCallRequestStatus = Objects.requireNonNull(repoCallRequestStatus);
		return this;
	}

	public SettlementConditionModificationStatusStatusCode getSettlementConditionModificationStatus() {
		return settlementConditionModificationStatus;
	}

	public SecuritiesTradeStatus setSettlementConditionModificationStatus(SettlementConditionModificationStatusStatusCode settlementConditionModificationStatus) {
		this.settlementConditionModificationStatus = Objects.requireNonNull(settlementConditionModificationStatus);
		return this;
	}

	public MatchingProcessCode getMatchingProcess() {
		return matchingProcess;
	}

	public SecuritiesTradeStatus setMatchingProcess(MatchingProcessCode matchingProcess) {
		this.matchingProcess = Objects.requireNonNull(matchingProcess);
		return this;
	}

	public SecuritiesTransfer getRelatedSecuritiesTransfer() {
		return relatedSecuritiesTransfer;
	}

	public SecuritiesTradeStatus setRelatedSecuritiesTransfer(SecuritiesTransfer relatedSecuritiesTransfer) {
		this.relatedSecuritiesTransfer = Objects.requireNonNull(relatedSecuritiesTransfer);
		return this;
	}

	public TradeConfirmationTypeCode getTradeConfirmationStatus() {
		return tradeConfirmationStatus;
	}

	public SecuritiesTradeStatus setTradeConfirmationStatus(TradeConfirmationTypeCode tradeConfirmationStatus) {
		this.tradeConfirmationStatus = Objects.requireNonNull(tradeConfirmationStatus);
		return this;
	}
}