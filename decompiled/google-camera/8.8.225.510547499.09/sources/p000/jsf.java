package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsf extends jij {
    public static final Parcelable.Creator CREATOR = new jri(18);

    /* JADX INFO: renamed from: a */
    public final int f34716a;

    /* JADX INFO: renamed from: b */
    public final boolean f34717b;

    public jsf(int i, boolean z) {
        this.f34716a = i;
        this.f34717b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34716a);
        jiy.m13284k(parcel, 2, this.f34717b);
        jiy.m13283j(parcel, iM13281h);
    }
}
