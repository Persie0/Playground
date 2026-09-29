package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.ActivityLevel;
import com.lingq.entity.StudyStatsScores;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultStudyStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultStudyStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultStudyStatsJsonAdapter extends AbstractC4949k<ResultStudyStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18981a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f18982b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f18983c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f18984d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<StudyStatsScores>> f18985e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<ActivityLevel> f18986f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<ResultStudyStats> f18987g;

    public ResultStudyStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18981a = JsonReader.C4932a.m10513a("activityApple", "notificationsCount", "dailyGoal", "streakDays", "coins", "knownWords", "isAvatarUpgraded", "dailyScores", "activityLevel");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18982b = c4955q.m10565c(String.class, emptySet, "activityApple");
        this.f18983c = c4955q.m10565c(Integer.TYPE, emptySet, "notificationsCount");
        this.f18984d = c4955q.m10565c(Boolean.TYPE, emptySet, "isAvatarUpgraded");
        this.f18985e = c4955q.m10565c(C9312p.m17659d(List.class, StudyStatsScores.class), emptySet, "dailyScores");
        this.f18986f = c4955q.m10565c(ActivityLevel.class, emptySet, "activityLevel");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultStudyStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        Boolean boolMo9385a = bool;
        int i10 = -1;
        String strMo9385a = null;
        List<StudyStatsScores> listMo9385a = null;
        ActivityLevel activityLevelMo9385a = null;
        Integer numMo9385a4 = numMo9385a3;
        Integer numMo9385a5 = numMo9385a4;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18981a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f18982b.mo9385a(jsonReader);
                    i10 &= -2;
                    break;
                case 1:
                    numMo9385a = this.f18983c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("notificationsCount", "notificationsCount", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    numMo9385a4 = this.f18983c.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("dailyGoal", "dailyGoal", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    numMo9385a5 = this.f18983c.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("streakDays", "streakDays", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    numMo9385a2 = this.f18983c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("coins", "coins", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    numMo9385a3 = this.f18983c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("knownWords", "knownWords", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolMo9385a = this.f18984d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isAvatarUpgraded", "isAvatarUpgraded", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    listMo9385a = this.f18985e.mo9385a(jsonReader);
                    i10 &= -129;
                    break;
                case 8:
                    activityLevelMo9385a = this.f18986f.mo9385a(jsonReader);
                    i10 &= -257;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -512) {
            return new ResultStudyStats(strMo9385a, numMo9385a.intValue(), numMo9385a4.intValue(), numMo9385a5.intValue(), numMo9385a2.intValue(), numMo9385a3.intValue(), boolMo9385a.booleanValue(), listMo9385a, activityLevelMo9385a);
        }
        Constructor<ResultStudyStats> declaredConstructor = this.f18987g;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultStudyStats.class.getDeclaredConstructor(String.class, cls, cls, cls, cls, cls, Boolean.TYPE, List.class, ActivityLevel.class, cls, C9756b.f49813c);
            this.f18987g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultStudyStats::class.…his.constructorRef = it }");
        }
        ResultStudyStats resultStudyStatsNewInstance = declaredConstructor.newInstance(strMo9385a, numMo9385a, numMo9385a4, numMo9385a5, numMo9385a2, numMo9385a3, boolMo9385a, listMo9385a, activityLevelMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(resultStudyStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultStudyStatsNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultStudyStats resultStudyStats) throws IOException {
        ResultStudyStats resultStudyStats2 = resultStudyStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultStudyStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("activityApple");
        this.f18982b.mo9386f(abstractC9310n, resultStudyStats2.f18972a);
        abstractC9310n.mo10551C("notificationsCount");
        Integer numValueOf = Integer.valueOf(resultStudyStats2.f18973b);
        AbstractC4949k<Integer> abstractC4949k = this.f18983c;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("dailyGoal");
        C0166e.m775v(resultStudyStats2.f18974c, abstractC4949k, abstractC9310n, "streakDays");
        C0166e.m775v(resultStudyStats2.f18975d, abstractC4949k, abstractC9310n, "coins");
        C0166e.m775v(resultStudyStats2.f18976e, abstractC4949k, abstractC9310n, "knownWords");
        C0166e.m775v(resultStudyStats2.f18977f, abstractC4949k, abstractC9310n, "isAvatarUpgraded");
        this.f18984d.mo9386f(abstractC9310n, Boolean.valueOf(resultStudyStats2.f18978g));
        abstractC9310n.mo10551C("dailyScores");
        this.f18985e.mo9386f(abstractC9310n, resultStudyStats2.f18979h);
        abstractC9310n.mo10551C("activityLevel");
        this.f18986f.mo9386f(abstractC9310n, resultStudyStats2.f18980i);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(38, "GeneratedJsonAdapter(ResultStudyStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
