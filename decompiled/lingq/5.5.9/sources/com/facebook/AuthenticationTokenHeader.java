package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.util.Base64;
import dm.C5207g;
import kotlin.Metadata;
import mo.C7653a;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5056a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcelable;", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class AuthenticationTokenHeader implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new C2269a();

    /* JADX INFO: renamed from: a */
    public final String f11409a;

    /* JADX INFO: renamed from: b */
    public final String f11410b;

    /* JADX INFO: renamed from: c */
    public final String f11411c;

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenHeader$a */
    public static final class C2269a implements Parcelable.Creator<AuthenticationTokenHeader> {
        @Override // android.os.Parcelable.Creator
        public final AuthenticationTokenHeader createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new AuthenticationTokenHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthenticationTokenHeader[] newArray(int i10) {
            return new AuthenticationTokenHeader[i10];
        }
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        C5207g.m11111f(parcel, "parcel");
        String string = parcel.readString();
        C5056a0.m10746d(string, "alg");
        this.f11409a = string;
        String string2 = parcel.readString();
        C5056a0.m10746d(string2, "typ");
        this.f11410b = string2;
        String string3 = parcel.readString();
        C5056a0.m10746d(string3, "kid");
        this.f11411c = string3;
    }

    public AuthenticationTokenHeader(String str) throws JSONException {
        boolean z10;
        C5207g.m11111f(str, "encodedHeaderString");
        C5056a0.m10744b(str, "encodedHeaderString");
        byte[] bArrDecode = Base64.decode(str, 0);
        C5207g.m11110e(bArrDecode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, C7653a.f42116b));
            String strOptString = jSONObject.optString("alg");
            C5207g.m11110e(strOptString, "alg");
            z10 = true;
            boolean z11 = (strOptString.length() > 0) && C5207g.m11106a(strOptString, "RS256");
            String strOptString2 = jSONObject.optString("kid");
            C5207g.m11110e(strOptString2, "jsonObj.optString(\"kid\")");
            boolean z12 = strOptString2.length() > 0;
            String strOptString3 = jSONObject.optString("typ");
            C5207g.m11110e(strOptString3, "jsonObj.optString(\"typ\")");
            boolean z13 = strOptString3.length() > 0;
            if (!z11 || !z12 || !z13) {
                z10 = false;
            }
        } catch (JSONException unused) {
        }
        if (!z10) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] bArrDecode2 = Base64.decode(str, 0);
        C5207g.m11110e(bArrDecode2, "decodedBytes");
        JSONObject jSONObject2 = new JSONObject(new String(bArrDecode2, C7653a.f42116b));
        String string = jSONObject2.getString("alg");
        C5207g.m11110e(string, "jsonObj.getString(\"alg\")");
        this.f11409a = string;
        String string2 = jSONObject2.getString("typ");
        C5207g.m11110e(string2, "jsonObj.getString(\"typ\")");
        this.f11410b = string2;
        String string3 = jSONObject2.getString("kid");
        C5207g.m11110e(string3, "jsonObj.getString(\"kid\")");
        this.f11411c = string3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return C5207g.m11106a(this.f11409a, authenticationTokenHeader.f11409a) && C5207g.m11106a(this.f11410b, authenticationTokenHeader.f11410b) && C5207g.m11106a(this.f11411c, authenticationTokenHeader.f11411c);
    }

    public final int hashCode() {
        return this.f11411c.hashCode() + C0166e.m758d(this.f11410b, C0166e.m758d(this.f11409a, 527, 31), 31);
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f11409a);
        jSONObject.put("typ", this.f11410b);
        jSONObject.put("kid", this.f11411c);
        String string = jSONObject.toString();
        C5207g.m11110e(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        parcel.writeString(this.f11409a);
        parcel.writeString(this.f11410b);
        parcel.writeString(this.f11411c);
    }
}
