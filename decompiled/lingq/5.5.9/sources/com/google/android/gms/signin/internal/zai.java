package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import ec.C5395h;

/* JADX INFO: loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C5395h();

    /* JADX INFO: renamed from: a */
    public final int f14655a;

    /* JADX INFO: renamed from: b */
    public final zat f14656b;

    public zai(int i10, zat zatVar) {
        this.f14655a = i10;
        this.f14656b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f14655a);
        C0987y.m3831m(parcel, 2, this.f14656b, i10);
        C0987y.m3839u(parcel, iM3836r);
    }
}
