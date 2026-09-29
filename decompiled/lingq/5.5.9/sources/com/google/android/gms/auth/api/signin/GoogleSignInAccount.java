package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p046cb.C1762d;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1762d();

    /* JADX INFO: renamed from: H */
    public final HashSet f13799H = new HashSet();

    /* JADX INFO: renamed from: a */
    public final int f13800a;

    /* JADX INFO: renamed from: b */
    public final String f13801b;

    /* JADX INFO: renamed from: c */
    public final String f13802c;

    /* JADX INFO: renamed from: d */
    public final String f13803d;

    /* JADX INFO: renamed from: e */
    public final String f13804e;

    /* JADX INFO: renamed from: f */
    public final Uri f13805f;

    /* JADX INFO: renamed from: g */
    public String f13806g;

    /* JADX INFO: renamed from: h */
    public final long f13807h;

    /* JADX INFO: renamed from: i */
    public final String f13808i;

    /* JADX INFO: renamed from: j */
    public final List<Scope> f13809j;

    /* JADX INFO: renamed from: k */
    public final String f13810k;

    /* JADX INFO: renamed from: l */
    public final String f13811l;

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f13800a = i10;
        this.f13801b = str;
        this.f13802c = str2;
        this.f13803d = str3;
        this.f13804e = str4;
        this.f13805f = uri;
        this.f13806g = str5;
        this.f13807h = j10;
        this.f13808i = str6;
        this.f13809j = arrayList;
        this.f13810k = str7;
        this.f13811l = str8;
    }

    /* JADX INFO: renamed from: C */
    public static GoogleSignInAccount m7520C(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10), 1));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long lValueOf = Long.valueOf(j10);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long jLongValue = lValueOf.longValue();
        C6272i.m12912f(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, jLongValue, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f13806g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        return googleSignInAccount.f13808i.equals(this.f13808i) && googleSignInAccount.m7521q().equals(m7521q());
    }

    public final int hashCode() {
        return m7521q().hashCode() + C0166e.m758d(this.f13808i, 527, 31);
    }

    /* JADX INFO: renamed from: q */
    public final HashSet m7521q() {
        HashSet hashSet = new HashSet(this.f13809j);
        hashSet.addAll(this.f13799H);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13800a);
        C0987y.m3832n(parcel, 2, this.f13801b);
        C0987y.m3832n(parcel, 3, this.f13802c);
        C0987y.m3832n(parcel, 4, this.f13803d);
        C0987y.m3832n(parcel, 5, this.f13804e);
        C0987y.m3831m(parcel, 6, this.f13805f, i10);
        C0987y.m3832n(parcel, 7, this.f13806g);
        C0987y.m3830l(parcel, 8, this.f13807h);
        C0987y.m3832n(parcel, 9, this.f13808i);
        C0987y.m3834p(parcel, 10, this.f13809j);
        C0987y.m3832n(parcel, 11, this.f13810k);
        C0987y.m3832n(parcel, 12, this.f13811l);
        C0987y.m3839u(parcel, iM3836r);
    }
}
