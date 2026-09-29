package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.ChallengeProfile;
import com.lingq.entity.ChallengeResultStats;
import com.lingq.entity.Language;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultChallengeJoinedStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultChallengeJoinedStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultChallengeJoinedStatsJsonAdapter extends AbstractC4949k<ResultChallengeJoinedStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18356a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18357b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18358c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<ChallengeProfile> f18359d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Language> f18360e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f18361f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<ChallengeResultStats>> f18362g;

    /* JADX INFO: renamed from: h */
    public volatile Constructor<ResultChallengeJoinedStats> f18363h;

    public ResultChallengeJoinedStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18356a = JsonReader.C4932a.m10513a("pk", "status", "start_date", "end_date", "signup_datetime", "rank", "profile", "language", "activity_index", "is_completed", "membership_ptr_id", "known_words", "lingqs", "streakDays", "context", "stats");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18357b = c4955q.m10565c(cls, emptySet, "pk");
        this.f18358c = c4955q.m10565c(String.class, emptySet, "status");
        this.f18359d = c4955q.m10565c(ChallengeProfile.class, emptySet, "profile");
        this.f18360e = c4955q.m10565c(Language.class, emptySet, "language");
        this.f18361f = c4955q.m10565c(Boolean.TYPE, emptySet, "isCompleted");
        this.f18362g = c4955q.m10565c(C9312p.m17659d(List.class, ChallengeResultStats.class), emptySet, "stats");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultChallengeJoinedStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        Integer numMo9385a4 = numMo9385a3;
        Integer numMo9385a5 = numMo9385a4;
        Integer numMo9385a6 = numMo9385a5;
        Boolean boolMo9385a = bool;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        ChallengeProfile challengeProfileMo9385a = null;
        Language languageMo9385a = null;
        List<ChallengeResultStats> listMo9385a = null;
        Integer numMo9385a7 = numMo9385a6;
        Integer numMo9385a8 = numMo9385a7;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18356a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f18357b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f18358c.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a2 = this.f18358c.mo9385a(jsonReader);
                    break;
                case 3:
                    strMo9385a3 = this.f18358c.mo9385a(jsonReader);
                    break;
                case 4:
                    strMo9385a4 = this.f18358c.mo9385a(jsonReader);
                    break;
                case 5:
                    numMo9385a7 = this.f18357b.mo9385a(jsonReader);
                    if (numMo9385a7 == null) {
                        throw C9756b.m18254m("rank", "rank", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    challengeProfileMo9385a = this.f18359d.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    languageMo9385a = this.f18360e.mo9385a(jsonReader);
                    break;
                case 8:
                    numMo9385a8 = this.f18357b.mo9385a(jsonReader);
                    if (numMo9385a8 == null) {
                        throw C9756b.m18254m("activityIndex", "activity_index", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    boolMo9385a = this.f18361f.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isCompleted", "is_completed", jsonReader);
                    }
                    i10 &= -513;
                    break;
                    break;
                case 10:
                    numMo9385a2 = this.f18357b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("membershipPtrId", "membership_ptr_id", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
                case 11:
                    numMo9385a3 = this.f18357b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("knownWords", "known_words", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
                case 12:
                    numMo9385a4 = this.f18357b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("lingqs", "lingqs", jsonReader);
                    }
                    i10 &= -4097;
                    break;
                    break;
                case 13:
                    numMo9385a5 = this.f18357b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("streakDays", "streakDays", jsonReader);
                    }
                    i10 &= -8193;
                    break;
                    break;
                case 14:
                    numMo9385a6 = this.f18357b.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("context", "context", jsonReader);
                    }
                    i10 &= -16385;
                    break;
                    break;
                case 15:
                    listMo9385a = this.f18362g.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -32546) {
            return new ResultChallengeJoinedStats(numMo9385a.intValue(), strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, numMo9385a7.intValue(), challengeProfileMo9385a, languageMo9385a, numMo9385a8.intValue(), boolMo9385a.booleanValue(), numMo9385a2.intValue(), numMo9385a3.intValue(), numMo9385a4.intValue(), numMo9385a5.intValue(), numMo9385a6.intValue(), listMo9385a);
        }
        Constructor<ResultChallengeJoinedStats> declaredConstructor = this.f18363h;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultChallengeJoinedStats.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, cls, ChallengeProfile.class, Language.class, cls, Boolean.TYPE, cls, cls, cls, cls, cls, List.class, cls, C9756b.f49813c);
            this.f18363h = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultChallengeJoinedSta…his.constructorRef = it }");
        }
        ResultChallengeJoinedStats resultChallengeJoinedStatsNewInstance = declaredConstructor.newInstance(numMo9385a, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, numMo9385a7, challengeProfileMo9385a, languageMo9385a, numMo9385a8, boolMo9385a, numMo9385a2, numMo9385a3, numMo9385a4, numMo9385a5, numMo9385a6, listMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(resultChallengeJoinedStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultChallengeJoinedStatsNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultChallengeJoinedStats resultChallengeJoinedStats) throws IOException {
        ResultChallengeJoinedStats resultChallengeJoinedStats2 = resultChallengeJoinedStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultChallengeJoinedStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(resultChallengeJoinedStats2.f18340a);
        AbstractC4949k<Integer> abstractC4949k = this.f18357b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("status");
        String str = resultChallengeJoinedStats2.f18341b;
        AbstractC4949k<String> abstractC4949k2 = this.f18358c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("start_date");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallengeJoinedStats2.f18342c);
        abstractC9310n.mo10551C("end_date");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallengeJoinedStats2.f18343d);
        abstractC9310n.mo10551C("signup_datetime");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallengeJoinedStats2.f18344e);
        abstractC9310n.mo10551C("rank");
        C0166e.m775v(resultChallengeJoinedStats2.f18345f, abstractC4949k, abstractC9310n, "profile");
        this.f18359d.mo9386f(abstractC9310n, resultChallengeJoinedStats2.f18346g);
        abstractC9310n.mo10551C("language");
        this.f18360e.mo9386f(abstractC9310n, resultChallengeJoinedStats2.f18347h);
        abstractC9310n.mo10551C("activity_index");
        C0166e.m775v(resultChallengeJoinedStats2.f18348i, abstractC4949k, abstractC9310n, "is_completed");
        this.f18361f.mo9386f(abstractC9310n, Boolean.valueOf(resultChallengeJoinedStats2.f18349j));
        abstractC9310n.mo10551C("membership_ptr_id");
        C0166e.m775v(resultChallengeJoinedStats2.f18350k, abstractC4949k, abstractC9310n, "known_words");
        C0166e.m775v(resultChallengeJoinedStats2.f18351l, abstractC4949k, abstractC9310n, "lingqs");
        C0166e.m775v(resultChallengeJoinedStats2.f18352m, abstractC4949k, abstractC9310n, "streakDays");
        C0166e.m775v(resultChallengeJoinedStats2.f18353n, abstractC4949k, abstractC9310n, "context");
        C0166e.m775v(resultChallengeJoinedStats2.f18354o, abstractC4949k, abstractC9310n, "stats");
        this.f18362g.mo9386f(abstractC9310n, resultChallengeJoinedStats2.f18355p);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(48, "GeneratedJsonAdapter(ResultChallengeJoinedStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
