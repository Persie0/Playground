package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.lp6;
import p000.nbd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new nbd(0);

    /* JADX INFO: renamed from: a */
    public final String f11758a;

    /* JADX INFO: renamed from: b */
    public final boolean f11759b;

    /* JADX INFO: renamed from: c */
    public final boolean f11760c;

    /* JADX INFO: renamed from: d */
    public final Context f11761d;

    /* JADX INFO: renamed from: e */
    public final boolean f11762e;

    /* JADX INFO: renamed from: f */
    public final boolean f11763f;

    /* JADX INFO: renamed from: g */
    public final boolean f11764g;

    public zzp(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.f11758a = str;
        this.f11759b = z;
        this.f11760c = z2;
        this.f11761d = (Context) lp6.m16422I(lp6.m16421H(iBinder));
        this.f11762e = z3;
        this.f11763f = z4;
        this.f11764g = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f11758a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11759b ? 1 : 0);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11760c ? 1 : 0);
        l70.m15927R(parcel, 4, new lp6(this.f11761d));
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f11762e ? 1 : 0);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeInt(this.f11763f ? 1 : 0);
        l70.m15935Z(parcel, 8, 4);
        parcel.writeInt(this.f11764g ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
