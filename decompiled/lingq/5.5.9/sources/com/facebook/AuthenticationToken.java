package com.facebook;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C7076b;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5056a0;
import p067d8.C5086z;
import p260m8.C7499b;
import p291o7.C7997g;
import p291o7.C8004n;
import p498y3.C10289a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", "b", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class AuthenticationToken implements Parcelable {
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new C2265a();

    /* JADX INFO: renamed from: a */
    public final String f11384a;

    /* JADX INFO: renamed from: b */
    public final String f11385b;

    /* JADX INFO: renamed from: c */
    public final AuthenticationTokenHeader f11386c;

    /* JADX INFO: renamed from: d */
    public final AuthenticationTokenClaims f11387d;

    /* JADX INFO: renamed from: e */
    public final String f11388e;

    /* JADX INFO: renamed from: com.facebook.AuthenticationToken$a */
    public static final class C2265a implements Parcelable.Creator<AuthenticationToken> {
        @Override // android.os.Parcelable.Creator
        public final AuthenticationToken createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new AuthenticationToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthenticationToken[] newArray(int i10) {
            return new AuthenticationToken[i10];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationToken$b */
    public static final class C2266b {
        /* JADX INFO: renamed from: a */
        public static void m6598a(AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.C2270a c2270a = AuthenticationTokenManager.f11412d;
            AuthenticationTokenManager authenticationTokenManager = AuthenticationTokenManager.f11413e;
            if (authenticationTokenManager == null) {
                synchronized (c2270a) {
                    try {
                        authenticationTokenManager = AuthenticationTokenManager.f11413e;
                        if (authenticationTokenManager == null) {
                            C10289a c10289aM19281a = C10289a.m19281a(C8004n.m15871a());
                            C5207g.m11110e(c10289aM19281a, "getInstance(applicationContext)");
                            AuthenticationTokenManager authenticationTokenManager2 = new AuthenticationTokenManager(c10289aM19281a, new C7997g());
                            AuthenticationTokenManager.f11413e = authenticationTokenManager2;
                            authenticationTokenManager = authenticationTokenManager2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            AuthenticationToken authenticationToken2 = authenticationTokenManager.f11416c;
            authenticationTokenManager.f11416c = authenticationToken;
            C7997g c7997g = authenticationTokenManager.f11415b;
            if (authenticationToken != null) {
                c7997g.getClass();
                try {
                    c7997g.f43534a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.m6597a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                c7997g.f43534a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
                C5086z c5086z = C5086z.f33015a;
                C5086z.m10819d(C8004n.m15871a());
            }
            if (!C5086z.m10816a(authenticationToken2, authenticationToken)) {
                Intent intent = new Intent(C8004n.m15871a(), (Class<?>) AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
                intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken2);
                intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
                authenticationTokenManager.f11414a.m19283c(intent);
            }
        }
    }

    public AuthenticationToken(Parcel parcel) {
        C5207g.m11111f(parcel, "parcel");
        String string = parcel.readString();
        C5056a0.m10746d(string, "token");
        this.f11384a = string;
        String string2 = parcel.readString();
        C5056a0.m10746d(string2, "expectedNonce");
        this.f11385b = string2;
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f11386c = (AuthenticationTokenHeader) parcelable;
        Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
        if (parcelable2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f11387d = (AuthenticationTokenClaims) parcelable2;
        String string3 = parcel.readString();
        C5056a0.m10746d(string3, "signature");
        this.f11388e = string3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AuthenticationToken(String str, String str2) {
        C5207g.m11111f(str2, "expectedNonce");
        C5056a0.m10744b(str, "token");
        C5056a0.m10744b(str2, "expectedNonce");
        boolean zM14909I0 = false;
        List listM14299s3 = C7076b.m14299s3(str, new String[]{"."}, zM14909I0 ? 1 : 0, 6);
        if ((listM14299s3.size() == 3 ? 1 : zM14909I0 ? 1 : 0) == 0) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str3 = (String) listM14299s3.get(zM14909I0 ? 1 : 0);
        String str4 = (String) listM14299s3.get(1);
        String str5 = (String) listM14299s3.get(2);
        this.f11384a = str;
        this.f11385b = str2;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
        this.f11386c = authenticationTokenHeader;
        this.f11387d = new AuthenticationTokenClaims(str4, str2);
        try {
            String strM14915M = C7499b.m14915M(authenticationTokenHeader.f11411c);
            if (strM14915M != null) {
                zM14909I0 = C7499b.m14909I0(C7499b.m14912K(strM14915M), str3 + '.' + str4, str5);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (!zM14909I0) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.f11388e = str5;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m6597a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f11384a);
        jSONObject.put("expected_nonce", this.f11385b);
        AuthenticationTokenHeader authenticationTokenHeader = this.f11386c;
        authenticationTokenHeader.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", authenticationTokenHeader.f11409a);
        jSONObject2.put("typ", authenticationTokenHeader.f11410b);
        jSONObject2.put("kid", authenticationTokenHeader.f11411c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.f11387d.m6599a());
        jSONObject.put("signature", this.f11388e);
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
        return C5207g.m11106a(this.f11384a, authenticationToken.f11384a) && C5207g.m11106a(this.f11385b, authenticationToken.f11385b) && C5207g.m11106a(this.f11386c, authenticationToken.f11386c) && C5207g.m11106a(this.f11387d, authenticationToken.f11387d) && C5207g.m11106a(this.f11388e, authenticationToken.f11388e);
    }

    public final int hashCode() {
        return this.f11388e.hashCode() + ((this.f11387d.hashCode() + ((this.f11386c.hashCode() + C0166e.m758d(this.f11385b, C0166e.m758d(this.f11384a, 527, 31), 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        parcel.writeString(this.f11384a);
        parcel.writeString(this.f11385b);
        parcel.writeParcelable(this.f11386c, i10);
        parcel.writeParcelable(this.f11387d, i10);
        parcel.writeString(this.f11388e);
    }
}
