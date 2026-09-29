package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/DictionaryDataJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/DictionaryData;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DictionaryDataJsonAdapter extends AbstractC4949k<DictionaryData> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16963a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f16964b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f16965c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f16966d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<DictionaryData> f16967e;

    public DictionaryDataJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16963a = JsonReader.C4932a.m10513a("id", "name", "order", "url_trans", "url_def", "popup_window", "langTo", "var1", "var2", "var3", "var4", "var5", "override_url");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f16964b = c4955q.m10565c(cls, emptySet, "id");
        this.f16965c = c4955q.m10565c(String.class, emptySet, "name");
        this.f16966d = c4955q.m10565c(Boolean.TYPE, emptySet, "isPopUpWindow");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final DictionaryData mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String strMo9385a = null;
        String str3 = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        while (true) {
            String str4 = strMo9385a4;
            String str5 = strMo9385a3;
            String str6 = strMo9385a2;
            String str7 = str3;
            Boolean bool = boolMo9385a;
            String str8 = strMo9385a;
            String str9 = str2;
            Integer num3 = num;
            String str10 = str;
            Integer num4 = num2;
            int i11 = i10;
            if (!jsonReader.mo10511w()) {
                jsonReader.mo10508q();
                if (i11 == -33) {
                    if (num4 == null) {
                        throw C9756b.m18248g("id", "id", jsonReader);
                    }
                    int iIntValue = num4.intValue();
                    if (str10 == null) {
                        throw C9756b.m18248g("name", "name", jsonReader);
                    }
                    if (num3 == null) {
                        throw C9756b.m18248g("order", "order", jsonReader);
                    }
                    int iIntValue2 = num3.intValue();
                    if (str9 == null) {
                        throw C9756b.m18248g("urlToTransform", "url_trans", jsonReader);
                    }
                    if (str8 == null) {
                        throw C9756b.m18248g("urlDefinition", "url_def", jsonReader);
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    if (str7 == null) {
                        throw C9756b.m18248g("languageTo", "langTo", jsonReader);
                    }
                    if (str6 == null) {
                        throw C9756b.m18248g("urlVar1", "var1", jsonReader);
                    }
                    if (str5 == null) {
                        throw C9756b.m18248g("urlVar2", "var2", jsonReader);
                    }
                    if (str4 == null) {
                        throw C9756b.m18248g("urlVar3", "var3", jsonReader);
                    }
                    if (strMo9385a5 == null) {
                        throw C9756b.m18248g("urlVar4", "var4", jsonReader);
                    }
                    if (strMo9385a6 == null) {
                        throw C9756b.m18248g("urlVar5", "var5", jsonReader);
                    }
                    if (strMo9385a7 != null) {
                        return new DictionaryData(iIntValue, str10, iIntValue2, str9, str8, zBooleanValue, str7, str6, str5, str4, strMo9385a5, strMo9385a6, strMo9385a7);
                    }
                    throw C9756b.m18248g("overrideUrl", "override_url", jsonReader);
                }
                Constructor<DictionaryData> declaredConstructor = this.f16967e;
                int i12 = 15;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    declaredConstructor = DictionaryData.class.getDeclaredConstructor(cls, String.class, cls, String.class, String.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, C9756b.f49813c);
                    this.f16967e = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "DictionaryData::class.ja…his.constructorRef = it }");
                    i12 = 15;
                }
                Object[] objArr = new Object[i12];
                if (num4 == null) {
                    throw C9756b.m18248g("id", "id", jsonReader);
                }
                objArr[0] = Integer.valueOf(num4.intValue());
                if (str10 == null) {
                    throw C9756b.m18248g("name", "name", jsonReader);
                }
                objArr[1] = str10;
                if (num3 == null) {
                    throw C9756b.m18248g("order", "order", jsonReader);
                }
                objArr[2] = Integer.valueOf(num3.intValue());
                if (str9 == null) {
                    throw C9756b.m18248g("urlToTransform", "url_trans", jsonReader);
                }
                objArr[3] = str9;
                if (str8 == null) {
                    throw C9756b.m18248g("urlDefinition", "url_def", jsonReader);
                }
                objArr[4] = str8;
                objArr[5] = bool;
                if (str7 == null) {
                    throw C9756b.m18248g("languageTo", "langTo", jsonReader);
                }
                objArr[6] = str7;
                if (str6 == null) {
                    throw C9756b.m18248g("urlVar1", "var1", jsonReader);
                }
                objArr[7] = str6;
                if (str5 == null) {
                    throw C9756b.m18248g("urlVar2", "var2", jsonReader);
                }
                objArr[8] = str5;
                if (str4 == null) {
                    throw C9756b.m18248g("urlVar3", "var3", jsonReader);
                }
                objArr[9] = str4;
                if (strMo9385a5 == null) {
                    throw C9756b.m18248g("urlVar4", "var4", jsonReader);
                }
                objArr[10] = strMo9385a5;
                if (strMo9385a6 == null) {
                    throw C9756b.m18248g("urlVar5", "var5", jsonReader);
                }
                objArr[11] = strMo9385a6;
                if (strMo9385a7 == null) {
                    throw C9756b.m18248g("overrideUrl", "override_url", jsonReader);
                }
                objArr[12] = strMo9385a7;
                objArr[13] = Integer.valueOf(i11);
                objArr[14] = null;
                DictionaryData dictionaryDataNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(dictionaryDataNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return dictionaryDataNewInstance;
            }
            switch (jsonReader.mo10512y0(this.f16963a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    Integer numMo9385a = this.f16964b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    num2 = numMo9385a;
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                    break;
                case 1:
                    String strMo9385a8 = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a8 == null) {
                        throw C9756b.m18254m("name", "name", jsonReader);
                    }
                    str = strMo9385a8;
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                    break;
                case 2:
                    Integer numMo9385a2 = this.f16964b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("order", "order", jsonReader);
                    }
                    num = numMo9385a2;
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                    break;
                case 3:
                    String strMo9385a9 = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a9 == null) {
                        throw C9756b.m18254m("urlToTransform", "url_trans", jsonReader);
                    }
                    str2 = strMo9385a9;
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                    break;
                case 4:
                    strMo9385a = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("urlDefinition", "url_def", jsonReader);
                    }
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                    break;
                case 5:
                    boolMo9385a = this.f16966d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isPopUpWindow", "popup_window", jsonReader);
                    }
                    i10 = i11 & (-33);
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    String strMo9385a10 = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a10 == null) {
                        throw C9756b.m18254m("languageTo", "langTo", jsonReader);
                    }
                    str3 = strMo9385a10;
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a2 = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("urlVar1", "var1", jsonReader);
                    }
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                    break;
                case 8:
                    strMo9385a3 = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("urlVar2", "var2", jsonReader);
                    }
                    strMo9385a4 = str4;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                    break;
                case 9:
                    strMo9385a4 = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("urlVar3", "var3", jsonReader);
                    }
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                case 10:
                    strMo9385a5 = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("urlVar4", "var4", jsonReader);
                    }
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                case 11:
                    strMo9385a6 = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a6 == null) {
                        throw C9756b.m18254m("urlVar5", "var5", jsonReader);
                    }
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                case 12:
                    strMo9385a7 = this.f16965c.mo9385a(jsonReader);
                    if (strMo9385a7 == null) {
                        throw C9756b.m18254m("overrideUrl", "override_url", jsonReader);
                    }
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
                default:
                    strMo9385a4 = str4;
                    strMo9385a3 = str5;
                    strMo9385a2 = str6;
                    str3 = str7;
                    strMo9385a = str8;
                    str2 = str9;
                    num = num3;
                    str = str10;
                    num2 = num4;
                    boolMo9385a = bool;
                    i10 = i11;
                    break;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, DictionaryData dictionaryData) throws IOException {
        DictionaryData dictionaryData2 = dictionaryData;
        C5207g.m11111f(abstractC9310n, "writer");
        if (dictionaryData2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(dictionaryData2.f16950a);
        AbstractC4949k<Integer> abstractC4949k = this.f16964b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("name");
        String str = dictionaryData2.f16951b;
        AbstractC4949k<String> abstractC4949k2 = this.f16965c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("order");
        C0166e.m775v(dictionaryData2.f16952c, abstractC4949k, abstractC9310n, "url_trans");
        abstractC4949k2.mo9386f(abstractC9310n, dictionaryData2.f16953d);
        abstractC9310n.mo10551C("url_def");
        abstractC4949k2.mo9386f(abstractC9310n, dictionaryData2.f16954e);
        abstractC9310n.mo10551C("popup_window");
        this.f16966d.mo9386f(abstractC9310n, Boolean.valueOf(dictionaryData2.f16955f));
        abstractC9310n.mo10551C("langTo");
        abstractC4949k2.mo9386f(abstractC9310n, dictionaryData2.f16956g);
        abstractC9310n.mo10551C("var1");
        abstractC4949k2.mo9386f(abstractC9310n, dictionaryData2.f16957h);
        abstractC9310n.mo10551C("var2");
        abstractC4949k2.mo9386f(abstractC9310n, dictionaryData2.f16958i);
        abstractC9310n.mo10551C("var3");
        abstractC4949k2.mo9386f(abstractC9310n, dictionaryData2.f16959j);
        abstractC9310n.mo10551C("var4");
        abstractC4949k2.mo9386f(abstractC9310n, dictionaryData2.f16960k);
        abstractC9310n.mo10551C("var5");
        abstractC4949k2.mo9386f(abstractC9310n, dictionaryData2.f16961l);
        abstractC9310n.mo10551C("override_url");
        abstractC4949k2.mo9386f(abstractC9310n, dictionaryData2.f16962m);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(DictionaryData)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
