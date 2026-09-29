package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ec.C5389b;
import gb.InterfaceC5740d;

/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements InterfaceC5740d {
    public static final Parcelable.Creator<zaa> CREATOR = new C5389b();

    /* JADX INFO: renamed from: a */
    public final int f14650a;

    /* JADX INFO: renamed from: b */
    public final int f14651b;

    /* JADX INFO: renamed from: c */
    public final Intent f14652c;

    public zaa() {
        this(2, 0, null);
    }

    public zaa(int i10, int i11, Intent intent) {
        this.f14650a = i10;
        this.f14651b = i11;
        this.f14652c = intent;
    }

    @Override // gb.InterfaceC5740d
    /* JADX INFO: renamed from: m */
    public final Status mo5489m() {
        return this.f14651b == 0 ? Status.f13873f : Status.f13877j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f14650a);
        C0987y.m3829k(parcel, 2, this.f14651b);
        C0987y.m3831m(parcel, 3, this.f14652c, i10);
        C0987y.m3839u(parcel, iM3836r);
    }
}
