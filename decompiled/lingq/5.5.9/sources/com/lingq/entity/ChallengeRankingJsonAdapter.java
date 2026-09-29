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
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/ChallengeRankingJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/ChallengeRanking;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeRankingJsonAdapter extends AbstractC4949k<ChallengeRanking> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f16926a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f16927b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f16928c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<ChallengeProfile> f16929d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Boolean> f16930e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<ChallengeRanking> f16931f;

    public ChallengeRankingJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f16926a = JsonReader.C4932a.m10513a("challengeCode", "metric", "rank", "language", "profile", "score", "scoreBehindLeader", "isCompleted");
        EmptySet emptySet = EmptySet.f38034a;
        this.f16927b = c4955q.m10565c(String.class, emptySet, "challengeCode");
        this.f16928c = c4955q.m10565c(Integer.TYPE, emptySet, "rank");
        this.f16929d = c4955q.m10565c(ChallengeProfile.class, emptySet, "profile");
        this.f16930e = c4955q.m10565c(Boolean.TYPE, emptySet, "isCompleted");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ChallengeRanking mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        ChallengeProfile challengeProfileMo9385a = null;
        Boolean bool2 = bool;
        Integer num2 = num;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f16926a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f16927b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("challengeCode", "challengeCode", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f16927b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("metric", "metric", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    numMo9385a = this.f16928c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("rank", "rank", jsonReader);
                    }
                    break;
                    break;
                case 3:
                    strMo9385a3 = this.f16927b.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    break;
                    break;
                case 4:
                    challengeProfileMo9385a = this.f16929d.mo9385a(jsonReader);
                    break;
                case 5:
                    Integer numMo9385a2 = this.f16928c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("score", "score", jsonReader);
                    }
                    i10 &= -33;
                    num = numMo9385a2;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    Integer numMo9385a3 = this.f16928c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("scoreBehindLeader", "scoreBehindLeader", jsonReader);
                    }
                    i10 &= -65;
                    num2 = numMo9385a3;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    Boolean boolMo9385a = this.f16930e.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isCompleted", "isCompleted", jsonReader);
                    }
                    bool2 = boolMo9385a;
                    i10 &= -129;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -225) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("challengeCode", "challengeCode", jsonReader);
            }
            if (strMo9385a2 == null) {
                throw C9756b.m18248g("metric", "metric", jsonReader);
            }
            if (numMo9385a == null) {
                throw C9756b.m18248g("rank", "rank", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            if (strMo9385a3 != null) {
                return new ChallengeRanking(strMo9385a, strMo9385a2, iIntValue, strMo9385a3, challengeProfileMo9385a, num.intValue(), num2.intValue(), bool2.booleanValue());
            }
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        Constructor<ChallengeRanking> declaredConstructor = this.f16931f;
        int i11 = 10;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ChallengeRanking.class.getDeclaredConstructor(String.class, String.class, cls, String.class, ChallengeProfile.class, cls, cls, Boolean.TYPE, cls, C9756b.f49813c);
            this.f16931f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ChallengeRanking::class.…his.constructorRef = it }");
            i11 = 10;
        }
        Object[] objArr = new Object[i11];
        if (strMo9385a == null) {
            throw C9756b.m18248g("challengeCode", "challengeCode", jsonReader);
        }
        objArr[0] = strMo9385a;
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("metric", "metric", jsonReader);
        }
        objArr[1] = strMo9385a2;
        if (numMo9385a == null) {
            throw C9756b.m18248g("rank", "rank", jsonReader);
        }
        objArr[2] = Integer.valueOf(numMo9385a.intValue());
        if (strMo9385a3 == null) {
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        objArr[3] = strMo9385a3;
        objArr[4] = challengeProfileMo9385a;
        objArr[5] = num;
        objArr[6] = num2;
        objArr[7] = bool2;
        objArr[8] = Integer.valueOf(i10);
        objArr[9] = null;
        ChallengeRanking challengeRankingNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(challengeRankingNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return challengeRankingNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ChallengeRanking challengeRanking) throws IOException {
        ChallengeRanking challengeRanking2 = challengeRanking;
        C5207g.m11111f(abstractC9310n, "writer");
        if (challengeRanking2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("challengeCode");
        String str = challengeRanking2.f16918a;
        AbstractC4949k<String> abstractC4949k = this.f16927b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("metric");
        abstractC4949k.mo9386f(abstractC9310n, challengeRanking2.f16919b);
        abstractC9310n.mo10551C("rank");
        Integer numValueOf = Integer.valueOf(challengeRanking2.f16920c);
        AbstractC4949k<Integer> abstractC4949k2 = this.f16928c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("language");
        abstractC4949k.mo9386f(abstractC9310n, challengeRanking2.f16921d);
        abstractC9310n.mo10551C("profile");
        this.f16929d.mo9386f(abstractC9310n, challengeRanking2.f16922e);
        abstractC9310n.mo10551C("score");
        C0166e.m775v(challengeRanking2.f16923f, abstractC4949k2, abstractC9310n, "scoreBehindLeader");
        C0166e.m775v(challengeRanking2.f16924g, abstractC4949k2, abstractC9310n, "isCompleted");
        this.f16930e.mo9386f(abstractC9310n, Boolean.valueOf(challengeRanking2.f16925h));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(ChallengeRanking)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
