package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.ChallengeProfile;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultChallengeRankingJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultChallengeRanking;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultChallengeRankingJsonAdapter extends AbstractC4949k<ResultChallengeRanking> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18376a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<ChallengeProfile> f18377b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f18378c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f18379d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ResultChallengeRanking> f18380e;

    public ResultChallengeRankingJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18376a = JsonReader.C4932a.m10513a("profile", "rank", "score", "scoreBehindLeader", "is_completed");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18377b = c4955q.m10565c(ChallengeProfile.class, emptySet, "profile");
        this.f18378c = c4955q.m10565c(Integer.TYPE, emptySet, "rank");
        this.f18379d = c4955q.m10565c(Boolean.TYPE, emptySet, "isCompleted");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultChallengeRanking mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer numMo9385a2 = numMo9385a;
        Boolean boolMo9385a = bool;
        int i10 = -1;
        ChallengeProfile challengeProfileMo9385a = null;
        Integer numMo9385a3 = numMo9385a2;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18376a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                challengeProfileMo9385a = this.f18377b.mo9385a(jsonReader);
            } else if (iMo10512y0 == 1) {
                numMo9385a = this.f18378c.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("rank", "rank", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                numMo9385a3 = this.f18378c.mo9385a(jsonReader);
                if (numMo9385a3 == null) {
                    throw C9756b.m18254m("score", "score", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                numMo9385a2 = this.f18378c.mo9385a(jsonReader);
                if (numMo9385a2 == null) {
                    throw C9756b.m18254m("scoreBehindLeader", "scoreBehindLeader", jsonReader);
                }
                i10 &= -9;
            } else if (iMo10512y0 == 4) {
                boolMo9385a = this.f18379d.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isCompleted", "is_completed", jsonReader);
                }
                i10 &= -17;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -31) {
            return new ResultChallengeRanking(challengeProfileMo9385a, numMo9385a.intValue(), numMo9385a3.intValue(), numMo9385a2.intValue(), boolMo9385a.booleanValue());
        }
        Constructor<ResultChallengeRanking> declaredConstructor = this.f18380e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultChallengeRanking.class.getDeclaredConstructor(ChallengeProfile.class, cls, cls, cls, Boolean.TYPE, cls, C9756b.f49813c);
            this.f18380e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultChallengeRanking::…his.constructorRef = it }");
        }
        ResultChallengeRanking resultChallengeRankingNewInstance = declaredConstructor.newInstance(challengeProfileMo9385a, numMo9385a, numMo9385a3, numMo9385a2, boolMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(resultChallengeRankingNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultChallengeRankingNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultChallengeRanking resultChallengeRanking) throws IOException {
        ResultChallengeRanking resultChallengeRanking2 = resultChallengeRanking;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultChallengeRanking2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("profile");
        this.f18377b.mo9386f(abstractC9310n, resultChallengeRanking2.f18371a);
        abstractC9310n.mo10551C("rank");
        Integer numValueOf = Integer.valueOf(resultChallengeRanking2.f18372b);
        AbstractC4949k<Integer> abstractC4949k = this.f18378c;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("score");
        C0166e.m775v(resultChallengeRanking2.f18373c, abstractC4949k, abstractC9310n, "scoreBehindLeader");
        C0166e.m775v(resultChallengeRanking2.f18374d, abstractC4949k, abstractC9310n, "is_completed");
        this.f18379d.mo9386f(abstractC9310n, Boolean.valueOf(resultChallengeRanking2.f18375e));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(44, "GeneratedJsonAdapter(ResultChallengeRanking)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
