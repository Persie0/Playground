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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/StudyStatsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/StudyStats;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StudyStatsJsonAdapter extends AbstractC4949k<StudyStats> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17477a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17478b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17479c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f17480d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Boolean> f17481e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<List<StudyStatsScores>> f17482f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<StudyStats> f17483g;

    public StudyStatsJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17477a = JsonReader.C4932a.m10513a("code", "language", "activityApple", "notificationsCount", "dailyGoal", "streakDays", "coins", "knownWords", "isAvatarUpgraded", "dailyScores", "activityLevel");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17478b = c4955q.m10565c(String.class, emptySet, "code");
        this.f17479c = c4955q.m10565c(String.class, emptySet, "language");
        this.f17480d = c4955q.m10565c(Integer.TYPE, emptySet, "notificationsCount");
        this.f17481e = c4955q.m10565c(Boolean.TYPE, emptySet, "isAvatarUpgraded");
        this.f17482f = c4955q.m10565c(C9312p.m17659d(List.class, StudyStatsScores.class), emptySet, "dailyScores");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final StudyStats mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
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
        List<StudyStatsScores> listMo9385a = null;
        Integer numMo9385a5 = numMo9385a4;
        Integer numMo9385a6 = numMo9385a5;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17477a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f17478b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("code", "code", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f17479c.mo9385a(jsonReader);
                    i10 &= -3;
                    break;
                case 2:
                    strMo9385a3 = this.f17479c.mo9385a(jsonReader);
                    i10 &= -5;
                    break;
                case 3:
                    numMo9385a = this.f17480d.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("notificationsCount", "notificationsCount", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    numMo9385a5 = this.f17480d.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("dailyGoal", "dailyGoal", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    numMo9385a6 = this.f17480d.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("streakDays", "streakDays", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a2 = this.f17480d.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("coins", "coins", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a3 = this.f17480d.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("knownWords", "knownWords", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    boolMo9385a = this.f17481e.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isAvatarUpgraded", "isAvatarUpgraded", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    listMo9385a = this.f17482f.mo9385a(jsonReader);
                    i10 &= -513;
                    break;
                case 10:
                    numMo9385a4 = this.f17480d.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("activityLevel", "activityLevel", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -2047) {
            if (strMo9385a != null) {
                return new StudyStats(strMo9385a, strMo9385a2, strMo9385a3, numMo9385a.intValue(), numMo9385a5.intValue(), numMo9385a6.intValue(), numMo9385a2.intValue(), numMo9385a3.intValue(), boolMo9385a.booleanValue(), listMo9385a, numMo9385a4.intValue());
            }
            throw C9756b.m18248g("code", "code", jsonReader);
        }
        Constructor<StudyStats> declaredConstructor = this.f17483g;
        int i11 = 13;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = StudyStats.class.getDeclaredConstructor(String.class, String.class, String.class, cls, cls, cls, cls, cls, Boolean.TYPE, List.class, cls, cls, C9756b.f49813c);
            this.f17483g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "StudyStats::class.java.g…his.constructorRef = it }");
            i11 = 13;
        }
        Object[] objArr = new Object[i11];
        if (strMo9385a == null) {
            throw C9756b.m18248g("code", "code", jsonReader);
        }
        objArr[0] = strMo9385a;
        objArr[1] = strMo9385a2;
        objArr[2] = strMo9385a3;
        objArr[3] = numMo9385a;
        objArr[4] = numMo9385a5;
        objArr[5] = numMo9385a6;
        objArr[6] = numMo9385a2;
        objArr[7] = numMo9385a3;
        objArr[8] = boolMo9385a;
        objArr[9] = listMo9385a;
        objArr[10] = numMo9385a4;
        objArr[11] = Integer.valueOf(i10);
        objArr[12] = null;
        StudyStats studyStatsNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(studyStatsNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return studyStatsNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, StudyStats studyStats) throws IOException {
        StudyStats studyStats2 = studyStats;
        C5207g.m11111f(abstractC9310n, "writer");
        if (studyStats2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("code");
        this.f17478b.mo9386f(abstractC9310n, studyStats2.f17466a);
        abstractC9310n.mo10551C("language");
        String str = studyStats2.f17467b;
        AbstractC4949k<String> abstractC4949k = this.f17479c;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("activityApple");
        abstractC4949k.mo9386f(abstractC9310n, studyStats2.f17468c);
        abstractC9310n.mo10551C("notificationsCount");
        Integer numValueOf = Integer.valueOf(studyStats2.f17469d);
        AbstractC4949k<Integer> abstractC4949k2 = this.f17480d;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("dailyGoal");
        C0166e.m775v(studyStats2.f17470e, abstractC4949k2, abstractC9310n, "streakDays");
        C0166e.m775v(studyStats2.f17471f, abstractC4949k2, abstractC9310n, "coins");
        C0166e.m775v(studyStats2.f17472g, abstractC4949k2, abstractC9310n, "knownWords");
        C0166e.m775v(studyStats2.f17473h, abstractC4949k2, abstractC9310n, "isAvatarUpgraded");
        this.f17481e.mo9386f(abstractC9310n, Boolean.valueOf(studyStats2.f17474i));
        abstractC9310n.mo10551C("dailyScores");
        this.f17482f.mo9386f(abstractC9310n, studyStats2.f17475j);
        abstractC9310n.mo10551C("activityLevel");
        abstractC4949k2.mo9386f(abstractC9310n, Integer.valueOf(studyStats2.f17476k));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(32, "GeneratedJsonAdapter(StudyStats)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
