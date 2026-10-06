package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsk extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(0);

    /* JADX INFO: renamed from: a */
    public final int f34725a;

    /* JADX INFO: renamed from: b */
    public final boolean f34726b;

    public jsk(int i, boolean z) {
        this.f34725a = i;
        this.f34726b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34725a);
        jiy.m13284k(parcel, 3, this.f34726b);
        jiy.m13283j(parcel, iM13281h);
    }
}
