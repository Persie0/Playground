package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.AbstractBinderC3447p4;
import p000.cjd;
import p000.l70;
import p000.lx3;
import p000.x74;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new y3a(18);

    /* JADX INFO: renamed from: a */
    public final int f11737a;

    /* JADX INFO: renamed from: b */
    public final IBinder f11738b;

    /* JADX INFO: renamed from: c */
    public final ConnectionResult f11739c;

    /* JADX INFO: renamed from: d */
    public final boolean f11740d;

    /* JADX INFO: renamed from: e */
    public final boolean f11741e;

    public zay(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f11737a = i;
        this.f11738b = iBinder;
        this.f11739c = connectionResult;
        this.f11740d = z;
        this.f11741e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zay)) {
            return false;
        }
        zay zayVar = (zay) obj;
        return this.f11739c.equals(zayVar.f11739c) && x74.m24360q(m5289r(), zayVar.m5289r());
    }

    /* JADX INFO: renamed from: r */
    public final lx3 m5289r() {
        IBinder iBinder = this.f11738b;
        if (iBinder == null) {
            return null;
        }
        int i = AbstractBinderC3447p4.f55539g;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof lx3 ? (lx3) iInterfaceQueryLocalInterface : new cjd(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11737a);
        l70.m15927R(parcel, 2, this.f11738b);
        l70.m15929T(parcel, 3, this.f11739c, i);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11740d ? 1 : 0);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f11741e ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
