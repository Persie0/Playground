package com.lingq.shared.uimodel.language;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserStudyStatsScoreJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/language/UserStudyStatsScore;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserStudyStatsScoreJsonAdapter extends AbstractC4949k<UserStudyStatsScore> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21802a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21803b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f21804c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<UserActivityLevel> f21805d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<UserStudyStatsScore> f21806e;

    public UserStudyStatsScoreJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21802a = JsonReader.C4932a.m10513a("date", "dayOfWeek", "score", "activityLevel");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21803b = c4955q.m10565c(String.class, emptySet, "date");
        this.f21804c = c4955q.m10565c(Integer.TYPE, emptySet, "score");
        this.f21805d = c4955q.m10565c(UserActivityLevel.class, emptySet, "activityLevel");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final UserStudyStatsScore mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        String strMo9385a2 = null;
        UserActivityLevel userActivityLevelMo9385a = null;
        int i10 = -1;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f21802a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                strMo9385a = this.f21803b.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("date", "date", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a2 = this.f21803b.mo9385a(jsonReader);
                if (strMo9385a2 == null) {
                    throw C9756b.m18254m("dayOfWeek", "dayOfWeek", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                numM850i = this.f21804c.mo9385a(jsonReader);
                if (numM850i == null) {
                    throw C9756b.m18254m("score", "score", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                userActivityLevelMo9385a = this.f21805d.mo9385a(jsonReader);
                i10 &= -9;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -16) {
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            return new UserStudyStatsScore(strMo9385a, strMo9385a2, numM850i.intValue(), userActivityLevelMo9385a);
        }
        Constructor<UserStudyStatsScore> declaredConstructor = this.f21806e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = UserStudyStatsScore.class.getDeclaredConstructor(String.class, String.class, cls, UserActivityLevel.class, cls, C9756b.f49813c);
            this.f21806e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "UserStudyStatsScore::cla…his.constructorRef = it }");
        }
        UserStudyStatsScore userStudyStatsScoreNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, numM850i, userActivityLevelMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(userStudyStatsScoreNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return userStudyStatsScoreNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, UserStudyStatsScore userStudyStatsScore) throws IOException {
        UserStudyStatsScore userStudyStatsScore2 = userStudyStatsScore;
        C5207g.m11111f(abstractC9310n, "writer");
        if (userStudyStatsScore2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("date");
        String str = userStudyStatsScore2.f21798a;
        AbstractC4949k<String> abstractC4949k = this.f21803b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("dayOfWeek");
        abstractC4949k.mo9386f(abstractC9310n, userStudyStatsScore2.f21799b);
        abstractC9310n.mo10551C("score");
        this.f21804c.mo9386f(abstractC9310n, Integer.valueOf(userStudyStatsScore2.f21800c));
        abstractC9310n.mo10551C("activityLevel");
        this.f21805d.mo9386f(abstractC9310n, userStudyStatsScore2.f21801d);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(41, "GeneratedJsonAdapter(UserStudyStatsScore)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
