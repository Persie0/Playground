package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C2921z0();

    /* JADX INFO: renamed from: a */
    public final long f14529a;

    /* JADX INFO: renamed from: b */
    public final long f14530b;

    /* JADX INFO: renamed from: c */
    public final boolean f14531c;

    /* JADX INFO: renamed from: d */
    public final String f14532d;

    /* JADX INFO: renamed from: e */
    public final String f14533e;

    /* JADX INFO: renamed from: f */
    public final String f14534f;

    /* JADX INFO: renamed from: g */
    public final Bundle f14535g;

    /* JADX INFO: renamed from: h */
    public final String f14536h;

    public zzcl(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f14529a = j10;
        this.f14530b = j11;
        this.f14531c = z10;
        this.f14532d = str;
        this.f14533e = str2;
        this.f14534f = str3;
        this.f14535g = bundle;
        this.f14536h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3830l(parcel, 1, this.f14529a);
        C0987y.m3830l(parcel, 2, this.f14530b);
        C0987y.m3826h(parcel, 3, this.f14531c);
        C0987y.m3832n(parcel, 4, this.f14532d);
        C0987y.m3832n(parcel, 5, this.f14533e);
        C0987y.m3832n(parcel, 6, this.f14534f);
        C0987y.m3827i(parcel, 7, this.f14535g);
        C0987y.m3832n(parcel, 8, this.f14536h);
        C0987y.m3839u(parcel, iM3836r);
    }
}
