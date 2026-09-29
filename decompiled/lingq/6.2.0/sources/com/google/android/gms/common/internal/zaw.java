package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaw> CREATOR = new y3a(17);

    /* JADX INFO: renamed from: a */
    public final int f11733a;

    /* JADX INFO: renamed from: b */
    public final Account f11734b;

    /* JADX INFO: renamed from: c */
    public final int f11735c;

    /* JADX INFO: renamed from: d */
    public final GoogleSignInAccount f11736d;

    public zaw(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f11733a = i;
        this.f11734b = account;
        this.f11735c = i2;
        this.f11736d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11733a);
        l70.m15929T(parcel, 2, this.f11734b, i);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11735c);
        l70.m15929T(parcel, 4, this.f11736d, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
