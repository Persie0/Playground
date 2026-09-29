package com.lingq.shared.network.result;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultsJsonAdapter;", "ResultType", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/Results;", "Lcom/squareup/moshi/q;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/q;[Ljava/lang/reflect/Type;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultsJsonAdapter<ResultType> extends AbstractC4949k<Results<ResultType>> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f19137a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f19138b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f19139c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<List<ResultType>> f19140d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<Results<ResultType>> f19141e;

    public ResultsJsonAdapter(C4955q c4955q, Type[] typeArr) {
        C5207g.m11111f(c4955q, "moshi");
        C5207g.m11111f(typeArr, "types");
        if (!(typeArr.length == 1)) {
            String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [ResultType], but received " + typeArr.length;
            C5207g.m11110e(str, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalArgumentException(str.toString());
        }
        this.f19137a = JsonReader.C4932a.m10513a("count", "next", "previous", "results");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f19138b = c4955q.m10565c(cls, emptySet, "count");
        this.f19139c = c4955q.m10565c(String.class, emptySet, "next");
        this.f19140d = c4955q.m10565c(C9312p.m17659d(List.class, typeArr[0]), emptySet, "results");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Object mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<ResultType> listMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f19137a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numM850i = this.f19138b.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("count", "count", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a = this.f19139c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 2) {
                strMo9385a2 = this.f19139c.mo9385a(jsonReader);
            } else if (iMo10512y0 == 3) {
                listMo9385a = this.f19140d.mo9385a(jsonReader);
                i10 &= -9;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -10) {
            return new Results(numM850i.intValue(), strMo9385a, strMo9385a2, listMo9385a);
        }
        Constructor<Results<ResultType>> declaredConstructor = this.f19141e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Results.class.getDeclaredConstructor(cls, String.class, String.class, List.class, cls, C9756b.f49813c);
            C5207g.m11109d(declaredConstructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<com.lingq.shared.network.result.Results<ResultType of com.lingq.shared.network.result.ResultsJsonAdapter>>");
            this.f19141e = declaredConstructor;
        }
        Results<ResultType> resultsNewInstance = declaredConstructor.newInstance(numM850i, strMo9385a, strMo9385a2, listMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(resultsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultsNewInstance;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
        Results results = (Results) obj;
        C5207g.m11111f(abstractC9310n, "writer");
        if (results == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("count");
        this.f19138b.mo9386f(abstractC9310n, Integer.valueOf(results.f19133a));
        abstractC9310n.mo10551C("next");
        String str = results.f19134b;
        AbstractC4949k<String> abstractC4949k = this.f19139c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("previous");
        abstractC4949k.mo9386f(abstractC9310n, results.f19135c);
        abstractC9310n.mo10551C("results");
        this.f19140d.mo9386f(abstractC9310n, (List<ResultType>) results.f19136d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(29, "GeneratedJsonAdapter(Results)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
