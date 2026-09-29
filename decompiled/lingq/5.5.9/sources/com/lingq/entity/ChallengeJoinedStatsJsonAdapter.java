package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/ChallengeJoinedStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/ChallengeJoinedStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeJoinedStatsJsonAdapter extends AbstractC4949k<ChallengeJoinedStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16897a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f16898b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f16899c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<ChallengeProfile> f16900d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Language> f16901e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f16902f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<ChallengeResultStats>> f16903g;

    /* JADX INFO: renamed from: h */
    public volatile Constructor<ChallengeJoinedStats> f16904h;

    public ChallengeJoinedStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16897a = JsonReader.C4932a.m10513a("pk", "status", "start_date", "end_date", "signup_datetime", "rank", "profile", "language", "activity_index", "is_completed", "membership_ptr_id", "lingqs", "context", "stats");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f16898b = c4955q.m10565c(cls, emptySet, "pk");
        this.f16899c = c4955q.m10565c(String.class, emptySet, "status");
        this.f16900d = c4955q.m10565c(ChallengeProfile.class, emptySet, "profile");
        this.f16901e = c4955q.m10565c(Language.class, emptySet, "language");
        this.f16902f = c4955q.m10565c(Boolean.TYPE, emptySet, "isCompleted");
        this.f16903g = c4955q.m10565c(C9312p.m17659d(List.class, ChallengeResultStats.class), emptySet, "stats");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ChallengeJoinedStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        Integer numMo9385a4 = numMo9385a3;
        Boolean boolMo9385a = bool;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        ChallengeProfile challengeProfileMo9385a = null;
        Language languageMo9385a = null;
        List<ChallengeResultStats> listMo9385a = null;
        Integer numMo9385a5 = numMo9385a4;
        Integer numMo9385a6 = numMo9385a5;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f16897a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f16898b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f16899c.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a2 = this.f16899c.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a3 = this.f16899c.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a4 = this.f16899c.mo9385a(jsonReader);
                    break;
                case 5:
                    numMo9385a5 = this.f16898b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("rank", "rank", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    challengeProfileMo9385a = this.f16900d.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    languageMo9385a = this.f16901e.mo9385a(jsonReader);
                    break;
                case 8:
                    numMo9385a6 = this.f16898b.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("activityIndex", "activity_index", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    boolMo9385a = this.f16902f.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isCompleted", "is_completed", jsonReader);
                    }
                    i10 &= -513;
                    break;
                    break;
                case 10:
                    numMo9385a2 = this.f16898b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("membershipPtrId", "membership_ptr_id", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
                case 11:
                    numMo9385a3 = this.f16898b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("lingqs", "lingqs", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
                case 12:
                    numMo9385a4 = this.f16898b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("context", "context", jsonReader);
                    }
                    i10 &= -4097;
                    break;
                    break;
                case 13:
                    listMo9385a = this.f16903g.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -7970) {
            return new ChallengeJoinedStats(numMo9385a.intValue(), strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, numMo9385a5.intValue(), challengeProfileMo9385a, languageMo9385a, numMo9385a6.intValue(), boolMo9385a.booleanValue(), numMo9385a2.intValue(), numMo9385a3.intValue(), numMo9385a4.intValue(), listMo9385a);
        }
        Constructor<ChallengeJoinedStats> declaredConstructor = this.f16904h;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ChallengeJoinedStats.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, cls, ChallengeProfile.class, Language.class, cls, Boolean.TYPE, cls, cls, cls, List.class, cls, C9756b.f49813c);
            this.f16904h = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ChallengeJoinedStats::cl…his.constructorRef = it }");
        }
        ChallengeJoinedStats challengeJoinedStatsNewInstance = declaredConstructor.newInstance(numMo9385a, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, numMo9385a5, challengeProfileMo9385a, languageMo9385a, numMo9385a6, boolMo9385a, numMo9385a2, numMo9385a3, numMo9385a4, listMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(challengeJoinedStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return challengeJoinedStatsNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ChallengeJoinedStats challengeJoinedStats) throws IOException {
        ChallengeJoinedStats challengeJoinedStats2 = challengeJoinedStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (challengeJoinedStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(challengeJoinedStats2.f16883a);
        AbstractC4949k<Integer> abstractC4949k = this.f16898b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("status");
        String str = challengeJoinedStats2.f16884b;
        AbstractC4949k<String> abstractC4949k2 = this.f16899c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("start_date");
        abstractC4949k2.mo9386f(abstractC9310n, challengeJoinedStats2.f16885c);
        abstractC9310n.mo10551C("end_date");
        abstractC4949k2.mo9386f(abstractC9310n, challengeJoinedStats2.f16886d);
        abstractC9310n.mo10551C("signup_datetime");
        abstractC4949k2.mo9386f(abstractC9310n, challengeJoinedStats2.f16887e);
        abstractC9310n.mo10551C("rank");
        C0166e.m775v(challengeJoinedStats2.f16888f, abstractC4949k, abstractC9310n, "profile");
        this.f16900d.mo9386f(abstractC9310n, challengeJoinedStats2.f16889g);
        abstractC9310n.mo10551C("language");
        this.f16901e.mo9386f(abstractC9310n, challengeJoinedStats2.f16890h);
        abstractC9310n.mo10551C("activity_index");
        C0166e.m775v(challengeJoinedStats2.f16891i, abstractC4949k, abstractC9310n, "is_completed");
        this.f16902f.mo9386f(abstractC9310n, Boolean.valueOf(challengeJoinedStats2.f16892j));
        abstractC9310n.mo10551C("membership_ptr_id");
        C0166e.m775v(challengeJoinedStats2.f16893k, abstractC4949k, abstractC9310n, "lingqs");
        C0166e.m775v(challengeJoinedStats2.f16894l, abstractC4949k, abstractC9310n, "context");
        C0166e.m775v(challengeJoinedStats2.f16895m, abstractC4949k, abstractC9310n, "stats");
        this.f16903g.mo9386f(abstractC9310n, challengeJoinedStats2.f16896n);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ChallengeJoinedStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
