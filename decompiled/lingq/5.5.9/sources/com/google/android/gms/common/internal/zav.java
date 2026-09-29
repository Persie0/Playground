package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6258c0;
import p176ib.C6268g;

/* JADX INFO: loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C6258c0();

    /* JADX INFO: renamed from: a */
    public final int f13975a;

    /* JADX INFO: renamed from: b */
    public final IBinder f13976b;

    /* JADX INFO: renamed from: c */
    public final ConnectionResult f13977c;

    /* JADX INFO: renamed from: d */
    public final boolean f13978d;

    /* JADX INFO: renamed from: e */
    public final boolean f13979e;

    public zav(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f13975a = i10;
        this.f13976b = iBinder;
        this.f13977c = connectionResult;
        this.f13978d = z10;
        this.f13979e = z11;
    }

    public final boolean equals(Object obj) {
        Object c2557c;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (this.f13977c.equals(zavVar.f13977c)) {
            Object c2557c2 = null;
            IBinder iBinder = this.f13976b;
            if (iBinder == null) {
                c2557c = null;
            } else {
                int i10 = InterfaceC2556b.a.f13970a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c2557c = iInterfaceQueryLocalInterface instanceof InterfaceC2556b ? (InterfaceC2556b) iInterfaceQueryLocalInterface : new C2557c(iBinder);
            }
            IBinder iBinder2 = zavVar.f13976b;
            if (iBinder2 != null) {
                int i11 = InterfaceC2556b.a.f13970a;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c2557c2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC2556b ? (InterfaceC2556b) iInterfaceQueryLocalInterface2 : new C2557c(iBinder2);
            }
            if (C6268g.m12905a(c2557c, c2557c2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13975a);
        C0987y.m3828j(parcel, 2, this.f13976b);
        C0987y.m3831m(parcel, 3, this.f13977c, i10);
        C0987y.m3826h(parcel, 4, this.f13978d);
        C0987y.m3826h(parcel, 5, this.f13979e);
        C0987y.m3839u(parcel, iM3836r);
    }
}
