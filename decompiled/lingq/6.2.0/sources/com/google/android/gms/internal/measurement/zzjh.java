package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import p000.ked;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjh> CREATOR = new qmb(13);

    /* JADX INFO: renamed from: a */
    public final String f11886a;

    /* JADX INFO: renamed from: b */
    public final byte[] f11887b;

    /* JADX INFO: renamed from: c */
    public final String f11888c;

    /* JADX INFO: renamed from: d */
    public final zzjf[] f11889d;

    /* JADX INFO: renamed from: e */
    public final TreeMap f11890e = new TreeMap();

    /* JADX INFO: renamed from: f */
    public final boolean f11891f;

    /* JADX INFO: renamed from: g */
    public final long f11892g;

    public zzjh(String str, String str2, zzjf[] zzjfVarArr, boolean z, byte[] bArr, long j) {
        this.f11886a = str;
        this.f11888c = str2;
        this.f11889d = zzjfVarArr;
        this.f11891f = z;
        this.f11887b = bArr;
        this.f11892g = j;
        for (zzjf zzjfVar : zzjfVarArr) {
            this.f11890e.put(Integer.valueOf(zzjfVar.f11882a), zzjfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjh)) {
            return false;
        }
        zzjh zzjhVar = (zzjh) obj;
        return ked.m15166d(this.f11886a, zzjhVar.f11886a) && ked.m15166d(this.f11888c, zzjhVar.f11888c) && this.f11890e.equals(zzjhVar.f11890e) && this.f11891f == zzjhVar.f11891f && Arrays.equals(this.f11887b, zzjhVar.f11887b) && this.f11892g == zzjhVar.f11892g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11886a, this.f11888c, this.f11890e, Boolean.valueOf(this.f11891f), this.f11887b, Long.valueOf(this.f11892g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f11886a);
        sb.append("', '");
        sb.append(this.f11888c);
        sb.append("', (");
        Iterator it = this.f11890e.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjf) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f11891f);
        sb.append(", ");
        byte[] bArr = this.f11887b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.f11892g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, this.f11886a);
        l70.m15930U(parcel, 3, this.f11888c);
        l70.m15933X(parcel, 4, this.f11889d, i);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f11891f ? 1 : 0);
        l70.m15925P(parcel, 6, this.f11887b);
        l70.m15935Z(parcel, 7, 8);
        parcel.writeLong(this.f11892g);
        l70.m15939b0(parcel, iM15937a0);
    }
}
