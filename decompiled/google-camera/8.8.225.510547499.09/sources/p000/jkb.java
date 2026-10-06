package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkb extends jij {
    public static final Parcelable.Creator CREATOR = new jie(7);

    /* JADX INFO: renamed from: a */
    public int f34227a;

    /* JADX INFO: renamed from: b */
    int f34228b;

    public jkb() {
        this(3, 0);
    }

    public jkb(int i, int i2) {
        this.f34227a = i;
        this.f34228b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34227a);
        jiy.m13287n(parcel, 3, this.f34228b);
        jiy.m13283j(parcel, iM13281h);
    }
}
