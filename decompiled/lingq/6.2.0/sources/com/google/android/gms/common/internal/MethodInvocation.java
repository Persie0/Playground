package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.C3670v2;
import p000.l70;

/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C3670v2(13);

    /* JADX INFO: renamed from: a */
    public final int f11712a;

    /* JADX INFO: renamed from: b */
    public final int f11713b;

    /* JADX INFO: renamed from: c */
    public final int f11714c;

    /* JADX INFO: renamed from: d */
    public final long f11715d;

    /* JADX INFO: renamed from: e */
    public final long f11716e;

    /* JADX INFO: renamed from: f */
    public final String f11717f;

    /* JADX INFO: renamed from: g */
    public final String f11718g;

    /* JADX INFO: renamed from: h */
    public final int f11719h;

    /* JADX INFO: renamed from: i */
    public final int f11720i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f11712a = i;
        this.f11713b = i2;
        this.f11714c = i3;
        this.f11715d = j;
        this.f11716e = j2;
        this.f11717f = str;
        this.f11718g = str2;
        this.f11719h = i4;
        this.f11720i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11712a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11713b);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11714c);
        l70.m15935Z(parcel, 4, 8);
        parcel.writeLong(this.f11715d);
        l70.m15935Z(parcel, 5, 8);
        parcel.writeLong(this.f11716e);
        l70.m15930U(parcel, 6, this.f11717f);
        l70.m15930U(parcel, 7, this.f11718g);
        l70.m15935Z(parcel, 8, 4);
        parcel.writeInt(this.f11719h);
        l70.m15935Z(parcel, 9, 4);
        parcel.writeInt(this.f11720i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
