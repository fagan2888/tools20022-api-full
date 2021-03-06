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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
 */
public class ConstraintPlaceOfListingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13
	 * FinancialInstrumentAttributes13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes13> forFinancialInstrumentAttributes13 = new MMConstraint<FinancialInstrumentAttributes13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes13.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes13 obj) throws Exception {
			checkFinancialInstrumentAttributes13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75
	 * FinancialInstrumentAttributes75}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes75> forFinancialInstrumentAttributes75 = new MMConstraint<FinancialInstrumentAttributes75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes75.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes75 obj) throws Exception {
			checkFinancialInstrumentAttributes75(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44
	 * FinancialInstrumentAttributes44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes44> forFinancialInstrumentAttributes44 = new MMConstraint<FinancialInstrumentAttributes44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes44.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes44 obj) throws Exception {
			checkFinancialInstrumentAttributes44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14
	 * FinancialInstrumentAttributes14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes14> forFinancialInstrumentAttributes14 = new MMConstraint<FinancialInstrumentAttributes14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes14.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes14 obj) throws Exception {
			checkFinancialInstrumentAttributes14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92
	 * FinancialInstrumentAttributes92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes63
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes63}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes92> forFinancialInstrumentAttributes92 = new MMConstraint<FinancialInstrumentAttributes92>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes63;
			owner_lazy = () -> FinancialInstrumentAttributes92.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes92 obj) throws Exception {
			checkFinancialInstrumentAttributes92(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95
	 * FinancialInstrumentAttributes95}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes95> forFinancialInstrumentAttributes95 = new MMConstraint<FinancialInstrumentAttributes95>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes95.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes95 obj) throws Exception {
			checkFinancialInstrumentAttributes95(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78
	 * FinancialInstrumentAttributes78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes78> forFinancialInstrumentAttributes78 = new MMConstraint<FinancialInstrumentAttributes78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes78.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes78 obj) throws Exception {
			checkFinancialInstrumentAttributes78(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27
	 * FinancialInstrumentAttributes27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes27> forFinancialInstrumentAttributes27 = new MMConstraint<FinancialInstrumentAttributes27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes27.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes27 obj) throws Exception {
			checkFinancialInstrumentAttributes27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97
	 * FinancialInstrumentAttributes97}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes97> forFinancialInstrumentAttributes97 = new MMConstraint<FinancialInstrumentAttributes97>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes97.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes97 obj) throws Exception {
			checkFinancialInstrumentAttributes97(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2
	 * FinancialInstrumentAttributes2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of Listing is to be identified by its ISO 10383 Market Identifier Code (MIC)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes2> forFinancialInstrumentAttributes2 = new MMConstraint<FinancialInstrumentAttributes2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "Place of Listing is to be identified by its ISO 10383 Market Identifier Code (MIC).";
			owner_lazy = () -> FinancialInstrumentAttributes2.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes2 obj) throws Exception {
			checkFinancialInstrumentAttributes2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31
	 * FinancialInstrumentAttributes31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes31> forFinancialInstrumentAttributes31 = new MMConstraint<FinancialInstrumentAttributes31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes31.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes31 obj) throws Exception {
			checkFinancialInstrumentAttributes31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20
	 * FinancialInstrumentAttributes20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes20> forFinancialInstrumentAttributes20 = new MMConstraint<FinancialInstrumentAttributes20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes20.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes20 obj) throws Exception {
			checkFinancialInstrumentAttributes20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28
	 * FinancialInstrumentAttributes28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes28> forFinancialInstrumentAttributes28 = new MMConstraint<FinancialInstrumentAttributes28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes28.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes28 obj) throws Exception {
			checkFinancialInstrumentAttributes28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes91
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes91}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes35
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes35}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes64> forFinancialInstrumentAttributes64 = new MMConstraint<FinancialInstrumentAttributes64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes91);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes35;
			owner_lazy = () -> FinancialInstrumentAttributes64.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes64 obj) throws Exception {
			checkFinancialInstrumentAttributes64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63
	 * FinancialInstrumentAttributes63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes92
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes92}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes36
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes36}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes63> forFinancialInstrumentAttributes63 = new MMConstraint<FinancialInstrumentAttributes63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and an ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes92);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes36;
			owner_lazy = () -> FinancialInstrumentAttributes63.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes63 obj) throws Exception {
			checkFinancialInstrumentAttributes63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26
	 * FinancialInstrumentAttributes26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes26> forFinancialInstrumentAttributes26 = new MMConstraint<FinancialInstrumentAttributes26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes26.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes26 obj) throws Exception {
			checkFinancialInstrumentAttributes26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91
	 * FinancialInstrumentAttributes91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes64
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes64}</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes91> forFinancialInstrumentAttributes91 = new MMConstraint<FinancialInstrumentAttributes91>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes64;
			owner_lazy = () -> FinancialInstrumentAttributes91.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes91 obj) throws Exception {
			checkFinancialInstrumentAttributes91(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21
	 * FinancialInstrumentAttributes21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes21> forFinancialInstrumentAttributes21 = new MMConstraint<FinancialInstrumentAttributes21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes21.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes21 obj) throws Exception {
			checkFinancialInstrumentAttributes21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35
	 * FinancialInstrumentAttributes35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes64
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes64}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes35> forFinancialInstrumentAttributes35 = new MMConstraint<FinancialInstrumentAttributes35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes64);
			owner_lazy = () -> FinancialInstrumentAttributes35.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes35 obj) throws Exception {
			checkFinancialInstrumentAttributes35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30
	 * FinancialInstrumentAttributes30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes30> forFinancialInstrumentAttributes30 = new MMConstraint<FinancialInstrumentAttributes30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes30.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes30 obj) throws Exception {
			checkFinancialInstrumentAttributes30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8
	 * FinancialInstrumentAttributes8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes8> forFinancialInstrumentAttributes8 = new MMConstraint<FinancialInstrumentAttributes8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes8.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes8 obj) throws Exception {
			checkFinancialInstrumentAttributes8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29
	 * FinancialInstrumentAttributes29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes29> forFinancialInstrumentAttributes29 = new MMConstraint<FinancialInstrumentAttributes29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes29.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes29 obj) throws Exception {
			checkFinancialInstrumentAttributes29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15
	 * FinancialInstrumentAttributes15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes15> forFinancialInstrumentAttributes15 = new MMConstraint<FinancialInstrumentAttributes15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes15.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes15 obj) throws Exception {
			checkFinancialInstrumentAttributes15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4
	 * FinancialInstrumentAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes4> forFinancialInstrumentAttributes4 = new MMConstraint<FinancialInstrumentAttributes4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes4.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes4 obj) throws Exception {
			checkFinancialInstrumentAttributes4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41
	 * FinancialInstrumentAttributes41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes41> forFinancialInstrumentAttributes41 = new MMConstraint<FinancialInstrumentAttributes41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes41.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes41 obj) throws Exception {
			checkFinancialInstrumentAttributes41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42
	 * FinancialInstrumentAttributes42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes42> forFinancialInstrumentAttributes42 = new MMConstraint<FinancialInstrumentAttributes42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			owner_lazy = () -> FinancialInstrumentAttributes42.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes42 obj) throws Exception {
			checkFinancialInstrumentAttributes42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPlaceOfListingRule#forFinancialInstrumentAttributes63
	 * ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes63}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstrumentAttributes36> forFinancialInstrumentAttributes36 = new MMConstraint<FinancialInstrumentAttributes36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListingRule";
			definition = "If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be identified, the ISO 10383 Market Identifier Code (MIC) must be used.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPlaceOfListingRule.forFinancialInstrumentAttributes63);
			owner_lazy = () -> FinancialInstrumentAttributes36.mmObject();
		}

		@Override
		public void executeValidator(FinancialInstrumentAttributes36 obj) throws Exception {
			checkFinancialInstrumentAttributes36(obj);
		}
	};

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes13(FinancialInstrumentAttributes13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and an ISO 10383 MIC exists for the market to
	 * be identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes75(FinancialInstrumentAttributes75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes44(FinancialInstrumentAttributes44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes14(FinancialInstrumentAttributes14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and an ISO 10383 MIC exists for the market to
	 * be identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes92(FinancialInstrumentAttributes92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and an ISO 10383 MIC exists for the market to
	 * be identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes95(FinancialInstrumentAttributes95 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes78(FinancialInstrumentAttributes78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes27(FinancialInstrumentAttributes27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes97(FinancialInstrumentAttributes97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Place of Listing is to be identified by its ISO 10383 Market Identifier
	 * Code (MIC).
	 */
	public static void checkFinancialInstrumentAttributes2(FinancialInstrumentAttributes2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes31(FinancialInstrumentAttributes31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes20(FinancialInstrumentAttributes20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes28(FinancialInstrumentAttributes28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes64(FinancialInstrumentAttributes64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and an ISO 10383 MIC exists for the market to
	 * be identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes63(FinancialInstrumentAttributes63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes26(FinancialInstrumentAttributes26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes91(FinancialInstrumentAttributes91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes21(FinancialInstrumentAttributes21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes35(FinancialInstrumentAttributes35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes30(FinancialInstrumentAttributes30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes8(FinancialInstrumentAttributes8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes29(FinancialInstrumentAttributes29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes15(FinancialInstrumentAttributes15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes4(FinancialInstrumentAttributes4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes41(FinancialInstrumentAttributes41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes42(FinancialInstrumentAttributes42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PlaceOfListing is used and a ISO 10383 MIC exists for the market to be
	 * identified, the ISO 10383 Market Identifier Code (MIC) must be used.
	 */
	public static void checkFinancialInstrumentAttributes36(FinancialInstrumentAttributes36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}