package com.lingq.entity;

import android.support.v4.media.C0141b;
import androidx.datastore.preferences.PreferencesProto$Value;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/ChallengeResultStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/ChallengeResultStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeResultStatsJsonAdapter extends AbstractC4949k<ChallengeResultStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16940a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f16941b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f16942c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<ChallengeResultStats> f16943d;

    public ChallengeResultStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16940a = JsonReader.C4932a.m10513a("code", "title", "progress", "actual", "target", "is_managed", "is_timed", "is_displayed");
        EmptySet emptySet = EmptySet.f38034a;
        this.f16941b = c4955q.m10565c(String.class, emptySet, "code");
        this.f16942c = c4955q.m10565c(Boolean.TYPE, emptySet, "isManaged");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ChallengeResultStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a2 = boolMo9385a;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        Boolean boolMo9385a3 = boolMo9385a2;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f16940a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f16941b.mo9385a(jsonReader);
                    break;
                case 1:
                    strMo9385a2 = this.f16941b.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a3 = this.f16941b.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a4 = this.f16941b.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a5 = this.f16941b.mo9385a(jsonReader);
                    break;
                case 5:
                    boolMo9385a = this.f16942c.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isManaged", "is_managed", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolMo9385a3 = this.f16942c.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isTimed", "is_timed", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    boolMo9385a2 = this.f16942c.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isDisplayed", "is_displayed", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -225) {
            return new ChallengeResultStats(strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, boolMo9385a.booleanValue(), boolMo9385a3.booleanValue(), boolMo9385a2.booleanValue());
        }
        Constructor<ChallengeResultStats> declaredConstructor = this.f16943d;
        if (declaredConstructor == null) {
            Class cls = Boolean.TYPE;
            declaredConstructor = ChallengeResultStats.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, cls, cls, cls, Integer.TYPE, C9756b.f49813c);
            this.f16943d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ChallengeResultStats::cl…his.constructorRef = it }");
        }
        ChallengeResultStats challengeResultStatsNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, boolMo9385a, boolMo9385a3, boolMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(challengeResultStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return challengeResultStatsNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ChallengeResultStats challengeResultStats) throws IOException {
        ChallengeResultStats challengeResultStats2 = challengeResultStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (challengeResultStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("code");
        String str = challengeResultStats2.f16932a;
        AbstractC4949k<String> abstractC4949k = this.f16941b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, challengeResultStats2.f16933b);
        abstractC9310n.mo10551C("progress");
        abstractC4949k.mo9386f(abstractC9310n, challengeResultStats2.f16934c);
        abstractC9310n.mo10551C("actual");
        abstractC4949k.mo9386f(abstractC9310n, challengeResultStats2.f16935d);
        abstractC9310n.mo10551C("target");
        abstractC4949k.mo9386f(abstractC9310n, challengeResultStats2.f16936e);
        abstractC9310n.mo10551C("is_managed");
        Boolean boolValueOf = Boolean.valueOf(challengeResultStats2.f16937f);
        AbstractC4949k<Boolean> abstractC4949k2 = this.f16942c;
        abstractC4949k2.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("is_timed");
        C0141b.m623s(challengeResultStats2.f16938g, abstractC4949k2, abstractC9310n, "is_displayed");
        abstractC4949k2.mo9386f(abstractC9310n, Boolean.valueOf(challengeResultStats2.f16939h));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ChallengeResultStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
