package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultTranslationSentenceV2JsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultTranslationSentenceV2;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultTranslationSentenceV2JsonAdapter extends AbstractC4949k<ResultTranslationSentenceV2> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f19008a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f19009b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Double> f19010c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f19011d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<ResultTranslationV2>> f19012e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<ResultTranslationSentenceV2> f19013f;

    public ResultTranslationSentenceV2JsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f19008a = JsonReader.C4932a.m10513a("index", "audio", "audio_end", "text", "translation");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f19009b = c4955q.m10565c(cls, emptySet, "index");
        this.f19010c = c4955q.m10565c(Double.class, emptySet, "audio");
        this.f19011d = c4955q.m10565c(String.class, emptySet, "text");
        this.f19012e = c4955q.m10565c(C9312p.m17659d(List.class, ResultTranslationV2.class), emptySet, "translation");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultTranslationSentenceV2 mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        Double dMo9385a = null;
        Double dMo9385a2 = null;
        String strMo9385a = null;
        List<ResultTranslationV2> listMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f19008a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f19009b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("index", "index", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                dMo9385a = this.f19010c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 2) {
                dMo9385a2 = this.f19010c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 3) {
                strMo9385a = this.f19011d.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("text", "text", jsonReader);
                }
                i10 &= -9;
            } else if (iMo10512y0 == 4) {
                listMo9385a = this.f19012e.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("translation", "translation", jsonReader);
                }
                i10 &= -17;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -25) {
            if (numMo9385a == null) {
                throw C9756b.m18248g("index", "index", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.network.result.ResultTranslationV2>");
            return new ResultTranslationSentenceV2(iIntValue, dMo9385a, dMo9385a2, strMo9385a, listMo9385a);
        }
        Constructor<ResultTranslationSentenceV2> declaredConstructor = this.f19013f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultTranslationSentenceV2.class.getDeclaredConstructor(cls, Double.class, Double.class, String.class, List.class, cls, C9756b.f49813c);
            this.f19013f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultTranslationSentenc…his.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        if (numMo9385a == null) {
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a.intValue());
        objArr[1] = dMo9385a;
        objArr[2] = dMo9385a2;
        objArr[3] = strMo9385a;
        objArr[4] = listMo9385a;
        objArr[5] = Integer.valueOf(i10);
        objArr[6] = null;
        ResultTranslationSentenceV2 resultTranslationSentenceV2NewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultTranslationSentenceV2NewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultTranslationSentenceV2NewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultTranslationSentenceV2 resultTranslationSentenceV2) throws IOException {
        ResultTranslationSentenceV2 resultTranslationSentenceV3 = resultTranslationSentenceV2;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultTranslationSentenceV3 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("index");
        this.f19009b.mo9386f(abstractC9310n, Integer.valueOf(resultTranslationSentenceV3.f19003a));
        abstractC9310n.mo10551C("audio");
        Double d10 = resultTranslationSentenceV3.f19004b;
        AbstractC4949k<Double> abstractC4949k = this.f19010c;
        abstractC4949k.mo9386f(abstractC9310n, d10);
        abstractC9310n.mo10551C("audio_end");
        abstractC4949k.mo9386f(abstractC9310n, resultTranslationSentenceV3.f19005c);
        abstractC9310n.mo10551C("text");
        this.f19011d.mo9386f(abstractC9310n, resultTranslationSentenceV3.f19006d);
        abstractC9310n.mo10551C("translation");
        this.f19012e.mo9386f(abstractC9310n, resultTranslationSentenceV3.f19007e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(49, "GeneratedJsonAdapter(ResultTranslationSentenceV2)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
