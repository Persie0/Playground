package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbp extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(1);

    /* JADX INFO: renamed from: a */
    final int f33667a;

    /* JADX INFO: renamed from: b */
    public final int f33668b;

    /* JADX INFO: renamed from: c */
    public final Bundle f33669c;

    public jbp(int i, int i2, Bundle bundle) {
        this.f33667a = i;
        this.f33668b = i2;
        this.f33669c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f33667a);
        jiy.m13287n(parcel, 2, this.f33668b);
        jiy.m13289p(parcel, 3, this.f33669c);
        jiy.m13283j(parcel, iM13281h);
    }
}
