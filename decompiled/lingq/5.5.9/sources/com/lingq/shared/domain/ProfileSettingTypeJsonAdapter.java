package com.lingq.shared.domain;

import androidx.datastore.preferences.PreferencesProto$Value;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileSettingTypeJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/domain/ProfileSettingType;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ProfileSettingTypeJsonAdapter extends AbstractC4949k<ProfileSettingType> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17858a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17859b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor<ProfileSettingType> f17860c;

    public ProfileSettingTypeJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17858a = JsonReader.C4932a.m10513a("repeat", "shuffle", "disabled", "autoplay_tts", "remove_when_increase", "front_status", "front_fragment", "front_hint", "front_order", "front_term", "front_script", "back_status", "back_script", "back_fragment", "back_term", "back_hint", "front_script_ja", "front_script_zh", "back_script_ja", "back_script_zh");
        this.f17859b = c4955q.m10565c(String.class, EmptySet.f38034a, "repeat");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ProfileSettingType mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
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
        String strMo9385a13 = null;
        String strMo9385a14 = null;
        String strMo9385a15 = null;
        String strMo9385a16 = null;
        String strMo9385a17 = null;
        String strMo9385a18 = null;
        String strMo9385a19 = null;
        String strMo9385a20 = null;
        while (jsonReader.mo10511w()) {
            String str = strMo9385a2;
            switch (jsonReader.mo10512y0(this.f17858a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    strMo9385a2 = str;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a3 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("repeat", "repeat", jsonReader);
                    }
                    i11 &= -2;
                    strMo9385a2 = str;
                    break;
                    break;
                case 1:
                    strMo9385a4 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("shuffle", "shuffle", jsonReader);
                    }
                    i11 &= -3;
                    strMo9385a2 = str;
                    break;
                    break;
                case 2:
                    strMo9385a5 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("disabled", "disabled", jsonReader);
                    }
                    i11 &= -5;
                    strMo9385a2 = str;
                    break;
                    break;
                case 3:
                    strMo9385a6 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a6 == null) {
                        throw C9756b.m18254m("autoPlayTts", "autoplay_tts", jsonReader);
                    }
                    i11 &= -9;
                    strMo9385a2 = str;
                    break;
                    break;
                case 4:
                    strMo9385a7 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a7 == null) {
                        throw C9756b.m18254m("removeWhenIncrease", "remove_when_increase", jsonReader);
                    }
                    i11 &= -17;
                    strMo9385a2 = str;
                    break;
                    break;
                case 5:
                    strMo9385a8 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a8 == null) {
                        throw C9756b.m18254m("frontStatus", "front_status", jsonReader);
                    }
                    i11 &= -33;
                    strMo9385a2 = str;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a9 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a9 == null) {
                        throw C9756b.m18254m("frontFragment", "front_fragment", jsonReader);
                    }
                    i11 &= -65;
                    strMo9385a2 = str;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strMo9385a10 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a10 == null) {
                        throw C9756b.m18254m("frontHint", "front_hint", jsonReader);
                    }
                    i11 &= -129;
                    strMo9385a2 = str;
                    break;
                    break;
                case 8:
                    strMo9385a11 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a11 == null) {
                        throw C9756b.m18254m("frontOrder", "front_order", jsonReader);
                    }
                    i11 &= -257;
                    strMo9385a2 = str;
                    break;
                    break;
                case 9:
                    strMo9385a12 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a12 == null) {
                        throw C9756b.m18254m("frontTerm", "front_term", jsonReader);
                    }
                    i11 &= -513;
                    strMo9385a2 = str;
                    break;
                    break;
                case 10:
                    strMo9385a2 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("frontScript", "front_script", jsonReader);
                    }
                    i11 &= -1025;
                    break;
                    break;
                case 11:
                    strMo9385a13 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a13 == null) {
                        throw C9756b.m18254m("backStatus", "back_status", jsonReader);
                    }
                    i11 &= -2049;
                    strMo9385a2 = str;
                    break;
                    break;
                case 12:
                    strMo9385a = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("backScript", "back_script", jsonReader);
                    }
                    i11 &= -4097;
                    strMo9385a2 = str;
                    break;
                    break;
                case 13:
                    strMo9385a14 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a14 == null) {
                        throw C9756b.m18254m("backFragment", "back_fragment", jsonReader);
                    }
                    i11 &= -8193;
                    strMo9385a2 = str;
                    break;
                    break;
                case 14:
                    strMo9385a15 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a15 == null) {
                        throw C9756b.m18254m("backTerm", "back_term", jsonReader);
                    }
                    i11 &= -16385;
                    strMo9385a2 = str;
                    break;
                    break;
                case 15:
                    strMo9385a16 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a16 == null) {
                        throw C9756b.m18254m("backHint", "back_hint", jsonReader);
                    }
                    i10 = -32769;
                    i11 &= i10;
                    strMo9385a2 = str;
                    break;
                    break;
                case 16:
                    strMo9385a17 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a17 == null) {
                        throw C9756b.m18254m("frontScriptJa", "front_script_ja", jsonReader);
                    }
                    i10 = -65537;
                    i11 &= i10;
                    strMo9385a2 = str;
                    break;
                    break;
                case 17:
                    strMo9385a18 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a18 == null) {
                        throw C9756b.m18254m("frontScriptZh", "front_script_zh", jsonReader);
                    }
                    i10 = -131073;
                    i11 &= i10;
                    strMo9385a2 = str;
                    break;
                    break;
                case 18:
                    strMo9385a19 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a19 == null) {
                        throw C9756b.m18254m("backScriptJa", "back_script_ja", jsonReader);
                    }
                    i10 = -262145;
                    i11 &= i10;
                    strMo9385a2 = str;
                    break;
                    break;
                case 19:
                    strMo9385a20 = this.f17859b.mo9385a(jsonReader);
                    if (strMo9385a20 == null) {
                        throw C9756b.m18254m("backScriptZh", "back_script_zh", jsonReader);
                    }
                    i10 = -524289;
                    i11 &= i10;
                    strMo9385a2 = str;
                    break;
                    break;
                default:
                    strMo9385a2 = str;
                    break;
            }
        }
        String str2 = strMo9385a2;
        jsonReader.mo10508q();
        if (i11 == -1048576) {
            C5207g.m11109d(strMo9385a3, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a4, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a5, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a6, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a7, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a8, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a9, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a10, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a11, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a12, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(str2, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a13, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            String str3 = strMo9385a14;
            C5207g.m11109d(str3, "null cannot be cast to non-null type kotlin.String");
            String str4 = strMo9385a15;
            C5207g.m11109d(str4, "null cannot be cast to non-null type kotlin.String");
            String str5 = strMo9385a16;
            C5207g.m11109d(str5, "null cannot be cast to non-null type kotlin.String");
            String str6 = strMo9385a17;
            C5207g.m11109d(str6, "null cannot be cast to non-null type kotlin.String");
            String str7 = strMo9385a18;
            C5207g.m11109d(str7, "null cannot be cast to non-null type kotlin.String");
            String str8 = strMo9385a19;
            C5207g.m11109d(str8, "null cannot be cast to non-null type kotlin.String");
            String str9 = strMo9385a20;
            C5207g.m11109d(str9, "null cannot be cast to non-null type kotlin.String");
            return new ProfileSettingType(strMo9385a3, strMo9385a4, strMo9385a5, strMo9385a6, strMo9385a7, strMo9385a8, strMo9385a9, strMo9385a10, strMo9385a11, strMo9385a12, str2, strMo9385a13, strMo9385a, str3, str4, str5, str6, str7, str8, str9);
        }
        String str10 = strMo9385a13;
        String str11 = strMo9385a16;
        String str12 = strMo9385a17;
        String str13 = strMo9385a18;
        String str14 = strMo9385a19;
        String str15 = strMo9385a20;
        Constructor<ProfileSettingType> declaredConstructor = this.f17860c;
        int i12 = i11;
        int i13 = 22;
        if (declaredConstructor == null) {
            declaredConstructor = ProfileSettingType.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, C9756b.f49813c);
            this.f17860c = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ProfileSettingType::clas…his.constructorRef = it }");
            i13 = 22;
        }
        Object[] objArr = new Object[i13];
        objArr[0] = strMo9385a3;
        objArr[1] = strMo9385a4;
        objArr[2] = strMo9385a5;
        objArr[3] = strMo9385a6;
        objArr[4] = strMo9385a7;
        objArr[5] = strMo9385a8;
        objArr[6] = strMo9385a9;
        objArr[7] = strMo9385a10;
        objArr[8] = strMo9385a11;
        objArr[9] = strMo9385a12;
        objArr[10] = str2;
        objArr[11] = str10;
        objArr[12] = strMo9385a;
        objArr[13] = strMo9385a14;
        objArr[14] = strMo9385a15;
        objArr[15] = str11;
        objArr[16] = str12;
        objArr[17] = str13;
        objArr[18] = str14;
        objArr[19] = str15;
        objArr[20] = Integer.valueOf(i12);
        objArr[21] = null;
        ProfileSettingType profileSettingTypeNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(profileSettingTypeNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return profileSettingTypeNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ProfileSettingType profileSettingType) throws IOException {
        ProfileSettingType profileSettingType2 = profileSettingType;
        C5207g.m11111f(abstractC9310n, "writer");
        if (profileSettingType2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("repeat");
        String str = profileSettingType2.f17838a;
        AbstractC4949k<String> abstractC4949k = this.f17859b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("shuffle");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17839b);
        abstractC9310n.mo10551C("disabled");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17840c);
        abstractC9310n.mo10551C("autoplay_tts");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17841d);
        abstractC9310n.mo10551C("remove_when_increase");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17842e);
        abstractC9310n.mo10551C("front_status");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17843f);
        abstractC9310n.mo10551C("front_fragment");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17844g);
        abstractC9310n.mo10551C("front_hint");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17845h);
        abstractC9310n.mo10551C("front_order");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17846i);
        abstractC9310n.mo10551C("front_term");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17847j);
        abstractC9310n.mo10551C("front_script");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17848k);
        abstractC9310n.mo10551C("back_status");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17849l);
        abstractC9310n.mo10551C("back_script");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17850m);
        abstractC9310n.mo10551C("back_fragment");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17851n);
        abstractC9310n.mo10551C("back_term");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17852o);
        abstractC9310n.mo10551C("back_hint");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17853p);
        abstractC9310n.mo10551C("front_script_ja");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17854q);
        abstractC9310n.mo10551C("front_script_zh");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17855r);
        abstractC9310n.mo10551C("back_script_ja");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17856s);
        abstractC9310n.mo10551C("back_script_zh");
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType2.f17857t);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(ProfileSettingType)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
