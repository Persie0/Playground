package com.lingq.shared.uimodel.language;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/language/UserLanguage;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserLanguageJsonAdapter extends AbstractC4949k<UserLanguage> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f21743a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f21744b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f21745c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f21746d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<String>> f21747e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f21748f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<UserLanguageStudyStats> f21749g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<List<String>> f21750h;

    /* JADX INFO: renamed from: i */
    public volatile Constructor<UserLanguage> f21751i;

    public UserLanguageJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f21743a = JsonReader.C4932a.m10513a("code", "pk", "url", "tags", "supported", "title", "lastUsed", "knownWords", "dictionaryLocaleActive", "grammarResourceSlug", "studyStats", "intense", "streakDays", "repetitionLingQs", "emailLotd", "siteLotd", "feedLevels");
        EmptySet emptySet = EmptySet.f38034a;
        this.f21744b = c4955q.m10565c(String.class, emptySet, "code");
        this.f21745c = c4955q.m10565c(Integer.TYPE, emptySet, "pk");
        this.f21746d = c4955q.m10565c(String.class, emptySet, "url");
        this.f21747e = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f21748f = c4955q.m10565c(Boolean.TYPE, emptySet, "supported");
        this.f21749g = c4955q.m10565c(UserLanguageStudyStats.class, emptySet, "studyStats");
        this.f21750h = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "feedLevels");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final UserLanguage mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a = bool;
        int i11 = -1;
        Integer numMo9385a2 = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        List<String> listMo9385a = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        String strMo9385a6 = null;
        UserLanguageStudyStats userLanguageStudyStatsMo9385a = null;
        String strMo9385a7 = null;
        String strMo9385a8 = null;
        String strMo9385a9 = null;
        List<String> listMo9385a2 = null;
        Integer numMo9385a3 = numMo9385a;
        Integer numMo9385a4 = numMo9385a3;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f21743a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    continue;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f21744b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("code", "code", jsonReader);
                    }
                    i11 &= -2;
                    continue;
                    break;
                case 1:
                    numMo9385a = this.f21745c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i11 &= -3;
                    continue;
                    break;
                case 2:
                    strMo9385a2 = this.f21746d.mo9385a(jsonReader);
                    i11 &= -5;
                    continue;
                case 3:
                    listMo9385a = this.f21747e.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i11 &= -9;
                    continue;
                    break;
                case 4:
                    boolMo9385a = this.f21748f.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("supported", "supported", jsonReader);
                    }
                    i11 &= -17;
                    continue;
                    break;
                case 5:
                    strMo9385a3 = this.f21744b.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                    i11 &= -33;
                    continue;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a4 = this.f21746d.mo9385a(jsonReader);
                    i11 &= -65;
                    continue;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a3 = this.f21745c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("knownWords", "knownWords", jsonReader);
                    }
                    i11 &= -129;
                    continue;
                    break;
                case 8:
                    strMo9385a5 = this.f21746d.mo9385a(jsonReader);
                    i11 &= -257;
                    continue;
                case 9:
                    strMo9385a6 = this.f21746d.mo9385a(jsonReader);
                    i11 &= -513;
                    continue;
                case 10:
                    userLanguageStudyStatsMo9385a = this.f21749g.mo9385a(jsonReader);
                    continue;
                case 11:
                    strMo9385a7 = this.f21746d.mo9385a(jsonReader);
                    continue;
                case 12:
                    numMo9385a2 = this.f21745c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("streakDays", "streakDays", jsonReader);
                    }
                    continue;
                    break;
                case 13:
                    numMo9385a4 = this.f21745c.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("repetitionLingQs", "repetitionLingQs", jsonReader);
                    }
                    i11 &= -8193;
                    continue;
                    break;
                case 14:
                    strMo9385a8 = this.f21746d.mo9385a(jsonReader);
                    i11 &= -16385;
                    continue;
                case 15:
                    strMo9385a9 = this.f21746d.mo9385a(jsonReader);
                    i10 = -32769;
                    break;
                case 16:
                    listMo9385a2 = this.f21750h.mo9385a(jsonReader);
                    i10 = -65537;
                    break;
                default:
                    continue;
            }
            i11 &= i10;
        }
        jsonReader.mo10508q();
        if (i11 == -123904) {
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            int iIntValue = numMo9385a.intValue();
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            boolean zBooleanValue = boolMo9385a.booleanValue();
            C5207g.m11109d(strMo9385a3, "null cannot be cast to non-null type kotlin.String");
            int iIntValue2 = numMo9385a3.intValue();
            if (numMo9385a2 != null) {
                return new UserLanguage(strMo9385a, iIntValue, strMo9385a2, listMo9385a, zBooleanValue, strMo9385a3, strMo9385a4, iIntValue2, strMo9385a5, strMo9385a6, userLanguageStudyStatsMo9385a, strMo9385a7, numMo9385a2.intValue(), numMo9385a4.intValue(), strMo9385a8, strMo9385a9, listMo9385a2);
            }
            throw C9756b.m18248g("streakDays", "streakDays", jsonReader);
        }
        Constructor<UserLanguage> declaredConstructor = this.f21751i;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = UserLanguage.class.getDeclaredConstructor(String.class, cls, String.class, List.class, Boolean.TYPE, String.class, String.class, cls, String.class, String.class, UserLanguageStudyStats.class, String.class, cls, cls, String.class, String.class, List.class, cls, C9756b.f49813c);
            this.f21751i = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "UserLanguage::class.java…his.constructorRef = it }");
        }
        Object[] objArr = new Object[19];
        objArr[0] = strMo9385a;
        objArr[1] = numMo9385a;
        objArr[2] = strMo9385a2;
        objArr[3] = listMo9385a;
        objArr[4] = boolMo9385a;
        objArr[5] = strMo9385a3;
        objArr[6] = strMo9385a4;
        objArr[7] = numMo9385a3;
        objArr[8] = strMo9385a5;
        objArr[9] = strMo9385a6;
        objArr[10] = userLanguageStudyStatsMo9385a;
        objArr[11] = strMo9385a7;
        if (numMo9385a2 == null) {
            throw C9756b.m18248g("streakDays", "streakDays", jsonReader);
        }
        objArr[12] = Integer.valueOf(numMo9385a2.intValue());
        objArr[13] = numMo9385a4;
        objArr[14] = strMo9385a8;
        objArr[15] = strMo9385a9;
        objArr[16] = listMo9385a2;
        objArr[17] = Integer.valueOf(i11);
        objArr[18] = null;
        UserLanguage userLanguageNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(userLanguageNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return userLanguageNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, UserLanguage userLanguage) throws IOException {
        UserLanguage userLanguage2 = userLanguage;
        C5207g.m11111f(abstractC9310n, "writer");
        if (userLanguage2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("code");
        String str = userLanguage2.f21726a;
        AbstractC4949k<String> abstractC4949k = this.f21744b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(userLanguage2.f21727b);
        AbstractC4949k<Integer> abstractC4949k2 = this.f21745c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("url");
        String str2 = userLanguage2.f21728c;
        AbstractC4949k<String> abstractC4949k3 = this.f21746d;
        abstractC4949k3.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("tags");
        this.f21747e.mo9386f(abstractC9310n, userLanguage2.f21729d);
        abstractC9310n.mo10551C("supported");
        this.f21748f.mo9386f(abstractC9310n, Boolean.valueOf(userLanguage2.f21730e));
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, userLanguage2.f21731f);
        abstractC9310n.mo10551C("lastUsed");
        abstractC4949k3.mo9386f(abstractC9310n, userLanguage2.f21732g);
        abstractC9310n.mo10551C("knownWords");
        C0166e.m775v(userLanguage2.f21733h, abstractC4949k2, abstractC9310n, "dictionaryLocaleActive");
        abstractC4949k3.mo9386f(abstractC9310n, userLanguage2.f21734i);
        abstractC9310n.mo10551C("grammarResourceSlug");
        abstractC4949k3.mo9386f(abstractC9310n, userLanguage2.f21735j);
        abstractC9310n.mo10551C("studyStats");
        this.f21749g.mo9386f(abstractC9310n, userLanguage2.f21736k);
        abstractC9310n.mo10551C("intense");
        abstractC4949k3.mo9386f(abstractC9310n, userLanguage2.f21737l);
        abstractC9310n.mo10551C("streakDays");
        C0166e.m775v(userLanguage2.f21738m, abstractC4949k2, abstractC9310n, "repetitionLingQs");
        C0166e.m775v(userLanguage2.f21739n, abstractC4949k2, abstractC9310n, "emailLotd");
        abstractC4949k3.mo9386f(abstractC9310n, userLanguage2.f21740o);
        abstractC9310n.mo10551C("siteLotd");
        abstractC4949k3.mo9386f(abstractC9310n, userLanguage2.f21741p);
        abstractC9310n.mo10551C("feedLevels");
        this.f21750h.mo9386f(abstractC9310n, userLanguage2.f21742q);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(UserLanguage)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
