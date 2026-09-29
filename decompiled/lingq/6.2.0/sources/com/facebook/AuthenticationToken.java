package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONObject;
import p000.C3386nv;
import p000.eda;
import p000.fa4;
import p000.hfb;
import p000.ux5;
import p000.vk9;
import p000.xq6;

/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationToken implements Parcelable {
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new hfb(2);

    /* JADX INFO: renamed from: a */
    public final String f11318a;

    /* JADX INFO: renamed from: b */
    public final String f11319b;

    /* JADX INFO: renamed from: c */
    public final AuthenticationTokenHeader f11320c;

    /* JADX INFO: renamed from: d */
    public final AuthenticationTokenClaims f11321d;

    /* JADX INFO: renamed from: e */
    public final String f11322e;

    public AuthenticationToken(String str, String str2) {
        str2.getClass();
        eda.m11071d(str, "token");
        eda.m11071d(str2, "expectedNonce");
        boolean zM24649f = false;
        List listM23365A0 = vk9.m23365A0(str, new String[]{"."}, 0, 6);
        if (listM23365A0.size() != 3) {
            C3386nv.m17626m("Invalid IdToken string");
            throw null;
        }
        String str3 = (String) listM23365A0.get(0);
        String str4 = (String) listM23365A0.get(1);
        String str5 = (String) listM23365A0.get(2);
        this.f11318a = str;
        this.f11319b = str2;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
        this.f11320c = authenticationTokenHeader;
        this.f11321d = new AuthenticationTokenClaims(str4, str2);
        try {
            String strM24646c = xq6.m24646c(authenticationTokenHeader.m5181a());
            if (strM24646c != null) {
                zM24649f = xq6.m24649f(xq6.m24645b(strM24646c), str3 + '.' + str4, str5);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (zM24649f) {
            this.f11322e = str5;
        } else {
            C3386nv.m17626m("Invalid Signature");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m5179a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f11318a);
        jSONObject.put("expected_nonce", this.f11319b);
        jSONObject.put("header", this.f11320c.m5182b());
        jSONObject.put("claims", this.f11321d.m5180a());
        jSONObject.put("signature", this.f11322e);
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
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return fa4.m11650l(this.f11318a, authenticationToken.f11318a) && fa4.m11650l(this.f11319b, authenticationToken.f11319b) && fa4.m11650l(this.f11320c, authenticationToken.f11320c) && fa4.m11650l(this.f11321d, authenticationToken.f11321d) && fa4.m11650l(this.f11322e, authenticationToken.f11322e);
    }

    public final int hashCode() {
        return this.f11322e.hashCode() + ((this.f11321d.hashCode() + ((this.f11320c.hashCode() + ux5.m22980c(ux5.m22980c(527, this.f11318a, 31), this.f11319b, 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11318a);
        parcel.writeString(this.f11319b);
        parcel.writeParcelable(this.f11320c, i);
        parcel.writeParcelable(this.f11321d, i);
        parcel.writeString(this.f11322e);
    }

    public AuthenticationToken(Parcel parcel) {
        String string = parcel.readString();
        eda.m11073f(string, "token");
        this.f11318a = string;
        String string2 = parcel.readString();
        eda.m11073f(string2, "expectedNonce");
        this.f11319b = string2;
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable != null) {
            this.f11320c = (AuthenticationTokenHeader) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (parcelable2 != null) {
                this.f11321d = (AuthenticationTokenClaims) parcelable2;
                String string3 = parcel.readString();
                eda.m11073f(string3, "signature");
                this.f11322e = string3;
                return;
            }
            C3386nv.m17633t("Required value was null.");
            throw null;
        }
        C3386nv.m17633t("Required value was null.");
        throw null;
    }
}
