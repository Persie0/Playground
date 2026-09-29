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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultReferralStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultReferralStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultReferralStatsJsonAdapter extends AbstractC4949k<ResultReferralStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18915a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18916b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<ResultReferralStats> f18917c;

    public ResultReferralStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18915a = JsonReader.C4932a.m10513a("earned_points", "last_month_points", "referrals_count");
        this.f18916b = c4955q.m10565c(Integer.class, EmptySet.f38034a, "earnedPoints");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultReferralStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        Integer numMo9385a2 = null;
        Integer numMo9385a3 = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18915a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f18916b.mo9385a(jsonReader);
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                numMo9385a2 = this.f18916b.mo9385a(jsonReader);
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                numMo9385a3 = this.f18916b.mo9385a(jsonReader);
                i10 &= -5;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -8) {
            return new ResultReferralStats(numMo9385a, numMo9385a2, numMo9385a3);
        }
        Constructor<ResultReferralStats> declaredConstructor = this.f18917c;
        if (declaredConstructor == null) {
            declaredConstructor = ResultReferralStats.class.getDeclaredConstructor(Integer.class, Integer.class, Integer.class, Integer.TYPE, C9756b.f49813c);
            this.f18917c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultReferralStats::cla…his.constructorRef = it }");
        }
        ResultReferralStats resultReferralStatsNewInstance = declaredConstructor.newInstance(numMo9385a, numMo9385a2, numMo9385a3, Integer.valueOf(i10), null);
        C5207g.m11110e(resultReferralStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultReferralStatsNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultReferralStats resultReferralStats) throws IOException {
        ResultReferralStats resultReferralStats2 = resultReferralStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultReferralStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("earned_points");
        Integer num = resultReferralStats2.f18912a;
        AbstractC4949k<Integer> abstractC4949k = this.f18916b;
        abstractC4949k.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("last_month_points");
        abstractC4949k.mo9386f(abstractC9310n, resultReferralStats2.f18913b);
        abstractC9310n.mo10551C("referrals_count");
        abstractC4949k.mo9386f(abstractC9310n, resultReferralStats2.f18914c);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(41, "GeneratedJsonAdapter(ResultReferralStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
