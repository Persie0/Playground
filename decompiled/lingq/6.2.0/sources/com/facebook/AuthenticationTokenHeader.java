package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3386nv;
import p000.eda;
import p000.fa4;
import p000.hfb;
import p000.ux5;
import p000.yu0;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthenticationTokenHeader implements Parcelable {
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new hfb(4);

    /* JADX INFO: renamed from: a */
    public final String f11343a;

    /* JADX INFO: renamed from: b */
    public final String f11344b;

    /* JADX INFO: renamed from: c */
    public final String f11345c;

    public AuthenticationTokenHeader(String str) throws JSONException {
        str.getClass();
        eda.m11071d(str, "encodedHeaderString");
        byte[] bArrDecode = Base64.decode(str, 0);
        bArrDecode.getClass();
        Charset charset = yu0.f70463a;
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            String strOptString = jSONObject.optString("alg");
            strOptString.getClass();
            boolean z = strOptString.length() > 0 && strOptString.equals("RS256");
            String strOptString2 = jSONObject.optString("kid");
            strOptString2.getClass();
            boolean z2 = strOptString2.length() > 0;
            String strOptString3 = jSONObject.optString("typ");
            strOptString3.getClass();
            boolean z3 = strOptString3.length() > 0;
            if (z && z2 && z3) {
                byte[] bArrDecode2 = Base64.decode(str, 0);
                bArrDecode2.getClass();
                JSONObject jSONObject2 = new JSONObject(new String(bArrDecode2, charset));
                String string = jSONObject2.getString("alg");
                string.getClass();
                this.f11343a = string;
                String string2 = jSONObject2.getString("typ");
                string2.getClass();
                this.f11344b = string2;
                String string3 = jSONObject2.getString("kid");
                string3.getClass();
                this.f11345c = string3;
                return;
            }
        } catch (JSONException unused) {
        }
        C3386nv.m17626m("Invalid Header");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final String m5181a() {
        return this.f11345c;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m5182b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f11343a);
        jSONObject.put("typ", this.f11344b);
        jSONObject.put("kid", this.f11345c);
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
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return fa4.m11650l(this.f11343a, authenticationTokenHeader.f11343a) && fa4.m11650l(this.f11344b, authenticationTokenHeader.f11344b) && fa4.m11650l(this.f11345c, authenticationTokenHeader.f11345c);
    }

    public final int hashCode() {
        return this.f11345c.hashCode() + ux5.m22980c(ux5.m22980c(527, this.f11343a, 31), this.f11344b, 31);
    }

    public final String toString() {
        String string = m5182b().toString();
        string.getClass();
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11343a);
        parcel.writeString(this.f11344b);
        parcel.writeString(this.f11345c);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        String string = parcel.readString();
        eda.m11073f(string, "alg");
        this.f11343a = string;
        String string2 = parcel.readString();
        eda.m11073f(string2, "typ");
        this.f11344b = string2;
        String string3 = parcel.readString();
        eda.m11073f(string3, "kid");
        this.f11345c = string3;
    }
}
