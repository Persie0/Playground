package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new qmb(28);

    /* JADX INFO: renamed from: a */
    public final List f12404a;

    public zzoo(ArrayList arrayList) {
        this.f12404a = arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static zzoo m5954r(zzls... zzlsVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        List list = this.f12404a;
        if (list != null) {
            int iM15937a1 = l70.m15937a0(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            l70.m15939b0(parcel, iM15937a1);
        }
        l70.m15939b0(parcel, iM15937a0);
    }
}
