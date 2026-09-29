package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.TextToken;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultSentenceJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultSentence;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultSentenceJsonAdapter extends AbstractC4949k<ResultSentence> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18933a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<List<TextToken>> f18934b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18935c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f18936d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<Float>> f18937e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<ResultSentence> f18938f;

    public ResultSentenceJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18933a = JsonReader.C4932a.m10513a("tokens", "text", "normalizedText", "index", "timestamp");
        C9756b.b bVarM17659d = C9312p.m17659d(List.class, TextToken.class);
        EmptySet emptySet = EmptySet.f38034a;
        this.f18934b = c4955q.m10565c(bVarM17659d, emptySet, "tokens");
        this.f18935c = c4955q.m10565c(String.class, emptySet, "text");
        this.f18936d = c4955q.m10565c(Integer.class, emptySet, "index");
        this.f18937e = c4955q.m10565c(C9312p.m17659d(List.class, Float.class), emptySet, "timestamp");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultSentence mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        List<TextToken> listMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a = null;
        List<Float> listMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18933a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                listMo9385a = this.f18934b.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("tokens", "tokens", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a = this.f18935c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 2) {
                strMo9385a2 = this.f18935c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 3) {
                numMo9385a = this.f18936d.mo9385a(jsonReader);
            } else if (iMo10512y0 == 4) {
                listMo9385a2 = this.f18937e.mo9385a(jsonReader);
                i10 &= -17;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -18) {
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.TextToken>");
            return new ResultSentence(listMo9385a, strMo9385a, strMo9385a2, numMo9385a, listMo9385a2);
        }
        Constructor<ResultSentence> declaredConstructor = this.f18938f;
        if (declaredConstructor == null) {
            declaredConstructor = ResultSentence.class.getDeclaredConstructor(List.class, String.class, String.class, Integer.class, List.class, Integer.TYPE, C9756b.f49813c);
            this.f18938f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultSentence::class.ja…his.constructorRef = it }");
        }
        ResultSentence resultSentenceNewInstance = declaredConstructor.newInstance(listMo9385a, strMo9385a, strMo9385a2, numMo9385a, listMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(resultSentenceNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultSentenceNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultSentence resultSentence) throws IOException {
        ResultSentence resultSentence2 = resultSentence;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultSentence2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("tokens");
        this.f18934b.mo9386f(abstractC9310n, resultSentence2.f18928a);
        abstractC9310n.mo10551C("text");
        String str = resultSentence2.f18929b;
        AbstractC4949k<String> abstractC4949k = this.f18935c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("normalizedText");
        abstractC4949k.mo9386f(abstractC9310n, resultSentence2.f18930c);
        abstractC9310n.mo10551C("index");
        this.f18936d.mo9386f(abstractC9310n, resultSentence2.f18931d);
        abstractC9310n.mo10551C("timestamp");
        this.f18937e.mo9386f(abstractC9310n, resultSentence2.f18932e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(ResultSentence)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
