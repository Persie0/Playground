package com.lingq.shared.network.result;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultDictionaryDataJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultDictionaryData;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultDictionaryDataJsonAdapter extends AbstractC4949k<ResultDictionaryData> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18408a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18409b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18410c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f18411d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ResultDictionaryData> f18412e;

    public ResultDictionaryDataJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18408a = JsonReader.C4932a.m10513a("id", "name", "order", "url_trans", "url_def", "popup_window", "langTo", "var1", "var2", "var3", "var4", "var5", "override_url");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18409b = c4955q.m10565c(cls, emptySet, "id");
        this.f18410c = c4955q.m10565c(String.class, emptySet, "name");
        this.f18411d = c4955q.m10565c(Boolean.TYPE, emptySet, "isPopUpWindow");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultDictionaryData mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a2 = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        String strMo9385a9 = null;
        String strMo9385a10 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18408a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a2 = this.f18409b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a = this.f18410c.mo9385a(jsonReader);
                    break;
                case 2:
                    numMo9385a = this.f18409b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("order", "order", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    strMo9385a2 = this.f18410c.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a3 = this.f18410c.mo9385a(jsonReader);
                    break;
                case 5:
                    boolMo9385a = this.f18411d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isPopUpWindow", "popup_window", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a4 = this.f18410c.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a5 = this.f18410c.mo9385a(jsonReader);
                    break;
                case 8:
                    strMo9385a6 = this.f18410c.mo9385a(jsonReader);
                    break;
                case 9:
                    strMo9385a7 = this.f18410c.mo9385a(jsonReader);
                    break;
                case 10:
                    strMo9385a8 = this.f18410c.mo9385a(jsonReader);
                    break;
                case 11:
                    strMo9385a9 = this.f18410c.mo9385a(jsonReader);
                    break;
                case 12:
                    strMo9385a10 = this.f18410c.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -37) {
            if (numMo9385a2 != null) {
                return new ResultDictionaryData(numMo9385a2.intValue(), strMo9385a, numMo9385a.intValue(), strMo9385a2, strMo9385a3, boolMo9385a.booleanValue(), strMo9385a4, strMo9385a5, strMo9385a6, strMo9385a7, strMo9385a8, strMo9385a9, strMo9385a10);
            }
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        Constructor<ResultDictionaryData> declaredConstructor = this.f18412e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultDictionaryData.class.getDeclaredConstructor(cls, String.class, cls, String.class, String.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, C9756b.f49813c);
            this.f18412e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultDictionaryData::cl…his.constructorRef = it }");
        }
        Object[] objArr = new Object[15];
        if (numMo9385a2 == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a2.intValue());
        objArr[1] = strMo9385a;
        objArr[2] = numMo9385a;
        objArr[3] = strMo9385a2;
        objArr[4] = strMo9385a3;
        objArr[5] = boolMo9385a;
        objArr[6] = strMo9385a4;
        objArr[7] = strMo9385a5;
        objArr[8] = strMo9385a6;
        objArr[9] = strMo9385a7;
        objArr[10] = strMo9385a8;
        objArr[11] = strMo9385a9;
        objArr[12] = strMo9385a10;
        objArr[13] = Integer.valueOf(i10);
        objArr[14] = null;
        ResultDictionaryData resultDictionaryDataNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultDictionaryDataNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultDictionaryDataNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultDictionaryData resultDictionaryData) throws IOException {
        ResultDictionaryData resultDictionaryData2 = resultDictionaryData;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultDictionaryData2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(resultDictionaryData2.f18395a);
        AbstractC4949k<Integer> abstractC4949k = this.f18409b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("name");
        String str = resultDictionaryData2.f18396b;
        AbstractC4949k<String> abstractC4949k2 = this.f18410c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("order");
        C0166e.m775v(resultDictionaryData2.f18397c, abstractC4949k, abstractC9310n, "url_trans");
        abstractC4949k2.mo9386f(abstractC9310n, resultDictionaryData2.f18398d);
        abstractC9310n.mo10551C("url_def");
        abstractC4949k2.mo9386f(abstractC9310n, resultDictionaryData2.f18399e);
        abstractC9310n.mo10551C("popup_window");
        this.f18411d.mo9386f(abstractC9310n, Boolean.valueOf(resultDictionaryData2.f18400f));
        abstractC9310n.mo10551C("langTo");
        abstractC4949k2.mo9386f(abstractC9310n, resultDictionaryData2.f18401g);
        abstractC9310n.mo10551C("var1");
        abstractC4949k2.mo9386f(abstractC9310n, resultDictionaryData2.f18402h);
        abstractC9310n.mo10551C("var2");
        abstractC4949k2.mo9386f(abstractC9310n, resultDictionaryData2.f18403i);
        abstractC9310n.mo10551C("var3");
        abstractC4949k2.mo9386f(abstractC9310n, resultDictionaryData2.f18404j);
        abstractC9310n.mo10551C("var4");
        abstractC4949k2.mo9386f(abstractC9310n, resultDictionaryData2.f18405k);
        abstractC9310n.mo10551C("var5");
        abstractC4949k2.mo9386f(abstractC9310n, resultDictionaryData2.f18406l);
        abstractC9310n.mo10551C("override_url");
        abstractC4949k2.mo9386f(abstractC9310n, resultDictionaryData2.f18407m);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ResultDictionaryData)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
