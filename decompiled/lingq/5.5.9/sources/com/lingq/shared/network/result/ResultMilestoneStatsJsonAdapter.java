package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultMilestoneStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultMilestoneStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultMilestoneStatsJsonAdapter extends AbstractC4949k<ResultMilestoneStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18779a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18780b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<ResultMilestoneStats> f18781c;

    public ResultMilestoneStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18779a = JsonReader.C4932a.m10513a("known_words", "lingqs", "daily_score");
        this.f18780b = c4955q.m10565c(Integer.TYPE, EmptySet.f38034a, "knownWords");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultMilestoneStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        Integer numMo9385a = numM850i;
        Integer numMo9385a2 = numMo9385a;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18779a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numM850i = this.f18780b.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("knownWords", "known_words", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                numMo9385a = this.f18780b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("lingqs", "lingqs", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                numMo9385a2 = this.f18780b.mo9385a(jsonReader);
                if (numMo9385a2 == null) {
                    throw C9756b.m18254m("dailyScore", "daily_score", jsonReader);
                }
                i10 &= -5;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -8) {
            return new ResultMilestoneStats(numM850i.intValue(), numMo9385a.intValue(), numMo9385a2.intValue());
        }
        Constructor<ResultMilestoneStats> declaredConstructor = this.f18781c;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultMilestoneStats.class.getDeclaredConstructor(cls, cls, cls, cls, C9756b.f49813c);
            this.f18781c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultMilestoneStats::cl…his.constructorRef = it }");
        }
        ResultMilestoneStats resultMilestoneStatsNewInstance = declaredConstructor.newInstance(numM850i, numMo9385a, numMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(resultMilestoneStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultMilestoneStatsNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultMilestoneStats resultMilestoneStats) throws IOException {
        ResultMilestoneStats resultMilestoneStats2 = resultMilestoneStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultMilestoneStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("known_words");
        Integer numValueOf = Integer.valueOf(resultMilestoneStats2.f18776a);
        AbstractC4949k<Integer> abstractC4949k = this.f18780b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("lingqs");
        C0166e.m775v(resultMilestoneStats2.f18777b, abstractC4949k, abstractC9310n, "daily_score");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(resultMilestoneStats2.f18778c));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ResultMilestoneStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
