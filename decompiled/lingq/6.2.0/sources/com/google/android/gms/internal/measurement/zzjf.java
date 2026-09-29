package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import p000.ked;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjf extends AbstractSafeParcelable implements Comparable<zzjf> {
    public static final Parcelable.Creator<zzjf> CREATOR = new qmb(12);

    /* JADX INFO: renamed from: a */
    public final int f11882a;

    /* JADX INFO: renamed from: b */
    public final zzjo[] f11883b;

    /* JADX INFO: renamed from: c */
    public final String[] f11884c;

    /* JADX INFO: renamed from: d */
    public final TreeMap f11885d = new TreeMap();

    public zzjf(int i, zzjo[] zzjoVarArr, String[] strArr) {
        this.f11882a = i;
        this.f11883b = zzjoVarArr;
        for (zzjo zzjoVar : zzjoVarArr) {
            this.f11885d.put(zzjoVar.f11904a, zzjoVar);
        }
        this.f11884c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzjf zzjfVar) {
        return this.f11882a - zzjfVar.f11882a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjf)) {
            return false;
        }
        zzjf zzjfVar = (zzjf) obj;
        return this.f11882a == zzjfVar.f11882a && ked.m15166d(this.f11885d, zzjfVar.f11885d) && Arrays.equals(this.f11884c, zzjfVar.f11884c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f11882a);
        sb.append(", (");
        Iterator it = this.f11885d.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjo) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f11884c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11882a);
        l70.m15933X(parcel, 3, this.f11883b, i);
        l70.m15931V(parcel, 4, this.f11884c);
        l70.m15939b0(parcel, iM15937a0);
    }
}
