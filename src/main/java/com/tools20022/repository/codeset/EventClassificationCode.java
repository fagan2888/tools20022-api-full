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
import com.tools20022.repository.codeset.EventClassificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Provides information about how the holder must participate in the event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventClassificationCode#Mandatory
 * EventClassificationCode.Mandatory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventClassificationCode#MandatoryWithOptions
 * EventClassificationCode.MandatoryWithOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventClassificationCode#Voluntary
 * EventClassificationCode.Voluntary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about how the holder must participate in the event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventClassificationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the event will occur without the beneficial owner or agent
	 * taking any action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventClassificationCode
	 * EventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandatory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the event will occur without the beneficial owner or agent taking any action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final EventClassificationCode Mandatory = new EventClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mandatory";
			definition = "Specifies that the event will occur without the beneficial owner or agent taking any action.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventClassificationCode.mmObject();
			codeName = "MAND";
		}
	};
	/**
	 * Specifies that the event will occur but the beneficial owner or agent has
	 * a choice as to the action taken against the holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventClassificationCode
	 * EventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAOP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryWithOptions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the event will occur but the beneficial owner or agent has a choice as to the action taken against the holdings."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final EventClassificationCode MandatoryWithOptions = new EventClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatoryWithOptions";
			definition = "Specifies that the event will occur but the beneficial owner or agent has a choice as to the action taken against the holdings.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventClassificationCode.mmObject();
			codeName = "MAOP";
		}
	};
	/**
	 * Specifies that this is an event in whichthe beneficial owner or agent of
	 * a security need to take action if the event is to affect their holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventClassificationCode
	 * EventClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VOLU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Voluntary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that this is an event in whichthe beneficial owner or agent of a security need to take action if the event is to affect their holdings."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final EventClassificationCode Voluntary = new EventClassificationCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Voluntary";
			definition = "Specifies that this is an event in whichthe beneficial owner or agent of a security need to take action if the event is to affect their holdings.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventClassificationCode.mmObject();
			codeName = "VOLU";
		}
	};
	final static private LinkedHashMap<String, EventClassificationCode> codesByName = new LinkedHashMap<>();

	protected EventClassificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventClassificationCode";
				definition = "Provides information about how the holder must participate in the event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventClassificationCode.Mandatory, com.tools20022.repository.codeset.EventClassificationCode.MandatoryWithOptions,
						com.tools20022.repository.codeset.EventClassificationCode.Voluntary);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Mandatory.getCodeName().get(), Mandatory);
		codesByName.put(MandatoryWithOptions.getCodeName().get(), MandatoryWithOptions);
		codesByName.put(Voluntary.getCodeName().get(), Voluntary);
	}

	public static EventClassificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventClassificationCode[] values() {
		EventClassificationCode[] values = new EventClassificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventClassificationCode> {
		@Override
		public EventClassificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventClassificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}