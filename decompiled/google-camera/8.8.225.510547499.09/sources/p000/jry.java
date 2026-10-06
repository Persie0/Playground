package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jry extends jij {
    public static final Parcelable.Creator CREATOR = new jri(12);

    /* JADX INFO: renamed from: a */
    public final int f34695a;

    /* JADX INFO: renamed from: b */
    public final boolean f34696b;

    /* JADX INFO: renamed from: c */
    public final boolean f34697c;

    /* JADX INFO: renamed from: d */
    public final boolean f34698d;

    /* JADX INFO: renamed from: e */
    public final boolean f34699e;

    public jry(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f34695a = i;
        this.f34696b = z;
        this.f34697c = z2;
        this.f34698d = z3;
        this.f34699e = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34695a);
        jiy.m13284k(parcel, 2, this.f34696b);
        jiy.m13284k(parcel, 3, this.f34697c);
        jiy.m13284k(parcel, 4, this.f34698d);
        jiy.m13284k(parcel, 5, this.f34699e);
        jiy.m13283j(parcel, iM13281h);
    }
}
