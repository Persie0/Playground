package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/MilestoneStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/MilestoneStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class MilestoneStatsJsonAdapter extends AbstractC4949k<MilestoneStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17319a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17320b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17321c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<MilestoneStats> f17322d;

    public MilestoneStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17319a = JsonReader.C4932a.m10513a("language", "knownWords", "lingqs", "dailyScore");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17320b = c4955q.m10565c(String.class, emptySet, "language");
        this.f17321c = c4955q.m10565c(Integer.TYPE, emptySet, "knownWords");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final MilestoneStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        Integer numMo9385a = numM850i;
        int i10 = -1;
        String strMo9385a = null;
        Integer numMo9385a2 = numMo9385a;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f17319a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f17320b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("language", "language", jsonReader);
                }
            } else if (iMo10512y0 == 1) {
                numM850i = this.f17321c.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("knownWords", "knownWords", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                numMo9385a2 = this.f17321c.mo9385a(jsonReader);
                if (numMo9385a2 == null) {
                    throw C9756b.m18254m("lingqs", "lingqs", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                numMo9385a = this.f17321c.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("dailyScore", "dailyScore", jsonReader);
                }
                i10 &= -9;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -15) {
            if (strMo9385a != null) {
                return new MilestoneStats(strMo9385a, numM850i.intValue(), numMo9385a2.intValue(), numMo9385a.intValue());
            }
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        Constructor<MilestoneStats> declaredConstructor = this.f17322d;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = MilestoneStats.class.getDeclaredConstructor(String.class, cls, cls, cls, cls, C9756b.f49813c);
            this.f17322d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "MilestoneStats::class.ja…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (strMo9385a == null) {
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        objArr[0] = strMo9385a;
        objArr[1] = numM850i;
        objArr[2] = numMo9385a2;
        objArr[3] = numMo9385a;
        objArr[4] = Integer.valueOf(i10);
        objArr[5] = null;
        MilestoneStats milestoneStatsNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(milestoneStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return milestoneStatsNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, MilestoneStats milestoneStats) throws IOException {
        MilestoneStats milestoneStats2 = milestoneStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (milestoneStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("language");
        this.f17320b.mo9386f(abstractC9310n, milestoneStats2.f17315a);
        abstractC9310n.mo10551C("knownWords");
        Integer numValueOf = Integer.valueOf(milestoneStats2.f17316b);
        AbstractC4949k<Integer> abstractC4949k = this.f17321c;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("lingqs");
        C0166e.m775v(milestoneStats2.f17317c, abstractC4949k, abstractC9310n, "dailyScore");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(milestoneStats2.f17318d));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(MilestoneStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
