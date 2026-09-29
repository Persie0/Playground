package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LanguageContextJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LanguageContext;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LanguageContextJsonAdapter extends AbstractC4949k<LanguageContext> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17011a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17012b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17013c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17014d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<String>> f17015e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<LanguageContextNotification> f17016f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Boolean> f17017g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<Integer> f17018h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<List<String>> f17019i;

    /* JADX INFO: renamed from: j */
    public volatile Constructor<LanguageContext> f17020j;

    public LanguageContextJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17011a = JsonReader.C4932a.m10513a("code", "pk", "url", "repetition_lingqs", "lotd_dates", "email_notifications", "site_notifications", "use_feed", "intense", "streak_days", "tags", "supported", "title", "lastUsed", "knownWords", "grammarResourceSlug", "feedLevels");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17012b = c4955q.m10565c(String.class, emptySet, "code");
        this.f17013c = c4955q.m10565c(Integer.TYPE, emptySet, "pk");
        this.f17014d = c4955q.m10565c(String.class, emptySet, "url");
        this.f17015e = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "lotdDates");
        this.f17016f = c4955q.m10565c(LanguageContextNotification.class, emptySet, "emailNotifications");
        this.f17017g = c4955q.m10565c(Boolean.class, emptySet, "isUseFeed");
        this.f17018h = c4955q.m10565c(Integer.class, emptySet, "knownWords");
        this.f17019i = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "feedLevels");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LanguageContext mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        List<String> list = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a = null;
        String strMo9385a3 = null;
        List<String> listMo9385a = null;
        Boolean boolMo9385a = null;
        String strMo9385a4 = null;
        Boolean boolMo9385a2 = null;
        List<String> list2 = null;
        LanguageContextNotification languageContextNotificationMo9385a = null;
        LanguageContextNotification languageContextNotificationMo9385a2 = null;
        String str = null;
        String strMo9385a5 = null;
        Integer numMo9385a2 = null;
        int i10 = -1;
        Integer numMo9385a3 = numM850i;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17011a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    String strMo9385a6 = this.f17012b.mo9385a(jsonReader);
                    if (strMo9385a6 == null) {
                        throw C9756b.m18254m("code", "code", jsonReader);
                    }
                    i10 &= -2;
                    str = strMo9385a6;
                    break;
                    break;
                case 1:
                    numM850i = this.f17013c.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    strMo9385a5 = this.f17014d.mo9385a(jsonReader);
                    break;
                case 3:
                    numMo9385a3 = this.f17013c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("repetitionLingQs", "repetition_lingqs", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    List<String> listMo9385a2 = this.f17015e.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("lotdDates", "lotd_dates", jsonReader);
                    }
                    i10 &= -17;
                    list2 = listMo9385a2;
                    break;
                    break;
                case 5:
                    languageContextNotificationMo9385a = this.f17016f.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    languageContextNotificationMo9385a2 = this.f17016f.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    i10 &= -129;
                    boolMo9385a = this.f17017g.mo9385a(jsonReader);
                    break;
                case 8:
                    strMo9385a4 = this.f17014d.mo9385a(jsonReader);
                    break;
                case 9:
                    numMo9385a2 = this.f17013c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("streakDays", "streak_days", jsonReader);
                    }
                    break;
                    break;
                case 10:
                    List<String> listMo9385a3 = this.f17015e.mo9385a(jsonReader);
                    if (listMo9385a3 == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i10 &= -1025;
                    list = listMo9385a3;
                    break;
                    break;
                case 11:
                    boolMo9385a2 = this.f17017g.mo9385a(jsonReader);
                    break;
                case 12:
                    strMo9385a = this.f17014d.mo9385a(jsonReader);
                    break;
                case 13:
                    strMo9385a2 = this.f17014d.mo9385a(jsonReader);
                    break;
                case 14:
                    numMo9385a = this.f17018h.mo9385a(jsonReader);
                    break;
                case 15:
                    strMo9385a3 = this.f17014d.mo9385a(jsonReader);
                    break;
                case 16:
                    i10 &= -65537;
                    listMo9385a = this.f17019i.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -66716) {
            C5207g.m11109d(str, "null cannot be cast to non-null type kotlin.String");
            int iIntValue = numM850i.intValue();
            int iIntValue2 = numMo9385a3.intValue();
            C5207g.m11109d(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            if (numMo9385a2 == null) {
                throw C9756b.m18248g("streakDays", "streak_days", jsonReader);
            }
            int iIntValue3 = numMo9385a2.intValue();
            C5207g.m11109d(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new LanguageContext(str, iIntValue, strMo9385a5, iIntValue2, list2, languageContextNotificationMo9385a, languageContextNotificationMo9385a2, boolMo9385a, strMo9385a4, iIntValue3, list, boolMo9385a2, strMo9385a, strMo9385a2, numMo9385a, strMo9385a3, listMo9385a);
        }
        List<String> list3 = list;
        Constructor<LanguageContext> declaredConstructor = this.f17020j;
        int i11 = 19;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = LanguageContext.class.getDeclaredConstructor(String.class, cls, String.class, cls, List.class, LanguageContextNotification.class, LanguageContextNotification.class, Boolean.class, String.class, cls, List.class, Boolean.class, String.class, String.class, Integer.class, String.class, List.class, cls, C9756b.f49813c);
            this.f17020j = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LanguageContext::class.j…his.constructorRef = it }");
            i11 = 19;
        }
        Object[] objArr = new Object[i11];
        objArr[0] = str;
        objArr[1] = numM850i;
        objArr[2] = strMo9385a5;
        objArr[3] = numMo9385a3;
        objArr[4] = list2;
        objArr[5] = languageContextNotificationMo9385a;
        objArr[6] = languageContextNotificationMo9385a2;
        objArr[7] = boolMo9385a;
        objArr[8] = strMo9385a4;
        if (numMo9385a2 == null) {
            throw C9756b.m18248g("streakDays", "streak_days", jsonReader);
        }
        objArr[9] = Integer.valueOf(numMo9385a2.intValue());
        objArr[10] = list3;
        objArr[11] = boolMo9385a2;
        objArr[12] = strMo9385a;
        objArr[13] = strMo9385a2;
        objArr[14] = numMo9385a;
        objArr[15] = strMo9385a3;
        objArr[16] = listMo9385a;
        objArr[17] = Integer.valueOf(i10);
        objArr[18] = null;
        LanguageContext languageContextNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(languageContextNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return languageContextNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LanguageContext languageContext) throws IOException {
        LanguageContext languageContext2 = languageContext;
        C5207g.m11111f(abstractC9310n, "writer");
        if (languageContext2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("code");
        this.f17012b.mo9386f(abstractC9310n, languageContext2.f16994a);
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(languageContext2.f16995b);
        AbstractC4949k<Integer> abstractC4949k = this.f17013c;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("url");
        String str = languageContext2.f16996c;
        AbstractC4949k<String> abstractC4949k2 = this.f17014d;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("repetition_lingqs");
        C0166e.m775v(languageContext2.f16997d, abstractC4949k, abstractC9310n, "lotd_dates");
        List<String> list = languageContext2.f16998e;
        AbstractC4949k<List<String>> abstractC4949k3 = this.f17015e;
        abstractC4949k3.mo9386f(abstractC9310n, list);
        abstractC9310n.mo10551C("email_notifications");
        LanguageContextNotification languageContextNotification = languageContext2.f16999f;
        AbstractC4949k<LanguageContextNotification> abstractC4949k4 = this.f17016f;
        abstractC4949k4.mo9386f(abstractC9310n, languageContextNotification);
        abstractC9310n.mo10551C("site_notifications");
        abstractC4949k4.mo9386f(abstractC9310n, languageContext2.f17000g);
        abstractC9310n.mo10551C("use_feed");
        Boolean bool = languageContext2.f17001h;
        AbstractC4949k<Boolean> abstractC4949k5 = this.f17017g;
        abstractC4949k5.mo9386f(abstractC9310n, bool);
        abstractC9310n.mo10551C("intense");
        abstractC4949k2.mo9386f(abstractC9310n, languageContext2.f17002i);
        abstractC9310n.mo10551C("streak_days");
        C0166e.m775v(languageContext2.f17003j, abstractC4949k, abstractC9310n, "tags");
        abstractC4949k3.mo9386f(abstractC9310n, languageContext2.f17004k);
        abstractC9310n.mo10551C("supported");
        abstractC4949k5.mo9386f(abstractC9310n, languageContext2.f17005l);
        abstractC9310n.mo10551C("title");
        abstractC4949k2.mo9386f(abstractC9310n, languageContext2.f17006m);
        abstractC9310n.mo10551C("lastUsed");
        abstractC4949k2.mo9386f(abstractC9310n, languageContext2.f17007n);
        abstractC9310n.mo10551C("knownWords");
        this.f17018h.mo9386f(abstractC9310n, languageContext2.f17008o);
        abstractC9310n.mo10551C("grammarResourceSlug");
        abstractC4949k2.mo9386f(abstractC9310n, languageContext2.f17009p);
        abstractC9310n.mo10551C("feedLevels");
        this.f17019i.mo9386f(abstractC9310n, languageContext2.f17010q);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(37, "GeneratedJsonAdapter(LanguageContext)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
