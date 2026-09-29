package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3386nv;
import p000.bna;
import p000.c4d;
import p000.eda;
import p000.fa4;
import p000.hfb;
import p000.pk9;
import p000.sy2;
import p000.ux5;
import p000.x74;
import p000.yu0;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthenticationTokenClaims implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new hfb(3);

    /* JADX INFO: renamed from: H */
    public final String f11323H;

    /* JADX INFO: renamed from: I */
    public final Set f11324I;

    /* JADX INFO: renamed from: J */
    public final String f11325J;

    /* JADX INFO: renamed from: K */
    public final Map f11326K;

    /* JADX INFO: renamed from: L */
    public final Map f11327L;

    /* JADX INFO: renamed from: M */
    public final Map f11328M;

    /* JADX INFO: renamed from: N */
    public final String f11329N;

    /* JADX INFO: renamed from: O */
    public final String f11330O;

    /* JADX INFO: renamed from: a */
    public final String f11331a;

    /* JADX INFO: renamed from: b */
    public final String f11332b;

    /* JADX INFO: renamed from: c */
    public final String f11333c;

    /* JADX INFO: renamed from: d */
    public final String f11334d;

    /* JADX INFO: renamed from: e */
    public final long f11335e;

    /* JADX INFO: renamed from: f */
    public final long f11336f;

    /* JADX INFO: renamed from: g */
    public final String f11337g;

    /* JADX INFO: renamed from: h */
    public final String f11338h;

    /* JADX INFO: renamed from: i */
    public final String f11339i;

    /* JADX INFO: renamed from: j */
    public final String f11340j;

    /* JADX INFO: renamed from: k */
    public final String f11341k;

    /* JADX INFO: renamed from: l */
    public final String f11342l;

    public AuthenticationTokenClaims(String str, String str2) throws JSONException {
        Set setUnmodifiableSet;
        str.getClass();
        str2.getClass();
        eda.m11071d(str, "encodedClaims");
        byte[] bArrDecode = Base64.decode(str, 8);
        bArrDecode.getClass();
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, yu0.f70463a));
        String strOptString = jSONObject.optString("jti");
        strOptString.getClass();
        if (strOptString.length() != 0) {
            try {
                String strOptString2 = jSONObject.optString("iss");
                strOptString2.getClass();
                if (strOptString2.length() != 0 && (fa4.m11650l(new URL(strOptString2).getHost(), "facebook.com") || fa4.m11650l(new URL(strOptString2).getHost(), "www.facebook.com"))) {
                    String strOptString3 = jSONObject.optString("aud");
                    strOptString3.getClass();
                    if (strOptString3.length() != 0 && strOptString3.equals(sy2.m21767b())) {
                        if (!new Date().after(new Date(jSONObject.optLong("exp") * 1000))) {
                            if (!new Date().after(new Date((jSONObject.optLong("iat") * 1000) + 600000))) {
                                String strOptString4 = jSONObject.optString("sub");
                                strOptString4.getClass();
                                if (strOptString4.length() != 0) {
                                    String strOptString5 = jSONObject.optString("nonce");
                                    strOptString5.getClass();
                                    if (strOptString5.length() != 0 && strOptString5.equals(str2)) {
                                        String string = jSONObject.getString("jti");
                                        string.getClass();
                                        this.f11331a = string;
                                        String string2 = jSONObject.getString("iss");
                                        string2.getClass();
                                        this.f11332b = string2;
                                        String string3 = jSONObject.getString("aud");
                                        string3.getClass();
                                        this.f11333c = string3;
                                        String string4 = jSONObject.getString("nonce");
                                        string4.getClass();
                                        this.f11334d = string4;
                                        this.f11335e = jSONObject.getLong("exp");
                                        this.f11336f = jSONObject.getLong("iat");
                                        String string5 = jSONObject.getString("sub");
                                        string5.getClass();
                                        this.f11337g = string5;
                                        this.f11338h = c4d.m4310b("name", jSONObject);
                                        this.f11339i = c4d.m4310b("given_name", jSONObject);
                                        this.f11340j = c4d.m4310b("middle_name", jSONObject);
                                        this.f11341k = c4d.m4310b("family_name", jSONObject);
                                        this.f11342l = c4d.m4310b("email", jSONObject);
                                        this.f11323H = c4d.m4310b("picture", jSONObject);
                                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
                                        if (jSONArrayOptJSONArray == null) {
                                            setUnmodifiableSet = null;
                                        } else {
                                            HashSet hashSet = new HashSet();
                                            int length = jSONArrayOptJSONArray.length();
                                            for (int i = 0; i < length; i++) {
                                                String string6 = jSONArrayOptJSONArray.getString(i);
                                                string6.getClass();
                                                hashSet.add(string6);
                                            }
                                            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                                        }
                                        this.f11324I = setUnmodifiableSet;
                                        this.f11325J = c4d.m4310b("user_birthday", jSONObject);
                                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
                                        this.f11326K = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(bna.m3917F(jSONObjectOptJSONObject));
                                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                        this.f11327L = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(bna.m3918G(jSONObjectOptJSONObject2));
                                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
                                        this.f11328M = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(bna.m3918G(jSONObjectOptJSONObject3)) : null;
                                        this.f11329N = c4d.m4310b("user_gender", jSONObject);
                                        this.f11330O = c4d.m4310b("user_link", jSONObject);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException unused) {
            }
        }
        C3386nv.m17626m("Invalid claims");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m5180a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f11331a);
        jSONObject.put("iss", this.f11332b);
        jSONObject.put("aud", this.f11333c);
        jSONObject.put("nonce", this.f11334d);
        jSONObject.put("exp", this.f11335e);
        jSONObject.put("iat", this.f11336f);
        String str = this.f11337g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f11338h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f11339i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f11340j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f11341k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f11342l;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f11323H;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.f11324I;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.f11325J;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.f11326K;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.f11327L;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.f11328M;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.f11329N;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f11330O;
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
        return fa4.m11650l(this.f11331a, authenticationTokenClaims.f11331a) && fa4.m11650l(this.f11332b, authenticationTokenClaims.f11332b) && fa4.m11650l(this.f11333c, authenticationTokenClaims.f11333c) && fa4.m11650l(this.f11334d, authenticationTokenClaims.f11334d) && this.f11335e == authenticationTokenClaims.f11335e && this.f11336f == authenticationTokenClaims.f11336f && fa4.m11650l(this.f11337g, authenticationTokenClaims.f11337g) && fa4.m11650l(this.f11338h, authenticationTokenClaims.f11338h) && fa4.m11650l(this.f11339i, authenticationTokenClaims.f11339i) && fa4.m11650l(this.f11340j, authenticationTokenClaims.f11340j) && fa4.m11650l(this.f11341k, authenticationTokenClaims.f11341k) && fa4.m11650l(this.f11342l, authenticationTokenClaims.f11342l) && fa4.m11650l(this.f11323H, authenticationTokenClaims.f11323H) && fa4.m11650l(this.f11324I, authenticationTokenClaims.f11324I) && fa4.m11650l(this.f11325J, authenticationTokenClaims.f11325J) && fa4.m11650l(this.f11326K, authenticationTokenClaims.f11326K) && fa4.m11650l(this.f11327L, authenticationTokenClaims.f11327L) && fa4.m11650l(this.f11328M, authenticationTokenClaims.f11328M) && fa4.m11650l(this.f11329N, authenticationTokenClaims.f11329N) && fa4.m11650l(this.f11330O, authenticationTokenClaims.f11330O);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22981d(this.f11336f, ux5.m22981d(this.f11335e, ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(527, this.f11331a, 31), this.f11332b, 31), this.f11333c, 31), this.f11334d, 31), 31), 31), this.f11337g, 31);
        String str = this.f11338h;
        int iHashCode = (iM22980c + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11339i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11340j;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11341k;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11342l;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f11323H;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.f11324I;
        int iHashCode7 = (iHashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.f11325J;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.f11326K;
        int iHashCode9 = (iHashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.f11327L;
        int iHashCode10 = (iHashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.f11328M;
        int iHashCode11 = (iHashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.f11329N;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f11330O;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String string = m5180a().toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11331a);
        parcel.writeString(this.f11332b);
        parcel.writeString(this.f11333c);
        parcel.writeString(this.f11334d);
        parcel.writeLong(this.f11335e);
        parcel.writeLong(this.f11336f);
        parcel.writeString(this.f11337g);
        parcel.writeString(this.f11338h);
        parcel.writeString(this.f11339i);
        parcel.writeString(this.f11340j);
        parcel.writeString(this.f11341k);
        parcel.writeString(this.f11342l);
        parcel.writeString(this.f11323H);
        Set set = this.f11324I;
        if (set == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(set));
        }
        parcel.writeString(this.f11325J);
        parcel.writeMap(this.f11326K);
        parcel.writeMap(this.f11327L);
        parcel.writeMap(this.f11328M);
        parcel.writeString(this.f11329N);
        parcel.writeString(this.f11330O);
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        String string = parcel.readString();
        eda.m11073f(string, "jti");
        this.f11331a = string;
        String string2 = parcel.readString();
        eda.m11073f(string2, "iss");
        this.f11332b = string2;
        String string3 = parcel.readString();
        eda.m11073f(string3, "aud");
        this.f11333c = string3;
        String string4 = parcel.readString();
        eda.m11073f(string4, "nonce");
        this.f11334d = string4;
        this.f11335e = parcel.readLong();
        this.f11336f = parcel.readLong();
        String string5 = parcel.readString();
        eda.m11073f(string5, "sub");
        this.f11337g = string5;
        this.f11338h = parcel.readString();
        this.f11339i = parcel.readString();
        this.f11340j = parcel.readString();
        this.f11341k = parcel.readString();
        this.f11342l = parcel.readString();
        this.f11323H = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f11324I = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.f11325J = parcel.readString();
        HashMap hashMap = parcel.readHashMap(x74.class.getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.f11326K = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        HashMap hashMap2 = parcel.readHashMap(pk9.class.getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.f11327L = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(pk9.class.getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.f11328M = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.f11329N = parcel.readString();
        this.f11330O = parcel.readString();
    }
}
