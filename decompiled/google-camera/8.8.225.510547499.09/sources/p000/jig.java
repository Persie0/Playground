package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jig extends jij {
    public static final Parcelable.Creator CREATOR = new jie(2);

    /* JADX INFO: renamed from: a */
    public final int f34122a;

    /* JADX INFO: renamed from: b */
    public final boolean f34123b;

    /* JADX INFO: renamed from: c */
    public final boolean f34124c;

    /* JADX INFO: renamed from: d */
    public final int f34125d;

    /* JADX INFO: renamed from: e */
    public final int f34126e;

    public jig(int i, boolean z, boolean z2, int i2, int i3) {
        this.f34122a = i;
        this.f34123b = z;
        this.f34124c = z2;
        this.f34125d = i2;
        this.f34126e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34122a);
        jiy.m13284k(parcel, 2, this.f34123b);
        jiy.m13284k(parcel, 3, this.f34124c);
        jiy.m13287n(parcel, 4, this.f34125d);
        jiy.m13287n(parcel, 5, this.f34126e);
        jiy.m13283j(parcel, iM13281h);
    }
}
