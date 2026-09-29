package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6261d0;

/* JADX INFO: loaded from: classes.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C6261d0();

    /* JADX INFO: renamed from: a */
    public final int f13980a;

    /* JADX INFO: renamed from: b */
    public final int f13981b;

    /* JADX INFO: renamed from: c */
    public final int f13982c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public final Scope[] f13983d;

    public zax(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f13980a = i10;
        this.f13981b = i11;
        this.f13982c = i12;
        this.f13983d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13980a);
        C0987y.m3829k(parcel, 2, this.f13981b);
        C0987y.m3829k(parcel, 3, this.f13982c);
        C0987y.m3833o(parcel, 4, this.f13983d, i10);
        C0987y.m3839u(parcel, iM3836r);
    }
}
