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
import com.tools20022.repository.codeset.CopyDuplicateCode;
import com.tools20022.repository.codeset.DataSetTypeCode;
import com.tools20022.repository.codeset.DocumentTypeCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Document" src="doc-files/Document.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmIssueDate
 * Document.mmIssueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCopyDuplicate
 * Document.mmCopyDuplicate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
 * Document.mmPlaceOfStorage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
 * Document.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmType
 * Document.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAmount
 * Document.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmAgreement
 * Document.mmAgreement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPlaceOfIssue
 * Document.mmPlaceOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmDocumentVersion
 * Document.mmDocumentVersion}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmStatus
 * Document.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmReconciliation
 * Document.mmReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmLetterOfCredit
 * Document.mmLetterOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPartyRole
 * Document.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmDataSetType
 * Document.mmDataSetType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmTransport
 * Document.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmSignedIndicator
 * Document.mmSignedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmRemittedAmount
 * Document.mmRemittedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmGuarantee
 * Document.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmLanguage
 * Document.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPurpose
 * Document.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmDocumentIdentification
 * Document.mmDocumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmEvidence
 * Document.mmEvidence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmCommercialTrade
 * Document.mmCommercialTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmPresentation
 * Document.mmPresentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmRelatedContract
 * Document.mmRelatedContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
 * GenericIdentification.mmIdentifiedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmStoredDocument
 * ContactPoint.mmStoredDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmIssuedDocument
 * Location.mmIssuedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Agreement#mmDocument
 * Agreement.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DocumentPartyRole#mmDocument
 * DocumentPartyRole.mmDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
 * PaymentObligation.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
 * Presentation.mmPresentedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
 * CommercialTrade.mmDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
 * Transport.mmTransportDocuments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit#mmDocument
 * LetterOfCredit.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
 * Guarantee.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmDocument
 * Reconciliation.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Evidence#mmRelatedDocument
 * Evidence.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
 * RegisteredContract.mmAttachment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmReferredDocumentInformation
 * StructuredRemittanceInformation6.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation6.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation1#mmUnstructured
 * RemittanceInformation1.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation1#mmStructured
 * RemittanceInformation1.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType2#mmCodeOrProprietary
 * ReferredDocumentType2.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType2#mmCodeOrProprietary
 * CreditorReferenceType2.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#mmReferredDocumentInformation
 * StructuredRemittanceInformation7.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation7.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation5#mmUnstructured
 * RemittanceInformation5.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation5#mmStructured
 * RemittanceInformation5.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmReferredDocumentInformation
 * StructuredRemittanceInformation9.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation9.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7#mmUnstructured
 * RemittanceInformation7.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7#mmStructured
 * RemittanceInformation7.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation2#mmUnstructured
 * RemittanceInformation2.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#mmReferredDocumentInformation
 * StructuredRemittanceInformation8.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation8.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation6#mmUnstructured
 * RemittanceInformation6.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation6#mmStructured
 * RemittanceInformation6.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice#mmUnstructured
 * RemittanceInformation3Choice.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice#mmStructured
 * RemittanceInformation3Choice.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmRemittanceInformation
 * RequestedModification.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification2#mmRemittanceInformation
 * RequestedModification2.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmAdditionalReferenceDocument
 * TradeAgreement6.mmAdditionalReferenceDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmRemittanceInformation
 * RequestedModification3.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation3#mmUnstructured
 * RemittanceInformation3.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation3#mmStructured
 * RemittanceInformation3.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation4#mmUnstructured
 * RemittanceInformation4.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation4#mmStructured
 * RemittanceInformation4.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentLineType1#mmCodeOrProprietary
 * DocumentLineType1.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmReferredDocumentInformation
 * StructuredRemittanceInformation10.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation10.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation8#mmStructured
 * RemittanceInformation8.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmLineDetails
 * ReferredDocumentInformation4.mmLineDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#mmDescription
 * DocumentLineInformation1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GarnishmentType1#mmCodeOrProprietary
 * GarnishmentType1.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation10#mmUnstructured
 * RemittanceInformation10.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation10#mmStructured
 * RemittanceInformation10.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmRemittanceInformation
 * RequestedModification4.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmReferredDocumentInformation
 * StructuredRemittanceInformation12.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation12.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType4#mmCodeOrProprietary
 * ReferredDocumentType4.mmCodeOrProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmRelatedLetter
 * BusinessLetter1.mmRelatedLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmRelatedMessage
 * BusinessLetter1.mmRelatedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmAssociatedDocument
 * BusinessLetter1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#mmHeader
 * EncapsulatedBusinessMessage1.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1#mmMessage
 * EncapsulatedBusinessMessage1.mmMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmRelatedDocument
 * FinancingAgreementList1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmRelatedDocument
 * FinancingItemList1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmRelatedDocument
 * ReconciliationList1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmAssociatedDocument
 * ReconciliationList1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRelatedDocument
 * EventDescription1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRelatedLetter
 * EventDescription1.mmRelatedLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRelatedMessage
 * EventDescription1.mmRelatedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmAssociatedDocument
 * EventDescription1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmAssociatedDocument
 * GuaranteeDetails1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmRemittanceInformation
 * RequestedModification5.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation12#mmStructured
 * RemittanceInformation12.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation11#mmUnstructured
 * RemittanceInformation11.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation11#mmStructured
 * RemittanceInformation11.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmReferredDocumentInformation
 * StructuredRemittanceInformation13.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation13.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmLineDetails
 * ReferredDocumentInformation7.mmLineDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmAdditionalReferenceDocument
 * TradeAgreement13.mmAdditionalReferenceDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmRemittanceInformation
 * RequestedModification6.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation13#mmStructured
 * RemittanceInformation13.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmRemittanceInformation
 * RequestedModification7.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation14#mmReferredDocumentInformation
 * StructuredRemittanceInformation14.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation14#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation14.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation14#mmUnstructured
 * RemittanceInformation14.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation14#mmStructured
 * RemittanceInformation14.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation15#mmUnstructured
 * RemittanceInformation15.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation15#mmStructured
 * RemittanceInformation15.mmStructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmReferredDocumentInformation
 * StructuredRemittanceInformation15.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation15.mmAdditionalRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement16#mmAdditionalReferenceDocument
 * TradeAgreement16.mmAdditionalReferenceDocument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate
 * PrivateCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InsuranceCertificate
 * InsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecurityCertificate
 * SecurityCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeCertificate
 * TradeCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment Assessment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveryNote DeliveryNote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialDocument
 * FinancialDocument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification11
 * DocumentIdentification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification16
 * DocumentIdentification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification9
 * DocumentIdentification9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentIdentification1Choice
 * DocumentIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification14
 * DocumentIdentification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification17
 * DocumentIdentification17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentIdentification2Choice
 * DocumentIdentification2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification21
 * DocumentIdentification21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification12
 * DocumentIdentification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification15
 * DocumentIdentification15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification13
 * DocumentIdentification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification18
 * DocumentIdentification18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification19
 * DocumentIdentification19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification20
 * DocumentIdentification20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType1
 * ReferredDocumentType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation1
 * ReferredDocumentInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice
 * ReferredDocumentAmount1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceType1
 * CreditorReferenceType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6
 * StructuredRemittanceInformation6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation1
 * RemittanceInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice
 * ReferredDocumentType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType2
 * ReferredDocumentType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3
 * ReferredDocumentInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceAmount1
 * RemittanceAmount1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice
 * CreditorReferenceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditorReferenceType2
 * CreditorReferenceType2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7
 * StructuredRemittanceInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation5
 * RemittanceInformation5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceAmount2
 * RemittanceAmount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
 * StructuredRemittanceInformation9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation7
 * RemittanceInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation2
 * RemittanceInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8
 * StructuredRemittanceInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation6
 * RemittanceInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2
 * StructuredRemittanceInformation2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice
 * RemittanceInformation3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification8
 * DocumentIdentification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber1
 * DocumentNumber1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber2
 * DocumentNumber2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber6
 * DocumentNumber6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber5
 * DocumentNumber5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreementClauses1
 * AgreementClauses1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1
 * DocumentGeneralInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2
 * ReferredDocumentInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1 InvoiceHeader1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification22
 * DocumentIdentification22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
 * DocumentGeneralInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification7
 * DocumentIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification23
 * DocumentIdentification23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification3
 * DocumentIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification5
 * DocumentIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification1
 * DocumentIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission1
 * RequiredSubmission1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification4
 * DocumentIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification6
 * DocumentIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification2
 * DocumentIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification10
 * DocumentIdentification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber3
 * DocumentNumber3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber4
 * DocumentNumber4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber7
 * DocumentNumber7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification24
 * DocumentIdentification24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber9
 * DocumentNumber9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification26
 * DocumentIdentification26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber11
 * DocumentNumber11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber8
 * DocumentNumber8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation3
 * RemittanceInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation4
 * RemittanceInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification27
 * DocumentIdentification27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineType1
 * DocumentLineType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
 * StructuredRemittanceInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineIdentification1
 * DocumentLineIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation8
 * RemittanceInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4
 * ReferredDocumentInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentLineInformation1
 * DocumentLineInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DocumentLineType1Choice
 * DocumentLineType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.GarnishmentType1Choice
 * GarnishmentType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GarnishmentType1
 * GarnishmentType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation10
 * RemittanceInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice
 * ReferredDocumentType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6
 * ReferredDocumentInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12
 * StructuredRemittanceInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentType4
 * ReferredDocumentType4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1
 * BusinessLetter1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
 * EncapsulatedBusinessMessage1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingAgreementList1
 * FinancingAgreementList1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1
 * ReconciliationList1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1
 * EventDescription1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
 * QualifiedDocumentInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1
 * SupportingDocumentRequestOrLetter1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification29
 * DocumentIdentification29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1
 * SupportingDocumentEntry1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3
 * DocumentGeneralInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateReference1
 * CertificateReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification28
 * DocumentIdentification28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification30
 * DocumentIdentification30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber12
 * DocumentNumber12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation12
 * RemittanceInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation11
 * RemittanceInformation11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13
 * StructuredRemittanceInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7
 * ReferredDocumentInformation7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber13
 * DocumentNumber13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification31
 * DocumentIdentification31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification32
 * DocumentIdentification32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification33
 * DocumentIdentification33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentIdentification3Choice
 * DocumentIdentification3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification38
 * DocumentIdentification38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification37
 * DocumentIdentification37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification34
 * DocumentIdentification34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DocumentIdentification4Choice
 * DocumentIdentification4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber14
 * DocumentNumber14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification48
 * DocumentIdentification48}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentNumber15
 * DocumentNumber15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification49
 * DocumentIdentification49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2 InvoiceHeader2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation13
 * RemittanceInformation13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredMandateDocument1
 * ReferredMandateDocument1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation14
 * StructuredRemittanceInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation14
 * RemittanceInformation14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation15
 * RemittanceInformation15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15
 * StructuredRemittanceInformation15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DocumentIdentification50
 * DocumentIdentification50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3 InvoiceHeader3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General information that unambiguously identifies a document, such as identification number and issue date time."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#mmCreationDateTime
	 * DocumentIdentification11.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification16#mmCreationDateTime
	 * DocumentIdentification16.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification12#mmCreationDateTime
	 * DocumentIdentification12.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification18#mmCreationDateTime
	 * DocumentIdentification18.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmReferredDocumentRelatedDate
	 * StructuredRemittanceInformation6.mmReferredDocumentRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#mmRelatedDate
	 * ReferredDocumentInformation3.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#mmDateOfIssuance
	 * Undertaking4.mmDateOfIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmDateOfIssuance
	 * Undertaking3.mmDateOfIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmReferredDocumentRelatedDate
	 * StructuredRemittanceInformation2.mmReferredDocumentRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8#mmCreationDateTime
	 * DocumentIdentification8.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1#mmIssueDate
	 * DocumentGeneralInformation1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2#mmRelatedDate
	 * ReferredDocumentInformation2.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#mmIssueDate
	 * OriginalInvoiceInformation1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmIssueDateTime
	 * InvoiceHeader1.mmIssueDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22#mmDateOfIssue
	 * DocumentIdentification22.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmIssueDate
	 * DocumentGeneralInformation2.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7#mmDateOfIssue
	 * DocumentIdentification7.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification23#mmDateOfIssue
	 * DocumentIdentification23.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceIdentification1#mmIssueDate
	 * InvoiceIdentification1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmIssueDate
	 * InsuranceDataSet1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmIssueDate
	 * CertificateDataSet1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmIssueDate
	 * OtherCertificateDataSet1.mmIssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Report4#mmCreationDateTime
	 * Report4.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmCreationDateTime
	 * BillingStatement1.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification27#mmCreationDateTime
	 * DocumentIdentification27.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmInvoiceDate
	 * BillingReport1.mmInvoiceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmInvoiceDate
	 * BillingCancellationReport1.mmInvoiceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineIdentification1#mmRelatedDate
	 * DocumentLineIdentification1.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmRelatedDate
	 * ReferredDocumentInformation4.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmIssueDate
	 * CertificateDataSet2.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6#mmRelatedDate
	 * ReferredDocumentInformation6.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmIssueDate
	 * OtherCertificateDataSet2.mmIssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BusinessLetter1#mmDate
	 * BusinessLetter1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmDate
	 * FinancingAgreementList1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmIssueDate
	 * FinancingItemList1.mmIssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1#mmDate
	 * ReconciliationList1.mmDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1#mmDate
	 * EventDescription1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmDate
	 * QualifiedDocumentInformation1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmIssueDate
	 * FinancialItemParameters1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDate
	 * SupportingDocumentRequestOrLetter1.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmDueDate
	 * SupportingDocumentRequestOrLetter1.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification29#mmDateOfIssue
	 * DocumentIdentification29.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmIssueDate
	 * DocumentGeneralInformation3.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification28#mmDateOfIssue
	 * DocumentIdentification28.mmDateOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmRelatedDate
	 * ReferredDocumentInformation7.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCreationDateTime
	 * BillingStatement2.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmIssueDateTime
	 * InvoiceHeader2.mmIssueDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingReport2#mmInvoiceDate
	 * BillingReport2.mmInvoiceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmRelatedDate
	 * ReferredMandateDocument1.mmRelatedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification50#mmCreationDateTime
	 * DocumentIdentification50.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmIssueDateTime
	 * InvoiceHeader3.mmIssueDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue date of the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, ISODateTime> mmIssueDate = new MMBusinessAttribute<Document, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification11.mmCreationDateTime, DocumentIdentification16.mmCreationDateTime, DocumentIdentification12.mmCreationDateTime, DocumentIdentification18.mmCreationDateTime,
					StructuredRemittanceInformation6.mmReferredDocumentRelatedDate, ReferredDocumentInformation3.mmRelatedDate, Undertaking4.mmDateOfIssuance, Undertaking3.mmDateOfIssuance,
					StructuredRemittanceInformation2.mmReferredDocumentRelatedDate, DocumentIdentification8.mmCreationDateTime, DocumentGeneralInformation1.mmIssueDate, ReferredDocumentInformation2.mmRelatedDate,
					OriginalInvoiceInformation1.mmIssueDate, InvoiceHeader1.mmIssueDateTime, DocumentIdentification22.mmDateOfIssue, DocumentGeneralInformation2.mmIssueDate, DocumentIdentification7.mmDateOfIssue,
					DocumentIdentification23.mmDateOfIssue, InvoiceIdentification1.mmIssueDate, InsuranceDataSet1.mmIssueDate, CertificateDataSet1.mmIssueDate, OtherCertificateDataSet1.mmIssueDate, Report4.mmCreationDateTime,
					BillingStatement1.mmCreationDateTime, DocumentIdentification27.mmCreationDateTime, BillingReport1.mmInvoiceDate, BillingCancellationReport1.mmInvoiceDate, DocumentLineIdentification1.mmRelatedDate,
					ReferredDocumentInformation4.mmRelatedDate, CertificateDataSet2.mmIssueDate, ReferredDocumentInformation6.mmRelatedDate, OtherCertificateDataSet2.mmIssueDate, BusinessLetter1.mmDate, FinancingAgreementList1.mmDate,
					FinancingItemList1.mmIssueDate, ReconciliationList1.mmDate, EventDescription1.mmDate, QualifiedDocumentInformation1.mmDate, FinancialItemParameters1.mmIssueDate, SupportingDocumentRequestOrLetter1.mmDate,
					SupportingDocumentRequestOrLetter1.mmDueDate, DocumentIdentification29.mmDateOfIssue, DocumentGeneralInformation3.mmIssueDate, DocumentIdentification28.mmDateOfIssue, ReferredDocumentInformation7.mmRelatedDate,
					BillingStatement2.mmCreationDateTime, InvoiceHeader2.mmIssueDateTime, BillingReport2.mmInvoiceDate, ReferredMandateDocument1.mmRelatedDate, DocumentIdentification50.mmCreationDateTime, InvoiceHeader3.mmIssueDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Document obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(Document obj, ISODateTime value) {
			obj.setIssueDate(value);
		}
	};
	protected CopyDuplicateCode copyDuplicate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11#mmCopyDuplicate
	 * DocumentIdentification11.mmCopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification16#mmCopyDuplicate
	 * DocumentIdentification16.mmCopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification12#mmCopyDuplicate
	 * DocumentIdentification12.mmCopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification18#mmCopyDuplicate
	 * DocumentIdentification18.mmCopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification27#mmCopyDuplicate
	 * DocumentIdentification27.mmCopyDuplicate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification50#mmCopyDuplicate
	 * DocumentIdentification50.mmCopyDuplicate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if this document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, CopyDuplicateCode> mmCopyDuplicate = new MMBusinessAttribute<Document, CopyDuplicateCode>() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification11.mmCopyDuplicate, DocumentIdentification16.mmCopyDuplicate, DocumentIdentification12.mmCopyDuplicate, DocumentIdentification18.mmCopyDuplicate,
					DocumentIdentification27.mmCopyDuplicate, DocumentIdentification50.mmCopyDuplicate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CopyDuplicate";
			definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CopyDuplicateCode.mmObject();
		}

		@Override
		public CopyDuplicateCode getValue(Document obj) {
			return obj.getCopyDuplicate();
		}

		@Override
		public void setValue(Document obj, CopyDuplicateCode value) {
			obj.setCopyDuplicate(value);
		}
	};
	protected List<ContactPoint> placeOfStorage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmStoredDocument
	 * ContactPoint.mmStoredDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedRemittanceInformation
	 * EntryTransaction1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRelatedRemittanceInformation
	 * EntryTransaction2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmRelatedRemittanceInformation
	 * EntryTransaction3.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedRemittanceInformation
	 * EntryTransaction4.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation9.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation11.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation13.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation10.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation12.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation14.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmRelatedRemittanceInformation
	 * NotificationItem3.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmRelatedRemittanceInformation
	 * OriginalItemReference1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmRelatedRemittanceInformation
	 * NotificationItem4.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmRelatedRemittanceInformation
	 * OriginalItemReference2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation6.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation8.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation17.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmRelatedRemittanceInformation
	 * OriginalItemReference3.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation18.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmRelatedRemittanceInformation
	 * NotificationItem5.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedRemittanceInformation
	 * EntryTransaction7.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation20.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmRelatedRemittanceInformation
	 * OriginalItemReference4.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation19.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedRemittanceInformation
	 * EntryTransaction8.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmRelatedRemittanceInformation
	 * NotificationItem6.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation21.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmRelatedRemittanceInformation
	 * DirectDebitTransactionInformation22.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmRelatedRemittanceInformation
	 * EntryTransaction9.mmRelatedRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfStorage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the document is stored."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, List<ContactPoint>> mmPlaceOfStorage = new MMBusinessAssociationEnd<Document, List<ContactPoint>>() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction1.mmRelatedRemittanceInformation, EntryTransaction2.mmRelatedRemittanceInformation, EntryTransaction3.mmRelatedRemittanceInformation,
					EntryTransaction4.mmRelatedRemittanceInformation, DirectDebitTransactionInformation1.mmRelatedRemittanceInformation, DirectDebitTransactionInformation9.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation11.mmRelatedRemittanceInformation, DirectDebitTransactionInformation13.mmRelatedRemittanceInformation, DirectDebitTransactionInformation2.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation10.mmRelatedRemittanceInformation, DirectDebitTransactionInformation12.mmRelatedRemittanceInformation, DirectDebitTransactionInformation14.mmRelatedRemittanceInformation,
					NotificationItem3.mmRelatedRemittanceInformation, OriginalItemReference1.mmRelatedRemittanceInformation, NotificationItem4.mmRelatedRemittanceInformation, OriginalItemReference2.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation6.mmRelatedRemittanceInformation, DirectDebitTransactionInformation8.mmRelatedRemittanceInformation, DirectDebitTransactionInformation17.mmRelatedRemittanceInformation,
					OriginalItemReference3.mmRelatedRemittanceInformation, DirectDebitTransactionInformation18.mmRelatedRemittanceInformation, NotificationItem5.mmRelatedRemittanceInformation,
					EntryTransaction7.mmRelatedRemittanceInformation, DirectDebitTransactionInformation20.mmRelatedRemittanceInformation, OriginalItemReference4.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation19.mmRelatedRemittanceInformation, EntryTransaction8.mmRelatedRemittanceInformation, NotificationItem6.mmRelatedRemittanceInformation,
					DirectDebitTransactionInformation21.mmRelatedRemittanceInformation, DirectDebitTransactionInformation22.mmRelatedRemittanceInformation, EntryTransaction9.mmRelatedRemittanceInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfStorage";
			definition = "Specifies where the document is stored.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmStoredDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(Document obj) {
			return obj.getPlaceOfStorage();
		}

		@Override
		public void setValue(Document obj, List<ContactPoint> value) {
			obj.setPlaceOfStorage(value);
		}
	};
	protected PaymentObligation paymentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentTerms
	 * ReconciliationList1.mmPaymentTerms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which is referred to in a payment obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, Optional<PaymentObligation>> mmPaymentObligation = new MMBusinessAssociationEnd<Document, Optional<PaymentObligation>>() {
		{
			derivation_lazy = () -> Arrays.asList(ReconciliationList1.mmPaymentTerms);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Document which is referred to in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligation.mmAssociatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public Optional<PaymentObligation> getValue(Document obj) {
			return obj.getPaymentObligation();
		}

		@Override
		public void setValue(Document obj, Optional<PaymentObligation> value) {
			obj.setPaymentObligation(value.orElse(null));
		}
	};
	protected DocumentTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentTypeCode
	 * DocumentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType1#mmCode
	 * ReferredDocumentType1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentType1#mmProprietary
	 * ReferredDocumentType1.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation1#mmReferredDocumentType
	 * ReferredDocumentInformation1.mmReferredDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType1#mmCode
	 * CreditorReferenceType1.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceType1#mmProprietary
	 * CreditorReferenceType1.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice#mmCode
	 * ReferredDocumentType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType1Choice#mmProprietary
	 * ReferredDocumentType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3#mmType
	 * ReferredDocumentInformation3.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice#mmCode
	 * CreditorReferenceType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditorReferenceType1Choice#mmProprietary
	 * CreditorReferenceType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmReferredDocumentType
	 * StructuredRemittanceInformation2.mmReferredDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1#mmDocumentType
	 * DocumentGeneralInformation1.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2#mmType
	 * ReferredDocumentInformation2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmTypeCode
	 * InvoiceHeader1.mmTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2#mmDocumentType
	 * DocumentGeneralInformation2.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification10#mmType
	 * DocumentIdentification10.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineIdentification1#mmType
	 * DocumentLineIdentification1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4#mmType
	 * ReferredDocumentInformation4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentLineType1Choice#mmCode
	 * DocumentLineType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DocumentLineType1Choice#mmProprietary
	 * DocumentLineType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GarnishmentType1Choice#mmCode
	 * GarnishmentType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GarnishmentType1Choice#mmProprietary
	 * GarnishmentType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice#mmCode
	 * ReferredDocumentType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentType3Choice#mmProprietary
	 * ReferredDocumentType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation6#mmType
	 * ReferredDocumentInformation6.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1#mmDocumentType
	 * QualifiedDocumentInformation1.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmType
	 * SupportingDocumentRequestOrLetter1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmDocumentType
	 * SupportingDocumentEntry1.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmDocumentType
	 * DocumentGeneralInformation3.mmDocumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation7#mmType
	 * ReferredDocumentInformation7.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmTypeCode
	 * InvoiceHeader2.mmTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmType
	 * ReferredMandateDocument1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmTypeCode
	 * InvoiceHeader3.mmTypeCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the document, for example commercial invoice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, DocumentTypeCode> mmType = new MMBusinessAttribute<Document, DocumentTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ReferredDocumentType1.mmCode, ReferredDocumentType1.mmProprietary, ReferredDocumentInformation1.mmReferredDocumentType, CreditorReferenceType1.mmCode, CreditorReferenceType1.mmProprietary,
					ReferredDocumentType1Choice.mmCode, ReferredDocumentType1Choice.mmProprietary, ReferredDocumentInformation3.mmType, CreditorReferenceType1Choice.mmCode, CreditorReferenceType1Choice.mmProprietary,
					StructuredRemittanceInformation2.mmReferredDocumentType, DocumentGeneralInformation1.mmDocumentType, ReferredDocumentInformation2.mmType, InvoiceHeader1.mmTypeCode, DocumentGeneralInformation2.mmDocumentType,
					DocumentIdentification10.mmType, DocumentLineIdentification1.mmType, ReferredDocumentInformation4.mmType, DocumentLineType1Choice.mmCode, DocumentLineType1Choice.mmProprietary, GarnishmentType1Choice.mmCode,
					GarnishmentType1Choice.mmProprietary, ReferredDocumentType3Choice.mmCode, ReferredDocumentType3Choice.mmProprietary, ReferredDocumentInformation6.mmType, QualifiedDocumentInformation1.mmDocumentType,
					SupportingDocumentRequestOrLetter1.mmType, SupportingDocumentEntry1.mmDocumentType, DocumentGeneralInformation3.mmDocumentType, ReferredDocumentInformation7.mmType, InvoiceHeader2.mmTypeCode,
					ReferredMandateDocument1.mmType, InvoiceHeader3.mmTypeCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the document, for example commercial invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DocumentTypeCode.mmObject();
		}

		@Override
		public DocumentTypeCode getValue(Document obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Document obj, DocumentTypeCode value) {
			obj.setType(value);
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmCreditNoteAmount
	 * ReferredDocumentAmount1Choice.mmCreditNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmReferredDocumentAmount
	 * StructuredRemittanceInformation6.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation7#mmReferredDocumentAmount
	 * StructuredRemittanceInformation7.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmReferredDocumentAmount
	 * StructuredRemittanceInformation9.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation8#mmReferredDocumentAmount
	 * StructuredRemittanceInformation8.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmReferredDocumentAmount
	 * StructuredRemittanceInformation2.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals1#mmTotalInvoiceAmount
	 * InvoiceTotals1.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmTotalInvoiceAmount
	 * ServiceItemTotals1.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals2#mmTotalInvoiceAmount
	 * InvoiceTotals2.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmTotalInvoiceAmount
	 * ServiceCategoryTotals1.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentLineInformation1#mmAmount
	 * DocumentLineInformation1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmReferredDocumentAmount
	 * StructuredRemittanceInformation12.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmount
	 * SupportingDocumentEntry1.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountAfterShipment
	 * SupportingDocumentEntry1.mmTotalAmountAfterShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountInContractCurrency
	 * SupportingDocumentEntry1.mmTotalAmountInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmTotalAmountAfterShipmentInContractCurrency
	 * SupportingDocumentEntry1.mmTotalAmountAfterShipmentInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmTransactionAmountInContractCurrency
	 * TransactionCertificateContract1.mmTransactionAmountInContractCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation13#mmReferredDocumentAmount
	 * StructuredRemittanceInformation13.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals2#mmTotalInvoiceAmount
	 * ServiceCategoryTotals2.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation14#mmReferredDocumentAmount
	 * StructuredRemittanceInformation14.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation15#mmReferredDocumentAmount
	 * StructuredRemittanceInformation15.mmReferredDocumentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, ActiveCurrencyAndAmount> mmAmount = new MMBusinessAttribute<Document, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(ReferredDocumentAmount1Choice.mmCreditNoteAmount, StructuredRemittanceInformation6.mmReferredDocumentAmount, StructuredRemittanceInformation7.mmReferredDocumentAmount,
					StructuredRemittanceInformation9.mmReferredDocumentAmount, StructuredRemittanceInformation8.mmReferredDocumentAmount, StructuredRemittanceInformation2.mmReferredDocumentAmount, InvoiceTotals1.mmTotalInvoiceAmount,
					ServiceItemTotals1.mmTotalInvoiceAmount, InvoiceTotals2.mmTotalInvoiceAmount, ServiceCategoryTotals1.mmTotalInvoiceAmount, DocumentLineInformation1.mmAmount, StructuredRemittanceInformation12.mmReferredDocumentAmount,
					SupportingDocumentEntry1.mmTotalAmount, SupportingDocumentEntry1.mmTotalAmountAfterShipment, SupportingDocumentEntry1.mmTotalAmountInContractCurrency,
					SupportingDocumentEntry1.mmTotalAmountAfterShipmentInContractCurrency, TransactionCertificateContract1.mmTransactionAmountInContractCurrency, StructuredRemittanceInformation13.mmReferredDocumentAmount,
					ServiceCategoryTotals2.mmTotalInvoiceAmount, StructuredRemittanceInformation14.mmReferredDocumentAmount, StructuredRemittanceInformation15.mmReferredDocumentAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Document obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Document obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected List<Agreement> agreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDocument
	 * Agreement.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessLetter1#mmGoverningContract
	 * BusinessLetter1.mmGoverningContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmGoverningContract
	 * EventDescription1.mmGoverningContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmGoverningContract
	 * FinancialItemParameters1.mmGoverningContract}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement which is materialised by a document"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, List<Agreement>> mmAgreement = new MMBusinessAssociationEnd<Document, List<Agreement>>() {
		{
			derivation_lazy = () -> Arrays.asList(BusinessLetter1.mmGoverningContract, EventDescription1.mmGoverningContract, FinancialItemParameters1.mmGoverningContract);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement which is materialised by a document";
			minOccurs = 0;
			opposite_lazy = () -> Agreement.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Agreement.mmObject();
		}

		@Override
		public List<Agreement> getValue(Document obj) {
			return obj.getAgreement();
		}

		@Override
		public void setValue(Document obj, List<Agreement> value) {
			obj.setAgreement(value);
		}
	};
	protected Location placeOfIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmIssuedDocument
	 * Location.mmIssuedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#mmPlaceOfIssue
	 * Undertaking3.mmPlaceOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmPlaceOfIssue
	 * CertificateDataSet1.mmPlaceOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmPlaceOfIssue
	 * CertificateDataSet2.mmPlaceOfIssue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the document was issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, Optional<Location>> mmPlaceOfIssue = new MMBusinessAssociationEnd<Document, Optional<Location>>() {
		{
			derivation_lazy = () -> Arrays.asList(Undertaking3.mmPlaceOfIssue, CertificateDataSet1.mmPlaceOfIssue, CertificateDataSet2.mmPlaceOfIssue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the document was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Location.mmIssuedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public Optional<Location> getValue(Document obj) {
			return obj.getPlaceOfIssue();
		}

		@Override
		public void setValue(Document obj, Optional<Location> value) {
			obj.setPlaceOfIssue(value.orElse(null));
		}
	};
	protected Number documentVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3#mmVersion
	 * DocumentIdentification3.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1#mmVersion
	 * DocumentIdentification1.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification4#mmVersion
	 * DocumentIdentification4.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification6#mmVersion
	 * DocumentIdentification6.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#mmVersion
	 * DocumentIdentification2.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification10#mmVersion
	 * DocumentIdentification10.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of the version of a document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, Number> mmDocumentVersion = new MMBusinessAttribute<Document, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification3.mmVersion, DocumentIdentification1.mmVersion, DocumentIdentification4.mmVersion, DocumentIdentification6.mmVersion, DocumentIdentification2.mmVersion,
					DocumentIdentification10.mmVersion);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentVersion";
			definition = "Unambiguous identification of the version of a document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Document obj) {
			return obj.getDocumentVersion();
		}

		@Override
		public void setValue(Document obj, Number value) {
			obj.setDocumentVersion(value);
		}
	};
	protected Max140Text status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1#mmStatus
	 * BillingStatement1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractRegistrationStatement1#mmRegulatoryRuleValidation
	 * ContractRegistrationStatement1.mmRegulatoryRuleValidation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmStatus
	 * BillingStatement2.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the document (eg delivered, paid, etc.)"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, Max140Text> mmStatus = new MMBusinessAttribute<Document, Max140Text>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingStatement1.mmStatus, ContractRegistrationStatement1.mmRegulatoryRuleValidation, BillingStatement2.mmStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the document (eg delivered, paid, etc.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(Document obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(Document obj, Max140Text value) {
			obj.setStatus(value);
		}
	};
	protected List<Reconciliation> reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmDocument
	 * Reconciliation.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reconciliation process for which a document is specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, List<Reconciliation>> mmReconciliation = new MMBusinessAssociationEnd<Document, List<Reconciliation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process for which a document is specified.";
			minOccurs = 0;
			opposite_lazy = () -> Reconciliation.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Reconciliation.mmObject();
		}

		@Override
		public List<Reconciliation> getValue(Document obj) {
			return obj.getReconciliation();
		}

		@Override
		public void setValue(Document obj, List<Reconciliation> value) {
			obj.setReconciliation(value);
		}
	};
	protected LetterOfCredit letterOfCredit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LetterOfCredit
	 * LetterOfCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LetterOfCredit#mmDocument
	 * LetterOfCredit.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written undertaking by a bank to honour a demand for payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, LetterOfCredit> mmLetterOfCredit = new MMBusinessAssociationEnd<Document, LetterOfCredit>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> LetterOfCredit.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LetterOfCredit.mmObject();
		}

		@Override
		public LetterOfCredit getValue(Document obj) {
			return obj.getLetterOfCredit();
		}

		@Override
		public void setValue(Document obj, LetterOfCredit value) {
			obj.setLetterOfCredit(value);
		}
	};
	protected List<DocumentPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DocumentPartyRole
	 * DocumentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DocumentPartyRole#mmDocument
	 * DocumentPartyRole.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmNotificationInformation
	 * FinancingAgreementList1.mmNotificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmNotificationInformation
	 * FinancingItemList1.mmNotificationInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of a document or in the context of the business linked to the document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, List<DocumentPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Document, List<DocumentPartyRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancingAgreementList1.mmNotificationInformation, FinancingItemList1.mmNotificationInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a document or in the context of the business linked to the document.";
			minOccurs = 0;
			opposite_lazy = () -> DocumentPartyRole.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DocumentPartyRole.mmObject();
		}

		@Override
		public List<DocumentPartyRole> getValue(Document obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Document obj, List<DocumentPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected DataSetTypeCode dataSetType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetTypeCode
	 * DataSetTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#mmType
	 * DocumentIdentification2.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of data set in which the document is included."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, DataSetTypeCode> mmDataSetType = new MMBusinessAttribute<Document, DataSetTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentIdentification2.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DataSetType";
			definition = "Specifies the type of data set in which the document is included.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetTypeCode.mmObject();
		}

		@Override
		public DataSetTypeCode getValue(Document obj) {
			return obj.getDataSetType();
		}

		@Override
		public void setValue(Document obj, DataSetTypeCode value) {
			obj.setDataSetType(value);
		}
	};
	protected Transport transport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
	 * Transport.mmTransportDocuments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmMatchTransport
	 * RequiredSubmission3.mmMatchTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1#mmTransport
	 * InsuranceDataSet1.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmTransport
	 * CertificateDataSet2.mmTransport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport process for which related documents are specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, Transport> mmTransport = new MMBusinessAssociationEnd<Document, Transport>() {
		{
			derivation_lazy = () -> Arrays.asList(RequiredSubmission3.mmMatchTransport, InsuranceDataSet1.mmTransport, CertificateDataSet2.mmTransport);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process for which related documents are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Transport.mmTransportDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}

		@Override
		public Transport getValue(Document obj) {
			return obj.getTransport();
		}

		@Override
		public void setValue(Document obj, Transport value) {
			obj.setTransport(value);
		}
	};
	protected YesNoIndicator signedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication whether the document must be signed or not."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, YesNoIndicator> mmSignedIndicator = new MMBusinessAttribute<Document, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignedIndicator";
			definition = "Indication whether the document must be signed or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Document obj) {
			return obj.getSignedIndicator();
		}

		@Override
		public void setValue(Document obj, YesNoIndicator value) {
			obj.setSignedIndicator(value);
		}
	};
	protected CurrencyAndAmount remittedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmRemittedAmount
	 * ReferredDocumentAmount1Choice.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmRemittedAmount
	 * RemittanceAmount1.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmRemittedAmount
	 * RemittanceAmount2.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmReferredDocumentAmount
	 * StructuredRemittanceInformation10.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmRemittedAmount
	 * Garnishment1.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment2#mmRemittedAmount
	 * Garnishment2.mmRemittedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remitted for the referred document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, CurrencyAndAmount> mmRemittedAmount = new MMBusinessAttribute<Document, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(ReferredDocumentAmount1Choice.mmRemittedAmount, RemittanceAmount1.mmRemittedAmount, RemittanceAmount2.mmRemittedAmount, StructuredRemittanceInformation10.mmReferredDocumentAmount,
					Garnishment1.mmRemittedAmount, Garnishment2.mmRemittedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Document obj) {
			return obj.getRemittedAmount();
		}

		@Override
		public void setValue(Document obj, CurrencyAndAmount value) {
			obj.setRemittedAmount(value);
		}
	};
	protected List<Guarantee> guarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
	 * Guarantee.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee that is described in a document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, List<Guarantee>> mmGuarantee = new MMBusinessAssociationEnd<Document, List<Guarantee>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee that is described in a document.";
			minOccurs = 0;
			opposite_lazy = () -> Guarantee.mmDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Guarantee.mmObject();
		}

		@Override
		public List<Guarantee> getValue(Document obj) {
			return obj.getGuarantee();
		}

		@Override
		public void setValue(Document obj, List<Guarantee> value) {
			obj.setGuarantee(value);
		}
	};
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmLanguageCode
	 * InvoiceHeader1.mmLanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmLanguageCode
	 * EventDescription1.mmLanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmLanguageCode
	 * FinancialItemParameters1.mmLanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmLanguageCode
	 * InvoiceHeader2.mmLanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmLanguageCode
	 * InvoiceHeader3.mmLanguageCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language used for textual information in the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, LanguageCode> mmLanguage = new MMBusinessAttribute<Document, LanguageCode>() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader1.mmLanguageCode, EventDescription1.mmLanguageCode, FinancialItemParameters1.mmLanguageCode, InvoiceHeader2.mmLanguageCode, InvoiceHeader3.mmLanguageCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language used for textual information in the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public LanguageCode getValue(Document obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(Document obj, LanguageCode value) {
			obj.setLanguage(value);
		}
	};
	protected Max35Text purpose;
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmDocumentPurpose
	 * InvoiceHeader1.mmDocumentPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmDocumentPurpose
	 * FinancialItemParameters1.mmDocumentPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmSubject
	 * SupportingDocumentRequestOrLetter1.mmSubject}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmDocumentPurpose
	 * InvoiceHeader2.mmDocumentPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmDocumentPurpose
	 * InvoiceHeader3.mmDocumentPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the function of the document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Document, Max35Text> mmPurpose = new MMBusinessAttribute<Document, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader1.mmDocumentPurpose, FinancialItemParameters1.mmDocumentPurpose, SupportingDocumentRequestOrLetter1.mmSubject, InvoiceHeader2.mmDocumentPurpose,
					InvoiceHeader3.mmDocumentPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the function of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Document obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(Document obj, Max35Text value) {
			obj.setPurpose(value);
		}
	};
	protected GenericIdentification documentIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentifiedDocument
	 * GenericIdentification.mmIdentifiedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader1#mmName
	 * InvoiceHeader1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmLetterOfCreditIdentification
	 * OtherCollateral2.mmLetterOfCreditIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmLetterOfCreditIdentification
	 * OtherCollateral4.mmLetterOfCreditIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmRequestOrLetterIdentification
	 * SupportingDocumentRequestOrLetter1.mmRequestOrLetterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentRequestOrLetter1#mmOriginalReferences
	 * SupportingDocumentRequestOrLetter1.mmOriginalReferences}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificate1#mmCertificate
	 * TransactionCertificate1.mmCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmOriginalDocument
	 * SupportingDocumentEntry1.mmOriginalDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateReference1#mmIdentification
	 * CertificateReference1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmContractReference
	 * TransactionCertificateContract1.mmContractReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ContractRegistrationReference1Choice#mmContract
	 * ContractRegistrationReference1Choice.mmContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlRecordStatus1#mmDocumentIdentification
	 * CurrencyControlRecordStatus1.mmDocumentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmLetterOfCreditIdentification
	 * OtherCollateral7.mmLetterOfCreditIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmLetterOfCreditIdentification
	 * OtherCollateral5.mmLetterOfCreditIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader2#mmName
	 * InvoiceHeader2.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate10#mmMandateReference
	 * Mandate10.mmMandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate9#mmMandateReference
	 * Mandate9.mmMandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate11#mmMandateReference
	 * Mandate11.mmMandateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReferredMandateDocument1#mmCreditorReference
	 * ReferredMandateDocument1.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Mandate8#mmMandateReference
	 * Mandate8.mmMandateReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvoiceHeader3#mmName
	 * InvoiceHeader3.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a document for instance unique identification of the purchase order, assigned by the buyer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, GenericIdentification> mmDocumentIdentification = new MMBusinessAssociationEnd<Document, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceHeader1.mmName, OtherCollateral2.mmLetterOfCreditIdentification, OtherCollateral4.mmLetterOfCreditIdentification, SupportingDocumentRequestOrLetter1.mmRequestOrLetterIdentification,
					SupportingDocumentRequestOrLetter1.mmOriginalReferences, TransactionCertificate1.mmCertificate, SupportingDocumentEntry1.mmOriginalDocument, CertificateReference1.mmIdentification,
					TransactionCertificateContract1.mmContractReference, ContractRegistrationReference1Choice.mmContract, CurrencyControlRecordStatus1.mmDocumentIdentification, OtherCollateral7.mmLetterOfCreditIdentification,
					OtherCollateral5.mmLetterOfCreditIdentification, InvoiceHeader2.mmName, Mandate10.mmMandateReference, Mandate9.mmMandateReference, Mandate11.mmMandateReference, ReferredMandateDocument1.mmCreditorReference,
					Mandate8.mmMandateReference, InvoiceHeader3.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentIdentification";
			definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmIdentifiedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(Document obj) {
			return obj.getDocumentIdentification();
		}

		@Override
		public void setValue(Document obj, GenericIdentification value) {
			obj.setDocumentIdentification(value);
		}
	};
	protected List<Evidence> evidence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Evidence Evidence}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Evidence#mmRelatedDocument
	 * Evidence.mmRelatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Evidence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proof of evidence which uses a document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, List<Evidence>> mmEvidence = new MMBusinessAssociationEnd<Document, List<Evidence>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Evidence";
			definition = "Proof of evidence which uses a document.";
			minOccurs = 0;
			opposite_lazy = () -> Evidence.mmRelatedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Evidence.mmObject();
		}

		@Override
		public List<Evidence> getValue(Document obj) {
			return obj.getEvidence();
		}

		@Override
		public void setValue(Document obj, List<Evidence> value) {
			obj.setEvidence(value);
		}
	};
	protected List<CommercialTrade> commercialTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmDocuments
	 * CommercialTrade.mmDocuments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which a certificare is issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, List<CommercialTrade>> mmCommercialTrade = new MMBusinessAssociationEnd<Document, List<CommercialTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Trade for which a certificare is issued.";
			minOccurs = 0;
			opposite_lazy = () -> CommercialTrade.mmDocuments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CommercialTrade.mmObject();
		}

		@Override
		public List<CommercialTrade> getValue(Document obj) {
			return obj.getCommercialTrade();
		}

		@Override
		public void setValue(Document obj, List<CommercialTrade> value) {
			obj.setCommercialTrade(value);
		}
	};
	protected Presentation presentation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Presentation
	 * Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentedDocument
	 * Presentation.mmPresentedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Document11#mmElectronicDetails
	 * Document11.mmElectronicDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Document8#mmElectronicDetails
	 * Document8.mmElectronicDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Presentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Presentation of documents and statements."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, Optional<Presentation>> mmPresentation = new MMBusinessAssociationEnd<Document, Optional<Presentation>>() {
		{
			derivation_lazy = () -> Arrays.asList(Document11.mmElectronicDetails, Document8.mmElectronicDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation of documents and statements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Presentation.mmPresentedDocument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Presentation.mmObject();
		}

		@Override
		public Optional<Presentation> getValue(Document obj) {
			return obj.getPresentation();
		}

		@Override
		public void setValue(Document obj, Optional<Presentation> value) {
			obj.setPresentation(value.orElse(null));
		}
	};
	protected RegisteredContract relatedContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmAttachment
	 * RegisteredContract.mmAttachment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Document
	 * Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related document which materialises the agreement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Document, RegisteredContract> mmRelatedContract = new MMBusinessAssociationEnd<Document, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedContract";
			definition = "Related document which materialises the agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmAttachment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(Document obj) {
			return obj.getRelatedContract();
		}

		@Override
		public void setValue(Document obj, RegisteredContract value) {
			obj.setRelatedContract(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Document";
				definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmIdentifiedDocument, ContactPoint.mmStoredDocument, Location.mmIssuedDocument, Agreement.mmDocument, DocumentPartyRole.mmDocument,
						PaymentObligation.mmAssociatedDocument, Presentation.mmPresentedDocument, CommercialTrade.mmDocuments, Transport.mmTransportDocuments, LetterOfCredit.mmDocument, Guarantee.mmDocument, Reconciliation.mmDocument,
						Evidence.mmRelatedDocument, RegisteredContract.mmAttachment);
				derivationElement_lazy = () -> Arrays.asList(StructuredRemittanceInformation6.mmReferredDocumentInformation, StructuredRemittanceInformation6.mmAdditionalRemittanceInformation, RemittanceInformation1.mmUnstructured,
						RemittanceInformation1.mmStructured, ReferredDocumentType2.mmCodeOrProprietary, CreditorReferenceType2.mmCodeOrProprietary, StructuredRemittanceInformation7.mmReferredDocumentInformation,
						StructuredRemittanceInformation7.mmAdditionalRemittanceInformation, RemittanceInformation5.mmUnstructured, RemittanceInformation5.mmStructured, StructuredRemittanceInformation9.mmReferredDocumentInformation,
						StructuredRemittanceInformation9.mmAdditionalRemittanceInformation, RemittanceInformation7.mmUnstructured, RemittanceInformation7.mmStructured, RemittanceInformation2.mmUnstructured,
						StructuredRemittanceInformation8.mmReferredDocumentInformation, StructuredRemittanceInformation8.mmAdditionalRemittanceInformation, RemittanceInformation6.mmUnstructured, RemittanceInformation6.mmStructured,
						RemittanceInformation3Choice.mmUnstructured, RemittanceInformation3Choice.mmStructured, RequestedModification.mmRemittanceInformation, RequestedModification2.mmRemittanceInformation,
						TradeAgreement6.mmAdditionalReferenceDocument, RequestedModification3.mmRemittanceInformation, RemittanceInformation3.mmUnstructured, RemittanceInformation3.mmStructured, RemittanceInformation4.mmUnstructured,
						RemittanceInformation4.mmStructured, DocumentLineType1.mmCodeOrProprietary, StructuredRemittanceInformation10.mmReferredDocumentInformation, StructuredRemittanceInformation10.mmAdditionalRemittanceInformation,
						RemittanceInformation8.mmStructured, ReferredDocumentInformation4.mmLineDetails, DocumentLineInformation1.mmDescription, GarnishmentType1.mmCodeOrProprietary, RemittanceInformation10.mmUnstructured,
						RemittanceInformation10.mmStructured, RequestedModification4.mmRemittanceInformation, StructuredRemittanceInformation12.mmReferredDocumentInformation,
						StructuredRemittanceInformation12.mmAdditionalRemittanceInformation, ReferredDocumentType4.mmCodeOrProprietary, BusinessLetter1.mmRelatedLetter, BusinessLetter1.mmRelatedMessage,
						BusinessLetter1.mmAssociatedDocument, EncapsulatedBusinessMessage1.mmHeader, EncapsulatedBusinessMessage1.mmMessage, FinancingAgreementList1.mmRelatedDocument, FinancingItemList1.mmRelatedDocument,
						ReconciliationList1.mmRelatedDocument, ReconciliationList1.mmAssociatedDocument, EventDescription1.mmRelatedDocument, EventDescription1.mmRelatedLetter, EventDescription1.mmRelatedMessage,
						EventDescription1.mmAssociatedDocument, GuaranteeDetails1.mmAssociatedDocument, RequestedModification5.mmRemittanceInformation, RemittanceInformation12.mmStructured, RemittanceInformation11.mmUnstructured,
						RemittanceInformation11.mmStructured, StructuredRemittanceInformation13.mmReferredDocumentInformation, StructuredRemittanceInformation13.mmAdditionalRemittanceInformation, ReferredDocumentInformation7.mmLineDetails,
						TradeAgreement13.mmAdditionalReferenceDocument, RequestedModification6.mmRemittanceInformation, RemittanceInformation13.mmStructured, RequestedModification7.mmRemittanceInformation,
						StructuredRemittanceInformation14.mmReferredDocumentInformation, StructuredRemittanceInformation14.mmAdditionalRemittanceInformation, RemittanceInformation14.mmUnstructured, RemittanceInformation14.mmStructured,
						RemittanceInformation15.mmUnstructured, RemittanceInformation15.mmStructured, StructuredRemittanceInformation15.mmReferredDocumentInformation, StructuredRemittanceInformation15.mmAdditionalRemittanceInformation,
						TradeAgreement16.mmAdditionalReferenceDocument);
				subType_lazy = () -> Arrays.asList(PrivateCertificate.mmObject(), InsuranceCertificate.mmObject(), SecurityCertificate.mmObject(), TradeCertificate.mmObject(), Assessment.mmObject(), DeliveryNote.mmObject(),
						FinancialDocument.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Document.mmIssueDate, com.tools20022.repository.entity.Document.mmCopyDuplicate, com.tools20022.repository.entity.Document.mmPlaceOfStorage,
						com.tools20022.repository.entity.Document.mmPaymentObligation, com.tools20022.repository.entity.Document.mmType, com.tools20022.repository.entity.Document.mmAmount,
						com.tools20022.repository.entity.Document.mmAgreement, com.tools20022.repository.entity.Document.mmPlaceOfIssue, com.tools20022.repository.entity.Document.mmDocumentVersion,
						com.tools20022.repository.entity.Document.mmStatus, com.tools20022.repository.entity.Document.mmReconciliation, com.tools20022.repository.entity.Document.mmLetterOfCredit,
						com.tools20022.repository.entity.Document.mmPartyRole, com.tools20022.repository.entity.Document.mmDataSetType, com.tools20022.repository.entity.Document.mmTransport,
						com.tools20022.repository.entity.Document.mmSignedIndicator, com.tools20022.repository.entity.Document.mmRemittedAmount, com.tools20022.repository.entity.Document.mmGuarantee,
						com.tools20022.repository.entity.Document.mmLanguage, com.tools20022.repository.entity.Document.mmPurpose, com.tools20022.repository.entity.Document.mmDocumentIdentification,
						com.tools20022.repository.entity.Document.mmEvidence, com.tools20022.repository.entity.Document.mmCommercialTrade, com.tools20022.repository.entity.Document.mmPresentation,
						com.tools20022.repository.entity.Document.mmRelatedContract);
				derivationComponent_lazy = () -> Arrays.asList(DocumentIdentification11.mmObject(), DocumentIdentification16.mmObject(), DocumentIdentification9.mmObject(), DocumentIdentification1Choice.mmObject(),
						DocumentIdentification14.mmObject(), DocumentIdentification17.mmObject(), DocumentIdentification2Choice.mmObject(), DocumentIdentification21.mmObject(), DocumentIdentification12.mmObject(),
						DocumentIdentification15.mmObject(), DocumentIdentification13.mmObject(), DocumentIdentification18.mmObject(), DocumentIdentification19.mmObject(), DocumentIdentification20.mmObject(),
						ReferredDocumentType1.mmObject(), ReferredDocumentInformation1.mmObject(), ReferredDocumentAmount1Choice.mmObject(), CreditorReferenceType1.mmObject(), StructuredRemittanceInformation6.mmObject(),
						RemittanceInformation1.mmObject(), ReferredDocumentType1Choice.mmObject(), ReferredDocumentType2.mmObject(), ReferredDocumentInformation3.mmObject(), RemittanceAmount1.mmObject(),
						CreditorReferenceType1Choice.mmObject(), CreditorReferenceType2.mmObject(), StructuredRemittanceInformation7.mmObject(), RemittanceInformation5.mmObject(), RemittanceAmount2.mmObject(),
						StructuredRemittanceInformation9.mmObject(), RemittanceInformation7.mmObject(), RemittanceInformation2.mmObject(), StructuredRemittanceInformation8.mmObject(), RemittanceInformation6.mmObject(),
						StructuredRemittanceInformation2.mmObject(), RemittanceInformation3Choice.mmObject(), DocumentIdentification8.mmObject(), DocumentNumber1.mmObject(), DocumentNumber2.mmObject(), DocumentNumber6.mmObject(),
						DocumentNumber5.mmObject(), AgreementClauses1.mmObject(), DocumentGeneralInformation1.mmObject(), ReferredDocumentInformation2.mmObject(), InvoiceHeader1.mmObject(), DocumentIdentification22.mmObject(),
						DocumentGeneralInformation2.mmObject(), DocumentIdentification7.mmObject(), DocumentIdentification23.mmObject(), DocumentIdentification3.mmObject(), DocumentIdentification5.mmObject(),
						DocumentIdentification1.mmObject(), RequiredSubmission1.mmObject(), DocumentIdentification4.mmObject(), DocumentIdentification6.mmObject(), DocumentIdentification2.mmObject(), DocumentIdentification10.mmObject(),
						DocumentNumber3.mmObject(), DocumentNumber4.mmObject(), DocumentNumber7.mmObject(), DocumentIdentification24.mmObject(), DocumentNumber9.mmObject(), DocumentIdentification26.mmObject(), DocumentNumber11.mmObject(),
						DocumentNumber8.mmObject(), RemittanceInformation3.mmObject(), RemittanceInformation4.mmObject(), DocumentIdentification27.mmObject(), DocumentLineType1.mmObject(), StructuredRemittanceInformation10.mmObject(),
						DocumentLineIdentification1.mmObject(), RemittanceInformation8.mmObject(), ReferredDocumentInformation4.mmObject(), DocumentLineInformation1.mmObject(), DocumentLineType1Choice.mmObject(),
						GarnishmentType1Choice.mmObject(), GarnishmentType1.mmObject(), RemittanceInformation10.mmObject(), ReferredDocumentType3Choice.mmObject(), ReferredDocumentInformation6.mmObject(),
						StructuredRemittanceInformation12.mmObject(), ReferredDocumentType4.mmObject(), BusinessLetter1.mmObject(), EncapsulatedBusinessMessage1.mmObject(), FinancingAgreementList1.mmObject(),
						ReconciliationList1.mmObject(), EventDescription1.mmObject(), QualifiedDocumentInformation1.mmObject(), SupportingDocumentRequestOrLetter1.mmObject(), DocumentIdentification29.mmObject(),
						SupportingDocumentEntry1.mmObject(), DocumentGeneralInformation3.mmObject(), CertificateReference1.mmObject(), DocumentIdentification28.mmObject(), DocumentIdentification30.mmObject(), DocumentNumber12.mmObject(),
						RemittanceInformation12.mmObject(), RemittanceInformation11.mmObject(), StructuredRemittanceInformation13.mmObject(), ReferredDocumentInformation7.mmObject(), DocumentNumber13.mmObject(),
						DocumentIdentification31.mmObject(), DocumentIdentification32.mmObject(), DocumentIdentification33.mmObject(), DocumentIdentification3Choice.mmObject(), DocumentIdentification38.mmObject(),
						DocumentIdentification37.mmObject(), DocumentIdentification34.mmObject(), DocumentIdentification4Choice.mmObject(), DocumentNumber14.mmObject(), DocumentIdentification48.mmObject(), DocumentNumber15.mmObject(),
						DocumentIdentification49.mmObject(), InvoiceHeader2.mmObject(), RemittanceInformation13.mmObject(), ReferredMandateDocument1.mmObject(), StructuredRemittanceInformation14.mmObject(),
						RemittanceInformation14.mmObject(), RemittanceInformation15.mmObject(), StructuredRemittanceInformation15.mmObject(), DocumentIdentification50.mmObject(), InvoiceHeader3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Document.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getIssueDate() {
		return issueDate;
	}

	public Document setIssueDate(ISODateTime issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public CopyDuplicateCode getCopyDuplicate() {
		return copyDuplicate;
	}

	public Document setCopyDuplicate(CopyDuplicateCode copyDuplicate) {
		this.copyDuplicate = Objects.requireNonNull(copyDuplicate);
		return this;
	}

	public List<ContactPoint> getPlaceOfStorage() {
		return placeOfStorage == null ? placeOfStorage = new ArrayList<>() : placeOfStorage;
	}

	public Document setPlaceOfStorage(List<ContactPoint> placeOfStorage) {
		this.placeOfStorage = Objects.requireNonNull(placeOfStorage);
		return this;
	}

	public Optional<PaymentObligation> getPaymentObligation() {
		return paymentObligation == null ? Optional.empty() : Optional.of(paymentObligation);
	}

	public Document setPaymentObligation(PaymentObligation paymentObligation) {
		this.paymentObligation = paymentObligation;
		return this;
	}

	public DocumentTypeCode getType() {
		return type;
	}

	public Document setType(DocumentTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public Document setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<Agreement> getAgreement() {
		return agreement == null ? agreement = new ArrayList<>() : agreement;
	}

	public Document setAgreement(List<Agreement> agreement) {
		this.agreement = Objects.requireNonNull(agreement);
		return this;
	}

	public Optional<Location> getPlaceOfIssue() {
		return placeOfIssue == null ? Optional.empty() : Optional.of(placeOfIssue);
	}

	public Document setPlaceOfIssue(Location placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
		return this;
	}

	public Number getDocumentVersion() {
		return documentVersion;
	}

	public Document setDocumentVersion(Number documentVersion) {
		this.documentVersion = Objects.requireNonNull(documentVersion);
		return this;
	}

	public Max140Text getStatus() {
		return status;
	}

	public Document setStatus(Max140Text status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<Reconciliation> getReconciliation() {
		return reconciliation == null ? reconciliation = new ArrayList<>() : reconciliation;
	}

	public Document setReconciliation(List<Reconciliation> reconciliation) {
		this.reconciliation = Objects.requireNonNull(reconciliation);
		return this;
	}

	public LetterOfCredit getLetterOfCredit() {
		return letterOfCredit;
	}

	public Document setLetterOfCredit(LetterOfCredit letterOfCredit) {
		this.letterOfCredit = Objects.requireNonNull(letterOfCredit);
		return this;
	}

	public List<DocumentPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public Document setPartyRole(List<DocumentPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public DataSetTypeCode getDataSetType() {
		return dataSetType;
	}

	public Document setDataSetType(DataSetTypeCode dataSetType) {
		this.dataSetType = Objects.requireNonNull(dataSetType);
		return this;
	}

	public Transport getTransport() {
		return transport;
	}

	public Document setTransport(Transport transport) {
		this.transport = Objects.requireNonNull(transport);
		return this;
	}

	public YesNoIndicator getSignedIndicator() {
		return signedIndicator;
	}

	public Document setSignedIndicator(YesNoIndicator signedIndicator) {
		this.signedIndicator = Objects.requireNonNull(signedIndicator);
		return this;
	}

	public CurrencyAndAmount getRemittedAmount() {
		return remittedAmount;
	}

	public Document setRemittedAmount(CurrencyAndAmount remittedAmount) {
		this.remittedAmount = Objects.requireNonNull(remittedAmount);
		return this;
	}

	public List<Guarantee> getGuarantee() {
		return guarantee == null ? guarantee = new ArrayList<>() : guarantee;
	}

	public Document setGuarantee(List<Guarantee> guarantee) {
		this.guarantee = Objects.requireNonNull(guarantee);
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public Document setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}

	public Max35Text getPurpose() {
		return purpose;
	}

	public Document setPurpose(Max35Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public GenericIdentification getDocumentIdentification() {
		return documentIdentification;
	}

	public Document setDocumentIdentification(GenericIdentification documentIdentification) {
		this.documentIdentification = Objects.requireNonNull(documentIdentification);
		return this;
	}

	public List<Evidence> getEvidence() {
		return evidence == null ? evidence = new ArrayList<>() : evidence;
	}

	public Document setEvidence(List<Evidence> evidence) {
		this.evidence = Objects.requireNonNull(evidence);
		return this;
	}

	public List<CommercialTrade> getCommercialTrade() {
		return commercialTrade == null ? commercialTrade = new ArrayList<>() : commercialTrade;
	}

	public Document setCommercialTrade(List<CommercialTrade> commercialTrade) {
		this.commercialTrade = Objects.requireNonNull(commercialTrade);
		return this;
	}

	public Optional<Presentation> getPresentation() {
		return presentation == null ? Optional.empty() : Optional.of(presentation);
	}

	public Document setPresentation(Presentation presentation) {
		this.presentation = presentation;
		return this;
	}

	public RegisteredContract getRelatedContract() {
		return relatedContract;
	}

	public Document setRelatedContract(RegisteredContract relatedContract) {
		this.relatedContract = Objects.requireNonNull(relatedContract);
		return this;
	}
}