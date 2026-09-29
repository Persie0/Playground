package com.lingq.shared.domain;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/domain/Profile;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ProfileJsonAdapter extends AbstractC4949k<Profile> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17822a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17823b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17824c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f17825d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<List<String>> f17826e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<ProfileSetting> f17827f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<Profile> f17828g;

    public ProfileJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17822a = JsonReader.C4932a.m10513a("id", "url", "username", "role", "first_name", "last_name", "email", "country", "skype_name", "province", "timezone", "photo", "description", "locale", "active_language", "dictionary_locale", "native_language", "dictionary_languages", "setting", "balance");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17823b = c4955q.m10565c(cls, emptySet, "id");
        this.f17824c = c4955q.m10565c(String.class, emptySet, "url");
        this.f17825d = c4955q.m10565c(String.class, emptySet, "role");
        this.f17826e = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "dictionaryLanguages");
        this.f17827f = c4955q.m10565c(ProfileSetting.class, emptySet, "setting");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Profile mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        String strMo9385a = null;
        String strMo9385a2 = null;
        ProfileSetting profileSettingMo9385a = null;
        String str = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        List<String> listMo9385a = null;
        Integer num = numM850i;
        int i11 = -1;
        String strMo9385a5 = null;
        String str2 = null;
        String str3 = null;
        String strMo9385a6 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (jsonReader.mo10511w()) {
            String str11 = strMo9385a;
            switch (jsonReader.mo10512y0(this.f17822a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    strMo9385a = str11;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numM850i = this.f17823b.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i11 &= -2;
                    strMo9385a = str11;
                    break;
                    break;
                case 1:
                    String strMo9385a7 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a7 == null) {
                        throw C9756b.m18254m("url", "url", jsonReader);
                    }
                    i11 &= -3;
                    str4 = strMo9385a7;
                    strMo9385a = str11;
                    break;
                    break;
                case 2:
                    String strMo9385a8 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a8 == null) {
                        throw C9756b.m18254m("username", "username", jsonReader);
                    }
                    i11 &= -5;
                    str8 = strMo9385a8;
                    strMo9385a = str11;
                    break;
                    break;
                case 3:
                    i11 &= -9;
                    strMo9385a2 = this.f17825d.mo9385a(jsonReader);
                    strMo9385a = str11;
                    break;
                case 4:
                    String strMo9385a9 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a9 == null) {
                        throw C9756b.m18254m("firstName", "first_name", jsonReader);
                    }
                    i11 &= -17;
                    str9 = strMo9385a9;
                    strMo9385a = str11;
                    break;
                    break;
                case 5:
                    String strMo9385a10 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a10 == null) {
                        throw C9756b.m18254m("lastName", "last_name", jsonReader);
                    }
                    i11 &= -33;
                    str6 = strMo9385a10;
                    strMo9385a = str11;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    String strMo9385a11 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a11 == null) {
                        throw C9756b.m18254m("email", "email", jsonReader);
                    }
                    i11 &= -65;
                    str10 = strMo9385a11;
                    strMo9385a = str11;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    String strMo9385a12 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a12 == null) {
                        throw C9756b.m18254m("country", "country", jsonReader);
                    }
                    i11 &= -129;
                    str7 = strMo9385a12;
                    strMo9385a = str11;
                    break;
                    break;
                case 8:
                    strMo9385a6 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a6 == null) {
                        throw C9756b.m18254m("skypeName", "skype_name", jsonReader);
                    }
                    i11 &= -257;
                    strMo9385a = str11;
                    break;
                    break;
                case 9:
                    String strMo9385a13 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a13 == null) {
                        throw C9756b.m18254m("province", "province", jsonReader);
                    }
                    i11 &= -513;
                    str2 = strMo9385a13;
                    strMo9385a = str11;
                    break;
                    break;
                case 10:
                    strMo9385a = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("timezone", "timezone", jsonReader);
                    }
                    i11 &= -1025;
                    break;
                    break;
                case 11:
                    String strMo9385a14 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a14 == null) {
                        throw C9756b.m18254m("photo", "photo", jsonReader);
                    }
                    i11 &= -2049;
                    str3 = strMo9385a14;
                    strMo9385a = str11;
                    break;
                    break;
                case 12:
                    String strMo9385a15 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a15 == null) {
                        throw C9756b.m18254m("description", "description", jsonReader);
                    }
                    i11 &= -4097;
                    str5 = strMo9385a15;
                    strMo9385a = str11;
                    break;
                    break;
                case 13:
                    strMo9385a5 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("locale", "locale", jsonReader);
                    }
                    i11 &= -8193;
                    strMo9385a = str11;
                    break;
                    break;
                case 14:
                    String strMo9385a16 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a16 == null) {
                        throw C9756b.m18254m("activeLanguage", "active_language", jsonReader);
                    }
                    i11 &= -16385;
                    str = strMo9385a16;
                    strMo9385a = str11;
                    break;
                    break;
                case 15:
                    strMo9385a3 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("dictionaryLocale", "dictionary_locale", jsonReader);
                    }
                    i10 = -32769;
                    i11 &= i10;
                    strMo9385a = str11;
                    break;
                    break;
                case 16:
                    strMo9385a4 = this.f17824c.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("nativeLanguage", "native_language", jsonReader);
                    }
                    i10 = -65537;
                    i11 &= i10;
                    strMo9385a = str11;
                    break;
                    break;
                case 17:
                    listMo9385a = this.f17826e.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("dictionaryLanguages", "dictionary_languages", jsonReader);
                    }
                    i10 = -131073;
                    i11 &= i10;
                    strMo9385a = str11;
                    break;
                    break;
                case 18:
                    profileSettingMo9385a = this.f17827f.mo9385a(jsonReader);
                    i10 = -262145;
                    i11 &= i10;
                    strMo9385a = str11;
                    break;
                case 19:
                    Integer numMo9385a = this.f17823b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("balance", "balance", jsonReader);
                    }
                    num = numMo9385a;
                    i10 = -524289;
                    i11 &= i10;
                    strMo9385a = str11;
                    break;
                    break;
                default:
                    strMo9385a = str11;
                    break;
            }
        }
        String str12 = strMo9385a;
        jsonReader.mo10508q();
        if (i11 == -1048576) {
            int iIntValue = numM850i.intValue();
            String str13 = str2;
            C5207g.m11109d(str4, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str8, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str9, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str6, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str10, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str7, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a6, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str13, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str12, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str3, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str5, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a5, "null cannot be cast to non-null type kotlin.String");
            String str14 = str;
            C5207g.m11109d(str14, "null cannot be cast to non-null type kotlin.String");
            String str15 = strMo9385a3;
            C5207g.m11109d(str15, "null cannot be cast to non-null type kotlin.String");
            String str16 = strMo9385a4;
            C5207g.m11109d(str16, "null cannot be cast to non-null type kotlin.String");
            List<String> list = listMo9385a;
            C5207g.m11109d(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new Profile(iIntValue, str4, str8, strMo9385a2, str9, str6, str10, str7, strMo9385a6, str13, str12, str3, str5, strMo9385a5, str14, str15, str16, list, profileSettingMo9385a, num.intValue());
        }
        String str17 = str2;
        String str18 = str3;
        List<String> list2 = listMo9385a;
        String str19 = str5;
        Constructor<Profile> declaredConstructor = this.f17828g;
        int i12 = 22;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = Profile.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, ProfileSetting.class, cls, cls, C9756b.f49813c);
            this.f17828g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Profile::class.java.getD…his.constructorRef = it }");
            i12 = 22;
        }
        Object[] objArr = new Object[i12];
        objArr[0] = numM850i;
        objArr[1] = str4;
        objArr[2] = str8;
        objArr[3] = strMo9385a2;
        objArr[4] = str9;
        objArr[5] = str6;
        objArr[6] = str10;
        objArr[7] = str7;
        objArr[8] = strMo9385a6;
        objArr[9] = str17;
        objArr[10] = str12;
        objArr[11] = str18;
        objArr[12] = str19;
        objArr[13] = strMo9385a5;
        objArr[14] = str;
        objArr[15] = strMo9385a3;
        objArr[16] = strMo9385a4;
        objArr[17] = list2;
        objArr[18] = profileSettingMo9385a;
        objArr[19] = num;
        objArr[20] = Integer.valueOf(i11);
        objArr[21] = null;
        Profile profileNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(profileNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return profileNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Profile profile) throws IOException {
        Profile profile2 = profile;
        C5207g.m11111f(abstractC9310n, "writer");
        if (profile2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(profile2.f17781a);
        AbstractC4949k<Integer> abstractC4949k = this.f17823b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("url");
        String str = profile2.f17782b;
        AbstractC4949k<String> abstractC4949k2 = this.f17824c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("username");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17783c);
        abstractC9310n.mo10551C("role");
        this.f17825d.mo9386f(abstractC9310n, profile2.f17784d);
        abstractC9310n.mo10551C("first_name");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17785e);
        abstractC9310n.mo10551C("last_name");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17786f);
        abstractC9310n.mo10551C("email");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17787g);
        abstractC9310n.mo10551C("country");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17788h);
        abstractC9310n.mo10551C("skype_name");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17789i);
        abstractC9310n.mo10551C("province");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17790j);
        abstractC9310n.mo10551C("timezone");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17791k);
        abstractC9310n.mo10551C("photo");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17792l);
        abstractC9310n.mo10551C("description");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17793m);
        abstractC9310n.mo10551C("locale");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17794n);
        abstractC9310n.mo10551C("active_language");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17795o);
        abstractC9310n.mo10551C("dictionary_locale");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17796p);
        abstractC9310n.mo10551C("native_language");
        abstractC4949k2.mo9386f(abstractC9310n, profile2.f17797q);
        abstractC9310n.mo10551C("dictionary_languages");
        this.f17826e.mo9386f(abstractC9310n, profile2.f17798r);
        abstractC9310n.mo10551C("setting");
        this.f17827f.mo9386f(abstractC9310n, profile2.f17799s);
        abstractC9310n.mo10551C("balance");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(profile2.f17800t));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(29, "GeneratedJsonAdapter(Profile)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
