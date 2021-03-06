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
import com.tools20022.repository.codeset.BaselineStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the status of a baseline.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#Proposed
 * BaselineStatus1Code.Proposed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#Closed
 * BaselineStatus1Code.Closed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#PartiallyMatched
 * BaselineStatus1Code.PartiallyMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#Established
 * BaselineStatus1Code.Established}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#Active
 * BaselineStatus1Code.Active}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#Complete
 * BaselineStatus1Code.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#AmendmentRequested
 * BaselineStatus1Code.AmendmentRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#ReActivateRequested
 * BaselineStatus1Code.ReActivateRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#CloseRequested
 * BaselineStatus1Code.CloseRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code#CompleteRequested
 * BaselineStatus1Code.CompleteRequested}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
 * BaselineStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the status of a baseline."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PROP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BaselineStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proposed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code Proposed = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proposed";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.Proposed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code Closed = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closed";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.Closed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code PartiallyMatched = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyMatched";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.PartiallyMatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Established"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code Established = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Established";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.Established.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code Active = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Active";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.Active.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code Complete = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.Complete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code AmendmentRequested = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.AmendmentRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReActivateRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code ReActivateRequested = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReActivateRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.ReActivateRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code CloseRequested = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CloseRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.CloseRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus1Code
	 * BaselineStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompleteRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BaselineStatus1Code CompleteRequested = new BaselineStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus1Code.mmObject();
			codeName = BaselineStatusCode.CompleteRequested.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BaselineStatus1Code> codesByName = new LinkedHashMap<>();

	protected BaselineStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PROP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BaselineStatus1Code";
				definition = "Indicates the status of a baseline.";
				trace_lazy = () -> BaselineStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BaselineStatus1Code.Proposed, com.tools20022.repository.codeset.BaselineStatus1Code.Closed,
						com.tools20022.repository.codeset.BaselineStatus1Code.PartiallyMatched, com.tools20022.repository.codeset.BaselineStatus1Code.Established, com.tools20022.repository.codeset.BaselineStatus1Code.Active,
						com.tools20022.repository.codeset.BaselineStatus1Code.Complete, com.tools20022.repository.codeset.BaselineStatus1Code.AmendmentRequested, com.tools20022.repository.codeset.BaselineStatus1Code.ReActivateRequested,
						com.tools20022.repository.codeset.BaselineStatus1Code.CloseRequested, com.tools20022.repository.codeset.BaselineStatus1Code.CompleteRequested);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Proposed.getCodeName().get(), Proposed);
		codesByName.put(Closed.getCodeName().get(), Closed);
		codesByName.put(PartiallyMatched.getCodeName().get(), PartiallyMatched);
		codesByName.put(Established.getCodeName().get(), Established);
		codesByName.put(Active.getCodeName().get(), Active);
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(AmendmentRequested.getCodeName().get(), AmendmentRequested);
		codesByName.put(ReActivateRequested.getCodeName().get(), ReActivateRequested);
		codesByName.put(CloseRequested.getCodeName().get(), CloseRequested);
		codesByName.put(CompleteRequested.getCodeName().get(), CompleteRequested);
	}

	public static BaselineStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BaselineStatus1Code[] values() {
		BaselineStatus1Code[] values = new BaselineStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BaselineStatus1Code> {
		@Override
		public BaselineStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BaselineStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}