package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p046cb.C1765g;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C1765g();

    /* JADX INFO: renamed from: a */
    @Deprecated
    public final String f13839a;

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount f13840b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final String f13841c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f13840b = googleSignInAccount;
        C6272i.m12913g("8.3 and 8.4 SDKs require non-null email", str);
        this.f13839a = str;
        C6272i.m12913g("8.3 and 8.4 SDKs require non-null userId", str2);
        this.f13841c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3832n(parcel, 4, this.f13839a);
        C0987y.m3831m(parcel, 7, this.f13840b, i10);
        C0987y.m3832n(parcel, 8, this.f13841c);
        C0987y.m3839u(parcel, iM3836r);
    }
}
