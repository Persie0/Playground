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
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultChallengeDetailsStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultChallengeDetailsStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultChallengeDetailsStatsJsonAdapter extends AbstractC4949k<ResultChallengeDetailsStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18336a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18337b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f18338c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<ResultChallengeDetailsStats> f18339d;

    public ResultChallengeDetailsStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18336a = JsonReader.C4932a.m10513a("code", "value", "title");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18337b = c4955q.m10565c(String.class, emptySet, "code");
        this.f18338c = c4955q.m10565c(Integer.TYPE, emptySet, "value");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultChallengeDetailsStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        String strMo9385a2 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18336a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f18337b.mo9385a(jsonReader);
            } else if (iMo10512y0 == 1) {
                numM850i = this.f18338c.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("value__", "value", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                strMo9385a2 = this.f18337b.mo9385a(jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (i10 == -3) {
            return new ResultChallengeDetailsStats(strMo9385a, numM850i.intValue(), strMo9385a2);
        }
        Constructor<ResultChallengeDetailsStats> declaredConstructor = this.f18339d;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultChallengeDetailsStats.class.getDeclaredConstructor(String.class, cls, String.class, cls, C9756b.f49813c);
            this.f18339d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultChallengeDetailsSt…his.constructorRef = it }");
        }
        ResultChallengeDetailsStats resultChallengeDetailsStatsNewInstance = declaredConstructor.newInstance(strMo9385a, numM850i, strMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(resultChallengeDetailsStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultChallengeDetailsStatsNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultChallengeDetailsStats resultChallengeDetailsStats) throws IOException {
        ResultChallengeDetailsStats resultChallengeDetailsStats2 = resultChallengeDetailsStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultChallengeDetailsStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("code");
        String str = resultChallengeDetailsStats2.f18333a;
        AbstractC4949k<String> abstractC4949k = this.f18337b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("value");
        this.f18338c.mo9386f(abstractC9310n, Integer.valueOf(resultChallengeDetailsStats2.f18334b));
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, resultChallengeDetailsStats2.f18335c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(49, "GeneratedJsonAdapter(ResultChallengeDetailsStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
