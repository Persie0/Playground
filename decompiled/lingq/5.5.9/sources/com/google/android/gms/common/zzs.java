package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.AbstractBinderC6265e1;
import p176ib.C6262d1;
import p176ib.InterfaceC6269g0;
import p320pb.BinderC8215b;
import p320pb.InterfaceC8214a;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C2571w();

    /* JADX INFO: renamed from: a */
    public final String f14018a;

    /* JADX INFO: renamed from: b */
    public final AbstractBinderC2564p f14019b;

    /* JADX INFO: renamed from: c */
    public final boolean f14020c;

    /* JADX INFO: renamed from: d */
    public final boolean f14021d;

    public zzs(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f14018a = str;
        BinderC2565q binderC2565q = null;
        if (iBinder != null) {
            try {
                int i10 = AbstractBinderC6265e1.f36461a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                InterfaceC8214a interfaceC8214aMo7614a = (iInterfaceQueryLocalInterface instanceof InterfaceC6269g0 ? (InterfaceC6269g0) iInterfaceQueryLocalInterface : new C6262d1(iBinder)).mo7614a();
                byte[] bArr = interfaceC8214aMo7614a == null ? null : (byte[]) BinderC8215b.m16362h0(interfaceC8214aMo7614a);
                if (bArr != null) {
                    binderC2565q = new BinderC2565q(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f14019b = binderC2565q;
        this.f14020c = z10;
        this.f14021d = z11;
    }

    public zzs(String str, AbstractBinderC2564p abstractBinderC2564p, boolean z10, boolean z11) {
        this.f14018a = str;
        this.f14019b = abstractBinderC2564p;
        this.f14020c = z10;
        this.f14021d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3832n(parcel, 1, this.f14018a);
        AbstractBinderC2564p abstractBinderC2564p = this.f14019b;
        if (abstractBinderC2564p == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC2564p = null;
        }
        C0987y.m3828j(parcel, 2, abstractBinderC2564p);
        C0987y.m3826h(parcel, 3, this.f14020c);
        C0987y.m3826h(parcel, 4, this.f14021d);
        C0987y.m3839u(parcel, iM3836r);
    }
}
