package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/StreakJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Streak;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StreakJsonAdapter extends AbstractC4949k<Streak> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17461a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17462b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17463c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Double> f17464d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Boolean> f17465e;

    public StreakJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17461a = JsonReader.C4932a.m10513a("language", "streakDays", "coins", "latestStreakDays", "isStreakBroken");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17462b = c4955q.m10565c(String.class, emptySet, "language");
        this.f17463c = c4955q.m10565c(Integer.class, emptySet, "streakDays");
        this.f17464d = c4955q.m10565c(Double.class, emptySet, "coins");
        this.f17465e = c4955q.m10565c(Boolean.class, emptySet, "isStreakBroken");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Streak mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        String strMo9385a = null;
        Integer numMo9385a = null;
        Double dMo9385a = null;
        Integer numMo9385a2 = null;
        Boolean boolMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17461a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 != 0) {
                AbstractC4949k<Integer> abstractC4949k = this.f17463c;
                if (iMo10512y0 == 1) {
                    numMo9385a = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 2) {
                    dMo9385a = this.f17464d.mo9385a(jsonReader);
                } else if (iMo10512y0 == 3) {
                    numMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                } else if (iMo10512y0 == 4) {
                    boolMo9385a = this.f17465e.mo9385a(jsonReader);
                }
            } else {
                strMo9385a = this.f17462b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("language", "language", jsonReader);
                }
            }
        }
        jsonReader.mo10508q();
        if (strMo9385a != null) {
            return new Streak(strMo9385a, numMo9385a, dMo9385a, numMo9385a2, boolMo9385a);
        }
        throw C9756b.m18248g("language", "language", jsonReader);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Streak streak) throws IOException {
        Streak streak2 = streak;
        C5207g.m11111f(abstractC9310n, "writer");
        if (streak2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("language");
        this.f17462b.mo9386f(abstractC9310n, streak2.f17456a);
        abstractC9310n.mo10551C("streakDays");
        Integer num = streak2.f17457b;
        AbstractC4949k<Integer> abstractC4949k = this.f17463c;
        abstractC4949k.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("coins");
        this.f17464d.mo9386f(abstractC9310n, streak2.f17458c);
        abstractC9310n.mo10551C("latestStreakDays");
        abstractC4949k.mo9386f(abstractC9310n, streak2.f17459d);
        abstractC9310n.mo10551C("isStreakBroken");
        this.f17465e.mo9386f(abstractC9310n, streak2.f17460e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(28, "GeneratedJsonAdapter(Streak)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
