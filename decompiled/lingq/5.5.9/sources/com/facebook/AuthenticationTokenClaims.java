package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.util.Base64;
import androidx.activity.result.C0204c;
import dm.C5206f;
import dm.C5207g;
import dm.C5212l;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import mo.C7653a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5056a0;
import p067d8.C5086z;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "b", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class AuthenticationTokenClaims implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new C2267a();

    /* JADX INFO: renamed from: H */
    public final String f11389H;

    /* JADX INFO: renamed from: I */
    public final Set<String> f11390I;

    /* JADX INFO: renamed from: J */
    public final String f11391J;

    /* JADX INFO: renamed from: K */
    public final Map<String, Integer> f11392K;

    /* JADX INFO: renamed from: L */
    public final Map<String, String> f11393L;

    /* JADX INFO: renamed from: M */
    public final Map<String, String> f11394M;

    /* JADX INFO: renamed from: N */
    public final String f11395N;

    /* JADX INFO: renamed from: O */
    public final String f11396O;

    /* JADX INFO: renamed from: a */
    public final String f11397a;

    /* JADX INFO: renamed from: b */
    public final String f11398b;

    /* JADX INFO: renamed from: c */
    public final String f11399c;

    /* JADX INFO: renamed from: d */
    public final String f11400d;

    /* JADX INFO: renamed from: e */
    public final long f11401e;

    /* JADX INFO: renamed from: f */
    public final long f11402f;

    /* JADX INFO: renamed from: g */
    public final String f11403g;

    /* JADX INFO: renamed from: h */
    public final String f11404h;

    /* JADX INFO: renamed from: i */
    public final String f11405i;

    /* JADX INFO: renamed from: j */
    public final String f11406j;

    /* JADX INFO: renamed from: k */
    public final String f11407k;

    /* JADX INFO: renamed from: l */
    public final String f11408l;

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenClaims$a */
    public static final class C2267a implements Parcelable.Creator<AuthenticationTokenClaims> {
        @Override // android.os.Parcelable.Creator
        public final AuthenticationTokenClaims createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new AuthenticationTokenClaims(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthenticationTokenClaims[] newArray(int i10) {
            return new AuthenticationTokenClaims[i10];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenClaims$b */
    public static final class C2268b {
        /* JADX INFO: renamed from: a */
        public static String m6600a(String str, JSONObject jSONObject) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        C5207g.m11111f(parcel, "parcel");
        String string = parcel.readString();
        C5056a0.m10746d(string, "jti");
        this.f11397a = string;
        String string2 = parcel.readString();
        C5056a0.m10746d(string2, "iss");
        this.f11398b = string2;
        String string3 = parcel.readString();
        C5056a0.m10746d(string3, "aud");
        this.f11399c = string3;
        String string4 = parcel.readString();
        C5056a0.m10746d(string4, "nonce");
        this.f11400d = string4;
        this.f11401e = parcel.readLong();
        this.f11402f = parcel.readLong();
        String string5 = parcel.readString();
        C5056a0.m10746d(string5, "sub");
        this.f11403g = string5;
        this.f11404h = parcel.readString();
        this.f11405i = parcel.readString();
        this.f11406j = parcel.readString();
        this.f11407k = parcel.readString();
        this.f11408l = parcel.readString();
        this.f11389H = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f11390I = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.f11391J = parcel.readString();
        HashMap hashMap = parcel.readHashMap(C5206f.class.getClassLoader());
        if (!(hashMap instanceof HashMap)) {
            hashMap = null;
        }
        this.f11392K = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        HashMap hashMap2 = parcel.readHashMap(C5212l.class.getClassLoader());
        if (!(hashMap2 instanceof HashMap)) {
            hashMap2 = null;
        }
        this.f11393L = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(C5212l.class.getClassLoader());
        hashMap3 = hashMap3 instanceof HashMap ? hashMap3 : null;
        this.f11394M = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.f11395N = parcel.readString();
        this.f11396O = parcel.readString();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    public AuthenticationTokenClaims(String str, String str2) throws JSONException {
        boolean z10;
        Set<String> setUnmodifiableSet;
        C5207g.m11111f(str, "encodedClaims");
        C5207g.m11111f(str2, "expectedNonce");
        C5056a0.m10744b(str, "encodedClaims");
        byte[] bArrDecode = Base64.decode(str, 8);
        C5207g.m11110e(bArrDecode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, C7653a.f42116b));
        String strOptString = jSONObject.optString("jti");
        C5207g.m11110e(strOptString, "jti");
        if (strOptString.length() == 0) {
            z10 = false;
        } else {
            try {
                String strOptString2 = jSONObject.optString("iss");
                C5207g.m11110e(strOptString2, "iss");
                if ((strOptString2.length() == 0) || !(C5207g.m11106a(new URL(strOptString2).getHost(), "facebook.com") || C5207g.m11106a(new URL(strOptString2).getHost(), "www.facebook.com"))) {
                    z10 = false;
                } else {
                    String strOptString3 = jSONObject.optString("aud");
                    C5207g.m11110e(strOptString3, "aud");
                    if ((strOptString3.length() == 0) || !C5207g.m11106a(strOptString3, C8004n.m15872b())) {
                        z10 = false;
                    } else {
                        long j10 = 1000;
                        if (new Date().after(new Date(jSONObject.optLong("exp") * j10))) {
                            z10 = false;
                        } else {
                            if (new Date().after(new Date((jSONObject.optLong("iat") * j10) + 600000))) {
                                z10 = false;
                            } else {
                                String strOptString4 = jSONObject.optString("sub");
                                C5207g.m11110e(strOptString4, "sub");
                                if (strOptString4.length() == 0) {
                                    z10 = false;
                                } else {
                                    String strOptString5 = jSONObject.optString("nonce");
                                    C5207g.m11110e(strOptString5, "nonce");
                                    if ((strOptString5.length() == 0) || !C5207g.m11106a(strOptString5, str2)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException unused) {
            }
        }
        if (!z10) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        C5207g.m11110e(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.f11397a = string;
        String string2 = jSONObject.getString("iss");
        C5207g.m11110e(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.f11398b = string2;
        String string3 = jSONObject.getString("aud");
        C5207g.m11110e(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.f11399c = string3;
        String string4 = jSONObject.getString("nonce");
        C5207g.m11110e(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.f11400d = string4;
        this.f11401e = jSONObject.getLong("exp");
        this.f11402f = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        C5207g.m11110e(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.f11403g = string5;
        this.f11404h = C2268b.m6600a("name", jSONObject);
        this.f11405i = C2268b.m6600a("given_name", jSONObject);
        this.f11406j = C2268b.m6600a("middle_name", jSONObject);
        this.f11407k = C2268b.m6600a("family_name", jSONObject);
        this.f11408l = C2268b.m6600a("email", jSONObject);
        this.f11389H = C2268b.m6600a("picture", jSONObject);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
        if (jSONArrayOptJSONArray == null) {
            setUnmodifiableSet = null;
        } else {
            C5086z c5086z = C5086z.f33015a;
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String string6 = jSONArrayOptJSONArray.getString(i10);
                    C5207g.m11110e(string6, "jsonArray.getString(i)");
                    hashSet.add(string6);
                    if (i11 >= length) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        this.f11390I = setUnmodifiableSet;
        this.f11391J = C2268b.m6600a("user_birthday", jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
        this.f11392K = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(C5086z.m10823h(jSONObjectOptJSONObject));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.f11393L = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(C5086z.m10824i(jSONObjectOptJSONObject2));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
        this.f11394M = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(C5086z.m10824i(jSONObjectOptJSONObject3)) : null;
        this.f11395N = C2268b.m6600a("user_gender", jSONObject);
        this.f11396O = C2268b.m6600a("user_link", jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m6599a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f11397a);
        jSONObject.put("iss", this.f11398b);
        jSONObject.put("aud", this.f11399c);
        jSONObject.put("nonce", this.f11400d);
        jSONObject.put("exp", this.f11401e);
        jSONObject.put("iat", this.f11402f);
        String str = this.f11403g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f11404h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f11405i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f11406j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f11407k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f11408l;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f11389H;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set<String> set = this.f11390I;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.f11391J;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map<String, Integer> map = this.f11392K;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map<String, String> map2 = this.f11393L;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map<String, String> map3 = this.f11394M;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.f11395N;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f11396O;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return C5207g.m11106a(this.f11397a, authenticationTokenClaims.f11397a) && C5207g.m11106a(this.f11398b, authenticationTokenClaims.f11398b) && C5207g.m11106a(this.f11399c, authenticationTokenClaims.f11399c) && C5207g.m11106a(this.f11400d, authenticationTokenClaims.f11400d) && this.f11401e == authenticationTokenClaims.f11401e && this.f11402f == authenticationTokenClaims.f11402f && C5207g.m11106a(this.f11403g, authenticationTokenClaims.f11403g) && C5207g.m11106a(this.f11404h, authenticationTokenClaims.f11404h) && C5207g.m11106a(this.f11405i, authenticationTokenClaims.f11405i) && C5207g.m11106a(this.f11406j, authenticationTokenClaims.f11406j) && C5207g.m11106a(this.f11407k, authenticationTokenClaims.f11407k) && C5207g.m11106a(this.f11408l, authenticationTokenClaims.f11408l) && C5207g.m11106a(this.f11389H, authenticationTokenClaims.f11389H) && C5207g.m11106a(this.f11390I, authenticationTokenClaims.f11390I) && C5207g.m11106a(this.f11391J, authenticationTokenClaims.f11391J) && C5207g.m11106a(this.f11392K, authenticationTokenClaims.f11392K) && C5207g.m11106a(this.f11393L, authenticationTokenClaims.f11393L) && C5207g.m11106a(this.f11394M, authenticationTokenClaims.f11394M) && C5207g.m11106a(this.f11395N, authenticationTokenClaims.f11395N) && C5207g.m11106a(this.f11396O, authenticationTokenClaims.f11396O);
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f11403g, C0204c.m847f(this.f11402f, C0204c.m847f(this.f11401e, C0166e.m758d(this.f11400d, C0166e.m758d(this.f11399c, C0166e.m758d(this.f11398b, C0166e.m758d(this.f11397a, 527, 31), 31), 31), 31), 31), 31), 31);
        int iHashCode = 0;
        String str = this.f11404h;
        int iHashCode2 = (iM758d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11405i;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11406j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11407k;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11408l;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f11389H;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.f11390I;
        int iHashCode8 = (iHashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f11391J;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.f11392K;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f11393L;
        int iHashCode11 = (iHashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.f11394M;
        int iHashCode12 = (iHashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.f11395N;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f11396O;
        if (str9 != null) {
            iHashCode = str9.hashCode();
        }
        return iHashCode13 + iHashCode;
    }

    public final String toString() {
        String string = m6599a().toString();
        C5207g.m11110e(string, "claimsJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        parcel.writeString(this.f11397a);
        parcel.writeString(this.f11398b);
        parcel.writeString(this.f11399c);
        parcel.writeString(this.f11400d);
        parcel.writeLong(this.f11401e);
        parcel.writeLong(this.f11402f);
        parcel.writeString(this.f11403g);
        parcel.writeString(this.f11404h);
        parcel.writeString(this.f11405i);
        parcel.writeString(this.f11406j);
        parcel.writeString(this.f11407k);
        parcel.writeString(this.f11408l);
        parcel.writeString(this.f11389H);
        Set<String> set = this.f11390I;
        if (set == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(set));
        }
        parcel.writeString(this.f11391J);
        parcel.writeMap(this.f11392K);
        parcel.writeMap(this.f11393L);
        parcel.writeMap(this.f11394M);
        parcel.writeString(this.f11395N);
        parcel.writeString(this.f11396O);
    }
}
