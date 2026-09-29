package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.l70;
import p000.lda;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new y3a(8);

    /* JADX INFO: renamed from: a */
    public final String f11580a;

    /* JADX INFO: renamed from: b */
    public final String f11581b;

    /* JADX INFO: renamed from: c */
    public final String f11582c;

    /* JADX INFO: renamed from: d */
    public final String f11583d;

    /* JADX INFO: renamed from: e */
    public final Uri f11584e;

    /* JADX INFO: renamed from: f */
    public String f11585f;

    /* JADX INFO: renamed from: g */
    public final long f11586g;

    /* JADX INFO: renamed from: h */
    public final String f11587h;

    /* JADX INFO: renamed from: i */
    public final List f11588i;

    /* JADX INFO: renamed from: j */
    public final String f11589j;

    /* JADX INFO: renamed from: k */
    public final String f11590k;

    /* JADX INFO: renamed from: l */
    public final HashSet f11591l = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f11580a = str;
        this.f11581b = str2;
        this.f11582c = str3;
        this.f11583d = str4;
        this.f11584e = uri;
        this.f11585f = str5;
        this.f11586g = j;
        this.f11587h = str6;
        this.f11588i = arrayList;
        this.f11589j = str7;
        this.f11590k = str8;
    }

    /* JADX INFO: renamed from: r */
    public static GoogleSignInAccount m5270r(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        lda.m16127m(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f11585f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f11587h.equals(this.f11587h)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f11588i);
        hashSet.addAll(googleSignInAccount.f11591l);
        HashSet hashSet2 = new HashSet(this.f11588i);
        hashSet2.addAll(this.f11591l);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f11587h.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f11588i);
        hashSet.addAll(this.f11591l);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, this.f11580a);
        l70.m15930U(parcel, 3, this.f11581b);
        l70.m15930U(parcel, 4, this.f11582c);
        l70.m15930U(parcel, 5, this.f11583d);
        l70.m15929T(parcel, 6, this.f11584e, i);
        l70.m15930U(parcel, 7, this.f11585f);
        l70.m15935Z(parcel, 8, 8);
        parcel.writeLong(this.f11586g);
        l70.m15930U(parcel, 9, this.f11587h);
        l70.m15934Y(parcel, 10, this.f11588i);
        l70.m15930U(parcel, 11, this.f11589j);
        l70.m15930U(parcel, 12, this.f11590k);
        l70.m15939b0(parcel, iM15937a0);
    }
}
