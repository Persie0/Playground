package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import cc.C1910q;
import cc.C1919r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new C1919r();

    /* JADX INFO: renamed from: a */
    public final Bundle f14612a;

    public zzau(Bundle bundle) {
        this.f14612a = bundle;
    }

    /* JADX INFO: renamed from: C */
    public final Double m8534C() {
        return Double.valueOf(this.f14612a.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C1910q(this);
    }

    /* JADX INFO: renamed from: q */
    public final Bundle m8535q() {
        return new Bundle(this.f14612a);
    }

    public final String toString() {
        return this.f14612a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3827i(parcel, 2, m8535q());
        C0987y.m3839u(parcel, iM3836r);
    }
}
