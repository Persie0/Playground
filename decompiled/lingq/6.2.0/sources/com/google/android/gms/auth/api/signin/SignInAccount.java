package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.lda;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new y3a(19);

    /* JADX INFO: renamed from: a */
    public final String f11607a;

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount f11608b;

    /* JADX INFO: renamed from: c */
    public final String f11609c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f11608b = googleSignInAccount;
        lda.m16128n(str, "8.3 and 8.4 SDKs require non-null email");
        this.f11607a = str;
        lda.m16128n(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f11609c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 4, this.f11607a);
        l70.m15929T(parcel, 7, this.f11608b, i);
        l70.m15930U(parcel, 8, this.f11609c);
        l70.m15939b0(parcel, iM15937a0);
    }
}
