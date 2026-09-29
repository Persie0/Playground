package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import p000.C3670v2;
import p000.cpb;
import p000.l70;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbf> CREATOR = new C3670v2(17);

    /* JADX INFO: renamed from: a */
    public final Bundle f12388a;

    public zzbf(Bundle bundle) {
        this.f12388a = bundle;
    }

    /* JADX INFO: renamed from: J */
    public final Double m5950J() {
        return Double.valueOf(this.f12388a.getDouble("value"));
    }

    /* JADX INFO: renamed from: Z */
    public final String m5951Z() {
        return this.f12388a.getString("currency");
    }

    /* JADX INFO: renamed from: g0 */
    public final Bundle m5952g0() {
        return new Bundle(this.f12388a);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new cpb(this);
    }

    /* JADX INFO: renamed from: r */
    public final Object m5953r(String str) {
        return this.f12388a.get(str);
    }

    public final String toString() {
        return this.f12388a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15924O(parcel, 2, m5952g0());
        l70.m15939b0(parcel, iM15937a0);
    }
}
