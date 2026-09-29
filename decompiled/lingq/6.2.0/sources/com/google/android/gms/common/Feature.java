package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000.C3670v2;
import p000.l70;
import p000.x74;
import p000.y12;

/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C3670v2(16);

    /* JADX INFO: renamed from: a */
    public final String f11641a;

    /* JADX INFO: renamed from: b */
    public final int f11642b;

    /* JADX INFO: renamed from: c */
    public final long f11643c;

    /* JADX INFO: renamed from: d */
    public final boolean f11644d;

    public Feature(int i, long j, String str, boolean z) {
        this.f11641a = str;
        this.f11642b = i;
        this.f11643c = j;
        this.f11644d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (x74.m24360q(this.f11641a, feature.f11641a) && m5279r() == feature.m5279r() && this.f11644d == feature.f11644d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11641a, Long.valueOf(m5279r()), Boolean.valueOf(this.f11644d)});
    }

    /* JADX INFO: renamed from: r */
    public final long m5279r() {
        long j = this.f11643c;
        return j == -1 ? this.f11642b : j;
    }

    public final String toString() {
        y12 y12Var = new y12(this);
        y12Var.m24830a(this.f11641a, "name");
        y12Var.m24830a(Long.valueOf(m5279r()), "version");
        y12Var.m24830a(Boolean.valueOf(this.f11644d), "is_fully_rolled_out");
        return y12Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f11641a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11642b);
        long jM5279r = m5279r();
        l70.m15935Z(parcel, 3, 8);
        parcel.writeLong(jM5279r);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11644d ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }

    public Feature(String str, long j) {
        this(-1, j, str, false);
    }
}
