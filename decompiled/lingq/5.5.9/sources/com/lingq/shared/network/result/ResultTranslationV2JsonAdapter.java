package com.lingq.shared.network.result;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultTranslationV2JsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultTranslationV2;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultTranslationV2JsonAdapter extends AbstractC4949k<ResultTranslationV2> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f19017a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f19018b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f19019c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<ResultTranslationV2> f19020d;

    public ResultTranslationV2JsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f19017a = JsonReader.C4932a.m10513a("text", "language", "is_google_translate");
        EmptySet emptySet = EmptySet.f38034a;
        this.f19018b = c4955q.m10565c(String.class, emptySet, "text");
        this.f19019c = c4955q.m10565c(Boolean.TYPE, emptySet, "isGoogleTranslate");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultTranslationV2 mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f19017a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f19018b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("text", "text", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f19018b.mo9385a(jsonReader);
                if (strMo9385a2 == null) {
                    throw C9756b.m18254m("language", "language", jsonReader);
                }
            } else if (iMo10512y0 == 2) {
                boolMo9385a = this.f19019c.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isGoogleTranslate", "is_google_translate", jsonReader);
                }
                i10 &= -5;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -5) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("text", "text", jsonReader);
            }
            if (strMo9385a2 != null) {
                return new ResultTranslationV2(strMo9385a, strMo9385a2, boolMo9385a.booleanValue());
            }
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        Constructor<ResultTranslationV2> declaredConstructor = this.f19020d;
        if (declaredConstructor == null) {
            declaredConstructor = ResultTranslationV2.class.getDeclaredConstructor(String.class, String.class, Boolean.TYPE, Integer.TYPE, C9756b.f49813c);
            this.f19020d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultTranslationV2::cla…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        if (strMo9385a == null) {
            throw C9756b.m18248g("text", "text", jsonReader);
        }
        objArr[0] = strMo9385a;
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        objArr[1] = strMo9385a2;
        objArr[2] = boolMo9385a;
        objArr[3] = Integer.valueOf(i10);
        objArr[4] = null;
        ResultTranslationV2 resultTranslationV2NewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultTranslationV2NewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultTranslationV2NewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultTranslationV2 resultTranslationV2) throws IOException {
        ResultTranslationV2 resultTranslationV3 = resultTranslationV2;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultTranslationV3 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("text");
        String str = resultTranslationV3.f19014a;
        AbstractC4949k<String> abstractC4949k = this.f19018b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("language");
        abstractC4949k.mo9386f(abstractC9310n, resultTranslationV3.f19015b);
        abstractC9310n.mo10551C("is_google_translate");
        this.f19019c.mo9386f(abstractC9310n, Boolean.valueOf(resultTranslationV3.f19016c));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(41, "GeneratedJsonAdapter(ResultTranslationV2)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
