package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;
import p000.jie;
import p000.jij;
import p000.jiy;
import p000.mpw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FRDProductSpecificDataEntry extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jie(8);

    /* JADX INFO: renamed from: a */
    final int f7703a;

    /* JADX INFO: renamed from: b */
    final int f7704b;

    /* JADX INFO: renamed from: c */
    final List f7705c;

    /* JADX INFO: renamed from: d */
    final List f7706d;

    /* JADX INFO: renamed from: e */
    final List f7707e;

    /* JADX INFO: renamed from: f */
    final List f7708f;

    /* JADX INFO: renamed from: g */
    final byte[][] f7709g;

    /* JADX INFO: renamed from: h */
    final Boolean f7710h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.f7703a = i;
        this.f7704b = i2;
        this.f7705c = list;
        this.f7706d = list2;
        this.f7707e = list3;
        this.f7708f = list4;
        this.f7709g = bArr;
        this.f7710h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        return this.f7703a == fRDProductSpecificDataEntry.f7703a && this.f7704b == fRDProductSpecificDataEntry.f7704b && mpw.m16768g(this.f7705c, fRDProductSpecificDataEntry.f7705c) && mpw.m16768g(this.f7706d, fRDProductSpecificDataEntry.f7706d) && mpw.m16768g(this.f7707e, fRDProductSpecificDataEntry.f7707e) && mpw.m16768g(this.f7708f, fRDProductSpecificDataEntry.f7708f) && Arrays.equals(this.f7709g, fRDProductSpecificDataEntry.f7709g) && mpw.m16768g(this.f7710h, fRDProductSpecificDataEntry.f7710h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7703a), Integer.valueOf(this.f7704b), this.f7705c, this.f7706d, this.f7707e, this.f7708f, Integer.valueOf(Arrays.deepHashCode(this.f7709g)), this.f7710h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f7703a);
        jiy.m13287n(parcel, 3, this.f7704b);
        jiy.m13298y(parcel, 4, this.f7705c);
        jiy.m13294u(parcel, 5, this.f7706d);
        jiy.m13298y(parcel, 6, this.f7707e);
        jiy.m13294u(parcel, 7, this.f7708f);
        jiy.m13291r(parcel, 8, this.f7709g);
        Boolean bool = this.f7710h;
        jiy.m13286m(parcel, 9, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
        jiy.m13283j(parcel, iM13281h);
    }
}
