package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6283n0;

/* JADX INFO: loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C6283n0();

    /* JADX INFO: renamed from: a */
    public final int f13962a;

    /* JADX INFO: renamed from: b */
    public final boolean f13963b;

    /* JADX INFO: renamed from: c */
    public final boolean f13964c;

    /* JADX INFO: renamed from: d */
    public final int f13965d;

    /* JADX INFO: renamed from: e */
    public final int f13966e;

    public RootTelemetryConfiguration(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f13962a = i10;
        this.f13963b = z10;
        this.f13964c = z11;
        this.f13965d = i11;
        this.f13966e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13962a);
        C0987y.m3826h(parcel, 2, this.f13963b);
        C0987y.m3826h(parcel, 3, this.f13964c);
        C0987y.m3829k(parcel, 4, this.f13965d);
        C0987y.m3829k(parcel, 5, this.f13966e);
        C0987y.m3839u(parcel, iM3836r);
    }
}
