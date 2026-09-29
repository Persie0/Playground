package com.lingq.shared.uimodel.challenge;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeUserRankingJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/challenge/ChallengeUserRanking;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ChallengeUserRankingJsonAdapter extends AbstractC4949k<ChallengeUserRanking> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21677a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f21678b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<ChallengeUserProfile> f21679c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor<ChallengeUserRanking> f21680d;

    public ChallengeUserRankingJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21677a = JsonReader.C4932a.m10513a("rank", "score", "scoreBehindLeader", "profile");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f21678b = c4955q.m10565c(cls, emptySet, "rank");
        this.f21679c = c4955q.m10565c(ChallengeUserProfile.class, emptySet, "profile");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ChallengeUserRanking mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        Integer numMo9385a = numM850i;
        Integer numMo9385a2 = numMo9385a;
        ChallengeUserProfile challengeUserProfileMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f21677a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numM850i = this.f21678b.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("rank", "rank", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                numMo9385a = this.f21678b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("score", "score", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                numMo9385a2 = this.f21678b.mo9385a(jsonReader);
                if (numMo9385a2 == null) {
                    throw C9756b.m18254m("scoreBehindLeader", "scoreBehindLeader", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                challengeUserProfileMo9385a = this.f21679c.mo9385a(jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (i10 == -8) {
            return new ChallengeUserRanking(numM850i.intValue(), numMo9385a.intValue(), numMo9385a2.intValue(), challengeUserProfileMo9385a);
        }
        Constructor<ChallengeUserRanking> declaredConstructor = this.f21680d;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ChallengeUserRanking.class.getDeclaredConstructor(cls, cls, cls, ChallengeUserProfile.class, cls, C9756b.f49813c);
            this.f21680d = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ChallengeUserRanking::cl…his.constructorRef = it }");
        }
        ChallengeUserRanking challengeUserRankingNewInstance = declaredConstructor.newInstance(numM850i, numMo9385a, numMo9385a2, challengeUserProfileMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(challengeUserRankingNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return challengeUserRankingNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ChallengeUserRanking challengeUserRanking) throws IOException {
        ChallengeUserRanking challengeUserRanking2 = challengeUserRanking;
        C5207g.m11111f(abstractC9310n, "writer");
        if (challengeUserRanking2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("rank");
        Integer numValueOf = Integer.valueOf(challengeUserRanking2.f21673a);
        AbstractC4949k<Integer> abstractC4949k = this.f21678b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("score");
        C0166e.m775v(challengeUserRanking2.f21674b, abstractC4949k, abstractC9310n, "scoreBehindLeader");
        C0166e.m775v(challengeUserRanking2.f21675c, abstractC4949k, abstractC9310n, "profile");
        this.f21679c.mo9386f(abstractC9310n, challengeUserRanking2.f21676d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ChallengeUserRanking)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
