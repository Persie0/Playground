package com.lingq.shared.uimodel.language;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageStudyStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserLanguageStudyStatsJsonAdapter extends AbstractC4949k<UserLanguageStudyStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21793a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21794b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f21795c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<List<UserStudyStatsScore>> f21796d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<UserLanguageStudyStats> f21797e;

    public UserLanguageStudyStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21793a = JsonReader.C4932a.m10513a("language", "dailyGoal", "streakDays", "coins", "knownWords", "dailyScores", "activityLevel");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21794b = c4955q.m10565c(String.class, emptySet, "language");
        this.f21795c = c4955q.m10565c(Integer.TYPE, emptySet, "dailyGoal");
        this.f21796d = c4955q.m10565c(C9312p.m17659d(List.class, UserStudyStatsScore.class), emptySet, "dailyScores");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final UserLanguageStudyStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        Integer numMo9385a = numM850i;
        int i10 = -1;
        String strMo9385a = null;
        List<UserStudyStatsScore> listMo9385a = null;
        Integer numMo9385a2 = numMo9385a;
        Integer numMo9385a3 = numMo9385a2;
        Integer numMo9385a4 = numMo9385a3;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f21793a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f21794b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    numM850i = this.f21795c.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("dailyGoal", "dailyGoal", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    numMo9385a2 = this.f21795c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("streakDays", "streakDays", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    numMo9385a3 = this.f21795c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("coins", "coins", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    numMo9385a4 = this.f21795c.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("knownWords", "knownWords", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    listMo9385a = this.f21796d.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("dailyScores", "dailyScores", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a = this.f21795c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("activityLevel", "activityLevel", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -128) {
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            int iIntValue = numM850i.intValue();
            int iIntValue2 = numMo9385a2.intValue();
            int iIntValue3 = numMo9385a3.intValue();
            int iIntValue4 = numMo9385a4.intValue();
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.uimodel.language.UserStudyStatsScore>");
            return new UserLanguageStudyStats(strMo9385a, iIntValue, iIntValue2, iIntValue3, iIntValue4, listMo9385a, numMo9385a.intValue());
        }
        Constructor<UserLanguageStudyStats> declaredConstructor = this.f21797e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = UserLanguageStudyStats.class.getDeclaredConstructor(String.class, cls, cls, cls, cls, List.class, cls, cls, C9756b.f49813c);
            this.f21797e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "UserLanguageStudyStats::…his.constructorRef = it }");
        }
        UserLanguageStudyStats userLanguageStudyStatsNewInstance = declaredConstructor.newInstance(strMo9385a, numM850i, numMo9385a2, numMo9385a3, numMo9385a4, listMo9385a, numMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(userLanguageStudyStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return userLanguageStudyStatsNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, UserLanguageStudyStats userLanguageStudyStats) throws IOException {
        UserLanguageStudyStats userLanguageStudyStats2 = userLanguageStudyStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (userLanguageStudyStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("language");
        this.f21794b.mo9386f(abstractC9310n, userLanguageStudyStats2.f21786a);
        abstractC9310n.mo10551C("dailyGoal");
        Integer numValueOf = Integer.valueOf(userLanguageStudyStats2.f21787b);
        AbstractC4949k<Integer> abstractC4949k = this.f21795c;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("streakDays");
        C0166e.m775v(userLanguageStudyStats2.f21788c, abstractC4949k, abstractC9310n, "coins");
        C0166e.m775v(userLanguageStudyStats2.f21789d, abstractC4949k, abstractC9310n, "knownWords");
        C0166e.m775v(userLanguageStudyStats2.f21790e, abstractC4949k, abstractC9310n, "dailyScores");
        this.f21796d.mo9386f(abstractC9310n, userLanguageStudyStats2.f21791f);
        abstractC9310n.mo10551C("activityLevel");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(userLanguageStudyStats2.f21792g));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(44, "GeneratedJsonAdapter(UserLanguageStudyStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
