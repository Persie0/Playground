package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.by3;
import p000.cld;
import p000.fnc;
import p000.imd;
import p000.l70;
import p000.lp6;
import p000.nbd;
import p000.src;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new nbd(5);

    /* JADX INFO: renamed from: a */
    public final String f11770a;

    /* JADX INFO: renamed from: b */
    public final src f11771b;

    /* JADX INFO: renamed from: c */
    public final boolean f11772c;

    /* JADX INFO: renamed from: d */
    public final boolean f11773d;

    public zzt(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f11770a = str;
        src srcVar = null;
        if (iBinder != null) {
            try {
                int i = fnc.f39354h;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                by3 by3VarMo4847e = (iInterfaceQueryLocalInterface instanceof imd ? (imd) iInterfaceQueryLocalInterface : new cld(iBinder, "com.google.android.gms.common.internal.ICertData", 3)).mo4847e();
                byte[] bArr = by3VarMo4847e == null ? null : (byte[]) lp6.m16422I(by3VarMo4847e);
                if (bArr != null) {
                    srcVar = new src(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f11771b = srcVar;
        this.f11772c = z;
        this.f11773d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f11770a);
        src srcVar = this.f11771b;
        if (srcVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            srcVar = null;
        }
        l70.m15927R(parcel, 2, srcVar);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11772c ? 1 : 0);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11773d ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }

    public zzt(String str, src srcVar, boolean z, boolean z2) {
        this.f11770a = str;
        this.f11771b = srcVar;
        this.f11772c = z;
        this.f11773d = z2;
    }
}
