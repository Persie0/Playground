package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjs> CREATOR = new qmb(18);

    /* JADX INFO: renamed from: a */
    public final List f11917a;

    public zzjs(ArrayList arrayList) {
        this.f11917a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjs) {
            return this.f11917a.equals(((zzjs) obj).f11917a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (zzjq zzjqVar : this.f11917a) {
            if (!z) {
                sb.append(", ");
            }
            zzjqVar.m5445r(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15934Y(parcel, 2, this.f11917a);
        l70.m15939b0(parcel, iM15937a0);
    }
}
