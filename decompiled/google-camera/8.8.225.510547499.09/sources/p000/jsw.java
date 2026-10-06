package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsw extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(13);

    /* JADX INFO: renamed from: a */
    public final int f34750a;

    /* JADX INFO: renamed from: b */
    public final boolean f34751b;

    public jsw(int i, boolean z) {
        this.f34750a = i;
        this.f34751b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34750a);
        jiy.m13284k(parcel, 2, this.f34751b);
        jiy.m13283j(parcel, iM13281h);
    }
}
