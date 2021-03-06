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
import com.tools20022.repository.codeset.StandingInstructionGrossNetCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of standing instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionGrossNetCode#Gross
 * StandingInstructionGrossNetCode.Gross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionGrossNetCode#Net
 * StandingInstructionGrossNetCode.Net}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StandingInstructionGrossNet1Code
 * StandingInstructionGrossNet1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StandingInstructionGrossNetCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of standing instruction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GROS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StandingInstructionGrossNetCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Gross payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionGrossNetCode
	 * StandingInstructionGrossNetCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final StandingInstructionGrossNetCode Gross = new StandingInstructionGrossNetCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gross";
			definition = "Gross payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingInstructionGrossNetCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Net payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StandingInstructionGrossNetCode
	 * StandingInstructionGrossNetCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Net"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final StandingInstructionGrossNetCode Net = new StandingInstructionGrossNetCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Net";
			definition = "Net payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.StandingInstructionGrossNetCode.mmObject();
			codeName = "NETT";
		}
	};
	final static private LinkedHashMap<String, StandingInstructionGrossNetCode> codesByName = new LinkedHashMap<>();

	protected StandingInstructionGrossNetCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GROS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingInstructionGrossNetCode";
				definition = "Specifies the type of standing instruction.";
				derivation_lazy = () -> Arrays.asList(StandingInstructionGrossNet1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingInstructionGrossNetCode.Gross, com.tools20022.repository.codeset.StandingInstructionGrossNetCode.Net);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Gross.getCodeName().get(), Gross);
		codesByName.put(Net.getCodeName().get(), Net);
	}

	public static StandingInstructionGrossNetCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StandingInstructionGrossNetCode[] values() {
		StandingInstructionGrossNetCode[] values = new StandingInstructionGrossNetCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StandingInstructionGrossNetCode> {
		@Override
		public StandingInstructionGrossNetCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StandingInstructionGrossNetCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}