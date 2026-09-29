package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p320pb.BinderC8215b;
import p320pb.InterfaceC8214a;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C2569u();

    /* JADX INFO: renamed from: a */
    public final String f14008a;

    /* JADX INFO: renamed from: b */
    public final boolean f14009b;

    /* JADX INFO: renamed from: c */
    public final boolean f14010c;

    /* JADX INFO: renamed from: d */
    public final Context f14011d;

    /* JADX INFO: renamed from: e */
    public final boolean f14012e;

    /* JADX INFO: renamed from: f */
    public final boolean f14013f;

    public zzo(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f14008a = str;
        this.f14009b = z10;
        this.f14010c = z11;
        this.f14011d = (Context) BinderC8215b.m16362h0(InterfaceC8214a.a.m16361j(iBinder));
        this.f14012e = z12;
        this.f14013f = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3832n(parcel, 1, this.f14008a);
        C0987y.m3826h(parcel, 2, this.f14009b);
        C0987y.m3826h(parcel, 3, this.f14010c);
        C0987y.m3828j(parcel, 4, new BinderC8215b(this.f14011d));
        C0987y.m3826h(parcel, 5, this.f14012e);
        C0987y.m3826h(parcel, 6, this.f14013f);
        C0987y.m3839u(parcel, iM3836r);
    }
}
