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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultTranslationSentenceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultTranslationSentence;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultTranslationSentenceJsonAdapter extends AbstractC4949k<ResultTranslationSentence> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18997a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18998b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<Double>> f18999c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f19000d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<ResultTranslation>> f19001e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<ResultTranslationSentence> f19002f;

    public ResultTranslationSentenceJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18997a = JsonReader.C4932a.m10513a("index", "timestamp", "text", "translations");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18998b = c4955q.m10565c(cls, emptySet, "index");
        this.f18999c = c4955q.m10565c(C9312p.m17659d(List.class, Double.class), emptySet, "timestamp");
        this.f19000d = c4955q.m10565c(String.class, emptySet, "text");
        this.f19001e = c4955q.m10565c(C9312p.m17659d(List.class, ResultTranslation.class), emptySet, "translations");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultTranslationSentence mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        List<Double> listMo9385a = null;
        String strMo9385a = null;
        List<ResultTranslation> listMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18997a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f18998b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("index", "index", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                listMo9385a = this.f18999c.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("timestamp", "timestamp", jsonReader);
                }
            } else if (iMo10512y0 == 2) {
                strMo9385a = this.f19000d.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("text", "text", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                listMo9385a2 = this.f19001e.mo9385a(jsonReader);
                if (listMo9385a2 == null) {
                    throw C9756b.m18254m("translations", "translations", jsonReader);
                }
                i10 &= -9;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -13) {
            if (numMo9385a == null) {
                throw C9756b.m18248g("index", "index", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            if (listMo9385a == null) {
                throw C9756b.m18248g("timestamp", "timestamp", jsonReader);
            }
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.network.result.ResultTranslation>");
            return new ResultTranslationSentence(iIntValue, listMo9385a, strMo9385a, listMo9385a2);
        }
        Constructor<ResultTranslationSentence> declaredConstructor = this.f19002f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultTranslationSentence.class.getDeclaredConstructor(cls, List.class, String.class, List.class, cls, C9756b.f49813c);
            this.f19002f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultTranslationSentenc…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (numMo9385a == null) {
            throw C9756b.m18248g("index", "index", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a.intValue());
        if (listMo9385a == null) {
            throw C9756b.m18248g("timestamp", "timestamp", jsonReader);
        }
        objArr[1] = listMo9385a;
        objArr[2] = strMo9385a;
        objArr[3] = listMo9385a2;
        objArr[4] = Integer.valueOf(i10);
        objArr[5] = null;
        ResultTranslationSentence resultTranslationSentenceNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultTranslationSentenceNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultTranslationSentenceNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultTranslationSentence resultTranslationSentence) throws IOException {
        ResultTranslationSentence resultTranslationSentence2 = resultTranslationSentence;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultTranslationSentence2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("index");
        this.f18998b.mo9386f(abstractC9310n, Integer.valueOf(resultTranslationSentence2.f18993a));
        abstractC9310n.mo10551C("timestamp");
        this.f18999c.mo9386f(abstractC9310n, resultTranslationSentence2.f18994b);
        abstractC9310n.mo10551C("text");
        this.f19000d.mo9386f(abstractC9310n, resultTranslationSentence2.f18995c);
        abstractC9310n.mo10551C("translations");
        this.f19001e.mo9386f(abstractC9310n, resultTranslationSentence2.f18996d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(47, "GeneratedJsonAdapter(ResultTranslationSentence)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
