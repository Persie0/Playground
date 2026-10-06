package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsl extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(2);

    /* JADX INFO: renamed from: a */
    public final int f34727a;

    /* JADX INFO: renamed from: b */
    public final boolean f34728b;

    /* JADX INFO: renamed from: c */
    public final boolean f34729c;

    public jsl(int i, boolean z, boolean z2) {
        this.f34727a = i;
        this.f34728b = z;
        this.f34729c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34727a);
        jiy.m13284k(parcel, 3, this.f34728b);
        jiy.m13284k(parcel, 4, this.f34729c);
        jiy.m13283j(parcel, iM13281h);
    }
}
