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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SpecialCollateral1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the collateral type against which all repurchase agreements are
 * conducted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialCollateral1Code#GeneralCollateral
 * SpecialCollateral1Code.GeneralCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SpecialCollateral1Code#SpecialCollateral
 * SpecialCollateral1Code.SpecialCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SpecialCollateralCode
 * SpecialCollateralCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SpecialCollateral1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the collateral type against which all repurchase agreements are conducted."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SpecialCollateral1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialCollateral1Code
	 * SpecialCollateral1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SpecialCollateral1Code GeneralCollateral = new SpecialCollateral1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.SpecialCollateral1Code.mmObject();
			codeName = SpecialCollateralCode.GeneralCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SpecialCollateral1Code
	 * SpecialCollateral1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SpecialCollateral1Code SpecialCollateral = new SpecialCollateral1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.SpecialCollateral1Code.mmObject();
			codeName = SpecialCollateralCode.SpecialCollateral.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SpecialCollateral1Code> codesByName = new LinkedHashMap<>();

	protected SpecialCollateral1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SpecialCollateral1Code";
				definition = "Specifies the collateral type against which all repurchase agreements are conducted.";
				trace_lazy = () -> SpecialCollateralCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SpecialCollateral1Code.GeneralCollateral, com.tools20022.repository.codeset.SpecialCollateral1Code.SpecialCollateral);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GeneralCollateral.getCodeName().get(), GeneralCollateral);
		codesByName.put(SpecialCollateral.getCodeName().get(), SpecialCollateral);
	}

	public static SpecialCollateral1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SpecialCollateral1Code[] values() {
		SpecialCollateral1Code[] values = new SpecialCollateral1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SpecialCollateral1Code> {
		@Override
		public SpecialCollateral1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SpecialCollateral1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}