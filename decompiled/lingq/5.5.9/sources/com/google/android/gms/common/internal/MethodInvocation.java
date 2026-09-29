package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6306z;

/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C6306z();

    /* JADX INFO: renamed from: a */
    public final int f13953a;

    /* JADX INFO: renamed from: b */
    public final int f13954b;

    /* JADX INFO: renamed from: c */
    public final int f13955c;

    /* JADX INFO: renamed from: d */
    public final long f13956d;

    /* JADX INFO: renamed from: e */
    public final long f13957e;

    /* JADX INFO: renamed from: f */
    public final String f13958f;

    /* JADX INFO: renamed from: g */
    public final String f13959g;

    /* JADX INFO: renamed from: h */
    public final int f13960h;

    /* JADX INFO: renamed from: i */
    public final int f13961i;

    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f13953a = i10;
        this.f13954b = i11;
        this.f13955c = i12;
        this.f13956d = j10;
        this.f13957e = j11;
        this.f13958f = str;
        this.f13959g = str2;
        this.f13960h = i13;
        this.f13961i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13953a);
        C0987y.m3829k(parcel, 2, this.f13954b);
        C0987y.m3829k(parcel, 3, this.f13955c);
        C0987y.m3830l(parcel, 4, this.f13956d);
        C0987y.m3830l(parcel, 5, this.f13957e);
        C0987y.m3832n(parcel, 6, this.f13958f);
        C0987y.m3832n(parcel, 7, this.f13959g);
        C0987y.m3829k(parcel, 8, this.f13960h);
        C0987y.m3829k(parcel, 9, this.f13961i);
        C0987y.m3839u(parcel, iM3836r);
    }
}
