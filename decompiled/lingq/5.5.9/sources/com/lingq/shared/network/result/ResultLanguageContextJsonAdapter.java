package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Language;
import com.lingq.entity.LanguageContextNotification;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLanguageContextJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLanguageContext;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLanguageContextJsonAdapter extends AbstractC4949k<ResultLanguageContext> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18453a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18454b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18455c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<List<String>> f18456d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<LanguageContextNotification> f18457e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f18458f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Language> f18459g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<List<Boolean>> f18460h;

    /* JADX INFO: renamed from: i */
    public volatile Constructor<ResultLanguageContext> f18461i;

    public ResultLanguageContextJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18453a = JsonReader.C4932a.m10513a("pk", "url", "repetition_lingqs", "lotd_dates", "email_notifications", "site_notifications", "use_feed", "intense", "tags", "language", "streak_days", "feed_levels");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18454b = c4955q.m10565c(cls, emptySet, "pk");
        this.f18455c = c4955q.m10565c(String.class, emptySet, "url");
        this.f18456d = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "lotdDates");
        this.f18457e = c4955q.m10565c(LanguageContextNotification.class, emptySet, "emailNotifications");
        this.f18458f = c4955q.m10565c(Boolean.class, emptySet, "isUseFeed");
        this.f18459g = c4955q.m10565c(Language.class, emptySet, "language");
        this.f18460h = c4955q.m10565c(C9312p.m17659d(List.class, Boolean.class), emptySet, "feedLevels");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLanguageContext mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        Language languageMo9385a = null;
        List<Boolean> listMo9385a = null;
        LanguageContextNotification languageContextNotificationMo9385a = null;
        LanguageContextNotification languageContextNotificationMo9385a2 = null;
        Boolean boolMo9385a = null;
        List<String> list = null;
        String strMo9385a2 = null;
        List<String> list2 = null;
        Integer numMo9385a = null;
        int i10 = -1;
        Integer numMo9385a2 = numM850i;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18453a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numM850i = this.f18454b.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f18455c.mo9385a(jsonReader);
                    break;
                case 2:
                    numMo9385a2 = this.f18454b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("repetitionLingQs", "repetition_lingqs", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    List<String> listMo9385a2 = this.f18456d.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("lotdDates", "lotd_dates", jsonReader);
                    }
                    i10 &= -9;
                    list2 = listMo9385a2;
                    break;
                    break;
                case 4:
                    languageContextNotificationMo9385a = this.f18457e.mo9385a(jsonReader);
                    break;
                case 5:
                    languageContextNotificationMo9385a2 = this.f18457e.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    i10 &= -65;
                    boolMo9385a = this.f18458f.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a = this.f18455c.mo9385a(jsonReader);
                    break;
                case 8:
                    List<String> listMo9385a3 = this.f18456d.mo9385a(jsonReader);
                    if (listMo9385a3 == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i10 &= -257;
                    list = listMo9385a3;
                    break;
                    break;
                case 9:
                    i10 &= -513;
                    languageMo9385a = this.f18459g.mo9385a(jsonReader);
                    break;
                case 10:
                    numMo9385a = this.f18454b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("streakDays", "streak_days", jsonReader);
                    }
                    break;
                    break;
                case 11:
                    i10 &= -2049;
                    listMo9385a = this.f18460h.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -2894) {
            int iIntValue = numM850i.intValue();
            int iIntValue2 = numMo9385a2.intValue();
            C5207g.m11109d(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            C5207g.m11109d(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            if (numMo9385a != null) {
                return new ResultLanguageContext(iIntValue, strMo9385a2, iIntValue2, list2, languageContextNotificationMo9385a, languageContextNotificationMo9385a2, boolMo9385a, strMo9385a, list, languageMo9385a, numMo9385a.intValue(), listMo9385a);
            }
            throw C9756b.m18248g("streakDays", "streak_days", jsonReader);
        }
        List<String> list3 = list;
        Constructor<ResultLanguageContext> declaredConstructor = this.f18461i;
        int i11 = 14;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultLanguageContext.class.getDeclaredConstructor(cls, String.class, cls, List.class, LanguageContextNotification.class, LanguageContextNotification.class, Boolean.class, String.class, List.class, Language.class, cls, List.class, cls, C9756b.f49813c);
            this.f18461i = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultLanguageContext::c…his.constructorRef = it }");
            i11 = 14;
        }
        Object[] objArr = new Object[i11];
        objArr[0] = numM850i;
        objArr[1] = strMo9385a2;
        objArr[2] = numMo9385a2;
        objArr[3] = list2;
        objArr[4] = languageContextNotificationMo9385a;
        objArr[5] = languageContextNotificationMo9385a2;
        objArr[6] = boolMo9385a;
        objArr[7] = strMo9385a;
        objArr[8] = list3;
        objArr[9] = languageMo9385a;
        if (numMo9385a == null) {
            throw C9756b.m18248g("streakDays", "streak_days", jsonReader);
        }
        objArr[10] = Integer.valueOf(numMo9385a.intValue());
        objArr[11] = listMo9385a;
        objArr[12] = Integer.valueOf(i10);
        objArr[13] = null;
        ResultLanguageContext resultLanguageContextNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultLanguageContextNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultLanguageContextNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLanguageContext resultLanguageContext) throws IOException {
        ResultLanguageContext resultLanguageContext2 = resultLanguageContext;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLanguageContext2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(resultLanguageContext2.f18441a);
        AbstractC4949k<Integer> abstractC4949k = this.f18454b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("url");
        String str = resultLanguageContext2.f18442b;
        AbstractC4949k<String> abstractC4949k2 = this.f18455c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("repetition_lingqs");
        C0166e.m775v(resultLanguageContext2.f18443c, abstractC4949k, abstractC9310n, "lotd_dates");
        List<String> list = resultLanguageContext2.f18444d;
        AbstractC4949k<List<String>> abstractC4949k3 = this.f18456d;
        abstractC4949k3.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("email_notifications");
        LanguageContextNotification languageContextNotification = resultLanguageContext2.f18445e;
        AbstractC4949k<LanguageContextNotification> abstractC4949k4 = this.f18457e;
        abstractC4949k4.mo9386f(abstractC9310n, languageContextNotification);
        abstractC9310n.mo10551C("site_notifications");
        abstractC4949k4.mo9386f(abstractC9310n, resultLanguageContext2.f18446f);
        abstractC9310n.mo10551C("use_feed");
        this.f18458f.mo9386f(abstractC9310n, resultLanguageContext2.f18447g);
        abstractC9310n.mo10551C("intense");
        abstractC4949k2.mo9386f(abstractC9310n, resultLanguageContext2.f18448h);
        abstractC9310n.mo10551C("tags");
        abstractC4949k3.mo9386f(abstractC9310n, resultLanguageContext2.f18449i);
        abstractC9310n.mo10551C("language");
        this.f18459g.mo9386f(abstractC9310n, resultLanguageContext2.f18450j);
        abstractC9310n.mo10551C("streak_days");
        C0166e.m775v(resultLanguageContext2.f18451k, abstractC4949k, abstractC9310n, "feed_levels");
        this.f18460h.mo9386f(abstractC9310n, resultLanguageContext2.f18452l);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(43, "GeneratedJsonAdapter(ResultLanguageContext)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
