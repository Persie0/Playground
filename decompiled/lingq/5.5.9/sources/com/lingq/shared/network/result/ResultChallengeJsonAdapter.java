package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.ChallengeJoinedStats;
import com.lingq.entity.SocialSettings;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultChallengeJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultChallenge;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultChallengeJsonAdapter extends AbstractC4949k<ResultChallenge> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18364a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18365b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18366c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f18367d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<SocialSettings> f18368e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<ChallengeJoinedStats> f18369f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<ResultChallenge> f18370g;

    public ResultChallengeJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18364a = JsonReader.C4932a.m10513a("pk", "code", "title", "challenge_type", "description", "prize", "start_date", "end_date", "language", "time_left", "is_permanent", "participants_count", "is_disabled", "is_active", "badge", "badge_url", "duration", "context_participants", "screen_title", "social_settings", "is_completed", "challenger");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18365b = c4955q.m10565c(cls, emptySet, "pk");
        this.f18366c = c4955q.m10565c(String.class, emptySet, "code");
        this.f18367d = c4955q.m10565c(Boolean.TYPE, emptySet, "isPermanent");
        this.f18368e = c4955q.m10565c(SocialSettings.class, emptySet, "socialSettings");
        this.f18369f = c4955q.m10565c(ChallengeJoinedStats.class, emptySet, "challenger");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultChallenge mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer numMo9385a2 = numMo9385a;
        Boolean boolMo9385a = bool;
        Boolean boolMo9385a2 = boolMo9385a;
        Boolean boolMo9385a3 = boolMo9385a2;
        Boolean boolMo9385a4 = boolMo9385a3;
        int i11 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        String strMo9385a9 = null;
        String strMo9385a10 = null;
        String strMo9385a11 = null;
        String strMo9385a12 = null;
        SocialSettings socialSettingsMo9385a = null;
        ChallengeJoinedStats challengeJoinedStatsMo9385a = null;
        Integer numMo9385a3 = numMo9385a2;
        Integer numMo9385a4 = numMo9385a3;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18364a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    continue;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f18365b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i11 &= -2;
                    continue;
                    break;
                case 1:
                    strMo9385a = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 2:
                    strMo9385a2 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 3:
                    strMo9385a3 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 4:
                    strMo9385a4 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 5:
                    strMo9385a5 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a6 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a7 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 8:
                    strMo9385a8 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 9:
                    strMo9385a9 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 10:
                    boolMo9385a = this.f18367d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isPermanent", "is_permanent", jsonReader);
                    }
                    i11 &= -1025;
                    continue;
                    break;
                case 11:
                    numMo9385a3 = this.f18365b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("participantsCount", "participants_count", jsonReader);
                    }
                    i11 &= -2049;
                    continue;
                    break;
                case 12:
                    boolMo9385a2 = this.f18367d.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isDisabled", "is_disabled", jsonReader);
                    }
                    i11 &= -4097;
                    continue;
                    break;
                case 13:
                    boolMo9385a3 = this.f18367d.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isActive", "is_active", jsonReader);
                    }
                    i11 &= -8193;
                    continue;
                    break;
                case 14:
                    strMo9385a10 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 15:
                    strMo9385a11 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 16:
                    numMo9385a4 = this.f18365b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("duration", "duration", jsonReader);
                    }
                    i10 = -65537;
                    break;
                    break;
                case 17:
                    numMo9385a2 = this.f18365b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("contextParticipants", "context_participants", jsonReader);
                    }
                    i10 = -131073;
                    break;
                    break;
                case 18:
                    strMo9385a12 = this.f18366c.mo9385a(jsonReader);
                    continue;
                case 19:
                    socialSettingsMo9385a = this.f18368e.mo9385a(jsonReader);
                    continue;
                case 20:
                    boolMo9385a4 = this.f18367d.mo9385a(jsonReader);
                    if (boolMo9385a4 == null) {
                        throw C9756b.m18254m("isCompleted", "is_completed", jsonReader);
                    }
                    i10 = -1048577;
                    break;
                    break;
                case 21:
                    challengeJoinedStatsMo9385a = this.f18369f.mo9385a(jsonReader);
                    continue;
                default:
                    continue;
            }
            i11 &= i10;
        }
        jsonReader.mo10508q();
        if (i11 == -1260546) {
            return new ResultChallenge(numMo9385a.intValue(), strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, strMo9385a7, strMo9385a8, strMo9385a9, boolMo9385a.booleanValue(), numMo9385a3.intValue(), boolMo9385a2.booleanValue(), boolMo9385a3.booleanValue(), strMo9385a10, strMo9385a11, numMo9385a4.intValue(), numMo9385a2.intValue(), strMo9385a12, socialSettingsMo9385a, boolMo9385a4.booleanValue(), challengeJoinedStatsMo9385a);
        }
        Constructor<ResultChallenge> declaredConstructor = this.f18370g;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = ResultChallenge.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls2, cls, cls2, cls2, String.class, String.class, cls, cls, String.class, SocialSettings.class, cls2, ChallengeJoinedStats.class, cls, C9756b.f49813c);
            this.f18370g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultChallenge::class.j…his.constructorRef = it }");
        }
        ResultChallenge resultChallengeNewInstance = declaredConstructor.newInstance(numMo9385a, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, strMo9385a7, strMo9385a8, strMo9385a9, boolMo9385a, numMo9385a3, boolMo9385a2, boolMo9385a3, strMo9385a10, strMo9385a11, numMo9385a4, numMo9385a2, strMo9385a12, socialSettingsMo9385a, boolMo9385a4, challengeJoinedStatsMo9385a, Integer.valueOf(i11), null);
        C5207g.m11110e(resultChallengeNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultChallengeNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultChallenge resultChallenge) throws IOException {
        ResultChallenge resultChallenge2 = resultChallenge;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultChallenge2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(resultChallenge2.f18311a);
        AbstractC4949k<Integer> abstractC4949k = this.f18365b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("code");
        String str = resultChallenge2.f18312b;
        AbstractC4949k<String> abstractC4949k2 = this.f18366c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("title");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18313c);
        abstractC9310n.mo10551C("challenge_type");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18314d);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18315e);
        abstractC9310n.mo10551C("prize");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18316f);
        abstractC9310n.mo10551C("start_date");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18317g);
        abstractC9310n.mo10551C("end_date");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18318h);
        abstractC9310n.mo10551C("language");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18319i);
        abstractC9310n.mo10551C("time_left");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18320j);
        abstractC9310n.mo10551C("is_permanent");
        Boolean boolValueOf = Boolean.valueOf(resultChallenge2.f18321k);
        AbstractC4949k<Boolean> abstractC4949k3 = this.f18367d;
        abstractC4949k3.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("participants_count");
        C0166e.m775v(resultChallenge2.f18322l, abstractC4949k, abstractC9310n, "is_disabled");
        C0141b.m623s(resultChallenge2.f18323m, abstractC4949k3, abstractC9310n, "is_active");
        C0141b.m623s(resultChallenge2.f18324n, abstractC4949k3, abstractC9310n, "badge");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18325o);
        abstractC9310n.mo10551C("badge_url");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18326p);
        abstractC9310n.mo10551C("duration");
        C0166e.m775v(resultChallenge2.f18327q, abstractC4949k, abstractC9310n, "context_participants");
        C0166e.m775v(resultChallenge2.f18328r, abstractC4949k, abstractC9310n, "screen_title");
        abstractC4949k2.mo9386f(abstractC9310n, resultChallenge2.f18329s);
        abstractC9310n.mo10551C("social_settings");
        this.f18368e.mo9386f(abstractC9310n, resultChallenge2.f18330t);
        abstractC9310n.mo10551C("is_completed");
        C0141b.m623s(resultChallenge2.f18331u, abstractC4949k3, abstractC9310n, "challenger");
        this.f18369f.mo9386f(abstractC9310n, resultChallenge2.f18332v);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(37, "GeneratedJsonAdapter(ResultChallenge)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
