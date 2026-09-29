package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new y3a(3);

    /* JADX INFO: renamed from: a */
    public final int f11610a;

    /* JADX INFO: renamed from: b */
    public final int f11611b;

    /* JADX INFO: renamed from: c */
    public final Bundle f11612c;

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f11610a = i;
        this.f11611b = i2;
        this.f11612c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11610a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11611b);
        l70.m15924O(parcel, 3, this.f11612c);
        l70.m15939b0(parcel, iM15937a0);
    }
}
