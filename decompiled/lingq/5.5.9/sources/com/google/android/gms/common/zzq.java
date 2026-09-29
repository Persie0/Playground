package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C2570v();

    /* JADX INFO: renamed from: a */
    public final boolean f14014a;

    /* JADX INFO: renamed from: b */
    public final String f14015b;

    /* JADX INFO: renamed from: c */
    public final int f14016c;

    /* JADX INFO: renamed from: d */
    public final int f14017d;

    public zzq(int i10, int i11, String str, boolean z10) {
        this.f14014a = z10;
        this.f14015b = str;
        this.f14016c = C8573r0.m16743n1(i10) - 1;
        this.f14017d = C0987y.m3835q(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3826h(parcel, 1, this.f14014a);
        C0987y.m3832n(parcel, 2, this.f14015b);
        C0987y.m3829k(parcel, 3, this.f14016c);
        C0987y.m3829k(parcel, 4, this.f14017d);
        C0987y.m3839u(parcel, iM3836r);
    }
}
